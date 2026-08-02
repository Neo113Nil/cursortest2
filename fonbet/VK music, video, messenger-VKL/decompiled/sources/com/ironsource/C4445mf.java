package com.ironsource;

/* renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4445mf implements Jb<AbstractC4338gf, C4608w> {
    @Override // com.ironsource.Jb
    public C4608w a(AbstractC4338gf abstractC4338gf) {
        String str;
        String str2;
        String str3;
        S7 s7;
        String str4;
        String str5;
        String str6;
        S7 s72;
        String c;
        EnumC4463nf b = abstractC4338gf.b();
        P a = abstractC4338gf.a();
        if (a == null || (str = a.h()) == null) {
            str = "0";
        }
        P a2 = abstractC4338gf.a();
        if (a2 == null || (str2 = a2.i()) == null) {
            str2 = "0";
        }
        P a3 = abstractC4338gf.a();
        if (a3 == null || (str3 = a3.g()) == null) {
            str3 = "0";
        }
        P a4 = abstractC4338gf.a();
        if (a4 == null || (s7 = a4.e()) == null) {
            s7 = S7.UnknownProvider;
        }
        P a5 = abstractC4338gf.a();
        if (a5 == null || (c = a5.c()) == null) {
            S7 s73 = s7;
            str4 = "0";
            str5 = str2;
            str6 = str3;
            s72 = s73;
        } else {
            str5 = str2;
            str6 = str3;
            s72 = s7;
            str4 = c;
        }
        return new C4608w(b, str, str5, str6, s72, str4);
    }
}
