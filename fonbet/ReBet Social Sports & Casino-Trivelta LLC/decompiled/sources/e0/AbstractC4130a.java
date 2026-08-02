package e0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4130a {
    public static final d a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f.a(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
