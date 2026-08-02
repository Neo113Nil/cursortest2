package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oen extends y9n {
    private static final oen zzl;
    private int zzb;
    private int zzd = 0;
    private Object zze;
    private int zzf;
    private int zzg;
    private uen zzh;
    private int zzi;
    private int zzj;
    private ken zzk;

    static {
        oen oenVar = new oen();
        zzl = oenVar;
        y9n.g(oen.class, oenVar);
    }

    private oen() {
    }

    public static nen s() {
        return (nen) zzl.n();
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzl, "\u0004\u0007\u0001\u0001\u0007\r\u0007\u0000\u0000\u0000\u0007<\u0000\bင\u0000\t\f\nဉ\u0001\u000bင\u0002\f\f\rဉ\u0003", new Object[]{"zze", "zzd", "zzb", hen.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new oen();
        }
        if (i2 == 4) {
            return new nen(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final /* synthetic */ void t(hen henVar) {
        this.zze = henVar;
        this.zzd = 7;
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 1;
        this.zzf = i;
    }

    public final /* synthetic */ void v(uen uenVar) {
        this.zzh = uenVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void w(int i) {
        this.zzb |= 4;
        this.zzi = i;
    }
}
