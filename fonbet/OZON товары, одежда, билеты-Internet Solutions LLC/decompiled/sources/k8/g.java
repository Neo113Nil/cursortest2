package k8;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class g {
    @NonNull
    public static g d() {
        return new C7606a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long a();

    public abstract long b();

    public abstract long c();
}
