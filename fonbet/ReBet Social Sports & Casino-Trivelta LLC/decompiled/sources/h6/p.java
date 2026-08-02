package h6;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final a f47798b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f47799c = p.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final s f47800a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            s.f47813c.f(application, str);
        }

        public final void b() {
            C4477d.g(null);
        }

        public final String c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return s.f47813c.i(context);
        }

        public final b d() {
            return s.f47813c.j();
        }

        public final String e() {
            return C4477d.c();
        }

        public final void f(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            s.f47813c.m(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final p g(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new p(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void h() {
            s.f47813c.s();
        }

        public final void i(b flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            s.f47813c.t(flushBehavior);
        }

        public final void j(String str) {
            s.f47813c.v(str);
        }

        public final void k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            K.k(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        public final void l(String str) {
            C4477d.g(str);
        }

        public a() {
        }
    }

    public enum b {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public enum c {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public enum d {
        NEW,
        REFURBISHED,
        USED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ p(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    public static final void a() {
        f47798b.b();
    }

    public static final String c(Context context) {
        return f47798b.c(context);
    }

    public static final String d() {
        return f47798b.e();
    }

    public static final p j(Context context) {
        return f47798b.g(context);
    }

    public static final void k(b bVar) {
        f47798b.i(bVar);
    }

    public static final void l(String str) {
        f47798b.j(str);
    }

    public static final void m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        f47798b.k(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public static final void n(String str) {
        f47798b.l(str);
    }

    public final void b() {
        this.f47800a.l();
    }

    public final void e(String str, double d10, Bundle bundle) {
        this.f47800a.n(str, d10, bundle);
    }

    public final void f(String str, Bundle bundle) {
        this.f47800a.o(str, bundle);
    }

    public final void g(String str, c cVar, d dVar, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        this.f47800a.t(str, cVar, dVar, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void h(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.f47800a.u(bigDecimal, currency, bundle);
    }

    public final void i(Bundle payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f47800a.x(payload, null);
    }

    public p(Context context, String str, AccessToken accessToken) {
        this.f47800a = new s(context, str, accessToken);
    }
}
