package ah;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final List f15962a = CollectionsKt.listOf("");

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ F f15963d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(F f10) {
            super(2);
            this.f15963d = f10;
        }

        public final void a(String key, List values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(values, "values");
            this.f15963d.e().e(key, values);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (List) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final int a(String str, int i10, int i11, char c10) {
        int i12 = 0;
        while (true) {
            int i13 = i10 + i12;
            if (i13 >= i11 || str.charAt(i13) != c10) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public static final void b(F f10, String str, int i10, int i11) {
        Integer valueOf = Integer.valueOf(e(str, i10, i11));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i11;
        String substring = str.substring(i10, intValue);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        f10.w(substring);
        int i12 = intValue + 1;
        if (i12 >= i11) {
            f10.x(0);
            return;
        }
        String substring2 = str.substring(i12, i11);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        f10.x(Integer.parseInt(substring2));
    }

    public static final int c(String str, int i10, int i11) {
        int i12;
        int i13;
        char charAt = str.charAt(i10);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i12 = i10;
            i13 = i12;
        } else {
            i12 = i10;
            i13 = -1;
        }
        while (i12 < i11) {
            char charAt2 = str.charAt(i12);
            if (charAt2 != ':') {
                if (charAt2 == '/' || charAt2 == '?' || charAt2 == '#') {
                    break;
                }
                if (i13 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                    i13 = i12;
                }
                i12++;
            } else {
                if (i13 == -1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i13);
            }
        }
        return -1;
    }

    public static final List d() {
        return f15962a;
    }

    public static final int e(String str, int i10, int i11) {
        boolean z10 = false;
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt == '[') {
                z10 = true;
            } else if (charAt == ']') {
                z10 = false;
            } else if (charAt == ':' && !z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void f(F f10, String str, int i10, int i11, int i12) {
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            f10.w("");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            String substring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            H.i(f10, sb2.toString());
            return;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '/', i10, false, 4, (Object) null);
        if (indexOf$default == -1 || indexOf$default == i11) {
            String substring2 = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            f10.w(substring2);
        } else {
            String substring3 = str.substring(i10, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            f10.w(substring3);
            String substring4 = str.substring(indexOf$default, i11);
            Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            H.i(f10, substring4);
        }
    }

    public static final void g(F f10, String str, int i10, int i11) {
        if (i10 >= i11 || str.charAt(i10) != '#') {
            return;
        }
        String substring = str.substring(i10 + 1, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        f10.r(substring);
    }

    public static final void h(F f10, String str, int i10, int i11) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, "@", i10, false, 4, (Object) null);
        if (indexOf$default == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String substring = str.substring(i10, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        f10.A(AbstractC2010b.i(substring, 0, 0, null, 7, null));
        String substring2 = str.substring(indexOf$default + 1, i11);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        f10.w(substring2);
    }

    public static final int i(F f10, String str, int i10, int i11) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            f10.z(true);
            return i11;
        }
        Integer valueOf = Integer.valueOf(StringsKt.indexOf$default((CharSequence) str, '#', i12, false, 4, (Object) null));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i11 = valueOf.intValue();
        }
        String substring = str.substring(i12, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        E.d(substring, 0, 0, false, 6, null).d(new a(f10));
        return i11;
    }

    public static final F j(F f10, String urlString) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (StringsKt.isBlank(urlString)) {
            return f10;
        }
        try {
            return k(f10, urlString);
        } catch (Throwable th2) {
            throw new J(urlString, th2);
        }
    }

    public static final F k(F f10, String urlString) {
        int i10;
        int intValue;
        Intrinsics.checkNotNullParameter(f10, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        int length = urlString.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!CharsKt.isWhitespace(urlString.charAt(i11))) {
                break;
            }
            i11++;
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                if (!CharsKt.isWhitespace(urlString.charAt(length2))) {
                    i10 = length2;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length2 = i12;
            }
        }
        i10 = -1;
        int i13 = i10 + 1;
        int c10 = c(urlString, i11, i13);
        if (c10 > 0) {
            String substring = urlString.substring(i11, i11 + c10);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            f10.y(L.f15964c.a(substring));
            i11 += c10 + 1;
        }
        int a10 = a(urlString, i11, i13, '/');
        int i14 = i11 + a10;
        if (Intrinsics.areEqual(f10.o().d(), "file")) {
            f(f10, urlString, i14, i13, a10);
            return f10;
        }
        if (Intrinsics.areEqual(f10.o().d(), "mailto")) {
            if (a10 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            h(f10, urlString, i14, i13);
            return f10;
        }
        if (a10 >= 2) {
            while (true) {
                Integer valueOf = Integer.valueOf(StringsKt.indexOfAny$default((CharSequence) urlString, ch.k.b("@/\\?#"), i14, false, 4, (Object) null));
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : i13;
                if (intValue >= i13 || urlString.charAt(intValue) != '@') {
                    break;
                }
                int e10 = e(urlString, i14, intValue);
                if (e10 != -1) {
                    String substring2 = urlString.substring(i14, e10);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    f10.v(substring2);
                    String substring3 = urlString.substring(e10 + 1, intValue);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    f10.t(substring3);
                } else {
                    String substring4 = urlString.substring(i14, intValue);
                    Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    f10.v(substring4);
                }
                i14 = intValue + 1;
            }
            b(f10, urlString, i14, intValue);
            i14 = intValue;
        }
        if (i14 >= i13) {
            f10.u(urlString.charAt(i10) == '/' ? f15962a : CollectionsKt.emptyList());
            return f10;
        }
        f10.u(a10 == 0 ? CollectionsKt.dropLast(f10.g(), 1) : CollectionsKt.emptyList());
        Integer valueOf2 = Integer.valueOf(StringsKt.indexOfAny$default((CharSequence) urlString, ch.k.b("?#"), i14, false, 4, (Object) null));
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        int intValue2 = num != null ? num.intValue() : i13;
        if (intValue2 > i14) {
            String substring5 = urlString.substring(i14, intValue2);
            Intrinsics.checkNotNullExpressionValue(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            f10.u(CollectionsKt.plus((Collection) ((f10.g().size() == 1 && ((CharSequence) CollectionsKt.first(f10.g())).length() == 0) ? CollectionsKt.emptyList() : f10.g()), (Iterable) CollectionsKt.plus((Collection) (a10 == 1 ? f15962a : CollectionsKt.emptyList()), (Iterable) (Intrinsics.areEqual(substring5, "/") ? f15962a : StringsKt.split$default((CharSequence) substring5, new char[]{'/'}, false, 0, 6, (Object) null)))));
            i14 = intValue2;
        }
        if (i14 < i13 && urlString.charAt(i14) == '?') {
            i14 = i(f10, urlString, i14, i13);
        }
        g(f10, urlString, i14, i13);
        return f10;
    }
}
