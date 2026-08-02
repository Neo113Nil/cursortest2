package fi;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e0 {
    private static final /* synthetic */ e0[] $VALUES;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f46766c = new e0("OBJ", 0, '{', '}');

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f46767d = new e0("LIST", 1, '[', ']');

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f46768e = new e0("MAP", 2, '{', '}');

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f46769f = new e0("POLY_OBJ", 3, '[', ']');

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46770g;

    /* renamed from: a, reason: collision with root package name */
    public final char f46771a;

    /* renamed from: b, reason: collision with root package name */
    public final char f46772b;

    static {
        e0[] a10 = a();
        $VALUES = a10;
        f46770g = EnumEntriesKt.enumEntries(a10);
    }

    public e0(String str, int i10, char c10, char c11) {
        this.f46771a = c10;
        this.f46772b = c11;
    }

    public static final /* synthetic */ e0[] a() {
        return new e0[]{f46766c, f46767d, f46768e, f46769f};
    }

    public static EnumEntries b() {
        return f46770g;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
