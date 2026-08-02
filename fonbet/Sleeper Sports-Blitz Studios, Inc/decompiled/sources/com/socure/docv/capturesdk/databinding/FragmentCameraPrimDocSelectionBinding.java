package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.BrandLayout;
import com.socure.docv.capturesdk.common.view.CustomToolbar;

/* loaded from: classes8.dex */
public final class FragmentCameraPrimDocSelectionBinding implements ViewBinding {
    public final BrandLayout brandView;
    public final ConstraintLayout clContainer;
    public final ConstraintLayout clContainerInside;
    public final CustomToolbar clDocSelectionToolbar;
    public final ConstraintLayout cvLicense;
    public final ConstraintLayout cvPassport;
    public final Guideline glTop;
    public final AppCompatImageView imgLicForward;
    public final AppCompatImageView imgPassportForward;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvCameraAccess;
    public final AppCompatTextView tvDocReady;
    public final AppCompatTextView tvDocSubtext;
    public final AppCompatTextView tvDocTitle;
    public final AppCompatTextView tvLicSubText;
    public final AppCompatTextView tvLicTitle;
    public final AppCompatTextView tvPassportSubText;
    public final AppCompatTextView tvPassportTitle;

    private FragmentCameraPrimDocSelectionBinding(ConstraintLayout constraintLayout, BrandLayout brandLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, CustomToolbar customToolbar, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, Guideline guideline, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8) {
        this.rootView = constraintLayout;
        this.brandView = brandLayout;
        this.clContainer = constraintLayout2;
        this.clContainerInside = constraintLayout3;
        this.clDocSelectionToolbar = customToolbar;
        this.cvLicense = constraintLayout4;
        this.cvPassport = constraintLayout5;
        this.glTop = guideline;
        this.imgLicForward = appCompatImageView;
        this.imgPassportForward = appCompatImageView2;
        this.tvCameraAccess = appCompatTextView;
        this.tvDocReady = appCompatTextView2;
        this.tvDocSubtext = appCompatTextView3;
        this.tvDocTitle = appCompatTextView4;
        this.tvLicSubText = appCompatTextView5;
        this.tvLicTitle = appCompatTextView6;
        this.tvPassportSubText = appCompatTextView7;
        this.tvPassportTitle = appCompatTextView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCameraPrimDocSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCameraPrimDocSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_camera_prim_doc_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentCameraPrimDocSelectionBinding bind(View view) {
        int i = R.id.brand_view;
        BrandLayout brandLayout = (BrandLayout) ViewBindings.findChildViewById(view, i);
        if (brandLayout != null) {
            i = R.id.clContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.clContainerInside;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = R.id.cl_doc_selection_Toolbar;
                    CustomToolbar customToolbar = (CustomToolbar) ViewBindings.findChildViewById(view, i);
                    if (customToolbar != null) {
                        i = R.id.cvLicense;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout3 != null) {
                            i = R.id.cvPassport;
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout4 != null) {
                                i = R.id.glTop;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = R.id.imgLicForward;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView != null) {
                                        i = R.id.imgPassportForward;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView2 != null) {
                                            i = R.id.tvCameraAccess;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = R.id.tvDocReady;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = R.id.tvDocSubtext;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView3 != null) {
                                                        i = R.id.tvDocTitle;
                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView4 != null) {
                                                            i = R.id.tvLicSubText;
                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView5 != null) {
                                                                i = R.id.tvLicTitle;
                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView6 != null) {
                                                                    i = R.id.tvPassportSubText;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView7 != null) {
                                                                        i = R.id.tvPassportTitle;
                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView8 != null) {
                                                                            return new FragmentCameraPrimDocSelectionBinding((ConstraintLayout) view, brandLayout, constraintLayout, constraintLayout2, customToolbar, constraintLayout3, constraintLayout4, guideline, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
