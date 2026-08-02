package com.ironsource;

/* renamed from: com.ironsource.a2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4217a2 {
    public static final C4217a2 a = new C4217a2();
    public static final String b = "trials_fail";
    public static final String c = "parsing";
    public static final String d = "other";
    public static final String e = "disabled";
    public static final String f = "-1";

    private C4217a2() {
    }

    public final String a(boolean z) {
        return !z ? f : defpackage.k0.a(System.currentTimeMillis(), "fallback_");
    }

    public static /* synthetic */ String a(C4217a2 c4217a2, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c4217a2.a(z, num);
    }

    public final String a(boolean z, Integer num) {
        if (z) {
            return (num != null && num.intValue() == 1003) ? c : (num != null && num.intValue() == 1008) ? c : (num != null && num.intValue() == 1002) ? c : (num != null && num.intValue() == 1006) ? b : (num != null && num.intValue() == 1001) ? b : "other";
        }
        return e;
    }
}
