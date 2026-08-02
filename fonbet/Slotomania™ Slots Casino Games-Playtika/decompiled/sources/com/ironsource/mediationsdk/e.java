package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.C;
import com.ironsource.C2321a2;
import com.ironsource.C2329aa;
import com.ironsource.C2339b2;
import com.ironsource.C2503k5;
import com.ironsource.C2556n4;
import com.ironsource.C2608q2;
import com.ironsource.C2643s2;
import com.ironsource.I9;
import com.ironsource.U1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {
    private final String a = "1";
    private final String b = "102";
    private final String c = "102";
    private final String d = "GenericNotifications";
    private f e;
    private IronSource.a f;
    private C2643s2 g;
    private U1 h;
    private ISBannerSize i;

    public e(f fVar) {
        this.e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, C2339b2 c2339b2, int i, C2329aa c2329aa, ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
        a(context, map, list, c2339b2, i, c2329aa);
    }

    public void a(Context context, h hVar, U1 u1) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, hVar, u1));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (u1 != null) {
                u1.a(1000, e.getMessage(), 0, C2321a2.a.a(this.e.a(), 1000), 0L);
            }
        }
    }

    public static class a implements Runnable {
        protected U1 a;
        protected d.a b;
        protected int c;
        protected String d;
        protected long e;
        protected int f;
        private int h;
        private final URL k;
        private final JSONObject l;
        private final boolean m;
        private final int n;
        private final long o;
        private final boolean p;
        private final boolean q;
        private final boolean r;
        protected String i = "";
        protected int j = 0;
        protected String g = a((Integer) null);

        public a(U1 u1, URL url, JSONObject jSONObject, boolean z, C2643s2 c2643s2) {
            this.a = u1;
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = c2643s2.g();
            this.o = c2643s2.m();
            this.p = c2643s2.o();
            this.q = c2643s2.p();
            this.h = c2643s2.d();
            this.r = c2643s2.n();
        }

        private void a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        protected boolean b() {
            long time;
            IronLog ironLog;
            int httpUrlConnectionGetResponseCode;
            this.e = new Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                HttpURLConnection httpURLConnection = null;
                while (true) {
                    int i = this.f;
                    int i2 = this.n;
                    if (i >= i2) {
                        this.f = i2 - 1;
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnection = a(this.k, this.o);
                        ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.l);
                        a(httpURLConnection, this.l, this.p);
                        httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    } catch (SocketTimeoutException e) {
                        C2556n4.d().a(e);
                        if (httpURLConnection != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                    } catch (Throwable th) {
                        C2556n4.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnection != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                    if (httpUrlConnectionGetResponseCode == 200 || httpUrlConnectionGetResponseCode == 204) {
                        break;
                    }
                    this.c = 1001;
                    String str2 = "Auction response code not valid, error code response from server - " + httpUrlConnectionGetResponseCode;
                    this.d = str2;
                    ironLog.error(str2);
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    if (this.f < this.n - 1) {
                        a(this.o, time);
                    }
                    this.f++;
                }
                try {
                    a(a(httpURLConnection), this.m, this.q);
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    return true;
                } catch (JSONException e2) {
                    C2556n4.d().a(e2);
                    if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                        this.c = 1003;
                        this.d = "Auction decryption error";
                    } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                        this.c = 1002;
                        this.d = "Auction parsing error";
                    } else {
                        this.c = 1008;
                        this.d = "Auction decompression error";
                    }
                    this.g = a(Integer.valueOf(this.c));
                    IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    return false;
                }
            } catch (Exception e3) {
                C2556n4.d().a(e3);
                this.c = 1007;
                this.d = e3.getMessage();
                this.f = 0;
                this.g = a(Integer.valueOf(this.c));
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean b = b();
            U1 u1 = this.a;
            if (u1 == null) {
                return;
            }
            a(b, u1, new Date().getTime() - this.e);
        }

        private String a() {
            if (this.h == 2) {
                return C2503k5.b().d();
            }
            return C2503k5.b().c();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String a;
            String e;
            String format;
            OutputStream urlConnectionGetOutputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(urlConnectionGetOutputStream, C.UTF8_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    a = C2503k5.b().a();
                } catch (JSONException e2) {
                    C2556n4.d().a(e2);
                    this.i = e2.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e2.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                String a2 = a();
                if (!z) {
                    IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                    e = I9.a(a2, jSONObject2);
                } else {
                    e = I9.e(a2, jSONObject2);
                }
                if (this.h != 2) {
                    format = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", a, e);
                } else {
                    format = String.format("{\"request\" : \"%1$s\"}", e);
                }
                bufferedWriter.write(format);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStreamWriter.close();
                urlConnectionGetOutputStream.close();
            }
            a = "";
            String jSONObject22 = jSONObject.toString();
            String a22 = a();
            if (!z) {
            }
            if (this.h != 2) {
            }
            bufferedWriter.write(format);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            urlConnectionGetOutputStream.close();
        }

        private HttpURLConnection a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        protected JSONObject a(JSONObject jSONObject, boolean z) throws JSONException {
            String str;
            String a = a();
            if (this.h == 2) {
                str = UserDataStore.CITY;
            } else {
                str = "response";
            }
            String string = jSONObject.getString(str);
            if (z) {
                return b(a, string);
            }
            return a(a, string);
        }

        protected void a(String str, boolean z, boolean z2) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                if (z) {
                    jsonObjectInit = a(jsonObjectInit, z2);
                }
                d.a a = d.b().a(jsonObjectInit);
                this.b = a;
                this.c = a.c();
                this.d = this.b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String b = I9.b(str, str2);
            if (!TextUtils.isEmpty(b)) {
                return IronSourceNetworkBridge.jsonObjectInit(b);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        protected void a(boolean z, U1 u1, long j) {
            if (z) {
                u1.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                u1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        private String a(Integer num) {
            return C2321a2.a.a(this.r, num);
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String d = I9.d(str, str2);
            if (d != null) {
                return IronSourceNetworkBridge.jsonObjectInit(d);
            }
            throw new JSONException("decompression error");
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C2643s2 c2643s2, U1 u1) {
        this.f = aVar;
        this.g = c2643s2;
        this.h = u1;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, C2339b2 c2339b2, int i, C2329aa c2329aa) {
        e eVar;
        boolean g;
        try {
            g = IronSourceUtils.g();
            eVar = this;
        } catch (Exception e) {
            e = e;
            eVar = this;
        }
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.h, new URL(eVar.g.a(false)), eVar.a(map, list, c2339b2, i, g, c2329aa), g, eVar.g));
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C2556n4.d().a(exc);
            IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
            eVar.h.a(1000, exc.getMessage(), 0, C2321a2.a.a(eVar.g.n(), 1000), 0L);
        }
    }

    public void a(C2608q2 c2608q2, int i, C2608q2 c2608q22, String str) {
        Iterator<String> it = c2608q2.b().iterator();
        while (it.hasNext()) {
            C2608q2 c2608q23 = c2608q2;
            int i2 = i;
            String str2 = str;
            d.b().a("reportImpression", c2608q23.c(), d.b().a(it.next(), i2, c2608q23, "", "", str2));
            i = i2;
            c2608q2 = c2608q23;
            str = str2;
        }
        C2608q2 c2608q24 = c2608q2;
        int i3 = i;
        String str3 = str;
        if (c2608q22 != null) {
            Iterator<String> it2 = c2608q22.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i3, c2608q24, "", "102", str3));
            }
        }
    }

    public void a(C2608q2 c2608q2, int i, C2608q2 c2608q22) {
        Iterator<String> it = c2608q2.h().iterator();
        while (it.hasNext()) {
            C2608q2 c2608q23 = c2608q2;
            int i2 = i;
            d.b().a("reportLoadSuccess", c2608q23.c(), d.b().a(it.next(), i2, c2608q23, "", "", ""));
            i = i2;
            c2608q2 = c2608q23;
        }
        C2608q2 c2608q24 = c2608q2;
        int i3 = i;
        if (c2608q22 != null) {
            Iterator<String> it2 = c2608q22.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i3, c2608q24, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<u> copyOnWriteArrayList, ConcurrentHashMap<String, C2608q2> concurrentHashMap, int i, C2608q2 c2608q2, C2608q2 c2608q22) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<u> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, c2608q2, c2608q22);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C2608q2> concurrentHashMap, int i, C2608q2 c2608q2, C2608q2 c2608q22) {
        int j = c2608q22.j();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(c2608q22.c())) {
                C2608q2 c2608q23 = concurrentHashMap.get(next);
                int j2 = c2608q23.j();
                String i2 = c2608q23.i();
                String str = j2 < j ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c2608q23.c() + ", instancePriceOrder= " + j2 + ", loseReasonCode=" + str + ", winnerInstance=" + c2608q22.c() + ", winnerInstancePriceOrder=" + j);
                Iterator<String> it2 = c2608q23.g().iterator();
                while (it2.hasNext()) {
                    d.b().a("reportAuctionLose", c2608q23.c(), d.b().a(it2.next(), i, c2608q22, i2, str, ""));
                }
            }
        }
        if (c2608q2 != null) {
            Iterator<String> it3 = c2608q2.g().iterator();
            while (it3.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it3.next(), i, c2608q22, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, C2339b2 c2339b2, int i, boolean z, C2329aa c2329aa) throws JSONException {
        h hVar = new h(this.f);
        hVar.a(map);
        hVar.a(list);
        hVar.a(c2339b2);
        hVar.a(i);
        hVar.a(this.i);
        hVar.a(c2329aa);
        hVar.b(z);
        return d.b().a(hVar);
    }

    public boolean a() {
        return this.e.b();
    }
}
