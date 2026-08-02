package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.r;
import com.ironsource.Ua;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ InneractiveFullscreenAdActivity a;

    public e(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if ((i & 2) == 0) {
            r.b.postDelayed(this.a.mHideNavigationBarTask, Ua.C);
        }
    }
}
