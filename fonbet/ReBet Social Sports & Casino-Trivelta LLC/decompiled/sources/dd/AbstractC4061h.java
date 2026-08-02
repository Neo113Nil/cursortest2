package dd;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.F0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dd.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4061h {
    public static final androidx.core.graphics.e a(View view, int i10, WindowInsets windowInsets, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (windowInsets == null) {
            androidx.core.graphics.e NONE = androidx.core.graphics.e.f19097e;
            Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
            return NONE;
        }
        F0 y10 = F0.y(windowInsets);
        Intrinsics.checkNotNullExpressionValue(y10, "toWindowInsetsCompat(...)");
        if (z10) {
            androidx.core.graphics.e g10 = y10.g(i10);
            Intrinsics.checkNotNull(g10);
            return g10;
        }
        androidx.core.graphics.e f10 = y10.f(i10);
        Intrinsics.checkNotNull(f10);
        return f10;
    }

    public static /* synthetic */ androidx.core.graphics.e b(View view, int i10, WindowInsets windowInsets, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            windowInsets = view.getRootWindowInsets();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a(view, i10, windowInsets, z10);
    }
}
