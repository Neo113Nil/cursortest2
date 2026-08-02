package v5;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import org.jetbrains.annotations.NotNull;

/* renamed from: v5.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10233g extends AbstractC5434v {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C10233g f102164b = new C10233g();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f102165c = new a();

    /* renamed from: v5.g$a */
    public static final class a implements J {
        @Override // androidx.lifecycle.J
        public final AbstractC5434v getLifecycle() {
            return C10233g.f102164b;
        }
    }

    @Override // androidx.lifecycle.AbstractC5434v
    public final void a(@NotNull I i11) {
        if (!(i11 instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((i11 + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) i11;
        a aVar = f102165c;
        defaultLifecycleObserver.onCreate(aVar);
        defaultLifecycleObserver.onStart(aVar);
        defaultLifecycleObserver.onResume(aVar);
    }

    @Override // androidx.lifecycle.AbstractC5434v
    @NotNull
    public final AbstractC5434v.b b() {
        return AbstractC5434v.b.RESUMED;
    }

    @Override // androidx.lifecycle.AbstractC5434v
    public final void e(@NotNull I i11) {
    }

    @NotNull
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
