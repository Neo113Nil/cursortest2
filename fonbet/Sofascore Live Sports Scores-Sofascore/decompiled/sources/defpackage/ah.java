package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData;
import com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl;
import com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.TimeUpdateData;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ah implements wke {
    public boolean A;
    public boolean B;
    public int C;
    public dg D;
    public yg E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public yg J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public long O;
    public final wi5 a;
    public final hjg b;
    public final List c;
    public final xe4 d;
    public final Object e;
    public final iij f;
    public final Handler g;
    public final zg h;
    public final ArrayList i;
    public final ArrayList j;
    public final xg k;
    public final o79 l;
    public final gbo m;
    public final zin n;
    public final xg o;
    public Object p;
    public ale q;
    public rqk r;
    public rqk s;
    public int t;
    public cjn u;
    public boolean v;
    public jz2 w;
    public mij x;
    public long y;
    public kg z;

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(1:3)|4|(1:6)(1:63)|7|8|(1:10)(1:62)|11|12|(1:14)(1:61)|15|(1:17)(2:57|(1:59)(9:60|19|(3:51|52|53)(4:23|(1:25)|26|(3:28|(2:30|(1:(1:33)(1:34))(1:35))|36)(1:50))|37|(1:49)(1:41)|42|(1:44)(1:48)|45|46))|18|19|(1:21)|51|52|53|37|(1:39)|49|42|(0)(0)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02c8, code lost:
    
        r23.z = new defpackage.kg(r23.e, new long[0]);
        x();
        r23.w = new defpackage.jz2(r0);
        s();
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x028b  */
    /* JADX WARN: Type inference failed for: r6v14, types: [xg] */
    /* JADX WARN: Type inference failed for: r6v8, types: [xg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ah(Context context, wi5 wi5Var, hjg hjgVar, List list, xe4 xe4Var, Object obj, ViewGroup viewGroup) {
        gbo kknVar;
        Uri uri;
        j7o j7oVar;
        u3o a;
        zin zinVar;
        Uri uri2;
        boolean z;
        gl E;
        this.a = wi5Var;
        this.b = hjgVar;
        mr9 mr9Var = (mr9) wi5Var.d;
        final int i = 0;
        boolean z2 = false;
        mr9 mr9Var2 = mr9Var;
        if (mr9Var == null) {
            hjgVar.getClass();
            lr9.a().getClass();
            bqn bqnVar = new bqn();
            bqnVar.d = nik.H()[0];
            mr9Var2 = bqnVar;
        }
        mr9 mr9Var3 = mr9Var2;
        bqn bqnVar2 = (bqn) mr9Var3;
        bqnVar2.a = "google/exo.ext.ima";
        bqnVar2.b = "1.10.1";
        this.c = list;
        this.d = xe4Var;
        this.e = obj;
        this.f = new iij();
        this.g = new Handler(Looper.getMainLooper(), null);
        zg zgVar = new zg(this);
        this.h = zgVar;
        hpo hpoVar = new hpo(this);
        this.i = new ArrayList();
        final int i2 = 1;
        this.j = new ArrayList(1);
        this.k = new Runnable(this) { // from class: xg
            public final /* synthetic */ ah b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                ah ahVar = this.b;
                switch (i3) {
                    case 0:
                        ahVar.y();
                        break;
                    default:
                        if (ahVar.m()) {
                            ahVar.i(new IOException("Ad loading timed out"));
                            ahVar.s();
                            break;
                        }
                        break;
                }
            }
        };
        this.l = o79.d();
        rqk rqkVar = rqk.c;
        this.r = rqkVar;
        this.s = rqkVar;
        this.K = C.TIME_UNSET;
        this.L = C.TIME_UNSET;
        this.M = C.TIME_UNSET;
        this.O = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.x = mij.a;
        this.z = kg.g;
        this.o = new Runnable(this) { // from class: xg
            public final /* synthetic */ ah b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ah ahVar = this.b;
                switch (i3) {
                    case 0:
                        ahVar.y();
                        break;
                    default:
                        if (ahVar.m()) {
                            ahVar.i(new IOException("Ad loading timed out"));
                            ahVar.s();
                            break;
                        }
                        break;
                }
            }
        };
        de0 de0Var = new de0(this, 6);
        if (viewGroup != null) {
            hjgVar.getClass();
            m7o m7oVar = lr9.c;
            kknVar = new gbo(viewGroup, de0Var);
            this.m = kknVar;
        } else {
            hjgVar.getClass();
            m7o m7oVar2 = lr9.c;
            context.getClass();
            kknVar = new kkn(new ikn(context), de0Var);
            this.m = kknVar;
        }
        gbo gboVar = kknVar;
        hjgVar.getClass();
        lr9 a2 = lr9.a();
        a2.getClass();
        Uri uri3 = bqnVar2.c ? ypn.b : ypn.a;
        ExecutorService executorService = a2.b;
        if (executorService == null) {
            new o8p();
            Locale locale = Locale.ROOT;
            uri = uri3;
            executorService = Executors.newCachedThreadPool(new rvd(Executors.defaultThreadFactory(), new AtomicLong(0L)));
            a2.b = executorService;
        } else {
            uri = uri3;
        }
        jca.d0("Invalid ImaSdkSettings instance. ImaSdkSettings must be constructed through ImaSdkFactory.", mr9Var3 instanceof bqn);
        long currentTimeMillis = System.currentTimeMillis();
        m7o m7oVar3 = lr9.c;
        BridgeConfiguration create = BridgeConfiguration.create(uri, bqnVar2.d, context.getPackageName(), u1p.a, lr9.d);
        ArrayList arrayList = m7oVar3.a;
        if (arrayList.isEmpty()) {
            a = m7o.a(context, create, executorService);
        } else {
            j7o j7oVar2 = (j7o) arrayList.remove(0);
            if (j7oVar2.a().equals(create)) {
                j7oVar = j7oVar2;
                int i3 = a2.a;
                a2.a = i3 + 1;
                pic picVar = new pic();
                picVar.c = new ConcurrentHashMap();
                picVar.b = 0;
                picVar.a = i3;
                gen s = hen.s();
                String str = Build.MODEL;
                s.getClass();
                s.b();
                ((hen) s.b).v(str);
                String str2 = Build.MANUFACTURER;
                s.b();
                ((hen) s.b).u(str2);
                String str3 = Build.VERSION.RELEASE;
                s.b();
                ((hen) s.b).t(str3);
                picVar.d = s;
                picVar.e = uen.t();
                picVar.e = j7oVar.c();
                zinVar = new zin(j7oVar.b(), context, mr9Var3, gboVar, picVar, j7oVar.d());
                j7oVar.b().f.addListener(new f2n(zinVar, 7), j7oVar.d());
                sen senVar = (sen) picVar.e;
                pen s2 = qen.s();
                s2.f(currentTimeMillis);
                s2.g(System.currentTimeMillis());
                senVar.b();
                ((uen) senVar.b).u((qen) s2.c());
                c0l c0lVar = zinVar.f;
                ((List) c0lVar.b).add(zgVar);
                ((List) c0lVar.b).add((uf) wi5Var.b);
                zinVar.g.add(zgVar);
                uri2 = xe4Var.a;
                if (Objects.equals(uri2.getScheme(), "csai") || !Objects.equals(uri2.getAuthority(), "ima.google.com")) {
                    z = true;
                    E = m6k.E(hjgVar, xe4Var);
                } else {
                    E = hjg.n();
                    String queryParameter = uri2.getQueryParameter("uri");
                    if (queryParameter != null) {
                        E.b = queryParameter;
                    }
                    String queryParameter2 = uri2.getQueryParameter("videoOrientation");
                    if (queryParameter2 != null) {
                        int parseInt = Integer.parseInt(queryParameter2);
                        z = true;
                        E.i = parseInt != 1 ? parseInt != 2 ? parseInt != 3 ? 1 : 4 : 3 : 2;
                    } else {
                        z = true;
                    }
                }
                Object obj2 = new Object();
                this.p = obj2;
                E.j = obj2;
                E.d = hpoVar;
                jca.d0("Either ad tag url or ads response must non-null and non empty", (wba.Y(E.b) || !wba.Y(E.c)) ? z : false);
                jca.d0("AdsLoader must be constructed with AdDisplayContainer", Objects.nonNull(zinVar.i));
                if (zinVar.q.d()) {
                    String uuid = UUID.randomUUID().toString();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    E.h = new e2p(Long.valueOf(currentTimeMillis2));
                    mha.I(zinVar.b, new sx2(z2 ? 1 : 0, zinVar, E, uuid), zinVar.n);
                    sen b = zinVar.d.b(uuid);
                    qen c = t6o.c(currentTimeMillis2, System.currentTimeMillis());
                    b.b();
                    ((uen) b.b).w(c);
                } else {
                    c0lVar.v((vf) zinVar.q.g());
                }
                this.n = zinVar;
            }
            a = m7o.a(context, create, executorService);
        }
        j7oVar = a;
        int i32 = a2.a;
        a2.a = i32 + 1;
        pic picVar2 = new pic();
        picVar2.c = new ConcurrentHashMap();
        picVar2.b = 0;
        picVar2.a = i32;
        gen s3 = hen.s();
        String str4 = Build.MODEL;
        s3.getClass();
        s3.b();
        ((hen) s3.b).v(str4);
        String str22 = Build.MANUFACTURER;
        s3.b();
        ((hen) s3.b).u(str22);
        String str32 = Build.VERSION.RELEASE;
        s3.b();
        ((hen) s3.b).t(str32);
        picVar2.d = s3;
        picVar2.e = uen.t();
        picVar2.e = j7oVar.c();
        zinVar = new zin(j7oVar.b(), context, mr9Var3, gboVar, picVar2, j7oVar.d());
        j7oVar.b().f.addListener(new f2n(zinVar, 7), j7oVar.d());
        sen senVar2 = (sen) picVar2.e;
        pen s22 = qen.s();
        s22.f(currentTimeMillis);
        s22.g(System.currentTimeMillis());
        senVar2.b();
        ((uen) senVar2.b).u((qen) s22.c());
        c0l c0lVar2 = zinVar.f;
        ((List) c0lVar2.b).add(zgVar);
        ((List) c0lVar2.b).add((uf) wi5Var.b);
        zinVar.g.add(zgVar);
        uri2 = xe4Var.a;
        if (Objects.equals(uri2.getScheme(), "csai")) {
        }
        z = true;
        E = m6k.E(hjgVar, xe4Var);
        Object obj22 = new Object();
        this.p = obj22;
        E.j = obj22;
        E.d = hpoVar;
        jca.d0("Either ad tag url or ads response must non-null and non empty", (wba.Y(E.b) || !wba.Y(E.c)) ? z : false);
        jca.d0("AdsLoader must be constructed with AdDisplayContainer", Objects.nonNull(zinVar.i));
        if (zinVar.q.d()) {
        }
        this.n = zinVar;
    }

    public static long e(ale aleVar, mij mijVar, iij iijVar) {
        long contentPosition = aleVar.getContentPosition();
        return mijVar.p() ? contentPosition : contentPosition - nik.h0(mijVar.f(aleVar.getCurrentPeriodIndex(), iijVar, false).e);
    }

    public final void a() {
        cjn cjnVar = this.u;
        if (cjnVar != null) {
            List list = (List) cjnVar.d.b;
            zg zgVar = this.h;
            list.remove(zgVar);
            wi5 wi5Var = this.a;
            ((List) this.u.d.b).remove((uf) wi5Var.b);
            this.u.c.remove(zgVar);
            this.u.c.remove((wf) wi5Var.c);
            this.u.g();
            this.u = null;
        }
    }

    public final void b() {
        hg b;
        int i;
        if (this.F || this.y == C.TIME_UNSET || this.M != C.TIME_UNSET) {
            return;
        }
        ale aleVar = this.q;
        aleVar.getClass();
        long e = e(aleVar, this.x, this.f);
        if (5000 + e < this.y) {
            return;
        }
        int d = this.z.d(nik.T(e), nik.T(this.y));
        if (d == -1 || this.z.b(d).a == Long.MIN_VALUE || ((i = (b = this.z.b(d)).b) != -1 && b.b(-1) >= i)) {
            v();
        }
    }

    public final int c(double d) {
        long round = Math.round(((float) d) * 1000000.0d);
        int i = 0;
        while (true) {
            kg kgVar = this.z;
            if (i >= kgVar.b) {
                a70.r("Failed to find cue point");
                return 0;
            }
            long j = kgVar.b(i).a;
            if (j != Long.MIN_VALUE && Math.abs(j - round) < 1000) {
                return i;
            }
            i++;
        }
    }

    public final rqk d() {
        ale aleVar = this.q;
        if (aleVar == null) {
            return this.s;
        }
        if (this.C != 0 && this.G) {
            long duration = aleVar.getDuration();
            if (duration != C.TIME_UNSET) {
                return new rqk(this.q.getCurrentPosition(), duration);
            }
        }
        return rqk.c;
    }

    public final rqk f() {
        boolean z = this.y != C.TIME_UNSET;
        long j = this.M;
        if (j != C.TIME_UNSET) {
            this.N = true;
        } else {
            ale aleVar = this.q;
            if (aleVar == null) {
                return this.r;
            }
            if (this.K != C.TIME_UNSET) {
                j = this.L + (SystemClock.elapsedRealtime() - this.K);
            } else {
                if (this.C != 0 || this.G || !z) {
                    return rqk.c;
                }
                j = e(aleVar, this.x, this.f);
            }
        }
        return new rqk(j, z ? this.y : -1L);
    }

    public final int g() {
        ale aleVar = this.q;
        if (aleVar == null) {
            return -1;
        }
        long T = nik.T(e(aleVar, this.x, this.f));
        int d = this.z.d(T, nik.T(this.y));
        return d == -1 ? this.z.c(T, nik.T(this.y)) : d;
    }

    public final void h(hoo hooVar) {
        Map map = hooVar.c;
        if (this.u == null) {
            return;
        }
        int ordinal = hooVar.a.ordinal();
        if (ordinal == 1) {
            String str = (String) map.get("adBreakTime");
            str.getClass();
            this.a.getClass();
            double parseDouble = Double.parseDouble(str);
            p(parseDouble == -1.0d ? this.z.b - 1 : c(parseDouble));
            return;
        }
        ArrayList arrayList = this.i;
        int i = 0;
        if (ordinal == 2) {
            while (i < arrayList.size()) {
                ((vk) arrayList.get(i)).getClass();
                i++;
            }
            return;
        }
        if (ordinal == 5) {
            this.B = true;
            this.C = 0;
            if (this.N) {
                this.M = C.TIME_UNSET;
                this.N = false;
                return;
            }
            return;
        }
        if (ordinal == 6) {
            this.B = false;
            yg ygVar = this.E;
            if (ygVar != null) {
                this.z = this.z.h(ygVar.a);
                x();
                return;
            }
            return;
        }
        if (ordinal == 8) {
            tgj.O("AdEvent: " + map);
        } else {
            if (ordinal != 17) {
                return;
            }
            while (i < arrayList.size()) {
                ((vk) arrayList.get(i)).getClass();
                i++;
            }
        }
    }

    public final void i(Exception exc) {
        int g = g();
        if (g == -1) {
            tgj.e0("Unable to determine ad group index for ad group load error", exc);
            return;
        }
        p(g);
        if (this.w == null) {
            this.w = new jz2(new IOException(ljg.j(g, "Failed to load ad group "), exc));
        }
    }

    public final void j(int i, Exception exc, int i2) {
        this.a.getClass();
        if (this.u == null) {
            tgj.d0("Ignoring ad prepare error after release");
            return;
        }
        if (this.C == 0) {
            this.K = SystemClock.elapsedRealtime();
            long h0 = nik.h0(this.z.b(i).a);
            this.L = h0;
            if (h0 == Long.MIN_VALUE) {
                this.L = this.y;
            }
            this.J = new yg(i, i2);
        } else {
            dg dgVar = this.D;
            dgVar.getClass();
            int i3 = this.I;
            ArrayList arrayList = this.j;
            if (i2 > i3) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    qyo qyoVar = (qyo) ((bpk) arrayList.get(i4));
                    qyoVar.a(JavaScriptMessage$MsgType.end, dgVar, null);
                    qyoVar.a.remove(dgVar);
                }
            }
            this.I = this.z.b(i).b(-1);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                qyo qyoVar2 = (qyo) ((bpk) arrayList.get(i5));
                qyoVar2.a(JavaScriptMessage$MsgType.error, dgVar, null);
                qyoVar2.a.remove(dgVar);
            }
        }
        this.z = this.z.g(i, i2);
        x();
    }

    public final void k(int i, boolean z) {
        boolean z2 = this.G;
        ArrayList arrayList = this.j;
        if (z2 && this.C == 1) {
            boolean z3 = this.H;
            if (!z3 && i == 2) {
                this.H = true;
                dg dgVar = this.D;
                dgVar.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((qyo) ((bpk) arrayList.get(i2))).a(JavaScriptMessage$MsgType.waiting, dgVar, null);
                }
                this.g.removeCallbacks(this.k);
            } else if (z3 && i == 3) {
                this.H = false;
                y();
            }
        }
        int i3 = this.C;
        if (i3 == 0 && ((i == 2 || i == 4) && z)) {
            b();
            return;
        }
        if (i3 == 0 || i != 4) {
            return;
        }
        dg dgVar2 = this.D;
        if (dgVar2 == null) {
            tgj.d0("onEnded without ad media info");
        } else {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                qyo qyoVar = (qyo) ((bpk) arrayList.get(i4));
                qyoVar.a(JavaScriptMessage$MsgType.end, dgVar2, null);
                qyoVar.a.remove(dgVar2);
            }
        }
        this.a.getClass();
    }

    public final void l() {
        ale aleVar = this.q;
        if (this.u == null || aleVar == null) {
            return;
        }
        int i = 0;
        if (!this.G && !aleVar.isPlayingAd()) {
            b();
            if (!this.F && !this.x.p()) {
                mij mijVar = this.x;
                iij iijVar = this.f;
                long e = e(aleVar, mijVar, iijVar);
                this.x.f(aleVar.getCurrentPeriodIndex(), iijVar, false);
                if (iijVar.g.d(nik.T(e), iijVar.d) != -1) {
                    this.N = false;
                    this.M = e;
                }
            }
        }
        boolean z = this.G;
        int i2 = this.I;
        boolean isPlayingAd = aleVar.isPlayingAd();
        this.G = isPlayingAd;
        int currentAdIndexInAdGroup = isPlayingAd ? aleVar.getCurrentAdIndexInAdGroup() : -1;
        this.I = currentAdIndexInAdGroup;
        wi5 wi5Var = this.a;
        if (z && currentAdIndexInAdGroup != i2) {
            dg dgVar = this.D;
            if (dgVar == null) {
                tgj.d0("onEnded without ad media info");
            } else {
                yg ygVar = (yg) this.l.get(dgVar);
                int i3 = this.I;
                if (i3 == -1 || (ygVar != null && ygVar.b < i3)) {
                    while (true) {
                        ArrayList arrayList = this.j;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        qyo qyoVar = (qyo) ((bpk) arrayList.get(i));
                        qyoVar.a(JavaScriptMessage$MsgType.end, dgVar, null);
                        qyoVar.a.remove(dgVar);
                        i++;
                    }
                    wi5Var.getClass();
                }
            }
        }
        if (!this.F && !z && this.G && this.C == 0) {
            hg b = this.z.b(aleVar.getCurrentAdGroupIndex());
            if (b.a == Long.MIN_VALUE) {
                v();
            } else {
                this.K = SystemClock.elapsedRealtime();
                long h0 = nik.h0(b.a);
                this.L = h0;
                if (h0 == Long.MIN_VALUE) {
                    this.L = this.y;
                }
            }
        }
        if (m()) {
            Handler handler = this.g;
            xg xgVar = this.o;
            handler.removeCallbacks(xgVar);
            handler.postDelayed(xgVar, wi5Var.a);
        }
    }

    public final boolean m() {
        int currentAdGroupIndex;
        ale aleVar = this.q;
        if (aleVar == null || (currentAdGroupIndex = aleVar.getCurrentAdGroupIndex()) == -1) {
            return false;
        }
        kg kgVar = this.z;
        if (currentAdGroupIndex >= kgVar.b) {
            return true;
        }
        hg b = kgVar.b(currentAdGroupIndex);
        int currentAdIndexInAdGroup = aleVar.getCurrentAdIndexInAdGroup();
        int i = b.b;
        return i == -1 || i <= currentAdIndexInAdGroup || b.f[currentAdIndexInAdGroup] == 0;
    }

    public final boolean n() {
        int g;
        ale aleVar = this.q;
        if (aleVar == null || (g = g()) == -1) {
            return false;
        }
        hg b = this.z.b(g);
        int i = b.b;
        return (i == -1 || i == 0 || b.f[0] == 0) && nik.h0(b.a) - e(aleVar, this.x, this.f) < this.a.a;
    }

    public final void o(dg dgVar, xto xtoVar) {
        int c;
        hg b;
        int i;
        cjn cjnVar = this.u;
        wi5 wi5Var = this.a;
        if (cjnVar == null) {
            wi5Var.getClass();
            return;
        }
        AdPodInfoData adPodInfoData = (AdPodInfoData) xtoVar.b;
        Integer podIndex = adPodInfoData.podIndex();
        if ((podIndex == null ? 0 : podIndex.intValue()) == -1) {
            c = this.z.b - 1;
        } else {
            Double timeOffset = adPodInfoData.timeOffset();
            c = c(timeOffset == null ? 0.0d : timeOffset.doubleValue());
        }
        Integer adPosition = adPodInfoData.adPosition();
        int intValue = (adPosition == null ? 1 : adPosition.intValue()) - 1;
        yg ygVar = new yg(c, intValue);
        this.l.n(dgVar, ygVar, true);
        wi5Var.getClass();
        kg kgVar = this.z;
        if (c < kgVar.b && (i = (b = kgVar.b(c)).b) != -1 && intValue < i && b.f[intValue] == 4) {
            return;
        }
        hg b2 = this.z.b(c);
        kg kgVar2 = this.z;
        Integer num = adPodInfoData.totalAds();
        kg f = kgVar2.f(c, Math.max(num == null ? 1 : num.intValue(), b2.f.length));
        this.z = f;
        hg b3 = f.b(c);
        for (int i2 = 0; i2 < intValue; i2++) {
            if (b3.f[i2] == 0) {
                this.z = this.z.g(c, i2);
            }
        }
        h5c h5cVar = new h5c();
        h5cVar.b(dgVar.a);
        String str = (String) dgVar.b.i();
        if (str != null) {
            h5cVar.c = str;
        }
        kg kgVar3 = this.z;
        h6c a = h5cVar.a();
        int i3 = ygVar.a - kgVar3.e;
        hg[] hgVarArr = kgVar3.f;
        hg[] hgVarArr2 = (hg[]) nik.V(hgVarArr, hgVarArr.length);
        hgVarArr2[i3].getClass();
        v5c v5cVar = a.b;
        z1a.E((v5cVar == null || v5cVar.a.equals(Uri.EMPTY)) ? false : true);
        hg hgVar = hgVarArr2[i3];
        int[] iArr = hgVar.f;
        int i4 = ygVar.b;
        int length = iArr.length;
        int max = Math.max(i4 + 1, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = hgVar.g;
        if (jArr.length != copyOf.length) {
            jArr = hg.a(jArr, copyOf.length);
        }
        long[] jArr2 = jArr;
        h6c[] h6cVarArr = (h6c[]) Arrays.copyOf(hgVar.e, copyOf.length);
        h6cVarArr[i4] = a;
        copyOf[i4] = 1;
        String[] strArr = hgVar.h;
        if (strArr.length != copyOf.length) {
            strArr = (String[]) Arrays.copyOf(strArr, copyOf.length);
        }
        String[] strArr2 = strArr;
        ig[] igVarArr = hgVar.i;
        if (igVarArr.length != copyOf.length) {
            igVarArr = (ig[]) Arrays.copyOf(igVarArr, Math.max(copyOf.length, igVarArr.length));
        }
        hgVarArr2[i3] = new hg(hgVar.a, hgVar.b, hgVar.c, copyOf, h6cVarArr, jArr2, strArr2, igVarArr);
        this.z = new kg(kgVar3.a, hgVarArr2, kgVar3.c, kgVar3.d, kgVar3.e);
        x();
    }

    @Override // defpackage.wke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        ale aleVar;
        cjn cjnVar = this.u;
        if (cjnVar == null || (aleVar = this.q) == null) {
            return;
        }
        int i2 = this.C;
        if (i2 == 1 && !z) {
            cjnVar.e(JavaScriptMessage$MsgType.pause);
        } else if (i2 == 2 && z) {
            cjnVar.e(JavaScriptMessage$MsgType.resume);
        } else {
            k(aleVar.getPlaybackState(), z);
        }
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        ale aleVar = this.q;
        if (this.u == null || aleVar == null) {
            return;
        }
        if (i == 2 && !aleVar.isPlayingAd() && n()) {
            this.O = SystemClock.elapsedRealtime();
        } else if (i == 3) {
            this.O = C.TIME_UNSET;
        }
        k(i, aleVar.getPlayWhenReady());
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        if (this.C == 0) {
            return;
        }
        ale aleVar = this.q;
        aleVar.getClass();
        if (!aleVar.isPlayingAd()) {
            return;
        }
        dg dgVar = this.D;
        dgVar.getClass();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                return;
            }
            qyo qyoVar = (qyo) ((bpk) arrayList.get(i));
            qyoVar.a(JavaScriptMessage$MsgType.error, dgVar, null);
            qyoVar.a.remove(dgVar);
            i++;
        }
    }

    @Override // defpackage.wke
    public final void onPositionDiscontinuity(yke ykeVar, yke ykeVar2, int i) {
        l();
    }

    @Override // defpackage.wke
    public final void onTimelineChanged(mij mijVar, int i) {
        ale aleVar;
        if (mijVar.p() || (aleVar = this.q) == null) {
            return;
        }
        this.x = mijVar;
        int currentPeriodIndex = aleVar.getCurrentPeriodIndex();
        iij iijVar = this.f;
        long j = mijVar.f(currentPeriodIndex, iijVar, false).d;
        this.y = nik.h0(j);
        kg kgVar = this.z;
        long j2 = kgVar.d;
        if (j != j2) {
            if (j2 != j) {
                kgVar = new kg(kgVar.a, kgVar.f, kgVar.c, j, kgVar.e);
            }
            this.z = kgVar;
            x();
        }
        q(e(aleVar, mijVar, iijVar), this.y);
        l();
    }

    public final void p(int i) {
        hg b = this.z.b(i);
        if (b.b == -1) {
            kg f = this.z.f(i, Math.max(1, b.f.length));
            this.z = f;
            b = f.b(i);
        }
        for (int i2 = 0; i2 < b.b; i2++) {
            if (b.f[i2] == 0) {
                this.a.getClass();
                this.z = this.z.g(i, i2);
            }
        }
        x();
        this.M = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r15.b(1).a == Long.MIN_VALUE) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080 A[LOOP:0: B:14:0x0080->B:16:0x0084, LOOP_START, PHI: r3
      0x0080: PHI (r3v3 int) = (r3v1 int), (r3v5 int) binds: [B:13:0x007e, B:16:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(long j, long j2) {
        kg kgVar;
        cjn cjnVar = this.u;
        if (this.v || cjnVar == null) {
            return;
        }
        this.v = true;
        this.b.getClass();
        lr9.a().getClass();
        AdsRenderingSettingsImpl adsRenderingSettingsImpl = new AdsRenderingSettingsImpl();
        adsRenderingSettingsImpl.setEnablePreloading(true);
        this.a.getClass();
        int i = 0;
        adsRenderingSettingsImpl.setEnableCustomTabs(false);
        adsRenderingSettingsImpl.setMimeTypes(this.c);
        adsRenderingSettingsImpl.setFocusSkipButtonWhenAvailable(true);
        int d = this.z.d(nik.T(j), nik.T(j2));
        if (d != -1) {
            long j3 = this.z.b(d).a;
            nik.T(j);
            kg kgVar2 = this.z;
            int i2 = kgVar2.b;
            if (i2 == 1) {
                long j4 = kgVar2.b(0).a;
                if (j4 != 0) {
                }
                if (d > 0) {
                    while (true) {
                        kgVar = this.z;
                        if (i >= d) {
                            break;
                        }
                        this.z = kgVar.h(i);
                        i++;
                    }
                    if (d == kgVar.b) {
                        adsRenderingSettingsImpl = null;
                    } else {
                        long j5 = kgVar.b(d).a;
                        long j6 = this.z.b(d - 1).a;
                        if (j5 == Long.MIN_VALUE) {
                            adsRenderingSettingsImpl.setPlayAdsAfterTime((j6 / 1000000.0d) + 1.0d);
                        } else {
                            adsRenderingSettingsImpl.setPlayAdsAfterTime(((j5 + j6) / 2.0d) / 1000000.0d);
                        }
                    }
                }
            } else {
                if (i2 == 2) {
                    if (kgVar2.b(0).a == 0) {
                    }
                }
                this.M = j;
                if (d > 0) {
                }
            }
        }
        if (adsRenderingSettingsImpl == null) {
            a();
        } else {
            cjnVar.m = adsRenderingSettingsImpl;
            cjnVar.n.c = adsRenderingSettingsImpl;
            HashMap hashMap = new HashMap();
            hashMap.put("adsRenderingSettings", AdsRenderingSettingsImpl.AdsRenderingSettingsData.builder(adsRenderingSettingsImpl).build());
            sx2 sx2Var = cjnVar.s;
            if (sx2Var != null) {
                rqk P = sx2Var.P();
                long j7 = P.a;
                if (!P.equals(rqk.c)) {
                    double d2 = j7 / 1000.0f;
                    new StringBuilder(String.valueOf(d2).length() + 44);
                    hashMap.put("contentStartTime", Double.valueOf(d2));
                    hashMap.put("contentStartTimeMs", Long.valueOf(j7));
                }
            }
            cjnVar.a.d(new lda(JavaScriptMessage$MsgChannel.adsManager, JavaScriptMessage$MsgType.init, cjnVar.b, hashMap, null));
            cjnVar.h.a();
            cjnVar.e(JavaScriptMessage$MsgType.start);
        }
        x();
    }

    public final void r(RuntimeException runtimeException, String str) {
        String concat = "Internal error in ".concat(str);
        tgj.A(concat, runtimeException);
        int i = 0;
        int i2 = 0;
        while (true) {
            kg kgVar = this.z;
            if (i2 >= kgVar.b) {
                break;
            }
            this.z = kgVar.h(i2);
            i2++;
        }
        x();
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return;
            }
            ((vk) arrayList.get(i)).a(new jz2(new RuntimeException(concat, runtimeException)), this.d);
            i++;
        }
    }

    public final void s() {
        if (this.w == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                this.w = null;
                return;
            } else {
                ((vk) arrayList.get(i)).a(this.w, this.d);
                i++;
            }
        }
    }

    public final void t(dg dgVar) {
        this.a.getClass();
        if (this.u == null) {
            return;
        }
        if (this.C == 1) {
            tgj.d0("Unexpected playAd without stopAd");
        }
        int i = this.C;
        int i2 = 0;
        ArrayList arrayList = this.j;
        if (i == 0) {
            this.K = C.TIME_UNSET;
            this.L = C.TIME_UNSET;
            this.C = 1;
            this.D = dgVar;
            yg ygVar = (yg) this.l.get(dgVar);
            ygVar.getClass();
            this.E = ygVar;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((bpk) arrayList.get(i3)).getClass();
            }
            yg ygVar2 = this.J;
            if (ygVar2 != null && ygVar2.equals(this.E)) {
                this.J = null;
                while (i2 < arrayList.size()) {
                    qyo qyoVar = (qyo) ((bpk) arrayList.get(i2));
                    qyoVar.a(JavaScriptMessage$MsgType.error, dgVar, null);
                    qyoVar.a.remove(dgVar);
                    i2++;
                }
            }
            y();
        } else {
            this.C = 1;
            z1a.E(dgVar.equals(this.D));
            while (i2 < arrayList.size()) {
                ((qyo) ((bpk) arrayList.get(i2))).a(JavaScriptMessage$MsgType.play, dgVar, null);
                i2++;
            }
        }
        ale aleVar = this.q;
        if (aleVar == null || !aleVar.getPlayWhenReady()) {
            cjn cjnVar = this.u;
            cjnVar.getClass();
            cjnVar.e(JavaScriptMessage$MsgType.pause);
        }
    }

    public final void u() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.p = null;
        a();
        zin zinVar = this.n;
        List list = zinVar.g;
        zg zgVar = this.h;
        list.remove(zgVar);
        ((List) zinVar.f.b).remove(zgVar);
        ((List) zinVar.f.b).remove((uf) this.a.b);
        gbo gboVar = zinVar.i;
        gboVar.a.removeAllViews();
        gboVar.d = null;
        vdb vdbVar = zinVar.c.b;
        ((Handler) vdbVar.d).post(new f2n(vdbVar, 28));
        l6n l6nVar = zinVar.e;
        l6nVar.d.clear();
        l6nVar.e.clear();
        zinVar.g.clear();
        ((List) zinVar.f.b).clear();
        pic picVar = zinVar.d.c;
        ((ConcurrentHashMap) picVar.c).clear();
        int i = 0;
        picVar.b = 0;
        this.B = false;
        this.C = 0;
        this.D = null;
        this.g.removeCallbacks(this.k);
        this.E = null;
        this.w = null;
        while (true) {
            kg kgVar = this.z;
            if (i >= kgVar.b) {
                x();
                return;
            } else {
                this.z = kgVar.h(i);
                i++;
            }
        }
    }

    public final void v() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i2 >= arrayList.size()) {
                break;
            }
            qyo qyoVar = (qyo) ((bpk) arrayList.get(i2));
            qyoVar.getClass();
            ((mqn) ((mvn) qyoVar.b.b).c).d(new lda(JavaScriptMessage$MsgChannel.adsLoader, JavaScriptMessage$MsgType.contentComplete, "*", null, null));
            i2++;
        }
        this.F = true;
        this.a.getClass();
        while (true) {
            kg kgVar = this.z;
            if (i >= kgVar.b) {
                x();
                return;
            } else {
                if (kgVar.b(i).a != Long.MIN_VALUE) {
                    this.z = this.z.h(i);
                }
                i++;
            }
        }
    }

    public final void w(dg dgVar) {
        hg b;
        int i;
        this.a.getClass();
        if (this.u == null) {
            return;
        }
        if (this.C == 0) {
            yg ygVar = (yg) this.l.get(dgVar);
            if (ygVar != null) {
                kg kgVar = this.z;
                int i2 = ygVar.a;
                int i3 = ygVar.b;
                int i4 = i2 - kgVar.e;
                hg[] hgVarArr = kgVar.f;
                hg[] hgVarArr2 = (hg[]) nik.V(hgVarArr, hgVarArr.length);
                hgVarArr2[i4] = hgVarArr2[i4].d(2, i3);
                this.z = new kg(kgVar.a, hgVarArr2, kgVar.c, kgVar.d, kgVar.e);
                x();
                return;
            }
            return;
        }
        this.C = 0;
        this.g.removeCallbacks(this.k);
        this.E.getClass();
        yg ygVar2 = this.E;
        int i5 = ygVar2.a;
        int i6 = ygVar2.b;
        kg kgVar2 = this.z;
        if (i5 < kgVar2.b && (i = (b = kgVar2.b(i5)).b) != -1 && i6 < i && b.f[i6] == 4) {
            return;
        }
        kg kgVar3 = this.z;
        int i7 = i5 - kgVar3.e;
        hg[] hgVarArr3 = kgVar3.f;
        hg[] hgVarArr4 = (hg[]) nik.V(hgVarArr3, hgVarArr3.length);
        hgVarArr4[i7] = hgVarArr4[i7].d(3, i6);
        Object obj = kgVar3.a;
        long j = kgVar3.c;
        long j2 = kgVar3.d;
        int i8 = kgVar3.e;
        kg kgVar4 = new kg(obj, hgVarArr4, j, j2, i8);
        if (j != 0) {
            kgVar4 = new kg(obj, hgVarArr4, 0L, j2, i8);
        }
        this.z = kgVar4;
        x();
        if (this.G) {
            return;
        }
        this.D = null;
        this.E = null;
    }

    public final void x() {
        ArrayList arrayList = this.i;
        for (int i = 0; i < arrayList.size(); i++) {
            vk vkVar = (vk) arrayList.get(i);
            kg kgVar = this.z;
            if (!vkVar.b) {
                vkVar.a.post(new r0(4, vkVar, kgVar));
            }
        }
    }

    public final void y() {
        rqk d = d();
        this.a.getClass();
        dg dgVar = this.D;
        dgVar.getClass();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                Handler handler = this.g;
                xg xgVar = this.k;
                handler.removeCallbacks(xgVar);
                handler.postDelayed(xgVar, 200L);
                return;
            }
            qyo qyoVar = (qyo) ((bpk) arrayList.get(i));
            qyoVar.getClass();
            if (d != null && d.b > 0) {
                HashSet hashSet = qyoVar.a;
                if (!hashSet.contains(dgVar) && d.a > 0) {
                    qyoVar.a(JavaScriptMessage$MsgType.start, dgVar, null);
                    hashSet.add(dgVar);
                }
                qyoVar.a(JavaScriptMessage$MsgType.timeupdate, dgVar, TimeUpdateData.create(d));
            }
            i++;
        }
    }
}
