package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zon extends y9n {
    private static final zon zzg;
    private int zzb;
    private long zzd;
    private String zze = "";
    private g8n zzf = g8n.b;

    static {
        zon zonVar = new zon();
        zzg = zonVar;
        y9n.g(zon.class, zonVar);
    }

    private zon() {
    }

    public static zon w() {
        return zzg;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzg, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zon();
        }
        if (i2 == 4) {
            return new xon(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final long t() {
        return this.zzd;
    }

    public final String u() {
        return this.zze;
    }

    public final g8n v() {
        return this.zzf;
    }
}
