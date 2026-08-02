package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes12.dex */
public final class m implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public m(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
