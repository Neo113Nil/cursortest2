package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.h1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s extends A {
    @Override // androidx.activity.B
    public void b(@NotNull J statusBarStyle, @NotNull J navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC2109r0.b(window, false);
        window.setStatusBarColor(statusBarStyle.d(z10));
        window.setNavigationBarColor(navigationBarStyle.a());
        new h1(window, view).e(!z10);
    }
}
