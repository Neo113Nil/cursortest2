package com.oblador.keychain;

import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final e f39123a = new e("ANY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final e f39124b = new e("SECURE_SOFTWARE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f39125c = new e("SECURE_HARDWARE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f39126d;

    static {
        e[] a10 = a();
        $VALUES = a10;
        f39126d = EnumEntriesKt.enumEntries(a10);
    }

    public e(String str, int i10) {
    }

    public static final /* synthetic */ e[] a() {
        return new e[]{f39123a, f39124b, f39125c};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("SECURITY_LEVEL_%s", Arrays.copyOf(new Object[]{name()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final boolean c(e threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        return compareTo(threshold) >= 0;
    }
}
