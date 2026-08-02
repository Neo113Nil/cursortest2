package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.kqo;
import defpackage.lkn;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaza extends zzifm implements zzigx {
    private static final zzaza zzbp;
    private static volatile zzihe zzbq;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private zzazc zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private zzify zzaC;
    private int zzaD;
    private zzify zzaE;
    private zzayv zzaF;
    private zzayt zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private long zzaO;
    private String zzaP;
    private long zzaQ;
    private zzayk zzaR;
    private zzaym zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private zzayx zzag;
    private zzify zzah;
    private zzayz zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private String zzar;
    private long zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzazr zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private zzayi zzbb;
    private boolean zzbc;
    private long zzbd;
    private String zzbe;
    private int zzbf;
    private boolean zzbg;
    private String zzbh;
    private long zzbi;
    private zzazp zzbj;
    private long zzbk;
    private String zzbl;
    private zzifu zzbm;
    private long zzbn;
    private int zzbo;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;

    static {
        zzaza zzazaVar = new zzaza();
        zzbp = zzazaVar;
        zzifm.y(zzaza.class, zzazaVar);
    }

    private zzaza() {
        kqo kqoVar = kqo.e;
        this.zzah = kqoVar;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = "D";
        this.zzas = -1L;
        this.zzay = -1L;
        this.zzaz = 1000;
        this.zzaA = 1000;
        this.zzaB = "D";
        this.zzaC = kqoVar;
        this.zzaD = 1000;
        this.zzaE = kqoVar;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaO = -1L;
        this.zzaP = "";
        this.zzaT = -1L;
        this.zzaU = -1L;
        this.zzaW = "";
        this.zzaX = "";
        this.zzaY = -1L;
        this.zzaZ = -1L;
        this.zzbe = "";
        this.zzbf = 2;
        this.zzbh = "";
        this.zzbk = -1L;
        this.zzbl = "";
        this.zzbm = wpo.e;
        this.zzbn = -1L;
        this.zzbo = 1000;
    }

    public static zzaza F0(byte[] bArr, zziew zziewVar) {
        return (zzaza) zzifm.s(zzbp, bArr, zziewVar);
    }

    public static zzaya G0() {
        return (zzaya) zzbp.v();
    }

    public static zzaza H0() {
        return zzbp;
    }

    public final boolean A0() {
        return (this.zzb & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
    }

    public final long B0() {
        return this.zzaj;
    }

    public final long C0() {
        return this.zzan;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= C.DEFAULT_MUXED_BUFFER_SIZE;
        this.zzG = str;
    }

    public final boolean D0() {
        return (this.zzd & 64) != 0;
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 33554432;
        this.zzH = j;
    }

    public final zzazp E0() {
        zzazp zzazpVar = this.zzbj;
        return zzazpVar == null ? zzazp.H() : zzazpVar;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 67108864;
        this.zzI = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 134217728;
        this.zzJ = j;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 536870912;
        this.zzL = j;
    }

    public final /* synthetic */ void I0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 1073741824;
        this.zzM = j;
    }

    public final /* synthetic */ void J0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j;
    }

    public final /* synthetic */ void K0(long j) {
        this.zza |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void L(long j) {
        this.zzb |= 2;
        this.zzP = j;
    }

    public final /* synthetic */ void L0(long j) {
        this.zza |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zzb |= 4;
        this.zzQ = j;
    }

    public final /* synthetic */ void M0(long j) {
        this.zza |= 32;
        this.zzj = j;
    }

    public final /* synthetic */ void N(long j) {
        this.zzb |= 8;
        this.zzR = j;
    }

    public final /* synthetic */ void N0(long j) {
        this.zza |= 1024;
        this.zzo = j;
    }

    public final /* synthetic */ void O(long j) {
        this.zzb |= 16;
        this.zzS = j;
    }

    public final /* synthetic */ void O0(long j) {
        this.zza |= com.ironsource.mediationsdk.metadata.a.o;
        this.zzp = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zzb |= 32;
        this.zzT = j;
    }

    public final /* synthetic */ void P0(long j) {
        this.zza |= 8192;
        this.zzv = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 64;
        this.zzU = j;
    }

    public final /* synthetic */ void Q0(long j) {
        this.zza |= 16384;
        this.zzw = j;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void R0(long j) {
        this.zza |= 32768;
        this.zzx = j;
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzW = str;
    }

    public final /* synthetic */ void S0(long j) {
        this.zza |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.zzy = j;
    }

    public final /* synthetic */ void T0(long j) {
        this.zza |= 524288;
        this.zzB = j;
    }

    public final /* synthetic */ void U(long j) {
        this.zzb |= 4096;
        this.zzaa = j;
    }

    public final /* synthetic */ void U0(long j) {
        this.zza |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzC = j;
    }

    public final /* synthetic */ void V(long j) {
        this.zzb |= 8192;
        this.zzab = j;
    }

    public final /* synthetic */ void V0(long j) {
        this.zza |= 2097152;
        this.zzD = j;
    }

    public final /* synthetic */ void W(long j) {
        this.zzb |= 16384;
        this.zzac = j;
    }

    public final /* synthetic */ void W0(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void X(zzayx zzayxVar) {
        this.zzag = zzayxVar;
        this.zzb |= 262144;
    }

    public final void Y(zzayx zzayxVar) {
        zzify zzifyVar = this.zzah;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzah = zzifyVar.g(size + size);
        }
        this.zzah.add(zzayxVar);
    }

    public final void Z() {
        this.zzah = kqo.e;
    }

    public final /* synthetic */ void a0(zzayz zzayzVar) {
        this.zzai = zzayzVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void b0(long j) {
        this.zzb |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzaj = j;
    }

    public final /* synthetic */ void c0(long j) {
        this.zzb |= 2097152;
        this.zzak = j;
    }

    public final /* synthetic */ void d0(long j) {
        this.zzb |= 4194304;
        this.zzal = j;
    }

    public final boolean e0() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void f0(long j) {
        this.zzb |= 8388608;
        this.zzam = j;
    }

    public final /* synthetic */ void g0(long j) {
        this.zzb |= C.DEFAULT_MUXED_BUFFER_SIZE;
        this.zzan = j;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 67108864;
        this.zzap = j;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 134217728;
        this.zzaq = j;
    }

    public final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzc |= com.ironsource.mediationsdk.metadata.a.o;
        this.zzaI = j;
    }

    public final /* synthetic */ void m0(long j) {
        this.zzc |= 4096;
        this.zzaJ = j;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzc |= 8192;
        this.zzaK = j;
    }

    public final /* synthetic */ void o0(long j) {
        this.zzc |= 16384;
        this.zzaL = j;
    }

    public final /* synthetic */ void p0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void q0(long j) {
        this.zzc |= 8388608;
        this.zzaU = j;
    }

    public final /* synthetic */ void r0(long j) {
        this.zzd |= 32;
        this.zzbi = j;
    }

    public final /* synthetic */ void s0(zzazp zzazpVar) {
        zzazpVar.getClass();
        this.zzbj = zzazpVar;
        this.zzd |= 64;
    }

    public final /* synthetic */ void t0(int i) {
        this.zzY = i - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void u0(int i) {
        this.zzZ = i - 1;
        this.zzb |= com.ironsource.mediationsdk.metadata.a.o;
    }

    public final /* synthetic */ void v0(int i) {
        this.zzaf = i - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void w0(int i) {
        this.zzaz = i - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void x0(int i) {
        this.zzaA = i - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void y0(int i) {
        this.zzaV = i - 1;
        this.zzc |= C.DEFAULT_MUXED_BUFFER_SIZE;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            lkn lknVar = lkn.h;
            lkn lknVar2 = lkn.n;
            return new lqo(zzbp, "\u0001o\u0000\u0004\u0001Įo\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂil᠌jÉဉfĭဂgĮဈh", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbd", "zzC", "zzD", "zzbe", "zzbi", "zzbf", lknVar, "zzE", "zzbg", "zzG", "zzbh", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", zzayx.class, "zzT", "zzU", "zzV", "zzW", "zzY", lknVar2, "zzZ", lknVar2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", lknVar2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", lkn.m, "zzau", lkn.o, "zzar", "zzaw", lkn.g, "zzax", "zzay", "zzan", "zzao", "zzaz", lknVar2, "zzX", "zzF", "zzaA", lknVar2, "zzaB", "zzaC", zzayr.class, "zzaD", lknVar2, "zzaE", zzayd.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", lkn.k, "zzav", lkn.i, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", lkn.l, "zzaQ", "zzbb", "zzbc", "zzbm", "zzbn", "zzbo", lknVar2, "zzbj", "zzbk", "zzbl"});
        }
        if (ordinal == 3) {
            return new zzaza();
        }
        if (ordinal == 4) {
            return new zzaya(zzbp);
        }
        if (ordinal == 5) {
            return zzbp;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzbq;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzaza.class) {
            try {
                zziheVar = zzbq;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzbp);
                    zzbq = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }

    public final String z0() {
        return this.zzE;
    }
}
