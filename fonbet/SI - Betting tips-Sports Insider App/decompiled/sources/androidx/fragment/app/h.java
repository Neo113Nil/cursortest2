package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f1932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f1933e;

    public h(ViewGroup viewGroup, View view, boolean z5, f2 f2Var, i iVar) {
        this.f1929a = viewGroup;
        this.f1930b = view;
        this.f1931c = z5;
        this.f1932d = f2Var;
        this.f1933e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f1929a;
        View viewToAnimate = this.f1930b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z5 = this.f1931c;
        f2 f2Var = this.f1932d;
        if (z5 || f2Var.f1903a == i2.f1959c) {
            i2 i2Var = f2Var.f1903a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            i2Var.a(viewToAnimate, viewGroup);
        }
        i iVar = this.f1933e;
        iVar.f1952c.f1994a.c(iVar);
        if (j1.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + f2Var + " has ended.");
        }
    }
}
