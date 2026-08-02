package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j implements c {
    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final /* synthetic */ j[] e;

    static {
        j jVar = new j("STATIC_FULLSCREEN_AD_UNKNOWN_ERROR", 0);
        a = jVar;
        j jVar2 = new j("STATIC_FULLSCREEN_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        b = jVar2;
        j jVar3 = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RECEIVED_ERROR", 2);
        c = jVar3;
        j jVar4 = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);
        d = jVar4;
        e = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
