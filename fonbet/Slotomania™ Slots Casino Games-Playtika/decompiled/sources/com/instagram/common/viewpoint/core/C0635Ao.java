package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0635Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2311rY A00;
    public InterfaceC2299rI A01;
    public C2287r5 A02;
    public final InterfaceC2300rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2299rI A03 = new C0636Ap(this);

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C0635Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2311rY interfaceC2311rY, InterfaceC2300rJ interfaceC2300rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2311rY;
        this.A04 = interfaceC2300rJ;
    }

    public static C0635Ao A01() {
        return new C0635Ao(new ViewpointQeConfig(), new C0638Ar(), null);
    }

    private void A05(AbstractC2302rL abstractC2302rL, InterfaceC2307rQ interfaceC2307rQ, InterfaceC0633Al interfaceC0633Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2287r5.A01(this.A05, abstractC2302rL, interfaceC2307rQ, interfaceC0633Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2308rU c2308rU) {
        C2287r5 c2287r5 = this.A02;
        if (c2287r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2308rU != null) {
                c2287r5.A07(dspViewableNode, c2308rU);
            } else {
                c2287r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2308rU c2308rU, C2304rN c2304rN) {
        C2287r5 c2287r5 = this.A02;
        if (c2287r5 != null && dspViewableNode != null && c2304rN != null) {
            if (this.A05.A00 && c2308rU != null) {
                c2304rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2304rN.A08 + c2308rU;
                c2287r5.A08(dspViewableNode, c2308rU, c2304rN);
            } else {
                c2287r5.A09(dspViewableNode, c2304rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2304rN<?, ?> c2304rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2304rN);
    }

    public final void A0A(AbstractC2302rL abstractC2302rL, View view) {
        if (abstractC2302rL != null && view != null) {
            A05(abstractC2302rL, new C0637Aq(view, this.A00), new C04271u(null), null);
        }
    }
}
