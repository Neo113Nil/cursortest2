package com.vk.feature.uxpolls.modalpoll;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.feature.uxpolls.modalpoll.BaseModalFragment;
import com.vk.feature.uxpolls.modalpoll.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.uxpolls.presentation.js.model.UxPollsTheme;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vkontakte.android.R;
import xsna.ao50;
import xsna.bi6;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dub0;
import xsna.fsk;
import xsna.gm50;
import xsna.jaa0;
import xsna.km50;
import xsna.krv0;
import xsna.m2l0;
import xsna.mk50;
import xsna.o25;
import xsna.p870;
import xsna.pcb;
import xsna.r6i0;
import xsna.ts90;
import xsna.v49;
import xsna.vk50;
import xsna.w8i;
import xsna.wk;
import xsna.xn50;

/* compiled from: UxPollsModalFragment.kt */
/* loaded from: classes18.dex */
public final class UxPollsModalFragment extends BaseModalFragment<b, g, a> implements dub0, w8i {
    public static final /* synthetic */ int f0 = 0;
    public final bpn0 W = new bpn0(new jaa0(this, 26));
    public PollsWebView X;
    public ConstraintLayout Y;
    public ImageView Z;
    public ConstraintLayout a0;
    public TextView b0;
    public TextView c0;
    public ProgressBar d0;
    public TextView e0;

    @Override // xsna.dub0
    public final void A9() {
        xn50.a.c(this, a.b.b);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_ux_polls_modal);
    }

    @Override // xsna.dub0
    public final void Gk() {
        xn50.a.c(this, a.e.b);
    }

    @Override // xsna.dub0
    public final void J6(Throwable th) {
        xn50.a.c(this, new a.c(th));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((g) ao50Var).a, new m2l0(this, 12));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((b) vk50Var).g.a(new bi6(1, this, UxPollsModalFragment.class, "handleSideEffect", "handleSideEffect(Lcom/vk/feature/uxpolls/modalpoll/UxPollsSideEffect;)V", 0, 12), this);
    }

    @Override // com.vk.feature.uxpolls.modalpoll.BaseModalFragment, com.vk.core.fragments.FragmentImpl
    public final void close() {
        xn50.a.c(this, a.C1026a.b);
        super.close();
    }

    @Override // xsna.dub0
    public final void i1() {
        xn50.a.c(this, a.h.b);
    }

    @Override // xsna.dub0
    public final void on() {
        xn50.a.c(this, a.d.b);
    }

    @Override // com.vk.feature.uxpolls.modalpoll.BaseModalFragment, com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            ((Handler) this.Q.getValue()).postDelayed(new wk(this, 19), 100L);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        PollsWebView pollsWebView = this.X;
        if (pollsWebView == null) {
            pollsWebView = null;
        }
        pollsWebView.setPollsListener(null);
    }

    @Override // com.vk.feature.uxpolls.modalpoll.BaseModalFragment, com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Y = (ConstraintLayout) view.findViewById(R.id.polls_content);
        this.X = (PollsWebView) view.findViewById(R.id.polls);
        this.Z = (ImageView) view.findViewById(R.id.iv_close);
        this.a0 = (ConstraintLayout) view.findViewById(R.id.error_container);
        this.b0 = (TextView) view.findViewById(R.id.tv_error_title);
        this.c0 = (TextView) view.findViewById(R.id.tv_error_subtitle);
        this.d0 = (ProgressBar) view.findViewById(R.id.progress);
        this.e0 = (TextView) view.findViewById(R.id.tv_title);
        ConstraintLayout constraintLayout = this.Y;
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
        ModalBottomSheetBehavior<View> H = ModalBottomSheetBehavior.H(constraintLayout);
        H.M(true);
        H.D = true;
        H.O(5);
        this.S = H;
        ((Handler) this.Q.getValue()).postDelayed(this.T, 64L);
        ImageView imageView = this.Z;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.i0(imageView, new r6i0(this, 13));
        ConstraintLayout constraintLayout2 = this.Y;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        constraintLayout2.setClipToOutline(true);
        ConstraintLayout constraintLayout3 = this.Y;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        constraintLayout3.setOutlineProvider((BaseModalFragment.b) this.U.getValue());
        if (o25.b(o25.a())) {
            TextView textView = this.e0;
            if (textView == null) {
                textView = null;
            }
            textView.setText(R.string.ux_polls_sferum_modal_title);
        }
        UxPollsTheme uxPollsTheme = dhr0.M() ? UxPollsTheme.DARK : UxPollsTheme.LIGHT;
        PollsWebView pollsWebView = this.X;
        if (pollsWebView == null) {
            pollsWebView = null;
        }
        pollsWebView.f(uxPollsTheme);
        ConstraintLayout constraintLayout4 = this.Y;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        constraintLayout4.setBackgroundColor(krv0.l(R.attr.vk_legacy_header_background));
        ImageView imageView2 = this.Z;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setColorFilter(krv0.l(R.attr.vk_ui_icon_accent_themed));
        TextView textView2 = this.e0;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(krv0.l(R.attr.vk_legacy_text_primary));
        Dialog dialog = this.s;
        dhr0.t0(dialog != null ? dialog.getWindow() : null, 0);
        PollsWebView pollsWebView2 = this.X;
        (pollsWebView2 != null ? pollsWebView2 : null).setPollsListener(this);
        xn50.a.c(this, a.f.b);
        Dialog dialog2 = this.s;
        if (dialog2 != null) {
            dialog2.setOnShowListener(new pcb(this, 3));
        }
    }

    @Override // xsna.dub0
    public final void v9(int i) {
        xn50.a.c(this, new a.g(i));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b(new d(new f(0)), new v49(p870.f(), fsk.c));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.UXPOLL_MODAL;
    }
}
