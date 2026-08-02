package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p {
    public static final p a;
    public static final p b;
    public static final /* synthetic */ p[] c;

    static {
        p pVar = new p("SkipOrClose", 0);
        a = pVar;
        p pVar2 = new p("ClickThrough", 1);
        b = pVar2;
        c = new p[]{pVar, pVar2};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) c.clone();
    }
}
