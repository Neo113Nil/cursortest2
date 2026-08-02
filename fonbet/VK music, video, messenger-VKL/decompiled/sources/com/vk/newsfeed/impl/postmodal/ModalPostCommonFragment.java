package com.vk.newsfeed.impl.postmodal;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.newsfeed.impl.comments.modal.ModalCommentsBottomSheetBehavior;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.acv;
import xsna.awt0;
import xsna.b0u0;
import xsna.bih;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e88;
import xsna.ek;
import xsna.ey50;
import xsna.f4m;
import xsna.fcn;
import xsna.fnj;
import xsna.g88;
import xsna.gmj;
import xsna.iah0;
import xsna.ify;
import xsna.iut0;
import xsna.krv0;
import xsna.kyc;
import xsna.msy;
import xsna.ojf0;
import xsna.p90;
import xsna.pnv;
import xsna.s030;
import xsna.s200;
import xsna.t030;
import xsna.tk5;
import xsna.too0;
import xsna.ts90;
import xsna.u030;
import xsna.u11;
import xsna.u3g0;
import xsna.ux3;
import xsna.ww50;
import xsna.wzh;
import xsna.x52;
import xsna.z3g0;

/* compiled from: ModalPostCommonFragment.kt */
/* loaded from: classes4.dex */
public final class ModalPostCommonFragment extends BaseFragment implements fcn, e88, too0, pnv {
    public static final int a0 = iah0.a(16);
    public u030 S;
    public ModalBottomSheetBehavior<View> T;
    public View U;
    public final Rect V = new Rect();
    public final Handler W = new Handler(Looper.getMainLooper());
    public final Object X = msy.a(LazyThreadSafetyMode.NONE, new ek(17));
    public final b Y = new b();
    public final c Z = new c();

    /* compiled from: ModalPostCommonFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModalPostDestination.values().length];
            try {
                iArr[ModalPostDestination.REACTIONS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModalPostDestination.REACTIONS_DONATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ModalPostCommonFragment.kt */
    public static final class b implements ify.a {
        public b() {
        }

        @Override // xsna.ify.a
        public final void Y0() {
            ModalPostCommonFragment modalPostCommonFragment = ModalPostCommonFragment.this;
            modalPostCommonFragment.W.postDelayed(new kyc(modalPostCommonFragment, 3), 64L);
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            ModalPostCommonFragment modalPostCommonFragment = ModalPostCommonFragment.this;
            modalPostCommonFragment.W.postDelayed(new ux3(modalPostCommonFragment, 6), 64L);
        }
    }

    /* compiled from: ModalPostCommonFragment.kt */
    public static final class c implements u3g0.g {
        public c() {
        }

        @Override // xsna.u3g0.g
        public final void a() {
            ModalPostCommonFragment modalPostCommonFragment = ModalPostCommonFragment.this;
            modalPostCommonFragment.W.postDelayed(new x52(modalPostCommonFragment, 7), 64L);
        }

        @Override // xsna.u3g0.g
        public final void b() {
            ModalPostCommonFragment modalPostCommonFragment = ModalPostCommonFragment.this;
            ModalPostCommonFragment.io(modalPostCommonFragment);
            View view = modalPostCommonFragment.U;
            ModalBottomSheetBehavior H = view != null ? ModalBottomSheetBehavior.H(view) : null;
            if (H != null) {
                H.E = true;
                H.F = true;
            }
            View view2 = modalPostCommonFragment.U;
            ModalBottomSheetBehavior H2 = view2 != null ? ModalBottomSheetBehavior.H(view2) : null;
            if (H2 != null) {
                H2.O(3);
            }
        }
    }

    public static final void io(ModalPostCommonFragment modalPostCommonFragment) {
        Rect rect = modalPostCommonFragment.V;
        View view = modalPostCommonFragment.U;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        f lo = modalPostCommonFragment.lo();
        g88 g88Var = lo instanceof g88 ? (g88) lo : null;
        if (g88Var != null) {
            g88Var.jf(rect.height());
        }
    }

    @Override // xsna.pnv
    public final Rect C8() {
        return this.V;
    }

