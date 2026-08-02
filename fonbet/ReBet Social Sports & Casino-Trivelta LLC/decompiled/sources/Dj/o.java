package Dj;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ o[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final o f2892a = new o("OPT_IN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final o f2893b = new o("OPT_OUT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2894c;

    static {
        o[] a10 = a();
        $VALUES = a10;
        f2894c = EnumEntriesKt.enumEntries(a10);
    }

    public o(String str, int i10) {
    }

    public static final /* synthetic */ o[] a() {
        return new o[]{f2892a, f2893b};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
