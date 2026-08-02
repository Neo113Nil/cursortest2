package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC2817jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC2817jd abstractC2817jd) {
        this.A01 = cif;
        this.A00 = abstractC2817jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c2762iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c2762iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c2762iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c2762iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C15257j c15257j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        C15257j c15257j2;
        C15257j c15257j3;
        C15257j c15257j4;
        this.A01.A00.A04 = false;
        c15257j = this.A01.A00.A03;
        if (c15257j != null) {
            c15257j2 = this.A01.A00.A03;
            c15257j2.A0S(new C2769ih(this));
            c15257j3 = this.A01.A00.A03;
            c15257j3.A0N();
            c15257j4 = this.A01.A00.A03;
            c15257j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c2762iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c2762iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
