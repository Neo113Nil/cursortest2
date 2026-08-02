package T8;

import T8.a;
import kotlin.jvm.functions.Function2;

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
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final m f11330b = new m("Video", 0, n.f11338c.a());

    /* renamed from: c, reason: collision with root package name */
    public static final m f11331c = new m("Gif", 1, c.f11256c.a());

    /* renamed from: d, reason: collision with root package name */
    public static final m f11332d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f11333e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f11334f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f11335g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f11336h;

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f11337a;

    static {
        a.C0214a c0214a = a.f11247c;
        f11332d = new m("DynamicText", 2, c0214a.a(false));
        f11333e = new m("DynamicTextWithMoreByYou", 3, c0214a.a(true));
        f11334f = new m("UserProfile", 4, p.f11344a.a());
        f11335g = new m("NetworkState", 5, R8.c.f10098b.a());
        f11336h = new m("NoResults", 6, b.f11253a.a());
        $VALUES = a();
    }

    public m(String str, int i10, Function2 function2) {
        this.f11337a = function2;
    }

    public static final /* synthetic */ m[] a() {
        return new m[]{f11330b, f11331c, f11332d, f11333e, f11334f, f11335g, f11336h};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final Function2 b() {
        return this.f11337a;
    }
}
