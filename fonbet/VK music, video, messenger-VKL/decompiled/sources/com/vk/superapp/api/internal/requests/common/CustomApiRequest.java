package com.vk.superapp.api.internal.requests.common;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.h;
import okhttp3.l;
import okhttp3.m;
import okhttp3.o;
import okhttp3.p;
import okhttp3.t;
import okhttp3.u;
import okhttp3.v;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import xsna.asp;
import xsna.brm0;
import xsna.dgn0;
import xsna.drm0;
import xsna.epx;
import xsna.f8f0;
import xsna.fw3;
import xsna.pbr0;
import xsna.up;
import xsna.v1v;
import xsna.xgx0;
import xsna.zrp;

/* compiled from: CustomApiRequest.kt */
/* loaded from: classes6.dex */
public final class CustomApiRequest {
    public final String a;
    public final String b;
    public final RequestMethod c;
    public final Map<String, String> d;
    public final Map<String, String> e;
    public final Map<String, String> f;
    public final b g;
    public final VKApiConfig h;
    public final o i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomApiRequest.kt */
    public static final class RequestMethod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestMethod[] $VALUES;
        public static final RequestMethod CONNECT;
        public static final a Companion;
        public static final RequestMethod DELETE;
        public static final RequestMethod GET;
        public static final RequestMethod HEAD;
        public static final RequestMethod OPTIONS;
        public static final RequestMethod POST;
        public static final RequestMethod PUT;
        public static final RequestMethod TRACE;

        /* compiled from: CustomApiRequest.kt */
        public static final class a {
        }

        static {
            RequestMethod requestMethod = new RequestMethod("GET", 0);
            GET = requestMethod;
            RequestMethod requestMethod2 = new RequestMethod("HEAD", 1);
            HEAD = requestMethod2;
            RequestMethod requestMethod3 = new RequestMethod("POST", 2);
            POST = requestMethod3;
            RequestMethod requestMethod4 = new RequestMethod("PUT", 3);
            PUT = requestMethod4;
            RequestMethod requestMethod5 = new RequestMethod("DELETE", 4);
            DELETE = requestMethod5;
            RequestMethod requestMethod6 = new RequestMethod("CONNECT", 5);
            CONNECT = requestMethod6;
            RequestMethod requestMethod7 = new RequestMethod("OPTIONS", 6);
            OPTIONS = requestMethod7;
            RequestMethod requestMethod8 = new RequestMethod("TRACE", 7);
            TRACE = requestMethod8;
            RequestMethod[] requestMethodArr = {requestMethod, requestMethod2, requestMethod3, requestMethod4, requestMethod5, requestMethod6, requestMethod7, requestMethod8};
            $VALUES = requestMethodArr;
            $ENTRIES = new asp(requestMethodArr);
            Companion = new a();
        }

        public RequestMethod() {
            throw null;
        }

        public static RequestMethod valueOf(String str) {
            return (RequestMethod) Enum.valueOf(RequestMethod.class, str);
        }

