package Z4;

import D5.a;
import D5.d;
import D5.f;
import I5.i;
import Q5.ViewContext;
import android.app.Activity;
import android.os.MessageQueue;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b5.d f14636a;

    /* renamed from: b, reason: collision with root package name */
    public ViewContext f14637b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.d f14638c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f14639d;

    public static final class a extends FragmentManager.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractActivityC2168s f14640a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f14641b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ D5.a f14642c;

        public a(AbstractActivityC2168s abstractActivityC2168s, e eVar, D5.a aVar) {
            this.f14640a = abstractActivityC2168s;
            this.f14641b = eVar;
            this.f14642c = aVar;
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public void i(FragmentManager fm, Fragment f10) {
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(f10, "f");
            if (f10.isVisible() && Intrinsics.areEqual(f10.getActivity(), this.f14640a)) {
                this.f14641b.o(this.f14642c, f10);
                fm.I1(this);
            }
        }
    }

    public e(b5.d monitorListener) {
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        this.f14636a = monitorListener;
        this.f14637b = new ViewContext((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        this.f14638c = new b5.d() { // from class: Z4.c
            @Override // b5.d
            public final void a(Object obj) {
                e.m(e.this, (f) obj);
            }
        };
    }

    public static final void m(e eVar, f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0051a) {
            eVar.h((D5.a) event);
        } else if (event instanceof a.d) {
            eVar.h((D5.a) event);
        } else if (event instanceof d.g) {
            eVar.j((D5.d) event);
        }
    }

    public static final boolean q(e eVar, D5.a aVar, AbstractActivityC2168s abstractActivityC2168s, FragmentManager.k kVar) {
        if (!eVar.l(aVar)) {
            eVar.n(aVar);
        }
        abstractActivityC2168s.getSupportFragmentManager().I1(kVar);
        return false;
    }

    public final FragmentManager.k d(D5.a aVar, AbstractActivityC2168s abstractActivityC2168s) {
        return new a(abstractActivityC2168s, this, aVar);
    }

    public final void e(D5.a aVar, AbstractActivityC2168s abstractActivityC2168s) {
        FragmentManager.k d10 = d(aVar, abstractActivityC2168s);
        abstractActivityC2168s.getSupportFragmentManager().o1(d10, true);
        p(aVar, abstractActivityC2168s, d10);
    }

    public final Fragment f(AbstractActivityC2168s abstractActivityC2168s) {
        Object obj;
        List C02 = abstractActivityC2168s.getSupportFragmentManager().C0();
        Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
        Iterator it = C02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Fragment) obj).isVisible()) {
                break;
            }
        }
        return (Fragment) obj;
    }

    public b5.d g() {
        return this.f14636a;
    }

    public final void h(D5.a aVar) {
        Activity c10 = aVar.c();
        if (c10 instanceof AbstractActivityC2168s) {
            i(aVar, (AbstractActivityC2168s) c10);
        } else {
            n(aVar);
        }
    }

    public final void i(D5.a aVar, AbstractActivityC2168s abstractActivityC2168s) {
        Fragment f10 = f(abstractActivityC2168s);
        if (f10 != null) {
            o(aVar, f10);
        } else {
            e(aVar, abstractActivityC2168s);
        }
    }

    public final void j(D5.d dVar) {
        String b10 = dVar.b();
        AbstractActivityC2168s activity = dVar.c().getActivity();
        String simpleName = activity != null ? activity.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "";
        }
        k(new ViewContext(b10, simpleName, dVar.b()));
    }

    public final void k(ViewContext viewContext) {
        if (Intrinsics.areEqual(viewContext, this.f14637b)) {
            return;
        }
        e5.c cVar = (e5.c) S4.c.f10591a.g(i.C0116i.f5427b);
        if (cVar != null) {
            e5.c.T1(cVar, this.f14637b, null, 2, null);
        }
        this.f14637b = viewContext;
        g().a(viewContext);
    }

    public final boolean l(D5.a aVar) {
        return Intrinsics.areEqual(this.f14637b.getActivityName(), aVar.b());
    }

    public final void n(D5.a aVar) {
        k(new ViewContext(aVar.b(), aVar.b(), (String) null, 4, (DefaultConstructorMarker) null));
    }

    public final void o(D5.a aVar, Fragment fragment) {
        String simpleName = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        String b10 = aVar.b();
        String simpleName2 = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
        k(new ViewContext(simpleName, b10, simpleName2));
    }

    public final void p(final D5.a aVar, final AbstractActivityC2168s abstractActivityC2168s, final FragmentManager.k kVar) {
        abstractActivityC2168s.getApplication().getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: Z4.d
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                boolean q10;
                q10 = e.q(e.this, aVar, abstractActivityC2168s, kVar);
                return q10;
            }
        });
    }

    public synchronized void r() {
        E5.b.f3006a.a("navigation monitor started");
        if (!this.f14639d) {
            this.f14639d = true;
            s();
        }
    }

    public final void s() {
        D5.c.f2548a.b(this.f14638c);
    }

    public synchronized void t() {
        E5.b.f3006a.a("navigation monitor stopped");
        this.f14639d = false;
        D5.c.f2548a.f(this.f14638c);
    }
}
