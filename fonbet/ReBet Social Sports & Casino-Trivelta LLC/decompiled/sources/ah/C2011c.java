package ah;

import ah.AbstractC2017i;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: ah.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2011c extends AbstractC2017i {

    /* renamed from: f, reason: collision with root package name */
    public static final b f16012f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final C2011c f16013g = new C2011c("*", "*", null, 4, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f16014d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16015e;

    /* renamed from: ah.c$a */
    public static final class a {

        /* renamed from: g, reason: collision with root package name */
        public static final C2011c f16022g;

        /* renamed from: n, reason: collision with root package name */
        public static final C2011c f16029n;

        /* renamed from: u, reason: collision with root package name */
        public static final C2011c f16036u;

        /* renamed from: a, reason: collision with root package name */
        public static final a f16016a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final C2011c f16017b = new C2011c("application", "*", null, 4, null);

        /* renamed from: c, reason: collision with root package name */
        public static final C2011c f16018c = new C2011c("application", "atom+xml", null, 4, null);

        /* renamed from: d, reason: collision with root package name */
        public static final C2011c f16019d = new C2011c("application", "cbor", null, 4, null);

        /* renamed from: e, reason: collision with root package name */
        public static final C2011c f16020e = new C2011c("application", "json", null, 4, null);

        /* renamed from: f, reason: collision with root package name */
        public static final C2011c f16021f = new C2011c("application", "hal+json", null, 4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final C2011c f16023h = new C2011c("application", "octet-stream", null, 4, null);

        /* renamed from: i, reason: collision with root package name */
        public static final C2011c f16024i = new C2011c("application", "rss+xml", null, 4, null);

        /* renamed from: j, reason: collision with root package name */
        public static final C2011c f16025j = new C2011c("application", "xml", null, 4, null);

        /* renamed from: k, reason: collision with root package name */
        public static final C2011c f16026k = new C2011c("application", "xml-dtd", null, 4, null);

        /* renamed from: l, reason: collision with root package name */
        public static final C2011c f16027l = new C2011c("application", "zip", null, 4, 0 == true ? 1 : 0);

        /* renamed from: m, reason: collision with root package name */
        public static final C2011c f16028m = new C2011c("application", "gzip", null, 4, null);

        /* renamed from: o, reason: collision with root package name */
        public static final C2011c f16030o = new C2011c("application", "pdf", null, 4, null);

        /* renamed from: p, reason: collision with root package name */
        public static final C2011c f16031p = new C2011c("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);

        /* renamed from: q, reason: collision with root package name */
        public static final C2011c f16032q = new C2011c("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);

        /* renamed from: r, reason: collision with root package name */
        public static final C2011c f16033r = new C2011c("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);

        /* renamed from: s, reason: collision with root package name */
        public static final C2011c f16034s = new C2011c("application", "protobuf", null, 4, 0 == true ? 1 : 0);

        /* renamed from: t, reason: collision with root package name */
        public static final C2011c f16035t = new C2011c("application", "wasm", null, 4, null);

        /* renamed from: v, reason: collision with root package name */
        public static final C2011c f16037v = new C2011c("application", "problem+xml", null, 4, null);

        /* JADX WARN: Multi-variable type inference failed */
        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            f16022g = new C2011c("application", "javascript", null, 4, defaultConstructorMarker);
            f16029n = new C2011c("application", "x-www-form-urlencoded", null, 4, defaultConstructorMarker);
            f16036u = new C2011c("application", "problem+json", null, 4, defaultConstructorMarker);
        }

        public final C2011c a() {
            return f16023h;
        }
    }

    /* renamed from: ah.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2011c a() {
            return C2011c.f16013g;
        }

        public final C2011c b(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.isBlank(value)) {
                return a();
            }
            AbstractC2017i.a aVar = AbstractC2017i.f16056c;
            C2015g c2015g = (C2015g) CollectionsKt.last(AbstractC2022n.b(value));
            String b10 = c2015g.b();
            List a10 = c2015g.a();
            int indexOf$default = StringsKt.indexOf$default((CharSequence) b10, '/', 0, false, 6, (Object) null);
            if (indexOf$default == -1) {
                if (Intrinsics.areEqual(StringsKt.trim((CharSequence) b10).toString(), "*")) {
                    return C2011c.f16012f.a();
                }
                throw new C2009a(value);
            }
            String substring = b10.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = StringsKt.trim((CharSequence) substring).toString();
            if (obj.length() == 0) {
                throw new C2009a(value);
            }
            String substring2 = b10.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            String obj2 = StringsKt.trim((CharSequence) substring2).toString();
            if (StringsKt.contains$default((CharSequence) obj, ' ', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj2, ' ', false, 2, (Object) null)) {
                throw new C2009a(value);
            }
            if (obj2.length() == 0 || StringsKt.contains$default((CharSequence) obj2, '/', false, 2, (Object) null)) {
                throw new C2009a(value);
            }
            return new C2011c(obj, obj2, a10);
        }

        public b() {
        }
    }

    /* renamed from: ah.c$c, reason: collision with other inner class name */
    public static final class C0334c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0334c f16038a = new C0334c();

        /* renamed from: b, reason: collision with root package name */
        public static final C2011c f16039b = new C2011c("text", "*", null, 4, null);

        /* renamed from: c, reason: collision with root package name */
        public static final C2011c f16040c = new C2011c("text", "plain", null, 4, null);

        /* renamed from: d, reason: collision with root package name */
        public static final C2011c f16041d = new C2011c("text", "css", null, 4, null);

        /* renamed from: e, reason: collision with root package name */
        public static final C2011c f16042e = new C2011c("text", "csv", null, 4, null);

        /* renamed from: f, reason: collision with root package name */
        public static final C2011c f16043f = new C2011c("text", "html", null, 4, null);

        /* renamed from: g, reason: collision with root package name */
        public static final C2011c f16044g = new C2011c("text", "javascript", null, 4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final C2011c f16045h = new C2011c("text", "vcard", null, 4, null);

        /* renamed from: i, reason: collision with root package name */
        public static final C2011c f16046i = new C2011c("text", "xml", null, 4, null);

        /* renamed from: j, reason: collision with root package name */
        public static final C2011c f16047j = new C2011c("text", "event-stream", null, 4, null);

        public final C2011c a() {
            return f16040c;
        }
    }

    public C2011c(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f16014d = str;
        this.f16015e = str2;
    }

    public final String e() {
        return this.f16014d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2011c)) {
            return false;
        }
        C2011c c2011c = (C2011c) obj;
        return StringsKt.equals(this.f16014d, c2011c.f16014d, true) && StringsKt.equals(this.f16015e, c2011c.f16015e, true) && Intrinsics.areEqual(b(), c2011c.b());
    }

    public final boolean f(String str, String str2) {
        int size = b().size();
        if (size != 0) {
            if (size != 1) {
                List<C2016h> b10 = b();
                if ((b10 instanceof Collection) && b10.isEmpty()) {
                    return false;
                }
                for (C2016h c2016h : b10) {
                    if (StringsKt.equals(c2016h.a(), str, true) && StringsKt.equals(c2016h.b(), str2, true)) {
                        return true;
                    }
                }
                return false;
            }
            C2016h c2016h2 = (C2016h) b().get(0);
            if (StringsKt.equals(c2016h2.a(), str, true) && StringsKt.equals(c2016h2.b(), str2, true)) {
                return true;
            }
        }
        return false;
    }

    public final C2011c g(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return f(name, value) ? this : new C2011c(this.f16014d, this.f16015e, a(), CollectionsKt.plus((Collection<? extends C2016h>) b(), new C2016h(name, value)));
    }

    public int hashCode() {
        String str = this.f16014d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f16015e.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }

    public /* synthetic */ C2011c(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2011c(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
