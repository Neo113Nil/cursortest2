package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lto extends y9n {
    private static final lto zzl;
    private int zzb;
    private int zzd;
    private boolean zzg;
    private i4n zzi;
    private z7n zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        lto ltoVar = new lto();
        zzl = ltoVar;
        y9n.g(lto.class, ltoVar);
    }

    private lto() {
    }

    public static sro y() {
        return (sro) zzl.n();
    }

    public final /* synthetic */ void A() {
        this.zzb |= 8;
        this.zzg = false;
    }

    public final /* synthetic */ void B() {
        this.zzb |= 16;
        this.zzh = false;
    }

    public final /* synthetic */ void C(i4n i4nVar) {
        this.zzi = i4nVar;
        this.zzb |= 32;
    }

    public final int D() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void E() {
        this.zzd = 2;
        this.zzb |= 1;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzb", "zzd", evo.a, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new lto();
        }
        if (i2 == 4) {
            return new sro(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final i4n w() {
        i4n i4nVar = this.zzi;
        return i4nVar == null ? i4n.w() : i4nVar;
    }

    public final z7n x() {
        z7n z7nVar = this.zzj;
        return z7nVar == null ? z7n.v() : z7nVar;
    }

    public final /* synthetic */ void z() {
        this.zzb |= 4;
        this.zzf = "a.3.39.0";
    }
}
