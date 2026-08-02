package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qen extends y9n {
    private static final qen zze;
    private long zzb;
    private long zzd;

    static {
        qen qenVar = new qen();
        zze = qenVar;
        y9n.g(qen.class, qenVar);
    }

    private qen() {
    }

    public static pen s() {
        return (pen) zze.n();
    }

    public static qen t() {
        return zze;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zze, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new qen();
        }
        if (i2 == 4) {
            return new pen(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void v(long j) {
        this.zzd = j;
    }
}
