package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3244r5 {
    public static C3244r5 A03;
    public static InterfaceC3267rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C3254rF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i4] = (byte) ((b - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C3244r5(ViewpointQeConfig viewpointQeConfig, AbstractC3259rL abstractC3259rL, C3254rF c3254rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c3254rF;
        abstractC3259rL.A03(new C1589Aj(c3254rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C3244r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC3259rL abstractC3259rL, InterfaceC3264rQ interfaceC3264rQ, InterfaceC1590Al interfaceC1590Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C3244r5 c3244r5 = A03;
        if (c3244r5 != null) {
            return c3244r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C3244r5(viewpointQeConfig, abstractC3259rL, new C3254rF(viewpointQeConfig, interfaceC3264rQ, ck, interfaceC1590Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC3258rK interfaceC3258rK) {
        this.A02.A0H(interfaceC3258rK);
    }

    public final void A05(InterfaceC3256rI interfaceC3256rI) {
        this.A02.A0I(interfaceC3256rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C3265rU c3265rU) {
        if (this.A00.A00 && c3265rU != null) {
            this.A01.A06(dspViewableNode, c3265rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C3265rU c3265rU, C3261rN c3261rN) {
        if (this.A00.A00 && c3265rU != null) {
            this.A01.A07(dspViewableNode, c3265rU, c3261rN);
        } else {
            this.A01.A08(dspViewableNode, c3261rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C3261rN c3261rN) {
        A08(dspViewableNode, null, c3261rN);
    }
}
