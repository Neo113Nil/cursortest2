package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC1860jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC1860jd abstractC1860jd) {
        this.A01 = cif;
        this.A00 = abstractC1860jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1805iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1805iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1805iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1805iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C05687j c05687j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        C05687j c05687j2;
        C05687j c05687j3;
        C05687j c05687j4;
        this.A01.A00.A04 = false;
        c05687j = this.A01.A00.A03;
        if (c05687j != null) {
            c05687j2 = this.A01.A00.A03;
            c05687j2.A0S(new C1812ih(this));
            c05687j3 = this.A01.A00.A03;
            c05687j3.A0N();
            c05687j4 = this.A01.A00.A03;
            c05687j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1805iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1805iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
