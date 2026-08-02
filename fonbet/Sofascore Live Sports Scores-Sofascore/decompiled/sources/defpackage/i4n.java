package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i4n extends y9n {
    private static final i4n zzi;
    private int zzb;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        i4n i4nVar = new i4n();
        zzi = i4nVar;
        y9n.g(i4n.class, i4nVar);
    }

    private i4n() {
    }

    public static tep v() {
        return (tep) zzi.n();
    }

    public static i4n w() {
        return zzi;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzi, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new i4n();
        }
        if (i2 == 4) {
            return new tep(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean s() {
        return this.zzd;
    }

    public final int t() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final /* synthetic */ void x() {
        this.zzb |= 1;
        this.zzd = true;
    }
}
