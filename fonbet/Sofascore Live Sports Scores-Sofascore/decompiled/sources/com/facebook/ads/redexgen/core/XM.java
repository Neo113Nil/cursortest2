package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: assets/audience_network/classes2.dex */
public final class XM {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C3261rN<C2109Uw, V1> c3261rN) {
        if (c3261rN.A06.A05()) {
            return c3261rN.A07.A07();
        }
        if (!c3261rN.A06.A06()) {
            return true;
        }
        return c3261rN.A07.A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if ((r6.A00.bottom - r6.A00.top) > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r4 = r6.A01.bottom;
        r3 = r6.A00.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (com.facebook.ads.redexgen.core.XM.A02[7].length() == 7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        com.facebook.ads.redexgen.core.XM.A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if ((r4 - r3) <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if ((r6.A00.bottom - r6.A00.top) > 0) goto L22;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A01(C3261rN<C2109Uw, V1> c3261rN, InterfaceC3252rD interfaceC3252rD) {
        boolean z;
        float f = -1.0f;
        try {
            f = interfaceC3252rD.A9X(c3261rN);
        } catch (IllegalStateException unused) {
        }
        if (A02[6].length() == 7) {
            throw new RuntimeException();
        }
        A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && A00(c3261rN)) {
            return true;
        }
        if (c3261rN.A06.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c3261rN)) {
            return true;
        }
        interfaceC3252rD.A9W(this.A00);
        if (A02[2].length() != 2) {
            A02[2] = "WH3ZGQ";
            interfaceC3252rD.A8D(c3261rN, this.A01);
        } else {
            interfaceC3252rD.A8D(c3261rN, this.A01);
        }
        return z && A00(c3261rN);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C3261rN<C2109Uw, V1> c3261rN, InterfaceC3252rD interfaceC3252rD) {
        if (c3261rN.A07.A04() && A01(c3261rN, interfaceC3252rD)) {
            c3261rN.A07.A01();
            c3261rN.A06.A02().ABx(c3261rN.A06.A03(), c3261rN.A06.A04());
        }
        if (c3261rN.A07.A05() && C2102Up.A1l(c3261rN.A06.A01())) {
            c3261rN.A07.A02();
            c3261rN.A06.A02().ABL(c3261rN.A06.A03(), c3261rN.A06.A04());
        }
    }
}
