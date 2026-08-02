package io.radar.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.radar.sdk.C4588b0;
import io.radar.sdk.C4589c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.radar.sdk.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4588b0 {

    /* renamed from: a, reason: collision with root package name */
    public G0 f49915a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f49916b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    public final Handler f49917c = new Handler(Looper.getMainLooper());

    /* renamed from: io.radar.sdk.b0$a */
    public interface a {

        /* renamed from: io.radar.sdk.b0$a$a, reason: collision with other inner class name */
        public static final class C0742a {
            public static /* synthetic */ void a(a aVar, C4589c.EnumC4607s enumC4607s, JSONObject jSONObject, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    jSONObject = null;
                }
                aVar.a(enumC4607s, jSONObject);
            }
        }

        void a(C4589c.EnumC4607s enumC4607s, JSONObject jSONObject);
    }

    public C4588b0(G0 g02) {
        this.f49915a = g02;
    }

    public static final void i(URL url, Map map, final C4588b0 this$0, String method, boolean z10, boolean z11, JSONObject jSONObject, final a aVar, boolean z12) {
        URLConnection openConnection;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(method, "$method");
        try {
            openConnection = url.openConnection();
        } catch (IOException e10) {
            this$0.f49917c.post(new Runnable() { // from class: io.radar.sdk.Y
                @Override // java.lang.Runnable
                public final void run() {
                    C4588b0.m(C4588b0.this, e10, aVar);
                }
            });
        } catch (JSONException e11) {
            G0 g02 = this$0.f49915a;
            if (g02 != null) {
                G0.b(g02, "Error calling API | e = " + e11.getLocalizedMessage(), null, null, 6, null);
            }
            this$0.f49917c.post(new Runnable() { // from class: io.radar.sdk.Z
                @Override // java.lang.Runnable
                public final void run() {
                    C4588b0.n(C4588b0.a.this);
                }
            });
        } catch (Exception e12) {
            G0 g03 = this$0.f49915a;
            if (g03 != null) {
                G0.b(g03, "Error calling API | e = " + e12.getLocalizedMessage(), null, null, 6, null);
            }
            this$0.f49917c.post(new Runnable() { // from class: io.radar.sdk.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C4588b0.o(C4588b0.a.this);
                }
            });
        }
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                try {
                    httpsURLConnection.setRequestProperty(str, str2);
                } catch (Exception unused) {
                    G0 g04 = this$0.f49915a;
                    if (g04 != null) {
                        G0.b(g04, "Error setting request property | key = " + str + "; value = " + str2, null, null, 6, null);
                    }
                }
            }
        }
        httpsURLConnection.setRequestMethod(method);
        httpsURLConnection.setConnectTimeout(10000);
        if (z10) {
            httpsURLConnection.setReadTimeout(25000);
        } else {
            httpsURLConnection.setReadTimeout(10000);
        }
        if (z11) {
            httpsURLConnection.setChunkedStreamingMode(1024);
        }
        if (jSONObject != null) {
            long optLong = jSONObject.optLong("updatedAtMsDiff", -1L);
            JSONArray optJSONArray = jSONObject.optJSONArray("replays");
            if (optLong != -1 || optJSONArray != null) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / DurationKt.NANOS_IN_MILLIS;
                long optLong2 = jSONObject.optLong("locationMs", -1L);
                if (optLong != -1 && optLong2 != -1) {
                    jSONObject.put("updatedAtMsDiff", elapsedRealtimeNanos - optLong2);
                }
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    int i12 = 0;
                    while (i12 < length) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i12);
                        if (optJSONObject != null) {
                            i10 = length;
                            i11 = i12;
                            long optLong3 = optJSONObject.optLong("locationMs", -1L);
                            if (optLong3 != -1) {
                                optJSONObject.put("updatedAtMsDiff", elapsedRealtimeNanos - optLong3);
                            }
                            arrayList.add(optJSONObject);
                        } else {
                            i10 = length;
                            i11 = i12;
                        }
                        i12 = i11 + 1;
                        length = i10;
                    }
                    jSONObject.put("replays", new JSONArray((Collection) arrayList));
                }
            }
            httpsURLConnection.setDoOutput(true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream());
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.close();
        }
        int responseCode = httpsURLConnection.getResponseCode();
        if (200 > responseCode || responseCode >= 400) {
            int responseCode2 = httpsURLConnection.getResponseCode();
            final C4589c.EnumC4607s enumC4607s = responseCode2 == 400 ? C4589c.EnumC4607s.ERROR_BAD_REQUEST : responseCode2 == 401 ? C4589c.EnumC4607s.ERROR_UNAUTHORIZED : responseCode2 == 402 ? C4589c.EnumC4607s.ERROR_PAYMENT_REQUIRED : responseCode2 == 403 ? C4589c.EnumC4607s.ERROR_FORBIDDEN : responseCode2 == 404 ? C4589c.EnumC4607s.ERROR_NOT_FOUND : responseCode2 == 429 ? C4589c.EnumC4607s.ERROR_RATE_LIMIT : (500 > responseCode2 || responseCode2 >= 600) ? C4589c.EnumC4607s.ERROR_UNKNOWN : C4589c.EnumC4607s.ERROR_SERVER;
            InputStream errorStream = httpsURLConnection.getErrorStream();
            Intrinsics.checkNotNullExpressionValue(errorStream, "urlConnection.errorStream");
            String h10 = this$0.h(errorStream);
            if (h10 == null) {
                if (aVar != null) {
                    a.C0742a.a(aVar, C4589c.EnumC4607s.ERROR_SERVER, null, 2, null);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject(h10);
            G0 g05 = this$0.f49915a;
            if (g05 != null) {
                G0.d(g05, "📍 Radar API response | method = " + method + "; url = " + url + "; responseCode = " + httpsURLConnection.getResponseCode() + "; res = " + jSONObject2, C4589c.EnumC4600l.SDK_ERROR, null, 4, null);
            }
            this$0.f49917c.post(new Runnable() { // from class: io.radar.sdk.X
                @Override // java.lang.Runnable
                public final void run() {
                    C4588b0.l(C4588b0.a.this, enumC4607s);
                }
            });
        } else {
            InputStream inputStream = httpsURLConnection.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "urlConnection.inputStream");
            String h11 = this$0.h(inputStream);
            if (h11 == null) {
                this$0.f49917c.post(new Runnable() { // from class: io.radar.sdk.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4588b0.j(C4588b0.a.this);
                    }
                });
                return;
            }
            final JSONObject jSONObject3 = new JSONObject(h11);
            G0 g06 = this$0.f49915a;
            if (g06 != null) {
                G0.b(g06, "📍 Radar API response | method = " + method + "; url = " + url + "; responseCode = " + httpsURLConnection.getResponseCode() + "; res = " + jSONObject3, null, null, 6, null);
            }
            this$0.f49917c.post(new Runnable() { // from class: io.radar.sdk.W
                @Override // java.lang.Runnable
                public final void run() {
                    C4588b0.k(C4588b0.a.this, jSONObject3);
                }
            });
        }
        httpsURLConnection.disconnect();
        if (z12) {
            Thread.sleep(1000L);
        }
    }

    public static final void j(a aVar) {
        if (aVar != null) {
            a.C0742a.a(aVar, C4589c.EnumC4607s.ERROR_SERVER, null, 2, null);
        }
    }

    public static final void k(a aVar, JSONObject res) {
        Intrinsics.checkNotNullParameter(res, "$res");
        if (aVar != null) {
            aVar.a(C4589c.EnumC4607s.SUCCESS, res);
        }
    }

    public static final void l(a aVar, C4589c.EnumC4607s status) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (aVar != null) {
            a.C0742a.a(aVar, status, null, 2, null);
        }
    }

    public static final void m(C4588b0 this$0, IOException e10, a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e10, "$e");
        G0 g02 = this$0.f49915a;
        if (g02 != null) {
            G0.b(g02, "Error calling API | e = " + e10.getLocalizedMessage(), null, null, 6, null);
        }
        if (aVar != null) {
            a.C0742a.a(aVar, C4589c.EnumC4607s.ERROR_NETWORK, null, 2, null);
        }
    }

    public static final void n(a aVar) {
        if (aVar != null) {
            a.C0742a.a(aVar, C4589c.EnumC4607s.ERROR_SERVER, null, 2, null);
        }
    }

    public static final void o(a aVar) {
        if (aVar != null) {
            a.C0742a.a(aVar, C4589c.EnumC4607s.ERROR_UNKNOWN, null, 2, null);
        }
    }

    public static /* synthetic */ void q(C4588b0 c4588b0, Context context, String str, String str2, Map map, JSONObject jSONObject, boolean z10, a aVar, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        boolean z15;
        C4588b0 c4588b02;
        Context context2;
        String str3;
        String str4;
        Map map2;
        JSONObject jSONObject2;
        boolean z16;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        a aVar2 = (i10 & 64) != 0 ? null : aVar;
        boolean z17 = (i10 & 128) != 0 ? false : z11;
        boolean z18 = (i10 & 256) != 0 ? false : z12;
        boolean z19 = (i10 & 512) != 0 ? true : z13;
        if ((i10 & 1024) != 0) {
            z15 = false;
            context2 = context;
            str3 = str;
            str4 = str2;
            map2 = map;
            jSONObject2 = jSONObject;
            z16 = z10;
            c4588b02 = c4588b0;
        } else {
            z15 = z14;
            c4588b02 = c4588b0;
            context2 = context;
            str3 = str;
            str4 = str2;
            map2 = map;
            jSONObject2 = jSONObject;
            z16 = z10;
        }
        c4588b02.p(context2, str3, str4, map2, jSONObject2, z16, aVar2, z17, z18, z19, z15);
    }

    public final String h(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
        String next = useDelimiter.hasNext() ? useDelimiter.next() : null;
        inputStream.close();
        return next;
    }

    public void p(Context context, final String method, String path, final Map map, JSONObject jSONObject, final boolean z10, final a aVar, final boolean z11, final boolean z12, boolean z13, boolean z14) {
        JSONObject jSONObject2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(path, "path");
        final URL url = new URL(Uri.parse(z14 ? L0.f49705a.C(context) : L0.f49705a.e(context)).buildUpon().appendEncodedPath(path).build().toString());
        if (z13) {
            G0 g02 = this.f49915a;
            if (g02 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("📍 Radar API request | method = ");
                sb2.append(method);
                sb2.append("; url = ");
                sb2.append(url);
                sb2.append("; headers = ");
                sb2.append(map);
                sb2.append("; params = ");
                jSONObject2 = jSONObject;
                sb2.append(jSONObject2);
                G0.b(g02, sb2.toString(), null, null, 6, null);
            } else {
                jSONObject2 = jSONObject;
            }
        } else {
            jSONObject2 = jSONObject;
            G0 g03 = this.f49915a;
            if (g03 != null) {
                G0.b(g03, "📍 Radar API request | method = " + method + "; url = " + url + "; headers = " + map, null, null, 6, null);
            }
        }
        final JSONObject jSONObject3 = jSONObject2;
        this.f49916b.execute(new Runnable() { // from class: io.radar.sdk.U
            @Override // java.lang.Runnable
            public final void run() {
                C4588b0.i(url, map, this, method, z11, z12, jSONObject3, aVar, z10);
            }
        });
    }
}
