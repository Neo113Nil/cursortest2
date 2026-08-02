package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2259aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC2263aP A00(AbstractC2817jd abstractC2817jd) {
        if (abstractC2817jd.A2U()) {
            EnumC2263aP enumC2263aP = EnumC2263aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC2263aP;
        }
        return EnumC2263aP.A03;
    }

    public static void A01(C2652gi c2652gi, EnumC2260aM enumC2260aM) {
        c2652gi.A0F().AAz(enumC2260aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C2652gi c2652gi, EnumC2260aM enumC2260aM) {
        c2652gi.A0F().AB9(enumC2260aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C2652gi c2652gi, EnumC2260aM enumC2260aM) {
        c2652gi.A0F().AC7(enumC2260aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C2652gi c2652gi, EnumC2260aM enumC2260aM) {
        A01(c2652gi, enumC2260aM);
    }

    public static void A05(C2652gi c2652gi, EnumC2260aM enumC2260aM) {
        A02(c2652gi, enumC2260aM);
    }

    public static void A06(C2652gi c2652gi, EnumC2260aM enumC2260aM) {
        A03(c2652gi, enumC2260aM);
    }

    public static void A07(VI vi, C2652gi c2652gi, InterfaceC2193Yh interfaceC2193Yh, AbstractC2817jd abstractC2817jd, EnumC2260aM enumC2260aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC2817jd.A2Q()) {
            c2652gi.A0F().AB8(enumC2260aM.name().toLowerCase(Locale.US));
        }
        if (abstractC2817jd.A2U()) {
            c2652gi.A0F().AAy(enumC2260aM.name().toLowerCase(Locale.US));
        }
        C1942Og A002 = AbstractC1943Oh.A00(c2652gi.A02());
        C2648ge A02 = c2652gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (A002.A0O(A02, true)) {
            if (interfaceC2193Yh != null) {
                interfaceC2193Yh.AAo(abstractC2817jd.A2E(), abstractC2817jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC2817jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c2652gi, XB.A00(abstractC2817jd.A2C().A00()), abstractC2817jd.A2E());
        }
    }
}
