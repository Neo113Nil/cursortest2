package Tc;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final f f11449a = new f("SMALL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final f f11450b = new f("MEDIUM", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final f f11451c = new f("LARGE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f11452d;

    static {
        f[] a10 = a();
        $VALUES = a10;
        f11452d = EnumEntriesKt.enumEntries(a10);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{f11449a, f11450b, f11451c};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
