package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sgn extends y9n {
    private static final sgn zzh;
    private int zzb;
    private int zzd = 1000;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        sgn sgnVar = new sgn();
        zzh = sgnVar;
        y9n.g(sgn.class, sgnVar);
    }

    private sgn() {
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            aon aonVar = aon.a;
            return new lcn(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zzb", "zzd", aonVar, "zze", aonVar, "zzf", aonVar, "zzg", aonVar});
        }
        if (i2 == 3) {
            return new sgn();
        }
        if (i2 == 4) {
            return new kgn(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
