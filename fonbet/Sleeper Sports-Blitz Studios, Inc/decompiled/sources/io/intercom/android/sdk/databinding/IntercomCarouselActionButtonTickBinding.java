package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

/* loaded from: classes9.dex */
public final class IntercomCarouselActionButtonTickBinding implements ViewBinding {
    private final ImageView rootView;

    private IntercomCarouselActionButtonTickBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }

    public static IntercomCarouselActionButtonTickBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomCarouselActionButtonTickBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button_tick, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomCarouselActionButtonTickBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IntercomCarouselActionButtonTickBinding((ImageView) view);
    }
}
