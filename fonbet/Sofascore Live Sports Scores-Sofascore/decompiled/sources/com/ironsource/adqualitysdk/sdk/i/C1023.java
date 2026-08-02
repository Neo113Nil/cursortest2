package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.כּ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1023 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1022 f3271;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f3272;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0879 f3273;

    public C1023(C1022 c1022, C0879 c0879, MediaPlayer mediaPlayer) {
        this.f3271 = c1022;
        this.f3273 = c0879;
        this.f3272 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f3271.f3270.mo502(this.f3273, this.f3272);
    }
}
