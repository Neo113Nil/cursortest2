package Dj;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final b f2813a = new b("SPEAKERS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f2814b = new b("HEADSET", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f2815c = new b("BLUETOOTH", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2816d;

    static {
        b[] a10 = a();
        $VALUES = a10;
        f2816d = EnumEntriesKt.enumEntries(a10);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f2813a, f2814b, f2815c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
