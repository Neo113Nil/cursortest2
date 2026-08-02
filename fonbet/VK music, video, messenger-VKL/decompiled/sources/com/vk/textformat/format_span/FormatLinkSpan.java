package com.vk.textformat.format_span;

import android.text.style.URLSpan;
import android.view.View;
import xsna.ovu0;

/* compiled from: FormatLinkSpan.kt */
/* loaded from: classes6.dex */
public final class FormatLinkSpan extends URLSpan implements ovu0 {
    public final String b;

    public FormatLinkSpan(String str) {
        super(str);
        this.b = str;
    }

    @Override // xsna.ovu0
    public final String e() {
        return this.b;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
