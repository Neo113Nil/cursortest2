package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.BrandLayout;

/* loaded from: classes8.dex */
public final class FragmentConsentSocureBinding implements ViewBinding {
    public final BrandLayout brandView;
    public final AppCompatButton btnAgree;
    public final AppCompatButton btnDecline;
    public final ConstraintLayout clProgressView;
    public final ConstraintLayout consentBottom;
    public final Guideline glTop;
    public final AppCompatImageView imgBrandLogo;
    public final ProgressBar pbConsentCall;
    private final ConstraintLayout rootView;
    public final RecyclerView rvContents;
    public final AppCompatTextView tvConsentHeader;

    private FragmentConsentSocureBinding(ConstraintLayout constraintLayout, BrandLayout brandLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, Guideline guideline, AppCompatImageView appCompatImageView, ProgressBar progressBar, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.brandView = brandLayout;
        this.btnAgree = appCompatButton;
        this.btnDecline = appCompatButton2;
        this.clProgressView = constraintLayout2;
        this.consentBottom = constraintLayout3;
        this.glTop = guideline;
        this.imgBrandLogo = appCompatImageView;
        this.pbConsentCall = progressBar;
        this.rvContents = recyclerView;
        this.tvConsentHeader = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentConsentSocureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentConsentSocureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_consent_socure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentConsentSocureBinding bind(View view) {
        int i = R.id.brand_view;
        BrandLayout brandLayout = (BrandLayout) ViewBindings.findChildViewById(view, i);
        if (brandLayout != null) {
            i = R.id.btn_agree;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton != null) {
                i = R.id.btn_decline;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                if (appCompatButton2 != null) {
                    i = R.id.cl_progress_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.consent_bottom;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = R.id.gl_top;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                i = R.id.img_brand_logo;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = R.id.pb_consent_call;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                    if (progressBar != null) {
                                        i = R.id.rv_contents;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = R.id.tv_consent_header;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                return new FragmentConsentSocureBinding((ConstraintLayout) view, brandLayout, appCompatButton, appCompatButton2, constraintLayout, constraintLayout2, guideline, appCompatImageView, progressBar, recyclerView, appCompatTextView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
