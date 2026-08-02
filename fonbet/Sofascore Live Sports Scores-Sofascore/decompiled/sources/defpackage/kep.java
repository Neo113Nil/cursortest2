package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzaca;
import com.google.android.gms.internal.ads.zzacf;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzage;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzajo;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzas;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzff;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zznm;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzun;
import com.google.android.gms.internal.ads.zzus;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzxm;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzyh;
import com.google.android.gms.internal.ads.zzyy;
import com.google.android.gms.internal.ads.zzze;
import com.google.android.gms.internal.ads.zzzf;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzr;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kep implements zzxm, zzagk, zzaca, zzacf, zzze {
    public static final Map O;
    public static final zzv P;
    public long A;
    public boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public long I;
    public long J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public final Uri a;
    public final zzhs b;
    public final zzus c;
    public final zzxy d;
    public final zzun e;
    public final zzyy f;
    public final zzabp g;
    public final long h;
    public final long i;
    public final zzaci j = new zzaci();
    public final zzyh k;
    public final zzdt l;
    public final l8n m;
    public final l8n n;
    public final Handler o;
    public zzxl p;
    public zzajo q;
    public tdp[] r;
    public zzzf[] s;
    public iep[] t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public utn y;
    public zzahk z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        O = Collections.unmodifiableMap(hashMap);
        zzt zztVar = new zzt();
        zztVar.a = "icy";
        zztVar.d("application/x-icy");
        P = new zzv(zztVar);
    }

    public kep(Uri uri, zzhs zzhsVar, zzyh zzyhVar, igf igfVar, zzun zzunVar, zzxy zzxyVar, zzyy zzyyVar, zzabp zzabpVar, int i, long j) {
        this.a = uri;
        this.b = zzhsVar;
        this.c = igfVar;
        this.e = zzunVar;
        this.d = zzxyVar;
        this.f = zzyyVar;
        this.g = zzabpVar;
        this.h = i;
        this.k = zzyhVar;
        this.i = j;
        zzff zzffVar = zzdp.a;
        this.l = new zzdt();
        this.m = new l8n(this, 3);
        this.n = new l8n(this, 1);
        this.o = zzfm.p();
        this.t = new iep[0];
        this.s = new zzzf[0];
        this.r = new tdp[0];
        this.J = C.TIME_UNSET;
        this.C = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht b(int i, int i2) {
        return n(new iep(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void c(zzahk zzahkVar) {
        this.o.post(new jyo(this, zzahkVar, false, 9));
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long d(long j) {
        boolean n;
        int i;
        int i2;
        t();
        boolean[] zArr = (boolean[]) this.y.b;
        if (true != this.z.zzb()) {
            j = 0;
        }
        this.E = false;
        long j2 = this.I;
        this.I = j;
        if (s()) {
            this.J = j;
            return j;
        }
        if (this.C != 7 && (this.M || this.j.b != null)) {
            int length = this.s.length;
            for (int i3 = 0; i3 < length; i3++) {
                zzzf zzzfVar = this.s[i3];
                if (this.r[i3].d.get() == rdp.a) {
                    int i4 = zzzfVar.p;
                    if (zzzfVar.r + i4 != 0 || j2 != j) {
                        if (this.x) {
                            synchronized (zzzfVar) {
                                synchronized (zzzfVar) {
                                    zzzfVar.r = 0;
                                    ei3 ei3Var = zzzfVar.a;
                                    ei3Var.e = (c78) ei3Var.d;
                                }
                            }
                            int i5 = zzzfVar.p;
                            if (i4 >= i5 && i4 <= zzzfVar.o + i5 && (((i = zzzfVar.v) == -1 || i4 < i) && ((i2 = zzzfVar.w) == -1 || i4 < i2))) {
                                zzzfVar.s = Long.MIN_VALUE;
                                zzzfVar.r = i4 - i5;
                                n = true;
                            }
                            n = false;
                        } else {
                            n = zzzfVar.n(j, this.M);
                        }
                        if (n) {
                            continue;
                        } else if (!zArr[i3] && this.w) {
                        }
                    }
                }
            }
            return j;
        }
        this.K = false;
        this.J = j;
        this.M = false;
        this.F = false;
        zzaci zzaciVar = this.j;
        if (zzaciVar.b == null) {
            zzaciVar.c = null;
            for (zzzf zzzfVar2 : this.s) {
                zzzfVar2.k(false);
            }
            return j;
        }
        for (zzzf zzzfVar3 : this.s) {
            zzzfVar3.o();
        }
        f8n f8nVar = zzaciVar.b;
        f8nVar.getClass();
        f8nVar.a(false);
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void e(zzxl zzxlVar, long j) {
        this.p = zzxlVar;
        this.l.a();
        p();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean f(zzme zzmeVar) {
        if (this.M) {
            return false;
        }
        zzaci zzaciVar = this.j;
        if (zzaciVar.c != null || this.K) {
            return false;
        }
        if (this.v && this.G == 0) {
            return false;
        }
        boolean a = this.l.a();
        if (zzaciVar.b != null) {
            return a;
        }
        p();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long g(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j) {
        zzabe zzabeVar;
        t();
        utn utnVar = this.y;
        zzzr zzzrVar = (zzzr) utnVar.c;
        boolean[] zArr3 = (boolean[]) utnVar.d;
        int i = this.G;
        for (int i2 = 0; i2 < zzabeVarArr.length; i2++) {
            zzzg zzzgVar = zzzgVarArr[i2];
            if (zzzgVar != null && (zzabeVarArr[i2] == null || !zArr[i2])) {
                int i3 = ((gep) zzzgVar).a;
                zzguk.f(zArr3[i3]);
                this.G--;
                zArr3[i3] = false;
                zzzgVarArr[i2] = null;
            }
        }
        boolean z = !this.D ? j == 0 || this.x : i != 0;
        for (int i4 = 0; i4 < zzabeVarArr.length; i4++) {
            if (zzzgVarArr[i4] == null && (zzabeVar = zzabeVarArr[i4]) != null) {
                zzguk.f(zzabeVar.zze() == 1);
                zzguk.f(zzabeVar.zzf(0) == 0);
                int indexOf = zzzrVar.b.indexOf(zzabeVar.zza());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                zzguk.f(!zArr3[indexOf]);
                this.G++;
                zArr3[indexOf] = true;
                this.F = zzabeVar.zzc().u | this.F;
                zzzgVarArr[i4] = new gep(this, indexOf);
                zArr2[i4] = true;
                if (!z) {
                    zzzf zzzfVar = this.s[indexOf];
                    z = (zzzfVar.p + zzzfVar.r == 0 || zzzfVar.n(j, true)) ? false : true;
                }
            }
        }
        if (this.G == 0) {
            this.K = false;
            this.E = false;
            this.F = false;
            zzaci zzaciVar = this.j;
            if (zzaciVar.b != null) {
                for (zzzf zzzfVar2 : this.s) {
                    zzzfVar2.o();
                }
                f8n f8nVar = zzaciVar.b;
                f8nVar.getClass();
                f8nVar.a(false);
            } else {
                this.M = false;
                for (zzzf zzzfVar3 : this.s) {
                    zzzfVar3.k(false);
                }
            }
        } else if (z) {
            j = d(j);
            for (int i5 = 0; i5 < zzzgVarArr.length; i5++) {
                if (zzzgVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.D = true;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r12 == Long.MIN_VALUE) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    @Override // com.google.android.gms.internal.ads.zzxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j, zznm zznmVar) {
        long j2;
        boolean z;
        t();
        if (!this.z.zzb()) {
            return 0L;
        }
        zzahi b = this.z.b(j);
        zzahl zzahlVar = b.a;
        zzahl zzahlVar2 = b.b;
        long j3 = zznmVar.a;
        if (j3 == 0) {
            return j;
        }
        String str = zzfm.a;
        long j4 = j - j3;
        long j5 = Long.MAX_VALUE;
        long j6 = (((j ^ j4) > 0L ? 1 : ((j ^ j4) == 0L ? 0 : -1)) >= 0) | (((j3 ^ j) > 0L ? 1 : ((j3 ^ j) == 0L ? 0 : -1)) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j7 = Long.MIN_VALUE;
        if (j6 == Long.MIN_VALUE) {
            if (j4 == Long.MIN_VALUE) {
                j4 = Long.MIN_VALUE;
            }
            j6 = Long.MIN_VALUE;
            if (j == Long.MIN_VALUE) {
                j7 = j;
            }
            if (j != Long.MAX_VALUE) {
                int i = (j7 > Long.MAX_VALUE ? 1 : (j7 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j5 = j;
            }
            j2 = zzahlVar.a;
            z = j6 > j2 && j2 <= j5;
            long j8 = zzahlVar2.a;
            boolean z2 = j6 > j8 && j8 <= j5;
            if (z || !z2) {
                if (!z) {
                    return z2 ? j8 : j6;
                }
                return j2;
            }
            if (Math.abs(j2 - j) <= Math.abs(j8 - j)) {
                return j2;
            }
        }
        if (j6 == Long.MAX_VALUE) {
            if (j4 == Long.MAX_VALUE) {
                j6 = Long.MAX_VALUE;
            }
            j6 = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
        }
        if (j != Long.MAX_VALUE) {
        }
        j2 = zzahlVar.a;
        if (j6 > j2) {
        }
        long j82 = zzahlVar2.a;
        if (j6 > j82) {
        }
        if (z) {
        }
        if (!z) {
        }
        return j2;
    }

    public final void i(vdp vdpVar, boolean z) {
        Uri uri = vdpVar.b.b;
        zzxf zzxfVar = new zzxf();
        zzxk zzxkVar = new zzxk(-1, null, zzfm.t(vdpVar.i), zzfm.t(this.A));
        zzxy zzxyVar = this.d;
        zzxyVar.a(new pcp(zzxyVar, zzxfVar, zzxkVar));
        if (z) {
            return;
        }
        for (zzzf zzzfVar : this.s) {
            zzzfVar.k(false);
        }
        if (this.G > 0) {
            zzxl zzxlVar = this.p;
            zzxlVar.getClass();
            zzxlVar.c(this);
        }
    }

    public final void j(vdp vdpVar) {
        if (this.A == C.TIME_UNSET && this.z != null) {
            long r = r(true);
            long j = r == Long.MIN_VALUE ? 0L : r + Ua.s;
            this.A = j;
            this.f.s(j, this.z, this.B);
        }
        Uri uri = vdpVar.b.b;
        zzxf zzxfVar = new zzxf();
        zzxk zzxkVar = new zzxk(-1, null, zzfm.t(vdpVar.i), zzfm.t(this.A));
        zzxy zzxyVar = this.d;
        zzxyVar.a(new yjo(zzxyVar, zzxfVar, zzxkVar));
        this.M = true;
        zzxl zzxlVar = this.p;
        zzxlVar.getClass();
        zzxlVar.c(this);
    }

    public final void k(int i) {
        t();
        utn utnVar = this.y;
        boolean[] zArr = (boolean[]) utnVar.e;
        if (zArr[i]) {
            return;
        }
        zzv zzvVar = ((zzzr) utnVar.c).a(i).d[0];
        zzxk zzxkVar = new zzxk(zzas.f(zzvVar.o), zzvVar, zzfm.t(this.I), C.TIME_UNSET);
        zzxy zzxyVar = this.d;
        zzxyVar.a(new gvo(16, zzxyVar, zzxkVar));
        zArr[i] = true;
    }

    public final void l(int i) {
        t();
        if (this.K) {
            if ((!this.w || ((boolean[]) this.y.b)[i]) && !this.s[i].m(false)) {
                this.J = 0L;
                this.K = false;
                this.E = true;
                this.I = 0L;
                this.L = 0;
                for (zzzf zzzfVar : this.s) {
                    zzzfVar.k(false);
                }
                zzxl zzxlVar = this.p;
                zzxlVar.getClass();
                zzxlVar.c(this);
            }
        }
    }

    public final boolean m() {
        return this.E || s();
    }

    public final zzaht n(iep iepVar) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (iepVar.equals(this.t[i])) {
                return this.s[i];
            }
        }
        if (this.u) {
            int i2 = iepVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzeh.c(sb.toString());
            return new zzage();
        }
        zzzf zzzfVar = new zzzf(this.g, this.c, this.e);
        tdp tdpVar = new tdp(zzzfVar);
        zzzfVar.e = this;
        int i3 = length + 1;
        iep[] iepVarArr = (iep[]) Arrays.copyOf(this.t, i3);
        iepVarArr[length] = iepVar;
        String str = zzfm.a;
        this.t = iepVarArr;
        zzzf[] zzzfVarArr = (zzzf[]) Arrays.copyOf(this.s, i3);
        zzzfVarArr[length] = zzzfVar;
        this.s = zzzfVarArr;
        tdp[] tdpVarArr = (tdp[]) Arrays.copyOf(this.r, i3);
        tdpVarArr[length] = tdpVar;
        this.r = tdpVarArr;
        return tdpVar;
    }

    public final void o() {
        int i;
        if (this.N || this.v || !this.u || this.z == null) {
            return;
        }
        for (zzzf zzzfVar : this.s) {
            if (zzzfVar.l() == null) {
                return;
            }
        }
        zzdt zzdtVar = this.l;
        synchronized (zzdtVar) {
            zzdtVar.a = false;
        }
        int length = this.s.length;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            char c = 1;
            if (i3 >= length) {
                break;
            }
            zzv l = this.s[i3].l();
            l.getClass();
            int f = zzas.f(l.o);
            char c2 = f != 1 ? f != 2 ? f != 3 ? f != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i2 == 1) {
                c = 3;
            } else if (i2 == 2) {
                c = 4;
            } else if (i2 != 3) {
                c = i2 != 4 ? (char) 0 : (char) 2;
            }
            if (c2 > c) {
                i2 = f;
            }
            if (c2 > c) {
                i4 = i3;
            }
            i3++;
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zzv l2 = this.s[i5].l();
            l2.getClass();
            String str = l2.o;
            boolean a = zzas.a(str);
            boolean z = a || zzas.b(str);
            zArr[i5] = z;
            this.w = z | this.w;
            this.x = this.i != C.TIME_UNSET && length == 1 && zzas.c(str);
            zzajo zzajoVar = this.q;
            if (zzajoVar != null) {
                if (a || this.t[i5].b) {
                    zzap zzapVar = l2.l;
                    zzap zzapVar2 = zzapVar == null ? new zzap(zzajoVar) : zzapVar.b(zzajoVar);
                    zzt zztVar = new zzt(l2);
                    zztVar.k = zzapVar2;
                    l2 = new zzv(zztVar);
                }
                if (a && l2.h == -1 && l2.i == -1 && (i = zzajoVar.a) != -1) {
                    zzt zztVar2 = new zzt(l2);
                    zztVar2.h = i;
                    l2 = new zzv(zztVar2);
                }
            }
            int c3 = this.c.c(l2);
            zzt zztVar3 = new zzt(l2);
            zztVar3.O = c3;
            zzv zzvVar = new zzv(zztVar3);
            if (i5 != i4) {
                zzt zztVar4 = new zzt(zzvVar);
                zztVar4.l = Integer.toString(i4);
                zzvVar = new zzv(zztVar4);
            }
            zzbgVarArr[i5] = new zzbg(Integer.toString(i5), zzvVar);
            this.F = zzvVar.u | this.F;
            synchronized (this.s[i5]) {
            }
        }
        this.y = new utn(new zzzr(zzbgVarArr), zArr);
        if (this.x && this.A == C.TIME_UNSET) {
            this.A = this.i;
            this.z = new pdp(this, this.z);
        }
        this.f.s(this.A, this.z, this.B);
        this.v = true;
        zzxl zzxlVar = this.p;
        zzxlVar.getClass();
        zzxlVar.i(this);
    }

    public final void p() {
        vdp vdpVar = new vdp(this, this.a, this.b, this.k, this, this.l);
        if (this.v) {
            zzguk.f(s());
            long j = this.A;
            if (j != C.TIME_UNSET && this.J > j) {
                this.M = true;
                this.J = C.TIME_UNSET;
                return;
            }
            zzahk zzahkVar = this.z;
            zzahkVar.getClass();
            zzahl zzahlVar = zzahkVar.b(this.J).a;
            long j2 = this.J;
            vdpVar.f.a = zzahlVar.b;
            vdpVar.i = j2;
            vdpVar.h = true;
            vdpVar.l = false;
            for (zzzf zzzfVar : this.s) {
                zzzfVar.s = this.J;
            }
            this.J = C.TIME_UNSET;
        }
        this.L = q();
        zzaci zzaciVar = this.j;
        zzaciVar.getClass();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        zzaciVar.c = null;
        f8n f8nVar = new f8n(zzaciVar, myLooper, vdpVar, this, SystemClock.elapsedRealtime());
        zzaci zzaciVar2 = f8nVar.h;
        zzguk.f(zzaciVar2.b == null);
        zzaciVar2.b = f8nVar;
        f8nVar.b();
    }

    public final int q() {
        int i = 0;
        for (zzzf zzzfVar : this.s) {
            i += zzzfVar.p + zzzfVar.o;
        }
        return i;
    }

    public final long r(boolean z) {
        long j;
        int i = 0;
        long j2 = Long.MIN_VALUE;
        while (true) {
            zzzf[] zzzfVarArr = this.s;
            if (i >= zzzfVarArr.length) {
                return j2;
            }
            if (!z) {
                utn utnVar = this.y;
                utnVar.getClass();
                if (!((boolean[]) utnVar.d)[i]) {
                    continue;
                    i++;
                }
            }
            zzzf zzzfVar = zzzfVarArr[i];
            synchronized (zzzfVar) {
                j = zzzfVar.u;
            }
            j2 = Math.max(j2, j);
            i++;
        }
    }

    public final boolean s() {
        return this.J != C.TIME_UNSET;
    }

    public final void t() {
        zzguk.f(this.v);
        this.y.getClass();
        this.z.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        long j;
        boolean z;
        long j2;
        t();
        if (this.M || this.G == 0) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.J;
        }
        if (this.w) {
            int length = this.s.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                utn utnVar = this.y;
                if (((boolean[]) utnVar.b)[i] && ((boolean[]) utnVar.d)[i]) {
                    zzzf zzzfVar = this.s[i];
                    synchronized (zzzfVar) {
                        z = zzzfVar.x;
                    }
                    if (z) {
                        continue;
                    } else {
                        zzzf zzzfVar2 = this.s[i];
                        synchronized (zzzfVar2) {
                            j2 = zzzfVar2.u;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = r(false);
        }
        return j == Long.MIN_VALUE ? this.I : j;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        boolean z;
        if (this.M || this.j.b == null) {
            return false;
        }
        zzdt zzdtVar = this.l;
        synchronized (zzdtVar) {
            z = zzdtVar.a;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() {
        IOException iOException;
        int i = this.C == 7 ? 6 : 3;
        zzaci zzaciVar = this.j;
        IOException iOException2 = zzaciVar.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        f8n f8nVar = zzaciVar.b;
        if (f8nVar != null && (iOException = f8nVar.c) != null && f8nVar.d > i) {
            throw iOException;
        }
        if (this.M && !this.v) {
            throw zzat.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        t();
        return (zzzr) this.y.c;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j) {
        long j2;
        long i;
        int i2;
        if (this.x) {
            return;
        }
        t();
        if (s()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.y.d;
        int length = this.s.length;
        int i3 = 0;
        while (i3 < length) {
            zzzf zzzfVar = this.s[i3];
            boolean z = zArr[i3];
            ei3 ei3Var = zzzfVar.a;
            synchronized (zzzfVar) {
                try {
                    int i4 = zzzfVar.o;
                    if (i4 != 0) {
                        long[] jArr = zzzfVar.m;
                        int i5 = zzzfVar.q;
                        if (j >= jArr[i5]) {
                            j2 = j;
                            int h = zzzfVar.h(i5, (!z || (i2 = zzzfVar.r) == i4) ? i4 : i2 + 1, j2, false);
                            i = h != -1 ? zzzfVar.i(h) : -1L;
                        }
                    }
                    j2 = j;
                } finally {
                }
            }
            ei3Var.i(i);
            i3++;
            j = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        if (this.F) {
            this.F = false;
        } else {
            if (!this.E) {
                return C.TIME_UNSET;
            }
            if (!this.M && q() <= this.L) {
                return C.TIME_UNSET;
            }
            this.E = false;
        }
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.u = true;
        this.o.post(this.m);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void a(long j) {
    }
}
