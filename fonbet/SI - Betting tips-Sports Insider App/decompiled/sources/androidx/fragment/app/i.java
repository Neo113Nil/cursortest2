package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends e2 {

    /* renamed from: c, reason: collision with root package name */
    public final g f1952c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f1953d;

    public i(g animatorInfo) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        this.f1952c = animatorInfo;
    }

    @Override // androidx.fragment.app.e2
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AnimatorSet animatorSet = this.f1953d;
        g gVar = this.f1952c;
        if (animatorSet == null) {
            gVar.f1994a.c(this);
            return;
        }
        f2 f2Var = gVar.f1994a;
        if (!f2Var.f1909g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            k.f1987a.a(animatorSet);
        }
        if (j1.L(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(f2Var);
            sb2.append(" has been canceled");
            sb2.append(f2Var.f1909g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // androidx.fragment.app.e2
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        f2 f2Var = this.f1952c.f1994a;
        AnimatorSet animatorSet = this.f1953d;
        if (animatorSet == null) {
            f2Var.c(this);
            return;
        }
        animatorSet.start();
        if (j1.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + f2Var + " has started.");
        }
    }

    @Override // androidx.fragment.app.e2
    public final void d(e.a backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        f2 f2Var = this.f1952c.f1994a;
        AnimatorSet animatorSet = this.f1953d;
        if (animatorSet == null) {
            f2Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !f2Var.f1905c.mTransitioning) {
            return;
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + f2Var);
        }
        long a7 = j.f1962a.a(animatorSet);
        long j = (long) (backEvent.f8390c * a7);
        if (j == 0) {
            j = 1;
        }
        if (j == a7) {
            j = a7 - 1;
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + f2Var);
        }
        k.f1987a.b(animatorSet, j);
    }

    @Override // androidx.fragment.app.e2
    public final void e(ViewGroup container) {
        i iVar;
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f1952c;
        if (gVar.a()) {
            return;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        q0 b10 = gVar.b(context);
        this.f1953d = b10 != null ? (AnimatorSet) b10.f2048b : null;
        f2 f2Var = gVar.f1994a;
        Fragment fragment = f2Var.f1905c;
        boolean z5 = f2Var.f1903a == i2.f1959c;
        View view = fragment.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f1953d;
        if (animatorSet != null) {
            iVar = this;
            animatorSet.addListener(new h(container, view, z5, f2Var, iVar));
        } else {
            iVar = this;
        }
        AnimatorSet animatorSet2 = iVar.f1953d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
