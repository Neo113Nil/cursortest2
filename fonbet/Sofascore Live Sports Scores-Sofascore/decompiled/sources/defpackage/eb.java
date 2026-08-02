package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.slider.b;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 6:
                ((f51) obj).d();
                break;
            case 7:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.k = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                k70 k70Var = (k70) obj;
                ArrayList arrayList = new ArrayList(k70Var.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((p50) arrayList.get(i2)).a(k70Var);
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                b bVar = (b) obj;
                ViewGroup s = vha.s(bVar);
                ViewOverlay overlay = s != null ? s.getOverlay() : null;
                if (overlay != null) {
                    Iterator it = bVar.l.iterator();
                    while (it.hasNext()) {
                        overlay.remove((skj) it.next());
                    }
                    break;
                }
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.N(5);
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.Y.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                ed5 ed5Var = (ed5) obj;
                ed5Var.p();
                ed5Var.r.start();
                break;
            case 5:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 6:
                ((f51) obj).e();
                break;
            case 7:
            case 8:
            default:
                super.onAnimationEnd(animator);
                break;
            case 9:
                myb mybVar = (myb) obj;
                mybVar.b.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                mybVar.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 10:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 11:
                zoi zoiVar = (zoi) obj;
                View view = zoiVar.e;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int height = view.getHeight();
                ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(zoiVar.d);
                duration.addListener(new yoi(zoiVar, layoutParams, height));
                duration.addUpdateListener(new kv2(1, zoiVar, layoutParams));
                duration.start();
                break;
            case 12:
                ((xwj) obj).m();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 8:
                super.onAnimationRepeat(animator);
                w7b w7bVar = (w7b) this.b;
                w7bVar.f = (w7bVar.f + 1) % w7bVar.e.e.length;
                w7bVar.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                k70 k70Var = (k70) obj;
                ArrayList arrayList = new ArrayList(k70Var.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((p50) arrayList.get(i2)).b(k70Var);
                }
                break;
            case 6:
                ((f51) obj).f(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
