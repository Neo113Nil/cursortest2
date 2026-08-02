package com.plaid.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class V3 {
    public static final V3 ASSERT;

    @NotNull
    public static final a Companion;
    public static final V3 DEBUG;
    public static final V3 ERROR;
    public static final V3 INFO;
    public static final V3 VERBOSE;
    public static final V3 WARN;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ V3[] f39712a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f39713b;

    public static final class a {

        /* renamed from: com.plaid.internal.V3$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0548a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39714a;

            static {
                int[] iArr = new int[V3.values().length];
                try {
                    iArr[V3.ASSERT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[V3.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[V3.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[V3.INFO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[V3.VERBOSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[V3.WARN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f39714a = iArr;
            }
        }

        public static int a(@NotNull V3 logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            switch (C0548a.f39714a[logLevel.ordinal()]) {
                case 1:
                    return 7;
                case 2:
                    return 3;
                case 3:
                    return 6;
                case 4:
                    return 4;
                case 5:
                    return 2;
                case 6:
                    return 5;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        V3 v32 = new V3("ASSERT", 0);
        ASSERT = v32;
        V3 v33 = new V3("DEBUG", 1);
        DEBUG = v33;
        V3 v34 = new V3("ERROR", 2);
        ERROR = v34;
        V3 v35 = new V3("INFO", 3);
        INFO = v35;
        V3 v36 = new V3("VERBOSE", 4);
        VERBOSE = v36;
        V3 v37 = new V3("WARN", 5);
        WARN = v37;
        V3[] v3Arr = {v32, v33, v34, v35, v36, v37};
        f39712a = v3Arr;
        f39713b = EnumEntriesKt.enumEntries(v3Arr);
        Companion = new a();
    }

    public V3(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<V3> getEntries() {
        return f39713b;
    }

    public static V3 valueOf(String str) {
        return (V3) Enum.valueOf(V3.class, str);
    }

    public static V3[] values() {
        return (V3[]) f39712a.clone();
    }
}
