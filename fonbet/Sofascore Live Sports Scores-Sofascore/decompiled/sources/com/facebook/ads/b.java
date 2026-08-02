package com.facebook.ads;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements OnBackInvokedCallback {
    public final /* synthetic */ AudienceNetworkActivity a;

    public b(AudienceNetworkActivity audienceNetworkActivity) {
        this.a = audienceNetworkActivity;
    }

    public final void onBackInvoked() {
        this.a.onBackPressed();
    }
}
