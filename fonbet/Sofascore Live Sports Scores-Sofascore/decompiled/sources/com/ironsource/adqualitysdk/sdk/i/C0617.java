package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐝ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0617 implements Y {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3963a f2041;

    public C0617(C3963a c3963a) {
        this.f2041 = c3963a;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Y
    /* renamed from: ﾇ */
    public final void mo75(View view) {
        view.removeOnLayoutChangeListener(this.f2041.f125);
        this.f2041.f122.remove(view);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Y
    /* renamed from: ﾒ */
    public final void mo76(View view) {
        view.addOnLayoutChangeListener(this.f2041.f125);
        C3963a c3963a = this.f2041;
        c3963a.f122.put(view, c3963a.f125);
    }
}
