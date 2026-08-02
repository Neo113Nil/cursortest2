package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kin extends y9n {
    private static final kin zze;
    private int zzb;
    private long zzd = -1;

    static {
        kin kinVar = new kin();
        zze = kinVar;
        y9n.g(kin.class, kinVar);
    }

    private kin() {
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new kin();
        }
        if (i2 == 4) {
            return new vhn(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
