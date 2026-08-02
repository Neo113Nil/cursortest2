package Uc;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dd.C4062i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends FrameLayout implements FragmentManager.m {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12163h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12164a;

    /* renamed from: b, reason: collision with root package name */
    public FragmentManager f12165b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12166c;

    /* renamed from: d, reason: collision with root package name */
    public final List f12167d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12168e;

    /* renamed from: f, reason: collision with root package name */
    public final c f12169f;

    /* renamed from: g, reason: collision with root package name */
    public final List f12170g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, WeakReference delegate) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f12164a = delegate;
        this.f12166c = new ArrayList();
        this.f12167d = new ArrayList();
        this.f12168e = new ArrayList();
        this.f12169f = new c();
        this.f12170g = new ArrayList();
        setId(Qc.m.f9634a.a());
    }

    public static final void g(i iVar) {
        iVar.s();
    }

    private final boolean getHasPendingOperations() {
        return (this.f12168e.isEmpty() && this.f12167d.isEmpty()) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void b(Fragment fragment, boolean z10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!(fragment instanceof com.swmansion.rnscreens.gamma.stack.screen.d)) {
            Log.w("StackContainer", "[RNScreens] Unexpected type of fragment: " + fragment.getClass().getSimpleName());
            return;
        }
        com.swmansion.rnscreens.gamma.stack.screen.d dVar = (com.swmansion.rnscreens.gamma.stack.screen.d) fragment;
        if (dVar.isRemoving()) {
            j jVar = (j) this.f12164a.get();
            if (jVar != null) {
                jVar.a(dVar.e0());
            }
            if (this.f12166c.contains(fragment)) {
                m(dVar);
            }
        }
    }

    public final void f() {
        Object obj;
        this.f12170g.clear();
        if (getHasPendingOperations()) {
            this.f12170g.add(new d(new Runnable() { // from class: Uc.h
                @Override // java.lang.Runnable
                public final void run() {
                    i.g(i.this);
                }
            }, true, false));
        }
        for (f fVar : this.f12167d) {
            Iterator it = this.f12166c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((com.swmansion.rnscreens.gamma.stack.screen.d) obj).e0() == fVar.a()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                throw new IllegalStateException("[RNScreens] Unable to find a fragment to pop");
            }
            com.swmansion.rnscreens.gamma.stack.screen.d dVar = (com.swmansion.rnscreens.gamma.stack.screen.d) obj;
            if (this.f12166c.size() <= 1) {
                throw new IllegalStateException("[RNScreens] Attempt to pop last screen from the stack");
            }
            this.f12170g.add(new e(dVar));
            List list = this.f12166c;
            if (list.remove(CollectionsKt.getLastIndex(list)) != dVar) {
                throw new IllegalStateException("[RNScreens] Attempt to pop non-top screen");
            }
        }
        Iterator it2 = this.f12168e.iterator();
        while (it2.hasNext()) {
            com.swmansion.rnscreens.gamma.stack.screen.d i10 = i(((g) it2.next()).a(), !this.f12166c.isEmpty());
            this.f12170g.add(new Uc.a(i10, getId(), !this.f12166c.isEmpty(), false, 8, null));
            this.f12166c.add(i10);
        }
        if (this.f12166c.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Stack should never be empty after updates");
        }
        this.f12167d.clear();
        this.f12168e.clear();
    }

    public final k h() {
        return (k) getParent();
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.d i(com.swmansion.rnscreens.gamma.stack.screen.b bVar, boolean z10) {
        com.swmansion.rnscreens.gamma.stack.screen.d dVar = new com.swmansion.rnscreens.gamma.stack.screen.d(bVar, z10);
        bVar.getScreenKey();
        dVar.toString();
        return dVar;
    }

    public final void j() {
        getId();
        Iterator it = this.f12166c.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.stack.screen.d) it.next()).e0().getScreenKey();
        }
    }

    public final void k(com.swmansion.rnscreens.gamma.stack.screen.b stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f12167d.add(new f(stackScreen));
    }

    public final void l(com.swmansion.rnscreens.gamma.stack.screen.b stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f12168e.add(new g(stackScreen));
    }

    public final void m(com.swmansion.rnscreens.gamma.stack.screen.d dVar) {
        if (!this.f12166c.remove(dVar)) {
            throw new IllegalArgumentException("[RNScreens] onNativeFragmentPop must be called with the fragment present in stack model");
        }
        if (this.f12166c.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Stack model should not be empty after a native pop");
        }
        if (p().H0() == dVar) {
            throw new IllegalStateException("[RNScreens] Primary navigation fragment not updated by native pop");
        }
        s();
    }

    public final void n() {
        if (getHasPendingOperations() && isAttachedToWindow()) {
            o(p());
        }
    }

    public final void o(FragmentManager fragmentManager) {
        f();
        this.f12169f.g(fragmentManager, this.f12170g, false);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C4062i.f45172a.a("StackContainer", "StackContainer [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        q();
        r();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p().q1(this);
        this.f12165b = null;
    }

    public final FragmentManager p() {
        FragmentManager fragmentManager = this.f12165b;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
    }

    public final void q() {
        FragmentManager a10 = Qc.b.f9621a.a(this);
        if (a10 == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        a10.n(this);
        this.f12165b = a10;
    }

    public final void r() {
        k h10;
        if (!isAttachedToWindow() || !Nc.c.c(this) || isLaidOut() || isInLayout() || (h10 = h()) == null) {
            return;
        }
        h10.b();
    }

    public final void s() {
        FragmentManager p10 = p();
        List C02 = p10.C0();
        Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : C02) {
            if (obj instanceof com.swmansion.rnscreens.gamma.stack.screen.d) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Empty fragment manager while attempting to update top fragment");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.stack.screen.d) it.next()).g0();
        }
        ((com.swmansion.rnscreens.gamma.stack.screen.d) CollectionsKt.last((List) arrayList)).f0();
        if (p10.H0() != CollectionsKt.last((List) arrayList)) {
            throw new IllegalStateException("[RNScreens] Top fragment different from primary navigation fragment");
        }
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void onBackStackChanged() {
    }
}
