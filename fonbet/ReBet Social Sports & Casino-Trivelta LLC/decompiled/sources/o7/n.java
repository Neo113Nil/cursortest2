package o7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;

    @NotNull
    private static final n[] VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final a f59466b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f59467c = new n("UNKNOWN", 0, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final n f59468d = new n("VISIBLE", 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final n f59469e = new n("INVISIBLE", 2, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f59470f;

    /* renamed from: a, reason: collision with root package name */
    public final int f59471a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        n[] a10 = a();
        $VALUES = a10;
        f59470f = EnumEntriesKt.enumEntries(a10);
        f59466b = new a(null);
        VALUES = values();
    }

    public n(String str, int i10, int i11) {
        this.f59471a = i11;
    }

    public static final /* synthetic */ n[] a() {
        return new n[]{f59467c, f59468d, f59469e};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
