package vZ;

import androidx.fragment.app.G;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: vZ.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10288c implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G f102717a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J f102718b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C10287b f102719c;

    public C10288c(@NotNull G fragmentManager, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f102717a = fragmentManager;
        this.f102718b = lifecycleOwner;
        this.f102719c = new C10287b(fragmentManager);
        lifecycleOwner.getLifecycle().e(this);
        lifecycleOwner.getLifecycle().a(this);
    }

    public final void a(@NotNull Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f102719c.b(runnable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f102717a.Y0(this.f102719c, false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        G g10 = this.f102717a;
        C10287b c10287b = this.f102719c;
        g10.t1(c10287b);
        c10287b.d();
        this.f102718b.getLifecycle().e(this);
    }
}
