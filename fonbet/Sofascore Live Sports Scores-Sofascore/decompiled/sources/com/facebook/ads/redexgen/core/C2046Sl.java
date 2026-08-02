package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2046Sl implements InterfaceC2604fw {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ WA A01;
    public final /* synthetic */ WD A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 81, 3, 85, 87, 7, 80, 3, 60, 111, 51, 63, 51, 63, 107, 60, 44, 53, 41, 40, 35, 30, 5, 3, 22, 18, 15, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, 61, 120, 111, 111, 114, 111, 61, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, 15, 93, 74, 95, 67, 70, 74, 75, 15, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, 63, 62, 19, 63, 61, 32, 60, 53, 36, 53, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C2046Sl(WD wd, WA wa, long j) {
        this.A02 = wd;
        this.A01 = wa;
        this.A00 = j;
    }

    private final void A02(C2616g8 c2616g8) {
        C2652gi c2652gi;
        long j;
        C2652gi c2652gi2;
        long j2;
        WE we;
        C2652gi c2652gi3;
        C2652gi c2652gi4;
        long j3;
        W9.A06(this.A01);
        try {
            InterfaceC2602fu response = c2616g8.A00();
            if (response != null) {
                String A73 = response.A73();
                we = this.A02.A06;
                c2652gi3 = this.A02.A05;
                WG serverResponse = we.A07(c2652gi3, A73, this.A00);
                if (serverResponse.A01() == WF.A03) {
                    R4 r4 = (R4) serverResponse;
                    String A042 = r4.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(r4.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A73 = A042;
                    }
                    c2652gi4 = this.A02.A05;
                    InterfaceC1878Lt A0F = c2652gi4.A0F();
                    j3 = this.A02.A01;
                    A0F.A3W(Y1.A01(j3), adErrorTypeFromCode.getErrorCode(), A73, adErrorTypeFromCode.isPublicError());
                    this.A02.A0E(C2124Vm.A01(adErrorTypeFromCode, A73));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c2616g8.getMessage();
            c2652gi2 = this.A02.A05;
            InterfaceC1878Lt A0F2 = c2652gi2.A0F();
            j2 = this.A02.A01;
            long A01 = Y1.A01(j2);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0F2.A3W(A01, errorCode, message, isPublicError);
            this.A02.A0E(C2124Vm.A01(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c2616g8.getMessage();
            c2652gi = this.A02.A05;
            InterfaceC1878Lt A0F3 = c2652gi.A0F();
            j = this.A02.A01;
            A0F3.A3W(Y1.A01(j), adErrorType2.getErrorCode(), A00(16, 15, 30) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(C2124Vm.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2604fw
    public final void ADR(InterfaceC2602fu interfaceC2602fu) {
        C2652gi c2652gi;
        C2652gi c2652gi2;
        AbstractC2135Vy.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE));
        if (interfaceC2602fu != null) {
            String A73 = interfaceC2602fu.A73();
            c2652gi = this.A02.A05;
            int A02 = C2102Up.A02(c2652gi);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c2652gi2 = this.A02.A05;
                C2148Wl.A00(c2652gi2).A0C(A73);
            }
            W9.A06(this.A01);
            this.A02.A0O(A73, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2604fw
    public final void ADq(Exception exc) {
        C2652gi c2652gi;
        long j;
        AbstractC2135Vy.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (C2616g8.class.equals(exc.getClass())) {
            A02((C2616g8) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c2652gi = this.A02.A05;
        InterfaceC1878Lt A0F = c2652gi.A0F();
        j = this.A02.A01;
        A0F.A3W(Y1.A01(j), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(C2124Vm.A01(adErrorType, errorMessage));
    }
}
