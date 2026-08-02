package com.vk.feature.uxpolls.modalpoll;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.feature.uxpolls.modalpoll.BaseModalFragment;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import xsna.a470;
import xsna.an10;
import xsna.ao50;
import xsna.bpn0;
import xsna.c6;
import xsna.ey50;
import xsna.fcn;
import xsna.id;
import xsna.jd;
import xsna.kj50;
import xsna.too0;
import xsna.u11;
import xsna.vk50;
import xsna.ww50;

/* compiled from: BaseModalFragment.kt */
/* loaded from: classes18.dex */
public abstract class BaseModalFragment<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends MviImplFragment<F, VS, A> implements too0, fcn {
    public static final /* synthetic */ int V = 0;
    public c R;
    public ModalBottomSheetBehavior<View> S;
    public final bpn0 Q = new bpn0(new c6(2));
    public final id T = new id(this, 2);
    public final bpn0 U = new bpn0(new jd(this, 7));

    /* compiled from: BaseModalFragment.kt */
    public static abstract class a extends ModalBottomSheetBehavior.d {
    }

    /* compiled from: BaseModalFragment.kt */
    public static final class b extends ViewOutlineProvider {
        public final float a;
        public final boolean b = true;

        public b(float f) {
            this.a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            boolean z = this.b;
            float f = this.a;
            int b = z ? 0 : an10.b(f);
            int width = view.getWidth();
            if (width == 0) {
                width = view.getMeasuredWidth();
            }
            int i = width;
            int height = view.getHeight();
            if (height == 0) {
                height = view.getMeasuredHeight();
            }
            outline.setRoundRect(0, -b, i, an10.b(height + f), this.a);
        }
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        b(false);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        b(false);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fcn
    public final void b(boolean z) {
        View view = getView();
        if (view != null) {
            ModalBottomSheetBehavior<View> modalBottomSheetBehavior = this.S;
            if (modalBottomSheetBehavior != null) {
                modalBottomSheetBehavior.O(5);
            }
            c cVar = this.R;
            if (cVar != null) {
                cVar.d(view, 5, true);
            }
        }
        ((Handler) this.Q.getValue()).removeCallbacks(this.T);
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public void close() {
        finish();
        tn();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        b(false);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        ww50<?> Y;
        LayoutInflater.Factory activity = getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            super.finish();
        } else {
            Y.H(this);
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ww50<?> Y;
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.S(this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        super.onStop();
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(-1);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.eh6
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    int i2 = BaseModalFragment.V;
                    if (i != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    BaseModalFragment.this.b(false);
                    return true;
                }
            });
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(80);
                u11.h(-1, -1, window.getDecorView());
            }
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFullScreenBottomSheetTheme;
    }

    /* compiled from: BaseModalFragment.kt */
    public static final class c extends a {
        public int a;
        public final /* synthetic */ BaseModalFragment<F, VS, A> b;

        public c(BaseModalFragment<F, VS, A> baseModalFragment) {
            this.b = baseModalFragment;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            d(view, i, false);
        }

        public final void d(View view, int i, boolean z) {
            ModalBottomSheetBehavior<View> modalBottomSheetBehavior;
            int i2;
            if (i == 1 || i == 2) {
                this.a = i;
                return;
            }
            if (z || (i2 = this.a) == 2 || i2 == 1) {
                BaseModalFragment<F, VS, A> baseModalFragment = this.b;
                if (i == 3) {
                    ModalBottomSheetBehavior<View> modalBottomSheetBehavior2 = baseModalFragment.S;
                    if (modalBottomSheetBehavior2 != null) {
                        modalBottomSheetBehavior2.H = new a470();
                    }
                    ModalBottomSheetBehavior<View> modalBottomSheetBehavior3 = baseModalFragment.S;
                    if (modalBottomSheetBehavior3 != null) {
                        modalBottomSheetBehavior3.N(0, false);
                    }
                    ModalBottomSheetBehavior<View> modalBottomSheetBehavior4 = baseModalFragment.S;
                    if (modalBottomSheetBehavior4 != null) {
                        modalBottomSheetBehavior4.j = true;
                    }
                } else if ((i == 4 || i == 5) && (i == 5 || ((modalBottomSheetBehavior = baseModalFragment.S) != null && modalBottomSheetBehavior.j))) {
                    baseModalFragment.close();
                }
                this.a = i;
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
        }
    }
}
