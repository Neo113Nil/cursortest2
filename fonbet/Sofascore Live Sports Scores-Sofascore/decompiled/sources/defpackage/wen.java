package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wen extends y9n {
    private static final wen zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        wen wenVar = new wen();
        zzf = wenVar;
        y9n.g(wen.class, wenVar);
    }

    private wen() {
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzf, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new wen();
        }
        if (i2 == 4) {
            return new ven(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
