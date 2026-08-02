package com.vk.libvideo.bottomsheet.about.delegate;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.libvideo.bottomsheet.about.delegate.n;
import java.util.concurrent.TimeUnit;
import xsna.b4;

/* compiled from: AboutVideoInfoDelegate.kt */
/* loaded from: classes2.dex */
public final class m extends ClickableSpan {
    public final /* synthetic */ n.a b;
    public final /* synthetic */ String c;

    public m(n.a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.l.d(new b4.h0(TimeUnit.SECONDS.toMillis(n.a.h6(this.c))));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
