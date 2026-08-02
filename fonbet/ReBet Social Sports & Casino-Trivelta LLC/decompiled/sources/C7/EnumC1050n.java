package C7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: C7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1050n {
    private static final /* synthetic */ EnumC1050n[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1050n f1293a = new EnumC1050n("ALWAYS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1050n f1294b = new EnumC1050n("AUTO", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1050n f1295c = new EnumC1050n("NEVER", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f1296d;

    static {
        EnumC1050n[] a10 = a();
        $VALUES = a10;
        f1296d = EnumEntriesKt.enumEntries(a10);
    }

    public EnumC1050n(String str, int i10) {
    }

    public static final /* synthetic */ EnumC1050n[] a() {
        return new EnumC1050n[]{f1293a, f1294b, f1295c};
    }

    public static EnumC1050n valueOf(String str) {
        return (EnumC1050n) Enum.valueOf(EnumC1050n.class, str);
    }

    public static EnumC1050n[] values() {
        return (EnumC1050n[]) $VALUES.clone();
    }
}
