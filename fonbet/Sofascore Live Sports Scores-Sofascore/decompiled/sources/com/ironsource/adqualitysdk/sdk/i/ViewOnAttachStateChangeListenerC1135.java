package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ｊ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC1135 implements View.OnAttachStateChangeListener {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f3535;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3536;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3537;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3538;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ List f3539;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f3540;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f3541;

    public ViewOnAttachStateChangeListenerC1135(C0776 c0776, C0499 c0499, C0499 c04992, List list, boolean z, C0950 c0950, C1102 c1102) {
        this.f3535 = c0776;
        this.f3541 = c0499;
        this.f3540 = c04992;
        this.f3539 = list;
        this.f3538 = z;
        this.f3537 = c0950;
        this.f3536 = c1102;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        m663(this.f3541, view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m663(this.f3540, view);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m663(C0499 c0499, View view) {
        try {
            ArrayList m437 = C0776.m437(this.f3535, this.f3539, new Object[]{this, view});
            if (!this.f3538) {
                AbstractC1008.m611(new C1136(this, c0499, m437));
                return;
            }
            C0950 c0950 = this.f3537;
            C1102 c1102 = this.f3536;
            c0499.getClass();
            c0499.m325(c0950, c0950.f3165, c1102, m437);
        } catch (Throwable th) {
            AbstractC0356.m204(this.f3536.m651(), StringFog.decrypt("PDy1Ide9PvdZAakP0ek2+hEdsy/R+BTxGCCgK+n0JO0cIKI8hfQ56hAqom4=\n", "eU7HTqWdV5k=\n") + c0499.f1614, th, false);
        }
    }
}
