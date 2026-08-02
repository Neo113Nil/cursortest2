package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ifj {
    public static final ifj a = new ifj();

    public final void a(@NotNull RemoteViews remoteViews, int i, int i2) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setInt(i, "setGravity", i2);
            return;
        }
        throw new IllegalArgumentException(("setGravity is only available on SDK 31 and higher").toString());
    }
}
