package pZ;

import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import tZ.C9786a;

/* loaded from: classes3.dex */
public final class g extends f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f80371a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f80372b;

    public static final class a extends i<g> {
        private final void a(EZ.e<g> eVar) {
            i.redirect$default(this, eVar.e(new C9786a()), 0, 2, null);
            i.redirect$default(this, eVar.e(eVar.b().getRedirect$compass_release()), 0, 2, null);
        }

        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<g> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            a(response);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<g> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            a(response);
        }
    }

    public g(@NotNull e redirect) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.f80371a = redirect;
        this.f80372b = N.b(a.class);
    }

    @Override // pZ.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && super.equals(obj)) {
            return Intrinsics.d(this.f80371a, ((g) obj).f80371a);
        }
        return false;
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f80372b;
    }

    @NotNull
    public final f getRedirect$compass_release() {
        return this.f80371a;
    }

    @Override // pZ.f
    public final int hashCode() {
        return this.f80371a.hashCode() + (super.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RedirectDestination(redirect=" + this.f80371a + ")";
    }
}
