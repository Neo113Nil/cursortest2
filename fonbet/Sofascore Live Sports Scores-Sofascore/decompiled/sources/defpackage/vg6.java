package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.ironsource.U3;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vg6 extends g51 implements ExoPlayer {
    public static final /* synthetic */ int r0 = 0;
    public final r0a A;
    public final long B;
    public final jy0 C;
    public final c40 D;
    public final tg6 E;
    public final fp4 F;
    public final fp4 G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public vv9 N;
    public final vvg O;
    public yfh P;
    public boolean Q;
    public ske R;
    public q6c S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public nxh W;
    public boolean X;
    public TextureView Y;
    public final int Z;
    public ijh a0;
    public final gtj b;
    public final an0 b0;
    public final ske c;
    public float c0;
    public final yh3 d;
    public boolean d0;
    public final Context e;
    public o74 e0;
    public final vg6 f;
    public final boolean f0;
    public final n51[] g;
    public boolean g0;
    public final n51[] h;
    public final int h0;
    public final iu4 i;
    public boolean i0;
    public final zqi j;
    public zqk j0;
    public final eg6 k;
    public final long k0;
    public final ih6 l;
    public final long l0;
    public final vdb m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public q6c n0;
    public final iij o;
    public fke o0;
    public final ArrayList p;
    public int p0;
    public final boolean q;
    public long q0;
    public final qcc r;
    public final cn4 s;
    public final Looper t;
    public final tn4 u;
    public final tqi v;
    public final mg6 w;
    public final og6 x;
    public final en0 y;
    public final ge6 z;

    static {
        i6c.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vg6(wf6 wf6Var) {
        Handler.Callback callback;
        Context context = wf6Var.a;
        Looper looper = wf6Var.g;
        Integer num = 0;
        this.d = new yh3(0);
        try {
            tgj.O("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + nik.a + U3.j.e);
            tqi tqiVar = tqi.a;
            this.e = context.getApplicationContext();
            this.s = new cn4(tqiVar);
            this.h0 = -1000;
            this.b0 = an0.b;
            boolean z = true;
            this.Z = 1;
            this.d0 = false;
            this.B = 2000L;
            mg6 mg6Var = new mg6(this);
            this.w = mg6Var;
            this.x = new og6();
            n51[] a = ((zr4) wf6Var.b.get()).a(new Handler(looper), mg6Var, mg6Var, mg6Var, mg6Var);
            this.g = a;
            z1a.E(a.length > 0);
            this.h = new n51[a.length];
            int i = 0;
            while (true) {
                n51[] n51VarArr = this.h;
                if (i >= n51VarArr.length) {
                    break;
                }
                int i2 = this.g[i].b;
                n51VarArr[i] = null;
                i++;
            }
            iu4 iu4Var = (iu4) wf6Var.d.get();
            this.i = iu4Var;
            this.r = (qcc) wf6Var.c.get();
            tn4 tn4Var = (tn4) wf6Var.f.get();
            this.u = tn4Var;
            this.q = true;
            d0h d0hVar = wf6Var.i;
            this.k0 = wf6Var.k;
            this.l0 = wf6Var.l;
            this.m0 = Ua.C;
            this.O = wf6Var.j;
            this.Q = false;
            this.t = looper;
            this.v = tqiVar;
            this.f = this;
            this.m = new vdb(looper, new eg6(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.n = copyOnWriteArraySet;
            this.p = new ArrayList();
            this.P = new yfh();
            n51[] n51VarArr2 = this.g;
            gtj gtjVar = new gtj(new syf[n51VarArr2.length], new nh6[n51VarArr2.length], uuj.b, (Object) null);
            this.b = gtjVar;
            this.o = new iij();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i3 = 0;
            while (i3 < length) {
                boolean z2 = z;
                int i4 = iArr[i3];
                z1a.E(!false);
                sparseBooleanArray.append(i4, z2);
                i3++;
                num = num;
                z = true;
            }
            Integer num2 = num;
            z1a.E(!false);
            sparseBooleanArray.append(29, true);
            z1a.E(!false);
            j78 j78Var = new j78(sparseBooleanArray);
            this.c = new ske(j78Var);
            h78 h78Var = new h78(1);
            h78Var.b(j78Var);
            h78Var.a(4);
            h78Var.a(10);
            this.R = new ske(h78Var.d());
            this.j = tqiVar.a(looper, null);
            eg6 eg6Var = new eg6(this);
            this.k = eg6Var;
            this.o0 = fke.k(gtjVar);
            this.s.r(this, looper);
            cse cseVar = new cse("");
            ih6 ih6Var = new ih6(this.e, this.g, this.h, iu4Var, gtjVar, (yq4) wf6Var.e.get(), tn4Var, this.H, this.I, this.s, d0hVar, wf6Var.m, this.Q, looper, eg6Var, cseVar, this.x);
            Looper looper2 = ih6Var.j;
            zqi zqiVar = ih6Var.h;
            this.l = ih6Var;
            this.c0 = 1.0f;
            this.H = 0;
            q6c q6cVar = q6c.D;
            this.S = q6cVar;
            this.n0 = q6cVar;
            this.p0 = -1;
            this.e0 = o74.c;
            this.f0 = true;
            s(this.s);
            Handler handler = new Handler(looper);
            cn4 cn4Var = this.s;
            cn4Var.getClass();
            sz8 sz8Var = tn4Var.c;
            sz8Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) sz8Var.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                hz0 hz0Var = (hz0) it.next();
                if (hz0Var.b == cn4Var) {
                    hz0Var.c = true;
                    copyOnWriteArrayList.remove(hz0Var);
                }
            }
            copyOnWriteArrayList.add(new hz0(handler, cn4Var));
            copyOnWriteArraySet.add(this.w);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                callback = null;
                tqiVar.a(looper2, null).e(new p3(21, this.e, this, cseVar));
            } else {
                callback = null;
            }
            eg6 eg6Var2 = new eg6(this);
            jy0 jy0Var = new jy0();
            jy0Var.b = new zqi(new Handler(looper2, callback));
            jy0Var.c = new zqi(new Handler(looper, callback));
            jy0Var.e = num2;
            jy0Var.f = num2;
            jy0Var.d = eg6Var2;
            this.C = jy0Var;
            jy0Var.e(new wb3(this, 20));
            en0 en0Var = new en0(context, looper2, looper, this.w);
            this.y = en0Var;
            en0Var.v(wf6Var.h);
            boolean z3 = (wf6Var.n == Integer.MAX_VALUE || wf6Var.o == Integer.MAX_VALUE) ? false : true;
            ge6 ge6Var = new ge6(context, looper2);
            this.z = ge6Var;
            if (ge6Var.a != z3) {
                ge6Var.a = z3;
                ge6Var.e(z3, ge6Var.b);
            }
            this.A = new r0a(context, looper2);
            int i6 = x05.e;
            this.j0 = zqk.d;
            this.a0 = ijh.c;
            this.E = i5 >= 34 ? new tg6(this, context) : callback;
            this.F = new fp4(15);
            this.G = new fp4(15);
            this.D = new c40(this, this.w, this.v, wf6Var.n, wf6Var.o);
            zqiVar.c(38, this.O).b();
            an0 an0Var = this.b0;
            xqi d = zqi.d();
            d.a = zqiVar.a.obtainMessage(31, 0, 0, an0Var);
            d.b();
            Z(1, 3, this.b0);
            Z(2, 4, Integer.valueOf(this.Z));
            Z(2, 5, num2);
            Z(1, 9, Boolean.valueOf(this.d0));
            Z(6, 8, this.x);
            Z(-1, 16, Integer.valueOf(this.h0));
            this.d.c();
        } catch (Throwable th) {
            this.d.c();
            throw th;
        }
    }

    public static long T(fke fkeVar) {
        kij kijVar = new kij();
        iij iijVar = new iij();
        fkeVar.a.g(fkeVar.b.a, iijVar);
        long j = fkeVar.c;
        return j == C.TIME_UNSET ? fkeVar.a.m(iijVar.c, kijVar, 0L).k : iijVar.e + j;
    }

    public static fke U(fke fkeVar, int i) {
        fke h = fkeVar.h(i);
        return (i == 1 || i == 4) ? h.b(false) : h;
    }

    @Override // defpackage.g51, defpackage.ale
    public final long A() {
        j0();
        if (this.o0.a.p()) {
            return this.q0;
        }
        fke fkeVar = this.o0;
        if (fkeVar.k.d != fkeVar.b.d) {
            return nik.h0(fkeVar.a.m(y(), this.a, 0L).l);
        }
        long j = fkeVar.q;
        if (this.o0.k.b()) {
            fke fkeVar2 = this.o0;
            iij g = fkeVar2.a.g(fkeVar2.k.a, this.o);
            long b = g.b(this.o0.k.b);
            j = b == Long.MIN_VALUE ? g.d : b;
        }
        fke fkeVar3 = this.o0;
        mij mijVar = fkeVar3.a;
        Object obj = fkeVar3.k.a;
        iij iijVar = this.o;
        mijVar.g(obj, iijVar);
        return nik.h0(j + iijVar.e);
    }

    @Override // defpackage.ale
    public final q6c D() {
        j0();
        return this.S;
    }

    @Override // defpackage.ale
    public final long E() {
        j0();
        return this.k0;
    }

    @Override // defpackage.g51
    public final void L(long j, int i, boolean z) {
        j0();
        if (i == -1) {
            return;
        }
        z1a.s(i >= 0);
        mij mijVar = this.o0.a;
        if (mijVar.p() || i < mijVar.o()) {
            cn4 cn4Var = this.s;
            if (!cn4Var.i) {
                qv l = cn4Var.l();
                cn4Var.i = true;
                cn4Var.q(l, -1, new eg4(18));
            }
            this.J++;
            int i2 = 3;
            if (isPlayingAd()) {
                tgj.d0("seekTo ignored because an ad is playing");
                w2d w2dVar = new w2d(this.o0);
                w2dVar.c(1);
                vg6 vg6Var = this.k.a;
                vg6Var.j.e(new yq5(i2, vg6Var, w2dVar));
                return;
            }
            fke fkeVar = this.o0;
            int i3 = fkeVar.e;
            if (i3 == 3 || (i3 == 4 && !mijVar.p())) {
                fkeVar = this.o0.h(2);
            }
            int y = y();
            fke V = V(fkeVar, mijVar, W(mijVar, i, j));
            this.l.h.c(3, new gh6(mijVar, i, nik.T(j))).b();
            h0(V, 0, true, 1, R(V), y, z);
        }
    }

    public final q6c N() {
        mij currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.n0;
        }
        h6c h6cVar = currentTimeline.m(y(), this.a, 0L).b;
        o6c a = this.n0.a();
        q6c q6cVar = h6cVar.d;
        if (q6cVar != null) {
            hv9 hv9Var = q6cVar.C;
            byte[] bArr = q6cVar.g;
            CharSequence charSequence = q6cVar.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = q6cVar.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = q6cVar.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = q6cVar.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            String str = q6cVar.e;
            if (str != null) {
                a.e = str;
            }
            CharSequence charSequence5 = q6cVar.f;
            if (charSequence5 != null) {
                a.f = charSequence5;
            }
            Uri uri = q6cVar.i;
            if (uri != null || bArr != null) {
                a.i = uri;
                Integer num = q6cVar.h;
                a.g = bArr == null ? null : (byte[]) bArr.clone();
                a.h = num;
            }
            Integer num2 = q6cVar.j;
            if (num2 != null) {
                a.j = num2;
            }
            Integer num3 = q6cVar.k;
            if (num3 != null) {
                a.k = num3;
            }
            Integer num4 = q6cVar.l;
            if (num4 != null) {
                a.l = num4;
            }
            Boolean bool = q6cVar.m;
            if (bool != null) {
                a.m = bool;
            }
            Integer num5 = q6cVar.n;
            if (num5 != null) {
                a.n = num5;
            }
            Integer num6 = q6cVar.o;
            if (num6 != null) {
                a.n = num6;
            }
            Integer num7 = q6cVar.p;
            if (num7 != null) {
                a.o = num7;
            }
            Integer num8 = q6cVar.q;
            if (num8 != null) {
                a.p = num8;
            }
            Integer num9 = q6cVar.r;
            if (num9 != null) {
                a.q = num9;
            }
            Integer num10 = q6cVar.s;
            if (num10 != null) {
                a.r = num10;
            }
            Integer num11 = q6cVar.t;
            if (num11 != null) {
                a.s = num11;
            }
            CharSequence charSequence6 = q6cVar.u;
            if (charSequence6 != null) {
                a.t = charSequence6;
            }
            CharSequence charSequence7 = q6cVar.v;
            if (charSequence7 != null) {
                a.u = charSequence7;
            }
            CharSequence charSequence8 = q6cVar.w;
            if (charSequence8 != null) {
                a.v = charSequence8;
            }
            Integer num12 = q6cVar.x;
            if (num12 != null) {
                a.w = num12;
            }
            Integer num13 = q6cVar.y;
            if (num13 != null) {
                a.x = num13;
            }
            CharSequence charSequence9 = q6cVar.z;
            if (charSequence9 != null) {
                a.y = charSequence9;
            }
            CharSequence charSequence10 = q6cVar.A;
            if (charSequence10 != null) {
                a.z = charSequence10;
            }
            Integer num14 = q6cVar.B;
            if (num14 != null) {
                a.A = num14;
            }
            if (!hv9Var.isEmpty()) {
                a.B = hv9.v(hv9Var);
            }
        }
        return new q6c(a);
    }

    public final void O() {
        j0();
        Y();
        c0(null);
        X(0, 0);
    }

    public final lte P(jte jteVar) {
        int S = S(this.o0);
        mij mijVar = this.o0.a;
        if (S == -1) {
            S = 0;
        }
        ih6 ih6Var = this.l;
        return new lte(ih6Var, jteVar, mijVar, S, ih6Var.j);
    }

    public final long Q(fke fkeVar) {
        scc sccVar = fkeVar.b;
        long j = fkeVar.c;
        mij mijVar = fkeVar.a;
        if (!sccVar.b()) {
            return nik.h0(R(fkeVar));
        }
        Object obj = fkeVar.b.a;
        iij iijVar = this.o;
        mijVar.g(obj, iijVar);
        if (j == C.TIME_UNSET) {
            return nik.h0(mijVar.m(S(fkeVar), this.a, 0L).k);
        }
        return nik.h0(j) + nik.h0(iijVar.e);
    }

    public final long R(fke fkeVar) {
        if (fkeVar.a.p()) {
            return nik.T(this.q0);
        }
        long l = fkeVar.p ? fkeVar.l() : fkeVar.s;
        if (fkeVar.b.b()) {
            return l;
        }
        mij mijVar = fkeVar.a;
        Object obj = fkeVar.b.a;
        iij iijVar = this.o;
        mijVar.g(obj, iijVar);
        return l + iijVar.e;
    }

    public final int S(fke fkeVar) {
        return fkeVar.a.p() ? this.p0 : fkeVar.a.g(fkeVar.b.a, this.o).c;
    }

    public final fke V(fke fkeVar, mij mijVar, Pair pair) {
        List list;
        z1a.s(mijVar.p() || pair != null);
        mij mijVar2 = fkeVar.a;
        long Q = Q(fkeVar);
        fke j = fkeVar.j(mijVar);
        if (mijVar.p()) {
            scc sccVar = fke.u;
            long T = nik.T(this.q0);
            qsj qsjVar = qsj.d;
            gtj gtjVar = this.b;
            av9 av9Var = hv9.b;
            fke c = j.d(sccVar, T, T, T, 0L, qsjVar, gtjVar, vvf.e).c(sccVar);
            c.q = c.s;
            return c;
        }
        Object obj = j.b.a;
        String str = nik.a;
        boolean equals = obj.equals(pair.first);
        scc sccVar2 = !equals ? new scc(pair.first) : j.b;
        long longValue = ((Long) pair.second).longValue();
        long T2 = nik.T(Q);
        if (!mijVar2.p()) {
            T2 -= mijVar2.g(obj, this.o).e;
            if (equals && T2 - longValue == 1 && T2 == mijVar2.g(obj, this.o).d) {
                T2--;
            }
        }
        if (!equals || longValue < T2) {
            scc sccVar3 = sccVar2;
            z1a.E(!sccVar3.b());
            qsj qsjVar2 = !equals ? qsj.d : j.h;
            gtj gtjVar2 = !equals ? this.b : j.i;
            if (equals) {
                list = j.j;
            } else {
                av9 av9Var2 = hv9.b;
                list = vvf.e;
            }
            fke c2 = j.d(sccVar3, longValue, longValue, longValue, 0L, qsjVar2, gtjVar2, list).c(sccVar3);
            c2.q = longValue;
            return c2;
        }
        if (longValue != T2) {
            scc sccVar4 = sccVar2;
            z1a.E(!sccVar4.b());
            long max = Math.max(0L, j.r - (longValue - T2));
            long j2 = j.q;
            if (j.k.equals(j.b)) {
                j2 = longValue + max;
            }
            fke d = j.d(sccVar4, longValue, longValue, longValue, max, j.h, j.i, j.j);
            d.q = j2;
            return d;
        }
        int b = mijVar.b(j.k.a);
        if (b != -1 && mijVar.f(b, this.o, false).c == mijVar.g(sccVar2.a, this.o).c) {
            return j;
        }
        mijVar.g(sccVar2.a, this.o);
        boolean b2 = sccVar2.b();
        iij iijVar = this.o;
        long a = b2 ? iijVar.a(sccVar2.b, sccVar2.c) : iijVar.d;
        scc sccVar5 = sccVar2;
        fke c3 = j.d(sccVar5, j.s, j.s, j.d, a - j.s, j.h, j.i, j.j).c(sccVar5);
        c3.q = a;
        return c3;
    }

    public final Pair W(mij mijVar, int i, long j) {
        if (mijVar.p()) {
            this.p0 = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.q0 = j;
            return null;
        }
        kij kijVar = this.a;
        if (i == -1 || i >= mijVar.o()) {
            i = mijVar.a(this.I);
            j = nik.h0(mijVar.m(i, kijVar, 0L).k);
        }
        return mijVar.i(kijVar, this.o, i, nik.T(j));
    }

    public final void X(int i, int i2) {
        ijh ijhVar = this.a0;
        if (i == ijhVar.a && i2 == ijhVar.b) {
            return;
        }
        this.a0 = new ijh(i, i2);
        this.m.g(24, new cg6(i, i2, 0));
        Z(2, 14, new ijh(i, i2));
    }

    public final void Y() {
        nxh nxhVar = this.W;
        mg6 mg6Var = this.w;
        if (nxhVar != null) {
            lte P = P(this.x);
            z1a.E(!P.f);
            P.c = 10000;
            z1a.E(!P.f);
            P.d = null;
            P.b();
            this.W.a.remove(mg6Var);
            this.W = null;
        }
        TextureView textureView = this.Y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != mg6Var) {
                tgj.d0("SurfaceTextureListener already unset or replaced.");
            } else {
                this.Y.setSurfaceTextureListener(null);
            }
            this.Y = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(mg6Var);
            this.V = null;
        }
    }

    public final void Z(int i, int i2, Object obj) {
        for (n51 n51Var : this.g) {
            if (i == -1 || n51Var.b == i) {
                lte P = P(n51Var);
                z1a.E(!P.f);
                P.c = i2;
                z1a.E(!P.f);
                P.d = obj;
                P.b();
            }
        }
        for (n51 n51Var2 : this.h) {
            if (n51Var2 != null && (i == -1 || n51Var2.b == i)) {
                lte P2 = P(n51Var2);
                z1a.E(!P2.f);
                P2.c = i2;
                z1a.E(!P2.f);
                P2.d = obj;
                P2.b();
            }
        }
    }

    @Override // defpackage.ale
    public final void a() {
        j0();
        fke fkeVar = this.o0;
        if (fkeVar.e != 1) {
            return;
        }
        fke f = fkeVar.f(null);
        fke U = U(f, f.a.p() ? 4 : 2);
        this.J++;
        this.l.h.a(29).b();
        h0(U, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(List list, boolean z, long j, int i) {
        long j2;
        int i2;
        int i3;
        int i4 = i;
        int S = S(this.o0);
        long currentPosition = getCurrentPosition();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sdc sdcVar = new sdc((vcc) list.get(i5), this.q);
            arrayList2.add(sdcVar);
            arrayList.add(i5, new qg6(sdcVar.b, sdcVar.a));
        }
        yfh yfhVar = this.P;
        int size = arrayList2.size();
        yfhVar.getClass();
        this.P = new yfh(new Random(yfhVar.a.nextLong())).a(size);
        sye syeVar = new sye(arrayList, this.P);
        boolean p = syeVar.p();
        int i6 = syeVar.d;
        if (!p && i4 >= i6) {
            throw new kx2(3);
        }
        if (z) {
            i4 = syeVar.a(this.I);
            j2 = C.TIME_UNSET;
        } else {
            if (i4 == -1) {
                i2 = S;
                j2 = currentPosition;
                fke V = V(this.o0, syeVar, W(syeVar, i2, j2));
                i3 = V.e;
                if (i3 != 1) {
                    i3 = 1;
                } else {
                    if (!syeVar.p()) {
                        if (i2 != -1) {
                            if (i2 < i6) {
                                i3 = 2;
                            }
                        }
                    }
                    i3 = 4;
                }
                fke U = U(V, i3);
                this.l.h.c(17, new bh6(arrayList2, this.P, i2, nik.T(j2))).b();
                h0(U, 0, this.o0.b.a.equals(U.b.a) && !this.o0.a.p(), 4, R(U), -1, false);
            }
            j2 = j;
        }
        i2 = i4;
        fke V2 = V(this.o0, syeVar, W(syeVar, i2, j2));
        i3 = V2.e;
        if (i3 != 1) {
        }
        fke U2 = U(V2, i3);
        this.l.h.c(17, new bh6(arrayList2, this.P, i2, nik.T(j2))).b();
        h0(U2, 0, this.o0.b.a.equals(U2.b.a) && !this.o0.a.p(), 4, R(U2), -1, false);
    }

    @Override // defpackage.ale
    public final void b(hke hkeVar) {
        j0();
        if (this.o0.o.equals(hkeVar)) {
            return;
        }
        fke g = this.o0.g(hkeVar);
        this.J++;
        this.l.h.c(4, hkeVar).b();
        h0(g, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void b0(SurfaceHolder surfaceHolder) {
        this.X = false;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = this.V.getSurface();
        if (surface == null || !surface.isValid()) {
            X(0, 0);
        } else {
            Rect surfaceFrame = this.V.getSurfaceFrame();
            X(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.ale
    public final long c() {
        j0();
        return nik.h0(this.o0.r);
    }

    public final void c0(Object obj) {
        Object obj2 = this.T;
        boolean z = true;
        boolean z2 = (obj2 == null || obj2 == obj) ? false : true;
        long j = z2 ? this.B : -9223372036854775807L;
        ih6 ih6Var = this.l;
        if (!ih6Var.I && ih6Var.j.getThread().isAlive()) {
            yh3 yh3Var = new yh3(0);
            ih6Var.h.c(30, new Pair(obj, yh3Var)).b();
            if (j != C.TIME_UNSET) {
                z = yh3Var.b(j);
            }
        }
        if (z2) {
            Object obj3 = this.T;
            Surface surface = this.U;
            if (obj3 == surface) {
                surface.release();
                this.U = null;
            }
        }
        this.T = obj;
        if (z) {
            return;
        }
        e0(new tf6(2, new fb3("Detaching surface timed out.", 5), 1003));
    }

    @Override // defpackage.ale
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        j0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        j0();
        if (holder == null || holder != this.V) {
            return;
        }
        O();
    }

    @Override // defpackage.ale
    public final void clearVideoTextureView(TextureView textureView) {
        j0();
        if (textureView == null || textureView != this.Y) {
            return;
        }
        O();
    }

    public final void d0(Surface surface) {
        j0();
        Y();
        c0(surface);
        int i = surface == null ? 0 : -1;
        X(i, i);
    }

    public final void e0(tf6 tf6Var) {
        fke fkeVar = this.o0;
        fke c = fkeVar.c(fkeVar.b);
        c.q = c.s;
        c.r = 0L;
        fke U = U(c, 1);
        if (tf6Var != null) {
            U = U.f(tf6Var);
        }
        this.J++;
        this.l.h.a(6).b();
        h0(U, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // defpackage.ale
    public final void f(etj etjVar) {
        etj etjVar2;
        j0();
        iu4 iu4Var = this.i;
        iu4Var.getClass();
        etj o = o();
        if (this.M) {
            this.N = etjVar.w;
            vv9 vv9Var = this.O.a;
            ctj a = etjVar.a();
            cck it = vv9Var.iterator();
            while (it.hasNext()) {
                a.i(((Integer) it.next()).intValue(), true);
            }
            etjVar2 = a.a();
        } else {
            etjVar2 = etjVar;
        }
        if (!etjVar2.equals(iu4Var.h())) {
            iu4Var.n(etjVar2);
        }
        if (o.equals(etjVar)) {
            return;
        }
        this.m.g(19, new gg6(etjVar, 0));
    }

    public final void f0() {
        ske skeVar = this.R;
        ske u = nik.u(this.f, this.c);
        this.R = u;
        if (u.equals(skeVar)) {
            return;
        }
        this.m.c(13, new eg6(this));
    }

    public final void g0(int i, boolean z) {
        int i2 = this.M ? 4 : (this.o0.n != 1 || z) ? 0 : 1;
        fke fkeVar = this.o0;
        if (fkeVar.l == z && fkeVar.n == i2 && fkeVar.m == i) {
            return;
        }
        this.J++;
        if (fkeVar.p) {
            fkeVar = fkeVar.a();
        }
        fke e = fkeVar.e(i, i2, z);
        this.l.h.b(1, z ? 1 : 0, i | (i2 << 4)).b();
        h0(e, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // defpackage.g51, defpackage.ale
    public final long getBufferedPosition() {
        j0();
        if (!isPlayingAd()) {
            return A();
        }
        fke fkeVar = this.o0;
        return fkeVar.k.equals(fkeVar.b) ? nik.h0(this.o0.q) : getDuration();
    }

    @Override // defpackage.g51, defpackage.ale
    public final long getContentPosition() {
        j0();
        return Q(this.o0);
    }

    @Override // defpackage.ale
    public final int getCurrentAdGroupIndex() {
        j0();
        if (isPlayingAd()) {
            return this.o0.b.b;
        }
        return -1;
    }

    @Override // defpackage.ale
    public final int getCurrentAdIndexInAdGroup() {
        j0();
        if (isPlayingAd()) {
            return this.o0.b.c;
        }
        return -1;
    }

    @Override // defpackage.g51, defpackage.ale
    public final int getCurrentPeriodIndex() {
        j0();
        if (!this.o0.a.p()) {
            fke fkeVar = this.o0;
            return fkeVar.a.b(fkeVar.b.a);
        }
        int i = this.p0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.ale
    public final long getCurrentPosition() {
        j0();
        return nik.h0(R(this.o0));
    }

    @Override // defpackage.ale
    public final mij getCurrentTimeline() {
        j0();
        return this.o0.a;
    }

    @Override // defpackage.g51, defpackage.ale
    public final long getDuration() {
        j0();
        if (!isPlayingAd()) {
            return u();
        }
        fke fkeVar = this.o0;
        scc sccVar = fkeVar.b;
        mij mijVar = fkeVar.a;
        Object obj = sccVar.a;
        iij iijVar = this.o;
        mijVar.g(obj, iijVar);
        return nik.h0(iijVar.a(sccVar.b, sccVar.c));
    }

    @Override // defpackage.ale
    public final boolean getPlayWhenReady() {
        j0();
        return this.o0.l;
    }

    @Override // defpackage.ale
    public final hke getPlaybackParameters() {
        j0();
        return this.o0.o;
    }

    @Override // defpackage.ale
    public final int getPlaybackState() {
        j0();
        return this.o0.e;
    }

    @Override // defpackage.ale
    public final int getRepeatMode() {
        j0();
        return this.H;
    }

    @Override // defpackage.ale
    public final boolean getShuffleModeEnabled() {
        j0();
        return this.I;
    }

    @Override // defpackage.ale
    public final float getVolume() {
        j0();
        return this.c0;
    }

    @Override // defpackage.ale
    public final dke h() {
        j0();
        return this.o0.f;
    }

    public final void h0(final fke fkeVar, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        h6c h6cVar;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        Object obj;
        h6c h6cVar2;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long T;
        Object obj3;
        h6c h6cVar3;
        Object obj4;
        fke fkeVar2 = this.o0;
        this.o0 = fkeVar;
        boolean equals = fkeVar2.a.equals(fkeVar.a);
        kij kijVar = this.a;
        iij iijVar = this.o;
        mij mijVar = fkeVar2.a;
        scc sccVar = fkeVar2.b;
        mij mijVar2 = fkeVar.a;
        scc sccVar2 = fkeVar.b;
        int i8 = 2;
        if (mijVar2.p() && mijVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (mijVar2.p() != mijVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (mijVar.m(mijVar.g(sccVar.a, iijVar).c, kijVar, 0L).a.equals(mijVar2.m(mijVar2.g(sccVar2.a, iijVar).c, kijVar, 0L).a)) {
            pair = (z && i2 == 0 && sccVar.d < sccVar2.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (equals) {
                    zzl.s();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            h6cVar = !fkeVar.a.p() ? fkeVar.a.m(fkeVar.a.g(fkeVar.b.a, this.o).c, this.a, 0L).b : null;
            this.n0 = q6c.D;
        } else {
            h6cVar = null;
        }
        if (booleanValue || !fkeVar2.j.equals(fkeVar.j)) {
            o6c a = this.n0.a();
            List list = fkeVar.j;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ric ricVar = (ric) list.get(i9);
                int i10 = 0;
                while (true) {
                    lic[] licVarArr = ricVar.a;
                    if (i10 < licVarArr.length) {
                        licVarArr[i10].u(a);
                        i10++;
                    }
                }
            }
            this.n0 = new q6c(a);
        }
        q6c N = N();
        boolean equals2 = N.equals(this.S);
        this.S = N;
        boolean z6 = fkeVar2.l != fkeVar.l;
        boolean z7 = fkeVar2.e != fkeVar.e;
        if (z7 || z6) {
            i0();
        }
        boolean z8 = fkeVar2.g != fkeVar.g;
        if (!equals) {
            this.m.c(0, new tz1(fkeVar, i, 1));
        }
        if (z) {
            iij iijVar2 = new iij();
            if (fkeVar2.a.p()) {
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                i6 = i3;
                i7 = i6;
                obj = null;
                h6cVar2 = null;
                obj2 = null;
            } else {
                Object obj5 = fkeVar2.b.a;
                fkeVar2.a.g(obj5, iijVar2);
                int i11 = iijVar2.c;
                int b = fkeVar2.a.b(obj5);
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                obj = fkeVar2.a.m(i11, this.a, 0L).a;
                h6cVar2 = this.a.b;
                obj2 = obj5;
                i6 = i11;
                i7 = b;
            }
            scc sccVar3 = fkeVar2.b;
            if (i2 == 0) {
                boolean b2 = sccVar3.b();
                scc sccVar4 = fkeVar2.b;
                if (b2) {
                    j4 = iijVar2.a(sccVar4.b, sccVar4.c);
                    T = T(fkeVar2);
                } else if (sccVar4.e != -1) {
                    j4 = T(this.o0);
                    T = j4;
                } else {
                    j2 = iijVar2.e;
                    j3 = iijVar2.d;
                    j4 = j2 + j3;
                    T = j4;
                }
            } else if (sccVar3.b()) {
                j4 = fkeVar2.s;
                T = T(fkeVar2);
            } else {
                j2 = iijVar2.e;
                j3 = fkeVar2.s;
                j4 = j2 + j3;
                T = j4;
            }
            long h0 = nik.h0(j4);
            long h02 = nik.h0(T);
            scc sccVar5 = fkeVar2.b;
            yke ykeVar = new yke(obj, i6, h6cVar2, obj2, i7, h0, h02, sccVar5.b, sccVar5.c);
            kij kijVar2 = this.a;
            int y = y();
            int currentPeriodIndex = getCurrentPeriodIndex();
            if (this.o0.a.p()) {
                obj3 = null;
                h6cVar3 = null;
                obj4 = null;
            } else {
                fke fkeVar3 = this.o0;
                Object obj6 = fkeVar3.b.a;
                fkeVar3.a.g(obj6, this.o);
                currentPeriodIndex = this.o0.a.b(obj6);
                Object obj7 = this.o0.a.m(y, kijVar2, 0L).a;
                h6cVar3 = kijVar2.b;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i12 = currentPeriodIndex;
            long h03 = nik.h0(j);
            long h04 = this.o0.b.b() ? nik.h0(T(this.o0)) : h03;
            scc sccVar6 = this.o0.b;
            i5 = 1;
            this.m.c(11, new j01(i2, ykeVar, new yke(obj3, y, h6cVar3, obj4, i12, h03, h04, sccVar6.b, sccVar6.c), i5));
        } else {
            z3 = booleanValue;
            z4 = equals2;
            z5 = z7;
            i5 = 1;
        }
        if (z3) {
            this.m.c(i5, new tz1(h6cVar, intValue, i8));
        }
        final int i13 = 7;
        if (fkeVar2.f != fkeVar.f) {
            this.m.c(10, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj8) {
                    int i14 = i13;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj8;
                    switch (i14) {
                        case 0:
                            int i15 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i16 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i17 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i18 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i19 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i20 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i21 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i22 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
            if (fkeVar.f != null) {
                final int i14 = 8;
                this.m.c(10, new qdb() { // from class: ag6
                    @Override // defpackage.qdb
                    public final void invoke(Object obj8) {
                        int i142 = i14;
                        fke fkeVar4 = fkeVar;
                        wke wkeVar = (wke) obj8;
                        switch (i142) {
                            case 0:
                                int i15 = vg6.r0;
                                wkeVar.onLoadingChanged(fkeVar4.g);
                                wkeVar.onIsLoadingChanged(fkeVar4.g);
                                break;
                            case 1:
                                int i16 = vg6.r0;
                                wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                                break;
                            case 2:
                                int i17 = vg6.r0;
                                wkeVar.onPlaybackStateChanged(fkeVar4.e);
                                break;
                            case 3:
                                int i18 = vg6.r0;
                                wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                                break;
                            case 4:
                                int i19 = vg6.r0;
                                wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                                break;
                            case 5:
                                int i20 = vg6.r0;
                                wkeVar.onIsPlayingChanged(fkeVar4.m());
                                break;
                            case 6:
                                int i21 = vg6.r0;
                                wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                                break;
                            case 7:
                                int i22 = vg6.r0;
                                wkeVar.onPlayerErrorChanged(fkeVar4.f);
                                break;
                            case 8:
                                int i23 = vg6.r0;
                                wkeVar.onPlayerError(fkeVar4.f);
                                break;
                            default:
                                int i24 = vg6.r0;
                                wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                                break;
                        }
                    }
                });
            }
        }
        gtj gtjVar = fkeVar2.i;
        gtj gtjVar2 = fkeVar.i;
        if (gtjVar != gtjVar2) {
            iu4 iu4Var = this.i;
            Object obj8 = gtjVar2.c;
            iu4Var.getClass();
            final int i15 = 9;
            this.m.c(2, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i15;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i16 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i17 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i18 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i19 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i20 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i21 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i22 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        final int i16 = 4;
        if (!z4) {
            this.m.c(14, new kt4(this.S, i16));
        }
        if (z8) {
            final int i17 = 0;
            this.m.c(3, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i17;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i162 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i172 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i18 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i19 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i20 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i21 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i22 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        if (z5 || z6) {
            final int i18 = 1;
            this.m.c(-1, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i18;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i162 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i172 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i182 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i19 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i20 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i21 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i22 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i19 = 2;
            this.m.c(4, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i19;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i162 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i172 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i182 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i192 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i20 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i21 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i22 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        final int i20 = 5;
        if (z6 || fkeVar2.m != fkeVar.m) {
            final int i21 = 3;
            this.m.c(5, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i21;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i162 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i172 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i182 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i192 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i202 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i212 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i22 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        final int i22 = 6;
        if (fkeVar2.n != fkeVar.n) {
            this.m.c(6, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i16;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i162 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i172 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i182 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i192 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i202 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i212 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i222 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        if (fkeVar2.m() != fkeVar.m()) {
            this.m.c(7, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i20;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i162 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i172 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i182 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i192 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i202 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i212 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i222 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        if (!fkeVar2.o.equals(fkeVar.o)) {
            this.m.c(12, new qdb() { // from class: ag6
                @Override // defpackage.qdb
                public final void invoke(Object obj82) {
                    int i142 = i22;
                    fke fkeVar4 = fkeVar;
                    wke wkeVar = (wke) obj82;
                    switch (i142) {
                        case 0:
                            int i152 = vg6.r0;
                            wkeVar.onLoadingChanged(fkeVar4.g);
                            wkeVar.onIsLoadingChanged(fkeVar4.g);
                            break;
                        case 1:
                            int i162 = vg6.r0;
                            wkeVar.onPlayerStateChanged(fkeVar4.l, fkeVar4.e);
                            break;
                        case 2:
                            int i172 = vg6.r0;
                            wkeVar.onPlaybackStateChanged(fkeVar4.e);
                            break;
                        case 3:
                            int i182 = vg6.r0;
                            wkeVar.onPlayWhenReadyChanged(fkeVar4.l, fkeVar4.m);
                            break;
                        case 4:
                            int i192 = vg6.r0;
                            wkeVar.onPlaybackSuppressionReasonChanged(fkeVar4.n);
                            break;
                        case 5:
                            int i202 = vg6.r0;
                            wkeVar.onIsPlayingChanged(fkeVar4.m());
                            break;
                        case 6:
                            int i212 = vg6.r0;
                            wkeVar.onPlaybackParametersChanged(fkeVar4.o);
                            break;
                        case 7:
                            int i222 = vg6.r0;
                            wkeVar.onPlayerErrorChanged(fkeVar4.f);
                            break;
                        case 8:
                            int i23 = vg6.r0;
                            wkeVar.onPlayerError(fkeVar4.f);
                            break;
                        default:
                            int i24 = vg6.r0;
                            wkeVar.onTracksChanged((uuj) fkeVar4.i.f);
                            break;
                    }
                }
            });
        }
        f0();
        this.m.b();
        if (fkeVar2.p != fkeVar.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((mg6) it.next()).a.i0();
            }
        }
    }

    @Override // defpackage.ale
    public final uuj i() {
        j0();
        return (uuj) this.o0.i.f;
    }

    public final void i0() {
        int playbackState = getPlaybackState();
        r0a r0aVar = this.A;
        ge6 ge6Var = this.z;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                j0();
                boolean z2 = this.o0.p;
                if (getPlayWhenReady() && !z2) {
                    z = true;
                }
                ge6Var.g(z);
                r0aVar.k(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                zzl.s();
                return;
            }
        }
        ge6Var.g(false);
        r0aVar.k(false);
    }

    @Override // defpackage.ale
    public final boolean isPlayingAd() {
        j0();
        return this.o0.b.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        j0();
        return this.M;
    }

    @Override // defpackage.ale
    public final o74 j() {
        j0();
        return this.e0;
    }

    public final void j0() {
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = nik.a;
            Locale locale = Locale.US;
            String k = bf3.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                a70.r(k);
            } else {
                tgj.e0(k, this.g0 ? null : new IllegalStateException());
                this.g0 = true;
            }
        }
    }

    @Override // defpackage.ale
    public final int m() {
        j0();
        return this.o0.n;
    }

    @Override // defpackage.ale
    public final Looper n() {
        return this.t;
    }

    @Override // defpackage.ale
    public final etj o() {
        j0();
        wt4 h = this.i.h();
        if (!this.M) {
            return h;
        }
        h.getClass();
        ut4 ut4Var = new ut4(h);
        ut4Var.j(this.N);
        return new wt4(ut4Var);
    }

    @Override // defpackage.ale
    public final ske q() {
        j0();
        return this.R;
    }

    @Override // defpackage.ale
    public final long r() {
        j0();
        return this.m0;
    }

    @Override // defpackage.ale
    public final void release() {
        String str;
        boolean z;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.10.1] [");
        sb.append(nik.a);
        sb.append("] [");
        HashSet hashSet = i6c.a;
        synchronized (i6c.class) {
            str = i6c.b;
        }
        sb.append(str);
        sb.append(U3.j.e);
        tgj.O(sb.toString());
        j0();
        this.y.v(false);
        this.z.g(false);
        this.A.k(false);
        tg6 tg6Var = this.E;
        if (tg6Var != null && Build.VERSION.SDK_INT >= 34) {
            tg6Var.a();
        }
        c40 c40Var = this.D;
        ((zqi) c40Var.g).a.removeCallbacksAndMessages(null);
        ((vg6) c40Var.b).z((oii) c40Var.c);
        ih6 ih6Var = this.l;
        if (ih6Var.I || !ih6Var.j.getThread().isAlive()) {
            z = true;
        } else {
            ih6Var.I = true;
            yh3 yh3Var = new yh3(0);
            ih6Var.h.c(7, yh3Var).b();
            z = yh3Var.b(500L);
        }
        if (!z) {
            this.m.g(10, new cp4(28));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        tn4 tn4Var = this.u;
        cn4 cn4Var = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) tn4Var.c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            hz0 hz0Var = (hz0) it.next();
            if (hz0Var.b == cn4Var) {
                hz0Var.c = true;
                copyOnWriteArrayList.remove(hz0Var);
            }
        }
        fke fkeVar = this.o0;
        if (fkeVar.p) {
            fkeVar = fkeVar.a();
            this.o0 = fkeVar;
        }
        fke U = U(fkeVar, 1);
        this.o0 = U;
        fke c = U.c(U.b);
        this.o0 = c;
        c.q = c.s;
        this.o0.r = 0L;
        cn4 cn4Var2 = this.s;
        zqi zqiVar = cn4Var2.h;
        zqiVar.getClass();
        zqiVar.e(new wb3(cn4Var2, 6));
        Y();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = o74.c;
        this.i0 = true;
    }

    @Override // defpackage.ale
    public final void s(wke wkeVar) {
        wkeVar.getClass();
        this.m.a(wkeVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        j0();
        Z(4, 15, imageOutput);
    }

    @Override // defpackage.ale
    public final void setPlayWhenReady(boolean z) {
        j0();
        g0(1, z);
    }

    @Override // defpackage.ale
    public final void setRepeatMode(int i) {
        j0();
        if (this.H != i) {
            this.H = i;
            this.l.h.b(11, i, 0).b();
            uz1 uz1Var = new uz1(i, 3);
            vdb vdbVar = this.m;
            vdbVar.c(8, uz1Var);
            f0();
            vdbVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        etj etjVar;
        j0();
        if (z == this.M) {
            return;
        }
        this.M = z;
        vvg vvgVar = this.O;
        if (!vvgVar.a.isEmpty()) {
            iu4 iu4Var = this.i;
            iu4Var.getClass();
            wt4 h = iu4Var.h();
            if (z) {
                this.N = h.w;
                vv9 vv9Var = vvgVar.a;
                ctj a = h.a();
                cck it = vv9Var.iterator();
                while (it.hasNext()) {
                    a.i(((Integer) it.next()).intValue(), true);
                }
                etjVar = a.a();
            } else {
                h.getClass();
                ut4 ut4Var = new ut4(h);
                ut4Var.j(this.N);
                wt4 wt4Var = new wt4(ut4Var);
                this.N = null;
                etjVar = wt4Var;
            }
            if (!etjVar.equals(h)) {
                iu4Var.n(etjVar);
            }
        }
        this.l.h.c(36, Boolean.valueOf(z)).b();
        fke fkeVar = this.o0;
        g0(fkeVar.m, fkeVar.l);
    }

    @Override // defpackage.ale
    public final void setShuffleModeEnabled(boolean z) {
        j0();
        if (this.I != z) {
            this.I = z;
            this.l.h.b(12, z ? 1 : 0, 0).b();
            fg6 fg6Var = new fg6(z, 1);
            vdb vdbVar = this.m;
            vdbVar.c(9, fg6Var);
            f0();
            vdbVar.b();
        }
    }

    @Override // defpackage.ale
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        j0();
        if (surfaceView instanceof lpk) {
            Y();
            c0(surfaceView);
            b0(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof nxh;
        mg6 mg6Var = this.w;
        if (z) {
            Y();
            this.W = (nxh) surfaceView;
            lte P = P(this.x);
            z1a.E(!P.f);
            P.c = 10000;
            nxh nxhVar = this.W;
            z1a.E(true ^ P.f);
            P.d = nxhVar;
            P.b();
            this.W.a.add(mg6Var);
            c0(this.W.getVideoSurface());
            b0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        j0();
        if (holder == null) {
            O();
            return;
        }
        Y();
        this.X = true;
        this.V = holder;
        holder.addCallback(mg6Var);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            c0(null);
            X(0, 0);
        } else {
            c0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            X(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.ale
    public final void setVideoTextureView(TextureView textureView) {
        j0();
        if (textureView == null) {
            O();
            return;
        }
        Y();
        this.Y = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            tgj.d0("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.w);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            c0(null);
            X(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            c0(surface);
            this.U = surface;
            X(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.ale
    public final void setVolume(float f) {
        j0();
        float i = nik.i(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.c0 == i) {
            return;
        }
        this.c0 = i;
        this.l.h.c(32, Float.valueOf(i)).b();
        this.m.g(22, new bg6(i, 0));
    }

    @Override // defpackage.ale
    public final void stop() {
        j0();
        e0(null);
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        long j = this.o0.s;
        this.e0 = new o74(vvfVar);
    }

    @Override // defpackage.ale
    public final void t() {
        int i;
        int i2;
        Pair W;
        j0();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || min == 0) {
            return;
        }
        fke fkeVar = this.o0;
        int S = S(fkeVar);
        long Q = Q(fkeVar);
        mij mijVar = fkeVar.a;
        this.J++;
        for (int i3 = min - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        yfh yfhVar = this.P;
        int[] iArr = yfhVar.b;
        int[] iArr2 = new int[iArr.length - min];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < 0 || i6 >= min) {
                int i7 = i5 - i4;
                if (i6 >= 0) {
                    i6 -= min;
                }
                iArr2[i7] = i6;
            } else {
                i4++;
            }
        }
        this.P = new yfh(iArr2, new Random(yfhVar.a.nextLong()));
        sye syeVar = new sye(arrayList, this.P);
        boolean p = mijVar.p();
        kij kijVar = this.a;
        if (p || syeVar.p()) {
            i = 0;
            i2 = -1;
            boolean z = !mijVar.p() && syeVar.p();
            W = W(syeVar, z ? -1 : S, z ? -9223372036854775807L : Q);
        } else {
            Pair i8 = mijVar.i(kijVar, this.o, S, nik.T(Q));
            Object obj = i8.first;
            if (syeVar.b(obj) != -1) {
                kijVar = kijVar;
                i2 = -1;
                W = i8;
                i = 0;
            } else {
                i = 0;
                i2 = -1;
                kijVar = kijVar;
                int S2 = ih6.S(kijVar, this.o, this.H, this.I, obj, mijVar, syeVar);
                if (S2 != -1) {
                    syeVar.m(S2, kijVar, 0L);
                    W = W(syeVar, S2, nik.h0(kijVar.k));
                } else {
                    W = W(syeVar, -1, C.TIME_UNSET);
                }
            }
        }
        fke V = V(fkeVar, syeVar, W);
        int i9 = V.e;
        if (i9 != 1 && i9 != 4 && S >= 0 && S < min) {
            if (ih6.S(kijVar, this.o, this.H, this.I, fkeVar.b.a, mijVar, syeVar) == i2) {
                V = U(V, 4);
            }
        }
        yfh yfhVar2 = this.P;
        zqi zqiVar = this.l.h;
        zqiVar.getClass();
        xqi d = zqi.d();
        d.a = zqiVar.a.obtainMessage(20, i, min, yfhVar2);
        d.b();
        fke fkeVar2 = V;
        h0(fkeVar2, 0, !V.b.a.equals(this.o0.b.a), 4, R(fkeVar2), -1, false);
    }

    @Override // defpackage.ale
    public final zqk v() {
        j0();
        return this.j0;
    }

    @Override // defpackage.ale
    public final long w() {
        j0();
        return this.l0;
    }

    @Override // defpackage.ale
    public final void x(vvf vvfVar) {
        j0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vvfVar.size(); i++) {
            arrayList.add(this.r.a((h6c) vvfVar.get(i)));
        }
        j0();
        a0(arrayList, true, C.TIME_UNSET, -1);
    }

    @Override // defpackage.ale
    public final int y() {
        j0();
        int S = S(this.o0);
        if (S == -1) {
            return 0;
        }
        return S;
    }

    @Override // defpackage.ale
    public final void z(wke wkeVar) {
        j0();
        wkeVar.getClass();
        this.m.e(wkeVar);
    }
}
