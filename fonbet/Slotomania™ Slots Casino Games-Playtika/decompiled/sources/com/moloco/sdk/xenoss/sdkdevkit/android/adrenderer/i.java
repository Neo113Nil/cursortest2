package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class i {
    public static final i a = new i("VAST", 0);
    public static final i b = new i("MRAID", 1);
    public static final i c = new i("STATIC", 2);
    public static final i d = new i("TEMPLATE_VAST", 3);
    public static final i e = new i("TEMPLATE_MRAID", 4);
    public static final i f = new i("TEMPLATE_STATIC", 5);
    public static final i g = new i("UNKNOWN", 6);
    public static final /* synthetic */ i[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        i[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
    }

    public i(String str, int i2) {
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{a, b, c, d, e, f, g};
    }

    public static EnumEntries<i> b() {
        return i;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) h.clone();
    }
}
