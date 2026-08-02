package com.swmansion.rnscreens.gamma.stack.header.subview;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final e f41833a = new e("BACKGROUND", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final e f41834b = new e("LEADING", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f41835c = new e("CENTER", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final e f41836d = new e("TRAILING", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f41837e;

    static {
        e[] a10 = a();
        $VALUES = a10;
        f41837e = EnumEntriesKt.enumEntries(a10);
    }

    public e(String str, int i10) {
    }

    public static final /* synthetic */ e[] a() {
        return new e[]{f41833a, f41834b, f41835c, f41836d};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
