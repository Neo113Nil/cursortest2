package o7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final k f59460a = new k("VITO_V2", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final k f59461b = new k("VITO_V1", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final k f59462c = new k("DRAWEE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final k f59463d = new k("OTHER", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f59464e;

    static {
        k[] a10 = a();
        $VALUES = a10;
        f59464e = EnumEntriesKt.enumEntries(a10);
    }

    public k(String str, int i10) {
    }

    public static final /* synthetic */ k[] a() {
        return new k[]{f59460a, f59461b, f59462c, f59463d};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
