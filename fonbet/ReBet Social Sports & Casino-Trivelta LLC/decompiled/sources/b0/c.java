package b0;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {
    public static final C2331b a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C2331b(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
