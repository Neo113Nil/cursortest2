package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0973Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1101Sx A00;
    public EnumC1356bD A01 = EnumC1356bD.A05;
    public ArrayList<C1479dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC0972Nt A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, Ascii.ETB, 35, Ascii.FS, Ascii.ESC, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, Ascii.NAK, Ascii.CAN, 19, Ascii.CAN, Ascii.NAK, 40, Ascii.NAK, 19, Ascii.SYN, 41, 34, Ascii.CAN, 32, Ascii.EM, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, Ascii.DC2, Ascii.ETB, Ascii.DLE, Ascii.CAN, Ascii.GS, Ascii.DC4, 19, -16, 19, -13, Ascii.DLE, 35, Ascii.DLE, -15, 36, Ascii.GS, 19, Ascii.ESC, Ascii.DC4, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C0973Nu(C1695gi c1695gi, O8 o8, InterfaceC0972Nt interfaceC0972Nt, String str) {
        JSONObject dataObject = o8.A03();
        this.A03 = A01(c1695gi, o8, str, dataObject);
        this.A04 = interfaceC0972Nt;
    }

    private AdError A00(C1695gi c1695gi, AbstractC1860jd abstractC1860jd) {
        if (abstractC1860jd == null || abstractC1860jd.A2G().isEmpty()) {
            c1695gi.A08().ABC(A04(62, 3, 33), AbstractC1107Td.A0Z, new C1108Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C1695gi c1695gi, O8 o8, String str, JSONObject jSONObject) {
        NQ nq = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nq = C1854jT.A01(jSONObject, c1695gi, true);
                nq.A1Q(true);
                nq.A1N(A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            } catch (JSONException unused) {
            }
        }
        if (nq == null) {
            nq = C05727n.A00(jSONObject, c1695gi);
        }
        nq.A1M(str);
        C1127Tx A01 = o8.A01();
        if (A01 != null) {
            nq.A1I(A01.A06());
        }
        return nq;
    }

    private C1101Sx A03(C1695gi c1695gi) {
        return this.A00 != null ? this.A00 : new C1101Sx(c1695gi);
    }

    private void A08(C1695gi c1695gi, C05727n c05727n) {
        C0967No playableData = c05727n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1356bD.A05);
        C1840jC c1840jC = new C1840jC(this);
        C1101Sx c1101Sx = new C1101Sx(c1695gi);
        boolean z = C1145Up.A2H(c1695gi) && SN.A0A(c05727n.A1H());
        if (z) {
            SN unifiedAssetsLoader = new SN(c1101Sx, c05727n.A1H(), c05727n.A10(), c05727n.A1D(), z, new C1839jB(this));
            c1101Sx.A0e(new VI(c05727n.A2E(), c1695gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c1695gi, c05727n, true, c1840jC);
    }

    private void A09(C1695gi c1695gi, EnumSet<CacheFlag> enumSet, AbstractC1860jd abstractC1860jd, int i, InterfaceC0972Nt interfaceC0972Nt) {
        boolean isDSL = abstractC1860jd.A1g();
        C1101Sx A03 = A03(c1695gi);
        A03.A0e(new VI(abstractC1860jd.A2E(), c1695gi.A0A()));
        boolean z = C1145Up.A2H(c1695gi) && SN.A0A(abstractC1860jd.A1H());
        if (z) {
            new SN(A03, abstractC1860jd.A1H(), abstractC1860jd.A10(), abstractC1860jd.A1D(), z, new C1843jF(this, c1695gi, isDSL, abstractC1860jd, interfaceC0972Nt)).A0B();
            return;
        }
        String A04 = A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        if (isDSL) {
            C1097St c1097St = new C1097St(abstractC1860jd.A0x(), abstractC1860jd.A1D(), A04);
            c1097St.A04 = true;
            c1097St.A03 = A04(0, 5, 78);
            A03.A0Y(c1097St);
        }
        A03.A0d(new C1099Sv(abstractC1860jd.A2C().A01(), C1532e4.A04, C1532e4.A04, abstractC1860jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean A30 = C1145Up.A30(c1695gi, C1622fX.A03());
        for (NR nr : abstractC1860jd.A2G()) {
            C1099Sv c1099Sv = new C1099Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC1860jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            if (i2 == 0) {
                A03.A0c(c1099Sv);
            } else {
                A03.A0d(c1099Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                A03.A0d(new C1099Sv(it.next(), -1, -1, abstractC1860jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1097St c1097St2 = new C1097St(nr.A0H().A09(), abstractC1860jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), nr.A0H().A06());
                c1097St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !A30) {
                        A03.A0Y(c1097St2);
                    } else {
                        A03.A0b(c1097St2);
                    }
                } else if (isDSL && !A30) {
                    A03.A0Z(c1097St2);
                } else {
                    A03.A0a(c1097St2);
                }
            }
            i2++;
        }
        if (abstractC1860jd.A1W() && !TextUtils.isEmpty(abstractC1860jd.A11())) {
            A03.A0d(new C1099Sv(abstractC1860jd.A11(), C1009Pe.A0A, C1009Pe.A0A, abstractC1860jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        }
        O0.A00(abstractC1860jd, A03, A04);
        A03.A0X(new C1841jD(this, c1695gi, isDSL, abstractC1860jd, interfaceC0972Nt), new C1094Sq(abstractC1860jd.A1D(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1695gi c1695gi, EnumSet<CacheFlag> enumSet, C1854jT c1854jT, AbstractC1860jd abstractC1860jd, int i, InterfaceC0972Nt interfaceC0972Nt) {
        A09(c1695gi, enumSet, abstractC1860jd, i, new C1845jH(this, c1695gi, abstractC1860jd, c1854jT, i, interfaceC0972Nt, enumSet));
    }

    private void A0B(EnumC1356bD enumC1356bD) {
        this.A01 = enumC1356bD;
    }

    private boolean A0C(C1695gi c1695gi, AbstractC1860jd abstractC1860jd) {
        AdError A00 = A00(c1695gi, abstractC1860jd);
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
    
        return com.instagram.common.viewpoint.core.WK.A0C;
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
        AbstractC1860jd abstractC1860jd = (AbstractC1860jd) this.A03;
        if (abstractC1860jd.A1g()) {
            return WK.A06;
        }
        if (abstractC1860jd.A2G().size() > 1) {
            return WK.A0A;
        }
        C0967No A07 = abstractC1860jd.A29().A0H().A07();
        if (A06[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (A07 != null) {
            if (!abstractC1860jd.A1n()) {
                boolean A1u = abstractC1860jd.A1u();
                if (A06[0].length() != 2) {
                    String[] strArr2 = A06;
                    strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
                    strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
                }
            }
            return WK.A0E;
        }
        boolean A0L = A0L(abstractC1860jd);
        if (A06[0].length() == 2) {
            throw new RuntimeException();
        }
        A06[0] = "iDu";
        if (A0L) {
            return WK.A0D;
        }
        return WK.A0B;
    }

    public final EnumC1356bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C1854jT) this.A03).A2A();
        }
        return ((AbstractC1860jd) this.A03).A2E();
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

    public final void A0J(C1695gi c1695gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C1854jT c1854jT = (C1854jT) this.A03;
            AbstractC1860jd A26 = c1854jT.A26();
            if (A0C(c1695gi, A26) || A26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1695gi, enumSet, c1854jT, A26, 0, this.A04);
            return;
        }
        AbstractC1860jd abstractC1860jd = (AbstractC1860jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1695gi, abstractC1860jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C05727n c05727n = (C05727n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1695gi, c05727n);
                return;
            } else {
                A08(c1695gi, c05727n);
                return;
            }
        }
        A09(c1695gi, enumSet, (C05727n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC1860jd abstractC1860jd) {
        return !TextUtils.isEmpty(abstractC1860jd.A29().A0H().A09());
    }
}
