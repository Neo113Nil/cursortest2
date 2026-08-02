package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tmn extends y9n {
    private static final tmn zze;
    private han zzb;
    private han zzd;

    static {
        tmn tmnVar = new tmn();
        zze = tmnVar;
        y9n.g(tmn.class, tmnVar);
    }

    private tmn() {
        zan zanVar = zan.e;
        this.zzb = zanVar;
        this.zzd = zanVar;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zze, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new tmn();
        }
        if (i2 == 4) {
            return new qmn(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
