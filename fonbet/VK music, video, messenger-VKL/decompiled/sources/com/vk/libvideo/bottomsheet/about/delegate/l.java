package com.vk.libvideo.bottomsheet.about.delegate;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AboutVideoInfoDelegate.kt */
/* loaded from: classes2.dex */
public final class l extends ClickableSpan {
    public final /* synthetic */ com.vk.voip.a b;
    public final /* synthetic */ int c;

    public l(com.vk.voip.a aVar, int i) {
        this.b = aVar;
        this.c = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.c);
        textPaint.setUnderlineText(false);
    }
}
