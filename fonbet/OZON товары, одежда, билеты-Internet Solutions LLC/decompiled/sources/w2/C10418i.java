package w2;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: w2.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10418i {
    public static final void a(@NotNull Resources.Theme theme, @NotNull View decor, @NotNull TypedValue tv) {
        WindowInsetsController windowInsetsController;
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(decor, "decor");
        Intrinsics.checkNotNullParameter(tv, "tv");
        int i11 = (!theme.resolveAttribute(R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
            i11 |= 16;
        }
        windowInsetsController = decor.getWindowInsetsController();
        Intrinsics.f(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i11, 24);
    }
}
