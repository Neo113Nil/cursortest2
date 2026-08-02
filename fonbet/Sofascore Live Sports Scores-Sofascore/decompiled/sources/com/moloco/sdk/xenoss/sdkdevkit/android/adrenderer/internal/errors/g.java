package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements c {
    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final /* synthetic */ g[] e;

    static {
        g gVar = new g("STATIC_AD_UNKNOWN_ERROR", 0);
        a = gVar;
        g gVar2 = new g("STATIC_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        b = gVar2;
        g gVar3 = new g("STATIC_AD_WEBVIEW_RECEIVED_ERROR", 2);
        c = gVar3;
        g gVar4 = new g("STATIC_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);
        d = gVar4;
        e = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
