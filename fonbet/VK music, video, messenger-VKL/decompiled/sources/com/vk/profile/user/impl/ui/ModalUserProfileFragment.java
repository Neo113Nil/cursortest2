package com.vk.profile.user.impl.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.g;
import com.vkontakte.android.R;
import xsna.a470;
import xsna.bpn0;
import xsna.btq0;
import xsna.bwt0;
import xsna.e3m;
import xsna.ey50;
import xsna.fcn;
import xsna.fvr;
import xsna.iie;
import xsna.krv0;
import xsna.lpj;
import xsna.mi10;
import xsna.mk50;
import xsna.n7w;
import xsna.osq0;
import xsna.s0w0;
import xsna.se0;
import xsna.slq0;
import xsna.tnf;
import xsna.ts90;
import xsna.vds;
import xsna.ww50;
import xsna.xwk;

/* compiled from: ModalUserProfileFragment.kt */
/* loaded from: classes5.dex */
public final class ModalUserProfileFragment extends UserProfileFragment implements fcn, vds {
    public static final /* synthetic */ int C0 = 0;
    public ConstraintLayout r0;
    public ConstraintLayout s0;
    public FrameLayout t0;
    public ImageView u0;
    public TextView v0;
    public RecyclerView w0;
    public b y0;
    public ModalBottomSheetBehavior<View> z0;
    public final UserProfileMode q0 = UserProfileMode.Modal;
    public final bpn0 x0 = new bpn0(new se0(25));
    public final tnf A0 = new tnf(this, 5);
    public final bpn0 B0 = new bpn0(new n7w(this, 10));

    /* compiled from: ModalUserProfileFragment.kt */
    public static abstract class a extends ModalBottomSheetBehavior.d {
    }

    @Override // com.vk.profile.user.impl.ui.UserProfileFragment, com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a<lpj> Jn() {
        return null;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ModalBottomSheetBehavior<View> modalBottomSheetBehavior = this.z0;
        if (modalBottomSheetBehavior != null) {
            modalBottomSheetBehavior.O(5);
        }
        b bVar = this.y0;
        if (bVar != null) {
            RecyclerView recyclerView = this.w0;
            if (recyclerView == null) {
                recyclerView = null;
            }
            bVar.d(recyclerView, 5, true);
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fcn
    public final void b(boolean z) {
        if (z) {
            a0();
        } else {
            finish();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        ((Handler) this.x0.getValue()).removeCallbacks(this.A0);
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        ww50<?> Y;
        Context mo2getContext = mo2getContext();
        Object h = mo2getContext != null ? e3m.h(mo2getContext) : null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.H(this);
    }

    @Override // com.vk.profile.user.impl.ui.UserProfileFragment
    public final void fo(g.a aVar, boolean z, String str) {
        super.fo(aVar, false, str);
        TextView textView = this.v0;
        if (textView == null) {
            textView = null;
        }
        textView.setText(aVar.b);
    }

    @Override // com.vk.profile.user.impl.ui.UserProfileFragment
    public final UserProfileMode jo() {
        return this.q0;
    }

    @Override // com.vk.profile.user.impl.ui.UserProfileFragment
    public final mk50.c lo(View view) {
        View inflate = View.inflate(requireContext(), R.layout.fragment_modal_user_profile, null);
        this.r0 = (ConstraintLayout) inflate.findViewById(R.id.design_bottom_sheet);
        this.t0 = (FrameLayout) inflate.findViewById(R.id.bottom_sheet_content_holder);
        this.s0 = (ConstraintLayout) inflate.findViewById(R.id.bottom_sheet_toolbar);
        this.u0 = (ImageView) inflate.findViewById(R.id.ivClose);
        this.v0 = (TextView) inflate.findViewById(R.id.tvTitle);
        this.w0 = (RecyclerView) view.findViewById(R.id.profile_content_tabs_modal);
        FrameLayout frameLayout = this.t0;
        (frameLayout != null ? frameLayout : null).addView(view, 0);
        return new mk50.c(inflate);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.m230] */
    @Override // com.vk.profile.user.impl.ui.UserProfileFragment
    public final btq0 mo() {
        return new osq0(this, xwk.e(), new slq0() { // from class: xsna.m230
            @Override // xsna.slq0
            public final void a(UserProfileAction userProfileAction) {
                int i = ModalUserProfileFragment.C0;
                ModalUserProfileFragment.this.getFeature().C(userProfileAction);
            }
        });
    }

    @Override // com.vk.profile.user.impl.ui.UserProfileFragment, com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ww50<?> Y;
        super.onCreate(bundle);
        Context mo2getContext = mo2getContext();
        Object h = mo2getContext != null ? e3m.h(mo2getContext) : null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            Y.S(this);
        }
        if (bundle != null) {
            finish();
            tn();
        }
    }

