package com.swmansion.rnscreens.gamma.tabs.container;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final b f41863a = new b("USER", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f41864b = new b("PROGRAMMATIC_JS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f41865c = new b("PROGRAMMATIC_NATIVE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f41866d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f41863a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f41864b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f41865c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        b[] a10 = a();
        $VALUES = a10;
        f41866d = EnumEntriesKt.enumEntries(a10);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f41863a, f41864b, f41865c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "user";
        }
        if (i10 == 2) {
            return "programmatic-js";
        }
        if (i10 == 3) {
            return "programmatic-native";
        }
        throw new NoWhenBranchMatchedException();
    }
}
