package com.google.android.gms.internal.measurement;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.ldn;
import defpackage.ndn;
import defpackage.tan;
import defpackage.w7n;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzid extends zzadu implements zzafd {
    private static final zzid zzaw;
    private static volatile zzafj zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private zzaef zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private zzig zzR;
    private zzaeb zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private zzhy zzab;
    private String zzac;
    private zzaef zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private zzhe zzam;
    private int zzan;
    private zzha zzao;
    private String zzap;
    private zzis zzaq;
    private long zzar;
    private String zzas;
    private zzho zzat;
    private String zzau;
    private zzaef zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private zzaef zzg;
    private zzaef zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        zzid zzidVar = new zzid();
        zzaw = zzidVar;
        zzadu.t(zzid.class, zzidVar);
    }

    private zzid() {
        ldn ldnVar = ldn.e;
        this.zzg = ldnVar;
        this.zzh = ldnVar;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = ldnVar;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = tan.e;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = ldnVar;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = ldnVar;
    }

    public static zzic e0() {
        return (zzic) zzaw.p();
    }

    public static zzic f0(zzid zzidVar) {
        zzadp p = zzaw.p();
        p.n(zzidVar);
        return (zzic) p;
    }

    public final boolean A() {
        return (this.zzb & 16384) != 0;
    }

    public final int A0() {
        return this.zzP;
    }

    public final /* synthetic */ void A1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    public final long B() {
        return this.zzv;
    }

    public final boolean B0() {
        return (this.zze & 16) != 0;
    }

    public final /* synthetic */ void B1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    public final boolean C() {
        return (this.zzb & 32768) != 0;
    }

    public final long C0() {
        return this.zzT;
    }

    public final /* synthetic */ void C1(int i) {
        this.zzb |= 1024;
        this.zzr = i;
    }

    public final long D() {
        return this.zzw;
    }

    public final boolean D0() {
        return (this.zze & 128) != 0;
    }

    public final /* synthetic */ void D1(String str) {
        str.getClass();
        this.zzb |= com.ironsource.mediationsdk.metadata.a.o;
        this.zzs = str;
    }

    public final String E() {
        return this.zzx;
    }

    public final String E0() {
        return this.zzW;
    }

    public final /* synthetic */ void E1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }

    public final boolean F() {
        return (this.zzb & 131072) != 0;
    }

    public final boolean F0() {
        return (this.zze & 8192) != 0;
    }

    public final /* synthetic */ void F1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }

    public final boolean G() {
        return this.zzy;
    }

    public final String G0() {
        return this.zzac;
    }

    public final /* synthetic */ void G1(long j) {
        this.zzb |= 16384;
        this.zzv = j;
    }

    public final String H() {
        return this.zzz;
    }

    public final boolean H0() {
        return (this.zze & 32768) != 0;
    }

    public final /* synthetic */ void H1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }

    public final boolean I() {
        return (this.zzb & 524288) != 0;
    }

    public final long I0() {
        return this.zzaf;
    }

    public final /* synthetic */ void I1(String str) {
        str.getClass();
        this.zzb |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.zzx = str;
    }

    public final long J() {
        return this.zzA;
    }

    public final boolean J0() {
        return this.zzag;
    }

    public final /* synthetic */ void J1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    public final boolean K() {
        return (this.zzb & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
    }

    public final boolean K0() {
        return (this.zze & 131072) != 0;
    }

    public final /* synthetic */ void K1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    public final int L() {
        return this.zzB;
    }

    public final String L0() {
        return this.zzah;
    }

    public final /* synthetic */ void L1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    public final String M() {
        return this.zzC;
    }

    public final boolean M0() {
        return (this.zze & 262144) != 0;
    }

    public final /* synthetic */ void M1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    public final String N() {
        return this.zzD;
    }

    public final boolean N0() {
        return this.zzai;
    }

    public final /* synthetic */ void N1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    public final boolean O() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean O0() {
        return (this.zze & 524288) != 0;
    }

    public final /* synthetic */ void O1(long j) {
        this.zzb |= 524288;
        this.zzA = j;
    }

    public final boolean P() {
        return this.zzE;
    }

    public final String P0() {
        return this.zzaj;
    }

    public final /* synthetic */ void P1(int i) {
        this.zzb |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzB = i;
    }

    public final zzaef Q() {
        return this.zzF;
    }

    public final int Q0() {
        return this.zzak;
    }

    public final /* synthetic */ void Q1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    public final String R() {
        return this.zzG;
    }

    public final boolean R0() {
        return (this.zze & 4194304) != 0;
    }

    public final /* synthetic */ void R1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    public final boolean S() {
        return (this.zzb & 33554432) != 0;
    }

    public final zzhe S0() {
        zzhe zzheVar = this.zzam;
        return zzheVar == null ? zzhe.G() : zzheVar;
    }

    public final /* synthetic */ void S1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    public final int T() {
        return this.zzH;
    }

    public final boolean T0() {
        return (this.zze & 8388608) != 0;
    }

    public final /* synthetic */ void T1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    public final boolean U() {
        return (this.zzb & 536870912) != 0;
    }

    public final int U0() {
        return this.zzan;
    }

    public final void U1(ArrayList arrayList) {
        zzaef zzaefVar = this.zzF;
        if (!zzaefVar.zza()) {
            this.zzF = x5n.k(zzaefVar);
        }
        zzaca.j(arrayList, this.zzF);
    }

    public final long V() {
        return this.zzL;
    }

    public final boolean V0() {
        return (this.zze & C.DEFAULT_MUXED_BUFFER_SIZE) != 0;
    }

    public final void V1() {
        this.zzF = ldn.e;
    }

    public final boolean W() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final zzha W0() {
        zzha zzhaVar = this.zzao;
        return zzhaVar == null ? zzha.f0() : zzhaVar;
    }

    public final /* synthetic */ void W1(String str) {
        this.zzb |= C.DEFAULT_MUXED_BUFFER_SIZE;
        this.zzG = str;
    }

    public final String X() {
        return this.zzN;
    }

    public final boolean X0() {
        return (this.zze & 67108864) != 0;
    }

    public final /* synthetic */ void X1(int i) {
        this.zzb |= 33554432;
        this.zzH = i;
    }

    public final boolean Y() {
        return (this.zzb & 1) != 0;
    }

    public final zzis Y0() {
        zzis zzisVar = this.zzaq;
        return zzisVar == null ? zzis.A() : zzisVar;
    }

    public final /* synthetic */ void Y1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    public final boolean Z() {
        return (this.zze & 134217728) != 0;
    }

    public final int Z0() {
        return this.zzf;
    }

    public final List Z1() {
        return this.zzg;
    }

    public final /* synthetic */ void a1(long j) {
        this.zzb |= 536870912;
        this.zzL = j;
    }

    public final void a2() {
        zzaef zzaefVar = this.zzg;
        if (zzaefVar.zza()) {
            return;
        }
        this.zzg = x5n.k(zzaefVar);
    }

    public final long b0() {
        return this.zzar;
    }

    public final /* synthetic */ void b1(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    public final void b2() {
        zzaef zzaefVar = this.zzh;
        if (zzaefVar.zza()) {
            return;
        }
        this.zzh = x5n.k(zzaefVar);
    }

    public final boolean c0() {
        return (this.zze & 536870912) != 0;
    }

    public final /* synthetic */ void c1() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    public final void c2(List list) {
        zzaef zzaefVar = this.zzav;
        if (!zzaefVar.zza()) {
            this.zzav = x5n.k(zzaefVar);
        }
        zzaca.j(list, this.zzav);
    }

    public final zzho d0() {
        zzho zzhoVar = this.zzat;
        return zzhoVar == null ? zzho.A() : zzhoVar;
    }

    public final /* synthetic */ void d1(int i) {
        this.zze |= 2;
        this.zzP = i;
    }

    public final int d2() {
        return this.zzg.size();
    }

    public final void e1(List list) {
        zzaeb zzaebVar = this.zzS;
        if (!zzaebVar.zza()) {
            int size = zzaebVar.size();
            this.zzS = zzaebVar.f(size + size);
        }
        zzaca.j(list, this.zzS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhs e2(int i) {
        return (zzhs) this.zzg.get(i);
    }

    public final /* synthetic */ void f1(long j) {
        this.zze |= 16;
        this.zzT = j;
    }

    public final zzaef f2() {
        return this.zzh;
    }

    public final /* synthetic */ void g0() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    public final /* synthetic */ void g1(long j) {
        this.zze |= 32;
        this.zzU = j;
    }

    public final int g2() {
        return this.zzh.size();
    }

    public final /* synthetic */ void h0(int i, zzhs zzhsVar) {
        a2();
        this.zzg.set(i, zzhsVar);
    }

    public final /* synthetic */ void h1(String str) {
        this.zze |= 128;
        this.zzW = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zziu h2(int i) {
        return (zziu) this.zzh.get(i);
    }

    public final /* synthetic */ void i0(zzhs zzhsVar) {
        a2();
        this.zzg.add(zzhsVar);
    }

    public final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    public final boolean i2() {
        return (this.zzb & 2) != 0;
    }

    public final void j0(Iterable iterable) {
        a2();
        zzaca.j(iterable, this.zzg);
    }

    public final /* synthetic */ void j1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    public final long j2() {
        return this.zzi;
    }

    public final void k0() {
        this.zzg = ldn.e;
    }

    public final void k1(Set set) {
        zzaef zzaefVar = this.zzad;
        if (!zzaefVar.zza()) {
            this.zzad = x5n.k(zzaefVar);
        }
        zzaca.j(set, this.zzad);
    }

    public final boolean k2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void l0(int i) {
        a2();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void l1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    public final long l2() {
        return this.zzj;
    }

    public final /* synthetic */ void m0(int i, zziu zziuVar) {
        b2();
        this.zzh.set(i, zziuVar);
    }

    public final /* synthetic */ void m1(long j) {
        this.zze |= 32768;
        this.zzaf = j;
    }

    public final boolean m2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void n0(zziu zziuVar) {
        b2();
        this.zzh.add(zziuVar);
    }

    public final /* synthetic */ void n1(boolean z) {
        this.zze |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.zzag = z;
    }

    public final long n2() {
        return this.zzk;
    }

    public final /* synthetic */ void o0(int i) {
        b2();
        this.zzh.remove(i);
    }

    public final /* synthetic */ void o1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    public final boolean o2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void p0(long j) {
        this.zzb |= 2;
        this.zzi = j;
    }

    public final /* synthetic */ void p1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    public final long p2() {
        return this.zzl;
    }

    public final /* synthetic */ void q0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    public final /* synthetic */ void q1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    public final boolean q2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void r0(long j) {
        this.zzb |= 4;
        this.zzj = j;
    }

    public final /* synthetic */ void r1(int i) {
        this.zze |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzak = i;
    }

    public final long r2() {
        return this.zzm;
    }

    public final /* synthetic */ void s0(long j) {
        this.zzb |= 8;
        this.zzk = j;
    }

    public final /* synthetic */ void s1(zzhe zzheVar) {
        this.zzam = zzheVar;
        this.zze |= 4194304;
    }

    public final String s2() {
        return this.zzn;
    }

    public final /* synthetic */ void t0(long j) {
        this.zzb |= 16;
        this.zzl = j;
    }

    public final /* synthetic */ void t1(int i) {
        this.zze |= 8388608;
        this.zzan = i;
    }

    public final String t2() {
        return this.zzo;
    }

    public final /* synthetic */ void u0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    public final /* synthetic */ void u1(zzha zzhaVar) {
        this.zzao = zzhaVar;
        this.zze |= C.DEFAULT_MUXED_BUFFER_SIZE;
    }

    public final String u2() {
        return this.zzp;
    }

    public final /* synthetic */ void v0(long j) {
        this.zzb |= 32;
        this.zzm = j;
    }

    public final /* synthetic */ void v1(zzis zzisVar) {
        this.zzaq = zzisVar;
        this.zze |= 67108864;
    }

    public final String v2() {
        return this.zzq;
    }

    public final /* synthetic */ void w0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    public final /* synthetic */ void w1(long j) {
        this.zze |= 134217728;
        this.zzar = j;
    }

    public final boolean w2() {
        return (this.zzb & 1024) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzhs.class, "zzh", zziu.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", zzhg.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", w7n.h, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", zzfb.class});
        }
        if (i2 == 3) {
            return new zzid();
        }
        if (i2 == 4) {
            return new zzic(zzaw);
        }
        if (i2 == 5) {
            return zzaw;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzax;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzid.class) {
            try {
                zzafjVar = zzax;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzaw);
                    zzax = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final /* synthetic */ void x0() {
        this.zzb |= 64;
        this.zzn = "android";
    }

    public final /* synthetic */ void x1(zzho zzhoVar) {
        this.zzat = zzhoVar;
        this.zze |= 536870912;
    }

    public final int x2() {
        return this.zzr;
    }

    public final String y() {
        return this.zzt;
    }

    public final /* synthetic */ void y0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzo = str;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zze |= 1073741824;
        this.zzau = str;
    }

    public final String y2() {
        return this.zzs;
    }

    public final String z() {
        return this.zzu;
    }

    public final boolean z0() {
        return (this.zze & 2) != 0;
    }

    public final /* synthetic */ void z1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzp = str;
    }
}
