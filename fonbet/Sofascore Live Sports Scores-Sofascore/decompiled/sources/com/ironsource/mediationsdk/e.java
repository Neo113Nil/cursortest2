package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C3959aa;
import com.ironsource.C4094gc;
import com.ironsource.C4123i5;
import com.ironsource.C4157k4;
import com.ironsource.C4227o2;
import com.ironsource.C4263q2;
import com.ironsource.I9;
import com.ironsource.S1;
import com.ironsource.Y1;
import com.ironsource.Z1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e {
    private final String a = "1";
    private final String b = "102";
    private final String c = "102";
    private final String d = "GenericNotifications";
    private f e;
    private IronSource.a f;
    private C4263q2 g;
    private S1 h;
    private ISBannerSize i;

    @Deprecated
    public e(IronSource.a aVar, C4263q2 c4263q2, S1 s1) {
        this.f = aVar;
        this.g = c4263q2;
        this.h = s1;
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C4227o2> concurrentHashMap, int i, C4227o2 c4227o2, C4227o2 c4227o22) {
        int j = c4227o22.j();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(c4227o22.c())) {
                C4227o2 c4227o23 = concurrentHashMap.get(next);
                int j2 = c4227o23.j();
                String i2 = c4227o23.i();
                String str = j2 < j ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c4227o23.c() + ", instancePriceOrder= " + j2 + ", loseReasonCode=" + str + ", winnerInstance=" + c4227o22.c() + ", winnerInstancePriceOrder=" + j);
                Iterator<String> it2 = c4227o23.g().iterator();
                while (it2.hasNext()) {
                    d.b().a("reportAuctionLose", c4227o23.c(), d.b().a(it2.next(), i, c4227o22, i2, str, ""));
                }
            }
        }
        if (c4227o2 != null) {
            Iterator<String> it3 = c4227o2.g().iterator();
            while (it3.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it3.next(), i, c4227o22, "", "102", ""));
            }
        }
    }

    public e(f fVar) {
        this.e = fVar;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a implements Runnable {
        protected S1 a;
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

        public a(S1 s1, URL url, JSONObject jSONObject, boolean z, C4263q2 c4263q2) {
            this.a = s1;
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = c4263q2.g();
            this.o = c4263q2.m();
            this.p = c4263q2.o();
            this.q = c4263q2.p();
            this.h = c4263q2.d();
            this.r = c4263q2.n();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String a;
            String e;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, C.UTF8_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    a = C4123i5.b().a();
                } catch (JSONException e2) {
                    C4157k4.d().a(e2);
                    this.i = e2.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e2.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                String a2 = a();
                if (z) {
                    e = I9.e(a2, jSONObject2);
                } else {
                    IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                    e = I9.a(a2, jSONObject2);
                }
                bufferedWriter.write(this.h != 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", a, e) : String.format("{\"request\" : \"%1$s\"}", e));
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStreamWriter.close();
                outputStream.close();
            }
            a = "";
            String jSONObject22 = jSONObject.toString();
            String a22 = a();
            if (z) {
            }
            bufferedWriter.write(this.h != 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", a, e) : String.format("{\"request\" : \"%1$s\"}", e));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        public boolean b() {
            long time;
            IronLog ironLog;
            int responseCode;
            int i;
            this.e = new Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                HttpURLConnection httpURLConnection = null;
                while (true) {
                    int i2 = this.f;
                    int i3 = this.n;
                    if (i2 >= i3) {
                        this.f = i3 - 1;
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
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (SocketTimeoutException e) {
                        C4157k4.d().a(e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                    } catch (Throwable th) {
                        C4157k4.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            a(a(httpURLConnection), this.m, this.q);
                            httpURLConnection.disconnect();
                            return true;
                        } catch (JSONException e2) {
                            C4157k4.d().a(e2);
                            if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                                i = 1003;
                                this.c = 1003;
                                this.d = "Auction decryption error";
                            } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                                i = 1002;
                                this.c = 1002;
                                this.d = "Auction parsing error";
                            } else {
                                i = 1008;
                                this.c = 1008;
                                this.d = "Auction decompression error";
                            }
                            this.g = a(Integer.valueOf(i));
                            IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                            httpURLConnection.disconnect();
                            return false;
                        }
                    }
                    this.c = 1001;
                    String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.d = str2;
                    ironLog.error(str2);
                    httpURLConnection.disconnect();
                    if (this.f < this.n - 1) {
                        a(this.o, time);
                    }
                    this.f++;
                }
            } catch (Exception e3) {
                C4157k4.d().a(e3);
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
            S1 s1 = this.a;
            if (s1 == null) {
                return;
            }
            a(b, s1, new Date().getTime() - this.e);
        }

        private String a() {
            if (this.h == 2) {
                return C4123i5.b().d();
            }
            return C4123i5.b().c();
        }

        private void a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        private HttpURLConnection a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setRequestMethod(C4094gc.b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        public JSONObject a(JSONObject jSONObject, boolean z) throws JSONException {
            String str;
            String a = a();
            if (this.h == 2) {
                str = "ct";
            } else {
                str = "response";
            }
            String string = jSONObject.getString(str);
            if (z) {
                return b(a, string);
            }
            return a(a, string);
        }

        public void a(String str, boolean z, boolean z2) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z) {
                    jSONObject = a(jSONObject, z2);
                }
                d.a a = d.b().a(jSONObject);
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
                return new JSONObject(b);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
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

        public void a(boolean z, S1 s1, long j) {
            if (z) {
                s1.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                s1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        private String a(Integer num) {
            return Y1.a.a(this.r, num);
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String d = I9.d(str, str2);
            if (d != null) {
                return new JSONObject(d);
            }
            throw new JSONException("decompression error");
        }
    }

    public void a(Context context, h hVar, S1 s1) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, hVar, s1));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (s1 != null) {
                s1.a(1000, e.getMessage(), 0, Y1.a.a(this.e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, Z1 z1, int i, C3959aa c3959aa) {
        e eVar;
        boolean g;
        JSONObject a2;
        try {
            g = IronSourceUtils.g();
            a2 = a(map, list, z1, i, g, c3959aa);
            eVar = this;
        } catch (Exception e) {
            e = e;
            eVar = this;
        }
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.h, new URL(eVar.g.a(false)), a2, g, eVar.g));
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C4157k4.d().a(exc);
            IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
            eVar.h.a(1000, exc.getMessage(), 0, Y1.a.a(eVar.g.n(), 1000), 0L);
        }
    }

    public void a(C4227o2 c4227o2, int i, C4227o2 c4227o22, String str) {
        Iterator<String> it = c4227o2.b().iterator();
        while (it.hasNext()) {
            C4227o2 c4227o23 = c4227o2;
            int i2 = i;
            String str2 = str;
            d.b().a("reportImpression", c4227o23.c(), d.b().a(it.next(), i2, c4227o23, "", "", str2));
            i = i2;
            c4227o2 = c4227o23;
            str = str2;
        }
        C4227o2 c4227o24 = c4227o2;
        int i3 = i;
        String str3 = str;
        if (c4227o22 != null) {
            Iterator<String> it2 = c4227o22.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i3, c4227o24, "", "102", str3));
            }
        }
    }

    public void a(C4227o2 c4227o2, int i, C4227o2 c4227o22) {
        Iterator<String> it = c4227o2.h().iterator();
        while (it.hasNext()) {
            C4227o2 c4227o23 = c4227o2;
            int i2 = i;
            d.b().a("reportLoadSuccess", c4227o23.c(), d.b().a(it.next(), i2, c4227o23, "", "", ""));
            i = i2;
            c4227o2 = c4227o23;
        }
        C4227o2 c4227o24 = c4227o2;
        int i3 = i;
        if (c4227o22 != null) {
            Iterator<String> it2 = c4227o22.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i3, c4227o24, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<u> copyOnWriteArrayList, ConcurrentHashMap<String, C4227o2> concurrentHashMap, int i, C4227o2 c4227o2, C4227o2 c4227o22) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<u> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, c4227o2, c4227o22);
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, Z1 z1, int i, C3959aa c3959aa, ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
        a(context, map, list, z1, i, c3959aa);
    }

    private JSONObject a(Map<String, Object> map, List<String> list, Z1 z1, int i, boolean z, C3959aa c3959aa) throws JSONException {
        h hVar = new h(this.f);
        hVar.a(map);
        hVar.a(list);
        hVar.a(z1);
        hVar.a(i);
        hVar.a(this.i);
        hVar.a(c3959aa);
        hVar.b(z);
        return d.b().a(hVar);
    }

    public boolean a() {
        return this.e.b();
    }
}
