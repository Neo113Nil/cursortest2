package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1353b;

    public l1(View view, s1 s1Var) {
        this.f1352a = s1Var;
        this.f1353b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f1352a;
        s1Var.f1391a.e(1.0f);
        n1.f(this.f1353b, s1Var);
    }
}
