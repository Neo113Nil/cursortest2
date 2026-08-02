package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lpn extends y9n {
    private static final lpn zze;
    private int zzb;
    private String zzd = "";

    static {
        lpn lpnVar = new lpn();
        zze = lpnVar;
        y9n.g(lpn.class, lpnVar);
    }

    private lpn() {
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new lpn();
        }
        if (i2 == 4) {
            return new fpn(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
