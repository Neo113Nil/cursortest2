package com.playtika.pras.sdk.views;

import android.widget.Button;
import com.playtika.pras.e.i;

/* loaded from: classes6.dex */
public final class d implements Runnable {
    public final /* synthetic */ BaseWebViewContainer a;

    public d(BaseWebViewContainer baseWebViewContainer) {
        this.a = baseWebViewContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Button button;
        Button button2;
        button = this.a.mCloseButton;
        if (button != null) {
            button2 = this.a.mCloseButton;
            button2.setVisibility(8);
        }
        i iVar = this.a.mWebView;
        if (iVar != null) {
            iVar.setVisibility(0);
        }
    }
}
