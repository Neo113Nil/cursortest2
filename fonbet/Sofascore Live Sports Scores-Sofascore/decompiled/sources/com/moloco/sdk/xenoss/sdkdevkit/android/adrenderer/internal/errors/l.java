package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l implements c {
    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final /* synthetic */ l[] f;

    static {
        l lVar = new l("VAST_AD_EXOPLAYER_VIDEO_LAYER_ERROR", 0);
        a = lVar;
        l lVar2 = new l("VAST_AD_EXOPLAYER_STYLED_PLAYER_VIEW_INFLATE_EXCEPTION_ERROR", 1);
        b = lVar2;
        l lVar3 = new l("VAST_AD_EXOPLAYER_SET_MEDIA_ITEM_EXCEPTION_ERROR", 2);
        c = lVar3;
        l lVar4 = new l("VAST_AD_EXOPLAYER_SET_MEDIA_FILE_NOT_EXISTS_ERROR", 3);
        d = lVar4;
        l lVar5 = new l("VAST_AD_COMPOSE_VIEW_NOT_AVAILABLE", 4);
        e = lVar5;
        f = new l[]{lVar, lVar2, lVar3, lVar4, lVar5};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
