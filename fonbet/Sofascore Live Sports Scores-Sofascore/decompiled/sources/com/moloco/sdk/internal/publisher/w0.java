package com.moloco.sdk.internal.publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class w0 {
    public static final w0 a;
    public static final w0 b;
    public static final w0 c;
    public static final w0 d;
    public static final w0 e;
    public static final w0 f;
    public static final w0 g;
    public static final w0 h;
    public static final /* synthetic */ w0[] i;

    static {
        w0 w0Var = new w0(com.ironsource.mediationsdk.j.a, 0);
        a = w0Var;
        w0 w0Var2 = new w0("BANNER_TABLET", 1);
        b = w0Var2;
        w0 w0Var3 = new w0("MREC", 2);
        c = w0Var3;
        w0 w0Var4 = new w0("INLINE_ADAPTIVE_BANNER", 3);
        d = w0Var4;
        w0 w0Var5 = new w0("ANCHORED_ADAPTIVE_BANNER", 4);
        e = w0Var5;
        w0 w0Var6 = new w0("NATIVE_AD_MEDIATION", 5);
        f = w0Var6;
        w0 w0Var7 = new w0("NATIVE_BANNER", 6);
        w0 w0Var8 = new w0("INTERSTITIAL", 7);
        g = w0Var8;
        w0 w0Var9 = new w0("REWARDED", 8);
        h = w0Var9;
        i = new w0[]{w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, w0Var9};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) i.clone();
    }
}
