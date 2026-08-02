package o7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5823e {
    private static final /* synthetic */ EnumC5823e[] $VALUES;

    @NotNull
    private static final EnumC5823e[] VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final a f59375b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5823e f59376c = new EnumC5823e("UNKNOWN", 0, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC5823e f59377d = new EnumC5823e("REQUESTED", 1, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC5823e f59378e = new EnumC5823e("INTERMEDIATE_AVAILABLE", 2, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC5823e f59379f = new EnumC5823e("SUCCESS", 3, 3);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC5823e f59380g = new EnumC5823e("ERROR", 4, 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC5823e f59381h = new EnumC5823e("EMPTY_EVENT", 5, 7);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC5823e f59382i = new EnumC5823e("RELEASED", 6, 8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f59383j;

    /* renamed from: a, reason: collision with root package name */
    public final int f59384a;

    /* renamed from: o7.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: o7.e$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC5823e.values().length];
            try {
                iArr[EnumC5823e.f59377d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5823e.f59379f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5823e.f59378e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5823e.f59380g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5823e.f59382i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        EnumC5823e[] a10 = a();
        $VALUES = a10;
        f59383j = EnumEntriesKt.enumEntries(a10);
        f59375b = new a(null);
        VALUES = values();
    }

    public EnumC5823e(String str, int i10, int i11) {
        this.f59384a = i11;
    }

    public static final /* synthetic */ EnumC5823e[] a() {
        return new EnumC5823e[]{f59376c, f59377d, f59378e, f59379f, f59380g, f59381h, f59382i};
    }

    public static EnumC5823e valueOf(String str) {
        return (EnumC5823e) Enum.valueOf(EnumC5823e.class, str);
    }

    public static EnumC5823e[] values() {
        return (EnumC5823e[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "unknown" : "released" : "error" : "intermediate_available" : "success" : "requested";
    }
}
