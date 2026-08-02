package u4;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6519z {
    public static final ComponentActivity a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Picture in picture should be called in the context of an Activity");
    }
}
