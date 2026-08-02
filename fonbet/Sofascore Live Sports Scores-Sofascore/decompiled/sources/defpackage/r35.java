package defpackage;

import android.os.StatFs;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r35 {
    public uae a;
    public final uha b = s18.a;
    public double c = 0.02d;
    public final hq4 d;

    public r35() {
        hs4 hs4Var = z45.a;
        this.d = hq4.c;
    }

    public final tof a() {
        long j;
        uae uaeVar = this.a;
        if (uaeVar == null) {
            a70.r("directory == null");
            return null;
        }
        if (this.c > 0.0d) {
            try {
                File file = uaeVar.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                j = llf.e((long) (this.c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
            } catch (Exception unused) {
                j = 10485760;
            }
        } else {
            j = 0;
        }
        return new tof(j, this.d, this.b, uaeVar);
    }
}
