package com.plaid.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3571c1 {
    public static final EnumC3571c1 BACKEND_DETERMINES;
    public static final EnumC3571c1 DISABLED;
    public static final EnumC3571c1 ENABLED;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC3571c1[] f39843a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f39844b;

    /* renamed from: com.plaid.internal.c1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39845a;

        static {
            int[] iArr = new int[EnumC3571c1.values().length];
            try {
                iArr[EnumC3571c1.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3571c1.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3571c1.BACKEND_DETERMINES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39845a = iArr;
        }
    }

    static {
        EnumC3571c1 enumC3571c1 = new EnumC3571c1("ENABLED", 0);
        ENABLED = enumC3571c1;
        EnumC3571c1 enumC3571c12 = new EnumC3571c1("DISABLED", 1);
        DISABLED = enumC3571c12;
        EnumC3571c1 enumC3571c13 = new EnumC3571c1("BACKEND_DETERMINES", 2);
        BACKEND_DETERMINES = enumC3571c13;
        EnumC3571c1[] enumC3571c1Arr = {enumC3571c1, enumC3571c12, enumC3571c13};
        f39843a = enumC3571c1Arr;
        f39844b = EnumEntriesKt.enumEntries(enumC3571c1Arr);
    }

    public EnumC3571c1(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<EnumC3571c1> getEntries() {
        return f39844b;
    }

    public static EnumC3571c1 valueOf(String str) {
        return (EnumC3571c1) Enum.valueOf(EnumC3571c1.class, str);
    }

    public static EnumC3571c1[] values() {
        return (EnumC3571c1[]) f39843a.clone();
    }

    public final boolean isSet() {
        return this != BACKEND_DETERMINES;
    }

    public final boolean toBoolean() {
        int i10 = a.f39845a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Cannot convert BACKEND_DETERMINES to boolean");
    }
}
