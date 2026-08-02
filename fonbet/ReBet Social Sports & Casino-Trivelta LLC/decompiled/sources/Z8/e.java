package Z8;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final e f14740b = new e("Unknown", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f14741c = new e("ReadyToPlay", 1, 3);

    /* renamed from: d, reason: collision with root package name */
    public static final e f14742d = new e("Playing", 2, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final e f14743e = new e("Paused", 3, 5);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14744f;

    /* renamed from: a, reason: collision with root package name */
    public final int f14745a;

    static {
        e[] a10 = a();
        $VALUES = a10;
        f14744f = EnumEntriesKt.enumEntries(a10);
    }

    public e(String str, int i10, int i11) {
        this.f14745a = i11;
    }

    public static final /* synthetic */ e[] a() {
        return new e[]{f14740b, f14741c, f14742d, f14743e};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int b() {
        return this.f14745a;
    }
}
