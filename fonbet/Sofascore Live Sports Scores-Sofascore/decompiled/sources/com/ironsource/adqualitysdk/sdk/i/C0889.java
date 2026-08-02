package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṟ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0889 implements InterfaceC0726 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f2951;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2952;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f2953;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f2954;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f2955;

    public C0889(C0776 c0776, C0499 c0499, C0950 c0950, C1102 c1102, List list) {
        this.f2951 = c0776;
        this.f2955 = c0499;
        this.f2954 = c0950;
        this.f2953 = c1102;
        this.f2952 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0726
    /* renamed from: ﾒ */
    public final boolean mo132(ViewOnTouchListenerC0702 viewOnTouchListenerC0702, View view, MotionEvent motionEvent) {
        C0499 c0499 = this.f2955;
        C0950 c0950 = this.f2954;
        C1102 c1102 = this.f2953;
        ArrayList m437 = C0776.m437(this.f2951, this.f2952, new Object[]{this, viewOnTouchListenerC0702, view, motionEvent});
        c0499.getClass();
        return c0499.m325(c0950, c0950.f3165, c1102, m437).m640();
    }
}
