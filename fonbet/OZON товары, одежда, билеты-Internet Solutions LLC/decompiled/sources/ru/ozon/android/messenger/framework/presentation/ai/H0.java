package ru.ozon.android.messenger.framework.presentation.ai;

import androidx.lifecycle.C5418g0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.di.InterfaceC9376a;

/* loaded from: classes10.dex */
public final class H0 implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9376a.InterfaceC1633a f89260a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9409a f89261b;

    public H0(@NotNull InterfaceC9376a.InterfaceC1633a componentFactory, @NotNull C9409a args) {
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f89260a = componentFactory;
        this.f89261b = args;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends androidx.lifecycle.w0> T create(@NotNull Class<T> modelClass, @NotNull AbstractC6409a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        C5418g0 a11 = androidx.lifecycle.j0.a(extras);
        return this.f89260a.a(this.f89261b, a11).a();
    }
}
