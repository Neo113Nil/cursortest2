package ei;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ei.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC4211a {
    private static final /* synthetic */ EnumC4211a[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4211a f46075a = new EnumC4211a("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4211a f46076b = new EnumC4211a("ALL_JSON_OBJECTS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4211a f46077c = new EnumC4211a("POLYMORPHIC", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46078d;

    static {
        EnumC4211a[] a10 = a();
        $VALUES = a10;
        f46078d = EnumEntriesKt.enumEntries(a10);
    }

    public EnumC4211a(String str, int i10) {
    }

    public static final /* synthetic */ EnumC4211a[] a() {
        return new EnumC4211a[]{f46075a, f46076b, f46077c};
    }

    public static EnumC4211a valueOf(String str) {
        return (EnumC4211a) Enum.valueOf(EnumC4211a.class, str);
    }

    public static EnumC4211a[] values() {
        return (EnumC4211a[]) $VALUES.clone();
    }
}
