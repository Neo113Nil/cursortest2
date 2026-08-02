package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.facebook.internal.d;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabl;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzak;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzam;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzao;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzav;
import com.google.android.gms.internal.ads.zzaw;
import com.google.android.gms.internal.ads.zzax;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzba;
import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbe;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzbn;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzbz;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzda;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzf;
import com.google.android.gms.internal.ads.zzfd;
import com.google.android.gms.internal.ads.zzff;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzjw;
import com.google.android.gms.internal.ads.zzjy;
import com.google.android.gms.internal.ads.zzlz;
import com.google.android.gms.internal.ads.zzm;
import com.google.android.gms.internal.ads.zzmc;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zznh;
import com.google.android.gms.internal.ads.zznl;
import com.google.android.gms.internal.ads.zzno;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzqj;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzs;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzzj;
import com.google.android.gms.internal.ads.zzzr;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cwo extends zzf implements zzjy {
    public static final /* synthetic */ int Z = 0;
    public final zzfd A;
    public final tg6 B;
    public final f0o C;
    public final f0o D;
    public int E;
    public int F;
    public boolean G;
    public zzax H;
    public zzan I;
    public Object J;
    public Surface K;
    public final int L;
    public zzev M;
    public final zzd N;
    public float O;
    public boolean P;
    public final boolean Q;
    public boolean R;
    public final int S;
    public boolean T;
    public zzan U;
    public eyo V;
    public int W;
    public long X;
    public zzzj Y;
    public final zzabm b;
    public final zzax c;
    public final zzdt d;
    public final Context e;
    public final zzno f;
    public final zzne[] g;
    public final zzne[] h;
    public final zzabl i;
    public final zzea j;
    public final d1l k;
    public final xwo l;
    public final zzeg m;
    public final zzbd n;
    public final ArrayList o;
    public final boolean p;
    public final zzpv q;
    public final Looper r;
    public final zzabu s;
    public final zzff t;
    public final auo u;
    public final j9n v;
    public final zzfs w;
    public final zzfu x;
    public final long y;
    public final zzdn z;

    static {
        zzal.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cwo(zzjw zzjwVar, zzno zznoVar) {
        Handler.Callback callback;
        Looper looper = zzjwVar.h;
        zzff zzffVar = zzdp.a;
        this.d = new zzdt();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfm.a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.1] [");
            sb.append(str);
            sb.append(U3.j.e);
            zzeh.b(sb.toString());
            Context context = zzjwVar.a;
            zzff zzffVar2 = zzjwVar.b;
            this.e = context.getApplicationContext();
            this.q = new zzpv(zzffVar2);
            this.S = -1000;
            this.N = zzd.b;
            this.L = 1;
            int i = 0;
            this.P = false;
            this.y = 2000L;
            auo auoVar = new auo(this);
            this.u = auoVar;
            this.v = new j9n(1);
            Handler handler = new Handler(looper);
            fjn fjnVar = zzjwVar.c;
            int i2 = zzjw.l;
            this.g = ((b1l) fjnVar.b).f(handler, auoVar, auoVar);
            this.h = new zzne[2];
            int i3 = 0;
            while (true) {
                zzne[] zzneVarArr = this.h;
                int length = zzneVarArr.length;
                if (i3 >= 2) {
                    break;
                }
                zzne zzneVar = this.g[i3];
                zzneVarArr[i3] = null;
                i3++;
            }
            zzabl zzablVar = (zzabl) zzjwVar.e.mo792zza();
            this.i = zzablVar;
            zzjwVar.d.mo792zza();
            zzabu zzabuVar = (zzabu) zzjwVar.g.zzh();
            this.s = zzabuVar;
            this.p = true;
            zznl zznlVar = zzjwVar.i;
            this.r = looper;
            this.t = zzffVar2;
            this.f = zznoVar;
            this.m = new zzeg(new CopyOnWriteArraySet(), looper, looper.getThread(), zzffVar2, new omf(this, 24), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.Y = new zzzj();
            int length2 = this.g.length;
            zzabm zzabmVar = new zzabm(new zznh[2], new zzabe[2], zzbn.b, null);
            this.b = zzabmVar;
            this.n = new zzbd();
            zzaw zzawVar = new zzaw();
            zzr zzrVar = zzawVar.a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            zzrVar.getClass();
            for (int i4 = 20; i < i4; i4 = 20) {
                zzrVar.a(iArr[i]);
                i++;
            }
            zzablVar.b();
            int i5 = 29;
            zzawVar.a(29, true);
            zzs b = zzrVar.b();
            this.c = new zzax(b);
            zzr zzrVar2 = new zzaw().a;
            SparseBooleanArray sparseBooleanArray = b.a;
            for (int i6 = 0; i6 < sparseBooleanArray.size(); i6++) {
                zzguk.i(i6, sparseBooleanArray.size());
                zzrVar2.a(sparseBooleanArray.keyAt(i6));
            }
            zzrVar2.a(4);
            zzrVar2.a(10);
            this.H = new zzax(zzrVar2.b());
            this.j = zzffVar2.a(looper, null);
            d1l d1lVar = new d1l(this, i5);
            this.k = d1lVar;
            this.V = eyo.a(zzabmVar);
            this.q.t(zznoVar, looper);
            zzqj zzqjVar = new zzqj("");
            xwo xwoVar = new xwo(this.e, this.g, this.h, zzablVar, zzabmVar, (zzmc) zzjwVar.f.mo792zza(), zzabuVar, this.q, zzjwVar.k, looper, zzffVar2, d1lVar, zzqjVar, this.v);
            Looper looper2 = xwoVar.i;
            zzea zzeaVar = xwoVar.g;
            this.l = xwoVar;
            this.O = 1.0f;
            zzan zzanVar = zzan.C;
            this.I = zzanVar;
            this.U = zzanVar;
            this.W = -1;
            bio bioVar = zzda.a;
            this.Q = true;
            zzpv zzpvVar = this.q;
            zzpvVar.getClass();
            this.m.a(zzpvVar);
            zzabuVar.b(new Handler(looper), this.q);
            copyOnWriteArraySet.add(this.u);
            int i7 = Build.VERSION.SDK_INT;
            int i8 = 8;
            if (i7 >= 31) {
                callback = null;
                zzffVar2.a(looper2, null).f(new jgo(i8, this.e, this, zzqjVar));
            } else {
                callback = null;
            }
            zzdn zzdnVar = new zzdn(looper2, looper, zzffVar2, new xto(this, 2));
            this.z = zzdnVar;
            dno dnoVar = new dno(this, 6);
            zzea zzeaVar2 = zzdnVar.a;
            if (zzeaVar2.zza().getThread().isAlive()) {
                zzeaVar2.f(dnoVar);
            }
            zzbz zzbzVar = new zzbz();
            context.getApplicationContext();
            zzffVar2.a(looper2, callback);
            new d(zzbzVar, zzffVar2.a(looper, callback));
            zzfs zzfsVar = new zzfs(context, looper2, zzffVar2);
            this.w = zzfsVar;
            if (zzfsVar.d) {
                zzfsVar.d = false;
                zzfsVar.b(false, zzfsVar.e);
            }
            zzfu zzfuVar = new zzfu();
            context.getApplicationContext();
            zzffVar2.a(looper2, callback);
            zzffVar2.a(Looper.getMainLooper(), callback);
            this.x = zzfuVar;
            int i9 = zzm.a;
            zzbv zzbvVar = zzbv.d;
            this.M = zzev.c;
            this.B = i7 >= 34 ? new tg6(this, context) : callback;
            this.C = new f0o(this);
            this.D = new f0o(this);
            this.A = new zzfd(this, this.u, zzffVar2);
            zzeaVar.h(38, zznlVar).a();
            zzeaVar.a(this.N).a();
            p(1, 3, this.N);
            p(2, 4, Integer.valueOf(this.L));
            p(2, 5, 0);
            p(1, 9, Boolean.valueOf(this.P));
            p(6, 8, this.v);
            p(-1, 16, Integer.valueOf(this.S));
            this.d.a();
        } catch (Throwable th) {
            this.d.a();
            throw th;
        }
    }

    public static long i(eyo eyoVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = eyoVar.a;
        zzbfVar.o(eyoVar.b.a, zzbdVar);
        long j = eyoVar.c;
        if (j != C.TIME_UNSET) {
            return j;
        }
        zzbfVar.b(zzbdVar.c, zzbeVar, 0L).getClass();
        return 0L;
    }

    public static eyo k(eyo eyoVar, int i) {
        eyo d = eyoVar.d(i);
        return (i == 1 || i == 4) ? d.f(false) : d;
    }

    public final void b(float f) {
        o();
        String str = zzfm.a;
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f, 1.0f));
        if (this.O == max) {
            return;
        }
        this.O = max;
        this.l.g.h(32, Float.valueOf(max)).a();
        igf igfVar = new igf(max);
        zzeg zzegVar = this.m;
        zzegVar.c(22, igfVar);
        zzegVar.d();
    }

    public final void c(zznt zzntVar) {
        this.q.f.a(zzntVar);
    }

    public final void d(zzjn zzjnVar) {
        eyo eyoVar = this.V;
        eyo g = eyoVar.g(eyoVar.b);
        g.p = g.r;
        g.q = 0L;
        eyo k = k(g, 1);
        if (zzjnVar != null) {
            k = k.e(zzjnVar);
        }
        this.E++;
        this.l.g.k(6).a();
        h(k, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final int e(eyo eyoVar) {
        zzbf zzbfVar = eyoVar.a;
        return zzbfVar.g() ? this.W : zzbfVar.o(eyoVar.b.a, this.n).c;
    }

    public final long f(eyo eyoVar) {
        long t = zzfm.t(0L);
        zzxo zzxoVar = eyoVar.b;
        if (!zzxoVar.b()) {
            return zzfm.t(g(eyoVar));
        }
        zzbf zzbfVar = eyoVar.a;
        zzbfVar.o(zzxoVar.a, this.n);
        long j = eyoVar.c;
        if (j != C.TIME_UNSET) {
            return zzfm.t(j) + t;
        }
        zzbfVar.b(e(eyoVar), this.a, 0L).getClass();
        return t;
    }

    public final long g(eyo eyoVar) {
        zzbf zzbfVar = eyoVar.a;
        if (zzbfVar.g()) {
            return zzfm.u(this.X);
        }
        long j = eyoVar.r;
        zzxo zzxoVar = eyoVar.b;
        if (zzxoVar.b()) {
            return j;
        }
        zzbfVar.o(zzxoVar.a, this.n);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0585 A[LOOP:0: B:111:0x057f->B:113:0x0585, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x059f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0511  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final eyo eyoVar, int i, boolean z, int i2, long j, int i3) {
        int i4;
        int i5;
        boolean z2;
        Pair pair;
        boolean z3;
        boolean z4;
        int i6;
        boolean booleanValue;
        zzak zzakVar;
        List list;
        int i7;
        boolean z5;
        boolean z6;
        zzbf zzq;
        zzan zzanVar;
        boolean equals;
        int i8;
        int i9;
        zzfu zzfuVar;
        zzfs zzfsVar;
        int zzh;
        boolean zzk;
        int i10;
        boolean z7;
        zzjn zzjnVar;
        zzjn zzjnVar2;
        zzabm zzabmVar;
        zzabm zzabmVar2;
        final int i11;
        final int i12;
        zzax zzaxVar;
        zzno zznoVar;
        int i13;
        zzbf zzq2;
        int i14;
        int i15;
        zzbf zzq3;
        int i16;
        int i17;
        zzbf zzq4;
        boolean z8;
        long j2;
        int i18;
        SparseBooleanArray sparseBooleanArray;
        int i19;
        boolean z9;
        int i20;
        boolean z10;
        int i21;
        zzax zzaxVar2;
        int i22;
        int i23;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long j3;
        long i24;
        int i25;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        int i26 = i2;
        eyo eyoVar2 = this.V;
        this.V = eyoVar;
        zzbf zzbfVar = eyoVar.a;
        if (!zzbfVar.g()) {
            Object obj5 = eyoVar.b.a;
            zzguk.g(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, zzbfVar.getClass().getName(), Integer.valueOf(zzbfVar.a())), zzbfVar.e(obj5) != -1);
        }
        zzbf zzbfVar2 = eyoVar2.a;
        boolean equals2 = zzbfVar2.equals(zzbfVar);
        if (zzbfVar.g() && zzbfVar2.g()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            if (zzbfVar.g() == zzbfVar2.g()) {
                zzxo zzxoVar = eyoVar2.b;
                Object obj6 = zzxoVar.a;
                i4 = 0;
                zzbd zzbdVar = this.n;
                int i27 = zzbfVar2.o(obj6, zzbdVar).c;
                zzbe zzbeVar = this.a;
                Object obj7 = zzbfVar2.b(i27, zzbeVar, 0L).a;
                zzxo zzxoVar2 = eyoVar.b;
                if (obj7.equals(zzbfVar.b(zzbfVar.o(zzxoVar2.a, zzbdVar).c, zzbeVar, 0L).a)) {
                    if (z) {
                        if (i26 != 0) {
                            i5 = i26;
                        } else if (zzxoVar.d < zzxoVar2.d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i5 = 0;
                            z2 = true;
                        } else {
                            i5 = 0;
                        }
                        z2 = true;
                    } else {
                        i5 = i26;
                        z2 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z) {
                        z3 = false;
                        z4 = false;
                    } else if (i26 == 0) {
                        i26 = 0;
                        i6 = 1;
                        z4 = true;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
                        i5 = i26;
                        z2 = z4;
                    } else {
                        z3 = true;
                        z4 = true;
                    }
                    if (z3 && i26 == 1) {
                        i6 = 2;
                    } else {
                        if (equals2) {
                            zzl.s();
                            return;
                        }
                        i6 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
                    i5 = i26;
                    z2 = z4;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzakVar = null;
                } else {
                    zzakVar = !zzbfVar.g() ? zzbfVar.b(zzbfVar.o(eyoVar.b.a, this.n).c, this.a, 0L).b : null;
                    this.U = zzan.C;
                }
                if (booleanValue && eyoVar2.j.equals(eyoVar.j)) {
                    z5 = z2;
                } else {
                    zzam a = this.U.a();
                    list = eyoVar.j;
                    i7 = i4;
                    while (i7 < list.size()) {
                        zzap zzapVar = (zzap) list.get(i7);
                        int i28 = i4;
                        while (true) {
                            zzao[] zzaoVarArr = zzapVar.a;
                            z6 = z2;
                            if (i28 < zzaoVarArr.length) {
                                zzaoVarArr[i28].a(a);
                                i28++;
                                z2 = z6;
                            }
                        }
                        i7++;
                        z2 = z6;
                    }
                    z5 = z2;
                    this.U = new zzan(a);
                }
                zzq = zzq();
                if (zzq.g()) {
                    zzak zzakVar4 = zzq.b(zzs(), this.a, 0L).b;
                    zzam a2 = this.U.a();
                    zzan zzanVar2 = zzakVar4.d;
                    if (zzanVar2 != null) {
                        CharSequence charSequence = zzanVar2.a;
                        if (charSequence != null) {
                            a2.a = charSequence;
                        }
                        CharSequence charSequence2 = zzanVar2.b;
                        if (charSequence2 != null) {
                            a2.b = charSequence2;
                        }
                        CharSequence charSequence3 = zzanVar2.c;
                        if (charSequence3 != null) {
                            a2.c = charSequence3;
                        }
                        CharSequence charSequence4 = zzanVar2.d;
                        if (charSequence4 != null) {
                            a2.d = charSequence4;
                        }
                        CharSequence charSequence5 = zzanVar2.e;
                        if (charSequence5 != null) {
                            a2.e = charSequence5;
                        }
                        byte[] bArr = zzanVar2.f;
                        if (bArr != null) {
                            Integer num = zzanVar2.g;
                            a2.f = (byte[]) bArr.clone();
                            a2.g = num;
                        }
                        Integer num2 = zzanVar2.h;
                        if (num2 != null) {
                            a2.h = num2;
                        }
                        Integer num3 = zzanVar2.i;
                        if (num3 != null) {
                            a2.i = num3;
                        }
                        Integer num4 = zzanVar2.j;
                        if (num4 != null) {
                            a2.j = num4;
                        }
                        Boolean bool = zzanVar2.k;
                        if (bool != null) {
                            a2.k = bool;
                        }
                        Integer num5 = zzanVar2.l;
                        if (num5 != null) {
                            a2.l = num5;
                        }
                        Integer num6 = zzanVar2.m;
                        if (num6 != null) {
                            a2.l = num6;
                        }
                        Integer num7 = zzanVar2.n;
                        if (num7 != null) {
                            a2.m = num7;
                        }
                        Integer num8 = zzanVar2.o;
                        if (num8 != null) {
                            a2.n = num8;
                        }
                        Integer num9 = zzanVar2.p;
                        if (num9 != null) {
                            a2.o = num9;
                        }
                        Integer num10 = zzanVar2.q;
                        if (num10 != null) {
                            a2.p = num10;
                        }
                        Integer num11 = zzanVar2.r;
                        if (num11 != null) {
                            a2.q = num11;
                        }
                        CharSequence charSequence6 = zzanVar2.s;
                        if (charSequence6 != null) {
                            a2.r = charSequence6;
                        }
                        CharSequence charSequence7 = zzanVar2.t;
                        if (charSequence7 != null) {
                            a2.s = charSequence7;
                        }
                        CharSequence charSequence8 = zzanVar2.u;
                        if (charSequence8 != null) {
                            a2.t = charSequence8;
                        }
                        CharSequence charSequence9 = zzanVar2.v;
                        if (charSequence9 != null) {
                            a2.u = charSequence9;
                        }
                        Integer num12 = zzanVar2.w;
                        if (num12 != null) {
                            a2.v = num12;
                        }
                        Integer num13 = zzanVar2.x;
                        if (num13 != null) {
                            a2.w = num13;
                        }
                        CharSequence charSequence10 = zzanVar2.y;
                        if (charSequence10 != null) {
                            a2.x = charSequence10;
                        }
                        CharSequence charSequence11 = zzanVar2.z;
                        if (charSequence11 != null) {
                            a2.y = charSequence11;
                        }
                        Integer num14 = zzanVar2.A;
                        if (num14 != null) {
                            a2.z = num14;
                        }
                        zzgxm zzgxmVar = zzanVar2.B;
                        if (!zzgxmVar.isEmpty()) {
                            a2.A = zzgxm.x(zzgxmVar);
                        }
                    }
                    zzanVar = new zzan(a2);
                } else {
                    zzanVar = this.U;
                }
                equals = zzanVar.equals(this.I);
                this.I = zzanVar;
                i8 = eyoVar2.l == eyoVar.l ? 1 : i4;
                i9 = eyoVar2.e == eyoVar.e ? 1 : i4;
                if (i9 == 0 || i8 != 0) {
                    zzfuVar = this.x;
                    zzfsVar = this.w;
                    zzh = zzh();
                    if (zzh != 2 || zzh == 3) {
                        o();
                        this.V.getClass();
                        zzfsVar.a(zzk());
                        zzk = zzk();
                        if (zzfuVar.a != zzk) {
                            zzfuVar.a = zzk;
                        }
                    } else {
                        boolean z11 = i4;
                        zzfsVar.a(z11);
                        if (zzfuVar.a) {
                            zzfuVar.a = z11;
                        }
                    }
                }
                boolean z12 = eyoVar2.g == eyoVar.g;
                if (!equals2) {
                    this.m.c(0, new iuo(eyoVar, i));
                }
                if (z5) {
                    i10 = i9;
                    z7 = z12;
                } else {
                    zzbd zzbdVar2 = new zzbd();
                    if (zzbfVar2.g()) {
                        i10 = i9;
                        z7 = z12;
                        i22 = i3;
                        i23 = i22;
                        obj = null;
                        zzakVar2 = null;
                        obj2 = null;
                    } else {
                        Object obj8 = eyoVar2.b.a;
                        zzbfVar2.o(obj8, zzbdVar2);
                        int i29 = zzbdVar2.c;
                        int e = zzbfVar2.e(obj8);
                        zzbe zzbeVar2 = this.a;
                        i10 = i9;
                        z7 = z12;
                        obj = zzbfVar2.b(i29, zzbeVar2, 0L).a;
                        zzakVar2 = zzbeVar2.b;
                        obj2 = obj8;
                        i22 = i29;
                        i23 = e;
                    }
                    zzxo zzxoVar3 = eyoVar2.b;
                    if (i5 != 0) {
                        boolean b = zzxoVar3.b();
                        j3 = eyoVar2.r;
                        if (b) {
                            i24 = i(eyoVar2);
                            String str = zzfm.a;
                            zzxo zzxoVar4 = eyoVar2.b;
                            zzba zzbaVar = new zzba(obj, i22, zzakVar2, obj2, i23, zzfm.t(j3), zzfm.t(i24), zzxoVar4.b, zzxoVar4.c);
                            int zzs = zzs();
                            int q = q();
                            if (this.V.a.g()) {
                            }
                            long t = zzfm.t(j);
                            if (!this.V.b.b()) {
                            }
                            zzxo zzxoVar5 = this.V.b;
                            this.m.c(11, new b10(i5, zzbaVar, new zzba(obj3, zzs, zzakVar3, obj4, i25, t, r27, zzxoVar5.b, zzxoVar5.c)));
                        }
                        i24 = j3;
                        String str2 = zzfm.a;
                        zzxo zzxoVar42 = eyoVar2.b;
                        zzba zzbaVar2 = new zzba(obj, i22, zzakVar2, obj2, i23, zzfm.t(j3), zzfm.t(i24), zzxoVar42.b, zzxoVar42.c);
                        int zzs2 = zzs();
                        int q2 = q();
                        if (this.V.a.g()) {
                        }
                        long t2 = zzfm.t(j);
                        if (!this.V.b.b()) {
                        }
                        zzxo zzxoVar52 = this.V.b;
                        this.m.c(11, new b10(i5, zzbaVar2, new zzba(obj3, zzs2, zzakVar3, obj4, i25, t2, r27, zzxoVar52.b, zzxoVar52.c)));
                    } else if (zzxoVar3.b()) {
                        j3 = zzbdVar2.b(zzxoVar3.b, zzxoVar3.c);
                        i24 = i(eyoVar2);
                        String str22 = zzfm.a;
                        zzxo zzxoVar422 = eyoVar2.b;
                        zzba zzbaVar22 = new zzba(obj, i22, zzakVar2, obj2, i23, zzfm.t(j3), zzfm.t(i24), zzxoVar422.b, zzxoVar422.c);
                        int zzs22 = zzs();
                        int q22 = q();
                        if (this.V.a.g()) {
                            eyo eyoVar3 = this.V;
                            Object obj9 = eyoVar3.b.a;
                            eyoVar3.a.o(obj9, this.n);
                            int e2 = this.V.a.e(obj9);
                            zzbf zzbfVar3 = this.V.a;
                            zzbe zzbeVar3 = this.a;
                            i25 = e2;
                            obj3 = zzbfVar3.b(zzs22, zzbeVar3, 0L).a;
                            zzakVar3 = zzbeVar3.b;
                            obj4 = obj9;
                        } else {
                            i25 = q22;
                            obj3 = null;
                            zzakVar3 = null;
                            obj4 = null;
                        }
                        long t22 = zzfm.t(j);
                        long t3 = !this.V.b.b() ? zzfm.t(i(this.V)) : t22;
                        zzxo zzxoVar522 = this.V.b;
                        this.m.c(11, new b10(i5, zzbaVar22, new zzba(obj3, zzs22, zzakVar3, obj4, i25, t22, t3, zzxoVar522.b, zzxoVar522.c)));
                    } else {
                        j3 = zzxoVar3.e != -1 ? i(this.V) : zzbdVar2.d;
                        i24 = j3;
                        String str222 = zzfm.a;
                        zzxo zzxoVar4222 = eyoVar2.b;
                        zzba zzbaVar222 = new zzba(obj, i22, zzakVar2, obj2, i23, zzfm.t(j3), zzfm.t(i24), zzxoVar4222.b, zzxoVar4222.c);
                        int zzs222 = zzs();
                        int q222 = q();
                        if (this.V.a.g()) {
                        }
                        long t222 = zzfm.t(j);
                        if (!this.V.b.b()) {
                        }
                        zzxo zzxoVar5222 = this.V.b;
                        this.m.c(11, new b10(i5, zzbaVar222, new zzba(obj3, zzs222, zzakVar3, obj4, i25, t222, t3, zzxoVar5222.b, zzxoVar5222.c)));
                    }
                }
                if (booleanValue) {
                    this.m.c(1, new wkf(zzakVar, intValue));
                }
                zzjnVar = eyoVar2.f;
                zzjnVar2 = eyoVar.f;
                if (zzjnVar != zzjnVar2) {
                    zzeg zzegVar = this.m;
                    final int i30 = 2;
                    zzegVar.c(10, new zzeb() { // from class: luo
                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* renamed from: zza */
                        public final /* synthetic */ void mo13zza(Object obj10) {
                            int i31 = i30;
                            eyo eyoVar4 = eyoVar;
                            zzaz zzazVar = (zzaz) obj10;
                            switch (i31) {
                                case 0:
                                    int i32 = cwo.Z;
                                    boolean z13 = eyoVar4.l;
                                    zzazVar.zzh();
                                    break;
                                case 1:
                                    int i33 = cwo.Z;
                                    zzav zzavVar = eyoVar4.o;
                                    zzazVar.zzp();
                                    break;
                                default:
                                    int i34 = cwo.Z;
                                    zzazVar.i(eyoVar4.f);
                                    break;
                            }
                        }
                    });
                    if (zzjnVar2 != null) {
                        final int i31 = 0;
                        zzegVar.c(10, new zzeb() { // from class: duo
                            @Override // com.google.android.gms.internal.ads.zzeb
                            /* renamed from: zza */
                            public final /* synthetic */ void mo13zza(Object obj10) {
                                int i32 = i31;
                                eyo eyoVar4 = eyoVar;
                                zzaz zzazVar = (zzaz) obj10;
                                switch (i32) {
                                    case 0:
                                        int i33 = cwo.Z;
                                        zzazVar.j(eyoVar4.f);
                                        break;
                                    default:
                                        int i34 = cwo.Z;
                                        boolean z13 = eyoVar4.l;
                                        zzazVar.zzj();
                                        break;
                                }
                            }
                        });
                    }
                }
                zzabmVar = eyoVar2.i;
                zzabmVar2 = eyoVar.i;
                if (zzabmVar != zzabmVar2) {
                    this.i.e(zzabmVar2.e);
                    byte b2 = 0;
                    this.m.c(2, new iuo(eyoVar, b2, b2));
                }
                if (!equals) {
                    this.m.c(14, new ubf(this.I));
                }
                if (z7) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    this.m.c(3, new zzeb() { // from class: kuo
                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* renamed from: zza */
                        public final /* synthetic */ void mo13zza(Object obj10) {
                            int i32 = i11;
                            eyo eyoVar4 = eyoVar;
                            zzaz zzazVar = (zzaz) obj10;
                            switch (i32) {
                                case 0:
                                    int i33 = cwo.Z;
                                    boolean z13 = eyoVar4.g;
                                    zzazVar.zzf();
                                    break;
                                default:
                                    int i34 = cwo.Z;
                                    eyoVar4.getClass();
                                    zzazVar.zzl();
                                    break;
                            }
                        }
                    });
                }
                if (i10 == 0 || i8 != 0) {
                    this.m.c(-1, new zzeb() { // from class: luo
                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* renamed from: zza */
                        public final /* synthetic */ void mo13zza(Object obj10) {
                            int i312 = i11;
                            eyo eyoVar4 = eyoVar;
                            zzaz zzazVar = (zzaz) obj10;
                            switch (i312) {
                                case 0:
                                    int i32 = cwo.Z;
                                    boolean z13 = eyoVar4.l;
                                    zzazVar.zzh();
                                    break;
                                case 1:
                                    int i33 = cwo.Z;
                                    zzav zzavVar = eyoVar4.o;
                                    zzazVar.zzp();
                                    break;
                                default:
                                    int i34 = cwo.Z;
                                    zzazVar.i(eyoVar4.f);
                                    break;
                            }
                        }
                    });
                }
                if (i10 != 0) {
                    this.m.c(4, new xto(eyoVar, 1));
                }
                if (i8 == 0 || eyoVar2.m != eyoVar.m) {
                    i12 = 1;
                    this.m.c(5, new zzeb() { // from class: duo
                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* renamed from: zza */
                        public final /* synthetic */ void mo13zza(Object obj10) {
                            int i32 = i12;
                            eyo eyoVar4 = eyoVar;
                            zzaz zzazVar = (zzaz) obj10;
                            switch (i32) {
                                case 0:
                                    int i33 = cwo.Z;
                                    zzazVar.j(eyoVar4.f);
                                    break;
                                default:
                                    int i34 = cwo.Z;
                                    boolean z13 = eyoVar4.l;
                                    zzazVar.zzj();
                                    break;
                            }
                        }
                    });
                } else {
                    i12 = 1;
                }
                if (eyoVar2.n != eyoVar.n) {
                    this.m.c(6, new iuo(eyoVar, i12, (byte) 0));
                }
                if (eyoVar2.i() != eyoVar.i()) {
                    this.m.c(7, new zzeb() { // from class: kuo
                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* renamed from: zza */
                        public final /* synthetic */ void mo13zza(Object obj10) {
                            int i32 = i12;
                            eyo eyoVar4 = eyoVar;
                            zzaz zzazVar = (zzaz) obj10;
                            switch (i32) {
                                case 0:
                                    int i33 = cwo.Z;
                                    boolean z13 = eyoVar4.g;
                                    zzazVar.zzf();
                                    break;
                                default:
                                    int i34 = cwo.Z;
                                    eyoVar4.getClass();
                                    zzazVar.zzl();
                                    break;
                            }
                        }
                    });
                }
                if (!eyoVar2.o.equals(eyoVar.o)) {
                    this.m.c(12, new zzeb() { // from class: luo
                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* renamed from: zza */
                        public final /* synthetic */ void mo13zza(Object obj10) {
                            int i312 = i12;
                            eyo eyoVar4 = eyoVar;
                            zzaz zzazVar = (zzaz) obj10;
                            switch (i312) {
                                case 0:
                                    int i32 = cwo.Z;
                                    boolean z13 = eyoVar4.l;
                                    zzazVar.zzh();
                                    break;
                                case 1:
                                    int i33 = cwo.Z;
                                    zzav zzavVar = eyoVar4.o;
                                    zzazVar.zzp();
                                    break;
                                default:
                                    int i34 = cwo.Z;
                                    zzazVar.i(eyoVar4.f);
                                    break;
                            }
                        }
                    });
                }
                zzaxVar = this.H;
                zznoVar = this.f;
                zzax zzaxVar3 = this.c;
                String str3 = zzfm.a;
                boolean f = zznoVar.f();
                zzbf zzq5 = zznoVar.zzq();
                i13 = (zzq5.g() && zzq5.b(zznoVar.zzs(), zznoVar.a, 0L).f) ? i12 : 0;
                zzq2 = zznoVar.zzq();
                if (zzq2.g()) {
                    int zzs3 = zznoVar.zzs();
                    zznoVar.zzl();
                    zznoVar.zzm();
                    int i32 = zzq2.i(zzs3);
                    i14 = -1;
                    i15 = i32 != -1 ? i12 : 0;
                } else {
                    i15 = 0;
                    i14 = -1;
                }
                zzq3 = zznoVar.zzq();
                if (zzq3.g()) {
                    int zzs4 = zznoVar.zzs();
                    zznoVar.zzl();
                    zznoVar.zzm();
                    i16 = 0;
                    i17 = zzq3.h(zzs4, 0, false) != i14 ? i12 : 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                zzq4 = zznoVar.zzq();
                if (zzq4.g()) {
                    z8 = f;
                    j2 = 0;
                    if (zzq4.b(zznoVar.zzs(), zznoVar.a, 0L).b()) {
                        i18 = i12;
                        zzbf zzq6 = zznoVar.zzq();
                        int i33 = (zzq6.g() && zzq6.b(zznoVar.zzs(), zznoVar.a, j2).g) ? 1 : i16;
                        boolean g = zznoVar.zzq().g();
                        zzaw zzawVar = new zzaw();
                        sparseBooleanArray = zzaxVar3.a.a;
                        for (i19 = i16; i19 < sparseBooleanArray.size(); i19++) {
                            zzr zzrVar = zzawVar.a;
                            zzguk.i(i19, sparseBooleanArray.size());
                            zzrVar.a(sparseBooleanArray.keyAt(i19));
                        }
                        boolean z13 = !z8;
                        zzawVar.a(4, z13);
                        zzawVar.a(5, (i13 != 0 || z8) ? i16 : 1);
                        zzawVar.a(6, (i15 != 0 || z8) ? i16 : 1);
                        zzawVar.a(7, (!g || (i15 == 0 && i18 != 0 && i13 == 0) || z8) ? i16 : 1);
                        zzawVar.a(8, (i17 != 0 || z8) ? i16 : 1);
                        zzawVar.a(9, (!g || (i17 == 0 && (i18 == 0 || i33 == 0)) || z8) ? i16 : 1);
                        zzawVar.a(10, z13);
                        if (i13 != 0 || z8) {
                            z9 = i16;
                            i20 = 11;
                        } else {
                            i20 = 11;
                            z9 = 1;
                        }
                        zzawVar.a(i20, z9);
                        if (i13 != 0 || z8) {
                            z10 = i16;
                            i21 = 12;
                        } else {
                            i21 = 12;
                            z10 = 1;
                        }
                        zzawVar.a(i21, z10);
                        zzaxVar2 = new zzax(zzawVar.a.b());
                        this.H = zzaxVar2;
                        if (!zzaxVar2.equals(zzaxVar)) {
                            this.m.c(13, new dff(this, 24));
                        }
                        this.m.d();
                    }
                } else {
                    z8 = f;
                    j2 = 0;
                }
                i18 = i16;
                zzbf zzq62 = zznoVar.zzq();
                if (zzq62.g()) {
                }
                boolean g2 = zznoVar.zzq().g();
                zzaw zzawVar2 = new zzaw();
                sparseBooleanArray = zzaxVar3.a.a;
                while (i19 < sparseBooleanArray.size()) {
                }
                boolean z132 = !z8;
                zzawVar2.a(4, z132);
                zzawVar2.a(5, (i13 != 0 || z8) ? i16 : 1);
                zzawVar2.a(6, (i15 != 0 || z8) ? i16 : 1);
                zzawVar2.a(7, (!g2 || (i15 == 0 && i18 != 0 && i13 == 0) || z8) ? i16 : 1);
                zzawVar2.a(8, (i17 != 0 || z8) ? i16 : 1);
                zzawVar2.a(9, (!g2 || (i17 == 0 && (i18 == 0 || i33 == 0)) || z8) ? i16 : 1);
                zzawVar2.a(10, z132);
                if (i13 != 0) {
                }
                z9 = i16;
                i20 = 11;
                zzawVar2.a(i20, z9);
                if (i13 != 0) {
                }
                z10 = i16;
                i21 = 12;
                zzawVar2.a(i21, z10);
                zzaxVar2 = new zzax(zzawVar2.a.b());
                this.H = zzaxVar2;
                if (!zzaxVar2.equals(zzaxVar)) {
                }
                this.m.d();
            }
            pair = new Pair(Boolean.TRUE, 3);
        }
        i5 = i26;
        i4 = 0;
        z2 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (booleanValue) {
        }
        zzam a3 = this.U.a();
        list = eyoVar.j;
        i7 = i4;
        while (i7 < list.size()) {
        }
        z5 = z2;
        this.U = new zzan(a3);
        zzq = zzq();
        if (zzq.g()) {
        }
        equals = zzanVar.equals(this.I);
        this.I = zzanVar;
        if (eyoVar2.l == eyoVar.l) {
        }
        if (eyoVar2.e == eyoVar.e) {
        }
        if (i9 == 0) {
        }
        zzfuVar = this.x;
        zzfsVar = this.w;
        zzh = zzh();
        if (zzh != 2) {
        }
        o();
        this.V.getClass();
        zzfsVar.a(zzk());
        zzk = zzk();
        if (zzfuVar.a != zzk) {
        }
        if (eyoVar2.g == eyoVar.g) {
        }
        if (!equals2) {
        }
        if (z5) {
        }
        if (booleanValue) {
        }
        zzjnVar = eyoVar2.f;
        zzjnVar2 = eyoVar.f;
        if (zzjnVar != zzjnVar2) {
        }
        zzabmVar = eyoVar2.i;
        zzabmVar2 = eyoVar.i;
        if (zzabmVar != zzabmVar2) {
        }
        if (!equals) {
        }
        if (z7) {
        }
        if (i10 == 0) {
        }
        this.m.c(-1, new zzeb() { // from class: luo
            @Override // com.google.android.gms.internal.ads.zzeb
            /* renamed from: zza */
            public final /* synthetic */ void mo13zza(Object obj10) {
                int i312 = i11;
                eyo eyoVar4 = eyoVar;
                zzaz zzazVar = (zzaz) obj10;
                switch (i312) {
                    case 0:
                        int i322 = cwo.Z;
                        boolean z133 = eyoVar4.l;
                        zzazVar.zzh();
                        break;
                    case 1:
                        int i332 = cwo.Z;
                        zzav zzavVar = eyoVar4.o;
                        zzazVar.zzp();
                        break;
                    default:
                        int i34 = cwo.Z;
                        zzazVar.i(eyoVar4.f);
                        break;
                }
            }
        });
        if (i10 != 0) {
        }
        if (i8 == 0) {
        }
        i12 = 1;
        this.m.c(5, new zzeb() { // from class: duo
            @Override // com.google.android.gms.internal.ads.zzeb
            /* renamed from: zza */
            public final /* synthetic */ void mo13zza(Object obj10) {
                int i322 = i12;
                eyo eyoVar4 = eyoVar;
                zzaz zzazVar = (zzaz) obj10;
                switch (i322) {
                    case 0:
                        int i332 = cwo.Z;
                        zzazVar.j(eyoVar4.f);
                        break;
                    default:
                        int i34 = cwo.Z;
                        boolean z133 = eyoVar4.l;
                        zzazVar.zzj();
                        break;
                }
            }
        });
        if (eyoVar2.n != eyoVar.n) {
        }
        if (eyoVar2.i() != eyoVar.i()) {
        }
        if (!eyoVar2.o.equals(eyoVar.o)) {
        }
        zzaxVar = this.H;
        zznoVar = this.f;
        zzax zzaxVar32 = this.c;
        String str32 = zzfm.a;
        boolean f2 = zznoVar.f();
        zzbf zzq52 = zznoVar.zzq();
        if (zzq52.g()) {
        }
        zzq2 = zznoVar.zzq();
        if (zzq2.g()) {
        }
        zzq3 = zznoVar.zzq();
        if (zzq3.g()) {
        }
        zzq4 = zznoVar.zzq();
        if (zzq4.g()) {
        }
        i18 = i16;
        zzbf zzq622 = zznoVar.zzq();
        if (zzq622.g()) {
        }
        boolean g22 = zznoVar.zzq().g();
        zzaw zzawVar22 = new zzaw();
        sparseBooleanArray = zzaxVar32.a.a;
        while (i19 < sparseBooleanArray.size()) {
        }
        boolean z1322 = !z8;
        zzawVar22.a(4, z1322);
        zzawVar22.a(5, (i13 != 0 || z8) ? i16 : 1);
        zzawVar22.a(6, (i15 != 0 || z8) ? i16 : 1);
        zzawVar22.a(7, (!g22 || (i15 == 0 && i18 != 0 && i13 == 0) || z8) ? i16 : 1);
        zzawVar22.a(8, (i17 != 0 || z8) ? i16 : 1);
        zzawVar22.a(9, (!g22 || (i17 == 0 && (i18 == 0 || i33 == 0)) || z8) ? i16 : 1);
        zzawVar22.a(10, z1322);
        if (i13 != 0) {
        }
        z9 = i16;
        i20 = 11;
        zzawVar22.a(i20, z9);
        if (i13 != 0) {
        }
        z10 = i16;
        i21 = 12;
        zzawVar22.a(i21, z10);
        zzaxVar2 = new zzax(zzawVar22.a.b());
        this.H = zzaxVar2;
        if (!zzaxVar2.equals(zzaxVar)) {
        }
        this.m.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eyo j(eyo eyoVar, zzbf zzbfVar, Pair pair) {
        boolean z;
        List list;
        zzguk.a(zzbfVar.g() || pair != null);
        zzbf zzbfVar2 = eyoVar.a;
        long f = f(eyoVar);
        eyo c = eyoVar.c(zzbfVar);
        if (zzbfVar.g()) {
            zzxo zzxoVar = eyo.t;
            long u = zzfm.u(this.X);
            zzabm zzabmVar = this.b;
            zzzr zzzrVar = zzzr.d;
            mio mioVar = zzgxm.b;
            eyo g = c.b(zzxoVar, u, u, u, 0L, zzzrVar, zzabmVar, s.e).g(zzxoVar);
            g.p = g.r;
            return g;
        }
        zzxo zzxoVar2 = c.b;
        Object obj = zzxoVar2.a;
        String str = zzfm.a;
        boolean equals = obj.equals(pair.first);
        zzxo zzxoVar3 = !equals ? new zzxo(pair.first, -1L) : zzxoVar2;
        long longValue = ((Long) pair.second).longValue();
        long u2 = zzfm.u(f);
        if (!zzbfVar2.g()) {
            zzbd zzbdVar = this.n;
            zzbfVar2.o(obj, zzbdVar);
            if (equals && u2 - longValue == 1) {
                zzbd o = zzbfVar2.o(obj, zzbdVar);
                z = true;
                if (u2 == o.d) {
                    u2--;
                }
                if (equals || longValue < u2) {
                    zzguk.f(zzxoVar3.b() ^ z);
                    zzzr zzzrVar2 = equals ? zzzr.d : c.h;
                    zzabm zzabmVar2 = equals ? this.b : c.i;
                    if (equals) {
                        mio mioVar2 = zzgxm.b;
                        list = s.e;
                    } else {
                        list = c.j;
                    }
                    zzxo zzxoVar4 = zzxoVar3;
                    eyo g2 = c.b(zzxoVar4, longValue, longValue, longValue, 0L, zzzrVar2, zzabmVar2, list).g(zzxoVar4);
                    g2.p = longValue;
                    return g2;
                }
                if (longValue != u2) {
                    zzguk.f(zzxoVar3.b() ^ z);
                    long max = Math.max(0L, c.q - (longValue - u2));
                    long j = c.p;
                    if (c.k.equals(zzxoVar2)) {
                        j = longValue + max;
                    }
                    eyo b = c.b(zzxoVar3, longValue, longValue, longValue, max, c.h, c.i, c.j);
                    b.p = j;
                    return b;
                }
                int e = zzbfVar.e(c.k.a);
                if (e != -1) {
                    zzbd zzbdVar2 = this.n;
                    if (zzbfVar.d(e, zzbdVar2, false).c == zzbfVar.o(zzxoVar3.a, zzbdVar2).c) {
                        return c;
                    }
                }
                Object obj2 = zzxoVar3.a;
                zzbd zzbdVar3 = this.n;
                zzbfVar.o(obj2, zzbdVar3);
                long b2 = zzxoVar3.b() ? zzbdVar3.b(zzxoVar3.b, zzxoVar3.c) : zzbdVar3.d;
                zzxo zzxoVar5 = zzxoVar3;
                eyo g3 = c.b(zzxoVar5, c.r, c.r, c.d, b2 - c.r, c.h, c.i, c.j).g(zzxoVar5);
                g3.p = b2;
                return g3;
            }
        }
        z = true;
        if (equals) {
        }
        zzguk.f(zzxoVar3.b() ^ z);
        zzzr zzzrVar22 = equals ? zzzr.d : c.h;
        zzabm zzabmVar22 = equals ? this.b : c.i;
        if (equals) {
        }
        zzxo zzxoVar42 = zzxoVar3;
        eyo g22 = c.b(zzxoVar42, longValue, longValue, longValue, 0L, zzzrVar22, zzabmVar22, list).g(zzxoVar42);
        g22.p = longValue;
        return g22;
    }

    public final Pair l(zzbf zzbfVar, int i, long j) {
        if (zzbfVar.g()) {
            this.W = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.X = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.a()) {
            i = zzbfVar.k(false);
            zzbfVar.b(i, this.a, 0L).getClass();
            j = zzfm.t(0L);
        }
        return zzbfVar.m(this.a, this.n, i, zzfm.u(j));
    }

    public final void m(Surface surface) {
        Object obj = this.J;
        boolean z = false;
        boolean z2 = true;
        if (obj != null && obj != surface) {
            z = true;
        }
        long j = z ? this.y : -9223372036854775807L;
        xwo xwoVar = this.l;
        if (!xwoVar.G && xwoVar.i.getThread().isAlive()) {
            zzdt zzdtVar = new zzdt();
            xwoVar.g.h(30, new Pair(surface, zzdtVar)).a();
            if (j != C.TIME_UNSET) {
                z2 = zzdtVar.c(j);
            }
        }
        if (z) {
            Object obj2 = this.J;
            Surface surface2 = this.K;
            if (obj2 == surface2) {
                surface2.release();
                this.K = null;
            }
        }
        this.J = surface;
        if (z2) {
            return;
        }
        d(new zzjn(2, new zzlz("Detaching surface timed out."), 1003));
    }

    public final void n(int i, int i2) {
        zzev zzevVar = this.M;
        if (i == zzevVar.a && i2 == zzevVar.b) {
            return;
        }
        this.M = new zzev(i, i2);
        fff fffVar = new fff(i, i2);
        zzeg zzegVar = this.m;
        zzegVar.c(24, fffVar);
        zzegVar.d();
        p(2, 14, new zzev(i, i2));
    }

    public final void o() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.r;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzfm.a;
            Locale locale = Locale.US;
            String k = bf3.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.Q) {
                a70.r(k);
            } else {
                zzeh.d(k, this.R ? null : new IllegalStateException());
                this.R = true;
            }
        }
    }

    public final void p(int i, int i2, Object obj) {
        xwo xwoVar;
        zzne[] zzneVarArr = this.g;
        int length = zzneVarArr.length;
        int i3 = 0;
        while (true) {
            xwoVar = this.l;
            if (i3 >= 2) {
                break;
            }
            zzne zzneVar = zzneVarArr[i3];
            if (i == -1 || zzneVar.zza() == i) {
                e(this.V);
                zzbf zzbfVar = this.V.a;
                zzna zznaVar = new zzna(xwoVar, zzneVar, xwoVar.i);
                zzguk.f(!zznaVar.f);
                zznaVar.c = i2;
                zzguk.f(!zznaVar.f);
                zznaVar.d = obj;
                zzguk.f(!zznaVar.f);
                zznaVar.f = true;
                xwoVar.a(zznaVar);
            }
            i3++;
        }
        zzne[] zzneVarArr2 = this.h;
        int length2 = zzneVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzne zzneVar2 = zzneVarArr2[i4];
            if (zzneVar2 != null && (i == -1 || zzneVar2.zza() == i)) {
                e(this.V);
                zzbf zzbfVar2 = this.V.a;
                zzna zznaVar2 = new zzna(xwoVar, zzneVar2, xwoVar.i);
                zzguk.f(!zznaVar2.f);
                zznaVar2.c = i2;
                zzguk.f(!zznaVar2.f);
                zznaVar2.d = obj;
                zzguk.f(!zznaVar2.f);
                zznaVar2.f = true;
                xwoVar.a(zznaVar2);
            }
        }
    }

    public final int q() {
        o();
        if (!this.V.a.g()) {
            eyo eyoVar = this.V;
            return eyoVar.a.e(eyoVar.b.a);
        }
        int i = this.W;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final long r() {
        o();
        if (!v()) {
            zzbf zzq = zzq();
            return zzq.g() ? C.TIME_UNSET : zzfm.t(zzq.b(zzs(), this.a, 0L).j);
        }
        eyo eyoVar = this.V;
        zzxo zzxoVar = eyoVar.b;
        zzbf zzbfVar = eyoVar.a;
        Object obj = zzxoVar.a;
        zzbd zzbdVar = this.n;
        zzbfVar.o(obj, zzbdVar);
        return zzfm.t(zzbdVar.b(zzxoVar.b, zzxoVar.c));
    }

    public final long s() {
        o();
        return zzfm.t(g(this.V));
    }

    public final long t() {
        o();
        if (v()) {
            eyo eyoVar = this.V;
            return eyoVar.k.equals(eyoVar.b) ? zzfm.t(this.V.p) : r();
        }
        o();
        if (this.V.a.g()) {
            return this.X;
        }
        eyo eyoVar2 = this.V;
        long j = 0;
        if (eyoVar2.k.d != eyoVar2.b.d) {
            return zzfm.t(eyoVar2.a.b(zzs(), this.a, 0L).j);
        }
        long j2 = eyoVar2.p;
        if (this.V.k.b()) {
            eyo eyoVar3 = this.V;
            eyoVar3.a.o(eyoVar3.k.a, this.n).f.a(this.V.k.b).getClass();
        } else {
            j = j2;
        }
        eyo eyoVar4 = this.V;
        eyoVar4.a.o(eyoVar4.k.a, this.n);
        return zzfm.t(j);
    }

    public final long u() {
        o();
        return zzfm.t(this.V.q);
    }

    public final boolean v() {
        o();
        return this.V.b.b();
    }

    public final int w() {
        o();
        if (v()) {
            return this.V.b.b;
        }
        return -1;
    }

    public final int x() {
        o();
        if (v()) {
            return this.V.b.c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        o();
        return this.V.e;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        o();
        return this.V.n;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        o();
        return this.V.l;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzl() {
        o();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzm() {
        o();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        o();
        return this.V.a;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        o();
        int e = e(this.V);
        if (e == -1) {
            return 0;
        }
        return e;
    }
}
