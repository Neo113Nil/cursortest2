package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z7n extends y9n {
    private static final z7n zzi;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private long zzd = 100;
    private long zzg = 300;
    private long zzh = 1000;

    static {
        z7n z7nVar = new z7n();
        zzi = z7nVar;
        y9n.g(z7n.class, z7nVar);
    }

    private z7n() {
    }

    public static z7n v() {
        return zzi;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new z7n();
        }
        if (i2 == 4) {
            return new h6n(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final long s() {
        return this.zzd;
    }

    public final boolean t() {
        return this.zze;
    }

    public final long u() {
        return this.zzh;
    }
}
