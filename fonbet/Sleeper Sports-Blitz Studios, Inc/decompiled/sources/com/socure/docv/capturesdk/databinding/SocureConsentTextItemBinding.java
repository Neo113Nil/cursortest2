package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocureConsentTextItemBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvConsentText;

    private SocureConsentTextItemBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.tvConsentText = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocureConsentTextItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocureConsentTextItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_consent_text_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocureConsentTextItemBinding bind(View view) {
        int i = R.id.tv_consent_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            return new SocureConsentTextItemBinding((ConstraintLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
