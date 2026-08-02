package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mec {
    public final Context a;
    public double b;
    public final boolean c;
    public final boolean d;

    public mec(Context context) {
        this.a = context;
        Bitmap.Config[] configArr = l.a;
        double d = 0.2d;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.b = d;
        this.c = true;
        this.d = true;
    }

    public final gpf a() {
        lii hpoVar;
        int i;
        int i2;
        d0l spfVar = this.d ? new spf(1) : new inb(22);
        if (this.c) {
            double d = this.b;
            if (d > 0.0d) {
                Context context = this.a;
                Bitmap.Config[] configArr = l.a;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    i2 = (context.getApplicationInfo().flags & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    i2 = NotificationCompat.FLAG_LOCAL_ONLY;
                }
                i = (int) (d * i2 * 1024.0d * 1024.0d);
            } else {
                i = 0;
            }
            hpoVar = i > 0 ? new k1d(i, spfVar) : new hpo(spfVar);
        } else {
            hpoVar = new hpo(spfVar);
        }
        return new gpf(hpoVar, spfVar);
    }
}
