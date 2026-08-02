package ec;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final b f45904a = new b("ENCRYPT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f45905b = new b("DECRYPT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f45906c;

    static {
        b[] a10 = a();
        $VALUES = a10;
        f45906c = EnumEntriesKt.enumEntries(a10);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f45904a, f45905b};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
