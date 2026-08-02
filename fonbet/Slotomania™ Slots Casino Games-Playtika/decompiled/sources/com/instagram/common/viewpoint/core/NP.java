package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC1544eG {
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
        A01 = new byte[]{Ascii.EM, Ascii.ETB, 9, Ascii.SYN, 7, Ascii.DLE, Ascii.CR, 7, Ascii.SI};
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AEA() {
        boolean z;
        AbstractC1860jd abstractC1860jd;
        InterfaceC1236Yh interfaceC1236Yh;
        ZU zu;
        VA va;
        AbstractC1860jd abstractC1860jd2;
        C1546eI c1546eI;
        C1546eI c1546eI2;
        C1695gi c1695gi;
        ZU zu2;
        AbstractC1860jd abstractC1860jd3;
        AbstractC1860jd abstractC1860jd4;
        C1695gi c1695gi2;
        AbstractC1860jd abstractC1860jd5;
        AbstractC1860jd abstractC1860jd6;
        C1695gi c1695gi3;
        C0967No c0967No;
        C1695gi c1695gi4;
        C1695gi c1695gi5;
        z = this.A00.A0f;
        if (!z) {
            abstractC1860jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC1860jd.A2E())) {
                va = this.A00.A0S;
                abstractC1860jd2 = this.A00.A0O;
                String A2E = abstractC1860jd2.A2E();
                C1352b9 c1352b9 = new C1352b9();
                c1546eI = this.A00.A0B;
                C1352b9 A03 = c1352b9.A03(c1546eI.getViewabilityChecker());
                c1546eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c1546eI2.getTouchDataRecorder()).A05());
                c1695gi = this.A00.A0R;
                C1191Wl A00 = C1191Wl.A00(c1695gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC1860jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC1860jd3.A2E());
                abstractC1860jd4 = this.A00.A0O;
                C0959Ng A2A = abstractC1860jd4.A2A();
                c1695gi2 = this.A00.A0R;
                C0959Ng.A07(A2A, c1695gi2);
                abstractC1860jd5 = this.A00.A0O;
                String A0y = abstractC1860jd5.A0y();
                abstractC1860jd6 = this.A00.A0O;
                AbstractC0979Oa.A02(A0y, AbstractC1215Xm.A00(abstractC1860jd6.A10()));
                c1695gi3 = this.A00.A0R;
                c1695gi3.A0F().A3L();
                c0967No = this.A00.A0P;
                if (c0967No.A0c()) {
                    c1695gi4 = this.A00.A0R;
                    c1695gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC1236Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC1236Yh.A4j(zu.A8G());
            return;
        }
        c1695gi5 = this.A00.A0R;
        c1695gi5.A0F().AET();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AEh() {
        InterfaceC1236Yh interfaceC1236Yh;
        ZU zu;
        interfaceC1236Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC1236Yh.A4j(zu.A81());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AFQ() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AGg() {
        InterfaceC1236Yh interfaceC1236Yh;
        interfaceC1236Yh = this.A00.A0W;
        interfaceC1236Yh.ADJ(15);
    }
}
