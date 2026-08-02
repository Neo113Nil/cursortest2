package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵠ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0861 implements InterfaceC0837 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f2878;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2879;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f2880;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f2881;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f2882;

    public C0861(C0776 c0776, C0499 c0499, C0950 c0950, C1102 c1102, List list) {
        this.f2878 = c0776;
        this.f2882 = c0499;
        this.f2881 = c0950;
        this.f2880 = c1102;
        this.f2879 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0837
    /* renamed from: ﾒ */
    public final void mo510(C0829 c0829, MediaPlayer mediaPlayer) {
        C0499 c0499 = this.f2882;
        C0950 c0950 = this.f2881;
        C1102 c1102 = this.f2880;
        ArrayList m437 = C0776.m437(this.f2878, this.f2879, new Object[]{this, c0829, mediaPlayer});
        c0499.getClass();
        c0499.m325(c0950, c0950.f3165, c1102, m437);
    }
}
