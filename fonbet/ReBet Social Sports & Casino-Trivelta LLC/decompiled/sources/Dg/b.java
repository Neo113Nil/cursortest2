package Dg;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final b f2756a = new b("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f2757b = new b("INCOMING_CALL", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f2758c = new b("CONNECTING", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f2759d = new b("RECONNECTING", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final b f2760e = new b("CONNECTED", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final b f2761f = new b("CALLING", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final b f2762g = new b("QUEUE", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final b f2763h = new b("RINGING", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final b f2764i = new b("NO_RESPONSE", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final b f2765j = new b("USER_BUSY", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final b f2766k = new b("CALL_FAILED", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final b f2767l = new b("ON_HOLD", 11);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2768m;

    static {
        b[] a10 = a();
        $VALUES = a10;
        f2768m = EnumEntriesKt.enumEntries(a10);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f2756a, f2757b, f2758c, f2759d, f2760e, f2761f, f2762g, f2763h, f2764i, f2765j, f2766k, f2767l};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
