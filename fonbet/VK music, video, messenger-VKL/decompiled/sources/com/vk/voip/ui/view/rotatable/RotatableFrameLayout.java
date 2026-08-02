package com.vk.voip.ui.view.rotatable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.voip.ui.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a000;
import xsna.tmg0;
import xsna.zzz;

/* compiled from: RotatableFrameLayout.kt */
/* loaded from: classes7.dex */
public final class RotatableFrameLayout extends FrameLayout implements tmg0 {
    public final zzz b;
    public final EmptyList c;
    public final List<RotatableFrameLayout> d;

    public RotatableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c.b.getClass();
        this.b = (a000) c.T().a;
        this.c = EmptyList.b;
        this.d = Collections.singletonList(this);
    }

    @Override // xsna.tmg0
    public List<RotatableFrameLayout> getAnimatedViewsToRotate() {
        return this.d;
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.b(this);
    }
}
