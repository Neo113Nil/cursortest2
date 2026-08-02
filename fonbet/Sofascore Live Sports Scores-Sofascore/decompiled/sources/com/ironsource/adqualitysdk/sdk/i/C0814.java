package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴰ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0814 implements InterfaceC0886 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f2617;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2618;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f2619;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f2620;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f2621;

    public C0814(C0776 c0776, C0499 c0499, C0950 c0950, C1102 c1102, List list) {
        this.f2617 = c0776;
        this.f2621 = c0499;
        this.f2620 = c0950;
        this.f2619 = c1102;
        this.f2618 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0886
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo502(C0879 c0879, MediaPlayer mediaPlayer) {
        C0499 c0499 = this.f2621;
        C0950 c0950 = this.f2620;
        C1102 c1102 = this.f2619;
        ArrayList m437 = C0776.m437(this.f2617, this.f2618, new Object[]{this, c0879, mediaPlayer});
        c0499.getClass();
        c0499.m325(c0950, c0950.f3165, c1102, m437);
    }
}
