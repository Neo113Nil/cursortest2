package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʻ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC0312 implements View.OnLayoutChangeListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3963a f578;

    public ViewOnLayoutChangeListenerC0312(C3963a c3963a) {
        this.f578 = c3963a;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.f578.m78(view);
        } catch (Throwable th) {
            AbstractC0356.m204(StringFog.decrypt("sJhD/XgzqRaHn0LmXCU=\n", "5vEmijlX2l4=\n"), StringFog.decrypt("xgpETyXLDFyjF1hsNpIKR/c7XkE5jAA=\n", "g3g2IFfrZTI=\n"), th, false);
        }
    }
}
