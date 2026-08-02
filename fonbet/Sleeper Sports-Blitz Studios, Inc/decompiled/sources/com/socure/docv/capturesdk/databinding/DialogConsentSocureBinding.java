package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.CustomToolbar;

/* loaded from: classes8.dex */
public final class DialogConsentSocureBinding implements ViewBinding {
    public final CustomToolbar clConsentToolbar;
    public final ProgressBar pbWebLoading;
    private final ConstraintLayout rootView;
    public final WebView wvConsentPrivacy;

    private DialogConsentSocureBinding(ConstraintLayout constraintLayout, CustomToolbar customToolbar, ProgressBar progressBar, WebView webView) {
        this.rootView = constraintLayout;
        this.clConsentToolbar = customToolbar;
        this.pbWebLoading = progressBar;
        this.wvConsentPrivacy = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogConsentSocureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogConsentSocureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_consent_socure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogConsentSocureBinding bind(View view) {
        int i = R.id.cl_consent_toolbar;
        CustomToolbar customToolbar = (CustomToolbar) ViewBindings.findChildViewById(view, i);
        if (customToolbar != null) {
            i = R.id.pb_web_loading;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.wv_consent_privacy;
                WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                if (webView != null) {
                    return new DialogConsentSocureBinding((ConstraintLayout) view, customToolbar, progressBar, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
