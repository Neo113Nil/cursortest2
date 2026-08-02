package R4;

import I5.a;
import Q5.b;
import kotlin.jvm.internal.Intrinsics;
import oh.e;
import oh.g;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Boolean a(g gVar, String key) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Boolean) gVar.a(e.b(key));
    }

    public static final Long b(g gVar, String key) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) gVar.a(e.c(key));
    }

    public static final String c(g gVar, String key) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) gVar.a(e.a(key));
    }

    public static final boolean d(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.f.f5356c.a());
    }

    public static final boolean e(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Long b10 = b(gVar, "severity");
        return b10 != null && b10.longValue() == ((long) b.e.f9376b.getLevel());
    }

    public static final boolean f(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.b.f5352c.a());
    }

    public static final boolean g(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.k.f5361c.a());
    }

    public static final boolean h(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.c.f5353c.a());
    }

    public static final boolean i(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.d.f5354c.a());
    }

    public static final boolean j(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.g.f5357c.a());
    }

    public static final boolean k(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.h.f5358c.a());
    }

    public static final boolean l(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Intrinsics.areEqual(c(gVar, "type"), a.i.f5359c.a());
    }

    public static final boolean m(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return b(gVar, "severity") != null;
    }
}
