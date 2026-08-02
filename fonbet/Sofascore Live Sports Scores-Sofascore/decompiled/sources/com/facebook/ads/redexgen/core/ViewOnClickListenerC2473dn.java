package com.facebook.ads.redexgen.core;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2473dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C14614x A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, 61};
    }

    public ViewOnClickListenerC2473dn(C14614x c14614x) {
        this.A00 = c14614x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC2365c3 abstractC2365c3;
        AbstractC2365c3 abstractC2365c32;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC2365c3 = this.A00.A00;
            if (abstractC2365c3 != null) {
                abstractC2365c32 = this.A00.A00;
                abstractC2365c32.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
