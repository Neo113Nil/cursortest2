package com.ironsource;

import defpackage.vxd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y1 {

    @NotNull
    public static final Y1 a = new Y1();

    @NotNull
    public static final String b = "trials_fail";

    @NotNull
    public static final String c = "parsing";

    @NotNull
    public static final String d = "other";

    @NotNull
    public static final String e = "disabled";

    @NotNull
    public static final String f = "-1";

    private Y1() {
    }

    @NotNull
    public final String a(boolean z, @Nullable Integer num) {
        return !z ? e : (num != null && num.intValue() == 1003) ? c : (num != null && num.intValue() == 1008) ? c : (num != null && num.intValue() == 1002) ? c : (num != null && num.intValue() == 1006) ? b : (num != null && num.intValue() == 1001) ? b : "other";
    }

    public static /* synthetic */ String a(Y1 y1, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return y1.a(z, num);
    }

    @NotNull
    public final String a(boolean z) {
        if (!z) {
            return f;
        }
        return vxd.l(System.currentTimeMillis(), "fallback_");
    }
}
