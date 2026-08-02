package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocureScannerBottomLayoutBinding implements ViewBinding {
    public final AppCompatButton btnHelp;
    public final AppCompatImageView btnManual;
    public final ConstraintLayout clManualView;
    private final ConstraintLayout rootView;

    private SocureScannerBottomLayoutBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.btnHelp = appCompatButton;
        this.btnManual = appCompatImageView;
        this.clManualView = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocureScannerBottomLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocureScannerBottomLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_scanner_bottom_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocureScannerBottomLayoutBinding bind(View view) {
        int i = R.id.btn_help;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.btn_manual;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new SocureScannerBottomLayoutBinding(constraintLayout, appCompatButton, appCompatImageView, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