    @Override // xsna.pnv
    public final void D() {
        jo(true, ModalPostDestination.REACTIONS_DONATS);
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
        View view = getView();
        if (view != null) {
            dhr0.W(view);
        }
        Dialog dialog = this.s;
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            TypedValue typedValue = krv0.a;
            krv0.s(window, dhr0.t.c(R.attr.vk_ui_background_modal));
        }
        CommentsOutherFragment ko = ko();
        if (ko != null) {
            z3g0 z3g0Var = ko.S;
            u3g0 u3g0Var = z3g0Var.d;
            CommentsOutherFragment commentsOutherFragment = z3g0Var.b;
            ViewGroup viewGroup = commentsOutherFragment != null ? commentsOutherFragment.V : null;
            if (u3g0Var == null || viewGroup == null) {
                return;
            }
            ojf0 ojf0Var = new ojf0(0, dhr0.M(), 102);
            WriteBar writeBar = u3g0Var.e;
            if (writeBar != null) {
                writeBar.setBottomSheetParams(ojf0Var);
            }
            WriteBar writeBar2 = u3g0Var.e;
            if (writeBar2 != null) {
                writeBar2.setUpdateBottomSheet(true);
            }
            u3g0Var.u(viewGroup);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if ((lo() instanceof ModalPostReactionsFragment) && mo() == ModalPostDestination.COMMENTS) {
            getChildFragmentManager().W();
            return true;
        }
        no();
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
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        FragmentActivity activity = getActivity();
        ComponentCallbacks2 h = activity != null ? e3m.h(activity) : null;
        if (h instanceof ey50) {
            ((ey50) h).Y().H(this);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return getActivity();
    }

    public final void jo(boolean z, ModalPostDestination modalPostDestination) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        Bundle bundle = new Bundle(arguments);
        bundle.putBoolean("key_display_back_button", z);
        if (modalPostDestination != null) {
            bundle.putInt("ModalPostCommonFragment.destination", modalPostDestination.ordinal());
        }
        FragmentImpl f = new ModalPostReactionsFragment.a(ModalPostReactionsFragment.class, null, bundle).f();
        CommentsOutherFragment ko = ko();
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a b2 = tk5.b(childFragmentManager, childFragmentManager);
        b2.r = true;
        b2.d(null);
        if (ko != null) {
            b2.p(ko);
        }
        b2.f(R.id.modal_post_common_fragment_container, f, "tag_modal_post_reactions_fragment", 1);
        b2.k(true);
    }

    public final CommentsOutherFragment ko() {
        FragmentImpl lo = lo();
        if (lo instanceof CommentsOutherFragment) {
            return (CommentsOutherFragment) lo;
        }
        return null;
    }

