package mg;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5584a {
    private static final /* synthetic */ EnumC5584a[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5584a f56601a = new EnumC5584a("ListMap", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5584a f56602b = new EnumC5584a("Map", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5584a f56603c = new EnumC5584a("DirectValue", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56604d;

    static {
        EnumC5584a[] a10 = a();
        $VALUES = a10;
        f56604d = EnumEntriesKt.enumEntries(a10);
    }

    public EnumC5584a(String str, int i10) {
    }

    public static final /* synthetic */ EnumC5584a[] a() {
        return new EnumC5584a[]{f56601a, f56602b, f56603c};
    }

    public static EnumC5584a valueOf(String str) {
        return (EnumC5584a) Enum.valueOf(EnumC5584a.class, str);
    }

    public static EnumC5584a[] values() {
        return (EnumC5584a[]) $VALUES.clone();
    }
}
