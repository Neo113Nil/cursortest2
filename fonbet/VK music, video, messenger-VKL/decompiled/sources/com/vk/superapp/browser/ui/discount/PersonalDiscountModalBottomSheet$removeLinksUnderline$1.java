package com.vk.superapp.browser.ui.discount;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: PersonalDiscountModalBottomSheet.kt */
/* loaded from: classes6.dex */
public final class PersonalDiscountModalBottomSheet$removeLinksUnderline$1 extends URLSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
