package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class FragmentTransitionBinding implements ViewBinding {
    private final FrameLayout rootView;

    private FragmentTransitionBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransitionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransitionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_transition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTransitionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentTransitionBinding((FrameLayout) view);
    }
}
