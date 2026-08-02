package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class OrchestratorActivitySocureBinding implements ViewBinding {
    public final FragmentContainerView fragmentContainerView;
    public final CircularProgressIndicator progressIndicator;
    private final CoordinatorLayout rootView;
    public final View uploadBlockerView;
    public final ConstraintLayout viewUploadLoader;

    private OrchestratorActivitySocureBinding(CoordinatorLayout coordinatorLayout, FragmentContainerView fragmentContainerView, CircularProgressIndicator circularProgressIndicator, View view, ConstraintLayout constraintLayout) {
        this.rootView = coordinatorLayout;
        this.fragmentContainerView = fragmentContainerView;
        this.progressIndicator = circularProgressIndicator;
        this.uploadBlockerView = view;
        this.viewUploadLoader = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static OrchestratorActivitySocureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OrchestratorActivitySocureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.orchestrator_activity_socure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static OrchestratorActivitySocureBinding bind(View view) {
        View findChildViewById;
        int i = R.id.fragmentContainerView;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = R.id.progress_indicator;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
            if (circularProgressIndicator != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.upload_blocker_view))) != null) {
                i = R.id.view_upload_loader;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    return new OrchestratorActivitySocureBinding((CoordinatorLayout) view, fragmentContainerView, circularProgressIndicator, findChildViewById, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
