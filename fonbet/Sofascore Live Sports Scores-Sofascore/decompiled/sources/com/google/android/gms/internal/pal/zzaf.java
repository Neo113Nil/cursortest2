package com.google.android.gms.internal.pal;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.ccn;
import defpackage.chn;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaf extends zzacz implements zzaeg {
    private static final zzaf zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private zzah zzN;
    private zzadf zzaA;
    private int zzaB;
    private zzadf zzaC;
    private zzaa zzaD;
    private String zzaE;
    private long zzaF;
    private long zzaG;
    private long zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private String zzaL;
    private long zzaM;
    private String zzaN;
    private int zzaO;
    private boolean zzaP;
    private String zzaQ;
    private long zzaR;
    private zzaq zzaS;
    private long zzaT;
    private String zzaU;
    private zzac zzaf;
    private zzadf zzag;
    private zzae zzah;
    private long zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private String zzaq;
    private long zzar;
    private int zzas;
    private int zzat;
    private int zzau;
    private zzas zzav;
    private long zzaw;
    private int zzax;
    private int zzay;
    private String zzaz;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;

    static {
        zzaf zzafVar = new zzaf();
        zzb = zzafVar;
        zzacz.e(zzaf.class, zzafVar);
    }

    private zzaf() {
        ccn ccnVar = ccn.d;
        this.zzag = ccnVar;
        this.zzai = -1L;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = "D";
        this.zzar = -1L;
        this.zzaw = -1L;
        this.zzax = 1000;
        this.zzay = 1000;
        this.zzaz = "D";
        this.zzaA = ccnVar;
        this.zzaB = 1000;
        this.zzaC = ccnVar;
        this.zzaE = "";
        this.zzaF = -1L;
        this.zzaG = -1L;
        this.zzaH = -1L;
        this.zzaI = -1L;
        this.zzaK = -1L;
        this.zzaL = "";
        this.zzaN = "";
        this.zzaO = 2;
        this.zzaQ = "";
        this.zzaU = "";
    }

    public static /* synthetic */ void B(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zze |= 1;
        zzafVar.zzh = str;
    }

    public static /* synthetic */ void C(zzaf zzafVar, long j) {
        zzafVar.zze |= 4;
        zzafVar.zzj = j;
    }

    public static /* synthetic */ void D(zzaf zzafVar, long j) {
        zzafVar.zze |= 16;
        zzafVar.zzl = j;
    }

    public static /* synthetic */ void E(zzaf zzafVar, long j) {
        zzafVar.zze |= 32;
        zzafVar.zzm = j;
    }

    public static /* synthetic */ void F(zzaf zzafVar, long j) {
        zzafVar.zze |= com.ironsource.mediationsdk.metadata.a.o;
        zzafVar.zzs = j;
    }

    public static /* synthetic */ void G(zzaf zzafVar, long j) {
        zzafVar.zze |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        zzafVar.zzB = j;
    }

    public static /* synthetic */ void H(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zze |= C.DEFAULT_MUXED_BUFFER_SIZE;
        zzafVar.zzF = str;
    }

    public static /* synthetic */ void I(zzaf zzafVar, long j) {
        zzafVar.zze |= 33554432;
        zzafVar.zzG = j;
    }

    public static /* synthetic */ void J(zzaf zzafVar, long j) {
        zzafVar.zze |= 67108864;
        zzafVar.zzH = j;
    }

    public static /* synthetic */ void K(zzaf zzafVar, long j) {
        zzafVar.zze |= 134217728;
        zzafVar.zzI = j;
    }

    public static /* synthetic */ void j(zzaf zzafVar, long j) {
        zzafVar.zzf |= 32;
        zzafVar.zzS = j;
    }

    public static /* synthetic */ void l(zzaf zzafVar, long j) {
        zzafVar.zzf |= 4096;
        zzafVar.zzZ = j;
    }

    public static /* synthetic */ void m(zzaf zzafVar, long j) {
        zzafVar.zzf |= 8192;
        zzafVar.zzaa = j;
    }

    public static /* synthetic */ void o(zzaf zzafVar, long j) {
        zzafVar.zzf |= 2097152;
        zzafVar.zzaj = j;
    }

    public static /* synthetic */ void p(zzaf zzafVar, long j) {
        zzafVar.zzf |= 4194304;
        zzafVar.zzak = j;
    }

    public static /* synthetic */ void q(zzaf zzafVar, long j) {
        zzafVar.zzf |= 8388608;
        zzafVar.zzal = j;
    }

    public static /* synthetic */ void r(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zzg |= 32768;
        zzafVar.zzaL = str;
    }

    public static /* synthetic */ void s(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zzg |= 131072;
        zzafVar.zzaN = str;
    }

    public static /* synthetic */ void t(zzaf zzafVar, long j) {
        zzafVar.zzg |= 2097152;
        zzafVar.zzaR = j;
    }

    public static /* synthetic */ void u(zzaf zzafVar, int i) {
        zzafVar.zzX = i - 1;
        zzafVar.zzf |= 1024;
    }

    public static /* synthetic */ void v(zzaf zzafVar, int i) {
        zzafVar.zzY = i - 1;
        zzafVar.zzf |= com.ironsource.mediationsdk.metadata.a.o;
    }

    public static /* synthetic */ void w(zzaf zzafVar, int i) {
        zzafVar.zzax = i - 1;
        zzafVar.zzg |= 8;
    }

    public static /* synthetic */ void y(zzaf zzafVar, int i) {
        zzafVar.zzay = i - 1;
        zzafVar.zzg |= 16;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            chn chnVar = chn.h;
            chn chnVar2 = chn.c;
            return new fcn(zzb, "\u0001\\\u0000\u0003\u0001Į\\\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂP\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈQ\u0019ဂU\u001aဌR\u001bဈ\u0016\u001cဇS\u001dဈ\u0018\u001eဈT\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOÉဉVĭဂWĮဈX", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaM", "zzB", "zzC", "zzaN", "zzaR", "zzaO", chnVar, "zzD", "zzaP", "zzF", "zzaQ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", zzac.class, "zzS", "zzT", "zzU", "zzV", "zzX", chnVar2, "zzY", chnVar2, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", chnVar2, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", chn.b, "zzat", chn.d, "zzaq", "zzau", chn.g, "zzav", "zzaw", "zzam", "zzan", "zzax", chnVar2, "zzW", "zzE", "zzay", chnVar2, "zzaz", "zzaA", zzy.class, "zzaB", chnVar2, "zzaC", zzu.class, "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaS", "zzaT", "zzaU"});
        }
        if (i2 == 3) {
            return new zzaf();
        }
        if (i2 == 4) {
            return new zzr(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
