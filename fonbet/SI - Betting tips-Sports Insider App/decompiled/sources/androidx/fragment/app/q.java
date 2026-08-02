package androidx.fragment.app;

import android.transition.Transition;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends l {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2044b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2045c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f2 operation, boolean z5, boolean z7) {
        super(operation);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Fragment fragment = operation.f1905c;
        i2 i2Var = operation.f1903a;
        i2 i2Var2 = i2.f1958b;
        this.f2044b = i2Var == i2Var2 ? z5 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z5 ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f2045c = operation.f1903a == i2Var2 ? z5 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f2046d = z7 ? z5 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final a2 b() {
        Object obj = this.f2044b;
        a2 c2 = c(obj);
        Object obj2 = this.f2046d;
        a2 c8 = c(obj2);
        if (c2 == null || c8 == null || c2 == c8) {
            return c2 == null ? c8 : c2;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f1994a.f1905c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final a2 c(Object obj) {
        if (obj == null) {
            return null;
        }
        y1 y1Var = t1.f2090a;
        if (obj instanceof Transition) {
            return y1Var;
        }
        a2 a2Var = t1.f2091b;
        if (a2Var != null && a2Var.g(obj)) {
            return a2Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1994a.f1905c + " is not a valid framework Transition or AndroidX Transition");
    }
}
