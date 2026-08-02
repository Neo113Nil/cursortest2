package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ث, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0472 extends FullScreenContentCallback implements InterfaceC0873 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0464 f1526;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0683 f1527;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final FullScreenContentCallback f1528;

    public C0472(C0464 c0464, FullScreenContentCallback fullScreenContentCallback, C0683 c0683) {
        this.f1526 = c0464;
        this.f1528 = fullScreenContentCallback;
        this.f1527 = c0683;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        this.f1526.m270(this, this.f1527, StringFog.decrypt("VrpWbhx+a4B1oXltIWl8i2SMW24jf3iGe+FVbA55Wol5rFFnKw==\n", "EM86Ak8dGeU=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1528;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f1526.m270(this, this.f1527, StringFog.decrypt("o43ixP6XAtSAls3Hw4AV35G778TBlhHSjtbhxuyQNNiWlefb3pEU95CU4vvOhhXUi7vhxtmRHsU=\n", "5fiOqK30cLE=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1528;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        this.f1526.m270(this, this.f1527, StringFog.decrypt("2MQbU9XqB6373zRQ6P0QpuryFlPq6xSr9Z8YUcftM6n33RJb0uYmoPHGMUrq5Sar7NQSUcXmG7z7\n3wM=\n", "nrF3P4aJdcg=\n"), adError);
        FullScreenContentCallback fullScreenContentCallback = this.f1528;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(adError);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        this.f1526.m270(this, this.f1527, StringFog.decrypt("k/UctETV2kqw7jO3ecLNQaHDEbR71MlMvq4ftlbS4UKl8hWrZN/HQQ==\n", "1YBw2Be2qC8=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1528;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f1526.m270(this, this.f1527, StringFog.decrypt("S7s/dFT51NJooBB3ae7D2XmNMnRr+MfUZuA8dkb+9d9iuTZ8Qe/K216tIX1i9OXYY7o2dnM=\n", "Dc5TGAeaprc=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1528;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this.f1528;
    }
}
