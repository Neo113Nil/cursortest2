package L8;

import K8.k;
import M8.e;
import android.net.Uri;
import android.util.Log;
import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.json.BooleanDeserializer;
import com.giphy.sdk.core.models.json.DateDeserializer;
import com.giphy.sdk.core.models.json.DateSerializer;
import com.giphy.sdk.core.models.json.IntDeserializer;
import com.giphy.sdk.core.models.json.MainAdapterFactory;
import com.giphy.sdk.core.network.response.ErrorResponse;
import com.google.gson.Gson;
import com.google.gson.l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7095c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Gson f7096d;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f7097a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7098b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        Gson b10 = new com.google.gson.d().h(Date.class, new DateDeserializer()).h(Date.class, new DateSerializer()).h(Boolean.TYPE, new BooleanDeserializer()).h(Integer.TYPE, new IntDeserializer()).g(new MainAdapterFactory()).b();
        Intrinsics.checkNotNullExpressionValue(b10, "GsonBuilder()\n          …                .create()");
        f7096d = b10;
    }

    public c() {
        e.a aVar = e.f7557d;
        this.f7097a = aVar.b();
        this.f7098b = aVar.a();
    }

    public static final Object f(Uri serverUrl, String str, Map map, k.b method, Map map2, Object obj, c this$0, Class responseClass) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        Intrinsics.checkNotNullParameter(serverUrl, "$serverUrl");
        Intrinsics.checkNotNullParameter(method, "$method");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(responseClass, "$responseClass");
        URL url = null;
        try {
            Uri.Builder buildUpon = serverUrl.buildUpon();
            if (str != null) {
                buildUpon.appendEncodedPath(str);
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
            URL url2 = new URL(buildUpon.build().toString());
            try {
                URLConnection openConnection = url2.openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection2 = (HttpURLConnection) openConnection;
            } catch (Throwable th2) {
                th = th2;
                url = url2;
                httpURLConnection = null;
            }
            try {
                httpURLConnection2.setRequestMethod(method.name());
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        httpURLConnection2.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (method == k.b.POST) {
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.connect();
                    if (obj != null) {
                        String v10 = f7096d.v(obj);
                        Intrinsics.checkNotNullExpressionValue(v10, "GSON_INSTANCE.toJson(requestBody)");
                        Charset forName = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                        byte[] bytes = v10.getBytes(forName);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        httpURLConnection2.getOutputStream().write(bytes);
                    }
                } else {
                    httpURLConnection2.connect();
                }
                Object g10 = this$0.g(url2, httpURLConnection2, responseClass);
                httpURLConnection2.disconnect();
                return g10;
            } catch (Throwable th3) {
                url = url2;
                httpURLConnection = httpURLConnection2;
                th = th3;
                try {
                    if (!(th instanceof InterruptedIOException) && !(th instanceof InterruptedException)) {
                        String name = d.class.getName();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unable to perform network request for url=");
                        Intrinsics.checkNotNull(url);
                        sb2.append(url);
                        Log.e(name, sb2.toString(), th);
                    }
                    throw th;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    @Override // L8.d
    public e a(final Uri serverUrl, final String str, final k.b method, final Class responseClass, final Map map, final Map map2, final Object obj) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseClass, "responseClass");
        return new e(new Callable() { // from class: L8.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object f10;
                f10 = c.f(serverUrl, str, map, method, map2, obj, this, responseClass);
                return f10;
            }
        }, d(), b());
    }

    @Override // L8.d
    public Executor b() {
        return this.f7098b;
    }

    @Override // L8.d
    public e c(Uri serverUrl, String str, k.b method, Class responseClass, Map map, Map map2) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseClass, "responseClass");
        return a(serverUrl, str, method, responseClass, map, map2, null);
    }

    @Override // L8.d
    public ExecutorService d() {
        return this.f7097a;
    }

    public final Object g(URL url, HttpURLConnection httpURLConnection, Class cls) {
        InputStream errorStream;
        String str;
        l lVar;
        String str2;
        InputStream bVar;
        int responseCode = httpURLConnection.getResponseCode();
        boolean z10 = responseCode == 200 || responseCode == 201 || responseCode == 202 || responseCode == 204;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (z10) {
            errorStream = httpURLConnection.getInputStream();
            str = "connection.inputStream";
        } else {
            errorStream = httpURLConnection.getErrorStream();
            str = "connection.errorStream";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, str);
        if (headerFields.containsKey("Content-Encoding")) {
            List<String> list = headerFields.get("Content-Encoding");
            Intrinsics.checkNotNull(list);
            List<String> list2 = list;
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (list2.contains("gzip")) {
                bVar = new GZIPInputStream(errorStream);
            } else if (list2.contains("br")) {
                bVar = new org.brotli.dec.b(errorStream);
            }
            errorStream = bVar;
        }
        try {
            String readText = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192));
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(errorStream, null);
            if (z10) {
                if (Intrinsics.areEqual(cls, String.class)) {
                    return readText;
                }
                try {
                    if (!StringsKt.startsWith$default(readText, "{", false, 2, (Object) null)) {
                        readText = "{}";
                    }
                    return f7096d.m(readText, cls);
                } catch (l unused) {
                    return cls.newInstance();
                }
            }
            try {
                if (!StringsKt.startsWith$default(readText, "{", false, 2, (Object) null)) {
                    readText = "{\"error\": \"" + readText + "\"}";
                }
                str2 = readText;
            } catch (l e10) {
                lVar = e10;
            }
            try {
                ErrorResponse errorResponse = (ErrorResponse) f7096d.m(str2, ErrorResponse.class);
                if (errorResponse.getMeta() == null) {
                    errorResponse.setMeta(new Meta(responseCode, errorResponse.getMessage(), null, 4, null));
                }
                Intrinsics.checkNotNullExpressionValue(errorResponse, "errorResponse");
                throw new L8.a(errorResponse);
            } catch (l e11) {
                readText = str2;
                lVar = e11;
                throw new L8.a("Unable to parse server error response : " + url + " : " + readText + " : " + lVar.getMessage(), new ErrorResponse(responseCode, readText));
            }
        } finally {
        }
    }

    public c(ExecutorService networkRequestExecutor, Executor completionExecutor) {
        Intrinsics.checkNotNullParameter(networkRequestExecutor, "networkRequestExecutor");
        Intrinsics.checkNotNullParameter(completionExecutor, "completionExecutor");
        this.f7097a = networkRequestExecutor;
        this.f7098b = completionExecutor;
    }
}
