package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final /* synthetic */ m[] g;

    static {
        m mVar = new m("VAST", 0);
        a = mVar;
        m mVar2 = new m("MRAID", 1);
        b = mVar2;
        m mVar3 = new m("STATIC", 2);
        c = mVar3;
        m mVar4 = new m("TEMPLATE_VAST", 3);
        d = mVar4;
        m mVar5 = new m("TEMPLATE_MRAID", 4);
        e = mVar5;
        m mVar6 = new m("TEMPLATE_STATIC", 5);
        f = mVar6;
        g = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("UNKNOWN", 6)};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) g.clone();
    }
}
