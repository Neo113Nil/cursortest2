package ru.ozon.composer.ui.widget;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l10.i f94875a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f94876b;

    public i(@NotNull ViewGroup widgetParent, @NotNull l10.i screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(widgetParent, "widgetParent");
        this.f94875a = screen;
        this.f94876b = widgetParent;
    }

    @NotNull
    public final l10.i a() {
        return this.f94875a;
    }

    @NotNull
    public final ViewGroup b() {
        return this.f94876b;
    }
}
