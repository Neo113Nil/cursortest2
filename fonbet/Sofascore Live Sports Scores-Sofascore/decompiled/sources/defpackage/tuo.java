package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tuo extends y9n {
    private static final tuo zzg;
    private int zzb;
    private xuo zzd;
    private g8n zze;
    private g8n zzf;

    static {
        tuo tuoVar = new tuo();
        zzg = tuoVar;
        y9n.g(tuo.class, tuoVar);
    }

    private tuo() {
        e8n e8nVar = g8n.b;
        this.zze = e8nVar;
        this.zzf = e8nVar;
    }

    public static tuo v(e8n e8nVar, z8n z8nVar) {
        return (tuo) y9n.i(zzg, e8nVar, z8nVar);
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new tuo();
        }
        if (i2 == 4) {
            return new suo(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final xuo s() {
        xuo xuoVar = this.zzd;
        return xuoVar == null ? xuo.A() : xuoVar;
    }

    public final g8n t() {
        return this.zze;
    }

    public final g8n u() {
        return this.zzf;
    }
}
