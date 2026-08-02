package com.plaid.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class L6 {
    public static final L6 ALL;
    public static final L6 ERRORS_ONLY;
    public static final L6 NONE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ L6[] f39347a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f39348b;

    static {
        L6 l62 = new L6("NONE", 0);
        NONE = l62;
        L6 l63 = new L6("ERRORS_ONLY", 1);
        ERRORS_ONLY = l63;
        L6 l64 = new L6("ALL", 2);
        ALL = l64;
        L6[] l6Arr = {l62, l63, l64};
        f39347a = l6Arr;
        f39348b = EnumEntriesKt.enumEntries(l6Arr);
    }

    public L6(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<L6> getEntries() {
        return f39348b;
    }

    public static L6 valueOf(String str) {
        return (L6) Enum.valueOf(L6.class, str);
    }

    public static L6[] values() {
        return (L6[]) f39347a.clone();
    }
}
