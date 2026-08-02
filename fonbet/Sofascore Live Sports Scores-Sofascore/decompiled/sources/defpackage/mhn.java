package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mhn extends y9n {
    private static final mhn zzg;
    private int zzb;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        mhn mhnVar = new mhn();
        zzg = mhnVar;
        y9n.g(mhn.class, mhnVar);
    }

    private mhn() {
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            aon aonVar = aon.a;
            return new lcn(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", "zze", aonVar, "zzf", aonVar});
        }
        if (i2 == 3) {
            return new mhn();
        }
        if (i2 == 4) {
            return new ehn(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
