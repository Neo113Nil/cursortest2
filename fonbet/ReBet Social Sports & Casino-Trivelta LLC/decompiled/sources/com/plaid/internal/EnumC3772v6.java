package com.plaid.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.v6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3772v6 {
    public static final EnumC3772v6 ENQUEUE;
    public static final EnumC3772v6 ENQUEUE_AND_FLUSH;
    public static final EnumC3772v6 NO_ENQUEUE;
    public static final EnumC3772v6 UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC3772v6[] f41150b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f41151c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f41152a;

    static {
        EnumC3772v6 enumC3772v6 = new EnumC3772v6("ENQUEUE", 0, "QUEUE_BEHAVIOR_ENQUEUE");
        ENQUEUE = enumC3772v6;
        EnumC3772v6 enumC3772v62 = new EnumC3772v6("ENQUEUE_AND_FLUSH", 1, "QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH");
        ENQUEUE_AND_FLUSH = enumC3772v62;
        EnumC3772v6 enumC3772v63 = new EnumC3772v6("NO_ENQUEUE", 2, "QUEUE_BEHAVIOR_NO_ENQUEUE");
        NO_ENQUEUE = enumC3772v63;
        EnumC3772v6 enumC3772v64 = new EnumC3772v6("UNKNOWN", 3, "QUEUE_BEHAVIOR_UNKNOWN");
        UNKNOWN = enumC3772v64;
        EnumC3772v6[] enumC3772v6Arr = {enumC3772v6, enumC3772v62, enumC3772v63, enumC3772v64};
        f41150b = enumC3772v6Arr;
        f41151c = EnumEntriesKt.enumEntries(enumC3772v6Arr);
    }

    public EnumC3772v6(String str, int i10, String str2) {
        this.f41152a = str2;
    }

    @NotNull
    public static EnumEntries<EnumC3772v6> getEntries() {
        return f41151c;
    }

    public static EnumC3772v6 valueOf(String str) {
        return (EnumC3772v6) Enum.valueOf(EnumC3772v6.class, str);
    }

    public static EnumC3772v6[] values() {
        return (EnumC3772v6[]) f41150b.clone();
    }

    @NotNull
    public final String getProtoString() {
        return this.f41152a;
    }
}
