package w5;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6706b {
    private static final /* synthetic */ EnumC6706b[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f67422a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6706b f67423b = new EnumC6706b("Unknown", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6706b f67424c = new EnumC6706b("AlignBounds", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6706b f67425d = new EnumC6706b("AlignMargins", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f67426e;

    /* renamed from: w5.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC6706b a(int i10) {
            return i10 != 0 ? i10 != 1 ? EnumC6706b.f67423b : EnumC6706b.f67425d : EnumC6706b.f67424c;
        }

        public a() {
        }
    }

    static {
        EnumC6706b[] a10 = a();
        $VALUES = a10;
        f67426e = EnumEntriesKt.enumEntries(a10);
        f67422a = new a(null);
    }

    public EnumC6706b(String str, int i10) {
    }

    public static final /* synthetic */ EnumC6706b[] a() {
        return new EnumC6706b[]{f67423b, f67424c, f67425d};
    }

    public static EnumC6706b valueOf(String str) {
        return (EnumC6706b) Enum.valueOf(EnumC6706b.class, str);
    }

    public static EnumC6706b[] values() {
        return (EnumC6706b[]) $VALUES.clone();
    }
}
