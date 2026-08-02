package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.BrandLayout;
import com.socure.docv.capturesdk.common.view.CustomToolbar;

/* loaded from: classes8.dex */
public final class FragmentDocSelectionSocureBinding implements ViewBinding {
    public final CardView actionLicId;
    public final CardView actionPassport;
    public final BrandLayout brandView;
    public final AppCompatButton btnLicId;
    public final AppCompatButton btnPassport;
    public final CustomToolbar clDocSelectionToolbar;
    public final Guideline glTop;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvDocTitle;

    private FragmentDocSelectionSocureBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, BrandLayout brandLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, CustomToolbar customToolbar, Guideline guideline, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.actionLicId = cardView;
        this.actionPassport = cardView2;
        this.brandView = brandLayout;
        this.btnLicId = appCompatButton;
        this.btnPassport = appCompatButton2;
        this.clDocSelectionToolbar = customToolbar;
        this.glTop = guideline;
        this.tvDocTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocSelectionSocureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocSelectionSocureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_doc_selection_socure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDocSelectionSocureBinding bind(View view) {
        int i = R.id.action_lic_id;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.action_passport;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.brand_view;
                BrandLayout brandLayout = (BrandLayout) ViewBindings.findChildViewById(view, i);
                if (brandLayout != null) {
                    i = R.id.btn_lic_id;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                    if (appCompatButton != null) {
                        i = R.id.btn_passport;
                        AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                        if (appCompatButton2 != null) {
                            i = R.id.cl_doc_selection_Toolbar;
                            CustomToolbar customToolbar = (CustomToolbar) ViewBindings.findChildViewById(view, i);
                            if (customToolbar != null) {
                                i = R.id.glTop;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = R.id.tvDocTitle;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        return new FragmentDocSelectionSocureBinding((ConstraintLayout) view, cardView, cardView2, brandLayout, appCompatButton, appCompatButton2, customToolbar, guideline, appCompatTextView);
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