    public final FragmentImpl lo() {
        Object obj;
        if (getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
            Iterator<T> it = getChildFragmentManager().c.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Fragment) obj).isVisible()) {
                    break;
                }
            }
            if (obj instanceof FragmentImpl) {
                return (FragmentImpl) obj;
            }
        }
        return null;
    }

    public final ModalPostDestination mo() {
        Bundle arguments = getArguments();
        Object obj = null;
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("ModalPostCommonFragment.destination", ModalPostDestination.COMMENTS.ordinal())) : null;
        Iterator<E> it = ModalPostDestination.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int ordinal = ((ModalPostDestination) next).ordinal();
            if (valueOf != null && ordinal == valueOf.intValue()) {
                obj = next;
                break;
            }
        }
        ModalPostDestination modalPostDestination = (ModalPostDestination) obj;
        return modalPostDestination == null ? ModalPostDestination.COMMENTS : modalPostDestination;
    }

    public final void no() {
        u3g0 u3g0Var;
        u030 u030Var;
        u3g0 u3g0Var2;
        u3g0 u3g0Var3;
        u3g0 u3g0Var4;
        CommentsOutherFragment ko = ko();
        if (ko != null && (u3g0Var3 = ko.S.d) != null && u3g0Var3.m()) {
            CommentsOutherFragment ko2 = ko();
            if (ko2 == null || (u3g0Var4 = ko2.S.d) == null) {
                return;
            }
            u3g0Var4.Ic(true);
            return;
        }
        ModalBottomSheetBehavior<View> modalBottomSheetBehavior = this.T;
        if (modalBottomSheetBehavior == null || modalBottomSheetBehavior.k != 2) {
            if (modalBottomSheetBehavior == null || modalBottomSheetBehavior.k != 5) {
                View view = this.U;
                ModalBottomSheetBehavior H = view != null ? ModalBottomSheetBehavior.H(view) : null;
                if (H != null) {
                    H.O(5);
                }
                CommentsOutherFragment ko3 = ko();
                if (ko3 == null || (u3g0Var = ko3.S.d) == null) {
                    return;
                }
                u3g0Var.j(true);
                return;
            }
            CommentsOutherFragment ko4 = ko();
            if (ko4 != null && (u3g0Var2 = ko4.S.d) != null) {
                u3g0Var2.j(true);
            }
            View view2 = this.U;
            if (view2 == null || (u030Var = this.S) == null) {
                return;
            }
            u030Var.d(view2, 5, true);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        CommentsOutherFragment ko;
        super.onActivityResult(i, i2, intent);
        if (i <= 10000 || (ko = ko()) == null) {
            return;
        }
        ko.onActivityResult(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Size size = new Size(iah0.r(requireContext()) ? iah0.a(360) : -1, -1);
        View view = this.U;
        if (view != null) {
            bwt0.n0(view, size);
            f4m.m(81, view);
            view.requestLayout();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ww50 v;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (v = s200.v(activity)) != null) {
            v.S(this);
        }
        if (bundle != null) {
            finish();
            FragmentActivity activity2 = getActivity();
            if (activity2 == null || p90.e(activity2) || isDetached()) {
                return;
            }
            tn();
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_modal_post_common_view, viewGroup, false);
        bwt0.i0(inflate.findViewById(R.id.modal_post_common_background), new gmj(this, 24));
        Dialog dialog = this.s;
        int i = 1;
        if (dialog != null) {
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.r030
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    int i3 = ModalPostCommonFragment.a0;
                    if (i2 != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    ModalPostCommonFragment.this.a0();
                    return true;
                }
            });
            Window window = dialog.getWindow();
            if (window != null) {
                window.clearFlags(2);
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
                window.setLayout(-1, -1);
                window.setSoftInputMode(16);
                window.setGravity(80);
                u11.h(-1, -1, window.getDecorView());
                window.setBackgroundDrawable((ColorDrawable) this.X.getValue());
                TypedValue typedValue = krv0.a;
                krv0.s(window, dhr0.t.c(R.attr.vk_ui_background_modal));
                View decorView = window.getDecorView();
                s030 s030Var = new s030();
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                iut0.d.c(decorView, s030Var);
            }
        }
        View findViewById = inflate.findViewById(R.id.modal_post_common_content_container);
        if (findViewById != null) {
            this.U = findViewById;
            f4m.m(81, findViewById);
            findViewById.setOnApplyWindowInsetsListener(new t030());
            bwt0.d(findViewById, iah0.b(12.0f), (r4 & 2) != 0, (r4 & 4) != 0);
            bwt0.n0(findViewById, new Size(iah0.r(requireContext()) ? iah0.a(360) : -1, -1));
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            if (fVar != null) {
                ModalCommentsBottomSheetBehavior modalCommentsBottomSheetBehavior = new ModalCommentsBottomSheetBehavior(new ts90(0.75f, 2), null);
                modalCommentsBottomSheetBehavior.b = inflate;
                fVar.c(modalCommentsBottomSheetBehavior);
            }
            ModalBottomSheetBehavior<View> H = ModalBottomSheetBehavior.H(findViewById);
            H.M(true);
            H.O(5);
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                u030 u030Var = new u030(this, H);
                this.S = u030Var;
                H.u = u030Var;
            }
            this.T = H;
        }
        if (fnj.d(kn())) {
            awt0.t(inflate, new acv(inflate, i));
        }
        int i2 = a.$EnumSwitchMapping$0[mo().ordinal()];
        if (i2 == 1 || i2 == 2) {
            jo(false, null);
            return inflate;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return inflate;
        }
        CommentsOutherFragment commentsOutherFragment = (CommentsOutherFragment) new CommentsOutherFragment.a(CommentsOutherFragment.class, null, new Bundle(arguments)).f();
        z3g0 z3g0Var = commentsOutherFragment.S;
        c cVar = this.Z;
        z3g0Var.e = cVar;
        u3g0 u3g0Var = z3g0Var.d;
        if (u3g0Var != null) {
            u3g0Var.l = cVar;
        }
        z3g0Var.c = new wzh(this, 22);
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a b2 = tk5.b(childFragmentManager, childFragmentManager);
        b2.r = true;
        b2.g(R.id.modal_post_common_fragment_container, commentsOutherFragment, "tag_outher_fragment_comments");
        b2.k(true);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.W.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        UiTracker uiTracker = UiTracker.a;
        UiTracker.i.g();
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = ify.a;
        ify.a(this.Y);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        int i = ify.a;
        ify.g(this.Y);
        super.onStop();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        CommentsOutherFragment ko = ko();
        if (ko != null) {
            z3g0 z3g0Var = ko.S;
            c cVar = this.Z;
            z3g0Var.e = cVar;
            u3g0 u3g0Var = z3g0Var.d;
            if (u3g0Var != null) {
                u3g0Var.l = cVar;
            }
            z3g0Var.c = new bih(ko, 28);
        }
    }

    @Override // xsna.pnv
    public final void q6() {
        jo(true, null);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFullScreenBottomSheetTheme_NoAnim;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Yn() {
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Zn() {
    }
}
