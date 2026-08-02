package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴻ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0825 implements InterfaceC0860 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f2630;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2631;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f2632;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f2633;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f2634;

    public C0825(C0776 c0776, C0499 c0499, C0950 c0950, C1102 c1102, List list) {
        this.f2630 = c0776;
        this.f2634 = c0499;
        this.f2633 = c0950;
        this.f2632 = c1102;
        this.f2631 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0860
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean mo508(C0852 c0852, MediaPlayer mediaPlayer, int i, int i2) {
        C0499 c0499 = this.f2634;
        C0950 c0950 = this.f2633;
        C1102 c1102 = this.f2632;
        ArrayList m437 = C0776.m437(this.f2630, this.f2631, new Object[]{this, c0852, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)});
        c0499.getClass();
        return c0499.m325(c0950, c0950.f3165, c1102, m437).m640();
    }
}
