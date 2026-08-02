package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1063 extends AbstractRunnableC0606 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1046 f3354;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ int f3355;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ int f3356;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f3357;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0852 f3358;

    public C1063(C1046 c1046, C0852 c0852, MediaPlayer mediaPlayer, int i, int i2) {
        this.f3354 = c1046;
        this.f3358 = c0852;
        this.f3357 = mediaPlayer;
        this.f3356 = i;
        this.f3355 = i2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f3354.f3330.mo508(this.f3358, this.f3357, this.f3356, this.f3355);
    }
}
