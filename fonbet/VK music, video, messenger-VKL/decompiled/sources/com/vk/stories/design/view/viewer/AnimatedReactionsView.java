package com.vk.stories.design.view.viewer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: AnimatedReactionsView.kt */
/* loaded from: classes6.dex */
public final class AnimatedReactionsView extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final long b;
    public final float c;
    public final float d;

    public AnimatedReactionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 1500L;
        this.c = 0.4f;
        this.d = 1.0f;
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void setOnScreenMaxReactionCount(int i) {
    }
}
