package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1930Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C2058Sx A00;
    public EnumC2313bD A01 = EnumC2313bD.A05;
    public ArrayList<C2436dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1929Nt A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C1930Nu(C2652gi c2652gi, O8 o8, InterfaceC1929Nt interfaceC1929Nt, String str) {
        JSONObject dataObject = o8.A03();
        this.A03 = A01(c2652gi, o8, str, dataObject);
        this.A04 = interfaceC1929Nt;
    }

    private AdError A00(C2652gi c2652gi, AbstractC2817jd abstractC2817jd) {
        if (abstractC2817jd == null || abstractC2817jd.A2G().isEmpty()) {
            c2652gi.A08().ABC(A04(62, 3, 33), AbstractC2064Td.A0Z, new C2065Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C2652gi c2652gi, O8 o8, String str, JSONObject jSONObject) {
        NQ nq = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nq = C2811jT.A01(jSONObject, c2652gi, true);
                nq.A1Q(true);
                nq.A1N(A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            } catch (JSONException unused) {
            }
        }
        if (nq == null) {
            nq = C15297n.A00(jSONObject, c2652gi);
        }
        nq.A1M(str);
        C2084Tx A01 = o8.A01();
        if (A01 != null) {
            nq.A1I(A01.A06());
        }
        return nq;
    }

    private C2058Sx A03(C2652gi c2652gi) {
        return this.A00 != null ? this.A00 : new C2058Sx(c2652gi);
    }

    private void A08(C2652gi c2652gi, C15297n c15297n) {
        C1924No playableData = c15297n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC2313bD.A05);
        C2797jC c2797jC = new C2797jC(this);
        C2058Sx c2058Sx = new C2058Sx(c2652gi);
        boolean z = C2102Up.A2H(c2652gi) && SN.A0A(c15297n.A1H());
        if (z) {
            SN unifiedAssetsLoader = new SN(c2058Sx, c15297n.A1H(), c15297n.A10(), c15297n.A1D(), z, new C2796jB(this));
            c2058Sx.A0e(new VI(c15297n.A2E(), c2652gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c2652gi, c15297n, true, c2797jC);
    }

    private void A09(C2652gi c2652gi, EnumSet<CacheFlag> enumSet, AbstractC2817jd abstractC2817jd, int i, InterfaceC1929Nt interfaceC1929Nt) {
        boolean isDSL = abstractC2817jd.A1g();
        C2058Sx A03 = A03(c2652gi);
        A03.A0e(new VI(abstractC2817jd.A2E(), c2652gi.A0A()));
        boolean z = C2102Up.A2H(c2652gi) && SN.A0A(abstractC2817jd.A1H());
        if (z) {
            new SN(A03, abstractC2817jd.A1H(), abstractC2817jd.A10(), abstractC2817jd.A1D(), z, new C2800jF(this, c2652gi, isDSL, abstractC2817jd, interfaceC1929Nt)).A0B();
            return;
        }
        String A04 = A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        if (isDSL) {
            C2054St c2054St = new C2054St(abstractC2817jd.A0x(), abstractC2817jd.A1D(), A04);
            c2054St.A04 = true;
            c2054St.A03 = A04(0, 5, 78);
            A03.A0Y(c2054St);
        }
        A03.A0d(new C2056Sv(abstractC2817jd.A2C().A01(), C2489e4.A04, C2489e4.A04, abstractC2817jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean A30 = C2102Up.A30(c2652gi, C2579fX.A03());
        for (NR nr : abstractC2817jd.A2G()) {
            C2056Sv c2056Sv = new C2056Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC2817jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            if (i2 == 0) {
                A03.A0c(c2056Sv);
            } else {
                A03.A0d(c2056Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                A03.A0d(new C2056Sv(it.next(), -1, -1, abstractC2817jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C2054St c2054St2 = new C2054St(nr.A0H().A09(), abstractC2817jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), nr.A0H().A06());
                c2054St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !A30) {
                        A03.A0Y(c2054St2);
                    } else {
                        A03.A0b(c2054St2);
                    }
                } else if (isDSL && !A30) {
                    A03.A0Z(c2054St2);
                } else {
                    A03.A0a(c2054St2);
                }
            }
            i2++;
        }
        if (abstractC2817jd.A1W() && !TextUtils.isEmpty(abstractC2817jd.A11())) {
            A03.A0d(new C2056Sv(abstractC2817jd.A11(), C1966Pe.A0A, C1966Pe.A0A, abstractC2817jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        }
        O0.A00(abstractC2817jd, A03, A04);
        A03.A0X(new C2798jD(this, c2652gi, isDSL, abstractC2817jd, interfaceC1929Nt), new C2051Sq(abstractC2817jd.A1D(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2652gi c2652gi, EnumSet<CacheFlag> enumSet, C2811jT c2811jT, AbstractC2817jd abstractC2817jd, int i, InterfaceC1929Nt interfaceC1929Nt) {
        A09(c2652gi, enumSet, abstractC2817jd, i, new C2802jH(this, c2652gi, abstractC2817jd, c2811jT, i, interfaceC1929Nt, enumSet));
    }

    private void A0B(EnumC2313bD enumC2313bD) {
        this.A01 = enumC2313bD;
    }

    private boolean A0C(C2652gi c2652gi, AbstractC2817jd abstractC2817jd) {
        AdError A00 = A00(c2652gi, abstractC2817jd);
        if (A00 != null) {
            this.A04.ACo(A00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return com.facebook.ads.redexgen.core.WK.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WK A0E() {
        if (this.A03.A1b()) {
            return WK.A04;
        }
        AbstractC2817jd abstractC2817jd = (AbstractC2817jd) this.A03;
        if (abstractC2817jd.A1g()) {
            return WK.A06;
        }
        if (abstractC2817jd.A2G().size() > 1) {
            return WK.A0A;
        }
        C1924No A07 = abstractC2817jd.A29().A0H().A07();
        if (A06[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (A07 != null) {
            if (!abstractC2817jd.A1n()) {
                boolean A1u = abstractC2817jd.A1u();
                if (A06[0].length() != 2) {
                    String[] strArr2 = A06;
                    strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
                    strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
                }
            }
            return WK.A0E;
        }
        boolean A0L = A0L(abstractC2817jd);
        if (A06[0].length() == 2) {
            throw new RuntimeException();
        }
        A06[0] = "iDu";
        if (A0L) {
            return WK.A0D;
        }
        return WK.A0B;
    }

    public final EnumC2313bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C2811jT) this.A03).A2A();
        }
        return ((AbstractC2817jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C2652gi c2652gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C2811jT c2811jT = (C2811jT) this.A03;
            AbstractC2817jd A26 = c2811jT.A26();
            if (A0C(c2652gi, A26) || A26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c2652gi, enumSet, c2811jT, A26, 0, this.A04);
            return;
        }
        AbstractC2817jd abstractC2817jd = (AbstractC2817jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c2652gi, abstractC2817jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C15297n c15297n = (C15297n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c2652gi, c15297n);
                return;
            } else {
                A08(c2652gi, c15297n);
                return;
            }
        }
        A09(c2652gi, enumSet, (C15297n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC2817jd abstractC2817jd) {
        return !TextUtils.isEmpty(abstractC2817jd.A29().A0H().A09());
    }
}
