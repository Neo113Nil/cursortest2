package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.5m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C14765m extends E8 {
    public static byte[] A01;
    public final /* synthetic */ C2428d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, 25, 4};
    }

    public C14765m(C2428d4 c2428d4) {
        this.A00 = c2428d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(E9 e9) {
        InterfaceC2427d3 interfaceC2427d3;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new RunnableC2426d2(this));
        interfaceC2427d3 = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC2427d3.AGR(A00(0, 5, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), A03);
    }
}
