package h6;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import g6.C4331C;
import h6.p;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4470F {

    /* renamed from: b, reason: collision with root package name */
    public static final a f47729b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final s f47730a;

    /* renamed from: h6.F$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4470F a(Context context, String str) {
            return new C4470F(context, str);
        }

        public final C4470F b(String activityName, String str, AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new C4470F(activityName, str, accessToken);
        }

        public final Executor c() {
            return s.f47813c.h();
        }

        public final p.b d() {
            return s.f47813c.j();
        }

        public final String e() {
            return s.f47813c.l();
        }

        public final void f(Map ud2) {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            K.i(ud2);
        }

        public a() {
        }
    }

    public C4470F(s loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f47730a = loggerImpl;
    }

    public final void a() {
        this.f47730a.l();
    }

    public final void b(Bundle parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || C4331C.p()) {
            this.f47730a.r("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void c(String str, double d10, Bundle bundle) {
        if (C4331C.p()) {
            this.f47730a.n(str, d10, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (C4331C.p()) {
            this.f47730a.o(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.f47730a.q(str, str2);
    }

    public final void f(String str) {
        if (C4331C.p()) {
            this.f47730a.r(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (C4331C.p()) {
            this.f47730a.r(str, null, bundle);
        }
    }

    public final void h(String str, Double d10, Bundle bundle) {
        if (C4331C.p()) {
            this.f47730a.r(str, d10, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C4331C.p()) {
            this.f47730a.s(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C4331C.p()) {
            this.f47730a.w(bigDecimal, currency, bundle);
        }
    }

    public C4470F(Context context) {
        this(new s(context, (String) null, (AccessToken) null));
    }

    public C4470F(Context context, String str) {
        this(new s(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4470F(String activityName, String str, AccessToken accessToken) {
        this(new s(activityName, str, accessToken));
        Intrinsics.checkNotNullParameter(activityName, "activityName");
    }
}
