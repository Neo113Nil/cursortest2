package com.vk.libvideo.dialogs;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.List;
import xsna.b56;
import xsna.e3m;
import xsna.ey50;
import xsna.fcn;
import xsna.gz80;
import xsna.io2;
import xsna.ozl;
import xsna.p90;
import xsna.pkk;
import xsna.pn10;
import xsna.tn10;
import xsna.ww50;

/* compiled from: BaseAnimationDialog.kt */
/* loaded from: classes.dex */
public abstract class BaseAnimationDialog extends FragmentImpl implements fcn, a.e {
    public static final pkk Z = new pkk(0.58d, 0.77d, 0.5d, 1.0d);
    public static final long a0;
    public static final long b0;
    public static final long c0;
    public static final long d0;
    public com.vk.libvideo.design.view.swipe.layout.a O;
    public View P;
    public boolean Q;
    public pn10 R;
    public pn10 S;
    public ValueAnimator T;
    public AnimatorSet U;
    public Integer V;
    public DisplayCutout W;
    public io2 X;
    public boolean N = true;
    public final boolean Y = true;

    /* compiled from: BaseAnimationDialog.kt */
    /* loaded from: classes14.dex */
    public static final class a {
        public static long a() {
            return BaseAnimationDialog.a0;
        }

        public static pkk b() {
            return BaseAnimationDialog.Z;
        }
    }

    static {
        if (b.A.a(VideoFeatures.VIDEO_SURFACE_VIEW)) {
            a0 = 0L;
            b0 = 0L;
            c0 = 0L;
        } else {
            a0 = 300L;
            b0 = 100L;
            c0 = 100L;
        }
        d0 = (long) (a0 * 0.8f);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        b(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void eo() {
        Window window;
        ww50<?> Y;
        Context mo2getContext = mo2getContext();
        ey50 h = mo2getContext != null ? e3m.h(mo2getContext) : 0;
        if (h != 0 && !p90.e(h) && !isDetached()) {
            tn();
        }
        ey50 ey50Var = h instanceof ey50 ? h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            Y.H(this);
        }
        Integer num = this.V;
        if (num != null) {
            int intValue = num.intValue();
            if (h == 0 || (window = h.getWindow()) == null) {
                return;
            }
            window.setStatusBarColor(intValue);
        }
    }

    public final void fo() {
        pn10 pn10Var = this.S;
        if (pn10Var != null) {
            pn10Var.removeAllUpdateListeners();
            pn10Var.removeAllListeners();
            pn10Var.cancel();
            this.S = null;
        }
        pn10 pn10Var2 = this.R;
        if (pn10Var2 != null) {
            pn10Var2.removeAllUpdateListeners();
            pn10Var2.removeAllListeners();
            pn10Var2.cancel();
            this.R = null;
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            this.T = null;
        }
        AnimatorSet animatorSet = this.U;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
            this.U = null;
        }
    }

    public final void go() {
        super.dismiss();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean h6() {
        return true;
    }

    public abstract List<View> ho();

    public abstract View io();

    public abstract tn10 jo();

    public abstract int ko();

    @ozl
    public abstract tn10 lo();

    public abstract int mo();

    public abstract void no(Rect rect);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        View inflate = View.inflate(getActivity(), ko(), null);
        this.P = inflate;
        inflate.setId(R.id.fragment_wrapper);
        View view = this.P;
        if (view == null) {
            view = null;
        }
        if (gz80.a(28)) {
            Dialog dialog = this.s;
            if (dialog != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.a56
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    pkk pkkVar = BaseAnimationDialog.Z;
                    DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                    if (displayCutout != null) {
                        BaseAnimationDialog baseAnimationDialog = BaseAnimationDialog.this;
                        if (!displayCutout.equals(baseAnimationDialog.W)) {
                            baseAnimationDialog.no(new Rect(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()));
                            baseAnimationDialog.W = displayCutout;
                        }
                    }
                    return windowInsets;
                }
            });
        }
        View view2 = this.P;
        if (view2 == null) {
            view2 = null;
        }
        com.vk.libvideo.design.view.swipe.layout.a aVar = (com.vk.libvideo.design.view.swipe.layout.a) view2.findViewById(R.id.swipe_layout);
        this.O = aVar;
        aVar.setNavigationCallback(this);
        if (this.Y) {
            com.vk.libvideo.design.view.swipe.layout.a aVar2 = this.O;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.c();
        }
        View view3 = this.P;
        if (view3 != null) {
            return view3;
        }
        return null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() instanceof ey50) {
            ((ey50) getActivity()).Y().S(this);
        }
    }

    public void oo() {
        View b;
        io2 io2Var = this.X;
        if (io2Var != null) {
            io2Var.C();
        }
        tn10 lo = lo();
        if (lo == null || (b = lo.b()) == null) {
            return;
        }
        b.setHasTransientState(false);
    }

    public void po() {
        View b;
        io2 io2Var = this.X;
        if (io2Var != null) {
            io2Var.J();
        }
        tn10 lo = lo();
        if (lo == null || (b = lo.b()) == null) {
            return;
        }
        b.setHasTransientState(true);
    }

    public void qo() {
        View b;
        io2 io2Var = this.X;
        if (io2Var != null) {
            io2Var.D0();
        }
        tn10 lo = lo();
        if (lo == null || (b = lo.b()) == null) {
            return;
        }
        b.setHasTransientState(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return mo();
    }

    @Override // androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setOnKeyListener(new b56(this, 0));
        return yn;
    }
}