        public static RequestMethod[] values() {
            return (RequestMethod[]) $VALUES.clone();
        }
    }

    /* compiled from: CustomApiRequest.kt */
    public static final class a {
        public String a = "";
        public String b = "";
        public RequestMethod c = RequestMethod.POST;
        public Map<String, String> d;
        public LinkedHashMap e;
        public LinkedHashMap f;
        public b g;
        public o h;

        /* compiled from: CustomApiRequest.kt */
        /* renamed from: com.vk.superapp.api.internal.requests.common.CustomApiRequest$a$a, reason: collision with other inner class name */
        public static final class C1865a {
            public static a a(String str) {
                a aVar = new a();
                aVar.b = str;
                return aVar;
            }
        }

        public final CustomApiRequest a() {
            return new CustomApiRequest(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public final void b(o oVar) {
            this.h = oVar;
        }

        public final void c(RequestMethod requestMethod) {
            this.c = requestMethod;
        }
    }

    /* compiled from: CustomApiRequest.kt */
    public static final class b {
        public final String a;
        public final byte[] b;

        public b(String str, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && Arrays.equals(this.b, bVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Form(type=" + this.a + ", content=" + Arrays.toString(this.b) + ')';
        }
    }

    /* compiled from: CustomApiRequest.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestMethod.values().length];
            try {
                iArr[RequestMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestMethod.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CustomApiRequest(String str, String str2, RequestMethod requestMethod, Map map, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, b bVar, o oVar) {
        this.a = str;
        this.b = str2;
        this.c = requestMethod;
        this.d = map;
        this.e = linkedHashMap;
        this.f = linkedHashMap2;
        this.g = bVar;
        VKApiConfig b2 = dgn0.b();
        this.h = b2;
        this.i = oVar == null ? b2.h.a() : oVar;
    }

    public static String c(String str, String str2) {
        return str2.length() == 0 ? str : (brm0.v(str, DomExceptionUtils.SEPARATOR, false) && brm0.B(str2, DomExceptionUtils.SEPARATOR, false)) ? up.b(1, str2, fw3.e(str)) : (brm0.v(str, DomExceptionUtils.SEPARATOR, false) || brm0.B(str2, DomExceptionUtils.SEPARATOR, false)) ? str.concat(str2) : v1v.a('/', str, str2);
    }

    public final VKApiException a(String str, JSONObject jSONObject) {
        return jSONObject == null ? new VKApiExecutionException(-1, str, true, this.h.a.getString(R.string.vk_common_network_error), null, null, null, null, 0, null, null, null, 4080) : pbr0.c(jSONObject, 4, str);
    }

    public final String b(p pVar) {
        String str;
        VKApiException vKApiException;
        v vVar = ((f8f0) this.i.a(pVar)).execute().h;
        if (vVar == null || (str = vVar.string()) == null) {
            str = "";
        }
        try {
            String str2 = this.a;
            vKApiException = null;
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("response")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    if (optJSONObject != null) {
                        vKApiException = pbr0.c(optJSONObject, 4, str2);
                    } else {
                        JSONArray optJSONArray = jSONObject.optJSONArray("execute_errors");
                        if (optJSONArray != null) {
                            vKApiException = a(str2, optJSONArray.getJSONObject(0));
                        }
                    }
                }
            } else {
                vKApiException = a(str2, null);
            }
        } catch (Exception unused) {
            vKApiException = null;
        }
        if (vKApiException == null) {
            return str;
        }
        throw vKApiException;
    }

    public final boolean d(String str) {
        Map<String, String> map = this.d;
        if ((map != null ? map.get(str) : null) != null) {
            return true;
        }
        Map<String, String> map2 = this.e;
        return (map2 != null ? map2.get(str) : null) != null;
    }

    public final p e() {
        t d;
        p.a aVar = new p.a();
        Map<String, String> map = this.f;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        int[] iArr = c.$EnumSwitchMapping$0;
        RequestMethod requestMethod = this.c;
        int i = iArr[requestMethod.ordinal()];
        Map<String, String> map2 = this.e;
        Map<String, String> map3 = this.d;
        String str = this.a;
        String str2 = this.b;
        VKApiConfig vKApiConfig = this.h;
        if (i == 1 || i == 2) {
            String c2 = c(str2, str);
            l.a aVar2 = new l.a();
            aVar2.e(null, c2);
            l.a f = aVar2.b().f();
            if (!drm0.N(str)) {
                f.j("v", vKApiConfig.g);
                f.j("lang", vKApiConfig.b());
                f.j(HttpRequest.DEFAULT_SCHEME, "1");
                f.j("device_id", vKApiConfig.f.getValue());
            }
            if (map3 != null) {
                for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                    if (!"method".equals(entry2.getKey()) || drm0.N(str)) {
                        f.j(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, String> entry3 : map2.entrySet()) {
                    if (!"method".equals(entry3.getKey()) || drm0.N(str)) {
                        String key = entry3.getKey();
                        String value = entry3.getValue();
                        if (f.g != null) {
                            f.g(l.b.a(key, 0, " \"'<>#&=", 0, 211, true));
                        }
                        if (f.g == null) {
                            f.g = new ArrayList();
                        }
                        f.g.add(l.b.a(key, 0, " \"'<>#&=", 0, 211, true));
                        f.g.add(value != null ? l.b.a(value, 0, " \"'<>#&=", 0, 211, true) : null);
                    }
                }
            }
            aVar.a = f.b();
            aVar.f(requestMethod.name(), null);
        } else {
            String c3 = c(str2, str);
            b bVar = this.g;
            if (bVar == null) {
                h.a aVar3 = new h.a(0);
                if (!d("v")) {
                    aVar3.a("v", vKApiConfig.g);
                }
                if (!d("lang")) {
                    aVar3.a("lang", vKApiConfig.b());
                }
                if (!d(HttpRequest.DEFAULT_SCHEME)) {
                    aVar3.a(HttpRequest.DEFAULT_SCHEME, "1");
                }
                if (!d("device_id")) {
                    aVar3.a("device_id", vKApiConfig.f.getValue());
                }
                if (map3 != null) {
                    for (Map.Entry<String, String> entry4 : map3.entrySet()) {
                        if (!"method".equals(entry4.getKey()) || drm0.N(str)) {
                            aVar3.a(entry4.getKey(), entry4.getValue());
                        }
                    }
                }
                ArrayList arrayList = aVar3.b;
                ArrayList arrayList2 = aVar3.a;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry5 : map2.entrySet()) {
                        if (!"method".equals(entry5.getKey()) || drm0.N(str)) {
                            String key2 = entry5.getKey();
                            String value2 = entry5.getValue();
                            arrayList2.add(l.b.a(key2, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 83, true));
                            arrayList.add(l.b.a(value2, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 83, true));
                        }
                    }
                }
                d = new h(arrayList2, arrayList);
            } else {
                t.a aVar4 = t.Companion;
                byte[] bArr = bVar.b;
                Pattern pattern = m.e;
                d = t.a.d(aVar4, bArr, m.a.a(bVar.a), 0, 6);
            }
            aVar.f(requestMethod.name(), d);
            aVar.c.h(Http.Header.CONTENT_LENGTH, String.valueOf(d.contentLength()));
            aVar.i(c3);
        }
        return aVar.b();
    }

    public final u f() {
        try {
            return ((f8f0) this.i.a(e())).execute();
        } catch (VKApiExecutionException e) {
            xgx0.a.getClass();
            xgx0.d(e);
            throw e;
        } catch (IOException e2) {
            xgx0.a.getClass();
            xgx0.d(e2);
            throw a(this.a, null);
        }
    }
}
