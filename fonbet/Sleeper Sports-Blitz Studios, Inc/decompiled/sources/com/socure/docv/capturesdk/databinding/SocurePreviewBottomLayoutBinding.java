package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocurePreviewBottomLayoutBinding implements ViewBinding {
    public final AppCompatButton btnContinue;
    public final AppCompatButton btnRetake;
    public final ConstraintLayout clConfirmation;
    public final CardView clProgressAnimationView;
    public final ConstraintLayout clProgressView;
    public final ProgressBar pgVerifying;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvProgress;

    private SocurePreviewBottomLayoutBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, ConstraintLayout constraintLayout2, CardView cardView, ConstraintLayout constraintLayout3, ProgressBar progressBar, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.btnContinue = appCompatButton;
        this.btnRetake = appCompatButton2;
        this.clConfirmation = constraintLayout2;
        this.clProgressAnimationView = cardView;
        this.clProgressView = constraintLayout3;
        this.pgVerifying = progressBar;
        this.tvProgress = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocurePreviewBottomLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocurePreviewBottomLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_preview_bottom_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocurePreviewBottomLayoutBinding bind(View view) {
        int i = R.id.btn_continue;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.btn_retake;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton2 != null) {
                i = R.id.cl_confirmation;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.cl_progress_animation_view;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.cl_progress_view;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = R.id.pg_verifying;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                            if (progressBar != null) {
                                i = R.id.tv_progress;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    return new SocurePreviewBottomLayoutBinding((ConstraintLayout) view, appCompatButton, appCompatButton2, constraintLayout, cardView, constraintLayout2, progressBar, appCompatTextView);
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
