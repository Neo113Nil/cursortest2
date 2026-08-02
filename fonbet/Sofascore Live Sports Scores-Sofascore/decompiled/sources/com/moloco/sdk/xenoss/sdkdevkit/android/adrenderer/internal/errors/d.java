package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d implements c {
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static final /* synthetic */ d[] o;

    static {
        d dVar = new d("MRAID_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 0);
        a = dVar;
        d dVar2 = new d("MRAID_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 1);
        b = dVar2;
        d dVar3 = new d("MRAID_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 2);
        c = dVar3;
        d dVar4 = new d("MRAID_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 3);
        d = dVar4;
        d dVar5 = new d("MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR", 4);
        e = dVar5;
        d dVar6 = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 5);
        f = dVar6;
        d dVar7 = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 6);
        g = dVar7;
        d dVar8 = new d("MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 7);
        h = dVar8;
        d dVar9 = new d("MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 8);
        i = dVar9;
        d dVar10 = new d("MRAID_FULLSCREEN_AD_ACTIVITY_SHOW_FAILED_ERROR", 9);
        j = dVar10;
        d dVar11 = new d("MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 10);
        k = dVar11;
        d dVar12 = new d("MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 11);
        l = dVar12;
        d dVar13 = new d("MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 12);
        m = dVar13;
        d dVar14 = new d("MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 13);
        n = dVar14;
        o = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) o.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
