package ru.ozon.android.messenger.framework.domain.usecases;

import Ae.InterfaceC2395h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9393j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.a f89090a;

    public C9393j(@NotNull ru.ozon.android.messenger.framework.data.local.a widgetStorageDelegate) {
        Intrinsics.checkNotNullParameter(widgetStorageDelegate, "widgetStorageDelegate");
        this.f89090a = widgetStorageDelegate;
    }

    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.domain.model.b> a() {
        return this.f89090a.b();
    }
}
