package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hen extends y9n {
    private static final hen zzh;
    private int zzf;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        hen henVar = new hen();
        zzh = henVar;
        y9n.g(hen.class, henVar);
    }

    private hen() {
    }

    public static gen s() {
        return (gen) zzh.n();
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzh, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new hen();
        }
        if (i2 == 4) {
            return new gen(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final /* synthetic */ void t(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzb = str2;
    }

    public final /* synthetic */ void u(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        this.zzd = str2;
    }

    public final /* synthetic */ void v(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zze = str2;
    }
}
