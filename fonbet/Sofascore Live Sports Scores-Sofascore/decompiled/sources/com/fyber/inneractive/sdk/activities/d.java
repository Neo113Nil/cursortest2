package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ InneractiveFullscreenAdActivity a;

    public d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismissAd(true);
    }
}
