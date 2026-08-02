package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f1892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f1895d;

    public e(f2 f2Var, ViewGroup viewGroup, View view, f fVar) {
        this.f1892a = f2Var;
        this.f1893b = viewGroup;
        this.f1894c = view;
        this.f1895d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ViewGroup viewGroup = this.f1893b;
        viewGroup.post(new d(viewGroup, this.f1894c, this.f1895d, 0));
        if (j1.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1892a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (j1.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1892a + " has reached onAnimationStart.");
        }
    }
}
