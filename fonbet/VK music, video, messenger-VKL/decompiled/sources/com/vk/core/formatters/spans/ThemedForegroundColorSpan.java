package com.vk.core.formatters.spans;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import xsna.dhr0;

/* compiled from: ThemedForegroundColorSpan.kt */
/* loaded from: classes17.dex */
public final class ThemedForegroundColorSpan extends ForegroundColorSpan {
    public final int b;

    public ThemedForegroundColorSpan(int i) {
        super(dhr0.t.c(i));
        this.b = i;
    }

    @Override // android.text.style.ForegroundColorSpan
    public final int getForegroundColor() {
        return dhr0.t.c(this.b);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(dhr0.t.c(this.b));
    }
}
