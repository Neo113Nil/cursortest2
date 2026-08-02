package com.swmansion.rnscreens.gamma.common.colorscheme;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f41808a = new a("INHERIT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f41809b = new a("LIGHT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f41810c = new a("DARK", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f41811d;

    static {
        a[] a10 = a();
        $VALUES = a10;
        f41811d = EnumEntriesKt.enumEntries(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f41808a, f41809b, f41810c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
