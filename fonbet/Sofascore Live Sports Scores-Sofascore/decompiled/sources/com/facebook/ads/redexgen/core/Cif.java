package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C2766id A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public Cif(C2766id c2766id) {
        this.A00 = c2766id;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C15257j c15257j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        C15257j c15257j2;
        C15257j c15257j3;
        C15257j c15257j4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c15257j = this.A00.A03;
        if (c15257j != null && C2102Up.A2D(this.A00.A06)) {
            c15257j2 = this.A00.A03;
            c15257j2.A0S(new C2768ig(this));
            c15257j3 = this.A00.A03;
            c15257j3.A0N();
            c15257j4 = this.A00.A03;
            c15257j4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c2762iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c2762iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        interstitialAdExtendedListener = this.A00.A07;
        c2762iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c2762iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        this.A00.A06.A0F().A3K();
        interstitialAdExtendedListener = this.A00.A07;
        c2762iY = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c2762iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        interstitialAdExtendedListener = this.A00.A07;
        c2762iY = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c2762iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(N1 n1) {
        C15257j c15257j;
        C15257j c15257j2;
        NQ nq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        NQ nq2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C2762iY c2762iY2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C2762iY c2762iY3;
        InterstitialAd interstitialAd2;
        C2762iY c2762iY4;
        C2762iY c2762iY5;
        InterstitialAd interstitialAd3;
        C2762iY c2762iY6;
        C2762iY c2762iY7;
        C2762iY c2762iY8;
        c15257j = this.A00.A03;
        if (c15257j != null) {
            this.A00.A05 = true;
            C2766id c2766id = this.A00;
            c15257j2 = this.A00.A03;
            c2766id.A02 = c15257j2.A0I();
            nq = this.A00.A02;
            if (!(nq instanceof AbstractC2817jd)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c2762iY = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c2762iY.A6k());
                    return;
                }
            } else {
                nq2 = this.A00.A02;
                AbstractC2817jd abstractC2817jd = (AbstractC2817jd) nq2;
                if (abstractC2817jd.A26() > 0) {
                    XC xc = new XC();
                    C2652gi c2652gi = this.A00.A06;
                    c2762iY6 = this.A00.A08;
                    if (xc.A09(c2652gi, c2762iY6.A08(), abstractC2817jd.A26())) {
                        xc.A08(this.A00.A06, true);
                        C2766id c2766id2 = this.A00;
                        C2652gi c2652gi2 = this.A00.A06;
                        c2762iY7 = this.A00.A08;
                        String A0A = c2762iY7.A0A();
                        c2762iY8 = this.A00.A08;
                        c2766id2.A01 = xc.A06(c2652gi2, A0A, c2762iY8.A08());
                    } else {
                        C2766id c2766id3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc.A08(c2766id3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc.A08(c2766id3.A06, false);
                        }
                    }
                }
                C2766id c2766id4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c2766id4.A01;
                    if (interstitialAd != null) {
                        abstractC2817jd.A2J(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new OH(this, abstractC2817jd));
                        c2762iY4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c2762iY4.A0B());
                        c2762iY5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c2762iY5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C2766id c2766id5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c2766id5.A07;
                        c2762iY3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c2762iY3.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c2766id5.A07;
                        c2762iY2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c2762iY2.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC2064Td.A0N, new C2065Te(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(C2124Vm c2124Vm) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2762iY c2762iY;
        InterfaceC1878Lt A0F = this.A00.A06.A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c2124Vm.A03().getErrorCode(), c2124Vm.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c2762iY = this.A00.A08;
        interstitialAdExtendedListener.onError(c2762iY.A6k(), XE.A00(c2124Vm));
    }
}
