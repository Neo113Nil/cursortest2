package Q4;

import I5.i;
import Q5.UserContext;
import Q5.x;
import a5.C1920b;
import android.app.Application;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public final class q implements S5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f9352a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f9353b;

    public static final Unit B(Q5.b bVar, String str, Map map, Map map2) {
        H5.b.f4801a.g(bVar, str, map, map2);
        return Unit.INSTANCE;
    }

    public static final Unit D(U4.a aVar) {
        H5.b.f4801a.h(aVar);
        return Unit.INSTANCE;
    }

    public static final Unit G(String str, List list) {
        if (H5.a.f4799a.c()) {
            return Unit.INSTANCE;
        }
        e5.c cVar = (e5.c) S4.c.f10591a.g(i.C0116i.f5427b);
        if (cVar == null) {
            return Unit.INSTANCE;
        }
        cVar.Y1(e5.d.b(str, list));
        return Unit.INSTANCE;
    }

    public static final Unit H(String str, String str2, double d10) {
        if (H5.a.f4799a.c()) {
            return Unit.INSTANCE;
        }
        e5.c cVar = (e5.c) S4.c.f10591a.g(i.C0116i.f5427b);
        if (cVar == null) {
            return Unit.INSTANCE;
        }
        cVar.Y1(e5.d.a(str, str2, d10));
        return Unit.INSTANCE;
    }

    public static final Unit J(C1920b c1920b) {
        H5.b.f4801a.i(c1920b);
        return Unit.INSTANCE;
    }

    public static final Unit L(x xVar) {
        if (H5.a.f4799a.c()) {
            E5.b.f3006a.k("custom user interactions are not supported in native");
            return Unit.INSTANCE;
        }
        H5.b.f4801a.j(xVar);
        return Unit.INSTANCE;
    }

    public static final Unit N(String str, long j10) {
        H5.b.f4801a.k(str, j10);
        return Unit.INSTANCE;
    }

    public static final Unit P(List list) {
        if (H5.a.f4799a.c()) {
            return Unit.INSTANCE;
        }
        H5.b.f4801a.l(list);
        return Unit.INSTANCE;
    }

    public static final Unit R(String str, String str2) {
        H5.b.f4801a.n(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit T(Map map) {
        H5.b.f4801a.o(map);
        return Unit.INSTANCE;
    }

    public static final Unit V(UserContext userContext) {
        H5.b.f4801a.q(userContext);
        return Unit.INSTANCE;
    }

    public static final Unit X(String str) {
        H5.b.f4801a.r(str);
        return Unit.INSTANCE;
    }

    public static final Unit a0() {
        H5.b.f4801a.s();
        K5.a.f6246a.a();
        f9353b = false;
        return Unit.INSTANCE;
    }

    public static final Map s() {
        return H5.b.f4801a.a();
    }

    public static final String u() {
        return H5.b.f4801a.c();
    }

    public static final UserContext w() {
        return H5.b.f4801a.e();
    }

    public void A(final Q5.b severity, final String message, final Map map, final Map map2) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        q(new Function0() { // from class: Q4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit B10;
                B10 = q.B(Q5.b.this, message, map, map2);
                return B10;
            }
        });
    }

    public void C(final U4.a errorDecorator) {
        Intrinsics.checkNotNullParameter(errorDecorator, "errorDecorator");
        q(new Function0() { // from class: Q4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit D10;
                D10 = q.D(U4.a.this);
                return D10;
            }
        });
    }

    public void E(final String type, final double d10, final String units) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(units, "units");
        q(new Function0() { // from class: Q4.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit H10;
                H10 = q.H(type, units, d10);
                return H10;
            }
        });
    }

    public void F(final String type, final List metrics) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        q(new Function0() { // from class: Q4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit G10;
                G10 = q.G(type, metrics);
                return G10;
            }
        });
    }

    public void I(final C1920b details) {
        Intrinsics.checkNotNullParameter(details, "details");
        q(new Function0() { // from class: Q4.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit J10;
                J10 = q.J(C1920b.this);
                return J10;
            }
        });
    }

    public void K(final x details) {
        Intrinsics.checkNotNullParameter(details, "details");
        q(new Function0() { // from class: Q4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit L10;
                L10 = q.L(x.this);
                return L10;
            }
        });
    }

    public void M(final String name, final long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        q(new Function0() { // from class: Q4.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit N10;
                N10 = q.N(name, j10);
                return N10;
            }
        });
    }

    public void O(final List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        q(new Function0() { // from class: Q4.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit P10;
                P10 = q.P(data);
                return P10;
            }
        });
    }

    public void Q(final String appName, final String appVersion) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        q(new Function0() { // from class: Q4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit R10;
                R10 = q.R(appName, appVersion);
                return R10;
            }
        });
    }

    public void S(final Map labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        q(new Function0() { // from class: Q4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit T10;
                T10 = q.T(labels);
                return T10;
            }
        });
    }

    public void U(final UserContext userContext) {
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        q(new Function0() { // from class: Q4.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit V10;
                V10 = q.V(UserContext.this);
                return V10;
            }
        });
    }

    public void W(final String viewName) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        q(new Function0() { // from class: Q4.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit X10;
                X10 = q.X(viewName);
                return X10;
            }
        });
    }

    public final boolean Y(Q5.c cVar) {
        boolean z10 = RangesKt.random(new IntRange(0, 100), Random.INSTANCE) > cVar.r();
        E5.b.f3006a.a("dropping session: " + z10);
        return z10;
    }

    public synchronized void Z() {
        q(new Function0() { // from class: Q4.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit a02;
                a02 = q.a0();
                return a02;
            }
        });
    }

    public final Object q(Function0 function0) {
        if (f9353b) {
            return function0.invoke();
        }
        E5.b.f3006a.k("CoralogixRum is not initialized please call CoralogixRum.initialize() first");
        return null;
    }

    public Map r() {
        Map map = (Map) q(new Function0() { // from class: Q4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map s10;
                s10 = q.s();
                return s10;
            }
        });
        return map == null ? MapsKt.emptyMap() : map;
    }

    public String t() {
        String str = (String) q(new Function0() { // from class: Q4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String u10;
                u10 = q.u();
                return u10;
            }
        });
        return str == null ? "" : str;
    }

    public UserContext v() {
        UserContext userContext = (UserContext) q(new Function0() { // from class: Q4.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UserContext w10;
                w10 = q.w();
                return w10;
            }
        });
        return userContext == null ? new UserContext((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null) : userContext;
    }

    public synchronized void x(Application application, Q5.c options, Q5.k framework) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(framework, "framework");
        if (f9353b) {
            E5.b.f3006a.k("CoralogixRum is already initialized!");
        } else {
            if (Y(options)) {
                return;
            }
            K5.a.f6246a.b(this);
            H5.b.f4801a.f(application, options, framework);
            f9353b = true;
        }
    }

    public boolean y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getBoolean(r.f9354a);
    }

    public synchronized boolean z() {
        return f9353b;
    }
}
