package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f725b;

    public /* synthetic */ d(int i5, Object obj) {
        this.f724a = i5;
        this.f725b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f724a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f725b;
                actionBarOverlayLayout.f609w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                ((androidx.core.view.h1) this.f725b).onAnimationCancel();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f724a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f725b;
                actionBarOverlayLayout.f609w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                ((androidx.core.view.h1) this.f725b).onAnimationEnd();
                break;
            case 2:
                ((androidx.transition.a0) this.f725b).end();
                animation.removeListener(this);
                break;
            case 3:
                androidx.vectordrawable.graphics.drawable.h hVar = (androidx.vectordrawable.graphics.drawable.h) this.f725b;
                ArrayList arrayList = new ArrayList(hVar.f2799e);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i5)).onAnimationEnd(hVar);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((View) this.f725b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f724a) {
            case 1:
                ((androidx.core.view.h1) this.f725b).a();
                break;
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                androidx.vectordrawable.graphics.drawable.h hVar = (androidx.vectordrawable.graphics.drawable.h) this.f725b;
                ArrayList arrayList = new ArrayList(hVar.f2799e);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i5)).onAnimationStart(hVar);
                }
                break;
        }
    }

    public d(androidx.core.view.h1 h1Var, View view) {
        this.f724a = 1;
        this.f725b = h1Var;
    }
}
