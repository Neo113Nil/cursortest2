package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.BrandLayout;

/* loaded from: classes8.dex */
public final class FragmentUnstructuredDocSocureBinding implements ViewBinding {
    public final AppCompatButton btnScanDocument;
    public final AppCompatButton btnUpload;
    public final ImageView ivDocumentIcon;
    private final ConstraintLayout rootView;
    public final TextView tvDocument;
    public final TextView tvDocumentsCollected;
    public final TextView tvPhotoUpload;
    public final BrandLayout tvPoweredBy;
    public final TextView tvSelectMethod;

    private FragmentUnstructuredDocSocureBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, BrandLayout brandLayout, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnScanDocument = appCompatButton;
        this.btnUpload = appCompatButton2;
        this.ivDocumentIcon = imageView;
        this.tvDocument = textView;
        this.tvDocumentsCollected = textView2;
        this.tvPhotoUpload = textView3;
        this.tvPoweredBy = brandLayout;
        this.tvSelectMethod = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUnstructuredDocSocureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUnstructuredDocSocureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_unstructured_doc_socure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentUnstructuredDocSocureBinding bind(View view) {
        int i = R.id.btnScanDocument;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.btnUpload;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton2 != null) {
                i = R.id.ivDocumentIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.tvDocument;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tvDocumentsCollected;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tvPhotoUpload;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tvPoweredBy;
                                BrandLayout brandLayout = (BrandLayout) ViewBindings.findChildViewById(view, i);
                                if (brandLayout != null) {
                                    i = R.id.tvSelectMethod;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new FragmentUnstructuredDocSocureBinding((ConstraintLayout) view, appCompatButton, appCompatButton2, imageView, textView, textView2, textView3, brandLayout, textView4);
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
