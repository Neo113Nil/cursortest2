package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1809id A00;

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

    public Cif(C1809id c1809id) {
        this.A00 = c1809id;
    }

    @Override // com.instagram.common.viewpoint.core.N2
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

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C05687j c05687j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        C05687j c05687j2;
        C05687j c05687j3;
        C05687j c05687j4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c05687j = this.A00.A03;
        if (c05687j != null && C1145Up.A2D(this.A00.A06)) {
            c05687j2 = this.A00.A03;
            c05687j2.A0S(new C1811ig(this));
            c05687j3 = this.A00.A03;
            c05687j3.A0N();
            c05687j4 = this.A00.A03;
            c05687j4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1805iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1805iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1805iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1805iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        this.A00.A06.A0F().A3K();
        interstitialAdExtendedListener = this.A00.A07;
        c1805iY = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1805iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1805iY = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1805iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C05687j c05687j;
        C05687j c05687j2;
        NQ nq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        NQ nq2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C1805iY c1805iY2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C1805iY c1805iY3;
        InterstitialAd interstitialAd2;
        C1805iY c1805iY4;
        C1805iY c1805iY5;
        InterstitialAd interstitialAd3;
        C1805iY c1805iY6;
        C1805iY c1805iY7;
        C1805iY c1805iY8;
        c05687j = this.A00.A03;
        if (c05687j != null) {
            this.A00.A05 = true;
            C1809id c1809id = this.A00;
            c05687j2 = this.A00.A03;
            c1809id.A02 = c05687j2.A0I();
            nq = this.A00.A02;
            if (!(nq instanceof AbstractC1860jd)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1805iY = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1805iY.A6k());
                    return;
                }
            } else {
                nq2 = this.A00.A02;
                AbstractC1860jd abstractC1860jd = (AbstractC1860jd) nq2;
                if (abstractC1860jd.A26() > 0) {
                    XC xc = new XC();
                    C1695gi c1695gi = this.A00.A06;
                    c1805iY6 = this.A00.A08;
                    if (xc.A09(c1695gi, c1805iY6.A08(), abstractC1860jd.A26())) {
                        xc.A08(this.A00.A06, true);
                        C1809id c1809id2 = this.A00;
                        C1695gi c1695gi2 = this.A00.A06;
                        c1805iY7 = this.A00.A08;
                        String A0A = c1805iY7.A0A();
                        c1805iY8 = this.A00.A08;
                        c1809id2.A01 = xc.A06(c1695gi2, A0A, c1805iY8.A08());
                    } else {
                        C1809id c1809id3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc.A08(c1809id3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc.A08(c1809id3.A06, false);
                        }
                    }
                }
                C1809id c1809id4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1809id4.A01;
                    if (interstitialAd != null) {
                        abstractC1860jd.A2J(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new OH(this, abstractC1860jd));
                        c1805iY4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1805iY4.A0B());
                        c1805iY5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1805iY5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C1809id c1809id5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1809id5.A07;
                        c1805iY3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1805iY3.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c1809id5.A07;
                        c1805iY2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c1805iY2.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC1107Td.A0N, new C1108Te(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1167Vm c1167Vm) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1805iY c1805iY;
        InterfaceC0921Lt A0F = this.A00.A06.A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c1167Vm.A03().getErrorCode(), c1167Vm.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1805iY = this.A00.A08;
        interstitialAdExtendedListener.onError(c1805iY.A6k(), XE.A00(c1167Vm));
    }
}
