package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tln extends y9n {
    private static final tln zzl;
    private int zzb;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        tln tlnVar = new tln();
        zzl = tlnVar;
        y9n.g(tln.class, tlnVar);
    }

    private tln() {
    }

    public static qln s() {
        return (qln) zzl.n();
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new tln();
        }
        if (i2 == 4) {
            return new qln(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final /* synthetic */ void t(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void w(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 32;
        this.zzi = j;
    }
}
