package com.vk.clips.tool.view.viewer.feed.wrapper.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import xsna.o0q0;

/* compiled from: FragmentContainerFrameLayout.kt */
/* loaded from: classes17.dex */
public final class FragmentContainerFrameLayout extends FrameLayout implements o0q0 {
    public FragmentManager b;

    public FragmentContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // xsna.o0q0
    public Fragment getUiTrackingFragment() {
        FragmentManager fragmentManager = this.b;
        if (fragmentManager != null) {
            return fragmentManager.G(getId());
        }
        return null;
    }
}
