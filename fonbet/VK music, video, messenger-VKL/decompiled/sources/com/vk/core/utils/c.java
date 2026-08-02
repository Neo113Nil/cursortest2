package com.vk.core.utils;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: VideoFormatter.kt */
/* loaded from: classes17.dex */
public final class c extends ClickableSpan {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs<s3q0> c;

    public c(int i, gzs<s3q0> gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.c.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(false);
    }
}
