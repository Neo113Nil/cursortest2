package ed;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final l f45954a = new l("OFF", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final l f45955b = new l("ADDITIVE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final l f45956c = new l("MAXIMUM", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f45957d;

    static {
        l[] a10 = a();
        $VALUES = a10;
        f45957d = EnumEntriesKt.enumEntries(a10);
    }

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] a() {
        return new l[]{f45954a, f45955b, f45956c};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
