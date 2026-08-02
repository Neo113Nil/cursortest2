package ru.ozon.android.messenger.utils.view;

import android.text.TextPaint;
import android.text.style.URLSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class o extends URLSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(true);
    }
}
