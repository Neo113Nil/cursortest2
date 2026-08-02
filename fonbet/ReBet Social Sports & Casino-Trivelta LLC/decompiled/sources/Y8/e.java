package Y8;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f14090a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f14091b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f14092c = new e("CENTER", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final e f14093d = new e("CONTAIN", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final e f14094e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f14095f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14096g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return e.f14095f;
                    }
                    return null;
                case -1364013995:
                    if (str.equals("center")) {
                        return e.f14092c;
                    }
                    return null;
                case 94852023:
                    if (str.equals("cover")) {
                        return e.f14094e;
                    }
                    return null;
                case 951526612:
                    if (str.equals("contain")) {
                        return e.f14093d;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final e b() {
            return e.f14091b;
        }

        public a() {
        }
    }

    static {
        e eVar = new e("COVER", 2);
        f14094e = eVar;
        f14095f = new e("STRETCH", 3);
        e[] a10 = a();
        $VALUES = a10;
        f14096g = EnumEntriesKt.enumEntries(a10);
        f14090a = new a(null);
        f14091b = eVar;
    }

    public e(String str, int i10) {
    }

    public static final /* synthetic */ e[] a() {
        return new e[]{f14092c, f14093d, f14094e, f14095f};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
