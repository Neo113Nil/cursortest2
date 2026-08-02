package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class L6 {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass53 A07 = new AnonymousClass53(0);
    public long A01 = C.TIME_UNSET;
    public long A02 = C.TIME_UNSET;
    public long A00 = C.TIME_UNSET;
    public final C14594v A06 = new C14594v();

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, 20, 50, 40, 45, 38, -33, 19, 8, 12, 4, 30, 20, 13, 18, 4, 19, -33, 40, 45, 50, 51, 36, 32, 35, -19, 18, 55, 63, 42, 53, 50, 45, -23, 45, 62, 59, 42, 61, 50, 56, 55, 3, -23, 22, 57, 10, 59, 56, 39, 58, 47, 53, 52, 24, 43, 39, 42, 43, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC3003ms interfaceC3003ms) {
        this.A06.A0i(C5C.A07);
        this.A03 = true;
        interfaceC3003ms.AIl();
        return 0;
    }

    private int A01(InterfaceC3003ms interfaceC3003ms, HV hv) throws IOException {
        int min = (int) Math.min(20000L, interfaceC3003ms.A8O());
        if (interfaceC3003ms.A8n() != 0) {
            hv.A00 = 0;
            return 1;
        }
        C14594v c14594v = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch == 30) {
            throw new RuntimeException();
        }
        A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
        c14594v.A0d(min);
        interfaceC3003ms.AIl();
        interfaceC3003ms.AGt(this.A06.A0l(), 0, min);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC3003ms interfaceC3003ms, HV hv) throws IOException {
        long A8O = interfaceC3003ms.A8O();
        int min = (int) Math.min(20000L, A8O);
        long j = A8O - min;
        long searchStartPosition = interfaceC3003ms.A8n();
        if (searchStartPosition != j) {
            hv.A00 = j;
            return 1;
        }
        this.A06.A0d(min);
        interfaceC3003ms.AIl();
        interfaceC3003ms.AGt(this.A06.A0l(), 0, min);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i) {
        return ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A04(C14594v c14594v) {
        int A0A = c14594v.A0A();
        for (int A092 = c14594v.A09(); A092 < searchStartPosition; A092++) {
            int searchEndPosition = A03(c14594v.A0l(), A092);
            if (searchEndPosition == 442) {
                int searchStartPosition = A092 + 4;
                c14594v.A0f(searchStartPosition);
                long A06 = A06(c14594v);
                if (A06 != C.TIME_UNSET) {
                    return A06;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private long A05(C14594v c14594v) {
        int A092 = c14594v.A09();
        int searchStartPosition = c14594v.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= A092; nextStartCode--) {
            int searchEndPosition = A03(c14594v.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c14594v.A0f(searchStartPosition2);
                long A06 = A06(c14594v);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                if (A06 != C.TIME_UNSET) {
                    return A06;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long A06(C14594v c14594v) {
        int A092 = c14594v.A09();
        if (c14594v.A07() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c14594v.A0k(bArr, 0, originalPosition);
        c14594v.A0f(A092);
        return !A0A(bArr) ? C.TIME_UNSET : A07(bArr);
    }

    public static long A07(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC3003ms interfaceC3003ms, HV hv) throws IOException {
        if (!this.A05) {
            return A02(interfaceC3003ms, hv);
        }
        if (this.A02 == C.TIME_UNSET) {
            return A00(interfaceC3003ms);
        }
        if (!this.A04) {
            return A01(interfaceC3003ms, hv);
        }
        if (this.A01 == C.TIME_UNSET) {
            return A00(interfaceC3003ms);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC14444g.A07(A08(45, 16, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), A08(27, 18, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + this.A00 + A08(0, 27, 112));
            this.A00 = C.TIME_UNSET;
        }
        return A00(interfaceC3003ms);
    }

    public final long A0C() {
        return this.A00;
    }

    public final AnonymousClass53 A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
