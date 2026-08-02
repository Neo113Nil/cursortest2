package lf0;

import B4.C2581j;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: lf0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7955f implements J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2581j f73299a;

    public C7955f(@NotNull C2581j delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f73299a = delegate;
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f73299a.getLifecycle();
    }
}
