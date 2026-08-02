package r4;

import android.net.Uri;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t4.C6442b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f63980e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final String f63981f = "language";

    /* renamed from: g, reason: collision with root package name */
    public static final String f63982g = "title";

    /* renamed from: h, reason: collision with root package name */
    public static final String f63983h = "uri";

    /* renamed from: i, reason: collision with root package name */
    public static final String f63984i = "type";

    /* renamed from: a, reason: collision with root package name */
    public String f63985a;

    /* renamed from: b, reason: collision with root package name */
    public String f63986b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f63987c;

    /* renamed from: d, reason: collision with root package name */
    public String f63988d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return g.f63981f;
        }

        public final String b() {
            return g.f63982g;
        }

        public final String c() {
            return g.f63984i;
        }

        public final String d() {
            return g.f63983h;
        }

        public final g e(ReadableMap readableMap) {
            g gVar = new g();
            if (readableMap == null) {
                return gVar;
            }
            gVar.i(C6442b.g(readableMap, a()));
            gVar.j(C6442b.h(readableMap, b(), ""));
            Uri parse = Uri.parse(C6442b.h(readableMap, d(), ""));
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            gVar.l(parse);
            gVar.k(C6442b.h(readableMap, c(), ""));
            return gVar;
        }

        public a() {
        }
    }

    public g() {
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        this.f63987c = EMPTY;
    }

    public final String e() {
        return this.f63985a;
    }

    public final String f() {
        return this.f63986b;
    }

    public final String g() {
        return this.f63988d;
    }

    public final Uri h() {
        return this.f63987c;
    }

    public final void i(String str) {
        this.f63985a = str;
    }

    public final void j(String str) {
        this.f63986b = str;
    }

    public final void k(String str) {
        this.f63988d = str;
    }

    public final void l(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.f63987c = uri;
    }
}
