package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.eg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2526eg {
    public static byte[] A09;
    public final C1689Ek A02;
    public final C2756iS A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;
    public final E7 A04 = new E7() { // from class: com.facebook.ads.redexgen.X.4R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4F c4f) {
            String str;
            C2756iS c2756iS;
            str = C2526eg.this.A06;
            C2757iT c2757iT = new C2757iT(str, c4f.A03(), c4f.A01(), c4f.A02());
            if (c4f.A00() >= 0.05d) {
                c2757iT.A06(c4f.A01());
            }
            C2526eg.A00(C2526eg.this);
            c2756iS = C2526eg.this.A05;
            c2756iS.A04(c2757iT);
        }
    };
    public final EA A03 = new EA() { // from class: com.facebook.ads.redexgen.X.4Q
        public static String[] A01 = {"6BCUDqBTxMKsyDySTDfAgToNrOyTrTD7", "Djf66yrzqq1vnadUmdmWvJcbyzxtAl6k", "tEWjotQxZjNCyKq2vbPJS9KAzb4A3hxJ", "kfWCXMrmmpdmvn7", "tPgONuxPqcgn4e0Z", "11TiM4f61A8Ladhbi7mmvNycAncH9GAZ", "vRuUugy6JKGdIehMZ73GXeup75bhp5n7", "ksJD2q6S6mSNkSfcUAtwhZVbKKRTJPP1"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            boolean z;
            z = C2526eg.this.A08;
            if (z) {
                C2526eg c2526eg = C2526eg.this;
                String[] strArr = A01;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A01[3] = "Cld5vqCsdzETAPzY9HB959";
                c2526eg.A07();
            }
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C2526eg(C1689Ek c1689Ek, String str, boolean z, Map<String, String> map) {
        this.A06 = str;
        this.A02 = c1689Ek;
        this.A07 = map;
        this.A08 = z;
        this.A05 = new C2756iS(this.A06);
        this.A02.getEventBus().A03(this.A04, this.A03);
    }

    public static /* synthetic */ int A00(C2526eg c2526eg) {
        int i = c2526eg.A01;
        c2526eg.A01 = i + 1;
        return i;
    }

    public final Map<String, String> A06() {
        String A01 = C2756iS.A01(this.A05.A03());
        HashMap hashMap = new HashMap();
        if (this.A07 != null) {
            hashMap.putAll(this.A07);
        }
        if (A01 == null) {
            A01 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A01);
        hashMap.put(A02(11, 11, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), String.valueOf(this.A01));
        int i = this.A00 + 1;
        this.A00 = i;
        hashMap.put(A02(0, 11, 8), String.valueOf(i));
        return hashMap;
    }

    public final void A07() {
        this.A02.getEventBus().A04(this.A04, this.A03);
    }
}
