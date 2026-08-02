package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b implements c {
    public static final b a = new b("FULLSCREEN_AD_SHOW_FAILED_NO_SUPPORTED_TYPE", 0);
    public static final /* synthetic */ b[] b;
    public static final /* synthetic */ EnumEntries c;

    static {
        b[] b2 = b();
        b = b2;
        c = EnumEntriesKt.enumEntries(b2);
    }

    public b(String str, int i) {
    }

    public static final /* synthetic */ b[] b() {
        return new b[]{a};
    }

    public static EnumEntries<b> c() {
        return c;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) b.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
