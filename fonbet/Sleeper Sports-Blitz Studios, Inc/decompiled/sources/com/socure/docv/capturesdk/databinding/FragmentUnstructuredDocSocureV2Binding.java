package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class FragmentUnstructuredDocSocureV2Binding implements ViewBinding {
    private final FrameLayout rootView;

    private FragmentUnstructuredDocSocureV2Binding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUnstructuredDocSocureV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUnstructuredDocSocureV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_unstructured_doc_socure_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentUnstructuredDocSocureV2Binding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentUnstructuredDocSocureV2Binding((FrameLayout) view);
    }
}
