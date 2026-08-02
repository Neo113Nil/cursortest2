package Q5;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final q f9462a = new q("ColdStartTime", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final q f9463b = new q("WarmStartTime", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final q f9464c = new q("CpuUsage", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final q f9465d = new q("MemoryUsage", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final q f9466e = new q("SlowFrozenFrames", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final q f9467f = new q("Fps", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f9468g;

    static {
        q[] a10 = a();
        $VALUES = a10;
        f9468g = EnumEntriesKt.enumEntries(a10);
    }

    public q(String str, int i10) {
    }

    public static final /* synthetic */ q[] a() {
        return new q[]{f9462a, f9463b, f9464c, f9465d, f9466e, f9467f};
    }

    public static EnumEntries b() {
        return f9468g;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
