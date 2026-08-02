package ji;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: ji.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7431b {
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.round_corners_flag, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }
}
