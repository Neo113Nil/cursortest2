package ru.ozon.android.messenger.framework.navigation.action;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f89171a;

    public e(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController) {
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        this.f89171a = messengerController;
    }

    public final void a(@NotNull c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f89171a.l(action);
    }
}
