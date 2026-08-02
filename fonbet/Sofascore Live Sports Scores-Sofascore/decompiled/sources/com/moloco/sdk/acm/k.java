package com.moloco.sdk.acm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k {
    public static final k a;
    public static final k b;
    public static final k c;
    public static final /* synthetic */ k[] d;

    static {
        k kVar = new k("INITIALIZED", 0);
        a = kVar;
        k kVar2 = new k("INITIALIZING", 1);
        b = kVar2;
        k kVar3 = new k("UNINITIALIZED", 2);
        c = kVar3;
        d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) d.clone();
    }
}
