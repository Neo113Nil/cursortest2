package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f2695a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: b, reason: collision with root package name */
    public static final b f2696b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f2697c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f2698d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2699e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f2700f;

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        f2696b = new b(cls, str, 0);
        String str2 = "bottomRight";
        f2697c = new b(cls, str2, 1);
        f2698d = new b(cls, str2, 2);
        f2699e = new b(cls, str, 3);
        f2700f = new b(cls, "position", 4);
    }

    public static void g(l0 l0Var) {
        View view = l0Var.f2725b;
        HashMap hashMap = l0Var.f2724a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", l0Var.f2725b.getParent());
    }

    @Override // androidx.transition.a0
    public final void captureEndValues(l0 l0Var) {
        g(l0Var);
    }

    @Override // androidx.transition.a0
    public final void captureStartValues(l0 l0Var) {
        g(l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.a0
    public final Animator createAnimator(ViewGroup viewGroup, l0 l0Var, l0 l0Var2) {
        int i5;
        ObjectAnimator a7;
        if (l0Var == null) {
            return null;
        }
        HashMap hashMap = l0Var.f2724a;
        if (l0Var2 == null) {
            return null;
        }
        HashMap hashMap2 = l0Var2.f2724a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = l0Var2.f2725b;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i10 = rect.left;
        int i11 = rect2.left;
        int i12 = rect.top;
        int i13 = rect2.top;
        int i14 = rect.right;
        int i15 = rect2.right;
        int i16 = rect.bottom;
        int i17 = rect2.bottom;
        int i18 = i14 - i10;
        int i19 = i16 - i12;
        int i20 = i15 - i11;
        int i21 = i17 - i13;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
            i5 = 0;
        } else {
            i5 = (i10 == i11 && i12 == i13) ? 0 : 1;
            if (i14 != i15 || i16 != i17) {
                i5++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i5++;
        }
        int i22 = i5;
        if (i22 <= 0) {
            return null;
        }
        p0.a(view, i10, i12, i14, i16);
        if (i22 != 2) {
            a7 = (i10 == i11 && i12 == i13) ? o.a(view, f2698d, getPathMotion().getPath(i14, i16, i15, i17)) : o.a(view, f2699e, getPathMotion().getPath(i10, i12, i11, i13));
        } else if (i18 == i20 && i19 == i21) {
            a7 = o.a(view, f2700f, getPathMotion().getPath(i10, i12, i11, i13));
        } else {
            e eVar = new e(view);
            ObjectAnimator a10 = o.a(eVar, f2696b, getPathMotion().getPath(i10, i12, i11, i13));
            ObjectAnimator a11 = o.a(eVar, f2697c, getPathMotion().getPath(i14, i16, i15, i17));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a10, a11);
            animatorSet.addListener(new c(eVar));
            a7 = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            y4.a.D(viewGroup4, true);
            getRootTransition().addListener(new d(viewGroup4));
        }
        return a7;
    }

    @Override // androidx.transition.a0
    public final String[] getTransitionProperties() {
        return f2695a;
    }

    @Override // androidx.transition.a0
    public final boolean isSeekingSupported() {
        return true;
    }
}
