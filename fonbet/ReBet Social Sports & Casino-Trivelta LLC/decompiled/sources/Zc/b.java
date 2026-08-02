package Zc;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final b f14761a = new b("ALL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f14762b = new b("SYSTEM", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f14763c = new b("INTERFACE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14764d;

    static {
        b[] a10 = a();
        $VALUES = a10;
        f14764d = EnumEntriesKt.enumEntries(a10);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f14761a, f14762b, f14763c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final boolean b() {
        return this == f14761a || this == f14763c;
    }

    public final boolean c() {
        return this == f14761a || this == f14762b;
    }
}
