package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d0 {
    public static final d0 a;
    public static final d0 b;
    public static final d0 c;
    public static final /* synthetic */ d0[] d;

    static {
        d0 d0Var = new d0("SILENT", 0);
        a = d0Var;
        d0 d0Var2 = new d0("VIBRATE", 1);
        b = d0Var2;
        d0 d0Var3 = new d0("NORMAL", 2);
        c = d0Var3;
        d = new d0[]{d0Var, d0Var2, d0Var3};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) d.clone();
    }
}
