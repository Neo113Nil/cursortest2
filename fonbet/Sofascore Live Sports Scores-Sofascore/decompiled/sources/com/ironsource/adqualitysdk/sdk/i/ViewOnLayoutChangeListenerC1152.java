package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC1152 implements View.OnLayoutChangeListener {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f3633;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3634;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3635;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f3636;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3637;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ List f3638;

    public ViewOnLayoutChangeListenerC1152(C0776 c0776, C0499 c0499, C1102 c1102, C0950 c0950, List list, boolean z) {
        this.f3633 = c0776;
        this.f3638 = list;
        this.f3637 = z;
        this.f3636 = c0499;
        this.f3635 = c0950;
        this.f3634 = c1102;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            ArrayList m437 = C0776.m437(this.f3633, this.f3638, new Object[]{this, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)});
            if (!this.f3637) {
                AbstractC1008.m611(new C1163(this, m437));
                return;
            }
            C0499 c0499 = this.f3636;
            C0950 c0950 = this.f3635;
            C1102 c1102 = this.f3634;
            c0499.getClass();
            c0499.m325(c0950, c0950.f3165, c1102, m437);
        } catch (Throwable th) {
            AbstractC0356.m204(this.f3634.m651(), StringFog.decrypt("kGMrw5ROxE31XjfghxfCVqFSMc2ICchvvGItyYgL3wO8fyrFgguN\n", "1RFZrOZurSM=\n") + this.f3636.f1614, th, false);
        }
    }
}
