package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements c {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final /* synthetic */ a[] j;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("STATIC_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 0);
        a aVar2 = new a("VAST_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 1);
        a = aVar2;
        a aVar3 = new a("MRAID_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 2);
        b = aVar3;
        a aVar4 = new a("NATIVE_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 3);
        c = aVar4;
        a aVar5 = new a("VAST_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 4);
        d = aVar5;
        a aVar6 = new a("MRAID_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 5);
        e = aVar6;
        a aVar7 = new a("STATIC_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 6);
        f = aVar7;
        a aVar8 = new a("VAST_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 7);
        g = aVar8;
        a aVar9 = new a("MRAID_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 8);
        h = aVar9;
        a aVar10 = new a("STATIC_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 9);
        i = aVar10;
        j = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) j.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