    @Override // com.vk.profile.user.impl.ui.UserProfileFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        super.onStop();
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(-1);
    }

    @Override // com.vk.profile.user.impl.ui.UserProfileFragment, com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bwt0.i0(view.findViewById(R.id.touch_outside), new iie(this, 28));
        ImageView imageView = this.u0;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.i0(imageView, new mi10(this, 3));
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.n230
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    int i2 = ModalUserProfileFragment.C0;
                    if (i != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    ModalUserProfileFragment.this.a0();
                    return true;
                }
            });
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(80);
                window.getDecorView().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                fvr.x(window, false);
                TypedValue typedValue = krv0.a;
                krv0.s(dialog.getWindow(), window.getNavigationBarColor());
            }
        }
        ConstraintLayout constraintLayout = this.r0;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar != null) {
            ModalBottomSheetBehavior modalBottomSheetBehavior = new ModalBottomSheetBehavior(new ts90(1.0f, 2), null);
            modalBottomSheetBehavior.b = view;
            fVar.c(modalBottomSheetBehavior);
        }
        final ModalBottomSheetBehavior<View> H = ModalBottomSheetBehavior.H(constraintLayout);
        H.M(true);
        H.D = true;
        H.O(5);
        this.z0 = H;
        ((Handler) this.x0.getValue()).postDelayed(this.A0, 64L);
        final RecyclerView recyclerView = this.w0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xsna.o230
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                int i5 = ModalUserProfileFragment.C0;
                ModalBottomSheetBehavior.this.D = recyclerView.computeVerticalScrollOffset() == 0;
            }
        });
        ConstraintLayout constraintLayout2 = this.s0;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        constraintLayout2.setClipToOutline(true);
        ConstraintLayout constraintLayout3 = this.s0;
        (constraintLayout3 != null ? constraintLayout3 : null).setOutlineProvider((s0w0) this.B0.getValue());
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFullScreenBottomSheetTheme;
    }

    /* compiled from: ModalUserProfileFragment.kt */
    public static final class b extends a {
        public int a;

        public b() {
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
                ModalUserProfileFragment modalUserProfileFragment = ModalUserProfileFragment.this;
                if (i == 3) {
                    ModalBottomSheetBehavior<View> modalBottomSheetBehavior2 = modalUserProfileFragment.z0;
                    if (modalBottomSheetBehavior2 != null) {
                        modalBottomSheetBehavior2.H = new a470();
                    }
                    ModalBottomSheetBehavior<View> modalBottomSheetBehavior3 = modalUserProfileFragment.z0;
                    if (modalBottomSheetBehavior3 != null) {
                        modalBottomSheetBehavior3.N(0, false);
                    }
                    ModalBottomSheetBehavior<View> modalBottomSheetBehavior4 = modalUserProfileFragment.z0;
                    if (modalBottomSheetBehavior4 != null) {
                        modalBottomSheetBehavior4.j = true;
                    }
                } else if ((i == 4 || i == 5) && (i == 5 || ((modalBottomSheetBehavior = modalUserProfileFragment.z0) != null && modalBottomSheetBehavior.j))) {
                    int i3 = ModalUserProfileFragment.C0;
                    modalUserProfileFragment.finish();
                    modalUserProfileFragment.tn();
                }
                this.a = i;
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
        }
    }
}
