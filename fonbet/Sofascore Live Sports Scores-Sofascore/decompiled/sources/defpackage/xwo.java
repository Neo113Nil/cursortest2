package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zza;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabk;
import com.google.android.gms.internal.ads.zzabl;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzao;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzas;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzav;
import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbe;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzht;
import com.google.android.gms.internal.ads.zzjg;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzjx;
import com.google.android.gms.internal.ads.zzlv;
import com.google.android.gms.internal.ads.zzmb;
import com.google.android.gms.internal.ads.zzmc;
import com.google.android.gms.internal.ads.zzmd;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zzmf;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zznf;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zznh;
import com.google.android.gms.internal.ads.zznl;
import com.google.android.gms.internal.ads.zznm;
import com.google.android.gms.internal.ads.zznp;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzqj;
import com.google.android.gms.internal.ads.zzuk;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzwq;
import com.google.android.gms.internal.ads.zzxg;
import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzxm;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxq;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzi;
import com.google.android.gms.internal.ads.zzzj;
import com.google.android.gms.internal.ads.zzzr;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xwo implements Handler.Callback, zzxl, zzabk, zzmu, zzjk, zzmy, zzcc, zzaea {
    public static final long c0 = zzfm.t(Ua.s);
    public boolean A;
    public boolean B;
    public wwo C;
    public int D;
    public eyo E;
    public zzlv F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public wwo Q;
    public long R;
    public long S;
    public int T;
    public boolean U;
    public zzjn V;
    public long W;
    public zzjx X;
    public long Y;
    public boolean Z;
    public final tyf[] a;
    public float a0;
    public final zzng[] b;
    public final zzjg b0;
    public final boolean[] c;
    public final zzabl d;
    public final zzabm e;
    public final zzmc f;
    public final zzea g;
    public final zzmx h;
    public final Looper i;
    public final zzbe j;
    public final zzbd k;
    public final long l;
    public final ar4 m;
    public final ArrayList n;
    public final zzdp o;
    public final d1l p;
    public final d7c q;
    public final tdc r;
    public final zzqj s;
    public final zznq t;
    public final zzea u;
    public final boolean v;
    public final zzcd w;
    public boolean x;
    public zznm y;
    public zznl z;

    public xwo(Context context, zzne[] zzneVarArr, zzne[] zzneVarArr2, zzabl zzablVar, zzabm zzabmVar, zzmc zzmcVar, zzabu zzabuVar, zzpv zzpvVar, zzjg zzjgVar, Looper looper, zzdp zzdpVar, d1l d1lVar, zzqj zzqjVar, final zzaea zzaeaVar) {
        Looper looper2;
        zznm zznmVar = zznm.c;
        zzjx zzjxVar = zzjx.a;
        this.Y = C.TIME_UNSET;
        this.p = d1lVar;
        this.d = zzablVar;
        this.e = zzabmVar;
        this.f = zzmcVar;
        boolean z = false;
        this.M = 0;
        this.N = false;
        this.y = zznmVar;
        this.b0 = zzjgVar;
        this.H = false;
        this.o = zzdpVar;
        this.s = zzqjVar;
        this.X = zzjxVar;
        this.t = zzpvVar;
        this.a0 = 1.0f;
        this.z = zznl.b;
        this.x = true;
        this.W = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
        this.l = zzmcVar.zzf();
        zzmcVar.zzg();
        uln ulnVar = zzbf.a;
        eyo a = eyo.a(zzabmVar);
        this.E = a;
        this.F = new zzlv(a);
        int length = zzneVarArr.length;
        this.b = new zzng[2];
        this.c = new boolean[2];
        zznf d = zzablVar.d();
        this.a = new tyf[2];
        boolean z2 = false;
        for (int i = 0; i < 2; i++) {
            zzneVarArr[i].G(i, zzqjVar, zzdpVar);
            this.b[i] = zzneVarArr[i].zzb();
            this.b[i].b(d);
            zzne zzneVar = zzneVarArr2[i];
            if (zzneVar != null) {
                zzneVar.G(i, zzqjVar, zzdpVar);
                z2 = true;
            }
            this.a[i] = new tyf(i, zzneVarArr[i], zzneVarArr2[i]);
        }
        this.v = z2;
        this.m = new ar4(this);
        this.n = new ArrayList();
        this.j = new zzbe();
        this.k = new zzbd();
        zzguk.f(zzablVar.a == null);
        zzablVar.a = this;
        zzablVar.b = zzabuVar;
        this.U = true;
        d8o a2 = zzdpVar.a(looper, null);
        this.u = a2;
        this.q = new d7c(zzpvVar, a2, new xto(this, 3));
        this.r = new tdc(this, zzpvVar, a2, zzqjVar, zzabuVar);
        zzmx zzmxVar = new zzmx(0);
        this.h = zzmxVar;
        synchronized (zzmxVar.a) {
            try {
                looper2 = zzmxVar.b;
                if (looper2 == null) {
                    if (zzmxVar.d == 0 && zzmxVar.c == null) {
                        z = true;
                    }
                    zzguk.f(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    zzmxVar.c = handlerThread;
                    handlerThread.start();
                    looper2 = zzmxVar.c.getLooper();
                    zzmxVar.b = looper2;
                }
                zzmxVar.d++;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = looper2;
        d8o a3 = zzdpVar.a(looper2, this);
        this.g = a3;
        this.w = new zzcd(context, looper2, this);
        a3.h(35, new zzaea() { // from class: hwo
            @Override // com.google.android.gms.internal.ads.zzaea
            public final /* synthetic */ void b(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
                xwo.this.b(j, j2, zzvVar, mediaFormat);
            }
        }).a();
        a3.h(39, new lwo()).a();
    }

    public static Pair A(zzbf zzbfVar, wwo wwoVar, int i, boolean z, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2 = wwoVar.a;
        if (zzbfVar.g()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.g() ? zzbfVar : zzbfVar2;
        try {
            Pair m = zzbfVar3.m(zzbeVar, zzbdVar, wwoVar.b, wwoVar.c);
            if (!zzbfVar.equals(zzbfVar3)) {
                int e = zzbfVar.e(m.first);
                Object obj = m.first;
                if (e == -1) {
                    int X = X(zzbeVar, zzbdVar, i, z, obj, zzbfVar3, zzbfVar);
                    if (X != -1) {
                        return zzbfVar.m(zzbeVar, zzbdVar, X, C.TIME_UNSET);
                    }
                    return null;
                }
                if (zzbfVar3.o(obj, zzbdVar).e && zzbfVar3.b(zzbdVar.c, zzbeVar, 0L).k == zzbfVar3.e(m.first)) {
                    return zzbfVar.m(zzbeVar, zzbdVar, zzbfVar.o(m.first, zzbdVar).c, wwoVar.c);
                }
            }
            return m;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final boolean B(jxo jxoVar) {
        if (jxoVar != null) {
            try {
                zzxg zzxgVar = jxoVar.a;
                if (jxoVar.e) {
                    zzzg[] zzzgVarArr = jxoVar.c;
                    for (int i = 0; i < 2; i++) {
                        zzzg zzzgVar = zzzgVarArr[i];
                        if (zzzgVar != null) {
                            zzzgVar.zzb();
                        }
                    }
                } else {
                    zzxgVar.zzm();
                }
                if ((!jxoVar.e ? 0L : zzxgVar.zzc()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int X(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.b(zzbfVar3.o(obj, zzbdVar).c, zzbeVar, 0L).a;
        for (int i2 = 0; i2 < zzbfVar2.a(); i2++) {
            if (zzbfVar2.b(i2, zzbeVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int e = zzbfVar3.e(obj);
        int c = zzbfVar3.c();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            if (i4 >= c || i3 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int l = zzbfVar4.l(e, zzbdVar, zzbeVar2, i, z);
            if (l == -1) {
                i3 = -1;
                break;
            }
            i3 = zzbfVar2.e(zzbfVar4.f(l));
            i4++;
            zzbfVar3 = zzbfVar4;
            e = l;
            zzbeVar2 = zzbeVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return zzbfVar2.d(i3, zzbdVar, false).c;
    }

    public final void C() {
        for (int i = 0; i < 2; i++) {
            tyf[] tyfVarArr = this.a;
            int D = tyfVarArr[i].D();
            tyf tyfVar = tyfVarArr[i];
            zzne zzneVar = (zzne) tyfVar.e;
            zzne zzneVar2 = (zzne) tyfVar.f;
            ar4 ar4Var = this.m;
            tyfVar.v(zzneVar, ar4Var);
            if (zzneVar2 != null) {
                boolean z = (zzneVar2.zze() == 0 || tyfVar.d == 3) ? false : true;
                tyfVar.v(zzneVar2, ar4Var);
                tyfVar.w(false);
                if (z) {
                    zzne zzneVar3 = (zzne) tyfVar.e;
                    zzneVar2.getClass();
                    zzneVar2.f(17, zzneVar3);
                }
            }
            tyfVar.d = 0;
            n(i, false);
            this.P -= D;
        }
        this.Y = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: RuntimeException -> 0x0042, TryCatch #0 {RuntimeException -> 0x0042, blocks: (B:37:0x0033, B:17:0x003e, B:15:0x0038, B:29:0x0045), top: B:36:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D() {
        boolean z;
        zzne zzneVar;
        if (!this.v || !W()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = 2;
            if (i >= 2) {
                this.Y = C.TIME_UNSET;
                return;
            }
            tyf tyfVar = this.a[i];
            int D = tyfVar.D();
            ar4 ar4Var = this.m;
            if (tyfVar.C()) {
                int i3 = tyfVar.d;
                if (i3 == 4) {
                    i2 = i3;
                } else if (i3 != 2) {
                    i2 = i3;
                    z = false;
                    if (z) {
                        zzneVar = (zzne) tyfVar.f;
                        if (zzneVar == null) {
                            throw null;
                        }
                        tyfVar.v(zzneVar, ar4Var);
                        tyfVar.w(z);
                        tyfVar.d = i2 != 4 ? 0 : 1;
                    } else {
                        try {
                            zzneVar = (zzne) tyfVar.e;
                            tyfVar.v(zzneVar, ar4Var);
                        } catch (RuntimeException e) {
                            zzeh.f("Disable prewarming failed.", e);
                        }
                        try {
                            tyfVar.w(z);
                        } catch (RuntimeException e2) {
                            zzeh.f("Reset prewarming failed.", e2);
                        }
                        tyfVar.d = i2 != 4 ? 0 : 1;
                    }
                }
                z = true;
                if (z) {
                }
            }
            this.P -= D - tyfVar.D();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        int i;
        int i2;
        int i3;
        boolean z;
        ar4 ar4Var = this.m;
        float f = ar4Var.zzj().a;
        d7c d7cVar = this.q;
        jxo jxoVar = (jxo) d7cVar.l;
        jxo jxoVar2 = (jxo) d7cVar.m;
        zzabm zzabmVar = null;
        jxo jxoVar3 = jxoVar;
        boolean z2 = true;
        while (jxoVar3 != null && jxoVar3.e) {
            zzabm f2 = jxoVar3.f(this.E.a);
            zzabm zzabmVar2 = jxoVar3 == ((jxo) d7cVar.l) ? f2 : zzabmVar;
            zzabm zzabmVar3 = jxoVar3.o;
            zzabe[] zzabeVarArr = f2.c;
            boolean z3 = false;
            if (zzabmVar3.c.length == zzabeVarArr.length) {
                for (int i4 = 0; i4 < zzabeVarArr.length; i4++) {
                    if (f2.b(zzabmVar3, i4)) {
                    }
                }
                z2 &= jxoVar3 != jxoVar2;
                jxoVar3 = jxoVar3.m;
                zzabmVar = zzabmVar2;
            }
            if (z2) {
                jxo jxoVar4 = (jxo) d7cVar.l;
                int N = d7cVar.N(jxoVar4) & 1;
                tyf[] tyfVarArr = this.a;
                boolean[] zArr = new boolean[2];
                zzabmVar2.getClass();
                long g = jxoVar4.g(zzabmVar2, this.E.r, 1 == N, zArr);
                eyo eyoVar = this.E;
                if (eyoVar.e == 4 || g == eyoVar.r) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                eyo eyoVar2 = this.E;
                boolean z4 = z;
                boolean z5 = z3;
                i = 4;
                this.E = O(eyoVar2.b, g, eyoVar2.c, eyoVar2.d, z5, 5);
                if (z5) {
                    t(g, true);
                }
                D();
                boolean[] zArr2 = new boolean[2];
                int i5 = z4;
                for (int i6 = 2; i5 < i6; i6 = 2) {
                    int D = tyfVarArr[i5].D();
                    zArr2[i5] = tyfVarArr[i5].t();
                    tyf tyfVar = tyfVarArr[i5];
                    zzzg zzzgVar = jxoVar4.c[i5];
                    long j = this.R;
                    boolean z6 = zArr[i5];
                    zzne zzneVar = (zzne) tyfVar.e;
                    if (tyf.y(zzneVar)) {
                        if (zzzgVar != zzneVar.H()) {
                            tyfVar.v(zzneVar, ar4Var);
                        } else if (z6) {
                            zzneVar.z(j, true);
                        }
                    }
                    zzne zzneVar2 = (zzne) tyfVar.f;
                    if (zzneVar2 != null && tyf.y(zzneVar2)) {
                        if (zzzgVar != zzneVar2.H()) {
                            tyfVar.v(zzneVar2, ar4Var);
                        } else if (z6) {
                            zzneVar2.z(j, true);
                        }
                    }
                    if (D - tyfVarArr[i5].D() > 0) {
                        n(i5, z4);
                    }
                    this.P -= D - tyfVarArr[i5].D();
                    i5++;
                }
                P(zArr2, this.R);
                jxoVar4.h = true;
            } else {
                i = 4;
                d7cVar.N(jxoVar3);
                if (jxoVar3.e) {
                    long max = Math.max(jxoVar3.g.b, this.R - jxoVar3.p);
                    if (this.v && W() && ((jxo) d7cVar.n) == jxoVar3) {
                        D();
                    }
                    i2 = 4;
                    i3 = 2;
                    jxoVar3.g(f2, max, false, new boolean[2]);
                    R(true);
                    if (this.E.e == i2) {
                        M();
                        m();
                        this.g.g(i3);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            i3 = 2;
            R(true);
            if (this.E.e == i2) {
            }
        }
    }

    public final boolean F() {
        jxo jxoVar = (jxo) this.q.l;
        long j = jxoVar.g.e;
        if (jxoVar.e) {
            return j == C.TIME_UNSET || this.E.r < j || !U();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0260, code lost:
    
        r13.f.getClass();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a4 A[Catch: all -> 0x03aa, TRY_ENTER, TryCatch #7 {all -> 0x03aa, blocks: (B:112:0x03a4, B:113:0x03b2, B:115:0x03b8, B:53:0x03cc, B:77:0x03dd, B:79:0x03e7, B:81:0x03ef), top: B:51:0x035f }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b2 A[Catch: all -> 0x03aa, TryCatch #7 {all -> 0x03aa, blocks: (B:112:0x03a4, B:113:0x03b2, B:115:0x03b8, B:53:0x03cc, B:77:0x03dd, B:79:0x03e7, B:81:0x03ef), top: B:51:0x035f }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x041f  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r35v0, types: [xwo] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r8v23, types: [com.google.android.gms.internal.ads.zzne] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(zzbf zzbfVar, boolean z) {
        long j;
        boolean z2;
        boolean z3;
        long j2;
        zzbd zzbdVar;
        zzxo zzxoVar;
        zzbf zzbfVar2;
        int i;
        Object obj;
        long j3;
        int i2;
        long j4;
        boolean z4;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        zzbd zzbdVar2;
        Object obj2;
        long j5;
        zzxo T;
        zzbf zzbfVar3;
        int i4;
        zzxo zzxoVar2;
        int i5;
        int i6;
        boolean z8;
        boolean z9;
        long j6;
        long j7;
        boolean z10;
        int i7;
        Object obj3;
        zzbd zzbdVar3;
        boolean z11;
        zzxo zzxoVar3;
        long j8;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r8;
        boolean z15;
        int i8;
        zzbf zzbfVar4;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        long longValue;
        Object obj4;
        boolean z16;
        boolean z17;
        Object obj5;
        boolean z18;
        int i12;
        ?? r12;
        zzbf zzbfVar5;
        zzxo zzxoVar4;
        wwo wwoVar;
        boolean z19;
        int i13;
        ?? r13;
        long j9;
        long j10;
        int i14;
        wwo wwoVar2;
        ?? r132;
        long I;
        int i15;
        int R;
        ?? r133;
        wwo wwoVar3;
        long j11;
        long j12;
        int i16;
        wwo wwoVar4;
        d7c d7cVar;
        long j13;
        boolean z20;
        eyo eyoVar = this.E;
        wwo wwoVar5 = this.Q;
        zzbd zzbdVar4 = this.k;
        int i17 = this.M;
        boolean z21 = this.N;
        boolean z22 = this.x;
        if (zzbfVar.g()) {
            zzxo zzxoVar5 = eyo.t;
            zzxo zzxoVar6 = eyoVar.b;
            boolean z23 = (zzxoVar5.equals(zzxoVar6) && eyoVar.r == 0) ? false : true;
            if (z23 && z) {
                zzbf zzbfVar6 = eyoVar.a;
                if (!zzbfVar6.g() && !zzbfVar6.o(zzxoVar6.a, zzbdVar4).e) {
                    z20 = true;
                    zzxoVar3 = zzxoVar5;
                    i8 = 4;
                    j8 = 0;
                    j6 = 0;
                    z13 = false;
                    r8 = 1;
                    z15 = false;
                    j = C.TIME_UNSET;
                    j5 = C.TIME_UNSET;
                    zzbfVar3 = zzbfVar;
                    z14 = z20;
                    z12 = z23;
                }
            }
            z20 = false;
            zzxoVar3 = zzxoVar5;
            i8 = 4;
            j8 = 0;
            j6 = 0;
            z13 = false;
            r8 = 1;
            z15 = false;
            j = C.TIME_UNSET;
            j5 = C.TIME_UNSET;
            zzbfVar3 = zzbfVar;
            z14 = z20;
            z12 = z23;
        } else {
            zzxo zzxoVar7 = eyoVar.b;
            Object obj6 = zzxoVar7.a;
            zzbf zzbfVar7 = eyoVar.a;
            if (zzbfVar7.g()) {
                j = C.TIME_UNSET;
            } else {
                j = C.TIME_UNSET;
                if (!zzbfVar7.o(zzxoVar7.a, zzbdVar4).e) {
                    z2 = false;
                    if (!zzxoVar7.b() || z2) {
                        z3 = z2;
                        j2 = eyoVar.c;
                    } else {
                        z3 = z2;
                        j2 = eyoVar.r;
                    }
                    zzbe zzbeVar = this.j;
                    if (wwoVar5 == null) {
                        zzxoVar = zzxoVar7;
                        zzbfVar2 = zzbfVar;
                        Pair A = A(zzbfVar2, wwoVar5, i17, z21, zzbeVar, zzbdVar4);
                        if (A == null) {
                            i2 = zzbfVar2.k(z21);
                            obj5 = obj6;
                            longValue = j2;
                            z17 = false;
                            z18 = true;
                            z16 = false;
                        } else {
                            long j14 = wwoVar5.c;
                            Object obj7 = A.first;
                            if (j14 == j) {
                                i2 = zzbfVar2.o(obj7, zzbdVar4).c;
                                obj4 = obj6;
                                longValue = j2;
                                z16 = false;
                            } else {
                                longValue = ((Long) A.second).longValue();
                                obj4 = obj7;
                                i2 = -1;
                                z16 = true;
                            }
                            z17 = eyoVar.e == 4;
                            obj5 = obj4;
                            z18 = false;
                        }
                        j3 = longValue;
                        zzbdVar = zzbdVar4;
                        z6 = z18;
                        obj = obj5;
                        i3 = -1;
                        z5 = z17;
                        z4 = z16;
                        i = 1;
                    } else {
                        zzbdVar = zzbdVar4;
                        zzxoVar = zzxoVar7;
                        zzbfVar2 = zzbfVar;
                        zzbf zzbfVar8 = eyoVar.a;
                        if (zzbfVar8.g()) {
                            i2 = zzbfVar2.k(z21);
                            obj = obj6;
                            j3 = j2;
                            i3 = -1;
                            z5 = false;
                            i = 1;
                        } else if (zzbfVar2.e(obj6) == -1) {
                            i = 1;
                            int X = X(zzbeVar, zzbdVar, i17, z21, obj6, zzbfVar8, zzbfVar2);
                            zzbeVar = zzbeVar;
                            zzbfVar2 = zzbfVar2;
                            obj6 = obj6;
                            if (X == -1) {
                                i2 = zzbfVar2.k(z21);
                                z7 = true;
                            } else {
                                i2 = X;
                                z7 = false;
                            }
                            z6 = z7;
                            obj = obj6;
                            j3 = j2;
                            i3 = -1;
                            z5 = false;
                            z4 = false;
                        } else {
                            i = 1;
                            if (j2 == j) {
                                i2 = zzbfVar2.o(obj6, zzbdVar).c;
                                obj = obj6;
                                j3 = j2;
                            } else if (z3) {
                                zzbfVar8.o(obj6, zzbdVar);
                                if (zzbfVar8.b(zzbdVar.c, zzbeVar, 0L).k == zzbfVar8.e(obj6)) {
                                    Pair m = zzbfVar2.m(zzbeVar, zzbdVar, zzbfVar2.o(obj6, zzbdVar).c, j2);
                                    zzbeVar = zzbeVar;
                                    zzbdVar = zzbdVar;
                                    obj = m.first;
                                    j4 = ((Long) m.second).longValue();
                                } else if (zzbfVar2.o(obj6, zzbdVar).d != j) {
                                    long j15 = zzbdVar.d - 1;
                                    String str = zzfm.a;
                                    j4 = Math.max(0L, Math.min(j2, j15));
                                    obj = obj6;
                                } else {
                                    obj = obj6;
                                    j4 = j2;
                                }
                                j3 = j4;
                                z4 = true;
                                i2 = -1;
                                i3 = -1;
                                z5 = false;
                                z6 = false;
                            } else {
                                obj = obj6;
                                j3 = j2;
                                i2 = -1;
                            }
                            i3 = -1;
                            z5 = false;
                        }
                        z6 = false;
                        z4 = false;
                    }
                    if (i2 == i3) {
                        zzbd zzbdVar5 = zzbdVar;
                        Pair m2 = zzbfVar2.m(zzbeVar, zzbdVar5, i2, C.TIME_UNSET);
                        zzbdVar2 = zzbdVar5;
                        Object obj8 = m2.first;
                        j3 = ((Long) m2.second).longValue();
                        obj2 = obj8;
                        j5 = j;
                    } else {
                        zzbdVar2 = zzbdVar;
                        obj2 = obj;
                        j5 = j3;
                    }
                    long j16 = j2;
                    long j17 = j3;
                    T = this.q.T(eyoVar, zzbfVar, obj2, z22, z3);
                    zzbfVar3 = zzbfVar;
                    i4 = T.e;
                    if (i4 == -1) {
                        zzxoVar2 = zzxoVar;
                        int i18 = zzxoVar2.e;
                        if (i18 == -1 || i4 < i18) {
                            i5 = 0;
                            boolean equals = obj6.equals(obj2);
                            i6 = (equals || zzxoVar2.b() || T.b() || i5 == 0) ? 0 : i;
                            zzbd o = zzbfVar3.o(obj2, zzbdVar2);
                            z8 = z2;
                            if (!z3) {
                                ?? r122 = (j16 > j5 ? 1 : (j16 == j5 ? 0 : -1));
                                z8 = r122;
                                if (r122 == 0) {
                                    boolean equals2 = obj6.equals(T.a);
                                    z8 = equals2;
                                    if (equals2) {
                                        if (zzxoVar2.b()) {
                                            o.c(zzxoVar2.b);
                                        }
                                        boolean b = T.b();
                                        z8 = b;
                                        if (b) {
                                            int i19 = T.b;
                                            o.c(i19);
                                            z8 = i19;
                                        }
                                    }
                                }
                            }
                            if (i == i6) {
                                T = zzxoVar2;
                            }
                            if (T.b()) {
                                if (T.equals(zzxoVar2)) {
                                    j7 = eyoVar.r;
                                    z9 = z5;
                                } else {
                                    zzbfVar3.o(T.a, zzbdVar2);
                                    int i20 = T.c;
                                    zza a = zzbdVar2.f.a(T.b);
                                    int i21 = 0;
                                    while (true) {
                                        int[] iArr2 = a.d;
                                        if (i21 >= iArr2.length || (i11 = iArr2[i21]) == 0 || i11 == i) {
                                            break;
                                        } else {
                                            i21++;
                                        }
                                    }
                                    z9 = z5;
                                    j7 = 0;
                                }
                                j6 = 0;
                            } else {
                                if (equals && zzxoVar2.b()) {
                                    zza a2 = zzbfVar3.o(obj2, zzbdVar2).f.a(zzxoVar2.b);
                                    a2.getClass();
                                    z9 = z5;
                                    long j18 = eyoVar.c;
                                    j6 = 0;
                                    if (j18 == j || j18 < 0) {
                                        int i22 = a2.a;
                                        int i23 = zzxoVar2.c;
                                        if (i22 > i23 && a2.d[i23] == 2) {
                                            long j19 = zzbfVar3.o(obj2, zzbdVar2).d;
                                            j7 = j19 != j ? Math.min(j19 - 1, j17) : j17;
                                            j5 = j7;
                                        }
                                    }
                                } else {
                                    z9 = z5;
                                    j6 = 0;
                                }
                                j7 = j17;
                            }
                            z10 = T.equals(zzxoVar2) || j7 != eyoVar.r;
                            i7 = zzbfVar3.e(obj6) == -1 ? 4 : 3;
                            obj3 = T.a;
                            if (obj3.equals(obj6) && (i9 = T.b) != -1) {
                                zza a3 = zzbfVar3.o(obj3, zzbdVar2).f.a(i9);
                                i10 = T.c;
                                iArr = a3.d;
                                if (i10 < iArr.length || iArr[i10] != 2) {
                                    zzbdVar3 = zzbdVar2;
                                    i7 = 0;
                                    if (z10 && z) {
                                        zzbfVar4 = eyoVar.a;
                                        if (!zzbfVar4.g() && !zzbfVar4.o(obj6, zzbdVar3).e) {
                                            z11 = true;
                                            zzxoVar3 = T;
                                            j8 = j7;
                                            z12 = z10;
                                            z13 = z9;
                                            z14 = z11;
                                            r8 = z6;
                                            z15 = z4;
                                            i8 = i7;
                                        }
                                    }
                                    z11 = false;
                                    zzxoVar3 = T;
                                    j8 = j7;
                                    z12 = z10;
                                    z13 = z9;
                                    z14 = z11;
                                    r8 = z6;
                                    z15 = z4;
                                    i8 = i7;
                                }
                            }
                            zzbdVar3 = zzbdVar2;
                            if (z10) {
                                zzbfVar4 = eyoVar.a;
                                if (!zzbfVar4.g()) {
                                    z11 = true;
                                    zzxoVar3 = T;
                                    j8 = j7;
                                    z12 = z10;
                                    z13 = z9;
                                    z14 = z11;
                                    r8 = z6;
                                    z15 = z4;
                                    i8 = i7;
                                }
                            }
                            z11 = false;
                            zzxoVar3 = T;
                            j8 = j7;
                            z12 = z10;
                            z13 = z9;
                            z14 = z11;
                            r8 = z6;
                            z15 = z4;
                            i8 = i7;
                        }
                    } else {
                        zzxoVar2 = zzxoVar;
                    }
                    i5 = i;
                    boolean equals3 = obj6.equals(obj2);
                    if (equals3) {
                    }
                    zzbd o2 = zzbfVar3.o(obj2, zzbdVar2);
                    z8 = z2;
                    if (!z3) {
                    }
                    if (i == i6) {
                    }
                    if (T.b()) {
                    }
                    if (T.equals(zzxoVar2)) {
                    }
                    if (zzbfVar3.e(obj6) == -1) {
                    }
                    obj3 = T.a;
                    if (obj3.equals(obj6)) {
                        zza a32 = zzbfVar3.o(obj3, zzbdVar2).f.a(i9);
                        i10 = T.c;
                        iArr = a32.d;
                        if (i10 < iArr.length) {
                        }
                        zzbdVar3 = zzbdVar2;
                        i7 = 0;
                        if (z10) {
                        }
                        z11 = false;
                        zzxoVar3 = T;
                        j8 = j7;
                        z12 = z10;
                        z13 = z9;
                        z14 = z11;
                        r8 = z6;
                        z15 = z4;
                        i8 = i7;
                    }
                    zzbdVar3 = zzbdVar2;
                    if (z10) {
                    }
                    z11 = false;
                    zzxoVar3 = T;
                    j8 = j7;
                    z12 = z10;
                    z13 = z9;
                    z14 = z11;
                    r8 = z6;
                    z15 = z4;
                    i8 = i7;
                }
            }
            z2 = true;
            if (zzxoVar7.b()) {
            }
            z3 = z2;
            j2 = eyoVar.c;
            zzbe zzbeVar2 = this.j;
            if (wwoVar5 == null) {
            }
            if (i2 == i3) {
            }
            long j162 = j2;
            long j172 = j3;
            T = this.q.T(eyoVar, zzbfVar, obj2, z22, z3);
            zzbfVar3 = zzbfVar;
            i4 = T.e;
            if (i4 == -1) {
            }
            i5 = i;
            boolean equals32 = obj6.equals(obj2);
            if (equals32) {
            }
            zzbd o22 = zzbfVar3.o(obj2, zzbdVar2);
            z8 = z2;
            if (!z3) {
            }
            if (i == i6) {
            }
            if (T.b()) {
            }
            if (T.equals(zzxoVar2)) {
            }
            if (zzbfVar3.e(obj6) == -1) {
            }
            obj3 = T.a;
            if (obj3.equals(obj6)) {
            }
            zzbdVar3 = zzbdVar2;
            if (z10) {
            }
            z11 = false;
            zzxoVar3 = T;
            j8 = j7;
            z12 = z10;
            z13 = z9;
            z14 = z11;
            r8 = z6;
            z15 = z4;
            i8 = i7;
        }
        if (r8 != 0) {
            try {
                r12 = 1;
                if (this.E.e != 1) {
                    try {
                        e(4);
                    } catch (Throwable th) {
                        th = th;
                        zzxo zzxoVar8 = zzxoVar3;
                        zzbfVar5 = zzbfVar3;
                        zzxoVar4 = zzxoVar8;
                        wwoVar = null;
                        z19 = z14;
                        i13 = i8;
                        r13 = 0;
                        eyo eyoVar2 = this.E;
                        zzbf zzbfVar9 = eyoVar2.a;
                        zzxo zzxoVar9 = eyoVar2.b;
                        zzxo zzxoVar10 = zzxoVar4;
                        H(zzbfVar5, zzxoVar10, zzbfVar9, zzxoVar9, true == z15 ? j : j8, false);
                        if (!z12) {
                        }
                        if (z19) {
                        }
                        this.E = O(zzxoVar10, j10, j5, j9, z19, i13);
                        K();
                        y(zzbfVar5, this.E.a);
                        this.E = this.E.c(zzbfVar5);
                        if (!zzbfVar5.g()) {
                        }
                        R(r13);
                        this.g.g(2);
                        throw th;
                    }
                }
                i12 = 0;
            } catch (Throwable th2) {
                th = th2;
                i12 = 0;
                zzxo zzxoVar11 = zzxoVar3;
                zzbfVar5 = zzbfVar3;
                zzxoVar4 = zzxoVar11;
                wwoVar2 = null;
                i14 = i12;
                z19 = z14;
                i13 = i8;
                wwoVar = wwoVar2;
                r13 = i14;
                eyo eyoVar22 = this.E;
                zzbf zzbfVar92 = eyoVar22.a;
                zzxo zzxoVar92 = eyoVar22.b;
                zzxo zzxoVar102 = zzxoVar4;
                H(zzbfVar5, zzxoVar102, zzbfVar92, zzxoVar92, true == z15 ? j : j8, false);
                if (!z12 || j5 != this.E.c) {
                    if (z19) {
                        j9 = this.E.d;
                        j10 = j8;
                    } else {
                        j10 = j8;
                        j9 = j10;
                    }
                    this.E = O(zzxoVar102, j10, j5, j9, z19, i13);
                }
                K();
                y(zzbfVar5, this.E.a);
                this.E = this.E.c(zzbfVar5);
                if (!zzbfVar5.g()) {
                    this.Q = wwoVar;
                }
                R(r13);
                this.g.g(2);
                throw th;
            }
            try {
                w(false, false, false, true);
            } catch (Throwable th3) {
                th = th3;
                zzxo zzxoVar112 = zzxoVar3;
                zzbfVar5 = zzbfVar3;
                zzxoVar4 = zzxoVar112;
                wwoVar2 = null;
                i14 = i12;
                z19 = z14;
                i13 = i8;
                wwoVar = wwoVar2;
                r13 = i14;
                eyo eyoVar222 = this.E;
                zzbf zzbfVar922 = eyoVar222.a;
                zzxo zzxoVar922 = eyoVar222.b;
                zzxo zzxoVar1022 = zzxoVar4;
                H(zzbfVar5, zzxoVar1022, zzbfVar922, zzxoVar922, true == z15 ? j : j8, false);
                if (!z12) {
                }
                if (z19) {
                }
                this.E = O(zzxoVar1022, j10, j5, j9, z19, i13);
                K();
                y(zzbfVar5, this.E.a);
                this.E = this.E.c(zzbfVar5);
                if (!zzbfVar5.g()) {
                }
                R(r13);
                this.g.g(2);
                throw th;
            }
        } else {
            i12 = 0;
            r12 = z8;
        }
        tyf[] tyfVarArr = this.a;
        int i24 = i12;
        zzbf zzbfVar10 = r8;
        while (true) {
            r132 = 2;
            if (i24 < 2) {
                tyf tyfVar = tyfVarArr[i24];
                ?? r82 = (zzne) tyfVar.e;
                r82.A(zzbfVar3);
                zzne zzneVar = (zzne) tyfVar.f;
                if (zzneVar != null) {
                    zzneVar.A(zzbfVar3);
                }
                i24++;
                zzbfVar10 = r82;
            } else {
                try {
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        if (z12) {
            zzbf zzbfVar11 = zzbfVar3;
            wwo wwoVar6 = null;
            int i25 = i12;
            wwoVar4 = wwoVar6;
            i16 = i25;
            if (!zzbfVar11.g()) {
                try {
                    d7c d7cVar2 = this.q;
                    for (jxo jxoVar = (jxo) d7cVar2.l; jxoVar != null; jxoVar = jxoVar.m) {
                        if (jxoVar.g.a.equals(zzxoVar3)) {
                            jxoVar.g = d7cVar2.S(zzbfVar11, jxoVar.g);
                        }
                    }
                    d7cVar = this.q;
                    zzxoVar4 = zzxoVar3;
                    j13 = j8;
                } catch (Throwable th5) {
                    th = th5;
                    zzxoVar4 = zzxoVar3;
                }
                try {
                    j8 = s(zzxoVar4, j13, ((jxo) d7cVar.l) != ((jxo) d7cVar.m) ? true : i25, z13);
                    wwoVar3 = wwoVar6;
                    r133 = i25;
                    eyo eyoVar3 = this.E;
                    zzxo zzxoVar12 = zzxoVar4;
                    H(zzbfVar, zzxoVar12, eyoVar3.a, eyoVar3.b, true == z15 ? j : j8, false);
                    if (!z12 || j5 != this.E.c) {
                        if (z14) {
                            j11 = this.E.d;
                            j12 = j8;
                        } else {
                            j12 = j8;
                            j11 = j12;
                        }
                        this.E = O(zzxoVar12, j12, j5, j11, z14, i8);
                    }
                    K();
                    y(zzbfVar, this.E.a);
                    this.E = this.E.c(zzbfVar);
                    if (!zzbfVar.g()) {
                        this.Q = wwoVar3;
                    }
                    R(r133);
                    this.g.g(2);
                } catch (Throwable th6) {
                    th = th6;
                    j8 = j13;
                    zzbfVar5 = zzbfVar11;
                    wwoVar2 = wwoVar6;
                    i14 = i25;
                    z19 = z14;
                    i13 = i8;
                    wwoVar = wwoVar2;
                    r13 = i14;
                    eyo eyoVar2222 = this.E;
                    zzbf zzbfVar9222 = eyoVar2222.a;
                    zzxo zzxoVar9222 = eyoVar2222.b;
                    zzxo zzxoVar10222 = zzxoVar4;
                    H(zzbfVar5, zzxoVar10222, zzbfVar9222, zzxoVar9222, true == z15 ? j : j8, false);
                    if (!z12) {
                    }
                    if (z19) {
                    }
                    this.E = O(zzxoVar10222, j10, j5, j9, z19, i13);
                    K();
                    y(zzbfVar5, this.E.a);
                    this.E = this.E.c(zzbfVar5);
                    if (!zzbfVar5.g()) {
                    }
                    R(r13);
                    this.g.g(2);
                    throw th;
                }
            }
        } else {
            try {
                d7c d7cVar3 = this.q;
                jxo jxoVar2 = (jxo) d7cVar3.m;
                long I2 = jxoVar2 == null ? j6 : I(jxoVar2);
                try {
                    try {
                        if (W()) {
                            try {
                                jxo jxoVar3 = (jxo) d7cVar3.n;
                                if (jxoVar3 != null) {
                                    I = I(jxoVar3);
                                    i15 = i12;
                                    r12 = 0;
                                    r132 = i15;
                                    R = d7cVar3.R(zzbfVar, this.R, I2, I);
                                    if ((R & 1) == 0) {
                                        j(r132);
                                        wwoVar4 = r12;
                                        i16 = r132;
                                    } else {
                                        wwoVar4 = r12;
                                        i16 = r132;
                                        if ((R & 2) != 0) {
                                            D();
                                            wwoVar4 = r12;
                                            i16 = r132;
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                wwoVar = null;
                                r13 = i12;
                                z19 = z14;
                                zzxoVar4 = zzxoVar3;
                                i13 = i8;
                                zzbfVar5 = zzbfVar;
                                eyo eyoVar22222 = this.E;
                                zzbf zzbfVar92222 = eyoVar22222.a;
                                zzxo zzxoVar92222 = eyoVar22222.b;
                                zzxo zzxoVar102222 = zzxoVar4;
                                H(zzbfVar5, zzxoVar102222, zzbfVar92222, zzxoVar92222, true == z15 ? j : j8, false);
                                if (!z12) {
                                }
                                if (z19) {
                                }
                                this.E = O(zzxoVar102222, j10, j5, j9, z19, i13);
                                K();
                                y(zzbfVar5, this.E.a);
                                this.E = this.E.c(zzbfVar5);
                                if (!zzbfVar5.g()) {
                                }
                                R(r13);
                                this.g.g(2);
                                throw th;
                            }
                        }
                        R = d7cVar3.R(zzbfVar, this.R, I2, I);
                        if ((R & 1) == 0) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzbfVar10 = zzbfVar;
                        z19 = z14;
                        zzxoVar4 = zzxoVar3;
                        i13 = i8;
                        zzbfVar5 = zzbfVar10;
                        wwoVar = r12;
                        r13 = r132;
                        eyo eyoVar222222 = this.E;
                        zzbf zzbfVar922222 = eyoVar222222.a;
                        zzxo zzxoVar922222 = eyoVar222222.b;
                        zzxo zzxoVar1022222 = zzxoVar4;
                        H(zzbfVar5, zzxoVar1022222, zzbfVar922222, zzxoVar922222, true == z15 ? j : j8, false);
                        if (!z12) {
                        }
                        if (z19) {
                        }
                        this.E = O(zzxoVar1022222, j10, j5, j9, z19, i13);
                        K();
                        y(zzbfVar5, this.E.a);
                        this.E = this.E.c(zzbfVar5);
                        if (!zzbfVar5.g()) {
                        }
                        R(r13);
                        this.g.g(2);
                        throw th;
                    }
                    r12 = 0;
                    r132 = i15;
                } catch (Throwable th9) {
                    th = th9;
                    zzbfVar10 = zzbfVar;
                    r12 = 0;
                    r132 = i15;
                }
                i15 = i12;
                I = j6;
            } catch (Throwable th10) {
                th = th10;
                zzbfVar10 = zzbfVar;
                r12 = 0;
                r132 = i12;
            }
        }
        zzxoVar4 = zzxoVar3;
        wwoVar3 = wwoVar4;
        r133 = i16;
        eyo eyoVar32 = this.E;
        zzxo zzxoVar122 = zzxoVar4;
        H(zzbfVar, zzxoVar122, eyoVar32.a, eyoVar32.b, true == z15 ? j : j8, false);
        if (!z12) {
        }
        if (z14) {
        }
        this.E = O(zzxoVar122, j12, j5, j11, z14, i8);
        K();
        y(zzbfVar, this.E.a);
        this.E = this.E.c(zzbfVar);
        if (!zzbfVar.g()) {
        }
        R(r133);
        this.g.g(2);
    }

    public final void H(zzbf zzbfVar, zzxo zzxoVar, zzbf zzbfVar2, zzxo zzxoVar2, long j, boolean z) {
        if (!p(zzbfVar, zzxoVar)) {
            zzav zzavVar = zzxoVar.b() ? zzav.d : this.E.o;
            ar4 ar4Var = this.m;
            if (ar4Var.zzj().equals(zzavVar)) {
                return;
            }
            this.g.d(16);
            ar4Var.e(zzavVar);
            L(this.E.o, zzavVar.a, false, false);
            return;
        }
        Object obj = zzxoVar.a;
        zzbd zzbdVar = this.k;
        int i = zzbfVar.o(obj, zzbdVar).c;
        zzbe zzbeVar = this.j;
        zzbfVar.b(i, zzbeVar, 0L);
        zzaf zzafVar = zzbeVar.h;
        String str = zzfm.a;
        zzafVar.getClass();
        long u = zzfm.u(C.TIME_UNSET);
        zzjg zzjgVar = this.b0;
        zzjgVar.c = u;
        zzjgVar.f = u;
        zzjgVar.g = u;
        zzjgVar.b();
        if (j != C.TIME_UNSET) {
            zzjgVar.d = o(zzbfVar, obj, j);
            zzjgVar.b();
            return;
        }
        if (!Objects.equals(!zzbfVar2.g() ? zzbfVar2.b(zzbfVar2.o(zzxoVar2.a, zzbdVar).c, zzbeVar, 0L).a : null, zzbeVar.a) || z) {
            zzjgVar.d = C.TIME_UNSET;
            zzjgVar.b();
        }
    }

    public final long I(jxo jxoVar) {
        if (jxoVar == null) {
            return 0L;
        }
        long j = jxoVar.p;
        if (jxoVar.e) {
            for (int i = 0; i < 2; i++) {
                tyf[] tyfVarArr = this.a;
                if (tyfVarArr[i].z(jxoVar) != null) {
                    zzne z = tyfVarArr[i].z(jxoVar);
                    Objects.requireNonNull(z);
                    long zzk = z.zzk();
                    if (zzk == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(zzk, j);
                }
            }
        }
        return j;
    }

    public final void J() {
        boolean z;
        d7c d7cVar = this.q;
        d7cVar.O();
        jxo jxoVar = (jxo) d7cVar.p;
        if (jxoVar != null) {
            zzxg zzxgVar = jxoVar.a;
            if ((!jxoVar.d || jxoVar.e) && !zzxgVar.zze()) {
                zzbf zzbfVar = this.E.a;
                if (jxoVar.e) {
                    zzxgVar.zzb();
                }
                if (this.f.zzj()) {
                    if (!jxoVar.d) {
                        long j = jxoVar.g.b;
                        jxoVar.d = true;
                        zzxgVar.e(this, j);
                        return;
                    }
                    zzmd zzmdVar = new zzmd();
                    zzmdVar.a = this.R - jxoVar.p;
                    float f = this.m.zzj().a;
                    zzguk.a(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == -3.4028235E38f);
                    zzmdVar.b = f;
                    long j2 = this.K;
                    if (j2 >= 0) {
                        z = true;
                    } else if (j2 == C.TIME_UNSET) {
                        z = true;
                        j2 = -9223372036854775807L;
                    } else {
                        z = false;
                    }
                    zzguk.a(z);
                    zzmdVar.c = j2;
                    zzme zzmeVar = new zzme(zzmdVar);
                    zzguk.f(jxoVar.m == null);
                    zzxgVar.f(zzmeVar);
                }
            }
        }
    }

    public final void K() {
        jxo jxoVar = (jxo) this.q.l;
        boolean z = false;
        if (jxoVar != null && jxoVar.g.g && this.H) {
            z = true;
        }
        this.I = z;
    }

    public final void L(zzav zzavVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.F.a(1);
            }
            eyo eyoVar = this.E;
            this.E = new eyo(eyoVar.a, eyoVar.b, eyoVar.c, eyoVar.d, eyoVar.e, eyoVar.f, eyoVar.g, eyoVar.h, eyoVar.i, eyoVar.j, eyoVar.k, eyoVar.l, eyoVar.m, eyoVar.n, zzavVar, eyoVar.p, eyoVar.q, eyoVar.r, eyoVar.s);
        }
        float f2 = zzavVar.a;
        jxo jxoVar = (jxo) this.q.l;
        while (true) {
            i = 0;
            if (jxoVar == null) {
                break;
            }
            zzabe[] zzabeVarArr = jxoVar.o.c;
            int length = zzabeVarArr.length;
            while (i < length) {
                zzabe zzabeVar = zzabeVarArr[i];
                i++;
            }
            jxoVar = jxoVar.m;
        }
        tyf[] tyfVarArr = this.a;
        while (i < 2) {
            tyf tyfVar = tyfVarArr[i];
            ((zzne) tyfVar.e).C(f, f2);
            zzne zzneVar = (zzne) tyfVar.f;
            if (zzneVar != null) {
                zzneVar.C(f, f2);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        boolean b;
        boolean z;
        d7c d7cVar = this.q;
        boolean B = B((jxo) d7cVar.o);
        long j = C.TIME_UNSET;
        if (B) {
            jxo jxoVar = (jxo) d7cVar.o;
            long S = S(!jxoVar.e ? 0L : jxoVar.a.zzc());
            jxo jxoVar2 = (jxo) d7cVar.l;
            long j2 = this.R;
            long j3 = jxoVar.p;
            if (jxoVar != jxoVar2) {
                j2 -= j3;
                j3 = jxoVar.g.b;
            }
            long j4 = j2 - j3;
            long j5 = p(this.E.a, jxoVar.g.a) ? this.b0.h : -9223372036854775807L;
            zzqj zzqjVar = this.s;
            zzbf zzbfVar = this.E.a;
            zzxo zzxoVar = jxoVar.g.a;
            float f = this.m.zzj().a;
            boolean z2 = this.E.l;
            zzmb zzmbVar = new zzmb(zzqjVar, zzbfVar, zzxoVar, j4, S, f, this.J, j5);
            zzmc zzmcVar = this.f;
            b = zzmcVar.b(zzmbVar);
            jxo jxoVar3 = (jxo) d7cVar.l;
            if (!b && jxoVar3.e && S < 500000 && this.l > 0) {
                jxoVar3.a.zzq(this.E.r);
                b = zzmcVar.b(zzmbVar);
            }
        } else {
            b = false;
        }
        this.L = b;
        if (b) {
            jxo jxoVar4 = (jxo) d7cVar.o;
            jxoVar4.getClass();
            zzmd zzmdVar = new zzmd();
            zzmdVar.a = this.R - jxoVar4.p;
            float f2 = this.m.zzj().a;
            zzguk.a(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == -3.4028235E38f);
            zzmdVar.b = f2;
            long j6 = this.K;
            if (j6 >= 0) {
                j = j6;
            } else if (j6 != C.TIME_UNSET) {
                z = false;
                j = j6;
                zzguk.a(z);
                zzmdVar.c = j;
                zzme zzmeVar = new zzme(zzmdVar);
                zzguk.f(jxoVar4.m == null);
                jxoVar4.a.f(zzmeVar);
            }
            z = true;
            zzguk.a(z);
            zzmdVar.c = j;
            zzme zzmeVar2 = new zzme(zzmdVar);
            zzguk.f(jxoVar4.m == null);
            jxoVar4.a.f(zzmeVar2);
        }
        N();
    }

    public final void N() {
        jxo jxoVar = (jxo) this.q.o;
        boolean z = true;
        if (!this.L && (jxoVar == null || !jxoVar.a.zze())) {
            z = false;
        }
        eyo eyoVar = this.E;
        if (z != eyoVar.g) {
            this.E = eyoVar.f(z);
        }
    }

    public final eyo O(zzxo zzxoVar, long j, long j2, long j3, boolean z, int i) {
        zzzr zzzrVar;
        zzabm zzabmVar;
        List list;
        s sVar;
        this.U = (!this.U && j == this.E.r && zzxoVar.equals(this.E.b)) ? false : true;
        K();
        eyo eyoVar = this.E;
        zzzr zzzrVar2 = eyoVar.h;
        zzabm zzabmVar2 = eyoVar.i;
        List list2 = eyoVar.j;
        if (this.r.g) {
            d7c d7cVar = this.q;
            jxo jxoVar = (jxo) d7cVar.l;
            zzzr zzzrVar3 = jxoVar == null ? zzzr.d : jxoVar.n;
            zzabm zzabmVar3 = jxoVar == null ? this.e : jxoVar.o;
            zzabe[] zzabeVarArr = zzabmVar3.c;
            zzgxj zzgxjVar = new zzgxj();
            boolean z2 = false;
            for (zzabe zzabeVar : zzabeVarArr) {
                if (zzabeVar != null) {
                    zzap zzapVar = zzabeVar.zzb(0).l;
                    if (zzapVar == null) {
                        zzgxjVar.c(new zzap(new zzao[0]));
                    } else {
                        zzgxjVar.c(zzapVar);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                sVar = zzgxjVar.f();
            } else {
                mio mioVar = zzgxm.b;
                sVar = s.e;
            }
            if (jxoVar != null) {
                kxo kxoVar = jxoVar.g;
                long j4 = kxoVar.d;
                if (j4 != j2) {
                    if (j2 != j4) {
                        kxoVar = new kxo(kxoVar.a, kxoVar.b, kxoVar.c, j2, kxoVar.e, kxoVar.f, kxoVar.g, kxoVar.h);
                    }
                    jxoVar.g = kxoVar;
                }
            }
            jxo jxoVar2 = (jxo) d7cVar.l;
            if (jxoVar2 == ((jxo) d7cVar.m) && jxoVar2 != null) {
                zzabm zzabmVar4 = jxoVar2.o;
                int i2 = 0;
                while (true) {
                    tyf[] tyfVarArr = this.a;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzabmVar4.a(i2)) {
                        if (((zzne) tyfVarArr[i2].e).zza() != 1) {
                            break;
                        }
                        zzabmVar4.b[i2].getClass();
                    }
                    i2++;
                }
            }
            zzzrVar = zzzrVar3;
            zzabmVar = zzabmVar3;
            list = sVar;
        } else {
            if (!zzxoVar.equals(eyoVar.b)) {
                zzabmVar2 = this.e;
                zzzrVar2 = zzzr.d;
                mio mioVar2 = zzgxm.b;
                list2 = s.e;
            }
            zzzrVar = zzzrVar2;
            zzabmVar = zzabmVar2;
            list = list2;
        }
        if (z) {
            zzlv zzlvVar = this.F;
            if (!zzlvVar.d || zzlvVar.e == 5) {
                zzlvVar.a = true;
                zzlvVar.d = true;
                zzlvVar.e = i;
            } else {
                zzguk.a(i == 5);
            }
        }
        eyo eyoVar2 = this.E;
        return eyoVar2.b(zzxoVar, j, j2, j3, S(eyoVar2.p), zzzrVar, zzabmVar, list);
    }

    public final void P(boolean[] zArr, long j) {
        tyf[] tyfVarArr;
        xwo xwoVar;
        long j2;
        jxo jxoVar = (jxo) this.q.m;
        zzabm zzabmVar = jxoVar.o;
        int i = 0;
        while (true) {
            tyfVarArr = this.a;
            if (i >= 2) {
                break;
            }
            if (!zzabmVar.a(i)) {
                tyfVarArr[i].o();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (zzabmVar.a(i2) && tyfVarArr[i2].z(jxoVar) == null) {
                xwoVar = this;
                j2 = j;
                xwoVar.Q(jxoVar, i2, zArr[i2], j2);
            } else {
                xwoVar = this;
                j2 = j;
            }
            i2++;
            this = xwoVar;
            j = j2;
        }
    }

    public final void Q(jxo jxoVar, int i, boolean z, long j) {
        tyf tyfVar = this.a[i];
        if (tyfVar.t()) {
            return;
        }
        boolean z2 = jxoVar == ((jxo) this.q.l);
        zzabm zzabmVar = jxoVar.o;
        zznh zznhVar = zzabmVar.b[i];
        zzabe zzabeVar = zzabmVar.c[i];
        boolean z3 = U() && this.E.e == 3;
        boolean z4 = !z && z3;
        this.P++;
        zzzg zzzgVar = jxoVar.c[i];
        long j2 = jxoVar.p;
        zzxo zzxoVar = jxoVar.g.a;
        int zze = zzabeVar != null ? zzabeVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[zze];
        for (int i2 = 0; i2 < zze; i2++) {
            zzabeVar.getClass();
            zzvVarArr[i2] = zzabeVar.zzb(i2);
        }
        int i3 = tyfVar.d;
        ar4 ar4Var = this.m;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            tyfVar.a = true;
            zzne zzneVar = (zzne) tyfVar.e;
            zzneVar.D(zznhVar, zzvVarArr, zzzgVar, z4, z2, j, j2, zzxoVar);
            ar4Var.f(zzneVar);
        } else {
            tyfVar.b = true;
            zzne zzneVar2 = (zzne) tyfVar.f;
            zzneVar2.getClass();
            zzneVar2.D(zznhVar, zzvVarArr, zzzgVar, z4, z2, j, j2, zzxoVar);
            ar4Var.f(zzneVar2);
        }
        gwo gwoVar = new gwo(this);
        zzne z5 = tyfVar.z(jxoVar);
        z5.getClass();
        z5.f(11, gwoVar);
        if (z3 && z2) {
            tyfVar.P();
        }
    }

    public final void R(boolean z) {
        jxo jxoVar = (jxo) this.q.o;
        zzxo zzxoVar = jxoVar == null ? this.E.b : jxoVar.g.a;
        boolean equals = this.E.k.equals(zzxoVar);
        if (!equals) {
            this.E = this.E.g(zzxoVar);
        }
        eyo eyoVar = this.E;
        eyoVar.p = jxoVar == null ? eyoVar.r : jxoVar.d();
        eyo eyoVar2 = this.E;
        eyoVar2.q = S(eyoVar2.p);
        if ((!equals || z) && jxoVar != null && jxoVar.e) {
            T(jxoVar.g.a, jxoVar.n, jxoVar.o);
        }
    }

    public final long S(long j) {
        jxo jxoVar = (jxo) this.q.o;
        if (jxoVar == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.R - jxoVar.p));
    }

    public final void T(zzxo zzxoVar, zzzr zzzrVar, zzabm zzabmVar) {
        d7c d7cVar = this.q;
        jxo jxoVar = (jxo) d7cVar.o;
        jxoVar.getClass();
        jxo jxoVar2 = (jxo) d7cVar.l;
        long j = this.R;
        long j2 = jxoVar.p;
        if (jxoVar != jxoVar2) {
            j -= j2;
            j2 = jxoVar.g.b;
        }
        long j3 = j - j2;
        long S = S(jxoVar.d());
        long j4 = p(this.E.a, jxoVar.g.a) ? this.b0.h : C.TIME_UNSET;
        zzbf zzbfVar = this.E.a;
        float f = this.m.zzj().a;
        boolean z = this.E.l;
        this.f.a(new zzmb(this.s, zzbfVar, zzxoVar, j3, S, f, this.J, j4), zzabmVar.c);
    }

    public final boolean U() {
        eyo eyoVar = this.E;
        return eyoVar.l && eyoVar.n == 0;
    }

    public final void V(int i) {
        tyf tyfVar = this.a[i];
        try {
            jxo jxoVar = (jxo) this.q.l;
            if (jxoVar == null) {
                throw null;
            }
            zzne z = tyfVar.z(jxoVar);
            z.getClass();
            z.zzn();
        } catch (IOException | RuntimeException e) {
            tyfVar.E();
            throw e;
        }
    }

    public final boolean W() {
        if (!this.v) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.a[i].C()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void a(zzna zznaVar) {
        if (!this.G && this.i.getThread().isAlive()) {
            this.g.h(14, zznaVar).a();
        } else {
            zzeh.c("Ignoring messages sent after release.");
            zznaVar.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void b(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.B) {
            this.g.k(37).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void c(zzzi zzziVar) {
        this.g.h(9, (zzxm) zzziVar).a();
    }

    public final void d(int i, IOException iOException) {
        zzjn zzjnVar = new zzjn(0, iOException, i);
        jxo jxoVar = (jxo) this.q.l;
        if (jxoVar != null) {
            zzjnVar = zzjnVar.a(jxoVar.g.a);
        }
        zzeh.f("Playback error", zzjnVar);
        v(false, false);
        this.E = this.E.e(zzjnVar);
    }

    public final void e(int i) {
        eyo eyoVar = this.E;
        if (eyoVar.e != i) {
            if (i != 2) {
                this.W = C.TIME_UNSET;
            }
            this.E = eyoVar.d(i);
        }
    }

    public final void f(int i) {
        zzlv zzlvVar = this.F;
        eyo eyoVar = this.E;
        boolean z = zzlvVar.a | (zzlvVar.b != eyoVar);
        zzlvVar.a = z;
        zzlvVar.b = eyoVar;
        if (z) {
            if (!eyoVar.a.g()) {
                eyo eyoVar2 = this.E;
                boolean z2 = eyoVar2.a.e(eyoVar2.b.a) != -1;
                Locale locale = Locale.US;
                eyo eyoVar3 = this.E;
                zzguk.g(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", eyoVar3.b.a, eyoVar3.a.getClass().getName(), Integer.valueOf(this.E.a.a()), Integer.valueOf(i)), z2);
            }
            this.p.o(this.F);
            this.F = new zzlv(this.E);
        }
    }

    public final void g(float f) {
        this.a0 = f;
        float f2 = f * this.w.g;
        for (int i = 0; i < 2; i++) {
            tyf tyfVar = this.a[i];
            zzne zzneVar = (zzne) tyfVar.e;
            if (zzneVar.zza() == 1) {
                Float valueOf = Float.valueOf(f2);
                zzneVar.f(2, valueOf);
                zzne zzneVar2 = (zzne) tyfVar.f;
                if (zzneVar2 != null) {
                    zzneVar2.f(2, valueOf);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, int i2, int i3, boolean z) {
        boolean z2;
        eyo eyoVar;
        jxo jxoVar;
        if (z) {
            if (i != -1) {
                z2 = true;
                if (i != -1) {
                    i3 = 2;
                } else if (i3 == 2) {
                    i3 = 1;
                }
                boolean z3 = this.A;
                if (i != 0) {
                    i2 = 1;
                } else if (i2 == 1) {
                    i2 = z3 ? 4 : 0;
                }
                eyoVar = this.E;
                if (eyoVar.l != z2 && eyoVar.n == i2 && eyoVar.m == i3) {
                    return;
                }
                this.E = eyoVar.h(i3, i2, z2);
                z(false, false);
                d7c d7cVar = this.q;
                for (jxoVar = (jxo) d7cVar.l; jxoVar != null; jxoVar = jxoVar.m) {
                    for (zzabe zzabeVar : jxoVar.o.c) {
                    }
                }
                if (U()) {
                    l();
                    m();
                    this.E.getClass();
                    d7cVar.F(this.R);
                    return;
                }
                int i4 = this.E.e;
                zzea zzeaVar = this.g;
                if (i4 != 3) {
                    if (i4 == 2) {
                        zzeaVar.g(2);
                        return;
                    }
                    return;
                }
                ar4 ar4Var = this.m;
                ar4Var.c = true;
                zznp zznpVar = (zznp) ar4Var.d;
                if (!zznpVar.a) {
                    zznpVar.c = SystemClock.elapsedRealtime();
                    zznpVar.a = true;
                }
                k();
                zzeaVar.g(2);
                return;
            }
            i = -1;
        }
        z2 = false;
        if (i != -1) {
        }
        boolean z32 = this.A;
        if (i != 0) {
        }
        eyoVar = this.E;
        if (eyoVar.l != z2) {
        }
        this.E = eyoVar.h(i3, i2, z2);
        z(false, false);
        d7c d7cVar2 = this.q;
        while (jxoVar != null) {
        }
        if (U()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:377:0x0a60, code lost:
    
        if (r6 != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0aa2, code lost:
    
        if (r34 == false) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x06ba, code lost:
    
        if (((long) ((r2.a() - r37.R) / r37.m.zzj().a)) <= 10000000) goto L363;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07c0 A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07d4 A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, LOOP:6: B:256:0x07d0->B:258:0x07d4, LOOP_END, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x082b A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0849 A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0855 A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08bc A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, LOOP:9: B:308:0x08ba->B:309:0x08bc, LOOP_END, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08ca A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08d8 A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x08ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0b3c A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b52 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b53 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x065a A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TRY_LEAVE, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x070b A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x075e A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, LOOP:18: B:571:0x075c->B:572:0x075e, LOOP_END, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x073f A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, LOOP:19: B:576:0x073d->B:577:0x073f, LOOP_END, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x074d A[Catch: RuntimeException -> 0x055c, IOException -> 0x055e, zzwq -> 0x0560, zzht -> 0x0562, zzat -> 0x0564, zzuk -> 0x0566, zzjn -> 0x0568, TryCatch #9 {zzat -> 0x0564, zzht -> 0x0562, zzjn -> 0x0568, zzuk -> 0x0566, zzwq -> 0x0560, IOException -> 0x055e, RuntimeException -> 0x055c, blocks: (B:182:0x04ea, B:187:0x04fe, B:189:0x0506, B:191:0x0512, B:193:0x051f, B:195:0x0529, B:197:0x0531, B:198:0x057c, B:200:0x0582, B:201:0x0587, B:202:0x0590, B:204:0x0594, B:205:0x05a5, B:207:0x05ac, B:209:0x05b0, B:211:0x05b4, B:213:0x05ba, B:215:0x05c0, B:217:0x05c6, B:219:0x05ca, B:221:0x05ce, B:223:0x05e7, B:225:0x05f0, B:226:0x05f4, B:228:0x05f8, B:230:0x05fe, B:232:0x0606, B:234:0x060e, B:236:0x0624, B:240:0x062a, B:242:0x0633, B:244:0x0641, B:245:0x064d, B:248:0x07b9, B:250:0x07c0, B:252:0x07c6, B:255:0x07cb, B:256:0x07d0, B:258:0x07d4, B:263:0x07f9, B:265:0x07ff, B:269:0x080d, B:271:0x0815, B:276:0x0818, B:278:0x0821, B:332:0x08f0, B:333:0x08f5, B:335:0x08fd, B:338:0x0907, B:340:0x0915, B:341:0x092e, B:343:0x0932, B:345:0x093a, B:347:0x0963, B:348:0x093e, B:350:0x0947, B:353:0x0950, B:358:0x0960, B:364:0x096f, B:366:0x0975, B:370:0x0982, B:372:0x09be, B:374:0x09c4, B:376:0x09c8, B:379:0x0a67, B:381:0x0a72, B:383:0x0a83, B:384:0x0a8c, B:385:0x0ad1, B:388:0x0ad8, B:390:0x0adc, B:394:0x0ae9, B:396:0x0aec, B:400:0x0aef, B:402:0x0af5, B:404:0x0afe, B:406:0x0b08, B:408:0x0b0e, B:410:0x0b14, B:411:0x0b36, B:413:0x0b3c, B:416:0x0b46, B:419:0x0b61, B:424:0x0b5a, B:426:0x0b5e, B:428:0x0b1b, B:431:0x0b29, B:432:0x0b31, B:433:0x0b32, B:434:0x0a90, B:436:0x0a97, B:438:0x0a9b, B:441:0x0aa4, B:443:0x0ab3, B:445:0x0ab9, B:447:0x0ac1, B:449:0x0ac6, B:451:0x0ac9, B:452:0x0ace, B:455:0x09da, B:457:0x09de, B:459:0x09ee, B:460:0x09f7, B:462:0x0a01, B:465:0x0a0a, B:467:0x0a14, B:472:0x0a1f, B:478:0x098a, B:480:0x098e, B:481:0x09a8, B:483:0x09ae, B:485:0x0968, B:280:0x082b, B:282:0x082f, B:284:0x0835, B:286:0x0839, B:288:0x0843, B:291:0x0849, B:292:0x084d, B:294:0x0855, B:296:0x0867, B:298:0x0870, B:300:0x0878, B:303:0x0884, B:305:0x08b1, B:307:0x08b7, B:309:0x08bc, B:311:0x08c4, B:313:0x08ca, B:314:0x08cd, B:315:0x08d4, B:317:0x08d8, B:319:0x08de, B:321:0x08e3, B:329:0x08ef, B:491:0x065a, B:522:0x0672, B:529:0x0683, B:533:0x0693, B:538:0x06a3, B:543:0x06e0, B:545:0x06e7, B:547:0x06eb, B:551:0x0700, B:553:0x0704, B:557:0x070b, B:559:0x0711, B:561:0x072e, B:566:0x0737, B:572:0x075e, B:577:0x073f, B:579:0x0747, B:581:0x074d, B:582:0x06f5, B:494:0x078f, B:496:0x0795, B:498:0x0799, B:500:0x079e, B:506:0x07b6, B:507:0x07ad, B:509:0x07b3, B:682:0x05a2, B:683:0x056a, B:685:0x0573), top: B:181:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0c38 A[ADDED_TO_REGION, LOOP:20: B:625:0x0c38->B:628:0x0c3e, LOOP_START, PHI: r2
      0x0c38: PHI (r2v31 jxo) = (r2v29 jxo), (r2v32 jxo) binds: [B:624:0x0c35, B:628:0x0c3e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0c62  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        zzjn zzjnVar;
        boolean z;
        int i;
        zzxo zzxoVar;
        d7c d7cVar;
        jxo jxoVar;
        jxo jxoVar2;
        jxo jxoVar3;
        jxo jxoVar4;
        int i2;
        zzd zzdVar;
        long uptimeMillis;
        zzea zzeaVar;
        eyo eyoVar;
        int i3;
        long j;
        zzjn zzjnVar2;
        boolean z2;
        boolean z3;
        long j2;
        long j3;
        int i4;
        boolean z4;
        boolean g;
        long j4;
        jxo jxoVar5;
        d7c d7cVar2;
        int i5;
        long j5;
        d7c d7cVar3;
        int i6;
        int i7;
        int i8;
        jxo jxoVar6;
        boolean z5;
        jxo jxoVar7;
        jxo jxoVar8;
        jxo M;
        boolean z6;
        int i9;
        int i10;
        zzabm zzabmVar;
        int i11;
        int i12;
        tyf[] tyfVarArr;
        jxo jxoVar9;
        jxo jxoVar10;
        boolean z7;
        jxo jxoVar11;
        long j6;
        kxo H;
        Message message2 = message;
        try {
            try {
                i2 = 8;
                zzdVar = null;
            } catch (RuntimeException e) {
                e = e;
            }
        } catch (zzat e2) {
            e = e2;
        } catch (zzht e3) {
            e = e3;
        } catch (zzjn e4) {
            e = e4;
        } catch (zzuk e5) {
            e = e5;
        } catch (zzwq e6) {
            e = e6;
        } catch (IOException e7) {
            e = e7;
        }
        switch (message2.what) {
            case 1:
                boolean z8 = message2.arg1 != 0;
                int i13 = message2.arg2;
                this.F.a(1);
                h(this.w.b(this.E.e, z8), i13 >> 4, i13 & 15, z8);
                z = true;
                f(message2.what);
                return z;
            case 2:
                z = true;
                boolean z9 = false;
                try {
                    uptimeMillis = SystemClock.uptimeMillis();
                    zzeaVar = this.g;
                    zzeaVar.d(2);
                    eyoVar = this.E;
                    i3 = eyoVar.e;
                } catch (zzat e8) {
                    e = e8;
                } catch (zzht e9) {
                    e = e9;
                } catch (zzjn e10) {
                    e = e10;
                } catch (zzuk e11) {
                    e = e11;
                } catch (zzwq e12) {
                    e = e12;
                } catch (IOException e13) {
                    e = e13;
                } catch (RuntimeException e14) {
                    e = e14;
                }
                if (i3 == 1) {
                    message2 = message;
                } else if (i3 != 4) {
                    if (eyoVar.a.g() || !this.r.g) {
                        j = uptimeMillis;
                        zzjnVar2 = null;
                    } else {
                        d7c d7cVar4 = this.q;
                        d7cVar4.F(this.R);
                        if (!d7cVar4.G() || (H = d7cVar4.H(this.R, this.E)) == null) {
                            j4 = C.TIME_UNSET;
                        } else {
                            jxo I = d7cVar4.I(H);
                            if (I.d) {
                                j4 = C.TIME_UNSET;
                                if (I.e) {
                                    zzeaVar.h(8, I.a).a();
                                }
                            } else {
                                j4 = C.TIME_UNSET;
                                long j7 = H.b;
                                I.d = true;
                                I.a.e(this, j7);
                            }
                            if (((jxo) d7cVar4.l) == I) {
                                t(H.b, true);
                            }
                            R(false);
                        }
                        if (this.L) {
                            this.L = B((jxo) d7cVar4.o);
                            N();
                        } else {
                            M();
                        }
                        if (!this.I && this.v && !this.Z && !W() && (jxoVar9 = (jxo) d7cVar4.n) != null && jxoVar9 == ((jxo) d7cVar4.m) && (jxoVar10 = jxoVar9.m) != null && (z7 = jxoVar10.e)) {
                            zzguk.f(z7);
                            if (((long) ((jxoVar10.a() - this.R) / this.m.zzj().a)) <= 10000000) {
                                d7cVar4.L();
                                jxo jxoVar12 = (jxo) d7cVar4.n;
                                if (jxoVar12 != null) {
                                    zzabm zzabmVar2 = jxoVar12.o;
                                    long j8 = uptimeMillis;
                                    int i14 = 0;
                                    while (true) {
                                        tyf[] tyfVarArr2 = this.a;
                                        if (i14 < 2) {
                                            if (zzabmVar2.a(i14) && tyfVarArr2[i14].A() && !tyfVarArr2[i14].C()) {
                                                tyfVarArr2[i14].B();
                                                jxoVar11 = jxoVar12;
                                                j6 = j8;
                                                Q(jxoVar11, i14, false, jxoVar12.a());
                                            } else {
                                                jxoVar11 = jxoVar12;
                                                j6 = j8;
                                            }
                                            i14++;
                                            jxoVar12 = jxoVar11;
                                            j8 = j6;
                                        } else {
                                            jxo jxoVar13 = jxoVar12;
                                            j = j8;
                                            if (W()) {
                                                this.Y = jxoVar13.a.zzr();
                                                if (!jxoVar13.b()) {
                                                    d7cVar4.N(jxoVar13);
                                                    R(false);
                                                    M();
                                                }
                                            }
                                            jxoVar5 = (jxo) d7cVar4.m;
                                            if (jxoVar5 != null) {
                                                if (jxoVar5.m != null) {
                                                    try {
                                                        if (!this.I) {
                                                            if (jxoVar5.e) {
                                                                int i15 = 0;
                                                                while (true) {
                                                                    tyf[] tyfVarArr3 = this.a;
                                                                    if (i15 < 2) {
                                                                        if (tyfVarArr3[i15].M(jxoVar5)) {
                                                                            i15++;
                                                                        }
                                                                    } else if (!W() || ((jxo) d7cVar4.n) != ((jxo) d7cVar4.m)) {
                                                                        jxo jxoVar14 = jxoVar5.m;
                                                                        if (jxoVar14.e || this.R >= jxoVar14.a()) {
                                                                            boolean z10 = jxoVar5.m.e;
                                                                            if (z10) {
                                                                                zzguk.f(z10);
                                                                                break;
                                                                            }
                                                                            zzabm zzabmVar3 = jxoVar5.o;
                                                                            jxo K = d7cVar4.K();
                                                                            zzabm zzabmVar4 = K.o;
                                                                            zzbf zzbfVar = this.E.a;
                                                                            zzxo zzxoVar2 = K.g.a;
                                                                            zzxo zzxoVar3 = jxoVar5.g.a;
                                                                            d7cVar2 = d7cVar4;
                                                                            i5 = 1;
                                                                            H(zzbfVar, zzxoVar2, zzbfVar, zzxoVar3, C.TIME_UNSET, false);
                                                                            if (K.e) {
                                                                                boolean z11 = this.v;
                                                                                if (z11) {
                                                                                    if (this.Y == j4) {
                                                                                    }
                                                                                    j5 = j4;
                                                                                    this.Y = j5;
                                                                                    if (z11 && !this.Z) {
                                                                                        for (i8 = 0; i8 < 2; i8++) {
                                                                                            if (zzabmVar4.a(i8)) {
                                                                                                tyfVarArr3[i8].E();
                                                                                                zzabe[] zzabeVarArr = zzabmVar4.c;
                                                                                                if (!zzas.d(zzabeVarArr[i8].zzc().o, zzabeVarArr[i8].zzc().k) && !tyfVarArr3[i8].C()) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        for (i6 = 0; i6 < 2; i6++) {
                                                                                            tyfVarArr3[i6].H(zzabmVar3, zzabmVar4);
                                                                                        }
                                                                                    }
                                                                                    for (i7 = 0; i7 < 2; i7++) {
                                                                                        tyfVarArr3[i7].I();
                                                                                    }
                                                                                    if (!K.b()) {
                                                                                        d7cVar2.N(K);
                                                                                        R(false);
                                                                                        M();
                                                                                    }
                                                                                }
                                                                                if (K.a.zzr() != j4) {
                                                                                    j5 = j4;
                                                                                    this.Y = j5;
                                                                                    if (z11) {
                                                                                        while (i8 < 2) {
                                                                                        }
                                                                                        while (i6 < 2) {
                                                                                        }
                                                                                    }
                                                                                    while (i7 < 2) {
                                                                                    }
                                                                                    if (!K.b()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            j5 = j4;
                                                                            while (i6 < 2) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                d7cVar2 = d7cVar4;
                                                                i5 = 1;
                                                                j5 = j4;
                                                            }
                                                            d7cVar3 = d7cVar2;
                                                            jxoVar6 = (jxo) d7cVar3.m;
                                                            if (jxoVar6 != null && ((jxo) d7cVar3.l) != jxoVar6 && !jxoVar6.h) {
                                                                zzabmVar = jxoVar6.o;
                                                                i11 = 0;
                                                                i12 = i5;
                                                                while (true) {
                                                                    tyfVarArr = this.a;
                                                                    if (i11 >= 2) {
                                                                        int D = tyfVarArr[i11].D();
                                                                        int p = tyfVarArr[i11].p(jxoVar6, zzabmVar, this.m);
                                                                        this.P -= D - tyfVarArr[i11].D();
                                                                        i12 &= p & 1;
                                                                        i11++;
                                                                    } else if (i12 != 0) {
                                                                        for (int i16 = 0; i16 < 2; i16++) {
                                                                            if (zzabmVar.a(i16)) {
                                                                                if ((tyfVarArr[i16].z(jxoVar6) != null ? i5 : 0) == 0) {
                                                                                    Q(jxoVar6, i16, false, jxoVar6.a());
                                                                                }
                                                                            }
                                                                        }
                                                                        ((jxo) d7cVar3.m).h = i5;
                                                                    }
                                                                }
                                                            }
                                                            z5 = false;
                                                            while (U() && !this.I && (jxoVar7 = (jxo) d7cVar3.l) != null && (jxoVar8 = jxoVar7.m) != null && this.R >= jxoVar8.a() && jxoVar8.h) {
                                                                if (z5) {
                                                                    f(-1);
                                                                }
                                                                this.Z = false;
                                                                M = d7cVar3.M();
                                                                if (M != null) {
                                                                    throw null;
                                                                }
                                                                if (this.E.b.a.equals(M.g.a.a)) {
                                                                    zzxo zzxoVar4 = this.E.b;
                                                                    if (zzxoVar4.b == -1) {
                                                                        zzxo zzxoVar5 = M.g.a;
                                                                        if (zzxoVar5.b == -1 && zzxoVar4.e != zzxoVar5.e) {
                                                                            z6 = true;
                                                                            kxo kxoVar = M.g;
                                                                            boolean z12 = z6;
                                                                            zzxo zzxoVar6 = kxoVar.a;
                                                                            long j9 = kxoVar.b;
                                                                            this.E = O(zzxoVar6, j9, kxoVar.d, j9, !z12, 0);
                                                                            K();
                                                                            m();
                                                                            if (W() && M == ((jxo) d7cVar3.n)) {
                                                                                tyf[] tyfVarArr4 = this.a;
                                                                                for (i10 = 0; i10 < 2; i10++) {
                                                                                    tyfVarArr4[i10].n();
                                                                                }
                                                                            }
                                                                            if (this.E.e == 3) {
                                                                                k();
                                                                            }
                                                                            zzabm zzabmVar5 = ((jxo) d7cVar3.l).o;
                                                                            i9 = 0;
                                                                            while (true) {
                                                                                tyf[] tyfVarArr5 = this.a;
                                                                                if (i9 >= 2) {
                                                                                    if (zzabmVar5.a(i9)) {
                                                                                        tyfVarArr5[i9].J();
                                                                                    }
                                                                                    i9++;
                                                                                }
                                                                            }
                                                                            z5 = true;
                                                                            j5 = C.TIME_UNSET;
                                                                        }
                                                                    }
                                                                }
                                                                z6 = false;
                                                                kxo kxoVar2 = M.g;
                                                                boolean z122 = z6;
                                                                zzxo zzxoVar62 = kxoVar2.a;
                                                                long j92 = kxoVar2.b;
                                                                this.E = O(zzxoVar62, j92, kxoVar2.d, j92, !z122, 0);
                                                                K();
                                                                m();
                                                                if (W()) {
                                                                    tyf[] tyfVarArr42 = this.a;
                                                                    while (i10 < 2) {
                                                                    }
                                                                }
                                                                if (this.E.e == 3) {
                                                                }
                                                                zzabm zzabmVar52 = ((jxo) d7cVar3.l).o;
                                                                i9 = 0;
                                                                while (true) {
                                                                    tyf[] tyfVarArr52 = this.a;
                                                                    if (i9 >= 2) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                }
                                                                z5 = true;
                                                                j5 = C.TIME_UNSET;
                                                            }
                                                            zzjnVar2 = null;
                                                            this.X.getClass();
                                                        }
                                                    } catch (zzat e15) {
                                                        e = e15;
                                                        message2 = message;
                                                        d(e.b != 1 ? true != e.a ? Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE : 3001 : 1000, e);
                                                        z = true;
                                                        f(message2.what);
                                                        return z;
                                                    } catch (zzht e16) {
                                                        e = e16;
                                                        message2 = message;
                                                        d(e.a, e);
                                                        z = true;
                                                        f(message2.what);
                                                        return z;
                                                    } catch (zzjn e17) {
                                                        e = e17;
                                                        message2 = message;
                                                        if (e.c == 1 && (jxoVar4 = (jxo) this.q.m) != null && e.h == null) {
                                                            e = e.a(jxoVar4.g.a);
                                                        }
                                                        if (e.c == 1 && (zzxoVar = e.h) != null) {
                                                            int i17 = e.e;
                                                            d7cVar = this.q;
                                                            jxoVar = (jxo) d7cVar.n;
                                                            if (jxoVar != null && jxoVar.g.a.equals(zzxoVar) && this.a[i17].L((jxo) d7cVar.n)) {
                                                                this.Z = true;
                                                                D();
                                                                jxoVar2 = (jxo) d7cVar.n;
                                                                jxoVar3 = (jxo) d7cVar.l;
                                                                if (jxoVar3 != jxoVar2) {
                                                                    while (jxoVar3 != null) {
                                                                        jxo jxoVar15 = jxoVar3.m;
                                                                        if (jxoVar15 != jxoVar2) {
                                                                            jxoVar3 = jxoVar15;
                                                                        }
                                                                    }
                                                                }
                                                                d7cVar.N(jxoVar3);
                                                                if (this.E.e != 4) {
                                                                    M();
                                                                    this.g.g(2);
                                                                }
                                                                z = true;
                                                                f(message2.what);
                                                                return z;
                                                            }
                                                        }
                                                        zzjnVar = this.V;
                                                        if (zzjnVar != null) {
                                                            zzjnVar.addSuppressed(e);
                                                            e = this.V;
                                                        }
                                                        if (e.c == 1) {
                                                            d7c d7cVar5 = this.q;
                                                            if (((jxo) d7cVar5.l) != ((jxo) d7cVar5.m)) {
                                                                while (true) {
                                                                    jxo jxoVar16 = (jxo) d7cVar5.l;
                                                                    if (jxoVar16 != ((jxo) d7cVar5.m)) {
                                                                        d7cVar5.M();
                                                                    } else {
                                                                        jxoVar16.getClass();
                                                                        f(message2.what);
                                                                        kxo kxoVar3 = jxoVar16.g;
                                                                        zzxo zzxoVar7 = kxoVar3.a;
                                                                        long j10 = kxoVar3.b;
                                                                        this.E = O(zzxoVar7, j10, kxoVar3.d, j10, true, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (e.i || !(this.V == null || (i = e.a) == 5004 || i == 5003)) {
                                                            zzeh.f("Playback error", e);
                                                            z = true;
                                                            v(true, false);
                                                            this.E = this.E.e(e);
                                                            f(message2.what);
                                                            return z;
                                                        }
                                                        zzeh.d("Recoverable renderer error", e);
                                                        if (this.V == null) {
                                                            this.V = e;
                                                        }
                                                        zzea zzeaVar2 = this.g;
                                                        zzeaVar2.b(zzeaVar2.h(25, e));
                                                        z = true;
                                                        f(message2.what);
                                                        return z;
                                                    } catch (zzuk e18) {
                                                        e = e18;
                                                        message2 = message;
                                                        d(AdError.MEDIAVIEW_MISSING_ERROR_CODE, e);
                                                        z = true;
                                                        f(message2.what);
                                                        return z;
                                                    } catch (zzwq e19) {
                                                        e = e19;
                                                        message2 = message;
                                                        d(1002, e);
                                                        z = true;
                                                        f(message2.what);
                                                        return z;
                                                    } catch (IOException e20) {
                                                        e = e20;
                                                        message2 = message;
                                                        d(2000, e);
                                                        z = true;
                                                        f(message2.what);
                                                        return z;
                                                    } catch (RuntimeException e21) {
                                                        e = e21;
                                                        message2 = message;
                                                        zzjn zzjnVar3 = new zzjn(2, e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                                        zzeh.f("Playback error", zzjnVar3);
                                                        v(true, false);
                                                        this.E = this.E.e(zzjnVar3);
                                                        z = true;
                                                        f(message2.what);
                                                        return z;
                                                    }
                                                }
                                                d7cVar3 = d7cVar4;
                                                i5 = 1;
                                                j5 = j4;
                                                if (jxoVar5.g.h || this.I) {
                                                    tyf[] tyfVarArr6 = this.a;
                                                    for (int i18 = 0; i18 < 2; i18++) {
                                                        tyf tyfVar = tyfVarArr6[i18];
                                                        if ((tyfVar.z(jxoVar5) != null) && tyfVar.F(jxoVar5)) {
                                                            tyfVar.G(jxoVar5);
                                                        }
                                                    }
                                                }
                                                jxoVar6 = (jxo) d7cVar3.m;
                                                if (jxoVar6 != null) {
                                                    zzabmVar = jxoVar6.o;
                                                    i11 = 0;
                                                    i12 = i5;
                                                    while (true) {
                                                        tyfVarArr = this.a;
                                                        if (i11 >= 2) {
                                                        }
                                                        int D2 = tyfVarArr[i11].D();
                                                        int p2 = tyfVarArr[i11].p(jxoVar6, zzabmVar, this.m);
                                                        this.P -= D2 - tyfVarArr[i11].D();
                                                        i12 &= p2 & 1;
                                                        i11++;
                                                    }
                                                }
                                                z5 = false;
                                                while (U()) {
                                                    if (z5) {
                                                    }
                                                    this.Z = false;
                                                    M = d7cVar3.M();
                                                    if (M != null) {
                                                    }
                                                }
                                                zzjnVar2 = null;
                                                this.X.getClass();
                                            }
                                            d7cVar3 = d7cVar4;
                                            i5 = 1;
                                            j5 = j4;
                                            jxoVar6 = (jxo) d7cVar3.m;
                                            if (jxoVar6 != null) {
                                            }
                                            z5 = false;
                                            while (U()) {
                                            }
                                            zzjnVar2 = null;
                                            this.X.getClass();
                                        }
                                    }
                                }
                            }
                        }
                        j = uptimeMillis;
                        jxoVar5 = (jxo) d7cVar4.m;
                        if (jxoVar5 != null) {
                        }
                        d7cVar3 = d7cVar4;
                        i5 = 1;
                        j5 = j4;
                        jxoVar6 = (jxo) d7cVar3.m;
                        if (jxoVar6 != null) {
                        }
                        z5 = false;
                        while (U()) {
                        }
                        zzjnVar2 = null;
                        this.X.getClass();
                    }
                    d7c d7cVar6 = this.q;
                    jxo jxoVar17 = (jxo) d7cVar6.l;
                    if (jxoVar17 == null) {
                        q(j);
                    } else {
                        long j11 = j;
                        Trace.beginSection("doSomeWork");
                        m();
                        if (jxoVar17.e) {
                            this.S = zzfm.u(SystemClock.elapsedRealtime());
                            jxoVar17.a.zzq(this.E.r - this.l);
                            int i19 = 0;
                            z2 = true;
                            z3 = true;
                            while (true) {
                                tyf[] tyfVarArr7 = this.a;
                                if (i19 < 2) {
                                    tyf tyfVar2 = tyfVarArr7[i19];
                                    if (tyfVar2.D() == 0) {
                                        n(i19, z9);
                                    } else {
                                        tyfVar2.N(this.R, this.S);
                                        z2 = z2 && tyfVar2.K();
                                        boolean O = tyfVar2.O(jxoVar17);
                                        n(i19, O);
                                        z3 = z3 && O;
                                        if (!O) {
                                            V(i19);
                                        }
                                    }
                                    i19++;
                                    z9 = false;
                                }
                            }
                        } else {
                            jxoVar17.a.zzm();
                            z2 = true;
                            z3 = true;
                        }
                        long j12 = jxoVar17.g.e;
                        if (z2 && jxoVar17.e) {
                            j2 = C.TIME_UNSET;
                            if (j12 == C.TIME_UNSET || j12 <= this.E.r) {
                                if (this.I) {
                                    this.I = false;
                                    int i20 = this.E.n;
                                    this.F.a(0);
                                    h(this.w.b(this.E.e, false), i20, 5, false);
                                }
                                if (jxoVar17.g.h) {
                                    e(4);
                                    l();
                                    j3 = -9223372036854775807L;
                                    if (this.E.e == 2) {
                                        int i21 = 0;
                                        while (true) {
                                            tyf[] tyfVarArr8 = this.a;
                                            if (i21 < 2) {
                                                if (tyfVarArr8[i21].z(jxoVar17) != null) {
                                                    V(i21);
                                                }
                                                i21++;
                                            } else {
                                                eyo eyoVar2 = this.E;
                                                if (!eyoVar2.g && eyoVar2.q < 500000 && B((jxo) d7cVar6.o) && U()) {
                                                    if (this.W == j3) {
                                                        this.W = SystemClock.elapsedRealtime();
                                                    } else if (SystemClock.elapsedRealtime() - this.W >= 4000) {
                                                        throw new zzfe(0, 4000);
                                                    }
                                                    boolean z13 = !U() && this.E.e == 3;
                                                    this.E.getClass();
                                                    i4 = this.E.e;
                                                    if (i4 != 4 && (z13 || i4 == 2 || (i4 == 3 && this.P != 0))) {
                                                        q(j11);
                                                    }
                                                    Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    this.W = j3;
                                    if (U()) {
                                    }
                                    this.E.getClass();
                                    i4 = this.E.e;
                                    if (i4 != 4) {
                                        q(j11);
                                    }
                                    Trace.endSection();
                                }
                            }
                        } else {
                            j2 = C.TIME_UNSET;
                        }
                        eyo eyoVar3 = this.E;
                        if (eyoVar3.e == 2) {
                            if (this.P == 0) {
                                g = F();
                                z4 = z3;
                                j3 = j2;
                                break;
                            } else if (z3) {
                                if (eyoVar3.g) {
                                    jxo jxoVar18 = (jxo) d7cVar6.l;
                                    long j13 = p(eyoVar3.a, jxoVar18.g.a) ? this.b0.h : j2;
                                    jxo jxoVar19 = (jxo) d7cVar6.o;
                                    boolean z14 = jxoVar19.b() && jxoVar19.g.h;
                                    boolean z15 = jxoVar19.g.a.b() && !jxoVar19.e;
                                    if (!z14 && !z15) {
                                        long S = S(jxoVar19.d());
                                        zzmc zzmcVar = this.f;
                                        zzqj zzqjVar = this.s;
                                        zzbf zzbfVar2 = this.E.a;
                                        zzxo zzxoVar8 = jxoVar18.g.a;
                                        j3 = j2;
                                        z4 = z3;
                                        long j14 = this.R - jxoVar18.p;
                                        float f = this.m.zzj().a;
                                        boolean z16 = this.E.l;
                                        g = zzmcVar.g(new zzmb(zzqjVar, zzbfVar2, zzxoVar8, j14, S, f, this.J, j13));
                                        break;
                                    }
                                }
                                j3 = j2;
                                e(3);
                                this.V = zzjnVar2;
                                if (U()) {
                                    z(false, false);
                                    ar4 ar4Var = this.m;
                                    ar4Var.c = true;
                                    zznp zznpVar = (zznp) ar4Var.d;
                                    if (!zznpVar.a) {
                                        zznpVar.c = SystemClock.elapsedRealtime();
                                        zznpVar.a = true;
                                    }
                                    k();
                                }
                                if (this.E.e == 2) {
                                }
                                this.W = j3;
                                if (U()) {
                                }
                                this.E.getClass();
                                i4 = this.E.e;
                                if (i4 != 4) {
                                }
                                Trace.endSection();
                            }
                        }
                        z4 = z3;
                        j3 = j2;
                        if (this.E.e == 3) {
                            if (this.P == 0) {
                                if (!F()) {
                                    z(U(), false);
                                    e(2);
                                    if (this.J) {
                                        for (jxo jxoVar20 = (jxo) d7cVar6.l; jxoVar20 != null; jxoVar20 = jxoVar20.m) {
                                            for (zzabe zzabeVar : jxoVar20.o.c) {
                                            }
                                        }
                                        this.b0.a();
                                    }
                                    l();
                                }
                            }
                        }
                        if (this.E.e == 2) {
                        }
                        this.W = j3;
                        if (U()) {
                        }
                        this.E.getClass();
                        i4 = this.E.e;
                        if (i4 != 4) {
                        }
                        Trace.endSection();
                    }
                    message2 = message;
                    z = true;
                }
                f(message2.what);
                return z;
            case 3:
                z = true;
                r((wwo) message2.obj);
                f(message2.what);
                return z;
            case 4:
                z = true;
                zzav zzavVar = (zzav) message2.obj;
                this.g.d(16);
                this.m.e(zzavVar);
                zzav zzj = this.m.zzj();
                L(zzj, zzj.a, true, true);
                f(message2.what);
                return z;
            case 5:
                z = true;
                this.y = (zznm) message2.obj;
                f(message2.what);
                return z;
            case 6:
                z = true;
                v(false, true);
                f(message2.what);
                return z;
            case 7:
                zzdt zzdtVar = (zzdt) message2.obj;
                try {
                    w(true, false, true, false);
                    int i22 = 0;
                    while (true) {
                        tyf[] tyfVarArr9 = this.a;
                        if (i22 >= 2) {
                            this.f.e(this.s);
                            this.w.c();
                            this.d.a();
                            e(1);
                            this.g.zzl();
                            this.h.a();
                            zzdtVar.a();
                            return true;
                        }
                        this.b[i22].zzw();
                        tyfVarArr9[i22].q();
                        i22++;
                    }
                } finally {
                    this.g.zzl();
                    this.h.a();
                    zzdtVar.a();
                }
            case 8:
                try {
                    zzxm zzxmVar = (zzxm) message2.obj;
                    d7c d7cVar7 = this.q;
                    jxo jxoVar21 = (jxo) d7cVar7.o;
                    if (!(jxoVar21 != null && jxoVar21.a == zzxmVar)) {
                        z = true;
                        jxo P = d7cVar7.P(zzxmVar);
                        if (P != null) {
                            zzguk.f(!P.e);
                            float f2 = this.m.zzj().a;
                            P.e(this.E.a);
                            jxo jxoVar22 = (jxo) d7cVar7.p;
                            if (jxoVar22 != null && jxoVar22.a == zzxmVar) {
                                J();
                            }
                        }
                    } else {
                        if (jxoVar21 == null) {
                            throw null;
                        }
                        if (!jxoVar21.e) {
                            float f3 = this.m.zzj().a;
                            jxoVar21.e(this.E.a);
                        }
                        T(jxoVar21.g.a, jxoVar21.n, jxoVar21.o);
                        if (jxoVar21 == ((jxo) d7cVar7.l)) {
                            t(jxoVar21.g.b, true);
                            P(new boolean[2], ((jxo) this.q.m).a());
                            jxoVar21.h = true;
                            eyo eyoVar4 = this.E;
                            try {
                                zzxo zzxoVar9 = eyoVar4.b;
                                long j15 = jxoVar21.g.b;
                                z = true;
                                this.E = O(zzxoVar9, j15, eyoVar4.c, j15, false, 5);
                            } catch (zzat e22) {
                                e = e22;
                                d(e.b != 1 ? true != e.a ? Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE : 3001 : 1000, e);
                                z = true;
                                f(message2.what);
                                return z;
                            } catch (zzht e23) {
                                e = e23;
                                d(e.a, e);
                                z = true;
                                f(message2.what);
                                return z;
                            } catch (zzjn e24) {
                                e = e24;
                                if (e.c == 1) {
                                    e = e.a(jxoVar4.g.a);
                                    break;
                                }
                                if (e.c == 1) {
                                    int i172 = e.e;
                                    d7cVar = this.q;
                                    jxoVar = (jxo) d7cVar.n;
                                    if (jxoVar != null) {
                                        this.Z = true;
                                        D();
                                        jxoVar2 = (jxo) d7cVar.n;
                                        jxoVar3 = (jxo) d7cVar.l;
                                        if (jxoVar3 != jxoVar2) {
                                        }
                                        d7cVar.N(jxoVar3);
                                        if (this.E.e != 4) {
                                        }
                                        z = true;
                                        f(message2.what);
                                        return z;
                                    }
                                    break;
                                }
                                zzjnVar = this.V;
                                if (zzjnVar != null) {
                                }
                                if (e.c == 1) {
                                }
                                if (e.i) {
                                    break;
                                }
                                zzeh.f("Playback error", e);
                                z = true;
                                v(true, false);
                                this.E = this.E.e(e);
                                f(message2.what);
                                return z;
                            } catch (zzuk e25) {
                                e = e25;
                                d(AdError.MEDIAVIEW_MISSING_ERROR_CODE, e);
                                z = true;
                                f(message2.what);
                                return z;
                            } catch (zzwq e26) {
                                e = e26;
                                d(1002, e);
                                z = true;
                                f(message2.what);
                                return z;
                            } catch (IOException e27) {
                                e = e27;
                                d(2000, e);
                                z = true;
                                f(message2.what);
                                return z;
                            } catch (RuntimeException e28) {
                                e = e28;
                                if (e instanceof IllegalStateException) {
                                    break;
                                }
                                zzjn zzjnVar32 = new zzjn(2, e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                zzeh.f("Playback error", zzjnVar32);
                                v(true, false);
                                this.E = this.E.e(zzjnVar32);
                                z = true;
                                f(message2.what);
                                return z;
                            }
                        } else {
                            z = true;
                        }
                        M();
                    }
                } catch (zzat e29) {
                    e = e29;
                } catch (zzht e30) {
                    e = e30;
                } catch (zzjn e31) {
                    e = e31;
                } catch (zzuk e32) {
                    e = e32;
                } catch (zzwq e33) {
                    e = e33;
                } catch (IOException e34) {
                    e = e34;
                } catch (RuntimeException e35) {
                    e = e35;
                }
                f(message2.what);
                return z;
            case 9:
                zzxm zzxmVar2 = (zzxm) message2.obj;
                d7c d7cVar8 = this.q;
                jxo jxoVar23 = (jxo) d7cVar8.o;
                if (jxoVar23 != null && jxoVar23.a == zzxmVar2) {
                    d7cVar8.F(this.R);
                    M();
                } else {
                    jxo jxoVar24 = (jxo) d7cVar8.p;
                    if (jxoVar24 != null && jxoVar24.a == zzxmVar2) {
                        J();
                    }
                }
                z = true;
                f(message2.what);
                return z;
            case 10:
                E();
                z = true;
                f(message2.what);
                return z;
            case 11:
                int i23 = message2.arg1;
                this.M = i23;
                int C = this.q.C(this.E.a, i23);
                if ((C & 1) != 0) {
                    j(true);
                } else if ((C & 2) != 0) {
                    D();
                }
                R(false);
                z = true;
                f(message2.what);
                return z;
            case 12:
                boolean z17 = message2.arg1 != 0;
                this.N = z17;
                int D3 = this.q.D(this.E.a, z17);
                if ((D3 & 1) != 0) {
                    j(true);
                } else if ((D3 & 2) != 0) {
                    D();
                }
                R(false);
                z = true;
                f(message2.what);
                return z;
            case 13:
                boolean z18 = message2.arg1 != 0;
                zzdt zzdtVar2 = (zzdt) message2.obj;
                if (this.O != z18) {
                    this.O = z18;
                    if (!z18) {
                        tyf[] tyfVarArr10 = this.a;
                        for (int i24 = 0; i24 < 2; i24++) {
                            tyfVarArr10[i24].o();
                        }
                    }
                }
                if (zzdtVar2 != null) {
                    zzdtVar2.a();
                }
                z = true;
                f(message2.what);
                return z;
            case 14:
                zzna zznaVar = (zzna) message2.obj;
                if (zznaVar.e == this.i) {
                    synchronized (zznaVar) {
                    }
                    try {
                        zznaVar.a.f(zznaVar.c, zznaVar.d);
                        zznaVar.a(true);
                        int i25 = this.E.e;
                        if (i25 == 3 || i25 == 2) {
                            this.g.g(2);
                        }
                    } catch (Throwable th) {
                        zznaVar.a(true);
                        throw th;
                    }
                } else {
                    this.g.h(15, zznaVar).a();
                }
                z = true;
                f(message2.what);
                return z;
            case 15:
                zzna zznaVar2 = (zzna) message2.obj;
                Looper looper = zznaVar2.e;
                if (looper.getThread().isAlive()) {
                    this.o.a(looper, null).f(new dno(zznaVar2, i2));
                } else {
                    zzeh.c("Trying to send message on a dead thread.");
                    zznaVar2.a(false);
                }
                z = true;
                f(message2.what);
                return z;
            case 16:
                zzav zzavVar2 = (zzav) message2.obj;
                L(zzavVar2, zzavVar2.a, true, false);
                z = true;
                f(message2.what);
                return z;
            case 17:
                pwo pwoVar = (pwo) message2.obj;
                this.F.a(1);
                if (pwoVar.b != -1) {
                    this.Q = new wwo(new tyo(pwoVar.a, pwoVar.d), pwoVar.b, pwoVar.c);
                }
                G(this.r.q(pwoVar.a, pwoVar.d), false);
                z = true;
                f(message2.what);
                return z;
            case 18:
                pwo pwoVar2 = (pwo) message2.obj;
                int i26 = message2.arg1;
                this.F.a(1);
                tdc tdcVar = this.r;
                if (i26 == -1) {
                    i26 = ((ArrayList) tdcVar.b).size();
                }
                G(tdcVar.r(i26, pwoVar2.a, pwoVar2.d), false);
                z = true;
                f(message2.what);
                return z;
            case 19:
                wt3.z(message2.obj);
                this.F.a(1);
                throw null;
            case 20:
                int i27 = message2.arg1;
                int i28 = message2.arg2;
                zzzj zzzjVar = (zzzj) message2.obj;
                this.F.a(1);
                G(this.r.s(i27, i28, zzzjVar), false);
                z = true;
                f(message2.what);
                return z;
            case 21:
                zzzj zzzjVar2 = (zzzj) message2.obj;
                this.F.a(1);
                G(this.r.t(zzzjVar2), false);
                z = true;
                f(message2.what);
                return z;
            case 22:
                G(this.r.p(), true);
                z = true;
                f(message2.what);
                return z;
            case 23:
                this.H = message2.arg1 != 0;
                K();
                if (this.I) {
                    d7c d7cVar9 = this.q;
                    if (((jxo) d7cVar9.m) != ((jxo) d7cVar9.l)) {
                        j(true);
                        R(false);
                    }
                }
                z = true;
                f(message2.what);
                return z;
            case 24:
                this.x = message2.arg1 != 0;
                z = true;
                f(message2.what);
                return z;
            case 25:
                E();
                j(true);
                z = true;
                f(message2.what);
                return z;
            case 26:
                E();
                j(true);
                z = true;
                f(message2.what);
                return z;
            case 27:
                int i29 = message2.arg1;
                int i30 = message2.arg2;
                List list = (List) message2.obj;
                this.F.a(1);
                G(this.r.n(i29, i30, list), false);
                z = true;
                f(message2.what);
                return z;
            case 28:
                zzjx zzjxVar = (zzjx) message2.obj;
                this.X = zzjxVar;
                d7c d7cVar10 = this.q;
                zzbf zzbfVar3 = this.E.a;
                d7cVar10.E(zzjxVar);
                z = true;
                f(message2.what);
                return z;
            case 29:
                this.F.a(1);
                w(false, false, false, true);
                this.f.d(this.s);
                e(true != this.E.a.g() ? 2 : 4);
                eyo eyoVar5 = this.E;
                boolean z19 = eyoVar5.l;
                h(this.w.b(eyoVar5.e, z19), eyoVar5.n, eyoVar5.m, z19);
                this.r.o();
                this.g.g(2);
                z = true;
                f(message2.what);
                return z;
            case 30:
                Pair pair = (Pair) message2.obj;
                Object obj = pair.first;
                zzdt zzdtVar3 = (zzdt) pair.second;
                tyf[] tyfVarArr11 = this.a;
                for (int i31 = 0; i31 < 2; i31++) {
                    tyfVarArr11[i31].r(obj);
                }
                int i32 = this.E.e;
                if (i32 == 3 || i32 == 2) {
                    this.g.g(2);
                }
                if (zzdtVar3 != null) {
                    zzdtVar3.a();
                }
                z = true;
                f(message2.what);
                return z;
            case 31:
                zzd zzdVar2 = (zzd) message2.obj;
                int i33 = message2.arg1;
                this.d.c(zzdVar2);
                zzcd zzcdVar = this.w;
                if (i33 != 0) {
                    zzdVar = zzdVar2;
                }
                zzcdVar.a(zzdVar);
                eyo eyoVar6 = this.E;
                boolean z20 = eyoVar6.l;
                h(this.w.b(eyoVar6.e, z20), eyoVar6.n, eyoVar6.m, z20);
                z = true;
                f(message2.what);
                return z;
            case 32:
                g(((Float) message2.obj).floatValue());
                z = true;
                f(message2.what);
                return z;
            case 33:
                int i34 = message2.arg1;
                eyo eyoVar7 = this.E;
                h(i34, eyoVar7.n, eyoVar7.m, eyoVar7.l);
                z = true;
                f(message2.what);
                return z;
            case 34:
                g(this.a0);
                z = true;
                f(message2.what);
                return z;
            case 35:
                zzaea zzaeaVar = (zzaea) message2.obj;
                tyf[] tyfVarArr12 = this.a;
                for (int i35 = 0; i35 < 2; i35++) {
                    tyfVarArr12[i35].s(zzaeaVar);
                }
                z = true;
                f(message2.what);
                return z;
            case 36:
                boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                if (!booleanValue) {
                    if (this.C != null && this.B && !this.g.zzb(37)) {
                        this.D++;
                    }
                    int i36 = this.D;
                    if (i36 > 0) {
                        this.u.f(new dno(this, i36));
                    }
                    this.D = 0;
                    this.B = false;
                    this.g.d(37);
                    wwo wwoVar = this.C;
                    if (wwoVar != null) {
                        r(wwoVar);
                        this.C = null;
                        this.B = false;
                    }
                }
                this.A = booleanValue;
                u();
                z = true;
                f(message2.what);
                return z;
            case 37:
                this.B = false;
                wwo wwoVar2 = this.C;
                if (wwoVar2 != null) {
                    r(wwoVar2);
                    this.C = null;
                }
                z = true;
                f(message2.what);
                return z;
            case 38:
                this.z = (zznl) message2.obj;
                u();
                z = true;
                f(message2.what);
                return z;
            case 39:
                tyf[] tyfVarArr13 = this.a;
                for (int i37 = 0; i37 < 2; i37++) {
                    tyfVarArr13[i37].E();
                }
                z = true;
                f(message2.what);
                return z;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void i(zzxm zzxmVar) {
        this.g.h(8, zzxmVar).a();
    }

    public final void j(boolean z) {
        zzxo zzxoVar = ((jxo) this.q.l).g.a;
        long s = s(zzxoVar, this.E.r, true, false);
        if (s != this.E.r) {
            eyo eyoVar = this.E;
            this.E = O(zzxoVar, s, eyoVar.c, eyoVar.d, z, 5);
        }
    }

    public final void k() {
        jxo jxoVar = (jxo) this.q.l;
        if (jxoVar == null) {
            return;
        }
        zzabm zzabmVar = jxoVar.o;
        for (int i = 0; i < 2; i++) {
            if (zzabmVar.a(i)) {
                this.a[i].P();
            }
        }
    }

    public final void l() {
        ar4 ar4Var = this.m;
        ar4Var.c = false;
        zznp zznpVar = (zznp) ar4Var.d;
        if (zznpVar.a) {
            zznpVar.a(zznpVar.zzg());
            zznpVar.a = false;
        }
        for (int i = 0; i < 2; i++) {
            tyf tyfVar = this.a[i];
            zzne zzneVar = (zzne) tyfVar.e;
            if (tyf.y(zzneVar) && zzneVar.zze() == 2) {
                zzneVar.zzq();
            }
            zzne zzneVar2 = (zzne) tyfVar.f;
            if (zzneVar2 != null && zzneVar2.zze() != 0 && zzneVar2.zze() == 2) {
                zzneVar2.zzq();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void m() {
        long j;
        ?? r11;
        boolean z;
        long j2;
        long j3;
        long max;
        d7c d7cVar = this.q;
        jxo jxoVar = (jxo) d7cVar.l;
        if (jxoVar == null) {
            return;
        }
        long zzr = jxoVar.e ? jxoVar.a.zzr() : -9223372036854775807L;
        if (zzr != C.TIME_UNSET) {
            if (!jxoVar.b()) {
                d7cVar.N(jxoVar);
                D();
                R(false);
                M();
            }
            t(zzr, true);
            if (zzr != this.E.r) {
                eyo eyoVar = this.E;
                j = -9223372036854775807L;
                r11 = 0;
                this.E = O(eyoVar.b, zzr, eyoVar.c, zzr, true, 5);
            } else {
                j = -9223372036854775807L;
                r11 = 0;
            }
        } else {
            j = -9223372036854775807L;
            boolean z2 = false;
            ar4 ar4Var = this.m;
            boolean z3 = jxoVar != ((jxo) d7cVar.m);
            zznp zznpVar = (zznp) ar4Var.d;
            zzne zzneVar = (zzne) ar4Var.f;
            if (zzneVar == null || zzneVar.h() || ((z3 && ((zzne) ar4Var.f).zze() != 2) || (!((zzne) ar4Var.f).x() && (z3 || ((zzne) ar4Var.f).J())))) {
                ar4Var.b = true;
                if (ar4Var.c && !zznpVar.a) {
                    zznpVar.c = SystemClock.elapsedRealtime();
                    zznpVar.a = true;
                }
            } else {
                zzmf zzmfVar = (zzmf) ar4Var.g;
                zzmfVar.getClass();
                long zzg = zzmfVar.zzg();
                if (ar4Var.b) {
                    if (zzg >= zznpVar.zzg()) {
                        ar4Var.b = false;
                        if (ar4Var.c && !zznpVar.a) {
                            zznpVar.c = SystemClock.elapsedRealtime();
                            zznpVar.a = true;
                        }
                    } else if (zznpVar.a) {
                        zznpVar.a(zznpVar.zzg());
                        zznpVar.a = false;
                    }
                }
                zznpVar.a(zzg);
                zzav zzj = zzmfVar.zzj();
                if (!zzj.equals(zznpVar.d)) {
                    zznpVar.e(zzj);
                    ((xwo) ar4Var.e).g.h(16, zzj).a();
                }
            }
            long zzg2 = ar4Var.zzg();
            this.R = zzg2;
            long j4 = zzg2 - jxoVar.p;
            long j5 = this.E.r;
            ArrayList arrayList = this.n;
            if (!arrayList.isEmpty() && !this.E.b.b()) {
                if (this.U) {
                    this.U = false;
                }
                eyo eyoVar2 = this.E;
                eyoVar2.a.e(eyoVar2.b.a);
                int min = Math.min(this.T, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    pvd.j();
                    return;
                } else {
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        pvd.j();
                        return;
                    }
                    this.T = min;
                }
            }
            if (ar4Var.zzh()) {
                boolean z4 = !this.F.d;
                eyo eyoVar3 = this.E;
                this.E = O(eyoVar3.b, j4, eyoVar3.c, j4, z4, 6);
                r11 = z2;
            } else {
                eyo eyoVar4 = this.E;
                eyoVar4.r = j4;
                eyoVar4.s = SystemClock.elapsedRealtime();
                r11 = z2;
            }
        }
        this.E.p = ((jxo) d7cVar.o).d();
        eyo eyoVar5 = this.E;
        eyoVar5.q = S(eyoVar5.p);
        eyo eyoVar6 = this.E;
        if (eyoVar6.l && eyoVar6.e == 3 && p(eyoVar6.a, eyoVar6.b)) {
            eyo eyoVar7 = this.E;
            float f = 1.0f;
            if (eyoVar7.o.a == 1.0f) {
                zzjg zzjgVar = this.b0;
                long o = o(eyoVar7.a, eyoVar7.b.a, eyoVar7.r);
                long j6 = this.E.q;
                if (zzjgVar.c != j) {
                    long j7 = o - j6;
                    long j8 = zzjgVar.k;
                    if (j8 == j) {
                        zzjgVar.k = j7;
                        zzjgVar.l = 0L;
                        z = 2;
                    } else {
                        z = 2;
                        zzjgVar.k = Math.max(j7, (long) ((j7 * 9.999871E-4f) + (j8 * 0.999f)));
                        zzjgVar.l = (long) ((Math.abs(j7 - r12) * 9.999871E-4f) + (zzjgVar.l * 0.999f));
                    }
                    if (zzjgVar.j != j) {
                        j2 = 1000;
                        if (SystemClock.elapsedRealtime() - zzjgVar.j < 1000) {
                            f = zzjgVar.i;
                        }
                    } else {
                        j2 = 1000;
                    }
                    zzjgVar.j = SystemClock.elapsedRealtime();
                    long j9 = (zzjgVar.l * 3) + zzjgVar.k;
                    if (zzjgVar.h > j9) {
                        long u = zzfm.u(j2);
                        boolean z5 = z;
                        float f2 = zzjgVar.i - 1.0f;
                        long j10 = zzjgVar.e;
                        j3 = o;
                        float f3 = u;
                        long j11 = zzjgVar.h - (((long) (f2 * f3)) + ((long) (0.029999971f * f3)));
                        long[] jArr = new long[3];
                        jArr[r11] = j9;
                        jArr[1] = j10;
                        jArr[z5 ? 1 : 0] = j11;
                        max = jArr[r11];
                        for (int i = 1; i < 3; i++) {
                            long j12 = jArr[i];
                            if (j12 > max) {
                                max = j12;
                            }
                        }
                        zzjgVar.h = max;
                    } else {
                        j3 = o;
                        long max2 = j3 - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, zzjgVar.i - 1.0f) / 1.0E-7f));
                        long j13 = zzjgVar.h;
                        String str = zzfm.a;
                        max = Math.max(j13, Math.min(max2, j9));
                        zzjgVar.h = max;
                        long j14 = zzjgVar.g;
                        if (j14 != j && max > j14) {
                            zzjgVar.h = j14;
                            max = j14;
                        }
                    }
                    long j15 = j3 - max;
                    if (Math.abs(j15) < zzjgVar.a) {
                        zzjgVar.i = 1.0f;
                        f = 1.0f;
                    } else {
                        f = Math.max(0.97f, Math.min((j15 * 1.0E-7f) + 1.0f, 1.03f));
                        zzjgVar.i = f;
                    }
                }
                ar4 ar4Var2 = this.m;
                if (ar4Var2.zzj().a != f) {
                    zzav zzavVar = new zzav(f, this.E.o.b);
                    this.g.d(16);
                    this.m.e(zzavVar);
                    L(this.E.o, ar4Var2.zzj().a, r11, r11);
                }
            }
        }
    }

    public final void n(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.u.f(new q61(this, i, z));
        }
    }

    public final long o(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.o(obj, this.k).c;
        zzbe zzbeVar = this.j;
        zzbfVar.b(i, zzbeVar, 0L);
        if (zzbeVar.d == C.TIME_UNSET || !zzbeVar.b() || !zzbeVar.g) {
            return C.TIME_UNSET;
        }
        long j2 = zzbeVar.e;
        String str = zzfm.a;
        return zzfm.u((j2 == C.TIME_UNSET ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.d) - j;
    }

    public final boolean p(zzbf zzbfVar, zzxo zzxoVar) {
        if (zzxoVar.b() || zzbfVar.g()) {
            return false;
        }
        int i = zzbfVar.o(zzxoVar.a, this.k).c;
        zzbe zzbeVar = this.j;
        zzbfVar.b(i, zzbeVar, 0L);
        return zzbeVar.b() && zzbeVar.g && zzbeVar.d != C.TIME_UNSET;
    }

    public final void q(long j) {
        int i = this.E.e;
        long j2 = c0;
        long j3 = i == 3 ? 1000L : j2;
        for (int i2 = 0; i2 < 2; i2++) {
            tyf tyfVar = this.a[i2];
            long j4 = this.R;
            long j5 = this.S;
            zzne zzneVar = (zzne) tyfVar.e;
            long F = tyf.y(zzneVar) ? zzneVar.F(j4, j5) : Long.MAX_VALUE;
            zzne zzneVar2 = (zzne) tyfVar.f;
            if (zzneVar2 != null && zzneVar2.zze() != 0) {
                F = Math.min(F, zzneVar2.F(j4, j5));
            }
            j3 = Math.min(j3, zzfm.t(F));
        }
        if (this.E.i()) {
            jxo jxoVar = (jxo) this.q.l;
            if ((jxoVar != null ? jxoVar.m : null) != null) {
                if (this.R + (zzfm.u(j3) * this.E.o.a) >= r4.a()) {
                    j3 = Math.min(j3, j2);
                }
            }
        }
        this.g.c(j + j3);
    }

    public final void r(wwo wwoVar) {
        long longValue;
        long j;
        long j2;
        zzxo T;
        boolean z;
        long j3;
        int i;
        long j4;
        boolean z2;
        long j5;
        long j6;
        eyo eyoVar;
        zzxo zzxoVar;
        long j7;
        long j8;
        boolean z3;
        eyo eyoVar2;
        int i2;
        if (this.B) {
            if (this.C != null) {
                this.D++;
                this.F.a(1);
            }
            this.C = wwoVar;
            return;
        }
        this.F.a(1);
        zzbf zzbfVar = this.E.a;
        int i3 = this.M;
        boolean z4 = this.N;
        zzbe zzbeVar = this.j;
        zzbd zzbdVar = this.k;
        Pair A = A(zzbfVar, wwoVar, i3, z4, zzbeVar, zzbdVar);
        if (A == null) {
            Pair x = x(this.E.a);
            zzxo zzxoVar2 = (zzxo) x.first;
            longValue = ((Long) x.second).longValue();
            z = !this.E.a.g();
            T = zzxoVar2;
            j3 = -9223372036854775807L;
            j = -9223372036854775807L;
        } else {
            Object obj = A.first;
            longValue = ((Long) A.second).longValue();
            long j9 = wwoVar.c;
            if (j9 == C.TIME_UNSET) {
                j2 = -9223372036854775807L;
                j = -9223372036854775807L;
            } else {
                j = -9223372036854775807L;
                j2 = longValue;
            }
            d7c d7cVar = this.q;
            long j10 = j2;
            eyo eyoVar3 = this.E;
            T = d7cVar.T(eyoVar3, eyoVar3.a, obj, true, false);
            if (T.b()) {
                this.E.a.o(T.a, zzbdVar);
                int i4 = T.b;
                zza a = zzbdVar.f.a(i4);
                int i5 = 0;
                while (true) {
                    int[] iArr = a.d;
                    if (i5 >= iArr.length || (i = iArr[i5]) == 0 || i == 1) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == T.c) {
                    zzbdVar.f.getClass();
                }
                zzbdVar.f.a(i4).getClass();
                j3 = Math.max(j10, 0L);
                longValue = 0;
                z = true;
            } else {
                z = j9 == C.TIME_UNSET;
                j3 = j10;
            }
        }
        try {
            if (this.E.a.g()) {
                this.Q = wwoVar;
            } else {
                eyo eyoVar4 = this.E;
                if (A != null) {
                    if (T.equals(eyoVar4.b)) {
                        jxo jxoVar = (jxo) this.q.l;
                        if (jxoVar == null || !jxoVar.e || longValue == 0) {
                            j6 = longValue;
                        } else {
                            zzxg zzxgVar = jxoVar.a;
                            long j11 = zzbeVar.j;
                            if (this.A && j11 != j) {
                                this.z.getClass();
                            }
                            j6 = zzxgVar.h(longValue, this.y);
                        }
                        if (zzfm.t(j6) == zzfm.t(this.E.r) && ((i2 = (eyoVar2 = this.E).e) == 2 || i2 == 3)) {
                            longValue = eyoVar2.r;
                        }
                    } else {
                        j6 = longValue;
                    }
                    boolean z5 = this.E.e == 4;
                    d7c d7cVar2 = this.q;
                    long s = s(T, j6, ((jxo) d7cVar2.l) != ((jxo) d7cVar2.m), z5);
                    boolean z6 = z | (longValue != s);
                    try {
                        eyoVar = this.E;
                        zzxoVar = T;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        zzbf zzbfVar2 = eyoVar.a;
                        long j12 = j3;
                        try {
                            H(zzbfVar2, zzxoVar, zzbfVar2, eyoVar.b, j12, true);
                            T = zzxoVar;
                            j7 = j12;
                            j8 = s;
                            z3 = z6;
                            this.E = O(T, j8, j7, j8, z3, 2);
                        } catch (Throwable th2) {
                            th = th2;
                            T = zzxoVar;
                            j4 = j12;
                            j5 = s;
                            z2 = z6;
                            this.E = O(T, j5, j4, j5, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        T = zzxoVar;
                        j4 = j3;
                        j5 = s;
                        z2 = z6;
                        this.E = O(T, j5, j4, j5, z2, 2);
                        throw th;
                    }
                }
                if (eyoVar4.e != 1) {
                    e(4);
                }
                w(false, true, false, true);
            }
            z3 = z;
            j8 = longValue;
            j7 = j3;
            this.E = O(T, j8, j7, j8, z3, 2);
        } catch (Throwable th4) {
            th = th4;
            j4 = j3;
            z2 = z;
            j5 = longValue;
        }
    }

    public final long s(zzxo zzxoVar, long j, boolean z, boolean z2) {
        l();
        boolean z3 = true;
        z(false, true);
        if (z2 || this.E.e == 3) {
            e(2);
        }
        d7c d7cVar = this.q;
        jxo jxoVar = (jxo) d7cVar.l;
        jxo jxoVar2 = jxoVar;
        while (jxoVar2 != null && !zzxoVar.equals(jxoVar2.g.a)) {
            jxoVar2 = jxoVar2.m;
        }
        if (z || jxoVar != jxoVar2 || (jxoVar2 != null && jxoVar2.p + j < 0)) {
            C();
            if (jxoVar2 != null) {
                while (((jxo) d7cVar.l) != jxoVar2) {
                    d7cVar.M();
                }
                d7cVar.N(jxoVar2);
                jxoVar2.p = 1000000000000L;
                P(new boolean[2], ((jxo) this.q.m).a());
                jxoVar2.h = true;
            }
        }
        D();
        if (this.A) {
            tyf[] tyfVarArr = this.a;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                tyf tyfVar = tyfVarArr[i];
                if (tyfVar.t()) {
                    if (((zzne) tyfVar.e).zza() == 2) {
                        this.B = true;
                        break;
                    }
                    tyfVar.E();
                }
                i++;
            }
        }
        if (jxoVar2 != null) {
            d7cVar.N(jxoVar2);
            if (!jxoVar2.e) {
                jxoVar2.g = jxoVar2.g.a(j, C.TIME_UNSET);
            } else if (jxoVar2.f) {
                if (this.A) {
                    this.z.getClass();
                    if (!this.E.a.g() && jxoVar2.g.a.equals(this.E.b)) {
                        long j2 = jxoVar2.p + j;
                        tyf[] tyfVarArr2 = this.a;
                        boolean z4 = true;
                        for (int i2 = 0; i2 < 2; i2++) {
                            tyf tyfVar2 = tyfVarArr2[i2];
                            if (tyfVar2.t()) {
                                zzne z5 = tyfVar2.z(jxoVar2);
                                z4 &= z5 != null && z5.B(j2);
                            }
                        }
                        if (z4) {
                            zzxg zzxgVar = jxoVar2.a;
                            long j3 = this.E.r;
                            zznm zznmVar = zznm.b;
                            if (zzxgVar.h(j3, zznmVar) == zzxgVar.h(j, zznmVar)) {
                                z3 = false;
                            }
                        }
                    }
                }
                zzxg zzxgVar2 = jxoVar2.a;
                j = zzxgVar2.d(j);
                zzxgVar2.zzq(j - this.l);
            }
            t(j, z3);
            M();
        } else {
            d7cVar.Q();
            t(j, true);
        }
        R(false);
        this.g.g(2);
        return j;
    }

    public final void t(long j, boolean z) {
        d7c d7cVar = this.q;
        jxo jxoVar = (jxo) d7cVar.l;
        long j2 = j + (jxoVar == null ? 1000000000000L : jxoVar.p);
        this.R = j2;
        ((zznp) this.m.d).a(j2);
        for (int i = 0; i < 2; i++) {
            tyf tyfVar = this.a[i];
            long j3 = this.R;
            zzne z2 = tyfVar.z(jxoVar);
            if (z2 != null) {
                z2.z(j3, z);
            }
        }
        for (jxo jxoVar2 = (jxo) d7cVar.l; jxoVar2 != null; jxoVar2 = jxoVar2.m) {
            for (zzabe zzabeVar : jxoVar2.o.c) {
            }
        }
    }

    public final void u() {
        for (int i = 0; i < 2; i++) {
            tyf tyfVar = this.a[i];
            zznl zznlVar = this.A ? this.z : null;
            ((zzne) tyfVar.e).f(18, zznlVar);
            zzne zzneVar = (zzne) tyfVar.f;
            if (zzneVar != null) {
                zzneVar.f(18, zznlVar);
            }
        }
    }

    public final void v(boolean z, boolean z2) {
        w(z || !this.O, false, true, false);
        this.F.a(z2 ? 1 : 0);
        this.f.f(this.s);
        this.w.b(1, this.E.l);
        e(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[LOOP:1: B:39:0x00da->B:41:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        zzbf zzbfVar;
        zzxo zzxoVar;
        List list;
        zzbf[] zzbfVarArr;
        int i;
        this.g.d(2);
        this.B = false;
        boolean z5 = true;
        if (this.C != null) {
            this.F.a(1);
            this.C = null;
        }
        this.V = null;
        z(false, true);
        ar4 ar4Var = this.m;
        ar4Var.c = false;
        zznp zznpVar = (zznp) ar4Var.d;
        if (zznpVar.a) {
            zznpVar.a(zznpVar.zzg());
            zznpVar.a = false;
        }
        this.R = 1000000000000L;
        try {
            C();
        } catch (zzjn | RuntimeException e) {
            zzeh.f("Disable failed.", e);
        }
        if (z) {
            tyf[] tyfVarArr = this.a;
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    tyfVarArr[i2].o();
                } catch (RuntimeException e2) {
                    zzeh.f("Reset failed.", e2);
                }
            }
        }
        this.P = 0;
        eyo eyoVar = this.E;
        zzxo zzxoVar2 = eyoVar.b;
        long j2 = eyoVar.r;
        if (!this.E.b.b()) {
            eyo eyoVar2 = this.E;
            zzbd zzbdVar = this.k;
            zzxo zzxoVar3 = eyoVar2.b;
            zzbf zzbfVar2 = eyoVar2.a;
            if (!zzbfVar2.g() && !zzbfVar2.o(zzxoVar3.a, zzbdVar).e) {
                j = this.E.r;
                if (z2) {
                    this.Q = null;
                    Pair x = x(this.E.a);
                    zzxoVar2 = (zzxo) x.first;
                    j2 = ((Long) x.second).longValue();
                    boolean equals = zzxoVar2.equals(this.E.b);
                    j = C.TIME_UNSET;
                }
                z5 = false;
                long j3 = j2;
                long j4 = j;
                d7c d7cVar = this.q;
                d7cVar.Q();
                this.L = false;
                zzbfVar = this.E.a;
                if (z3 && (zzbfVar instanceof tyo)) {
                    tyo tyoVar = (tyo) zzbfVar;
                    zzzj zzzjVar = (zzzj) this.r.m;
                    zzbfVarArr = tyoVar.h;
                    zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
                    for (i = 0; i < zzbfVarArr.length; i++) {
                        zzbfVarArr2[i] = new syo(tyoVar, zzbfVarArr[i]);
                    }
                    zzbfVar = new tyo(zzbfVarArr2, tyoVar.i, zzzjVar);
                    if (zzxoVar2.b != -1) {
                        Object obj = zzxoVar2.a;
                        zzbd zzbdVar2 = this.k;
                        zzbfVar.o(obj, zzbdVar2);
                        zzbe zzbeVar = this.j;
                        zzbfVar.b(zzbdVar2.c, zzbeVar, 0L);
                        if (zzbeVar.b()) {
                            zzxoVar = new zzxo(obj, zzxoVar2.d);
                            zzbf zzbfVar3 = zzbfVar;
                            eyo eyoVar3 = this.E;
                            int i3 = eyoVar3.e;
                            zzjn zzjnVar = z4 ? null : eyoVar3.f;
                            zzzr zzzrVar = z5 ? zzzr.d : eyoVar3.h;
                            zzabm zzabmVar = z5 ? this.e : eyoVar3.i;
                            if (z5) {
                                mio mioVar = zzgxm.b;
                                list = s.e;
                            } else {
                                list = eyoVar3.j;
                            }
                            this.E = new eyo(zzbfVar3, zzxoVar, j4, j3, i3, zzjnVar, false, zzzrVar, zzabmVar, list, zzxoVar, eyoVar3.l, eyoVar3.m, eyoVar3.n, eyoVar3.o, j3, 0L, j3, 0L);
                            if (z3) {
                                d7cVar.J();
                                tdc tdcVar = this.r;
                                HashMap hashMap = (HashMap) tdcVar.e;
                                for (yxo yxoVar : hashMap.values()) {
                                    try {
                                        yxoVar.a.h(yxoVar.b);
                                    } catch (RuntimeException e3) {
                                        zzeh.f("Failed to release child source.", e3);
                                    }
                                    zzxq zzxqVar = yxoVar.a;
                                    wxo wxoVar = yxoVar.c;
                                    zzxqVar.e(wxoVar);
                                    zzxqVar.d(wxoVar);
                                }
                                hashMap.clear();
                                ((HashSet) tdcVar.f).clear();
                                tdcVar.g = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                zzxoVar = zzxoVar2;
                zzbf zzbfVar32 = zzbfVar;
                eyo eyoVar32 = this.E;
                int i32 = eyoVar32.e;
                if (z4) {
                }
                zzzr zzzrVar2 = z5 ? zzzr.d : eyoVar32.h;
                zzabm zzabmVar2 = z5 ? this.e : eyoVar32.i;
                if (z5) {
                }
                this.E = new eyo(zzbfVar32, zzxoVar, j4, j3, i32, zzjnVar, false, zzzrVar2, zzabmVar2, list, zzxoVar, eyoVar32.l, eyoVar32.m, eyoVar32.n, eyoVar32.o, j3, 0L, j3, 0L);
                if (z3) {
                }
            }
        }
        j = this.E.c;
        if (z2) {
        }
        z5 = false;
        long j32 = j2;
        long j42 = j;
        d7c d7cVar2 = this.q;
        d7cVar2.Q();
        this.L = false;
        zzbfVar = this.E.a;
        if (z3) {
            tyo tyoVar2 = (tyo) zzbfVar;
            zzzj zzzjVar2 = (zzzj) this.r.m;
            zzbfVarArr = tyoVar2.h;
            zzbf[] zzbfVarArr22 = new zzbf[zzbfVarArr.length];
            while (i < zzbfVarArr.length) {
            }
            zzbfVar = new tyo(zzbfVarArr22, tyoVar2.i, zzzjVar2);
            if (zzxoVar2.b != -1) {
            }
        }
        zzxoVar = zzxoVar2;
        zzbf zzbfVar322 = zzbfVar;
        eyo eyoVar322 = this.E;
        int i322 = eyoVar322.e;
        if (z4) {
        }
        zzzr zzzrVar22 = z5 ? zzzr.d : eyoVar322.h;
        zzabm zzabmVar22 = z5 ? this.e : eyoVar322.i;
        if (z5) {
        }
        this.E = new eyo(zzbfVar322, zzxoVar, j42, j32, i322, zzjnVar, false, zzzrVar22, zzabmVar22, list, zzxoVar, eyoVar322.l, eyoVar322.m, eyoVar322.n, eyoVar322.o, j32, 0L, j32, 0L);
        if (z3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r5.f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair x(zzbf zzbfVar) {
        int i;
        long j = 0;
        if (zzbfVar.g()) {
            return Pair.create(eyo.t, 0L);
        }
        int k = zzbfVar.k(this.N);
        zzbe zzbeVar = this.j;
        zzbd zzbdVar = this.k;
        Pair m = zzbfVar.m(zzbeVar, zzbdVar, k, C.TIME_UNSET);
        zzxo T = this.q.T(this.E, zzbfVar, m.first, true, false);
        long longValue = ((Long) m.second).longValue();
        if (T.b()) {
            zzbfVar.o(T.a, zzbdVar);
            int i2 = T.c;
            zza a = zzbdVar.f.a(T.b);
            int i3 = 0;
            while (true) {
                int[] iArr = a.d;
                if (i3 >= iArr.length || (i = iArr[i3]) == 0 || i == 1) {
                    break;
                }
                i3++;
            }
        } else {
            j = longValue;
        }
        return Pair.create(T, Long.valueOf(j));
    }

    public final void y(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.g() && zzbfVar2.g()) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            pvd.j();
        }
    }

    public final void z(boolean z, boolean z2) {
        this.J = z;
        long j = C.TIME_UNSET;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.K = j;
    }
}
