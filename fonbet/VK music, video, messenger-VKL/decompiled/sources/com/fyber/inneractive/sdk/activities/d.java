package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes12.dex */
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
