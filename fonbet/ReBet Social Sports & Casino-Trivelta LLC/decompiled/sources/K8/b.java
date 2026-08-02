package K8;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6359a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a f6360b = a.PROD;

    /* renamed from: c, reason: collision with root package name */
    public static final Uri f6361c;

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f6362d;

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f6363e;

    /* renamed from: f, reason: collision with root package name */
    public static final Uri f6364f;

    /* renamed from: g, reason: collision with root package name */
    public static final Uri f6365g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f6366h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f6367i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f6368j;

    public enum a {
        DEV,
        PROD
    }

    /* renamed from: K8.b$b, reason: collision with other inner class name */
    public static final class C0135b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0135b f6371a = new C0135b();

        /* renamed from: b, reason: collision with root package name */
        public static final String f6372b = "v1/%s/search";

        /* renamed from: c, reason: collision with root package name */
        public static final String f6373c = "v1/%s/trending";

        /* renamed from: d, reason: collision with root package name */
        public static final String f6374d = "v1/trending/searches";

        /* renamed from: e, reason: collision with root package name */
        public static final String f6375e = "v1/channels/search";

        /* renamed from: f, reason: collision with root package name */
        public static final String f6376f = "v1/%s/random";

        /* renamed from: g, reason: collision with root package name */
        public static final String f6377g = "v1/gifs/%s";

        /* renamed from: h, reason: collision with root package name */
        public static final String f6378h = "v1/gifs";

        /* renamed from: i, reason: collision with root package name */
        public static final String f6379i = "v1/emoji";

        /* renamed from: j, reason: collision with root package name */
        public static final String f6380j = "v2/emoji";

        /* renamed from: k, reason: collision with root package name */
        public static final String f6381k = "v2/emoji/%s/variations";

        /* renamed from: l, reason: collision with root package name */
        public static final String f6382l = "v2/pingback";

        /* renamed from: m, reason: collision with root package name */
        public static final String f6383m = "v1/text/animate";

        public final String a() {
            return f6383m;
        }

        public final String b() {
            return f6375e;
        }

        public final String c() {
            return f6380j;
        }

        public final String d() {
            return f6381k;
        }

        public final String e() {
            return f6377g;
        }

        public final String f() {
            return f6378h;
        }

        public final String g() {
            return f6382l;
        }

        public final String h() {
            return f6372b;
        }

        public final String i() {
            return f6373c;
        }

        public final String j() {
            return f6374d;
        }
    }

    static {
        Uri parse = Uri.parse("https://api.giphy.com");
        Intrinsics.checkNotNullExpressionValue(parse, "parse(\"https://api.giphy.com\")");
        f6361c = parse;
        Uri parse2 = Uri.parse("https://x.giphy.com");
        Intrinsics.checkNotNullExpressionValue(parse2, "parse(\"https://x.giphy.com\")");
        f6362d = parse2;
        Uri parse3 = Uri.parse("https://x-qa.giphy.com");
        Intrinsics.checkNotNullExpressionValue(parse3, "parse(\"https://x-qa.giphy.com\")");
        f6363e = parse3;
        f6364f = Uri.parse("https://pingback.giphy.com");
        Uri parse4 = Uri.parse("https://giphy.com");
        Intrinsics.checkNotNullExpressionValue(parse4, "parse(\"https://giphy.com\")");
        f6365g = parse4;
        f6366h = "api_key";
        f6367i = "pingback_id";
        f6368j = "Content-Type";
    }

    public final String a() {
        return f6366h;
    }

    public final String b() {
        return f6368j;
    }

    public final String c() {
        return f6367i;
    }

    public final Uri d() {
        return f6364f;
    }

    public final Uri e() {
        return f6361c;
    }
}
