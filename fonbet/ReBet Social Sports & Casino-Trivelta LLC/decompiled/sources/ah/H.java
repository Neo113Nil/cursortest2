package ah;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class H {
    public static final void b(Appendable appendable, String str, String str2) {
        appendable.append("://");
        appendable.append(str);
        if (!StringsKt.startsWith$default((CharSequence) str2, '/', false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    public static final void c(Appendable appendable, String str, String str2) {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    public static final Appendable d(F f10, Appendable appendable) {
        appendable.append(f10.o().d());
        String d10 = f10.o().d();
        if (Intrinsics.areEqual(d10, "file")) {
            b(appendable, f10.j(), f(f10));
            return appendable;
        }
        if (Intrinsics.areEqual(d10, "mailto")) {
            c(appendable, g(f10), f10.j());
            return appendable;
        }
        appendable.append("://");
        appendable.append(e(f10));
        N.d(appendable, f(f10), f10.e(), f10.p());
        if (f10.d().length() > 0) {
            appendable.append('#');
            appendable.append(f10.d());
        }
        return appendable;
    }

    public static final String e(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g(f10));
        sb2.append(f10.j());
        if (f10.n() != 0 && f10.n() != f10.o().c()) {
            sb2.append(":");
            sb2.append(String.valueOf(f10.n()));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String f(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        return h(f10.g());
    }

    public static final String g(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        N.e(sb2, f10.h(), f10.f());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String h(List list) {
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) CollectionsKt.first(list)).length() == 0 ? "/" : (String) CollectionsKt.first(list) : CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void i(F f10, String value) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        f10.u(StringsKt.isBlank(value) ? CollectionsKt.emptyList() : Intrinsics.areEqual(value, "/") ? K.d() : CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) value, new char[]{'/'}, false, 0, 6, (Object) null)));
    }
}
