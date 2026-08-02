package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocureDocOverlayViewBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final View vwGuideBox;

    private SocureDocOverlayViewBinding(ConstraintLayout constraintLayout, View view) {
        this.rootView = constraintLayout;
        this.vwGuideBox = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocureDocOverlayViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocureDocOverlayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_doc_overlay_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocureDocOverlayViewBinding bind(View view) {
        int i = R.id.vwGuideBox;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new SocureDocOverlayViewBinding((ConstraintLayout) view, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
