package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocureInfoLayoutBinding implements ViewBinding {
    public final LinearLayout clCameraInfoContainer;
    public final AppCompatImageView imgInfo;
    public final LinearLayout llPrimaryContainer;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvPrimaryInfo;
    public final AppCompatTextView tvSecondaryInfo;

    private SocureInfoLayoutBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.clCameraInfoContainer = linearLayout;
        this.imgInfo = appCompatImageView;
        this.llPrimaryContainer = linearLayout2;
        this.tvPrimaryInfo = appCompatTextView;
        this.tvSecondaryInfo = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocureInfoLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocureInfoLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_info_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocureInfoLayoutBinding bind(View view) {
        int i = R.id.cl_camera_info_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.imgInfo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.ll_primary_container;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.tvPrimaryInfo;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = R.id.tvSecondaryInfo;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            return new SocureInfoLayoutBinding((ConstraintLayout) view, linearLayout, appCompatImageView, linearLayout2, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
