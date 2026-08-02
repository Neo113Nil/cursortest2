package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import xsna.an10;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class CroppedTextView extends TextView {
    private final int a;

    @SuppressLint({"CustomViewStyleable"})
    public CroppedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int lineHeight = getLineHeight();
        if (lineHeight > 0) {
            int min = Math.min((getMeasuredHeight() + an10.b(getLineHeight() * 0.05f)) / lineHeight, this.a);
            if (min == getMinLines() && min == getMaxLines()) {
                return;
            }
            setLines(min);
            TextUtils.TruncateAt ellipsize = getEllipsize();
            setEllipsize(null);
            setEllipsize(ellipsize);
        }
    }

    public /* synthetic */ CroppedTextView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CroppedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getMaxLines();
    }
}
