package com.facebook.internal;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ n0(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                ((s0) callback).cancel();
                break;
            case 1:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e) callback).a.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                break;
            default:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m0) callback).b.invoke();
                break;
        }
    }
}
