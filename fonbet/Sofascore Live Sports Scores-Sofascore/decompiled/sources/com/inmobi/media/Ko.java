package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ko extends WebView {
    public boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ko(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.a = true;
        super.destroy();
    }
}
