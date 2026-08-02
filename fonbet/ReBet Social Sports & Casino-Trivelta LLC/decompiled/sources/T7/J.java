package T7;

import android.util.Log;
import g6.C4331C;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: e, reason: collision with root package name */
    public static final a f10993e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f10994f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g6.N f10995a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10996b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f10997c;

    /* renamed from: d, reason: collision with root package name */
    public int f10998d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(g6.N behavior, int i10, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (C4331C.I(behavior)) {
                String f10 = f(string);
                if (!StringsKt.startsWith$default(tag, "FacebookSDK.", false, 2, (Object) null)) {
                    tag = Intrinsics.stringPlus("FacebookSDK.", tag);
                }
                Log.println(i10, tag, f10);
                if (behavior == g6.N.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(g6.N behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            a(behavior, 3, tag, string);
        }

        public final void c(g6.N behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (C4331C.I(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                a(behavior, 3, tag, format2);
            }
        }

        public final synchronized void d(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            C4331C c4331c = C4331C.f46921a;
            if (!C4331C.I(g6.N.INCLUDE_ACCESS_TOKENS)) {
                e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String original, String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            J.f10994f.put(original, replace);
        }

        public final synchronized String f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : J.f10994f.entrySet()) {
                str2 = StringsKt.replace$default(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }

        public a() {
        }
    }

    public J(g6.N behavior, String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f10998d = 3;
        this.f10995a = behavior;
        this.f10996b = Intrinsics.stringPlus("FacebookSDK.", Z.n(tag, "tag"));
        this.f10997c = new StringBuilder();
    }

    public final void b(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (g()) {
            this.f10997c.append(string);
        }
    }

    public final void c(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (g()) {
            StringBuilder sb2 = this.f10997c;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            sb2.append(format2);
        }
    }

    public final void d(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        c("  %s:\t%s\n", key, value);
    }

    public final void e() {
        String sb2 = this.f10997c.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "contents.toString()");
        f(sb2);
        this.f10997c = new StringBuilder();
    }

    public final void f(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        f10993e.a(this.f10995a, this.f10998d, this.f10996b, string);
    }

    public final boolean g() {
        C4331C c4331c = C4331C.f46921a;
        return C4331C.I(this.f10995a);
    }
}
