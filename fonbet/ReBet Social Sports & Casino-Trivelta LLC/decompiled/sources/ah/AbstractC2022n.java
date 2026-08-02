package ah;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* renamed from: ah.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2022n {

    /* renamed from: ah.n$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f16063d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: ah.n$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f16064d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return new ArrayList();
        }
    }

    public static final boolean a(String str, int i10) {
        int i11 = i10 + 1;
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        return i11 == str.length() || str.charAt(i11) == ';';
    }

    public static final List b(String str) {
        return c(str, false);
    }

    public static final List c(String str, boolean z10) {
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) a.f16063d);
        int i10 = 0;
        while (i10 <= StringsKt.getLastIndex(str)) {
            i10 = d(str, i10, lazy, z10);
        }
        return j(lazy);
    }

    public static final int d(String str, int i10, Lazy lazy, boolean z10) {
        Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) b.f16064d);
        Integer valueOf = z10 ? Integer.valueOf(i10) : null;
        int i11 = i10;
        while (i11 <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i11);
            if (charAt == ',') {
                ((ArrayList) lazy.getValue()).add(new C2015g(i(str, i10, valueOf != null ? valueOf.intValue() : i11), j(lazy2)));
                return i11 + 1;
            }
            if (charAt == ';') {
                if (valueOf == null) {
                    valueOf = Integer.valueOf(i11);
                }
                i11 = e(str, i11 + 1, lazy2);
            } else {
                i11 = z10 ? e(str, i11, lazy2) : i11 + 1;
            }
        }
        ((ArrayList) lazy.getValue()).add(new C2015g(i(str, i10, valueOf != null ? valueOf.intValue() : i11), j(lazy2)));
        return i11;
    }

    public static final int e(String str, int i10, Lazy lazy) {
        int i11 = i10;
        while (i11 <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i11);
            if (charAt == '=') {
                Pair g10 = g(str, i11 + 1);
                int intValue = ((Number) g10.component1()).intValue();
                f(lazy, str, i10, i11, (String) g10.component2());
                return intValue;
            }
            if (charAt == ';' || charAt == ',') {
                f(lazy, str, i10, i11, "");
                return i11;
            }
            i11++;
        }
        f(lazy, str, i10, i11, "");
        return i11;
    }

    public static final void f(Lazy lazy, String str, int i10, int i11, String str2) {
        String i12 = i(str, i10, i11);
        if (i12.length() == 0) {
            return;
        }
        ((ArrayList) lazy.getValue()).add(new C2016h(i12, str2));
    }

    public static final Pair g(String str, int i10) {
        if (str.length() == i10) {
            return TuplesKt.to(Integer.valueOf(i10), "");
        }
        if (str.charAt(i10) == '\"') {
            return h(str, i10 + 1);
        }
        int i11 = i10;
        while (i11 <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i11);
            if (charAt == ';' || charAt == ',') {
                return TuplesKt.to(Integer.valueOf(i11), i(str, i10, i11));
            }
            i11++;
        }
        return TuplesKt.to(Integer.valueOf(i11), i(str, i10, i11));
    }

    public static final Pair h(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i10);
            if (charAt == '\"' && a(str, i10)) {
                Integer valueOf = Integer.valueOf(i10 + 1);
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
                return TuplesKt.to(valueOf, sb3);
            }
            if (charAt != '\\' || i10 >= StringsKt.getLastIndex(str) - 2) {
                sb2.append(charAt);
                i10++;
            } else {
                sb2.append(str.charAt(i10 + 1));
                i10 += 2;
            }
        }
        Integer valueOf2 = Integer.valueOf(i10);
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "builder.toString()");
        return TuplesKt.to(valueOf2, Typography.quote + sb4);
    }

    public static final String i(String str, int i10, int i11) {
        String substring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringsKt.trim((CharSequence) substring).toString();
    }

    public static final List j(Lazy lazy) {
        return lazy.isInitialized() ? (List) lazy.getValue() : CollectionsKt.emptyList();
    }
}
