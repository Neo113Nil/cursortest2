package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.ie2;
import defpackage.iod;
import defpackage.jod;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class e {
    public static jod a;

    public static jod a(PathProvider pathProvider) {
        pathProvider.getClass();
        jod jodVar = a;
        if (jodVar != null) {
            return jodVar;
        }
        iod iodVar = new iod();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        iodVar.d(60L, timeUnit);
        iodVar.c(60L, timeUnit);
        iodVar.l = null;
        iodVar.i = true;
        iodVar.j = true;
        ConfigManager.INSTANCE.getClass();
        long e = ConfigManager.e();
        int d = ConfigManager.d();
        String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
        absolutePath.getClass();
        long min = Math.min(e, (PathProvider.a(absolutePath) * d) / 100);
        if (min > 0) {
            iodVar.l = new ie2(pathProvider.getCleverCacheDir(), min);
        } else {
            boolean z = u.a;
            t.c("AssetDownloader", "cache disk capacity size <=0, no clever cache active.");
        }
        jod jodVar2 = new jod(iodVar);
        a = jodVar2;
        return jodVar2;
    }
}
