package defpackage;

import android.net.Uri;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hr4 implements qcc {
    public static final /* synthetic */ int l = 0;
    public final p03 a;
    public final oe4 b;
    public zic c;
    public rk d;
    public bh e;
    public final long f;
    public final long g;
    public final long h;
    public final float i;
    public final float j;
    public boolean k;

    public hr4(oe4 oe4Var, hp4 hp4Var) {
        zic zicVar = new zic(21);
        this.b = oe4Var;
        this.c = zicVar;
        p03 p03Var = new p03(hp4Var, zicVar);
        this.a = p03Var;
        if (oe4Var != ((oe4) p03Var.d)) {
            p03Var.d = oe4Var;
            ((HashMap) p03Var.f).clear();
            ((HashMap) p03Var.c).clear();
        }
        this.f = C.TIME_UNSET;
        this.g = C.TIME_UNSET;
        this.h = C.TIME_UNSET;
        this.i = -3.4028235E38f;
        this.j = -3.4028235E38f;
        this.k = true;
    }

    public static qcc e(Class cls, oe4 oe4Var) {
        try {
            return (qcc) cls.getConstructor(oe4.class).newInstance(oe4Var);
        } catch (Exception e) {
            yhk.q(e);
            return null;
        }
    }

    @Override // defpackage.qcc
    public final vcc a(h6c h6cVar) {
        h6cVar.b.getClass();
        String scheme = h6cVar.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(h6cVar.b.b, "application/x-image-uri");
        v5c v5cVar = h6cVar.b;
        if (equals) {
            long j = v5cVar.h;
            String str = nik.a;
            throw null;
        }
        int L = nik.L(v5cVar.a, v5cVar.b);
        if (h6cVar.b.h != C.TIME_UNSET) {
            hp4 hp4Var = (hp4) this.a.b;
            synchronized (hp4Var) {
                hp4Var.c = 1;
            }
            hp4 hp4Var2 = (hp4) this.a.b;
            synchronized (hp4Var2) {
                hp4Var2.d = 1;
            }
        }
        try {
            p03 p03Var = this.a;
            HashMap hashMap = (HashMap) p03Var.c;
            qcc qccVar = (qcc) hashMap.get(Integer.valueOf(L));
            if (qccVar == null) {
                qccVar = (qcc) p03Var.p(L).get();
                qccVar.c((zic) p03Var.e);
                qccVar.b();
                qccVar.d();
                hashMap.put(Integer.valueOf(L), qccVar);
            }
            s5c a = h6cVar.c.a();
            u5c u5cVar = h6cVar.c;
            if (u5cVar.a == C.TIME_UNSET) {
                a.a = this.f;
            }
            if (u5cVar.d == -3.4028235E38f) {
                a.d = this.i;
            }
            if (u5cVar.e == -3.4028235E38f) {
                a.e = this.j;
            }
            if (u5cVar.b == C.TIME_UNSET) {
                a.b = this.g;
            }
            if (u5cVar.c == C.TIME_UNSET) {
                a.c = this.h;
            }
            u5c u5cVar2 = new u5c(a);
            if (!u5cVar2.equals(h6cVar.c)) {
                h5c a2 = h6cVar.a();
                a2.l = u5cVar2.a();
                h6cVar = a2.a();
            }
            vcc a3 = qccVar.a(h6cVar);
            hv9 hv9Var = h6cVar.b.g;
            if (!hv9Var.isEmpty()) {
                vcc[] vccVarArr = new vcc[hv9Var.size() + 1];
                vccVarArr[0] = a3;
                if (hv9Var.size() > 0) {
                    if (!this.k) {
                        this.b.getClass();
                        c6c c6cVar = (c6c) hv9Var.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        new p5c(0);
                        List list = Collections.EMPTY_LIST;
                        av9 av9Var = hv9.b;
                        vvf vvfVar = vvf.e;
                        z5c z5cVar = z5c.a;
                        Uri uri = Uri.EMPTY;
                        c6cVar.getClass();
                        throw null;
                    }
                    qm8 qm8Var = new qm8();
                    ((c6c) hv9Var.get(0)).getClass();
                    ArrayList arrayList = sjc.a;
                    qm8Var.n = null;
                    ((c6c) hv9Var.get(0)).getClass();
                    qm8Var.d = null;
                    ((c6c) hv9Var.get(0)).getClass();
                    qm8Var.e = 0;
                    ((c6c) hv9Var.get(0)).getClass();
                    qm8Var.f = 0;
                    ((c6c) hv9Var.get(0)).getClass();
                    qm8Var.b = null;
                    ((c6c) hv9Var.get(0)).getClass();
                    qm8Var.a = null;
                    b bVar = new b(qm8Var);
                    if (this.c.i(bVar)) {
                        qm8 a4 = bVar.a();
                        a4.n = sjc.p("application/x-media3-cues");
                        a4.j = bVar.o;
                        a4.L = this.c.f(bVar);
                        new b(a4);
                    }
                    ((c6c) hv9Var.get(0)).getClass();
                    throw null;
                }
                a3 = new qgc(vccVarArr);
            }
            m5c m5cVar = h6cVar.e;
            if (m5cVar.a != Long.MIN_VALUE) {
                oy2 oy2Var = new oy2(a3);
                z1a.E(!oy2Var.d);
                long j2 = m5cVar.a;
                z1a.E(!oy2Var.d);
                oy2Var.b = j2;
                z1a.E(!oy2Var.d);
                oy2Var.c = true;
                z1a.E(!oy2Var.d);
                z1a.E(!oy2Var.d);
                z1a.E(!oy2Var.d);
                z1a.E(!oy2Var.d);
                oy2Var.d = true;
                a3 = new uy2(oy2Var);
            }
            vcc vccVar = a3;
            h6cVar.b.getClass();
            v5c v5cVar2 = h6cVar.b;
            g5c g5cVar = v5cVar2.d;
            if (g5cVar == null) {
                return vccVar;
            }
            Uri uri2 = g5cVar.a;
            rk rkVar = this.d;
            bh bhVar = this.e;
            if (rkVar == null || bhVar == null) {
                tgj.d0("Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return vccVar;
            }
            hr9 c = rkVar.c();
            if (c == null) {
                tgj.d0("Playing media without ads, as no AdsLoader was provided.");
                return vccVar;
            }
            xe4 xe4Var = new xe4(uri2);
            Object[] objArr = {h6cVar.a, v5cVar2.a, uri2};
            qha.p(3, objArr);
            return new wk(vccVar, xe4Var, hv9.r(3, objArr), this, c, bhVar);
        } catch (ClassNotFoundException e) {
            yhk.q(e);
            return null;
        }
    }

    @Override // defpackage.qcc
    public final void b() {
        this.k = true;
        p03 p03Var = this.a;
        p03Var.getClass();
        synchronized (((hp4) p03Var.b)) {
        }
        Iterator it = ((HashMap) p03Var.c).values().iterator();
        while (it.hasNext()) {
            ((qcc) it.next()).b();
        }
    }

    @Override // defpackage.qcc
    public final void c(zic zicVar) {
        this.c = zicVar;
        p03 p03Var = this.a;
        p03Var.e = zicVar;
        hp4 hp4Var = (hp4) p03Var.b;
        synchronized (hp4Var) {
            hp4Var.b = zicVar;
        }
        Iterator it = ((HashMap) p03Var.c).values().iterator();
        while (it.hasNext()) {
            ((qcc) it.next()).c(zicVar);
        }
    }

    @Override // defpackage.qcc
    public final void d() {
        p03 p03Var = this.a;
        p03Var.getClass();
        synchronized (((hp4) p03Var.b)) {
        }
    }

    @Override // defpackage.qcc
    public final int[] getSupportedTypes() {
        p03 p03Var = this.a;
        p03Var.getClass();
        try {
            p03Var.p(0);
        } catch (ClassNotFoundException unused) {
        }
        try {
            p03Var.p(1);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            p03Var.p(2);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            p03Var.p(3);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            p03Var.p(4);
        } catch (ClassNotFoundException unused5) {
        }
        return jaa.O(((HashMap) p03Var.f).keySet());
    }

    public hr4(oe4 oe4Var) {
        this(oe4Var, new hp4());
    }
}
