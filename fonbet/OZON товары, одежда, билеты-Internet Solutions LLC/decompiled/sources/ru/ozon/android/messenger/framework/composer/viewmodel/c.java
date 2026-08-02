package ru.ozon.android.messenger.framework.composer.viewmodel;

import androidx.lifecycle.w0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.di.component.d;
import ru.ozon.android.messenger.framework.composer.di.component.e;

/* loaded from: classes10.dex */
public final class c extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f86822a;

    public c(@NotNull Set widgets, @NotNull ru.ozon.android.messenger.framework.composer.di.a composerComponent, @NotNull ru.ozon.android.messenger.framework.core.initialization.di.c messengerComponent, boolean z11) {
        Intrinsics.checkNotNullParameter(messengerComponent, "messengerComponent");
        Intrinsics.checkNotNullParameter(composerComponent, "composerComponent");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.f86822a = d.a().a(widgets, composerComponent, messengerComponent, z11);
    }

    @NotNull
    public final e d0() {
        return this.f86822a;
    }
}
