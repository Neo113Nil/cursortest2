package Ic;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final v f5696a = new v("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final v f5697b = new v("BOX_NONE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final v f5698c = new v("BOX_ONLY", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final v f5699d = new v("AUTO", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f5700e;

    static {
        v[] a10 = a();
        $VALUES = a10;
        f5700e = EnumEntriesKt.enumEntries(a10);
    }

    public v(String str, int i10) {
    }

    public static final /* synthetic */ v[] a() {
        return new v[]{f5696a, f5697b, f5698c, f5699d};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
