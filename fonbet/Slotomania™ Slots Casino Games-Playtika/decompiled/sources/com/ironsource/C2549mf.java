package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2549mf implements Ib<AbstractC2442gf, C2712w> {
    @Override // com.ironsource.Ib
    public C2712w a(AbstractC2442gf input) {
        String str;
        String str2;
        String str3;
        R7 r7;
        String c;
        Intrinsics.checkNotNullParameter(input, "input");
        EnumC2567nf b = input.b();
        P a = input.a();
        if (a == null || (str = a.h()) == null) {
            str = "0";
        }
        P a2 = input.a();
        if (a2 == null || (str2 = a2.i()) == null) {
            str2 = "0";
        }
        P a3 = input.a();
        if (a3 == null || (str3 = a3.g()) == null) {
            str3 = "0";
        }
        P a4 = input.a();
        if (a4 == null || (r7 = a4.e()) == null) {
            r7 = R7.UnknownProvider;
        }
        P a5 = input.a();
        return new C2712w(b, str, str2, str3, r7, (a5 == null || (c = a5.c()) == null) ? "0" : c);
    }
}
