package yZ;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EZ.h f106402a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EZ.g f106403b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v f106404c;

    public g(@NotNull EZ.h navigatorHolder, @NotNull EZ.g navigator, @NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(navigatorHolder, "navigatorHolder");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f106402a = navigatorHolder;
        this.f106403b = navigator;
        this.f106404c = lifecycle;
        navigatorHolder.b(navigator);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106402a.b(this.f106403b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106402a.h(this.f106403b);
        this.f106404c.e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106402a.h(this.f106403b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106402a.b(this.f106403b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106402a.b(this.f106403b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106402a.h(this.f106403b);
    }
}
