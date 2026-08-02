package com.vk.feed.tool.view.newsfeed.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.iv1;

/* compiled from: WrapContentAutoSizingTextView.kt */
/* loaded from: classes18.dex */
public class WrapContentAutoSizingTextView extends AppCompatTextView {
    public final int b;
    public final int c;
    public final int d;

    public WrapContentAutoSizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setText$lambda$0(WrapContentAutoSizingTextView wrapContentAutoSizingTextView) {
        int i;
        int i2;
        int i3 = wrapContentAutoSizingTextView.b;
        if (i3 > 0 && (i = wrapContentAutoSizingTextView.c) > i3 && (i2 = wrapContentAutoSizingTextView.d) > 0) {
            wrapContentAutoSizingTextView.setAutoSizeTextTypeUniformWithConfiguration(i3, i, i2, 0);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setAutoSizeTextTypeWithDefaults(0);
        setTextSize(0, this.c);
        super.setText(charSequence, bufferType);
        post(new iv1(this, 17));
    }

    public WrapContentAutoSizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = getAutoSizeMinTextSize();
        this.c = getAutoSizeMaxTextSize();
        this.d = Math.max(1, getAutoSizeStepGranularity());
    }
}
