package ah;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class P {

    /* renamed from: q, reason: collision with root package name */
    public static final a f15974q = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final L f15975a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15977c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15978d;

    /* renamed from: e, reason: collision with root package name */
    public final z f15979e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15980f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15981g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15982h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15983i;

    /* renamed from: j, reason: collision with root package name */
    public final String f15984j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f15985k;

    /* renamed from: l, reason: collision with root package name */
    public final Lazy f15986l;

    /* renamed from: m, reason: collision with root package name */
    public final Lazy f15987m;

    /* renamed from: n, reason: collision with root package name */
    public final Lazy f15988n;

    /* renamed from: o, reason: collision with root package name */
    public final Lazy f15989o;

    /* renamed from: p, reason: collision with root package name */
    public final Lazy f15990p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) P.this.f15984j, '#', 0, false, 6, (Object) null) + 1;
            if (indexOf$default == 0) {
                return "";
            }
            String substring = P.this.f15984j.substring(indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (P.this.h() == null) {
                return null;
            }
            if (P.this.h().length() == 0) {
                return "";
            }
            String substring = P.this.f15984j.substring(StringsKt.indexOf$default((CharSequence) P.this.f15984j, ':', P.this.k().d().length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) P.this.f15984j, '@', 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int indexOf$default;
            if (P.this.i().isEmpty() || (indexOf$default = StringsKt.indexOf$default((CharSequence) P.this.f15984j, '/', P.this.k().d().length() + 3, false, 4, (Object) null)) == -1) {
                return "";
            }
            int indexOfAny$default = StringsKt.indexOfAny$default((CharSequence) P.this.f15984j, new char[]{'?', '#'}, indexOf$default, false, 4, (Object) null);
            if (indexOfAny$default == -1) {
                String substring = P.this.f15984j.substring(indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = P.this.f15984j.substring(indexOf$default, indexOfAny$default);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) P.this.f15984j, '/', P.this.k().d().length() + 3, false, 4, (Object) null);
            if (indexOf$default == -1) {
                return "";
            }
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) P.this.f15984j, '#', indexOf$default, false, 4, (Object) null);
            if (indexOf$default2 == -1) {
                String substring = P.this.f15984j.substring(indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = P.this.f15984j.substring(indexOf$default, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) P.this.f15984j, '?', 0, false, 6, (Object) null) + 1;
            if (indexOf$default == 0) {
                return "";
            }
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) P.this.f15984j, '#', indexOf$default, false, 4, (Object) null);
            if (indexOf$default2 == -1) {
                String substring = P.this.f15984j.substring(indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = P.this.f15984j.substring(indexOf$default, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (P.this.n() == null) {
                return null;
            }
            if (P.this.n().length() == 0) {
                return "";
            }
            int length = P.this.k().d().length() + 3;
            String substring = P.this.f15984j.substring(length, StringsKt.indexOfAny$default((CharSequence) P.this.f15984j, new char[]{':', '@'}, length, false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    public P(L protocol, String host, int i10, List pathSegments, z parameters, String fragment, String str, String str2, boolean z10, String urlString) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.f15975a = protocol;
        this.f15976b = host;
        this.f15977c = i10;
        this.f15978d = pathSegments;
        this.f15979e = parameters;
        this.f15980f = fragment;
        this.f15981g = str;
        this.f15982h = str2;
        this.f15983i = z10;
        this.f15984j = urlString;
        if ((i10 < 0 || i10 >= 65536) && i10 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.f15985k = LazyKt.lazy(new d());
        this.f15986l = LazyKt.lazy(new f());
        this.f15987m = LazyKt.lazy(new e());
        this.f15988n = LazyKt.lazy(new g());
        this.f15989o = LazyKt.lazy(new c());
        this.f15990p = LazyKt.lazy(new b());
    }

    public final String b() {
        return (String) this.f15990p.getValue();
    }

    public final String c() {
        return (String) this.f15989o.getValue();
    }

    public final String d() {
        return (String) this.f15985k.getValue();
    }

    public final String e() {
        return (String) this.f15986l.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && P.class == obj.getClass() && Intrinsics.areEqual(this.f15984j, ((P) obj).f15984j);
    }

    public final String f() {
        return (String) this.f15988n.getValue();
    }

    public final String g() {
        return this.f15976b;
    }

    public final String h() {
        return this.f15982h;
    }

    public int hashCode() {
        return this.f15984j.hashCode();
    }

    public final List i() {
        return this.f15978d;
    }

    public final int j() {
        Integer valueOf = Integer.valueOf(this.f15977c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.f15975a.c();
    }

    public final L k() {
        return this.f15975a;
    }

    public final int l() {
        return this.f15977c;
    }

    public final boolean m() {
        return this.f15983i;
    }

    public final String n() {
        return this.f15981g;
    }

    public String toString() {
        return this.f15984j;
    }
}
