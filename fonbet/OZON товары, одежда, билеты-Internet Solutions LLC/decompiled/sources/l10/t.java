package l10;

import Sc.InterfaceC3999a;
import a00.C4908c;
import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f72532a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4911f f72533b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4908c f72534c;

    public t(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f72532a = lifecycleOwner;
        C4911f c4911f = new C4911f(lifecycleOwner);
        this.f72533b = c4911f;
        this.f72534c = c4911f.g();
    }

    public final androidx.fragment.app.r a() {
        return this.f72533b.a();
    }

    public final ComponentCallbacksC5392m b() {
        return this.f72533b.c();
    }

    public final G c() {
        return this.f72533b.d();
    }

    @NotNull
    public final J d() {
        return this.f72533b.f();
    }

    @NotNull
    public final C4911f e() {
        return this.f72533b;
    }

    @NotNull
    public final C4908c f() {
        return this.f72534c;
    }

    @NotNull
    public final androidx.fragment.app.r g() {
        androidx.fragment.app.r a11 = this.f72533b.a();
        if (a11 != null) {
            return a11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public final ComponentCallbacksC5392m h() {
        ComponentCallbacksC5392m c11 = this.f72533b.c();
        if (c11 != null) {
            return c11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public final G i() {
        G d11 = this.f72533b.d();
        if (d11 != null) {
            return d11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
