package S4;

import Bh.s;
import I5.i;
import T4.e;
import V4.d;
import a5.C1919a;
import android.app.Application;
import b5.InterfaceC2398a;
import b5.b;
import c5.C2889b;
import com.plaid.internal.EnumC3631g;
import d5.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rh.InterfaceC6300r;

/* loaded from: classes2.dex */
public final class c implements b5.b {

    /* renamed from: b, reason: collision with root package name */
    public static N5.a f10592b;

    /* renamed from: c, reason: collision with root package name */
    public static Application f10593c;

    /* renamed from: d, reason: collision with root package name */
    public static s f10594d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f10595e;

    /* renamed from: a, reason: collision with root package name */
    public static final c f10591a = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final Map f10596f = new LinkedHashMap();

    public static final InterfaceC2398a h(i iVar) {
        return (InterfaceC2398a) f10596f.get(iVar);
    }

    public static final List i() {
        return CollectionsKt.toList(f10596f.values());
    }

    @Override // b5.b
    public List a() {
        List list = (List) e(new Function0() { // from class: S4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List i10;
                i10 = c.i();
                return i10;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final void d(i iVar) {
        Object c2889b;
        Application application;
        Application application2;
        Application application3;
        Application application4;
        Application application5;
        Application application6;
        Application application7;
        Application application8;
        Application application9;
        Application application10;
        Application application11;
        E5.b.f3006a.a("Adding instrumentation: " + iVar);
        s sVar = f10594d;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tracerProvider");
            sVar = null;
        }
        InterfaceC6300r interfaceC6300r = sVar.get(iVar.getName());
        if (Intrinsics.areEqual(iVar, i.f.f5424b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application12 = f10593c;
            if (application12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application11 = null;
            } else {
                application11 = application12;
            }
            c2889b = new d(interfaceC6300r, application11, f(), null, null, null, 56, null);
        } else if (Intrinsics.areEqual(iVar, i.a.f5420b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application13 = f10593c;
            if (application13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application10 = null;
            } else {
                application10 = application13;
            }
            c2889b = new e(interfaceC6300r, application10, f(), null, null, null, null, 120, null);
        } else if (Intrinsics.areEqual(iVar, i.j.f5428b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application14 = f10593c;
            if (application14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application9 = null;
            } else {
                application9 = application14;
            }
            c2889b = new Z4.b(interfaceC6300r, application9, f(), null, null, null, 56, null);
        } else if (Intrinsics.areEqual(iVar, i.c.f5422b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application15 = f10593c;
            if (application15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application8 = null;
            } else {
                application8 = application15;
            }
            c2889b = new X4.b(interfaceC6300r, application8, f(), null, null, null, null, 120, null);
        } else if (Intrinsics.areEqual(iVar, i.e.f5423b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application16 = f10593c;
            if (application16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application7 = null;
            } else {
                application7 = application16;
            }
            c2889b = new U4.c(interfaceC6300r, application7, f(), null, null, null, null, 120, null);
        } else if (Intrinsics.areEqual(iVar, i.C0116i.f5427b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application17 = f10593c;
            if (application17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application6 = null;
            } else {
                application6 = application17;
            }
            c2889b = new e5.c(interfaceC6300r, application6, f(), null, null, null, 56, null);
        } else if (Intrinsics.areEqual(iVar, i.k.f5429b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application18 = f10593c;
            if (application18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application5 = null;
            } else {
                application5 = application18;
            }
            c2889b = new C1919a(interfaceC6300r, application5, f(), null, null, null, null, 120, null);
        } else if (Intrinsics.areEqual(iVar, i.g.f5425b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application19 = f10593c;
            if (application19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application4 = null;
            } else {
                application4 = application19;
            }
            c2889b = new W4.b(interfaceC6300r, application4, f(), null, null, null, 56, null);
        } else if (Intrinsics.areEqual(iVar, i.h.f5426b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application20 = f10593c;
            if (application20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application3 = null;
            } else {
                application3 = application20;
            }
            c2889b = new Y4.b(interfaceC6300r, application3, f(), null, null, null, 56, null);
        } else if (Intrinsics.areEqual(iVar, i.m.f5431b)) {
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application21 = f10593c;
            if (application21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application2 = null;
            } else {
                application2 = application21;
            }
            c2889b = new h(interfaceC6300r, application2, f(), null, null, null, null, null, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        } else {
            if (!Intrinsics.areEqual(iVar, i.l.f5430b)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(interfaceC6300r);
            Application application22 = f10593c;
            if (application22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application = null;
            } else {
                application = application22;
            }
            c2889b = new C2889b(interfaceC6300r, application, f(), null, null, null, 56, null);
        }
        f10596f.put(iVar, c2889b);
    }

    public final Object e(Function0 function0) {
        if (f10595e) {
            return function0.invoke();
        }
        E5.b.f3006a.k("InstrumentationManager is not initialized please call InstrumentationManager.initialize() first");
        return null;
    }

    public N5.a f() {
        N5.a aVar = f10592b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configurationsManager");
        return null;
    }

    public InterfaceC2398a g(final i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (InterfaceC2398a) e(new Function0() { // from class: S4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC2398a h10;
                h10 = c.h(i.this);
                return h10;
            }
        });
    }

    public final synchronized void j(Application application, s tracerProvider, N5.a configurationsManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(tracerProvider, "tracerProvider");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        if (f10595e) {
            return;
        }
        E5.b.f3006a.a("instrumentation manager init called");
        f10595e = true;
        f10593c = application;
        f10594d = tracerProvider;
        f10591a.m(configurationsManager);
        k();
        o();
    }

    public final void k() {
        List a10 = i.f5419a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (f10591a.l((i) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f10591a.d((i) it.next());
        }
    }

    public final boolean l(i iVar) {
        if (iVar.a() == null) {
            return true;
        }
        return !Intrinsics.areEqual(f().k().c().l().get(r3), Boolean.FALSE);
    }

    public void m(N5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f10592b = aVar;
    }

    public synchronized void n() {
        if (f10595e) {
            p();
            f10596f.clear();
            f10595e = false;
        }
    }

    public void o() {
        b.a.a(this);
    }

    public void p() {
        b.a.b(this);
    }
}
