package com.fyber.inneractive.sdk.ui;

import com.fyber.inneractive.sdk.web.m;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
