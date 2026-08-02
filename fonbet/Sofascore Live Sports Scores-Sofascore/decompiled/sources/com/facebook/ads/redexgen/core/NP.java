package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC2501eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A01();
    }

    public NP(NO no) {
        this.A00 = no;
    }

    public /* synthetic */ NP(NO no, OV ov) {
        this(no);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AEA() {
        boolean z;
        AbstractC2817jd abstractC2817jd;
        InterfaceC2193Yh interfaceC2193Yh;
        ZU zu;
        VA va;
        AbstractC2817jd abstractC2817jd2;
        C2503eI c2503eI;
        C2503eI c2503eI2;
        C2652gi c2652gi;
        ZU zu2;
        AbstractC2817jd abstractC2817jd3;
        AbstractC2817jd abstractC2817jd4;
        C2652gi c2652gi2;
        AbstractC2817jd abstractC2817jd5;
        AbstractC2817jd abstractC2817jd6;
        C2652gi c2652gi3;
        C1924No c1924No;
        C2652gi c2652gi4;
        C2652gi c2652gi5;
        z = this.A00.A0f;
        if (!z) {
            abstractC2817jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC2817jd.A2E())) {
                va = this.A00.A0S;
                abstractC2817jd2 = this.A00.A0O;
                String A2E = abstractC2817jd2.A2E();
                C2309b9 c2309b9 = new C2309b9();
                c2503eI = this.A00.A0B;
                C2309b9 A03 = c2309b9.A03(c2503eI.getViewabilityChecker());
                c2503eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c2503eI2.getTouchDataRecorder()).A05());
                c2652gi = this.A00.A0R;
                C2148Wl A00 = C2148Wl.A00(c2652gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC2817jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC2817jd3.A2E());
                abstractC2817jd4 = this.A00.A0O;
                C1916Ng A2A = abstractC2817jd4.A2A();
                c2652gi2 = this.A00.A0R;
                C1916Ng.A07(A2A, c2652gi2);
                abstractC2817jd5 = this.A00.A0O;
                String A0y = abstractC2817jd5.A0y();
                abstractC2817jd6 = this.A00.A0O;
                AbstractC1936Oa.A02(A0y, AbstractC2172Xm.A00(abstractC2817jd6.A10()));
                c2652gi3 = this.A00.A0R;
                c2652gi3.A0F().A3L();
                c1924No = this.A00.A0P;
                if (c1924No.A0c()) {
                    c2652gi4 = this.A00.A0R;
                    c2652gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC2193Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC2193Yh.A4j(zu.A8G());
            return;
        }
        c2652gi5 = this.A00.A0R;
        c2652gi5.A0F().AET();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AEh() {
        InterfaceC2193Yh interfaceC2193Yh;
        ZU zu;
        interfaceC2193Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC2193Yh.A4j(zu.A81());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AFQ() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AGg() {
        InterfaceC2193Yh interfaceC2193Yh;
        interfaceC2193Yh = this.A00.A0W;
        interfaceC2193Yh.ADJ(15);
    }
}
