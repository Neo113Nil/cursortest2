package com.fyber.inneractive.sdk.ui;

import com.fyber.inneractive.sdk.web.m;

/* loaded from: classes12.dex */
public final class f implements Runnable {
    public final /* synthetic */ IAmraidWebViewController a;

    public f(IAmraidWebViewController iAmraidWebViewController) {
        this.a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.a.b;
        if (mVar != null) {
            try {
                mVar.invalidate();
            } catch (Throwable unused) {
            }
        }
    }
}
