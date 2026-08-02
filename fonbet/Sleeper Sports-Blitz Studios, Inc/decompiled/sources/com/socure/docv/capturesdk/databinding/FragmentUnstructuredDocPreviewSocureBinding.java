package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.BrandLayout;

/* loaded from: classes8.dex */
public final class FragmentUnstructuredDocPreviewSocureBinding implements ViewBinding {
    public final AppCompatButton btnScanCancel;
    public final AppCompatButton btnUpload;
    public final SocureFileItemBinding fileItem;
    private final ConstraintLayout rootView;
    public final TextView tvDocument;
    public final TextView tvFileName;
    public final BrandLayout tvPoweredBy;

    private FragmentUnstructuredDocPreviewSocureBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, SocureFileItemBinding socureFileItemBinding, TextView textView, TextView textView2, BrandLayout brandLayout) {
        this.rootView = constraintLayout;
        this.btnScanCancel = appCompatButton;
        this.btnUpload = appCompatButton2;
        this.fileItem = socureFileItemBinding;
        this.tvDocument = textView;
        this.tvFileName = textView2;
        this.tvPoweredBy = brandLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUnstructuredDocPreviewSocureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUnstructuredDocPreviewSocureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_unstructured_doc_preview_socure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentUnstructuredDocPreviewSocureBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btnScanCancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.btnUpload;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.fileItem))) != null) {
                SocureFileItemBinding bind = SocureFileItemBinding.bind(findChildViewById);
                i = R.id.tvDocument;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvFileName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tvPoweredBy;
                        BrandLayout brandLayout = (BrandLayout) ViewBindings.findChildViewById(view, i);
                        if (brandLayout != null) {
                            return new FragmentUnstructuredDocPreviewSocureBinding((ConstraintLayout) view, appCompatButton, appCompatButton2, bind, textView, textView2, brandLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
