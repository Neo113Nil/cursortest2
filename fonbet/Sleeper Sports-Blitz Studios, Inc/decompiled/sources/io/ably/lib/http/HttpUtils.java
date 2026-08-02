package io.ably.lib.http;

import com.braze.models.Banner;
import com.google.gson.JsonElement;
import io.ably.lib.http.HttpCore;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Param;
import io.ably.lib.util.Serialisation;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes9.dex */
public class HttpUtils {
    private static final String HEX = "0123456789ABCDEF";
    public static Map<String, String> mimeTypes;

    static {
        HashMap hashMap = new HashMap();
        mimeTypes = hashMap;
        hashMap.put("json", "application/json");
        mimeTypes.put("xml", "application/xml");
        mimeTypes.put(Banner.HTML, "text/html");
        mimeTypes.put("msgpack", "application/x-msgpack");
    }

    public static Param[] defaultAcceptHeaders(boolean z) {
        if (z) {
            return new Param[]{new Param("Accept", "application/x-msgpack,application/json")};
        }
        return new Param[]{new Param("Accept", "application/json")};
    }

    public static Param[] mergeHeaders(Param[] paramArr, Param[] paramArr2) {
        HashMap hashMap = new HashMap();
        if (paramArr != null) {
            for (Param param : paramArr) {
                hashMap.put(param.key, param);
            }
        }
        if (paramArr2 != null) {
            for (Param param2 : paramArr2) {
                hashMap.put(param2.key, param2);
            }
        }
        return (Param[]) hashMap.values().toArray(new Param[hashMap.size()]);
    }

    public static String encodeParams(String str, Param[] paramArr) {
        StringBuilder sb = new StringBuilder(str);
        if (paramArr != null && paramArr.length > 0) {
            int length = paramArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                Param param = paramArr[i];
                sb.append(z ? '?' : Typography.amp);
                sb.append(param.key);
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(encodeURIComponent(param.value));
                i++;
                z = false;
            }
        }
        return sb.toString();
    }

    public static URL parseUrl(String str) throws AblyException {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static String urlWithQueryStringRemoved(String str) throws AblyException {
        try {
            URI uri = new URI(str);
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static Map<String, Param> decodeParams(String str) {
        HashMap hashMap = new HashMap();
        try {
            for (String str2 : str.split("&")) {
                int indexOf = str2.indexOf(61);
                String decode = URLDecoder.decode(str2.substring(0, indexOf), "UTF-8");
                hashMap.put(decode, new Param(decode, URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8")));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return hashMap;
    }

    public static Map<String, Param> indexParams(Param[] paramArr) {
        HashMap hashMap = new HashMap();
        for (Param param : paramArr) {
            hashMap.put(param.key, param);
        }
        return hashMap;
    }

    public static Map<String, Param> mergeParams(Map<String, Param> map, Map<String, Param> map2) {
        for (Param param : map2.values()) {
            map.put(param.key, param);
        }
        return map;
    }

    public static Param[] flattenParams(Map<String, Param> map) {
        if (map != null) {
            return (Param[]) map.values().toArray(new Param[map.size()]);
        }
        return null;
    }

    public static Param[] toParamArray(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(new Param(entry.getKey(), it.next()));
            }
        }
        return (Param[]) arrayList.toArray(new Param[arrayList.size()]);
    }

    public static String getParam(Param[] paramArr, String str) {
        if (paramArr == null) {
            return null;
        }
        for (Param param : paramArr) {
            if (str.equals(param.key)) {
                return param.value;
            }
        }
        return null;
    }

    public static String encodeURIComponent(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        StringBuilder sb = new StringBuilder(bytes.length);
        for (byte b : bytes) {
            if (b < 97 ? b < 65 ? b < 48 ? b == 45 || b == 46 : b <= 57 : b <= 90 || b == 95 : b <= 122 || b == 126) {
                sb.append((char) b);
            } else {
                sb.append('%');
                sb.append(HEX.charAt((b >> 4) & 15));
                sb.append(HEX.charAt(b & 15));
            }
        }
        return sb.toString();
    }

    static URL buildURL(String str, String str2, int i, String str3, Param[] paramArr) {
        try {
            return new URL(str + str2 + AbstractJsonLexerKt.COLON + i + encodeParams(str3, paramArr));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    static URL buildURL(String str, Param[] paramArr) {
        try {
            return new URL(encodeParams(str, paramArr));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public static class ByteArrayRequestBody implements HttpCore.RequestBody {
        private final byte[] bytes;
        private final String contentType;

        public ByteArrayRequestBody(byte[] bArr, String str) {
            this.bytes = bArr;
            this.contentType = str;
        }

        @Override // io.ably.lib.http.HttpCore.RequestBody
        public byte[] getEncoded() {
            return this.bytes;
        }

        @Override // io.ably.lib.http.HttpCore.RequestBody
        public String getContentType() {
            return this.contentType;
        }
    }

    public static class FormRequestBody implements HttpCore.RequestBody {
        private Param[] formData;

        public FormRequestBody(Param[] paramArr) {
            this.formData = paramArr;
        }

        @Override // io.ably.lib.http.HttpCore.RequestBody
        public byte[] getEncoded() {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.formData.length; i++) {
                    if (i != 0) {
                        sb.append(Typography.amp);
                    }
                    sb.append(URLEncoder.encode(this.formData[i].key, "UTF-8"));
                    sb.append(SignatureVisitor.INSTANCEOF);
                    sb.append(URLEncoder.encode(this.formData[i].value, "UTF-8"));
                }
                return sb.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return new byte[0];
            }
        }

        @Override // io.ably.lib.http.HttpCore.RequestBody
        public String getContentType() {
            return "application/x-www-form-urlencoded";
        }
    }

    public static class JsonRequestBody implements HttpCore.RequestBody {
        private byte[] bytes;
        private final String jsonText;

        public JsonRequestBody(String str) {
            this.jsonText = str;
        }

        public JsonRequestBody(Object obj) {
            this(Serialisation.gson.toJson(obj));
        }

        @Override // io.ably.lib.http.HttpCore.RequestBody
        public byte[] getEncoded() {
            byte[] bArr = this.bytes;
            if (bArr != null) {
                return bArr;
            }
            byte[] bytes = this.jsonText.getBytes(Charset.forName("UTF-8"));
            this.bytes = bytes;
            return bytes;
        }

        @Override // io.ably.lib.http.HttpCore.RequestBody
        public String getContentType() {
            return "application/json";
        }
    }

    public static HttpCore.RequestBody requestBodyFromGson(JsonElement jsonElement, boolean z) {
        if (!z) {
            return new JsonRequestBody(jsonElement);
        }
        return new ByteArrayRequestBody(Serialisation.gsonToMsgpack(jsonElement), "application/x-msgpack");
    }
}
