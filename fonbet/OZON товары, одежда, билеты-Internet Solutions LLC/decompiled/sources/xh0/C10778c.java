package xh0;

import B0.A0;
import Sc.o;
import We.B;
import We.C4871m;
import We.C4876s;
import We.E;
import We.InterfaceC4875q;
import Zg0.e;
import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* renamed from: xh0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10778c {
    @NotNull
    public static E a(@NotNull Context context, @NotNull Zg0.e configuration, @NotNull List additionalInterceptors) {
        C10776a c10776a;
        List<B> a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(additionalInterceptors, "additionalInterceptors");
        E.a aVar = new E.a();
        C10777b c10777b = null;
        if (configuration.b() instanceof e.a.b) {
            c10776a = new C10776a(context, (e.a.b) configuration.b());
        } else {
            b(configuration.h(), ((e.a.C0681a) configuration.b()).a());
            c10776a = null;
        }
        e.b d11 = configuration.d();
        if (Intrinsics.d(d11, e.b.a.f35940a)) {
            if (configuration.f() == null) {
                throw new IllegalArgumentException("The configuration must contain a CookieJar.");
            }
        } else if (d11 instanceof e.b.AbstractC0682b.C0683b) {
            c10777b = new C10777b((e.b.AbstractC0682b.C0683b) configuration.d());
            Unit unit = Unit.f71690a;
        } else {
            if (!(d11 instanceof e.b.AbstractC0682b.a)) {
                throw new o();
            }
            e.c h11 = configuration.h();
            ((e.b.AbstractC0682b.a) configuration.d()).getClass();
            b(h11, null);
            Unit unit2 = Unit.f71690a;
        }
        e.d i11 = configuration.i();
        if (i11 != null) {
            long h12 = kotlin.time.b.h(i11.b());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.f(h12, timeUnit);
            aVar.X(kotlin.time.b.h(i11.c()), timeUnit);
            aVar.b0(kotlin.time.b.h(i11.d()), timeUnit);
            aVar.d(kotlin.time.b.h(i11.a()), timeUnit);
        }
        InterfaceC4875q f7 = configuration.f();
        if (f7 != null) {
            aVar.h(f7);
        }
        if (c10777b != null) {
            aVar.a(c10777b);
        }
        if (c10776a != null) {
            aVar.a(c10776a);
        }
        e.c h13 = configuration.h();
        if (h13 != null && (a11 = h13.a()) != null) {
            Iterator<T> it = a11.iterator();
            while (it.hasNext()) {
                aVar.a((B) it.next());
            }
        }
        Iterator it2 = additionalInterceptors.iterator();
        while (it2.hasNext()) {
            aVar.a((B) it2.next());
        }
        C4871m e11 = configuration.e();
        if (e11 != null) {
            aVar.g(e11);
        }
        C4876s g10 = configuration.g();
        if (g10 != null) {
            aVar.i(g10);
        }
        return new E(aVar);
    }

    private static void b(e.c cVar, kotlin.reflect.d dVar) {
        List<B> a11;
        boolean z11;
        if (cVar != null && (a11 = cVar.a()) != null) {
            List<B> list = a11;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (N.b(((B) it.next()).getClass()).equals(dVar)) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (z11) {
                return;
            }
        }
        throw new IllegalArgumentException(A0.b("The configuration must contain ", dVar.B(), ".").toString());
    }
}
