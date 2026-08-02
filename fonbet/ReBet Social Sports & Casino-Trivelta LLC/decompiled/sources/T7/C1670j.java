package T7;

import T7.C1682w;
import T7.M;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import g6.C4331C;
import g6.C4357q;
import g6.InterfaceC4350j;
import j.AbstractC5086b;
import j.InterfaceC5085a;
import k.AbstractC5140a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: T7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1670j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1670j f11136a = new C1670j();

    /* renamed from: T7.j$a */
    public interface a {
        Bundle a();

        Bundle getParameters();
    }

    /* renamed from: T7.j$b */
    public static final class b extends AbstractC5140a {
        @Override // k.AbstractC5140a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, Intent input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input;
        }

        @Override // k.AbstractC5140a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair parseResult(int i10, Intent intent) {
            Pair create = Pair.create(Integer.valueOf(i10), intent);
            Intrinsics.checkNotNullExpressionValue(create, "create(resultCode, intent)");
            return create;
        }
    }

    public static final boolean b(InterfaceC1668h feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return c(feature).d() != -1;
    }

    public static final M.f c(InterfaceC1668h feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        String m10 = C4331C.m();
        String b10 = feature.b();
        return M.u(b10, f11136a.d(m10, b10, feature));
    }

    public static final void e(C1661a appCall, B fragmentWrapper) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        fragmentWrapper.d(appCall.e(), appCall.d());
        appCall.f();
    }

    public static final void f(C1661a appCall, Activity activity) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(appCall.e(), appCall.d());
        appCall.f();
    }

    public static final void g(C1661a appCall, j.d registry, InterfaceC4350j interfaceC4350j) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intent e10 = appCall.e();
        if (e10 == null) {
            return;
        }
        n(registry, interfaceC4350j, e10, appCall.d());
        appCall.f();
    }

    public static final void h(C1661a appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        l(appCall, new C4357q("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void i(C1661a appCall, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Z z10 = Z.f11052a;
        Z.e(C4331C.l(), C1667g.b());
        Z.h(C4331C.l());
        Intent intent = new Intent(C4331C.l(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f30278d, str);
        intent.putExtra(CustomTabMainActivity.f30279e, bundle);
        intent.putExtra(CustomTabMainActivity.f30280f, C1667g.a());
        M m10 = M.f11009a;
        M.D(intent, appCall.c().toString(), str, M.x(), null);
        appCall.g(intent);
    }

    public static final void j(C1661a appCall, C4357q c4357q) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        if (c4357q == null) {
            return;
        }
        Z z10 = Z.f11052a;
        Z.f(C4331C.l());
        Intent intent = new Intent();
        intent.setClass(C4331C.l(), FacebookActivity.class);
        intent.setAction("PassThrough");
        M m10 = M.f11009a;
        M.D(intent, appCall.c().toString(), null, M.x(), M.i(c4357q));
        appCall.g(intent);
    }

    public static final void k(C1661a appCall, a parameterProvider, InterfaceC1668h feature) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(parameterProvider, "parameterProvider");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Context l10 = C4331C.l();
        String b10 = feature.b();
        M.f c10 = c(feature);
        int d10 = c10.d();
        if (d10 == -1) {
            throw new C4357q("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle parameters = M.C(d10) ? parameterProvider.getParameters() : parameterProvider.a();
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent l11 = M.l(l10, appCall.c().toString(), b10, c10, parameters);
        if (l11 == null) {
            throw new C4357q("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.g(l11);
    }

    public static final void l(C1661a appCall, C4357q c4357q) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        j(appCall, c4357q);
    }

    public static final void m(C1661a appCall, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Z z10 = Z.f11052a;
        Z.f(C4331C.l());
        Z.h(C4331C.l());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        M m10 = M.f11009a;
        M.D(intent, appCall.c().toString(), str, M.x(), bundle2);
        intent.setClass(C4331C.l(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        appCall.g(intent);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, j.b] */
    public static final void n(j.d registry, final InterfaceC4350j interfaceC4350j, Intent intent, final int i10) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? m10 = registry.m(Intrinsics.stringPlus("facebook-dialog-request-", Integer.valueOf(i10)), new b(), new InterfaceC5085a() { // from class: T7.i
            @Override // j.InterfaceC5085a
            public final void a(Object obj) {
                C1670j.o(InterfaceC4350j.this, i10, objectRef, (Pair) obj);
            }
        });
        objectRef.element = m10;
        if (m10 == 0) {
            return;
        }
        m10.b(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(InterfaceC4350j interfaceC4350j, int i10, Ref.ObjectRef launcher, Pair pair) {
        Intrinsics.checkNotNullParameter(launcher, "$launcher");
        if (interfaceC4350j == null) {
            interfaceC4350j = new C1665e();
        }
        Object obj = pair.first;
        Intrinsics.checkNotNullExpressionValue(obj, "result.first");
        interfaceC4350j.a(i10, ((Number) obj).intValue(), (Intent) pair.second);
        AbstractC5086b abstractC5086b = (AbstractC5086b) launcher.element;
        if (abstractC5086b == null) {
            return;
        }
        synchronized (abstractC5086b) {
            abstractC5086b.d();
            launcher.element = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int[] d(String str, String str2, InterfaceC1668h interfaceC1668h) {
        C1682w.b a10 = C1682w.f11214w.a(str, str2, interfaceC1668h.name());
        int[] c10 = a10 == null ? null : a10.c();
        return c10 == null ? new int[]{interfaceC1668h.a()} : c10;
    }
}
