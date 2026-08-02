package com.sofascore.results.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ad2;
import defpackage.av;
import defpackage.bv;
import defpackage.c51;
import defpackage.dv;
import defpackage.ke0;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.nv;
import defpackage.p42;
import defpackage.q42;
import defpackage.qv5;
import defpackage.su;
import defpackage.vz1;
import defpackage.wrf;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z0;
import defpackage.z01;
import defpackage.zl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseModalBottomSheetDialog extends BottomSheetDialogFragment {
    public zl q;
    public long s;
    public String u;
    public final mqi r = ypa.b(new z0(this, 23));
    public final su t = new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null);
    public final int v = ke0.b;

    public int A() {
        return 8388611;
    }

    public View B(LayoutInflater layoutInflater) {
        return null;
    }

    public View C(LayoutInflater layoutInflater) {
        return null;
    }

    public abstract View D(LayoutInflater layoutInflater);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.base_modal_bottom_sheet_dialog_layout, viewGroup, false);
        int i = R.id.animation_container;
        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.animation_container, inflate);
        if (frameLayout != null) {
            i = R.id.background;
            ImageView imageView = (ImageView) nq8.B(R.id.background, inflate);
            if (imageView != null) {
                i = R.id.background_down;
                ImageView imageView2 = (ImageView) nq8.B(R.id.background_down, inflate);
                if (imageView2 != null) {
                    i = R.id.background_up;
                    ImageView imageView3 = (ImageView) nq8.B(R.id.background_up, inflate);
                    if (imageView3 != null) {
                        i = R.id.bottom_container;
                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.bottom_container, inflate);
                        if (frameLayout2 != null) {
                            i = R.id.container;
                            if (((LinearLayout) nq8.B(R.id.container, inflate)) != null) {
                                i = R.id.dialog_content_container;
                                FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.dialog_content_container, inflate);
                                if (frameLayout3 != null) {
                                    i = R.id.dialog_header;
                                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.dialog_header, inflate);
                                    if (linearLayout != null) {
                                        i = R.id.dialog_title;
                                        TextView textView = (TextView) nq8.B(R.id.dialog_title, inflate);
                                        if (textView != null) {
                                            i = R.id.dialog_title_container;
                                            FrameLayout frameLayout4 = (FrameLayout) nq8.B(R.id.dialog_title_container, inflate);
                                            if (frameLayout4 != null) {
                                                i = R.id.drag_indicator;
                                                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.drag_indicator, inflate);
                                                if (linearLayout2 != null) {
                                                    i = R.id.drag_indicator_view;
                                                    ImageView imageView4 = (ImageView) nq8.B(R.id.drag_indicator_view, inflate);
                                                    if (imageView4 != null) {
                                                        i = R.id.modal_header_bottom_divider;
                                                        View B = nq8.B(R.id.modal_header_bottom_divider, inflate);
                                                        if (B != null) {
                                                            this.q = new zl((ConstraintLayout) inflate, frameLayout, imageView, imageView2, imageView3, frameLayout2, frameLayout3, linearLayout, textView, frameLayout4, linearLayout2, imageView4, B);
                                                            ((ConstraintLayout) v().b).setClipToOutline(true);
                                                            v().g.setVisibility(z() != null ? 0 : 8);
                                                            String z = z();
                                                            if (z != null) {
                                                                v().g.setGravity(A());
                                                                v().g.setText(z);
                                                            }
                                                            View C = C(layoutInflater);
                                                            if (C != null) {
                                                                ((FrameLayout) v().m).addView(C);
                                                                ((FrameLayout) v().m).setVisibility(0);
                                                            }
                                                            View B2 = B(layoutInflater);
                                                            if (B2 != null) {
                                                                ((FrameLayout) v().k).addView(B2);
                                                                ((FrameLayout) v().k).setVisibility(0);
                                                            }
                                                            ((FrameLayout) v().l).addView(D(layoutInflater));
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) v().b;
                                                            constraintLayout.getClass();
                                                            return constraintLayout;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this instanceof vz1) {
            FragmentActivity requireActivity = requireActivity();
            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
            if (baseActivity != null) {
                baseActivity.z().c(((vz1) this).getX());
            }
            Context requireContext = requireContext();
            requireContext.getClass();
            bv e = ((vz1) this).e();
            if (e != null) {
                nv.k0(requireContext, e, av.CLOSE, dv.POPUP_QUEUE, null, null, 48);
            }
        }
        ad2 ad2Var = qv5.a;
        qv5.a(p42.a);
        FragmentActivity requireActivity2 = requireActivity();
        BaseActivity baseActivity2 = requireActivity2 instanceof BaseActivity ? (BaseActivity) requireActivity2 : null;
        if (baseActivity2 != null) {
            baseActivity2.C = this.u;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        nv.U((BaseActivity) requireActivity, t(), System.currentTimeMillis() - this.s, this.t);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.s = System.currentTimeMillis();
        if (this.u == null) {
            FragmentActivity requireActivity = requireActivity();
            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
            this.u = baseActivity != null ? baseActivity.C : null;
        }
        FragmentActivity requireActivity2 = requireActivity();
        BaseActivity baseActivity2 = requireActivity2 instanceof BaseActivity ? (BaseActivity) requireActivity2 : null;
        if (baseActivity2 != null) {
            baseActivity2.C = t();
        }
        ad2 ad2Var = qv5.a;
        qv5.a(q42.a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        View view2 = (View) parent;
        BottomSheetBehavior C = BottomSheetBehavior.C(view2);
        C.K = true;
        C.J(getW());
        C.M(3);
        if (getW()) {
            FrameLayout frameLayout = (FrameLayout) v().l;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = -2;
            layoutParams2.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            view2.getLayoutParams().height = -1;
        }
        view.setContentDescription(t());
        view.setImportantForAccessibility(2);
    }

    public final void r(NestedScrollView nestedScrollView) {
        nestedScrollView.getClass();
        ((LinearLayout) v().n).setBackgroundColor(requireContext().getColor(R.color.surface_P));
        nestedScrollView.getViewTreeObserver().addOnScrollChangedListener(new z01(1, nestedScrollView, this));
    }

    public final void s(RecyclerView recyclerView) {
        ((LinearLayout) v().n).setBackgroundColor(requireContext().getColor(R.color.surface_P));
        wrf.a(recyclerView, new c51(this, 0));
    }

    public abstract String t();

    /* renamed from: u, reason: from getter */
    public int getV() {
        return this.v;
    }

    public final zl v() {
        zl zlVar = this.q;
        if (zlVar != null) {
            return zlVar;
        }
        Intrinsics.i("baseBinding");
        throw null;
    }

    public final c51 w() {
        ((LinearLayout) v().n).setBackgroundColor(requireContext().getColor(R.color.surface_P));
        return new c51(this, 1);
    }

    /* renamed from: x */
    public boolean getW() {
        return false;
    }

    public final float y() {
        return ((Number) this.r.getValue()).floatValue();
    }

    public abstract String z();

    public void E() {
    }
}
