package ru.ozon.android.messenger.utils.view;

import android.view.Window;
import androidx.core.view.Q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f92012a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q0 f92013b;

    public m(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f92012a = window;
        this.f92013b = new Q0(window.getDecorView(), window);
    }

    public final void a(int i11) {
        this.f92012a.setStatusBarColor(i11);
        this.f92013b.e(!(androidx.core.graphics.c.c(i11) < 0.5d));
    }
}
