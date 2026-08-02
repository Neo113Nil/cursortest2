package com.vk.profile.core.content.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.avd0;
import xsna.cvd0;

/* compiled from: ContentErrorView.kt */
/* loaded from: classes5.dex */
public final class ContentErrorView extends LinearLayout {
    public ContentErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.view_profile_content_error, (ViewGroup) this, true);
        setOrientation(1);
    }

    public final avd0 getCallback() {
        return null;
    }

    public final void setCurrentItem(cvd0 cvd0Var) {
        throw null;
    }

    public final void setCallback(avd0 avd0Var) {
    }
}
