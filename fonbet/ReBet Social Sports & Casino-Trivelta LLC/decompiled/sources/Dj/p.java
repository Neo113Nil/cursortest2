package Dj;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final p f2895a = new p("OPTED_IN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final p f2896b = new p("OPTED_OUT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2897c;

    static {
        p[] a10 = a();
        $VALUES = a10;
        f2897c = EnumEntriesKt.enumEntries(a10);
    }

    public p(String str, int i10) {
    }

    public static final /* synthetic */ p[] a() {
        return new p[]{f2895a, f2896b};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
