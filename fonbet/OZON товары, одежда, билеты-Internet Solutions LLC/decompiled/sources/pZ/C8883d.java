package pZ;

import CZ.b;
import EZ.i;
import OZ.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import qZ.C9012d;
import rZ.C9236a;
import tZ.C9788c;
import xZ.C10683b;

/* renamed from: pZ.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8883d extends f {

    /* renamed from: a, reason: collision with root package name */
    private final f f80365a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f80366b;

    /* renamed from: pZ.d$a */
    public static final class a extends i<C8883d> {
        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<C8883d> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateForResult(navigator, response, 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<C8883d> response, int i11) {
            f bVar;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!CZ.d.a(navigator.getActivity())) {
                navigator.getActivity().finish();
                redirect(response, i11);
                return;
            }
            if ((navigator instanceof NZ.a) || (navigator instanceof BZ.i)) {
                bVar = new CZ.b((f) new OZ.c(c.a.C0403a.f20164a, response.b().getRedirect$compass_release()), b.a.ALL, false);
            } else if (navigator instanceof C9012d) {
                bVar = new C9236a(((C9012d) navigator).a(), response.b());
            } else {
                if (!(navigator instanceof C10683b)) {
                    next(navigator, response, i11);
                    return;
                }
                bVar = new C9788c(response.b().getRedirect$compass_release());
            }
            navigator.navigate(response.e(bVar), i11);
        }
    }

    public C8883d() {
        this(null);
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f80366b;
    }

    public final f getRedirect$compass_release() {
        return this.f80365a;
    }

    @NotNull
    public final String toString() {
        return "ClearAppBackStackDestination(redirect=" + this.f80365a + ")";
    }

    public C8883d(f fVar) {
        this.f80365a = fVar;
        this.f80366b = N.b(a.class);
    }
}
