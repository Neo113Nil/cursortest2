package Vh;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final h f12909a = new h("SUCCESSFUL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final h f12910b = new h("REREGISTER", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final h f12911c = new h("CANCELLED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final h f12912d = new h("ALREADY_SELECTED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f12913e;

    static {
        h[] a10 = a();
        $VALUES = a10;
        f12913e = EnumEntriesKt.enumEntries(a10);
    }

    public h(String str, int i10) {
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{f12909a, f12910b, f12911c, f12912d};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
