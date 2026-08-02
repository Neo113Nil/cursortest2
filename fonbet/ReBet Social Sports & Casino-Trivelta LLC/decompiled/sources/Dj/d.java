package Dj;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final d f2819a = new d("CALL_CONNECTED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final d f2820b = new d("CALL_DISCONNECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d f2821c = new d("CALL_DISCONNECTED_CONNECTION_ERROR", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final d f2822d = new d("CALL_FAILED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final d f2823e = new d("CALL_RECONNECTING", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final d f2824f = new d("CALL_RECONNECTED", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2825g;

    static {
        d[] a10 = a();
        $VALUES = a10;
        f2825g = EnumEntriesKt.enumEntries(a10);
    }

    public d(String str, int i10) {
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{f2819a, f2820b, f2821c, f2822d, f2823e, f2824f};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
