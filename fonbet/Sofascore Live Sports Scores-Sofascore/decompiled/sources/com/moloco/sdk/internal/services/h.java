package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h {
    public static final h a;
    public static final h b;
    public static final h c;
    public static final /* synthetic */ h[] d;

    static {
        h hVar = new h("UNKNOWN", 0);
        a = hVar;
        h hVar2 = new h("PORTRAIT", 1);
        b = hVar2;
        h hVar3 = new h("LANDSCAPE", 2);
        c = hVar3;
        d = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) d.clone();
    }
}
