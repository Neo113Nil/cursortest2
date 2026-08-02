package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ȑ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC0257 implements View.OnLayoutChangeListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f474;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f475;

    public ViewOnLayoutChangeListenerC0257(C1188 c1188, ViewGroup viewGroup) {
        this.f474 = c1188;
        this.f475 = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        C0808 m476 = C0808.m476();
        synchronized (m476) {
            z = m476.f2599;
        }
        if (z) {
            return;
        }
        try {
            C1188.m668(this.f474, this.f475, this);
        } catch (Throwable th) {
            AbstractC0356.m204(StringFog.decrypt("A9SLq4k3K0Ix24yFgSgLSCrdlpqNKQlEJ90=\n", "RLjkyehbfy0=\n"), StringFog.decrypt("+3qMGIXitQGeZ5A7lruzGspLlhaZpbk=\n", "vgj+d/fC3G8=\n"), th, false);
        }
    }
}
