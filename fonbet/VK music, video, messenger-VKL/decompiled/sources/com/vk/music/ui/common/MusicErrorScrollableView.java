package com.vk.music.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import xsna.uj40;

/* compiled from: MusicErrorScrollableView.kt */
/* loaded from: classes3.dex */
public final class MusicErrorScrollableView extends uj40 {
    public final AttributeSet e;

    public MusicErrorScrollableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // xsna.uj40
    public final void c(ViewGroup viewGroup) {
        ScrollView scrollView = new ScrollView(getContext(), this.e);
        super.c(scrollView);
        addView(scrollView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public MusicErrorScrollableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.e = attributeSet;
    }
}
