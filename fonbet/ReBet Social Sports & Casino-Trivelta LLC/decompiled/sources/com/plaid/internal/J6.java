package com.plaid.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class J6 {
    public static final J6 DEBUG;
    public static final J6 ERROR;
    public static final J6 INFO;
    public static final J6 WARN;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ J6[] f39313a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f39314b;

    static {
        J6 j62 = new J6("DEBUG", 0);
        DEBUG = j62;
        J6 j63 = new J6("INFO", 1);
        INFO = j63;
        J6 j64 = new J6("WARN", 2);
        WARN = j64;
        J6 j65 = new J6("ERROR", 3);
        ERROR = j65;
        J6[] j6Arr = {j62, j63, j64, j65};
        f39313a = j6Arr;
        f39314b = EnumEntriesKt.enumEntries(j6Arr);
    }

    public J6(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<J6> getEntries() {
        return f39314b;
    }

    public static J6 valueOf(String str) {
        return (J6) Enum.valueOf(J6.class, str);
    }

    public static J6[] values() {
        return (J6[]) f39313a.clone();
    }
}
