package com.playtika.pras.sdk.views;

import android.view.ViewGroup;
import com.playtika.pras.e.i;

/* loaded from: classes6.dex */
public final class b implements Runnable {
    public final /* synthetic */ ViewGroup.LayoutParams a;
    public final /* synthetic */ BaseWebViewContainer b;

    public b(BaseWebViewContainer baseWebViewContainer, ViewGroup.LayoutParams layoutParams) {
        this.b = baseWebViewContainer;
        this.a = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.b.mWebView;
        if (iVar != null) {
            ViewGroup.LayoutParams layoutParams = this.a;
            layoutParams.height = -1;
            iVar.setLayoutParams(layoutParams);
        }
    }
}
