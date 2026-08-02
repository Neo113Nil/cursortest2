package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n {
    public static final n a;
    public static final n b;
    public static final /* synthetic */ n[] c;

    static {
        n nVar = new n("Image", 0);
        a = nVar;
        n nVar2 = new n("JS", 1);
        b = nVar2;
        c = new n[]{nVar, nVar2};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) c.clone();
    }
}
