package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends e2 {

    /* renamed from: c, reason: collision with root package name */
    public final g f1900c;

    public f(g animationInfo) {
        Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
        this.f1900c = animationInfo;
    }

    @Override // androidx.fragment.app.e2
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f1900c;
        f2 f2Var = gVar.f1994a;
        View view = f2Var.f1905c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        gVar.f1994a.c(this);
        if (j1.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + f2Var + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.e2
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f1900c;
        f2 f2Var = gVar.f1994a;
        if (gVar.a()) {
            f2Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = f2Var.f1905c.mView;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        q0 b10 = gVar.b(context);
        if (b10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) b10.f2047a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (f2Var.f1903a != i2.f1957a) {
            view.startAnimation(animation);
            f2Var.c(this);
            return;
        }
        container.startViewTransition(view);
        r0 r0Var = new r0(animation, container, view);
        r0Var.setAnimationListener(new e(f2Var, container, view, this));
        view.startAnimation(r0Var);
        if (j1.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + f2Var + " has started.");
        }
    }
}
