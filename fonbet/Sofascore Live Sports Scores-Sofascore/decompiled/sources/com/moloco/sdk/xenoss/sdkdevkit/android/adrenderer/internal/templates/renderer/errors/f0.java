package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {
    public static final f0 a;
    public static final f0 b;
    public static final f0 c;
    public static final f0 d;
    public static final f0 e;
    public static final f0 f;
    public static final f0 g;
    public static final /* synthetic */ f0[] h;

    static {
        f0 f0Var = new f0("UNKNOWN_ERROR", 0);
        a = f0Var;
        f0 f0Var2 = new f0("WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        b = f0Var2;
        f0 f0Var3 = new f0("WEBVIEW_RECEIVED_ERROR", 2);
        c = f0Var3;
        f0 f0Var4 = new f0("WEBVIEW_REQUIRED_CONTENT_HTTP_ERROR", 3);
        d = f0Var4;
        f0 f0Var5 = new f0("WEBVIEW_RENDER_PROCESS_GONE_ERROR", 4);
        e = f0Var5;
        f0 f0Var6 = new f0("WEBVIEW_TIMEOUT_ERROR", 5);
        f = f0Var6;
        f0 f0Var7 = new f0("WEBVIEW_NOT_AVAILABLE_ERROR", 6);
        f0 f0Var8 = new f0("WEBVIEW_FULLSCREEN_ACTIVITY_START_FAILED", 7);
        g = f0Var8;
        h = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) h.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
