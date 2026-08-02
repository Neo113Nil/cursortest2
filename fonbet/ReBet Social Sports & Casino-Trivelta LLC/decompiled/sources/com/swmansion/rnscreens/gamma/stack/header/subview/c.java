package com.swmansion.rnscreens.gamma.stack.header.subview;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final c f41830a = new c("OFF", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f41831b = new c("PARALLAX", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f41832c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f41830a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f41831b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        c[] a10 = a();
        $VALUES = a10;
        f41832c = EnumEntriesKt.enumEntries(a10);
    }

    public c(String str, int i10) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f41830a, f41831b};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int b() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
