package com.google.android.gms.internal.measurement;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzgc extends zzkc implements zzlk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgc zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private zzgf zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private zzfy zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private zzkj zzi = zzkc.zzbG();
    private zzkj zzj = zzkc.zzbG();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private zzkj zzH = zzkc.zzbG();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private zzkh zzU = zzkc.zzbD();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";
    private String zzae = "";
    private zzkj zzaf = zzkc.zzbG();
    private String zzag = "";

    static {
        zzgc zzgcVar = new zzgc();
        zze = zzgcVar;
        zzkc.zzbM(zzgc.class, zzgcVar);
    }

    private zzgc() {
    }

    static /* synthetic */ void zzQ(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 1073741824;
        zzgcVar.zzO = j11;
    }

    static /* synthetic */ void zzR(zzgc zzgcVar) {
        zzgcVar.zzf &= Integer.MAX_VALUE;
        zzgcVar.zzP = zze.zzP;
    }

    static /* synthetic */ void zzS(zzgc zzgcVar, int i11) {
        zzgcVar.zzg |= 2;
        zzgcVar.zzR = i11;
    }

    static /* synthetic */ void zzT(zzgc zzgcVar, int i11, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzgcVar.zzbO();
        zzgcVar.zzi.set(i11, zzfsVar);
    }

    static /* synthetic */ void zzU(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzg |= 4;
        zzgcVar.zzS = str;
    }

    static /* synthetic */ void zzV(zzgc zzgcVar, zzgf zzgfVar) {
        zzgfVar.getClass();
        zzgcVar.zzT = zzgfVar;
        zzgcVar.zzg |= 8;
    }

    static /* synthetic */ void zzW(zzgc zzgcVar, Iterable iterable) {
        zzkh zzkhVar = zzgcVar.zzU;
        if (!zzkhVar.zzc()) {
            int size = zzkhVar.size();
            zzgcVar.zzU = zzkhVar.zzd(size == 0 ? 10 : size + size);
        }
        zzil.zzbw(iterable, zzgcVar.zzU);
    }

    static /* synthetic */ void zzX(zzgc zzgcVar, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzgcVar.zzbO();
        zzgcVar.zzi.add(zzfsVar);
    }

    static /* synthetic */ void zzY(zzgc zzgcVar, long j11) {
        zzgcVar.zzg |= 16;
        zzgcVar.zzV = j11;
    }

    static /* synthetic */ void zzZ(zzgc zzgcVar, long j11) {
        zzgcVar.zzg |= 32;
        zzgcVar.zzW = j11;
    }

    static /* synthetic */ void zzaA(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 2048;
        zzgcVar.zzu = str;
    }

    static /* synthetic */ void zzaB(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 4096;
        zzgcVar.zzv = str;
    }

    static /* synthetic */ void zzaC(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 8192;
        zzgcVar.zzw = str;
    }

    static /* synthetic */ void zzaD(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 16384;
        zzgcVar.zzx = j11;
    }

    static /* synthetic */ void zzaE(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 32768;
        zzgcVar.zzy = 64000L;
    }

    static /* synthetic */ void zzaF(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 65536;
        zzgcVar.zzz = str;
    }

    static /* synthetic */ void zzaG(zzgc zzgcVar) {
        zzgcVar.zzf &= -65537;
        zzgcVar.zzz = zze.zzz;
    }

    static /* synthetic */ void zzaH(zzgc zzgcVar, boolean z11) {
        zzgcVar.zzf |= 131072;
        zzgcVar.zzA = z11;
    }

    static /* synthetic */ void zzaI(zzgc zzgcVar) {
        zzgcVar.zzf &= -131073;
        zzgcVar.zzA = false;
    }

    static /* synthetic */ void zzaJ(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 262144;
        zzgcVar.zzB = str;
    }

    static /* synthetic */ void zzaK(zzgc zzgcVar) {
        zzgcVar.zzf &= -262145;
        zzgcVar.zzB = zze.zzB;
    }

    static /* synthetic */ void zzaL(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 524288;
        zzgcVar.zzC = j11;
    }

    static /* synthetic */ void zzaM(zzgc zzgcVar, int i11) {
        zzgcVar.zzf |= 1048576;
        zzgcVar.zzD = i11;
    }

    static /* synthetic */ void zzaN(zzgc zzgcVar, String str) {
        zzgcVar.zzf |= 2097152;
        zzgcVar.zzE = str;
    }

    static /* synthetic */ void zzaO(zzgc zzgcVar) {
        zzgcVar.zzf &= -2097153;
        zzgcVar.zzE = zze.zzE;
    }

    static /* synthetic */ void zzaP(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 4194304;
        zzgcVar.zzF = str;
    }

    static /* synthetic */ void zzaQ(zzgc zzgcVar, boolean z11) {
        zzgcVar.zzf |= 8388608;
        zzgcVar.zzG = z11;
    }

    static /* synthetic */ void zzaR(zzgc zzgcVar, Iterable iterable) {
        zzkj zzkjVar = zzgcVar.zzH;
        if (!zzkjVar.zzc()) {
            zzgcVar.zzH = zzkc.zzbH(zzkjVar);
        }
        zzil.zzbw(iterable, zzgcVar.zzH);
    }

    static /* synthetic */ void zzaT(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 16777216;
        zzgcVar.zzI = str;
    }

    static /* synthetic */ void zzaU(zzgc zzgcVar, int i11) {
        zzgcVar.zzf |= 33554432;
        zzgcVar.zzJ = i11;
    }

    static /* synthetic */ void zzaV(zzgc zzgcVar, int i11) {
        zzgcVar.zzf |= 1;
        zzgcVar.zzh = 1;
    }

    static /* synthetic */ void zzaW(zzgc zzgcVar) {
        zzgcVar.zzf &= -268435457;
        zzgcVar.zzM = zze.zzM;
    }

    static /* synthetic */ void zzaX(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 536870912;
        zzgcVar.zzN = j11;
    }

    static /* synthetic */ void zzaa(zzgc zzgcVar, String str) {
        zzgcVar.zzg |= UserVerificationMethods.USER_VERIFY_PATTERN;
        zzgcVar.zzY = str;
    }

    static /* synthetic */ void zzab(zzgc zzgcVar, Iterable iterable) {
        zzgcVar.zzbO();
        zzil.zzbw(iterable, zzgcVar.zzi);
    }

    static /* synthetic */ void zzac(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzg |= 8192;
        zzgcVar.zzae = str;
    }

    static /* synthetic */ void zzad(zzgc zzgcVar) {
        zzgcVar.zzg &= -8193;
        zzgcVar.zzae = zze.zzae;
    }

    static /* synthetic */ void zzae(zzgc zzgcVar, Iterable iterable) {
        zzkj zzkjVar = zzgcVar.zzaf;
        if (!zzkjVar.zzc()) {
            zzgcVar.zzaf = zzkc.zzbH(zzkjVar);
        }
        zzil.zzbw(iterable, zzgcVar.zzaf);
    }

    static /* synthetic */ void zzag(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzg |= 16384;
        zzgcVar.zzag = str;
    }

    static /* synthetic */ void zzah(zzgc zzgcVar, int i11) {
        zzgcVar.zzbO();
        zzgcVar.zzi.remove(i11);
    }

    static /* synthetic */ void zzai(zzgc zzgcVar, int i11, zzgl zzglVar) {
        zzglVar.getClass();
        zzgcVar.zzbP();
        zzgcVar.zzj.set(i11, zzglVar);
    }

    static /* synthetic */ void zzaj(zzgc zzgcVar, zzgl zzglVar) {
        zzglVar.getClass();
        zzgcVar.zzbP();
        zzgcVar.zzj.add(zzglVar);
    }

    static /* synthetic */ void zzak(zzgc zzgcVar, Iterable iterable) {
        zzgcVar.zzbP();
        zzil.zzbw(iterable, zzgcVar.zzj);
    }

    static /* synthetic */ void zzal(zzgc zzgcVar, int i11) {
        zzgcVar.zzbP();
        zzgcVar.zzj.remove(i11);
    }

    static /* synthetic */ void zzam(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 2;
        zzgcVar.zzk = j11;
    }

    static /* synthetic */ void zzan(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 4;
        zzgcVar.zzl = j11;
    }

    static /* synthetic */ void zzao(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 8;
        zzgcVar.zzm = j11;
    }

    static /* synthetic */ void zzap(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 16;
        zzgcVar.zzn = j11;
    }

    static /* synthetic */ void zzaq(zzgc zzgcVar) {
        zzgcVar.zzf &= -17;
        zzgcVar.zzn = 0L;
    }

    static /* synthetic */ void zzar(zzgc zzgcVar, long j11) {
        zzgcVar.zzf |= 32;
        zzgcVar.zzo = j11;
    }

    static /* synthetic */ void zzas(zzgc zzgcVar) {
        zzgcVar.zzf &= -33;
        zzgcVar.zzo = 0L;
    }

    static /* synthetic */ void zzat(zzgc zzgcVar, String str) {
        zzgcVar.zzf |= 64;
        zzgcVar.zzp = "android";
    }

    static /* synthetic */ void zzau(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= UserVerificationMethods.USER_VERIFY_PATTERN;
        zzgcVar.zzq = str;
    }

    static /* synthetic */ void zzav(zzgc zzgcVar) {
        zzgcVar.zzf &= -129;
        zzgcVar.zzq = zze.zzq;
    }

    static /* synthetic */ void zzaw(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 256;
        zzgcVar.zzr = str;
    }

    static /* synthetic */ void zzax(zzgc zzgcVar) {
        zzgcVar.zzf &= -257;
        zzgcVar.zzr = zze.zzr;
    }

    static /* synthetic */ void zzay(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= UserVerificationMethods.USER_VERIFY_NONE;
        zzgcVar.zzs = str;
    }

    static /* synthetic */ void zzaz(zzgc zzgcVar, int i11) {
        zzgcVar.zzf |= UserVerificationMethods.USER_VERIFY_ALL;
        zzgcVar.zzt = i11;
    }

    private final void zzbO() {
        zzkj zzkjVar = this.zzi;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzi = zzkc.zzbH(zzkjVar);
    }

    private final void zzbP() {
        zzkj zzkjVar = this.zzj;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzj = zzkc.zzbH(zzkjVar);
    }

    public static zzgb zzu() {
        return (zzgb) zze.zzbA();
    }

    public final String zzA() {
        return this.zzu;
    }

    public final String zzB() {
        return this.zzw;
    }

    public final String zzC() {
        return this.zzY;
    }

    public final String zzD() {
        return this.zzr;
    }

    public final String zzE() {
        return this.zzP;
    }

    public final String zzF() {
        return this.zzI;
    }

    public final String zzG() {
        return this.zzF;
    }

    public final String zzH() {
        return this.zzE;
    }

    public final String zzI() {
        return this.zzq;
    }

    public final String zzJ() {
        return this.zzp;
    }

    public final String zzK() {
        return this.zzz;
    }

    public final String zzL() {
        return this.zzae;
    }

    public final String zzM() {
        return this.zzs;
    }

    public final List zzN() {
        return this.zzH;
    }

    public final List zzO() {
        return this.zzi;
    }

    public final List zzP() {
        return this.zzj;
    }

    public final int zza() {
        return this.zzJ;
    }

    public final boolean zzaY() {
        return this.zzA;
    }

    public final boolean zzaZ() {
        return this.zzG;
    }

    public final int zzb() {
        return this.zzD;
    }

    public final boolean zzba() {
        return (this.zzf & 1073741824) != 0;
    }

    public final boolean zzbb() {
        return (this.zzf & 33554432) != 0;
    }

    public final boolean zzbc() {
        return (this.zzf & 1048576) != 0;
    }

    public final boolean zzbd() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean zzbe() {
        return (this.zzg & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    public final boolean zzbf() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean zzbg() {
        return (this.zzg & 16) != 0;
    }

    public final boolean zzbh() {
        return (this.zzf & 8) != 0;
    }

    public final boolean zzbi() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean zzbj() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean zzbk() {
        return (this.zzf & 32) != 0;
    }

    public final boolean zzbl() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbm() {
        return (this.zzf & 1) != 0;
    }

    public final boolean zzbn() {
        return (this.zzg & 2) != 0;
    }

    public final boolean zzbo() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean zzbp() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean zzbq() {
        return (this.zzf & 4) != 0;
    }

    public final boolean zzbr() {
        return (this.zzf & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    public final boolean zzbs() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbt() {
        return (this.zzf & 32768) != 0;
    }

    public final int zzc() {
        return this.zzi.size();
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzR;
    }

    public final int zzf() {
        return this.zzt;
    }

    public final int zzg() {
        return this.zzj.size();
    }

    public final long zzh() {
        return this.zzO;
    }

    public final long zzi() {
        return this.zzN;
    }

    public final long zzj() {
        return this.zzC;
    }

    public final long zzk() {
        return this.zzV;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", zzfs.class, "zzj", zzgl.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", zzfo.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", zzfk.zza, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i12 == 3) {
            return new zzgc();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzgb(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zze;
    }

    public final long zzm() {
        return this.zzm;
    }

    public final long zzn() {
        return this.zzx;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        return this.zzn;
    }

    public final long zzq() {
        return this.zzl;
    }

    public final long zzr() {
        return this.zzk;
    }

    public final long zzs() {
        return this.zzy;
    }

    public final zzfs zzt(int i11) {
        return (zzfs) this.zzi.get(i11);
    }

    public final zzgl zzw(int i11) {
        return (zzgl) this.zzj.get(i11);
    }

    public final String zzx() {
        return this.zzS;
    }

    public final String zzy() {
        return this.zzv;
    }

    public final String zzz() {
        return this.zzB;
    }
}
