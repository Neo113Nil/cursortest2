package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocureHelpViewBinding implements ViewBinding {
    public final AppCompatButton btnContinue;
    public final ConstraintLayout clInstrucRoot;
    public final Guideline glBottom;
    public final Guideline glEnd;
    public final Guideline glStart;
    public final Guideline glTop;
    public final AppCompatImageView helpImageView;
    private final ConstraintLayout rootView;
    public final RecyclerView rvInstructions;
    public final AppCompatTextView tvPreviewTitle;

    private SocureHelpViewBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.btnContinue = appCompatButton;
        this.clInstrucRoot = constraintLayout2;
        this.glBottom = guideline;
        this.glEnd = guideline2;
        this.glStart = guideline3;
        this.glTop = guideline4;
        this.helpImageView = appCompatImageView;
        this.rvInstructions = recyclerView;
        this.tvPreviewTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocureHelpViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocureHelpViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_help_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocureHelpViewBinding bind(View view) {
        int i = R.id.btn_continue;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.gl_bottom;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.gl_end;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline2 != null) {
                    i = R.id.gl_start;
                    Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline3 != null) {
                        i = R.id.gl_top;
                        Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline4 != null) {
                            i = R.id.help_image_view;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                i = R.id.rv_instructions;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.tv_preview_title;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        return new SocureHelpViewBinding(constraintLayout, appCompatButton, constraintLayout, guideline, guideline2, guideline3, guideline4, appCompatImageView, recyclerView, appCompatTextView);
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
