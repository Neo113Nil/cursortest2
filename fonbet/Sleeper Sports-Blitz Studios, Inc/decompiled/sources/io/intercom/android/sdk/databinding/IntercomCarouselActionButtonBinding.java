package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

/* loaded from: classes9.dex */
public final class IntercomCarouselActionButtonBinding implements ViewBinding {
    private final TextView rootView;

    private IntercomCarouselActionButtonBinding(TextView textView) {
        this.rootView = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static IntercomCarouselActionButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomCarouselActionButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomCarouselActionButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IntercomCarouselActionButtonBinding((TextView) view);
    }
}
