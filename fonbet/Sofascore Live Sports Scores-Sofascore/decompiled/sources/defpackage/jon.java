package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jon extends y9n {
    private static final jon zzj;
    private int zzb;
    private long zzf;
    private long zzh;
    private long zzi;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static {
        jon jonVar = new jon();
        zzj = jonVar;
        y9n.g(jon.class, jonVar);
    }

    private jon() {
    }

    public static bon s() {
        return (bon) zzj.n();
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new jon();
        }
        if (i2 == 4) {
            return new bon(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 1;
        this.zzd = "0.828153725";
    }

    public final /* synthetic */ void u(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void w(String str) {
        str.getClass();
        this.zzb |= 8;
        this.zzg = str;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    public final /* synthetic */ void y(long j) {
        this.zzb |= 32;
        this.zzi = j;
    }
}
