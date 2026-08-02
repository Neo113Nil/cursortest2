package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

/* loaded from: classes9.dex */
public final class IntercomNotificationPillBinding implements ViewBinding {
    public final TextView notificationPill;
    private final TextView rootView;

    private IntercomNotificationPillBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.notificationPill = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_notification_pill, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomNotificationPillBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new IntercomNotificationPillBinding(textView, textView);
    }
}
