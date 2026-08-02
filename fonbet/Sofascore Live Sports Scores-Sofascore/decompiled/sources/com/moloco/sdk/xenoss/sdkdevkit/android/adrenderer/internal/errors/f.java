package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f implements c {
    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final /* synthetic */ f[] g;

    static {
        f fVar = new f("NATIVE_AD_ORTB_RESPONSE_NULL_ERROR", 0);
        a = fVar;
        f fVar2 = new f("NATIVE_AD_IMAGE_ASSET_MEDIA_FETCH_ERROR", 1);
        b = fVar2;
        f fVar3 = new f("NATIVE_AD_IMAGE_PREPARE_ASSET_UNKNOWN_ERROR", 2);
        c = fVar3;
        f fVar4 = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_NOT_ENOUGH_ERROR", 3);
        d = fVar4;
        f fVar5 = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_FETCH_ERROR", 4);
        e = fVar5;
        f fVar6 = new f("NATIVE_AD_COMPOSE_VIEW_NOT_AVAILABLE_ERROR", 5);
        f = fVar6;
        g = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
