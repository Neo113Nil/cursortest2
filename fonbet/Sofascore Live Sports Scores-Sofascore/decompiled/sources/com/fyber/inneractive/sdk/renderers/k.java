package com.fyber.inneractive.sdk.renderers;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k implements View.OnAttachStateChangeListener {
    public final /* synthetic */ n a;

    public k(n nVar) {
        this.a = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.removeOnLayoutChangeListener(this.a.z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
