package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1592Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC3268rY A00;
    public InterfaceC3256rI A01;
    public C3244r5 A02;
    public final InterfaceC3257rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC3256rI A03 = new C1593Ap(this);

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

    public C1592Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC3268rY interfaceC3268rY, InterfaceC3257rJ interfaceC3257rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC3268rY;
        this.A04 = interfaceC3257rJ;
    }

    public static C1592Ao A01() {
        return new C1592Ao(new ViewpointQeConfig(), new C1595Ar(), null);
    }

    private void A05(AbstractC3259rL abstractC3259rL, InterfaceC3264rQ interfaceC3264rQ, InterfaceC1590Al interfaceC1590Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C3244r5.A01(this.A05, abstractC3259rL, interfaceC3264rQ, interfaceC1590Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C3265rU c3265rU) {
        C3244r5 c3244r5 = this.A02;
        if (c3244r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c3265rU != null) {
                c3244r5.A07(dspViewableNode, c3265rU);
            } else {
                c3244r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C3265rU c3265rU, C3261rN c3261rN) {
        C3244r5 c3244r5 = this.A02;
        if (c3244r5 != null && dspViewableNode != null && c3261rN != null) {
            if (this.A05.A00 && c3265rU != null) {
                c3261rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c3261rN.A08 + c3265rU;
                c3244r5.A08(dspViewableNode, c3265rU, c3261rN);
            } else {
                c3244r5.A09(dspViewableNode, c3261rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C3261rN<?, ?> c3261rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c3261rN);
    }

    public final void A0A(AbstractC3259rL abstractC3259rL, View view) {
        if (abstractC3259rL != null && view != null) {
            A05(abstractC3259rL, new C1594Aq(view, this.A00), new C13841u(null), null);
        }
    }
}
