package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.BrandLayout;
import com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView;
import com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView;

/* loaded from: classes8.dex */
public final class BottomSheetViewBinding implements ViewBinding {
    public final BrandLayout bsBrandView;
    public final ConstraintLayout contentArea;
    public final HelpView helpView;
    public final PreviewView previewView;
    public final ConstraintLayout rootBottomSheet;
    private final ConstraintLayout rootView;
    public final View viewPadding;

    private BottomSheetViewBinding(ConstraintLayout constraintLayout, BrandLayout brandLayout, ConstraintLayout constraintLayout2, HelpView helpView, PreviewView previewView, ConstraintLayout constraintLayout3, View view) {
        this.rootView = constraintLayout;
        this.bsBrandView = brandLayout;
        this.contentArea = constraintLayout2;
        this.helpView = helpView;
        this.previewView = previewView;
        this.rootBottomSheet = constraintLayout3;
        this.viewPadding = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BottomSheetViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BottomSheetViewBinding bind(View view) {
        int i = R.id.bs_brand_view;
        BrandLayout brandLayout = (BrandLayout) ViewBindings.findChildViewById(view, i);
        if (brandLayout != null) {
            i = R.id.content_area;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.help_view;
                HelpView helpView = (HelpView) ViewBindings.findChildViewById(view, i);
                if (helpView != null) {
                    i = R.id.preview_view;
                    PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
                    if (previewView != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        i = R.id.view_padding;
                        View findChildViewById = ViewBindings.findChildViewById(view, i);
                        if (findChildViewById != null) {
                            return new BottomSheetViewBinding(constraintLayout2, brandLayout, constraintLayout, helpView, previewView, constraintLayout2, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
