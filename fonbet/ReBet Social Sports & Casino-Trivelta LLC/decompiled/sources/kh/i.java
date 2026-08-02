package kh;

import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final a f54494b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f54495c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f54496d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f54497e;

    /* renamed from: a, reason: collision with root package name */
    public final ByteOrder f54498a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        i b10;
        ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        Intrinsics.checkNotNullExpressionValue(BIG_ENDIAN, "BIG_ENDIAN");
        f54496d = new i("BIG_ENDIAN", 0, BIG_ENDIAN);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.checkNotNullExpressionValue(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        f54497e = new i("LITTLE_ENDIAN", 1, LITTLE_ENDIAN);
        $VALUES = a();
        f54494b = new a(null);
        ByteOrder nativeOrder = ByteOrder.nativeOrder();
        Intrinsics.checkNotNullExpressionValue(nativeOrder, "nativeOrder()");
        b10 = j.b(nativeOrder);
        f54495c = b10;
    }

    public i(String str, int i10, ByteOrder byteOrder) {
        this.f54498a = byteOrder;
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{f54496d, f54497e};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
