package E5;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f3001a = new a("DEBUG", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f3002b = new a("INFO", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f3003c = new a("WARN", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f3004d = new a("ERROR", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f3005e;

    static {
        a[] a10 = a();
        $VALUES = a10;
        f3005e = EnumEntriesKt.enumEntries(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f3001a, f3002b, f3003c, f3004d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
