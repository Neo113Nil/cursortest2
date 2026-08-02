package com.playtika.pras.sdk.views;

import com.playtika.pras.e.g;

/* loaded from: classes6.dex */
public final class c implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ BaseWebViewContainer b;

    public c(BaseWebViewContainer baseWebViewContainer, String str) {
        this.b = baseWebViewContainer;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.b.webViewActionsListener;
        if (gVar != null) {
            gVar.setOrientation(this.a);
        }
    }
}
