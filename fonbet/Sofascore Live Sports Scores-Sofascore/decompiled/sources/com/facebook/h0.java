package com.facebook;

import com.ironsource.C4094gc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h0 {
    public static final h0 a;
    public static final h0 b;
    public static final /* synthetic */ h0[] c;

    static {
        h0 h0Var = new h0(C4094gc.a, 0);
        a = h0Var;
        h0 h0Var2 = new h0(C4094gc.b, 1);
        b = h0Var2;
        c = new h0[]{h0Var, h0Var2, new h0("DELETE", 2)};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) c.clone();
    }
}
