package com.swmansion.rnscreens.gamma.tabs.container;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final q f41915a = new q("STALE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final q f41916b = new q("REPEATED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f41917c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.f41915a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.f41916b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        q[] a10 = a();
        $VALUES = a10;
        f41917c = EnumEntriesKt.enumEntries(a10);
    }

    public q(String str, int i10) {
    }

    public static final /* synthetic */ q[] a() {
        return new q[]{f41915a, f41916b};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "stale";
        }
        if (i10 == 2) {
            return "repeated";
        }
        throw new NoWhenBranchMatchedException();
    }
}
