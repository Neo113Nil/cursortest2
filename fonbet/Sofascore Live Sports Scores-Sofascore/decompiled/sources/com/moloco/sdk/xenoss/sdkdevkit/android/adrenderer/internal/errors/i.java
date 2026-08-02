package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i implements c {
    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final /* synthetic */ i[] e;

    static {
        i iVar = new i("STATIC_BANNER_AD_UNKNOWN_ERROR", 0);
        a = iVar;
        i iVar2 = new i("STATIC_BANNER_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        b = iVar2;
        i iVar3 = new i("STATIC_BANNER_AD_WEBVIEW_RECEIVED_ERROR", 2);
        c = iVar3;
        i iVar4 = new i("STATIC_BANNER_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);
        d = iVar4;
        e = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
