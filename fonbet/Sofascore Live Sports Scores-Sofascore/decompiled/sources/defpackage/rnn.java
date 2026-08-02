package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rnn extends y9n {
    private static final rnn zzg;
    private int zzb;
    private long zzd;
    private long zze;
    private long zzf;

    static {
        rnn rnnVar = new rnn();
        zzg = rnnVar;
        y9n.g(rnn.class, rnnVar);
    }

    private rnn() {
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new rnn();
        }
        if (i2 == 4) {
            return new onn(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
