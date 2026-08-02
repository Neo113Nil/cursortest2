package com.instagram.common.viewpoint.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0947Mt {
    public static byte[] A04;
    public InterfaceC0945Mr A00;
    public final C1695gi A01;
    public final VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC0944Mq A0G(String str);

    public AbstractC0947Mt(C1695gi c1695gi, VA va, String str) {
        this.A01 = c1695gi;
        this.A02 = va;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    }

    public static String A0C(AbstractC0947Mt abstractC0947Mt) {
        if (abstractC0947Mt instanceof AnonymousClass84) {
            return A0B(6, 10, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC0945Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC0945Mr interfaceC0945Mr) {
        this.A00 = interfaceC0945Mr;
    }
}
