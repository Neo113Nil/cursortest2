package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.h1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class t extends A {
    @Override // androidx.activity.B
    public void b(@NotNull J statusBarStyle, @NotNull J navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC2109r0.b(window, false);
        window.setStatusBarColor(statusBarStyle.d(z10));
        window.setNavigationBarColor(navigationBarStyle.d(z11));
        h1 h1Var = new h1(window, view);
        h1Var.e(!z10);
        h1Var.d(!z11);
    }
}
