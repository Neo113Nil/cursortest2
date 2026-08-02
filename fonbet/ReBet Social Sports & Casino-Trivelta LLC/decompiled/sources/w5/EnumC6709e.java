package w5;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6709e {
    private static final /* synthetic */ EnumC6709e[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f67452a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6709e f67453b = new EnumC6709e("Visible", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6709e f67454c = new EnumC6709e("Invisible", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6709e f67455d = new EnumC6709e("Gone", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f67456e;

    /* renamed from: w5.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC6709e a(int i10) {
            if (i10 == 0) {
                return EnumC6709e.f67453b;
            }
            if (i10 == 4) {
                return EnumC6709e.f67454c;
            }
            if (i10 == 8) {
                return EnumC6709e.f67455d;
            }
            throw new IllegalArgumentException("The argument must be one of the following: View.VISIBLE, View.INVISIBLE, View.GONE");
        }

        public a() {
        }
    }

    static {
        EnumC6709e[] a10 = a();
        $VALUES = a10;
        f67456e = EnumEntriesKt.enumEntries(a10);
        f67452a = new a(null);
    }

    public EnumC6709e(String str, int i10) {
    }

    public static final /* synthetic */ EnumC6709e[] a() {
        return new EnumC6709e[]{f67453b, f67454c, f67455d};
    }

    public static EnumC6709e valueOf(String str) {
        return (EnumC6709e) Enum.valueOf(EnumC6709e.class, str);
    }

    public static EnumC6709e[] values() {
        return (EnumC6709e[]) $VALUES.clone();
    }
}
