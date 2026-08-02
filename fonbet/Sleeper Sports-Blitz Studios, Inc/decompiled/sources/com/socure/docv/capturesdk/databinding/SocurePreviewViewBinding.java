package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout;

/* loaded from: classes8.dex */
public final class SocurePreviewViewBinding implements ViewBinding {
    public final ConstraintLayout clInfoView;
    public final PreviewBottomLayout clPreviewBottom;
    public final ConstraintLayout clPrimaryContent;
    public final CardView cvImageHolder;
    public final FrameLayout flStatus;
    public final Guideline glBottom;
    public final Guideline glLeft;
    public final Guideline glRight;
    public final Guideline glTop;
    public final AppCompatImageView icSaveImages;
    public final AppCompatImageView imgPreview;
    public final AppCompatImageView imgStatusBase;
    public final AppCompatImageView imgStatusStatus;
    public final AppCompatImageView ivDbgPreviewScan;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvConfirmationMsg;
    public final AppCompatTextView tvConfirmationTitle;
    public final AppCompatTextView tvPreviewTitle;

    private SocurePreviewViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, PreviewBottomLayout previewBottomLayout, ConstraintLayout constraintLayout3, CardView cardView, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.clInfoView = constraintLayout2;
        this.clPreviewBottom = previewBottomLayout;
        this.clPrimaryContent = constraintLayout3;
        this.cvImageHolder = cardView;
        this.flStatus = frameLayout;
        this.glBottom = guideline;
        this.glLeft = guideline2;
        this.glRight = guideline3;
        this.glTop = guideline4;
        this.icSaveImages = appCompatImageView;
        this.imgPreview = appCompatImageView2;
        this.imgStatusBase = appCompatImageView3;
        this.imgStatusStatus = appCompatImageView4;
        this.ivDbgPreviewScan = appCompatImageView5;
        this.tvConfirmationMsg = appCompatTextView;
        this.tvConfirmationTitle = appCompatTextView2;
        this.tvPreviewTitle = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocurePreviewViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocurePreviewViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_preview_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocurePreviewViewBinding bind(View view) {
        int i = R.id.cl_info_view;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.cl_preview_bottom;
            PreviewBottomLayout previewBottomLayout = (PreviewBottomLayout) ViewBindings.findChildViewById(view, i);
            if (previewBottomLayout != null) {
                i = R.id.cl_primary_content;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = R.id.cv_image_holder;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.fl_status;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.gl_bottom;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                i = R.id.gl_left;
                                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline2 != null) {
                                    i = R.id.gl_right;
                                    Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline3 != null) {
                                        i = R.id.gl_top;
                                        Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline4 != null) {
                                            i = R.id.ic_save_images;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView != null) {
                                                i = R.id.img_preview;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatImageView2 != null) {
                                                    i = R.id.img_status_base;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatImageView3 != null) {
                                                        i = R.id.img_status_status;
                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatImageView4 != null) {
                                                            i = R.id.iv_dbg_preview_scan;
                                                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatImageView5 != null) {
                                                                i = R.id.tv_confirmation_msg;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView != null) {
                                                                    i = R.id.tv_confirmation_title;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = R.id.tv_preview_title;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView3 != null) {
                                                                            return new SocurePreviewViewBinding((ConstraintLayout) view, constraintLayout, previewBottomLayout, constraintLayout2, cardView, frameLayout, guideline, guideline2, guideline3, guideline4, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatTextView, appCompatTextView2, appCompatTextView3);
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
