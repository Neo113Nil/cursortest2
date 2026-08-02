package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.internal.d;
import com.google.android.exoplayer2.metadata.Metadata;
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
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ug6 implements zke {
    public final rn0 A;
    public final chi B;
    public final igf C;
    public final wje D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public final c0h L;
    public xfh M;
    public final boolean N;
    public rke O;
    public p6c P;
    public AudioTrack Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public mxh U;
    public boolean V;
    public TextureView W;
    public final int X;
    public mjh Y;
    public final zm0 Z;
    public float a0;
    public final gtj b;
    public boolean b0;
    public final rke c;
    public n74 c0;
    public final boolean d0;
    public final Context e;
    public boolean e0;
    public final ug6 f;
    public final v05 f0;
    public final m51[] g;
    public yqk g0;
    public final hu4 h;
    public p6c h0;
    public final yqi i;
    public eke i0;
    public final dg6 j;
    public int j0;
    public final hh6 k;
    public long k0;
    public final rd4 l;
    public final CopyOnWriteArraySet m;
    public final hij n;
    public final ArrayList o;
    public final boolean p;
    public final pcc q;
    public final bn4 r;
    public final Looper s;
    public final sn4 t;
    public final long u;
    public final long v;
    public final sqi w;
    public final lg6 x;
    public final ng6 y;
    public final yih z;
    public final jij a = new jij();
    public final r0a d = new r0a(1);

    static {
        jh6.a("goog.exo.exoplayer");
    }

    public ug6(vf6 vf6Var) {
        int i;
        boolean equals;
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i2 = lik.a;
            m6k.Q();
            this.e = vf6Var.a.getApplicationContext();
            sqi sqiVar = sqi.a;
            this.r = new bn4(sqiVar);
            this.Z = zm0.g;
            this.X = 1;
            this.b0 = false;
            this.E = 2000L;
            lg6 lg6Var = new lg6(this);
            this.x = lg6Var;
            this.y = new ng6();
            Handler handler = new Handler(vf6Var.f);
            m51[] l = ((fp4) vf6Var.b.get()).l(handler, lg6Var, lg6Var, lg6Var, lg6Var);
            this.g = l;
            qx9.t(l.length > 0);
            this.h = (hu4) vf6Var.d.get();
            this.q = (pcc) vf6Var.c.get();
            this.t = (sn4) vf6Var.e.get();
            this.p = true;
            this.L = vf6Var.g;
            this.u = 5000L;
            this.v = 15000L;
            this.N = vf6Var.i;
            Looper looper = vf6Var.f;
            this.s = looper;
            this.w = sqiVar;
            this.f = this;
            this.l = new rd4(looper, sqiVar, new cp4(this, 29));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.M = new xfh();
            this.b = new gtj(new ryf[l.length], new mh6[l.length], tuj.b, (jub) null);
            this.n = new hij();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i3 = 0; i3 < 21; i3++) {
                int i4 = iArr[i3];
                qx9.t(!false);
                sparseBooleanArray.append(i4, true);
            }
            this.h.getClass();
            qx9.t(!false);
            sparseBooleanArray.append(29, true);
            qx9.t(!false);
            i78 i78Var = new i78(sparseBooleanArray);
            this.c = new rke(i78Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i5 = 0; i5 < i78Var.a.size(); i5++) {
                int a = i78Var.a(i5);
                qx9.t(!false);
                sparseBooleanArray2.append(a, true);
            }
            qx9.t(!false);
            sparseBooleanArray2.append(4, true);
            qx9.t(!false);
            sparseBooleanArray2.append(10, true);
            qx9.t(!false);
            this.O = new rke(new i78(sparseBooleanArray2));
            this.i = this.w.a(this.s, null);
            dg6 dg6Var = new dg6(this);
            this.j = dg6Var;
            this.i0 = eke.h(this.b);
            this.r.A(this.f, this.s);
            int i6 = lik.a;
            this.k = new hh6(this.g, this.h, this.b, new xq4(), this.t, this.F, this.G, this.r, this.L, vf6Var.h, this.N, this.s, this.w, dg6Var, i6 < 31 ? new bse() : ig6.a(this.e, this, true));
            this.a0 = 1.0f;
            this.F = 0;
            p6c p6cVar = p6c.G;
            this.P = p6cVar;
            this.h0 = p6cVar;
            int i7 = -1;
            this.j0 = -1;
            if (i6 < 21) {
                AudioTrack audioTrack = this.Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                AudioTrack audioTrack2 = this.Q;
                if (audioTrack2 == null) {
                    AudioTrack audioTrack3 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    this.Q = audioTrack3;
                    audioTrack2 = audioTrack3;
                }
                i = audioTrack2.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    i7 = audioManager.generateAudioSessionId();
                }
                i = i7;
            }
            this.c0 = n74.b;
            this.d0 = true;
            bn4 bn4Var = this.r;
            rd4 rd4Var = this.l;
            bn4Var.getClass();
            rd4Var.e(bn4Var);
            sn4 sn4Var = this.t;
            Handler handler2 = new Handler(this.s);
            bn4 bn4Var2 = this.r;
            sn4Var.getClass();
            bn4Var2.getClass();
            iz0 iz0Var = sn4Var.b;
            iz0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = iz0Var.a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                gz0 gz0Var = (gz0) it.next();
                if (gz0Var.b == bn4Var2) {
                    gz0Var.c = true;
                    copyOnWriteArrayList.remove(gz0Var);
                }
            }
            iz0Var.a.add(new gz0(bn4Var2, handler2));
            this.m.add(this.x);
            yih yihVar = new yih(vf6Var.a, handler, this.x);
            this.z = yihVar;
            yihVar.m();
            this.A = new rn0(vf6Var.a, handler, this.x);
            int i8 = lik.a;
            chi chiVar = new chi(vf6Var.a, handler, this.x);
            this.B = chiVar;
            int q = lik.q(this.Z.c);
            if (chiVar.f != q) {
                chiVar.f = q;
                chiVar.c();
                ug6 ug6Var = chiVar.c.a;
                chi chiVar2 = ug6Var.B;
                v05 v05Var = new v05(0, chiVar2.a(), chiVar2.d.getStreamMaxVolume(chiVar2.f));
                if (!v05Var.equals(ug6Var.f0)) {
                    ug6Var.f0 = v05Var;
                    ug6Var.l.k(29, new kt4(v05Var, 13));
                }
            }
            Context context = vf6Var.a;
            igf igfVar = new igf(5);
            this.C = igfVar;
            Context context2 = vf6Var.a;
            wje wjeVar = new wje(6);
            this.D = wjeVar;
            this.f0 = new v05(0, chiVar.a(), chiVar.d.getStreamMaxVolume(chiVar.f));
            this.g0 = yqk.e;
            this.Y = mjh.c;
            hu4 hu4Var = this.h;
            zm0 zm0Var = this.Z;
            synchronized (hu4Var.c) {
                equals = hu4Var.i.equals(zm0Var);
                hu4Var.i = zm0Var;
            }
            if (!equals) {
                hu4Var.e();
            }
            F(1, 10, Integer.valueOf(i));
            F(2, 10, Integer.valueOf(i));
            F(1, 3, this.Z);
            F(2, 4, Integer.valueOf(this.X));
            F(2, 5, 0);
            F(1, 9, Boolean.valueOf(this.b0));
            F(2, 7, this.y);
            F(6, 8, this.y);
            this.d.j();
        } catch (Throwable th) {
            this.d.j();
            throw th;
        }
    }

    public static long p(eke ekeVar) {
        jij jijVar = new jij();
        hij hijVar = new hij();
        ekeVar.a.g(ekeVar.b.a, hijVar);
        long j = ekeVar.c;
        return j == C.TIME_UNSET ? ekeVar.a.m(hijVar.c, jijVar, 0L).k : hijVar.e + j;
    }

    public static boolean t(eke ekeVar) {
        return ekeVar.e == 3 && ekeVar.l && ekeVar.m == 0;
    }

    public final void A(vke vkeVar) {
        vkeVar.getClass();
        rd4 rd4Var = this.l;
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) rd4Var.e;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            tdb tdbVar = (tdb) it.next();
            if (tdbVar.a.equals(vkeVar)) {
                rdb rdbVar = (rdb) rd4Var.d;
                tdbVar.d = true;
                if (tdbVar.c) {
                    tdbVar.c = false;
                    rdbVar.b(tdbVar.a, tdbVar.b.c());
                }
                copyOnWriteArraySet.remove(tdbVar);
            }
        }
    }

    public final void B() {
        mxh mxhVar = this.U;
        lg6 lg6Var = this.x;
        if (mxhVar != null) {
            kte c = c(this.y);
            qx9.t(!c.g);
            c.d = 10000;
            qx9.t(!c.g);
            c.e = null;
            c.c();
            this.U.a.remove(lg6Var);
            this.U = null;
        }
        TextureView textureView = this.W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != lg6Var) {
                m6k.f0();
            } else {
                this.W.setSurfaceTextureListener(null);
            }
            this.W = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(lg6Var);
            this.T = null;
        }
    }

    public final void C(long j, int i, boolean z) {
        bn4 bn4Var = this.r;
        if (!bn4Var.i) {
            pv t = bn4Var.t();
            bn4Var.i = true;
            bn4Var.z(t, -1, new eg4(r4));
        }
        lij lijVar = this.i0.a;
        if (i < 0 || (!lijVar.p() && i >= lijVar.o())) {
            throw new kx2(r4);
        }
        this.H++;
        if (!u()) {
            r4 = o() == 1 ? 1 : 2;
            int g = g();
            eke v = v(this.i0.f(r4), lijVar, w(lijVar, i, j));
            this.k.h.a(3, new fh6(lijVar, i, lik.y(j))).b();
            R(v, 0, 1, true, true, 1, i(v), g, z);
            return;
        }
        m6k.f0();
        ch6 ch6Var = new ch6(this.i0);
        ch6Var.a(1);
        ug6 ug6Var = this.j.a;
        ug6Var.i.a.post(new yq5(r4, ug6Var, ch6Var));
    }

    public final void D() {
        int e;
        int e2;
        if (j().p() || u()) {
            return;
        }
        lij j = j();
        if (j.p()) {
            e = -1;
        } else {
            int g = g();
            T();
            int i = this.F;
            if (i == 1) {
                i = 0;
            }
            T();
            e = j.e(g, i, this.G);
        }
        if (e == -1) {
            if (s()) {
                lij j2 = j();
                if (j2.p() || !j2.m(g(), this.a, 0L).g) {
                    return;
                }
                int g2 = g();
                T();
                C(C.TIME_UNSET, g2, false);
                return;
            }
            return;
        }
        lij j3 = j();
        if (j3.p()) {
            e2 = -1;
        } else {
            int g3 = g();
            T();
            int i2 = this.F;
            if (i2 == 1) {
                i2 = 0;
            }
            T();
            e2 = j3.e(g3, i2, this.G);
        }
        if (e2 == -1) {
            return;
        }
        if (e2 == g()) {
            T();
            C(C.TIME_UNSET, g(), true);
        } else {
            T();
            C(C.TIME_UNSET, e2, false);
        }
    }

    public final void E() {
        int k;
        int k2;
        int k3;
        if (j().p() || u()) {
            return;
        }
        lij j = j();
        if (j.p()) {
            k = -1;
        } else {
            int g = g();
            T();
            int i = this.F;
            if (i == 1) {
                i = 0;
            }
            T();
            k = j.k(g, i, this.G);
        }
        boolean z = k != -1;
        if (s()) {
            lij j2 = j();
            if (j2.p() || !j2.m(g(), this.a, 0L).f) {
                if (z) {
                    lij j3 = j();
                    if (j3.p()) {
                        k3 = -1;
                    } else {
                        int g2 = g();
                        T();
                        int i2 = this.F;
                        if (i2 == 1) {
                            i2 = 0;
                        }
                        T();
                        k3 = j3.k(g2, i2, this.G);
                    }
                    if (k3 == -1) {
                        return;
                    }
                    if (k3 == g()) {
                        T();
                        C(C.TIME_UNSET, g(), true);
                        return;
                    } else {
                        T();
                        C(C.TIME_UNSET, k3, false);
                        return;
                    }
                }
                return;
            }
        }
        if (z) {
            long h = h();
            T();
            if (h <= Ua.C) {
                lij j4 = j();
                if (j4.p()) {
                    k2 = -1;
                } else {
                    int g3 = g();
                    T();
                    int i3 = this.F;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    T();
                    k2 = j4.k(g3, i3, this.G);
                }
                if (k2 == -1) {
                    return;
                }
                if (k2 == g()) {
                    T();
                    C(C.TIME_UNSET, g(), true);
                    return;
                } else {
                    T();
                    C(C.TIME_UNSET, k2, false);
                    return;
                }
            }
        }
        int g4 = g();
        T();
        C(0L, g4, false);
    }

    public final void F(int i, int i2, Object obj) {
        for (m51 m51Var : this.g) {
            if (m51Var.a == i) {
                kte c = c(m51Var);
                qx9.t(!c.g);
                c.d = i2;
                qx9.t(!c.g);
                c.e = obj;
                c.c();
            }
        }
    }

    public final void G(f6c f6cVar) {
        vvf z = hv9.z(f6cVar);
        T();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < z.d; i++) {
            arrayList.add(this.q.a((f6c) z.get(i)));
        }
        H(arrayList);
    }

    public final void H(List list) {
        T();
        l();
        h();
        this.H++;
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            xfh xfhVar = this.M;
            int[] iArr = xfhVar.b;
            int[] iArr2 = new int[iArr.length - size];
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                if (i4 < 0 || i4 >= size) {
                    int i5 = i3 - i2;
                    if (i4 >= 0) {
                        i4 -= size;
                    }
                    iArr2[i5] = i4;
                } else {
                    i2++;
                }
            }
            this.M = new xfh(iArr2, new Random(xfhVar.a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            rdc rdcVar = new rdc((a51) list.get(i6), this.p);
            arrayList2.add(rdcVar);
            arrayList.add(i6, new pg6(rdcVar.b, rdcVar.a.o));
        }
        xfh a = this.M.a(arrayList2.size());
        this.M = a;
        rye ryeVar = new rye(arrayList, a);
        boolean p = ryeVar.p();
        int i7 = 2;
        int i8 = ryeVar.d;
        if (!p && -1 >= i8) {
            throw new kx2(i7);
        }
        int a2 = ryeVar.a(this.G);
        eke v = v(this.i0, ryeVar, w(ryeVar, a2, C.TIME_UNSET));
        int i9 = v.e;
        if (a2 == -1 || i9 == 1) {
            i7 = i9;
        } else if (ryeVar.p() || a2 >= i8) {
            i7 = 4;
        }
        eke f = v.f(i7);
        this.k.h.a(17, new ah6(arrayList2, this.M, a2, lik.y(C.TIME_UNSET))).b();
        R(f, 0, 1, false, (this.i0.b.a.equals(f.b.a) || this.i0.a.p()) ? false : true, 4, i(f), -1, false);
    }

    public final void I(SurfaceHolder surfaceHolder) {
        this.V = false;
        this.T = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = this.T.getSurface();
        if (surface == null || !surface.isValid()) {
            x(0, 0);
        } else {
            Rect surfaceFrame = this.T.getSurfaceFrame();
            x(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void J(boolean z) {
        T();
        int c = this.A.c(o(), z);
        int i = 1;
        if (z && c != 1) {
            i = 2;
        }
        Q(c, i, z);
    }

    public final void K(int i) {
        T();
        if (this.F != i) {
            this.F = i;
            yqi yqiVar = this.k.h;
            yqiVar.getClass();
            wqi b = yqi.b();
            b.a = yqiVar.a.obtainMessage(11, i, 0);
            b.b();
            uz1 uz1Var = new uz1(i, 4);
            rd4 rd4Var = this.l;
            rd4Var.j(8, uz1Var);
            P();
            rd4Var.h();
        }
    }

    public final void L(dtj dtjVar) {
        T();
        hu4 hu4Var = this.h;
        hu4Var.getClass();
        if (dtjVar.equals(hu4Var.c())) {
            return;
        }
        if (dtjVar instanceof vt4) {
            hu4Var.h((vt4) dtjVar);
        }
        tt4 tt4Var = new tt4(hu4Var.c());
        tt4Var.b(dtjVar);
        hu4Var.h(new vt4(tt4Var));
        this.l.k(19, new kt4(dtjVar, 6));
    }

    public final void M(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (m51 m51Var : this.g) {
            if (m51Var.a == 2) {
                kte c = c(m51Var);
                qx9.t(!c.g);
                c.d = 1;
                qx9.t(true ^ c.g);
                c.e = obj;
                c.c();
                arrayList.add(c);
            }
        }
        Object obj2 = this.R;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((kte) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            z = false;
            Object obj3 = this.R;
            Surface surface = this.S;
            if (obj3 == surface) {
                surface.release();
                this.S = null;
            }
        }
        this.R = obj;
        if (z) {
            sf6 sf6Var = new sf6(2, new fb3("Detaching surface timed out.", 4), 1003);
            eke ekeVar = this.i0;
            eke a = ekeVar.a(ekeVar.b);
            a.p = a.r;
            a.q = 0L;
            eke d = a.f(1).d(sf6Var);
            this.H++;
            yqi yqiVar = this.k.h;
            yqiVar.getClass();
            wqi b = yqi.b();
            b.a = yqiVar.a.obtainMessage(6);
            b.b();
            if (d.a.p() && !this.i0.a.p()) {
                z2 = true;
            }
            R(d, 0, 1, false, z2, 4, i(d), -1, false);
        }
    }

    public final void N(TextureView textureView) {
        T();
        if (textureView == null) {
            b();
            return;
        }
        B();
        this.W = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            m6k.f0();
        }
        textureView.setSurfaceTextureListener(this.x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            M(null);
            x(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            M(surface);
            this.S = surface;
            x(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void O(float f) {
        T();
        float g = lik.g(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.a0 == g) {
            return;
        }
        this.a0 = g;
        F(1, 2, Float.valueOf(this.A.e * g));
        this.l.k(22, new bg6(g, 1));
    }

    public final void P() {
        int k;
        int e;
        rke rkeVar = this.O;
        int i = lik.a;
        ug6 ug6Var = this.f;
        boolean u = ug6Var.u();
        jij jijVar = ug6Var.a;
        lij j = ug6Var.j();
        boolean z = !j.p() && j.m(ug6Var.g(), jijVar, 0L).f;
        lij j2 = ug6Var.j();
        if (j2.p()) {
            k = -1;
        } else {
            int g = ug6Var.g();
            ug6Var.T();
            int i2 = ug6Var.F;
            if (i2 == 1) {
                i2 = 0;
            }
            ug6Var.T();
            k = j2.k(g, i2, ug6Var.G);
        }
        boolean z2 = k != -1;
        lij j3 = ug6Var.j();
        if (j3.p()) {
            e = -1;
        } else {
            int g2 = ug6Var.g();
            ug6Var.T();
            int i3 = ug6Var.F;
            if (i3 == 1) {
                i3 = 0;
            }
            ug6Var.T();
            e = j3.e(g2, i3, ug6Var.G);
        }
        boolean z3 = e != -1;
        boolean s = ug6Var.s();
        lij j4 = ug6Var.j();
        boolean z4 = !j4.p() && j4.m(ug6Var.g(), jijVar, 0L).g;
        boolean p = ug6Var.j().p();
        h78 h78Var = new h78(0);
        i78 i78Var = this.c.a;
        for (int i4 = 0; i4 < i78Var.a.size(); i4++) {
            h78Var.a(i78Var.a(i4));
        }
        if (!u) {
            h78Var.a(4);
        }
        if (z && !u) {
            h78Var.a(5);
        }
        if (z2 && !u) {
            h78Var.a(6);
        }
        if (!p && (z2 || !s || z) && !u) {
            h78Var.a(7);
        }
        if (z3 && !u) {
            h78Var.a(8);
        }
        if (!p && (z3 || (s && z4)) && !u) {
            h78Var.a(9);
        }
        if (!u) {
            h78Var.a(10);
        }
        if (z && !u) {
            h78Var.a(11);
        }
        if (z && !u) {
            h78Var.a(12);
        }
        rke rkeVar2 = new rke(h78Var.c());
        this.O = rkeVar2;
        if (rkeVar2.equals(rkeVar)) {
            return;
        }
        this.l.j(13, new dg6(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void Q(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r4 = (!z || i == -1) ? 0 : 1;
        if (r4 != 0 && i != 1) {
            i3 = 1;
        }
        eke ekeVar = this.i0;
        if (ekeVar.l == r4 && ekeVar.m == i3) {
            return;
        }
        this.H++;
        eke c = ekeVar.c(i3, r4);
        yqi yqiVar = this.k.h;
        yqiVar.getClass();
        wqi b = yqi.b();
        b.a = yqiVar.a.obtainMessage(1, r4, i3);
        b.b();
        R(c, 0, i2, false, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void R(final eke ekeVar, final int i, final int i2, boolean z, boolean z2, int i3, long j, int i4, boolean z3) {
        Pair pair;
        int i5;
        f6c f6cVar;
        boolean z4;
        boolean z5;
        boolean z6;
        final int i6;
        int i7;
        Object obj;
        f6c f6cVar2;
        Object obj2;
        int i8;
        long j2;
        long j3;
        long j4;
        long p;
        Object obj3;
        f6c f6cVar3;
        Object obj4;
        int i9;
        eke ekeVar2 = this.i0;
        this.i0 = ekeVar;
        boolean equals = ekeVar2.a.equals(ekeVar.a);
        jij jijVar = this.a;
        hij hijVar = this.n;
        lij lijVar = ekeVar2.a;
        rcc rccVar = ekeVar2.b;
        lij lijVar2 = ekeVar.a;
        rcc rccVar2 = ekeVar.b;
        final int i10 = 0;
        int i11 = 2;
        int i12 = 3;
        if (lijVar2.p() && lijVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (lijVar2.p() != lijVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (lijVar.m(lijVar.g(rccVar.a, hijVar).c, jijVar, 0L).a.equals(lijVar2.m(lijVar2.g(rccVar2.a, hijVar).c, jijVar, 0L).a)) {
            pair = (z2 && i3 == 0 && rccVar.d < rccVar2.d) ? new Pair(Boolean.TRUE, 0) : (z2 && i3 == 1 && z3) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z2 && i3 == 0) {
                i5 = 1;
            } else if (z2 && i3 == 1) {
                i5 = 2;
            } else {
                if (equals) {
                    zzl.s();
                    return;
                }
                i5 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        p6c p6cVar = this.P;
        if (booleanValue) {
            f6cVar = !ekeVar.a.p() ? ekeVar.a.m(ekeVar.a.g(ekeVar.b.a, this.n).c, this.a, 0L).b : null;
            this.h0 = p6c.G;
        } else {
            f6cVar = null;
        }
        if (booleanValue || !ekeVar2.j.equals(ekeVar.j)) {
            n6c a = this.h0.a();
            List list = ekeVar.j;
            for (int i13 = 0; i13 < list.size(); i13++) {
                Metadata metadata = (Metadata) list.get(i13);
                int i14 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.a;
                    if (i14 < entryArr.length) {
                        entryArr[i14].e(a);
                        i14++;
                    }
                }
            }
            this.h0 = new p6c(a);
            p6cVar = a();
        }
        boolean equals2 = p6cVar.equals(this.P);
        this.P = p6cVar;
        boolean z7 = ekeVar2.l != ekeVar.l;
        boolean z8 = ekeVar2.e != ekeVar.e;
        if (z8 || z7) {
            S();
        }
        boolean z9 = ekeVar2.g != ekeVar.g;
        if (!equals) {
            this.l.j(0, new pdb() { // from class: zf6
                @Override // defpackage.pdb
                public final void invoke(Object obj5) {
                    int i15 = i10;
                    int i16 = i;
                    eke ekeVar3 = ekeVar;
                    vke vkeVar = (vke) obj5;
                    switch (i15) {
                        case 0:
                            lij lijVar3 = ekeVar3.a;
                            vkeVar.e(i16);
                            break;
                        default:
                            vkeVar.onPlayWhenReadyChanged(ekeVar3.l, i16);
                            break;
                    }
                }
            });
        }
        if (z2) {
            hij hijVar2 = new hij();
            if (ekeVar2.a.p()) {
                z4 = booleanValue;
                z5 = z7;
                z6 = equals2;
                i7 = i4;
                obj = null;
                f6cVar2 = null;
                obj2 = null;
                i8 = -1;
            } else {
                Object obj5 = ekeVar2.b.a;
                ekeVar2.a.g(obj5, hijVar2);
                int i15 = hijVar2.c;
                int b = ekeVar2.a.b(obj5);
                z4 = booleanValue;
                z5 = z7;
                z6 = equals2;
                obj = ekeVar2.a.m(i15, this.a, 0L).a;
                f6cVar2 = this.a.b;
                obj2 = obj5;
                i7 = i15;
                i8 = b;
            }
            rcc rccVar3 = ekeVar2.b;
            if (i3 == 0) {
                boolean a2 = rccVar3.a();
                rcc rccVar4 = ekeVar2.b;
                if (a2) {
                    j4 = hijVar2.a(rccVar4.b, rccVar4.c);
                    p = p(ekeVar2);
                } else if (rccVar4.e != -1) {
                    j4 = p(this.i0);
                    p = j4;
                } else {
                    j2 = hijVar2.e;
                    j3 = hijVar2.d;
                    j4 = j2 + j3;
                    p = j4;
                }
            } else if (rccVar3.a()) {
                j4 = ekeVar2.r;
                p = p(ekeVar2);
            } else {
                j2 = hijVar2.e;
                j3 = ekeVar2.r;
                j4 = j2 + j3;
                p = j4;
            }
            long F = lik.F(j4);
            long F2 = lik.F(p);
            rcc rccVar5 = ekeVar2.b;
            xke xkeVar = new xke(obj, i7, f6cVar2, obj2, i8, F, F2, rccVar5.b, rccVar5.c);
            jij jijVar2 = this.a;
            int g = g();
            if (this.i0.a.p()) {
                obj3 = null;
                f6cVar3 = null;
                obj4 = null;
                i9 = -1;
            } else {
                eke ekeVar3 = this.i0;
                Object obj6 = ekeVar3.b.a;
                ekeVar3.a.g(obj6, this.n);
                int b2 = this.i0.a.b(obj6);
                Object obj7 = this.i0.a.m(g, jijVar2, 0L).a;
                f6cVar3 = jijVar2.b;
                i9 = b2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long F3 = lik.F(j);
            long F4 = this.i0.b.a() ? lik.F(p(this.i0)) : F3;
            rcc rccVar6 = this.i0.b;
            this.l.j(11, new j01(i3, xkeVar, new xke(obj3, g, f6cVar3, obj4, i9, F3, F4, rccVar6.b, rccVar6.c), i11));
        } else {
            z4 = booleanValue;
            z5 = z7;
            z6 = equals2;
        }
        if (z4) {
            this.l.j(1, new tz1(f6cVar, intValue, i12));
        }
        if (ekeVar2.f != ekeVar.f) {
            final int i16 = 8;
            this.l.j(10, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj8) {
                    int i17 = i16;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj8;
                    switch (i17) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
            if (ekeVar.f != null) {
                final int i17 = 0;
                this.l.j(10, new pdb() { // from class: yf6
                    @Override // defpackage.pdb
                    public final void invoke(Object obj8) {
                        int i172 = i17;
                        eke ekeVar4 = ekeVar;
                        vke vkeVar = (vke) obj8;
                        switch (i172) {
                            case 0:
                                vkeVar.h(ekeVar4.f);
                                break;
                            case 1:
                                vkeVar.j((tuj) ekeVar4.i.f);
                                break;
                            case 2:
                                vkeVar.onIsLoadingChanged(ekeVar4.g);
                                break;
                            case 3:
                                vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                                break;
                            case 4:
                                vkeVar.onPlaybackStateChanged(ekeVar4.e);
                                break;
                            case 5:
                                vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                                break;
                            case 6:
                                vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                                break;
                            case 7:
                                vkeVar.n(ekeVar4.n);
                                break;
                            default:
                                vkeVar.r(ekeVar4.f);
                                break;
                        }
                    }
                });
            }
        }
        gtj gtjVar = ekeVar2.i;
        gtj gtjVar2 = ekeVar.i;
        if (gtjVar != gtjVar2) {
            hu4 hu4Var = this.h;
            Object obj8 = gtjVar2.c;
            hu4Var.getClass();
            final int i18 = 1;
            this.l.j(2, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj82) {
                    int i172 = i18;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj82;
                    switch (i172) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
        }
        final int i19 = 5;
        if (!z6) {
            this.l.j(14, new kt4(this.P, i19));
        }
        if (z9) {
            final int i20 = 2;
            i6 = 3;
            this.l.j(3, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj82) {
                    int i172 = i20;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj82;
                    switch (i172) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
        } else {
            i6 = 3;
        }
        if (z8 || z5) {
            this.l.j(-1, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj82) {
                    int i172 = i6;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj82;
                    switch (i172) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
        }
        if (z8) {
            final int i21 = 4;
            this.l.j(4, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj82) {
                    int i172 = i21;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj82;
                    switch (i172) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i22 = 1;
            this.l.j(5, new pdb() { // from class: zf6
                @Override // defpackage.pdb
                public final void invoke(Object obj52) {
                    int i152 = i22;
                    int i162 = i2;
                    eke ekeVar32 = ekeVar;
                    vke vkeVar = (vke) obj52;
                    switch (i152) {
                        case 0:
                            lij lijVar3 = ekeVar32.a;
                            vkeVar.e(i162);
                            break;
                        default:
                            vkeVar.onPlayWhenReadyChanged(ekeVar32.l, i162);
                            break;
                    }
                }
            });
        }
        final int i23 = 6;
        if (ekeVar2.m != ekeVar.m) {
            this.l.j(6, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj82) {
                    int i172 = i19;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj82;
                    switch (i172) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
        }
        final int i24 = 7;
        if (t(ekeVar2) != t(ekeVar)) {
            this.l.j(7, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj82) {
                    int i172 = i23;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj82;
                    switch (i172) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
        }
        if (!ekeVar2.n.equals(ekeVar.n)) {
            this.l.j(12, new pdb() { // from class: yf6
                @Override // defpackage.pdb
                public final void invoke(Object obj82) {
                    int i172 = i24;
                    eke ekeVar4 = ekeVar;
                    vke vkeVar = (vke) obj82;
                    switch (i172) {
                        case 0:
                            vkeVar.h(ekeVar4.f);
                            break;
                        case 1:
                            vkeVar.j((tuj) ekeVar4.i.f);
                            break;
                        case 2:
                            vkeVar.onIsLoadingChanged(ekeVar4.g);
                            break;
                        case 3:
                            vkeVar.onPlayerStateChanged(ekeVar4.l, ekeVar4.e);
                            break;
                        case 4:
                            vkeVar.onPlaybackStateChanged(ekeVar4.e);
                            break;
                        case 5:
                            vkeVar.onPlaybackSuppressionReasonChanged(ekeVar4.m);
                            break;
                        case 6:
                            vkeVar.onIsPlayingChanged(ug6.t(ekeVar4));
                            break;
                        case 7:
                            vkeVar.n(ekeVar4.n);
                            break;
                        default:
                            vkeVar.r(ekeVar4.f);
                            break;
                    }
                }
            });
        }
        if (z) {
            this.l.j(-1, new hg6(0));
        }
        P();
        this.l.h();
        if (ekeVar2.o != ekeVar.o) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((lg6) it.next()).a.S();
            }
        }
    }

    public final void S() {
        int o = o();
        wje wjeVar = this.D;
        igf igfVar = this.C;
        if (o != 1) {
            if (o == 2 || o == 3) {
                T();
                boolean z = this.i0.o;
                n();
                igfVar.getClass();
                n();
                wjeVar.getClass();
                return;
            }
            if (o != 4) {
                zzl.s();
                return;
            }
        }
        igfVar.getClass();
        wjeVar.getClass();
    }

    public final void T() {
        r0a r0aVar = this.d;
        synchronized (r0aVar) {
            boolean z = false;
            while (!r0aVar.b) {
                try {
                    r0aVar.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.s.getThread().getName();
            int i = lik.a;
            Locale locale = Locale.US;
            String k = bf3.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.d0) {
                a70.r(k);
            } else {
                m6k.g0(k, this.e0 ? null : new IllegalStateException());
                this.e0 = true;
            }
        }
    }

    public final p6c a() {
        lij j = j();
        if (j.p()) {
            return this.h0;
        }
        f6c f6cVar = j.m(g(), this.a, 0L).b;
        n6c a = this.h0.a();
        p6c p6cVar = f6cVar.d;
        if (p6cVar != null) {
            CharSequence charSequence = p6cVar.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = p6cVar.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = p6cVar.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = p6cVar.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = p6cVar.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = p6cVar.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = p6cVar.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            wnn wnnVar = p6cVar.h;
            if (wnnVar != null) {
                a.h = wnnVar;
            }
            wnn wnnVar2 = p6cVar.i;
            if (wnnVar2 != null) {
                a.i = wnnVar2;
            }
            byte[] bArr = p6cVar.j;
            if (bArr != null) {
                Integer num = p6cVar.k;
                a.j = (byte[]) bArr.clone();
                a.k = num;
            }
            Uri uri = p6cVar.l;
            if (uri != null) {
                a.l = uri;
            }
            Integer num2 = p6cVar.m;
            if (num2 != null) {
                a.m = num2;
            }
            Integer num3 = p6cVar.n;
            if (num3 != null) {
                a.n = num3;
            }
            Integer num4 = p6cVar.o;
            if (num4 != null) {
                a.o = num4;
            }
            Boolean bool = p6cVar.p;
            if (bool != null) {
                a.p = bool;
            }
            Integer num5 = p6cVar.q;
            if (num5 != null) {
                a.q = num5;
            }
            Integer num6 = p6cVar.r;
            if (num6 != null) {
                a.q = num6;
            }
            Integer num7 = p6cVar.s;
            if (num7 != null) {
                a.r = num7;
            }
            Integer num8 = p6cVar.t;
            if (num8 != null) {
                a.s = num8;
            }
            Integer num9 = p6cVar.u;
            if (num9 != null) {
                a.t = num9;
            }
            Integer num10 = p6cVar.v;
            if (num10 != null) {
                a.u = num10;
            }
            Integer num11 = p6cVar.w;
            if (num11 != null) {
                a.v = num11;
            }
            CharSequence charSequence8 = p6cVar.x;
            if (charSequence8 != null) {
                a.w = charSequence8;
            }
            CharSequence charSequence9 = p6cVar.y;
            if (charSequence9 != null) {
                a.x = charSequence9;
            }
            CharSequence charSequence10 = p6cVar.z;
            if (charSequence10 != null) {
                a.y = charSequence10;
            }
            Integer num12 = p6cVar.A;
            if (num12 != null) {
                a.z = num12;
            }
            Integer num13 = p6cVar.B;
            if (num13 != null) {
                a.A = num13;
            }
            CharSequence charSequence11 = p6cVar.C;
            if (charSequence11 != null) {
                a.B = charSequence11;
            }
            CharSequence charSequence12 = p6cVar.D;
            if (charSequence12 != null) {
                a.C = charSequence12;
            }
            CharSequence charSequence13 = p6cVar.E;
            if (charSequence13 != null) {
                a.D = charSequence13;
            }
            Bundle bundle = p6cVar.F;
            if (bundle != null) {
                a.E = bundle;
            }
        }
        return new p6c(a);
    }

    public final void b() {
        T();
        B();
        M(null);
        x(0, 0);
    }

    public final kte c(ite iteVar) {
        int l = l();
        lij lijVar = this.i0.a;
        if (l == -1) {
            l = 0;
        }
        sqi sqiVar = this.w;
        hh6 hh6Var = this.k;
        return new kte(hh6Var, iteVar, lijVar, l, sqiVar, hh6Var.j);
    }

    public final long d() {
        T();
        if (!u()) {
            return h();
        }
        eke ekeVar = this.i0;
        lij lijVar = ekeVar.a;
        Object obj = ekeVar.b.a;
        hij hijVar = this.n;
        lijVar.g(obj, hijVar);
        eke ekeVar2 = this.i0;
        if (ekeVar2.c == C.TIME_UNSET) {
            return lik.F(ekeVar2.a.m(g(), this.a, 0L).k);
        }
        return lik.F(this.i0.c) + lik.F(hijVar.e);
    }

    public final int e() {
        T();
        if (u()) {
            return this.i0.b.b;
        }
        return -1;
    }

    public final int f() {
        T();
        if (u()) {
            return this.i0.b.c;
        }
        return -1;
    }

    public final int g() {
        T();
        int l = l();
        if (l == -1) {
            return 0;
        }
        return l;
    }

    public final long h() {
        T();
        return lik.F(i(this.i0));
    }

    public final long i(eke ekeVar) {
        if (ekeVar.a.p()) {
            return lik.y(this.k0);
        }
        if (ekeVar.b.a()) {
            return ekeVar.r;
        }
        lij lijVar = ekeVar.a;
        rcc rccVar = ekeVar.b;
        long j = ekeVar.r;
        Object obj = rccVar.a;
        hij hijVar = this.n;
        lijVar.g(obj, hijVar);
        return j + hijVar.e;
    }

    public final lij j() {
        T();
        return this.i0.a;
    }

    public final tuj k() {
        T();
        return (tuj) this.i0.i.f;
    }

    public final int l() {
        if (this.i0.a.p()) {
            return this.j0;
        }
        eke ekeVar = this.i0;
        return ekeVar.a.g(ekeVar.b.a, this.n).c;
    }

    public final long m() {
        T();
        if (!u()) {
            lij j = j();
            return j.p() ? C.TIME_UNSET : lik.F(j.m(g(), this.a, 0L).l);
        }
        eke ekeVar = this.i0;
        rcc rccVar = ekeVar.b;
        lij lijVar = ekeVar.a;
        Object obj = rccVar.a;
        hij hijVar = this.n;
        lijVar.g(obj, hijVar);
        return lik.F(hijVar.a(rccVar.b, rccVar.c));
    }

    public final boolean n() {
        T();
        return this.i0.l;
    }

    public final int o() {
        T();
        return this.i0.e;
    }

    public final vt4 q() {
        T();
        return this.h.c();
    }

    public final boolean r(int i) {
        T();
        return this.O.a.a.get(i);
    }

    public final boolean s() {
        lij j = j();
        return !j.p() && j.m(g(), this.a, 0L).a();
    }

    public final boolean u() {
        T();
        return this.i0.b.a();
    }

    public final eke v(eke ekeVar, lij lijVar, Pair pair) {
        List list;
        qx9.r(lijVar.p() || pair != null);
        lij lijVar2 = ekeVar.a;
        eke g = ekeVar.g(lijVar);
        if (lijVar.p()) {
            rcc rccVar = eke.s;
            long y = lik.y(this.k0);
            psj psjVar = psj.d;
            gtj gtjVar = this.b;
            av9 av9Var = hv9.b;
            eke a = g.b(rccVar, y, y, y, 0L, psjVar, gtjVar, vvf.e).a(rccVar);
            a.p = a.r;
            return a;
        }
        Object obj = g.b.a;
        int i = lik.a;
        boolean equals = obj.equals(pair.first);
        rcc rccVar2 = !equals ? new rcc(pair.first) : g.b;
        long longValue = ((Long) pair.second).longValue();
        long y2 = lik.y(d());
        if (!lijVar2.p()) {
            y2 -= lijVar2.g(obj, this.n).e;
        }
        if (!equals || longValue < y2) {
            rcc rccVar3 = rccVar2;
            qx9.t(!rccVar3.a());
            psj psjVar2 = !equals ? psj.d : g.h;
            gtj gtjVar2 = !equals ? this.b : g.i;
            if (equals) {
                list = g.j;
            } else {
                av9 av9Var2 = hv9.b;
                list = vvf.e;
            }
            eke a2 = g.b(rccVar3, longValue, longValue, longValue, 0L, psjVar2, gtjVar2, list).a(rccVar3);
            a2.p = longValue;
            return a2;
        }
        if (longValue != y2) {
            rcc rccVar4 = rccVar2;
            qx9.t(!rccVar4.a());
            long max = Math.max(0L, g.q - (longValue - y2));
            long j = g.p;
            if (g.k.equals(g.b)) {
                j = longValue + max;
            }
            eke b = g.b(rccVar4, longValue, longValue, longValue, max, g.h, g.i, g.j);
            b.p = j;
            return b;
        }
        int b2 = lijVar.b(g.k.a);
        if (b2 != -1 && lijVar.f(b2, this.n, false).c == lijVar.g(rccVar2.a, this.n).c) {
            return g;
        }
        lijVar.g(rccVar2.a, this.n);
        boolean a3 = rccVar2.a();
        hij hijVar = this.n;
        long a4 = a3 ? hijVar.a(rccVar2.b, rccVar2.c) : hijVar.d;
        rcc rccVar5 = rccVar2;
        eke a5 = g.b(rccVar5, g.r, g.r, g.d, a4 - g.r, g.h, g.i, g.j).a(rccVar5);
        a5.p = a4;
        return a5;
    }

    public final Pair w(lij lijVar, int i, long j) {
        if (lijVar.p()) {
            this.j0 = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.k0 = j;
            return null;
        }
        if (i == -1 || i >= lijVar.o()) {
            i = lijVar.a(this.G);
            j = lik.F(lijVar.m(i, this.a, 0L).k);
        }
        return lijVar.i(this.a, this.n, i, lik.y(j));
    }

    public final void x(int i, int i2) {
        mjh mjhVar = this.Y;
        if (i == mjhVar.a && i2 == mjhVar.b) {
            return;
        }
        this.Y = new mjh(i, i2);
        this.l.k(24, new cg6(i, i2, 1));
    }

    public final void y() {
        T();
        boolean n = n();
        int c = this.A.c(2, n);
        Q(c, (!n || c == 1) ? 1 : 2, n);
        eke ekeVar = this.i0;
        if (ekeVar.e != 1) {
            return;
        }
        eke d = ekeVar.d(null);
        eke f = d.f(d.a.p() ? 4 : 2);
        this.H++;
        yqi yqiVar = this.k.h;
        yqiVar.getClass();
        wqi b = yqi.b();
        b.a = yqiVar.a.obtainMessage(0);
        b.b();
        R(f, 1, 1, false, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void z() {
        boolean z;
        yt4 yt4Var;
        AudioTrack audioTrack;
        Integer.toHexString(System.identityHashCode(this));
        int i = lik.a;
        HashSet hashSet = jh6.a;
        synchronized (jh6.class) {
            HashSet hashSet2 = jh6.a;
        }
        m6k.Q();
        T();
        if (lik.a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.z.m();
        chi chiVar = this.B;
        d dVar = chiVar.e;
        if (dVar != null) {
            try {
                chiVar.a.unregisterReceiver(dVar);
            } catch (RuntimeException e) {
                m6k.g0("Error unregistering stream volume receiver", e);
            }
            chiVar.e = null;
        }
        this.C.getClass();
        this.D.getClass();
        rn0 rn0Var = this.A;
        rn0Var.c = null;
        rn0Var.a();
        hh6 hh6Var = this.k;
        synchronized (hh6Var) {
            if (!hh6Var.x && hh6Var.i.isAlive()) {
                hh6Var.h.c(7);
                hh6Var.f0(new uf6(hh6Var, 3));
                z = hh6Var.x;
            }
            z = true;
        }
        if (!z) {
            this.l.k(10, new cp4(27));
        }
        rd4 rd4Var = this.l;
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) rd4Var.e;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            tdb tdbVar = (tdb) it.next();
            rdb rdbVar = (rdb) rd4Var.d;
            tdbVar.d = true;
            if (tdbVar.c) {
                tdbVar.c = false;
                rdbVar.b(tdbVar.a, tdbVar.b.c());
            }
        }
        copyOnWriteArraySet.clear();
        rd4Var.a = true;
        this.i.a.removeCallbacksAndMessages(null);
        sn4 sn4Var = this.t;
        bn4 bn4Var = this.r;
        CopyOnWriteArrayList copyOnWriteArrayList = sn4Var.b.a;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            gz0 gz0Var = (gz0) it2.next();
            if (gz0Var.b == bn4Var) {
                gz0Var.c = true;
                copyOnWriteArrayList.remove(gz0Var);
            }
        }
        eke f = this.i0.f(1);
        this.i0 = f;
        eke a = f.a(f.b);
        this.i0 = a;
        a.p = a.r;
        this.i0.q = 0L;
        bn4 bn4Var2 = this.r;
        yqi yqiVar = bn4Var2.h;
        qx9.u(yqiVar);
        yqiVar.a.post(new wb3(bn4Var2, 5));
        hu4 hu4Var = this.h;
        synchronized (hu4Var.c) {
            try {
                if (lik.a >= 32 && (yt4Var = hu4Var.h) != null) {
                    yt4Var.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hu4Var.a = null;
        hu4Var.b = null;
        B();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.c0 = n74.b;
    }
}
