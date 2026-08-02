package defpackage;

import android.app.ActivityOptions;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sd extends ok3 {
    public final ActivityOptions r;

    public sd(ActivityOptions activityOptions) {
        this.r = activityOptions;
    }

    public final sd M(int i) {
        int i2 = Build.VERSION.SDK_INT;
        ActivityOptions activityOptions = this.r;
        if (i2 >= 34) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(i);
            return this;
        }
        if (i2 >= 33) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(i != 2);
        }
        return this;
    }
}
