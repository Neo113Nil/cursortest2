package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

/* loaded from: classes9.dex */
public final class IntercomBlocksUserLayoutBinding implements ViewBinding {
    private final LinearLayout rootView;

    private IntercomBlocksUserLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomBlocksUserLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomBlocksUserLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_blocks_user_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomBlocksUserLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IntercomBlocksUserLayoutBinding((LinearLayout) view);
    }
}
