package Qj;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final c f9899a = new c("GRANTED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f9900b = new c("DENIED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f9901c = new c("DENIED_NEVER_ASK_AGAIN", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f9902d;

    static {
        c[] a10 = a();
        $VALUES = a10;
        f9902d = EnumEntriesKt.enumEntries(a10);
    }

    public c(String str, int i10) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f9899a, f9900b, f9901c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
