package v5;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import org.jetbrains.annotations.NotNull;
import xe.B0;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10227a implements InterfaceC10241o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v f102133a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0 f102134b;

    public C10227a(@NotNull AbstractC5434v abstractC5434v, @NotNull B0 b02) {
        this.f102133a = abstractC5434v;
        this.f102134b = b02;
    }

    @Override // v5.InterfaceC10241o
    public final void m() {
        this.f102133a.e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J j11) {
        this.f102134b.j(null);
    }

    @Override // v5.InterfaceC10241o
    public final void start() {
        this.f102133a.a(this);
    }
}
