package b0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class s {
    public static final p a() {
        return Build.VERSION.SDK_INT >= 28 ? new q() : new r();
    }
}
