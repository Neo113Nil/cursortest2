package ru.ozon.android.messenger.framework.presentation.messenger;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f91362a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.di.c f91363b;

    /* renamed from: c, reason: collision with root package name */
    public a f91364c;

    public interface a {
        @NotNull
        l a(@NotNull f fVar);
    }

    public j(@NotNull f launchType, @NotNull ru.ozon.android.messenger.framework.core.initialization.di.c component) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f91362a = launchType;
        this.f91363b = component;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (!Intrinsics.d(modelClass, l.class)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f91363b.D(this);
        a aVar = this.f91364c;
        if (aVar != null) {
            return aVar.a(this.f91362a);
        }
        Intrinsics.n("assistedFactory");
        throw null;
    }
}
