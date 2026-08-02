package j6;

import T7.J;
import T7.Y;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.GraphRequest;
import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import g6.N;
import j6.g;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f53711a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f53712b = SetsKt.hashSetOf(200, 202);

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f53713c = SetsKt.hashSetOf(503, 504, 429);

    /* renamed from: d, reason: collision with root package name */
    public static a f53714d;

    /* renamed from: e, reason: collision with root package name */
    public static List f53715e;

    /* renamed from: f, reason: collision with root package name */
    public static int f53716f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f53717a;

        /* renamed from: b, reason: collision with root package name */
        public final String f53718b;

        /* renamed from: c, reason: collision with root package name */
        public final String f53719c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.f53717a = datasetID;
            this.f53718b = cloudBridgeURL;
            this.f53719c = accessKey;
        }

        public final String a() {
            return this.f53719c;
        }

        public final String b() {
            return this.f53718b;
        }

        public final String c() {
            return this.f53717a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f53717a, aVar.f53717a) && Intrinsics.areEqual(this.f53718b, aVar.f53718b) && Intrinsics.areEqual(this.f53719c, aVar.f53719c);
        }

        public int hashCode() {
            return (((this.f53717a.hashCode() * 31) + this.f53718b.hashCode()) * 31) + this.f53719c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f53717a + ", cloudBridgeURL=" + this.f53718b + ", accessKey=" + this.f53719c + ')';
        }
    }

    public static final class b extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f53720d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(2);
            this.f53720d = list;
        }

        public static final void c(Integer num, List processedEvents) {
            Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
            if (CollectionsKt.contains(g.f53712b, num)) {
                return;
            }
            g.f53711a.g(num, processedEvents, 5);
        }

        public final void b(String str, final Integer num) {
            Y y10 = Y.f11042a;
            final List list = this.f53720d;
            Y.E0(new Runnable() { // from class: j6.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.c(num, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (Integer) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final void d(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        J.f10993e.c(N.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        g gVar = f53711a;
        gVar.i(new a(datasetID, url, accessKey));
        gVar.j(new ArrayList());
    }

    public static final void l(final GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Y y10 = Y.f11042a;
        Y.E0(new Runnable() { // from class: j6.f
            @Override // java.lang.Runnable
            public final void run() {
                g.m(GraphRequest.this);
            }
        });
    }

    public static final void m(GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "$request");
        String r10 = request.r();
        List split$default = r10 == null ? null : StringsKt.split$default((CharSequence) r10, new String[]{"/"}, false, 0, 6, (Object) null);
        if (split$default == null || split$default.size() != 2) {
            J.f10993e.c(N.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            g gVar = f53711a;
            String str = gVar.e().b() + "/capi/" + gVar.e().c() + "/events";
            List k10 = gVar.k(request);
            if (k10 == null) {
                return;
            }
            gVar.c(k10);
            int min = Math.min(gVar.f().size(), 10);
            List slice = CollectionsKt.slice(gVar.f(), new IntRange(0, min - 1));
            gVar.f().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) slice);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(EventKeys.DATA, jSONArray);
            linkedHashMap.put("accessKey", gVar.e().a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            J.a aVar = J.f10993e;
            N n10 = N.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonBodyStr.toString(2)");
            aVar.c(n10, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, jSONObject2);
            gVar.h(str, VoiceURLConnection.METHOD_TYPE_POST, jSONObject.toString(), MapsKt.mapOf(TuplesKt.to("Content-Type", "application/json")), 60000, new b(slice));
        } catch (UninitializedPropertyAccessException e10) {
            J.f10993e.c(N.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void c(List list) {
        if (list != null) {
            f().addAll(list);
        }
        int max = Math.max(0, f().size() + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        if (max > 0) {
            j(TypeIntrinsics.asMutableList(CollectionsKt.drop(f(), max)));
        }
    }

    public final a e() {
        a aVar = f53714d;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentials");
        throw null;
    }

    public final List f() {
        List list = f53715e;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        throw null;
    }

    public final void g(Integer num, List processedEvents, int i10) {
        Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        if (CollectionsKt.contains(f53713c, num)) {
            if (f53716f >= i10) {
                f().clear();
                f53716f = 0;
            } else {
                f().addAll(0, processedEvents);
                f53716f++;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[Catch: IOException -> 0x0043, UnknownHostException -> 0x0046, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x0046, IOException -> 0x0043, blocks: (B:3:0x000f, B:5:0x001a, B:8:0x0049, B:10:0x0055, B:14:0x0065, B:16:0x009f, B:23:0x00bb, B:31:0x00c1, B:32:0x00c4, B:34:0x00c5, B:36:0x00e5, B:40:0x0022, B:43:0x0029, B:44:0x002d, B:46:0x0033, B:48:0x00f1, B:49:0x00f8, B:28:0x00bf, B:18:0x00ad, B:20:0x00b3, B:22:0x00b9), top: B:2:0x000f, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5 A[Catch: IOException -> 0x0043, UnknownHostException -> 0x0046, TryCatch #4 {UnknownHostException -> 0x0046, IOException -> 0x0043, blocks: (B:3:0x000f, B:5:0x001a, B:8:0x0049, B:10:0x0055, B:14:0x0065, B:16:0x009f, B:23:0x00bb, B:31:0x00c1, B:32:0x00c4, B:34:0x00c5, B:36:0x00e5, B:40:0x0022, B:43:0x0029, B:44:0x002d, B:46:0x0033, B:48:0x00f1, B:49:0x00f8, B:28:0x00bf, B:18:0x00ad, B:20:0x00b3, B:22:0x00b9), top: B:2:0x000f, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(String urlStr, String requestMethod, String str, Map map, int i10, Function2 function2) {
        Set<String> keySet;
        boolean z10;
        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        try {
            URLConnection openConnection = new URL(urlStr).openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (map != null && (keySet = map.keySet()) != null) {
                for (String str2 : keySet) {
                    httpURLConnection.setRequestProperty(str2, (String) map.get(str2));
                }
            }
            if (!httpURLConnection.getRequestMethod().equals(VoiceURLConnection.METHOD_TYPE_POST) && !httpURLConnection.getRequestMethod().equals("PUT")) {
                z10 = false;
                httpURLConnection.setDoOutput(z10);
                httpURLConnection.setConnectTimeout(i10);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedOutputStream.close();
                StringBuilder sb2 = new StringBuilder();
                if (f53712b.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else {
                                sb2.append(readLine);
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(bufferedReader, th2);
                                throw th3;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedReader, null);
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "connResponseSB.toString()");
                J.f10993e.c(N.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", sb3, Integer.valueOf(httpURLConnection.getResponseCode()));
                if (function2 == null) {
                    function2.invoke(sb3, Integer.valueOf(httpURLConnection.getResponseCode()));
                    return;
                }
                return;
            }
            z10 = true;
            httpURLConnection.setDoOutput(z10);
            httpURLConnection.setConnectTimeout(i10);
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
            bufferedWriter2.write(str);
            bufferedWriter2.flush();
            bufferedWriter2.close();
            bufferedOutputStream2.close();
            StringBuilder sb22 = new StringBuilder();
            if (f53712b.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
            }
            String sb32 = sb22.toString();
            Intrinsics.checkNotNullExpressionValue(sb32, "connResponseSB.toString()");
            J.f10993e.c(N.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", sb32, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (function2 == null) {
            }
        } catch (UnknownHostException e10) {
            J.f10993e.c(N.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e10.toString());
            if (function2 != null) {
                function2.invoke(null, 503);
            }
        } catch (IOException e11) {
            J.f10993e.c(N.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e11.toString());
        }
    }

    public final void i(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f53714d = aVar;
    }

    public final void j(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        f53715e = list;
    }

    public final List k(GraphRequest graphRequest) {
        JSONObject q10 = graphRequest.q();
        if (q10 == null) {
            return null;
        }
        Map mutableMap = MapsKt.toMutableMap(Y.n(q10));
        Object w10 = graphRequest.w();
        if (w10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        mutableMap.put("custom_events", w10);
        StringBuilder sb2 = new StringBuilder();
        for (String str : mutableMap.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(mutableMap.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        J.f10993e.c(N.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
        return e.f53693a.e(mutableMap);
    }
}
