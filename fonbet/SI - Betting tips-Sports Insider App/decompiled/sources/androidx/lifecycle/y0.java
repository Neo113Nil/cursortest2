package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 {
    public static void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new z0.a());
    }
}
