package com.vk.stories.design.view.stickers;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: MetaHeaderLinearLayout.kt */
/* loaded from: classes6.dex */
public final class MetaHeaderLinearLayout extends LinearLayout {
    public boolean b;

    public MetaHeaderLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.b) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final boolean getDraw() {
        return this.b;
    }

    public final void setDraw(boolean z) {
        this.b = z;
    }
}
