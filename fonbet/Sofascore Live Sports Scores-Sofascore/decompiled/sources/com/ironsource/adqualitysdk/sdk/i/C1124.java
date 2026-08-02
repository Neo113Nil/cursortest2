package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1124 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1113 f3519;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f3520;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0757 f3521;

    public C1124(C1113 c1113, C0757 c0757, MediaPlayer mediaPlayer) {
        this.f3519 = c1113;
        this.f3521 = c0757;
        this.f3520 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f3519.f3500.mo457(this.f3521, this.f3520);
    }
}
