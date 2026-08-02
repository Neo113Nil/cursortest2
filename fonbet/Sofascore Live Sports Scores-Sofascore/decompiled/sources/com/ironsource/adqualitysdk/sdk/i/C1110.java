package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺬ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1110 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1092 f3494;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f3495;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0829 f3496;

    public C1110(C1092 c1092, C0829 c0829, MediaPlayer mediaPlayer) {
        this.f3494 = c1092;
        this.f3496 = c0829;
        this.f3495 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f3494.f3401.mo510(this.f3496, this.f3495);
    }
}
