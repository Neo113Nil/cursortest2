package ed;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {
    private static final /* synthetic */ o[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final o f45965a = new o("PADDING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final o f45966b = new o("MARGIN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f45967c;

    static {
        o[] a10 = a();
        $VALUES = a10;
        f45967c = EnumEntriesKt.enumEntries(a10);
    }

    public o(String str, int i10) {
    }

    public static final /* synthetic */ o[] a() {
        return new o[]{f45965a, f45966b};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
