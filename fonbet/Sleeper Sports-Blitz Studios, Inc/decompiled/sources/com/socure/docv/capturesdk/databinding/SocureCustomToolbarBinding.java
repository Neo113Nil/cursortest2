package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocureCustomToolbarBinding implements ViewBinding {
    public final AppCompatImageView btnBack;
    public final AppCompatImageView btnClose;
    public final ConstraintLayout clToolbarView;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvInfoTitle;

    private SocureCustomToolbarBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.btnBack = appCompatImageView;
        this.btnClose = appCompatImageView2;
        this.clToolbarView = constraintLayout2;
        this.tvInfoTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocureCustomToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocureCustomToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_custom_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocureCustomToolbarBinding bind(View view) {
        int i = R.id.btnBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.btnClose;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tvInfoTitle;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new SocureCustomToolbarBinding(constraintLayout, appCompatImageView, appCompatImageView2, constraintLayout, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
