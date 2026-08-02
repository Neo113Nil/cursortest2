package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class SocureConsentCheckboxItemBinding implements ViewBinding {
    public final AppCompatCheckBox cbConsent;
    private final ConstraintLayout rootView;

    private SocureConsentCheckboxItemBinding(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox) {
        this.rootView = constraintLayout;
        this.cbConsent = appCompatCheckBox;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SocureConsentCheckboxItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SocureConsentCheckboxItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.socure_consent_checkbox_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SocureConsentCheckboxItemBinding bind(View view) {
        int i = R.id.cb_consent;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i);
        if (appCompatCheckBox != null) {
            return new SocureConsentCheckboxItemBinding((ConstraintLayout) view, appCompatCheckBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
