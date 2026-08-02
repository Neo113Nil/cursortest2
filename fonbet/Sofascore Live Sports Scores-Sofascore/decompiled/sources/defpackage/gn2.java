package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gn2 extends xwj {
    public static final String[] E = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final e51 F = new e51(1, "topLeft", PointF.class);
    public static final e51 G = new e51(2, "bottomRight", PointF.class);
    public static final e51 H = new e51(3, "bottomRight", PointF.class);
    public static final e51 I = new e51(4, "topLeft", PointF.class);
    public static final e51 J = new e51(5, "position", PointF.class);

    public static void P(oxj oxjVar) {
        View view = oxjVar.b;
        HashMap hashMap = oxjVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.xwj
    public final void d(oxj oxjVar) {
        P(oxjVar);
    }

    @Override // defpackage.xwj
    public final void g(oxj oxjVar) {
        P(oxjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xwj
    public final Animator k(ViewGroup viewGroup, oxj oxjVar, oxj oxjVar2) {
        int i;
        gn2 gn2Var;
        ObjectAnimator ofObject;
        if (oxjVar == null) {
            return null;
        }
        HashMap hashMap = oxjVar.a;
        if (oxjVar2 == null) {
            return null;
        }
        HashMap hashMap2 = oxjVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = oxjVar2.b;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        kvk.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            gn2Var = this;
            if (i2 == i3 && i4 == i5) {
                gn2Var.w.getClass();
                ofObject = ObjectAnimator.ofObject(view, H, (TypeConverter) null, wkf.c(i6, i8, i7, i9));
            } else {
                gn2Var.w.getClass();
                ofObject = ObjectAnimator.ofObject(view, I, (TypeConverter) null, wkf.c(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            gn2Var = this;
            gn2Var.w.getClass();
            ofObject = ObjectAnimator.ofObject(view, J, (TypeConverter) null, wkf.c(i2, i4, i3, i5));
        } else {
            gn2Var = this;
            fn2 fn2Var = new fn2(view);
            gn2Var.w.getClass();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(fn2Var, F, (TypeConverter) null, wkf.c(i2, i4, i3, i5));
            gn2Var.w.getClass();
            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(fn2Var, G, (TypeConverter) null, wkf.c(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject2, ofObject3);
            animatorSet.addListener(new dn2(fn2Var));
            ofObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            hda.R(viewGroup4, true);
            gn2Var.o().a(new en2(viewGroup4));
        }
        return ofObject;
    }

    @Override // defpackage.xwj
    public final String[] q() {
        return E;
    }

    @Override // defpackage.xwj
    public final boolean t() {
        return true;
    }
}
