package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4168kf implements Hb<AbstractC4061ef, C4367w> {
    @Override // com.ironsource.Hb
    @NotNull
    public C4367w a(@NotNull AbstractC4061ef abstractC4061ef) {
        String str;
        String str2;
        String str3;
        P7 p7;
        String c;
        abstractC4061ef.getClass();
        EnumC4186lf b = abstractC4061ef.b();
        P a = abstractC4061ef.a();
        if (a == null || (str = a.h()) == null) {
            str = "0";
        }
        P a2 = abstractC4061ef.a();
        if (a2 == null || (str2 = a2.i()) == null) {
            str2 = "0";
        }
        P a3 = abstractC4061ef.a();
        if (a3 == null || (str3 = a3.g()) == null) {
            str3 = "0";
        }
        P a4 = abstractC4061ef.a();
        if (a4 == null || (p7 = a4.e()) == null) {
            p7 = P7.UnknownProvider;
        }
        P a5 = abstractC4061ef.a();
        return new C4367w(b, str, str2, str3, p7, (a5 == null || (c = a5.c()) == null) ? "0" : c);
    }
}
