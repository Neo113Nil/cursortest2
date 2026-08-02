package Rh;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final d f10307a = new d("SUSPEND", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final d f10308b = new d("DROP_OLDEST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d f10309c = new d("DROP_LATEST", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f10310d;

    static {
        d[] a10 = a();
        $VALUES = a10;
        f10310d = EnumEntriesKt.enumEntries(a10);
    }

    public d(String str, int i10) {
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{f10307a, f10308b, f10309c};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
