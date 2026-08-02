package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.Surface;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1622fX {
    public static byte[] A02;
    public final AA A00;
    public final C2063nA A01 = new C2063nA();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, Ascii.FF, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, Ascii.DLE, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1622fX(C1695gi c1695gi) {
        InterfaceC0734Em trackSelectionFactory = new C2080nR(this.A01);
        C06129h c06129h = new C06129h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C2173ox();
        this.A00 = AbstractC05346b.A00(new C2170ou(c1695gi), c06129h, loadControl, this.A01);
    }

    public static String A01(C2236pz c2236pz) {
        boolean z = c2236pz instanceof AD;
        String A00 = A00(36, 2, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        String A002 = A00(0, 14, 108);
        if (z) {
            AD ad = (AD) c2236pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + A002 + ad.getCause() + A00;
        }
        return A00(41, 14, 99) + c2236pz.getMessage() + A002 + c2236pz.getCause() + A00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C1620fV A08() {
        C2255qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C1620fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1691ge c1691ge, Uri uri) {
        if (C1145Up.A2z(c1691ge, A03())) {
            C1626fb cacheManager = C1626fb.A06(c1691ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c1691ge);
            this.A00.A0Q(new C06179o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC0693Cx mediaSource = new C06179o(new C2190pE(c1691ge, C5C.A0j(c1691ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC1619fU interfaceC1619fU) {
        this.A00.A0O(new D6(this, interfaceC1619fU));
    }

    public final void A0H(final InterfaceC1621fW interfaceC1621fW) {
        this.A00.A0P(new InterfaceC2161ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.instagram.common.viewpoint.core.C5L
            public final void AGa(int i, int i2, int i3, float f) {
                interfaceC1621fW.AGa(i, i2, i3, f);
            }
        });
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
