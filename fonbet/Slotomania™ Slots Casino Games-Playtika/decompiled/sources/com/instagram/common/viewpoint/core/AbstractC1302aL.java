package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1302aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1306aP A00(AbstractC1860jd abstractC1860jd) {
        if (abstractC1860jd.A2U()) {
            EnumC1306aP enumC1306aP = EnumC1306aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1306aP;
        }
        return EnumC1306aP.A03;
    }

    public static void A01(C1695gi c1695gi, EnumC1303aM enumC1303aM) {
        c1695gi.A0F().AAz(enumC1303aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C1695gi c1695gi, EnumC1303aM enumC1303aM) {
        c1695gi.A0F().AB9(enumC1303aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C1695gi c1695gi, EnumC1303aM enumC1303aM) {
        c1695gi.A0F().AC7(enumC1303aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C1695gi c1695gi, EnumC1303aM enumC1303aM) {
        A01(c1695gi, enumC1303aM);
    }

    public static void A05(C1695gi c1695gi, EnumC1303aM enumC1303aM) {
        A02(c1695gi, enumC1303aM);
    }

    public static void A06(C1695gi c1695gi, EnumC1303aM enumC1303aM) {
        A03(c1695gi, enumC1303aM);
    }

    public static void A07(VI vi, C1695gi c1695gi, InterfaceC1236Yh interfaceC1236Yh, AbstractC1860jd abstractC1860jd, EnumC1303aM enumC1303aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC1860jd.A2Q()) {
            c1695gi.A0F().AB8(enumC1303aM.name().toLowerCase(Locale.US));
        }
        if (abstractC1860jd.A2U()) {
            c1695gi.A0F().AAy(enumC1303aM.name().toLowerCase(Locale.US));
        }
        C0985Og A002 = AbstractC0986Oh.A00(c1695gi.A02());
        C1691ge A02 = c1695gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (A002.A0O(A02, true)) {
            if (interfaceC1236Yh != null) {
                interfaceC1236Yh.AAo(abstractC1860jd.A2E(), abstractC1860jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC1860jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c1695gi, XB.A00(abstractC1860jd.A2C().A00()), abstractC1860jd.A2E());
        }
    }
}
