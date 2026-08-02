package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C2035b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: g, reason: collision with root package name */
    public static final a f20112g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f20113a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20114b;

    /* renamed from: c, reason: collision with root package name */
    public final List f20115c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20116d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20117e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20118f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final X a(ViewGroup container, FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Y I02 = fragmentManager.I0();
            Intrinsics.checkNotNullExpressionValue(I02, "fragmentManager.specialEffectsControllerFactory");
            return b(container, I02);
        }

        public final X b(ViewGroup container, Y factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(R0.b.f9916b);
            if (tag instanceof X) {
                return (X) tag;
            }
            X a10 = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(a10, "factory.createController(container)");
            container.setTag(R0.b.f9916b, a10);
            return a10;
        }

        public a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20119a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20120b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20121c;

        public final void a(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f20121c) {
                c(container);
            }
            this.f20121c = true;
        }

        public boolean b() {
            return this.f20119a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(C2035b backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void f(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public final void g(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f20120b) {
                f(container);
            }
            this.f20120b = true;
        }
    }

    public static final class c extends d {

        /* renamed from: l, reason: collision with root package name */
        public final K f20122l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(d.b finalState, d.a lifecycleImpact, K fragmentStateManager) {
            super(finalState, lifecycleImpact, r0);
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Fragment k10 = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
            this.f20122l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.X.d
        public void d() {
            super.d();
            h().mTransitioning = false;
            this.f20122l.m();
        }

        @Override // androidx.fragment.app.X.d
        public void o() {
            if (m()) {
                return;
            }
            super.o();
            if (i() != d.a.ADDING) {
                if (i() == d.a.REMOVING) {
                    Fragment k10 = this.f20122l.k();
                    Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
                    View requireView = k10.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                    if (FragmentManager.Q0(2)) {
                        Objects.toString(requireView.findFocus());
                        requireView.toString();
                        k10.toString();
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment k11 = this.f20122l.k();
            Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
            View findFocus = k11.mView.findFocus();
            if (findFocus != null) {
                k11.setFocusedView(findFocus);
                if (FragmentManager.Q0(2)) {
                    findFocus.toString();
                    k11.toString();
                }
            }
            View requireView2 = h().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                if (FragmentManager.Q0(2)) {
                    k11.toString();
                    requireView2.toString();
                }
                this.f20122l.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                if (FragmentManager.Q0(2)) {
                    requireView2.toString();
                }
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k11.getPostOnViewCreatedAlpha());
            if (FragmentManager.Q0(2)) {
                k11.getPostOnViewCreatedAlpha();
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public b f20123a;

        /* renamed from: b, reason: collision with root package name */
        public a f20124b;

        /* renamed from: c, reason: collision with root package name */
        public final Fragment f20125c;

        /* renamed from: d, reason: collision with root package name */
        public final List f20126d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f20127e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f20128f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f20129g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f20130h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f20131i;

        /* renamed from: j, reason: collision with root package name */
        public final List f20132j;

        /* renamed from: k, reason: collision with root package name */
        public final List f20133k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: a, reason: collision with root package name */
            public static final a f20137a = new a(null);

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                public a() {
                }
            }

            /* renamed from: androidx.fragment.app.X$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0378b {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static final b c(int i10) {
                return f20137a.b(i10);
            }

            public final void b(View view, ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                FragmentManager.Q0(2);
                int i10 = C0378b.$EnumSwitchMapping$0[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.Q0(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.Q0(2)) {
                        Objects.toString(view);
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.Q0(2)) {
                            view.toString();
                            Objects.toString(container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.Q0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    if (FragmentManager.Q0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        public /* synthetic */ class c {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, Fragment fragment) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f20123a = finalState;
            this.f20124b = lifecycleImpact;
            this.f20125c = fragment;
            this.f20126d = new ArrayList();
            this.f20131i = true;
            ArrayList arrayList = new ArrayList();
            this.f20132j = arrayList;
            this.f20133k = arrayList;
        }

        public final void a(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f20126d.add(listener);
        }

        public final void b(b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.f20132j.add(effect);
        }

        public final void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f20130h = false;
            if (this.f20127e) {
                return;
            }
            this.f20127e = true;
            if (this.f20132j.isEmpty()) {
                d();
                return;
            }
            Iterator it = CollectionsKt.toList(this.f20133k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.f20130h = false;
            if (this.f20128f) {
                return;
            }
            if (FragmentManager.Q0(2)) {
                toString();
            }
            this.f20128f = true;
            Iterator it = this.f20126d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (this.f20132j.remove(effect) && this.f20132j.isEmpty()) {
                d();
            }
        }

        public final List f() {
            return this.f20133k;
        }

        public final b g() {
            return this.f20123a;
        }

        public final Fragment h() {
            return this.f20125c;
        }

        public final a i() {
            return this.f20124b;
        }

        public final boolean isComplete() {
            return this.f20128f;
        }

        public final boolean j() {
            return this.f20131i;
        }

        public final boolean k() {
            return this.f20127e;
        }

        public final boolean l() {
            return this.f20129g;
        }

        public final boolean m() {
            return this.f20130h;
        }

        public final void n(b finalState, a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = c.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f20123a == b.REMOVED) {
                    if (FragmentManager.Q0(2)) {
                        Objects.toString(this.f20125c);
                        Objects.toString(this.f20124b);
                    }
                    this.f20123a = b.VISIBLE;
                    this.f20124b = a.ADDING;
                    this.f20131i = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.Q0(2)) {
                    Objects.toString(this.f20125c);
                    Objects.toString(this.f20123a);
                    Objects.toString(this.f20124b);
                }
                this.f20123a = b.REMOVED;
                this.f20124b = a.REMOVING;
                this.f20131i = true;
                return;
            }
            if (i10 == 3 && this.f20123a != b.REMOVED) {
                if (FragmentManager.Q0(2)) {
                    Objects.toString(this.f20125c);
                    Objects.toString(this.f20123a);
                    Objects.toString(finalState);
                }
                this.f20123a = finalState;
            }
        }

        public void o() {
            this.f20130h = true;
        }

        public final void p(boolean z10) {
            this.f20131i = z10;
        }

        public final void q(boolean z10) {
            this.f20129g = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f20123a + " lifecycleImpact = " + this.f20124b + " fragment = " + this.f20125c + '}';
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public X(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f20113a = container;
        this.f20114b = new ArrayList();
        this.f20115c = new ArrayList();
    }

    public static final void h(X this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f20114b.contains(operation)) {
            d.b g10 = operation.g();
            View view = operation.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            g10.b(view, this$0.f20113a);
        }
    }

    public static final void i(X this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f20114b.remove(operation);
        this$0.f20115c.remove(operation);
    }

    public static final X u(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f20112g.a(viewGroup, fragmentManager);
    }

    public static final X v(ViewGroup viewGroup, Y y10) {
        return f20112g.b(viewGroup, y10);
    }

    public final void A(C2035b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (FragmentManager.Q0(2)) {
            backEvent.a();
        }
        List list = this.f20115c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).f());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) list2.get(i10)).e(backEvent, this.f20113a);
        }
    }

    public final void B(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) list.get(i10)).o();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).f());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) list2.get(i11)).g(this.f20113a);
        }
    }

    public final void C() {
        for (d dVar : this.f20114b) {
            if (dVar.i() == d.a.ADDING) {
                View requireView = dVar.h().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                dVar.n(d.b.f20137a.b(requireView.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void D(boolean z10) {
        this.f20117e = z10;
    }

    public final void c(d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.j()) {
            d.b g10 = operation.g();
            View requireView = operation.h().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "operation.fragment.requireView()");
            g10.b(requireView, this.f20113a);
            operation.p(false);
        }
    }

    public abstract void d(List list, boolean z10);

    public void e(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).f());
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) list.get(i10)).d(this.f20113a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c((d) operations.get(i11));
        }
        List list2 = CollectionsKt.toList(operations);
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) list2.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        FragmentManager.Q0(3);
        B(this.f20115c);
        e(this.f20115c);
    }

    public final void g(d.b bVar, d.a aVar, K k10) {
        synchronized (this.f20114b) {
            try {
                Fragment k11 = k10.k();
                Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
                d o10 = o(k11);
                if (o10 == null) {
                    if (!k10.k().mTransitioning && !k10.k().mRemoving) {
                        o10 = null;
                    }
                    Fragment k12 = k10.k();
                    Intrinsics.checkNotNullExpressionValue(k12, "fragmentStateManager.fragment");
                    o10 = p(k12);
                }
                if (o10 != null) {
                    o10.n(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, k10);
                this.f20114b.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        X.h(X.this, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        X.i(X.this, cVar);
                    }
                });
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(d.b finalState, K fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Q0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(K fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Q0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(K fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Q0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(K fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Q0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z10;
        if (this.f20118f) {
            return;
        }
        if (!this.f20113a.isAttachedToWindow()) {
            q();
            this.f20117e = false;
            return;
        }
        synchronized (this.f20114b) {
            try {
                List<d> mutableList = CollectionsKt.toMutableList((Collection) this.f20115c);
                this.f20115c.clear();
                Iterator it = mutableList.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.f20114b.isEmpty() || !dVar.h().mTransitioning) {
                        z10 = false;
                    }
                    dVar.q(z10);
                }
                for (d dVar2 : mutableList) {
                    if (this.f20116d) {
                        if (FragmentManager.Q0(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (FragmentManager.Q0(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.c(this.f20113a);
                    }
                    this.f20116d = false;
                    if (!dVar2.isComplete()) {
                        this.f20115c.add(dVar2);
                    }
                }
                if (!this.f20114b.isEmpty()) {
                    C();
                    List mutableList2 = CollectionsKt.toMutableList((Collection) this.f20114b);
                    if (mutableList2.isEmpty()) {
                        return;
                    }
                    this.f20114b.clear();
                    this.f20115c.addAll(mutableList2);
                    FragmentManager.Q0(2);
                    d(mutableList2, this.f20117e);
                    boolean w10 = w(mutableList2);
                    boolean x10 = x(mutableList2);
                    if (!x10 || w10) {
                        z10 = false;
                    }
                    this.f20116d = z10;
                    FragmentManager.Q0(2);
                    if (!x10) {
                        B(mutableList2);
                        e(mutableList2);
                    } else if (w10) {
                        B(mutableList2);
                        int size = mutableList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c((d) mutableList2.get(i10));
                        }
                    }
                    this.f20117e = false;
                    FragmentManager.Q0(2);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d o(Fragment fragment) {
        Object obj;
        Iterator it = this.f20114b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (Intrinsics.areEqual(dVar.h(), fragment) && !dVar.k()) {
                break;
            }
        }
        return (d) obj;
    }

    public final d p(Fragment fragment) {
        Object obj;
        Iterator it = this.f20115c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (Intrinsics.areEqual(dVar.h(), fragment) && !dVar.k()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void q() {
        FragmentManager.Q0(2);
        boolean isAttachedToWindow = this.f20113a.isAttachedToWindow();
        synchronized (this.f20114b) {
            try {
                C();
                B(this.f20114b);
                List<d> mutableList = CollectionsKt.toMutableList((Collection) this.f20115c);
                Iterator it = mutableList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).q(false);
                }
                for (d dVar : mutableList) {
                    if (FragmentManager.Q0(2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f20113a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar);
                    }
                    dVar.c(this.f20113a);
                }
                List<d> mutableList2 = CollectionsKt.toMutableList((Collection) this.f20114b);
                Iterator it2 = mutableList2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).q(false);
                }
                for (d dVar2 : mutableList2) {
                    if (FragmentManager.Q0(2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Container ");
                            sb3.append(this.f20113a);
                            sb3.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar2);
                    }
                    dVar2.c(this.f20113a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.f20118f) {
            FragmentManager.Q0(2);
            this.f20118f = false;
            n();
        }
    }

    public final d.a s(K fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment k10 = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
        d o10 = o(k10);
        d.a i10 = o10 != null ? o10.i() : null;
        d p10 = p(k10);
        d.a i11 = p10 != null ? p10.i() : null;
        int i12 = i10 == null ? -1 : e.$EnumSwitchMapping$0[i10.ordinal()];
        return (i12 == -1 || i12 == 1) ? i11 : i10;
    }

    public final ViewGroup t() {
        return this.f20113a;
    }

    public final boolean w(List list) {
        boolean z10;
        List<d> list2 = list;
        loop0: while (true) {
            z10 = true;
            for (d dVar : list2) {
                if (!dVar.f().isEmpty()) {
                    List f10 = dVar.f();
                    if (!(f10 instanceof Collection) || !f10.isEmpty()) {
                        Iterator it = f10.iterator();
                        while (it.hasNext()) {
                            if (!((b) it.next()).b()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList, ((d) it2.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(List list) {
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).h().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean y() {
        return !this.f20114b.isEmpty();
    }

    public final void z() {
        Object obj;
        synchronized (this.f20114b) {
            try {
                C();
                List list = this.f20114b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.f20137a;
                    View view = dVar.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    d.b a10 = aVar.a(view);
                    d.b g10 = dVar.g();
                    d.b bVar = d.b.VISIBLE;
                    if (g10 == bVar && a10 != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                Fragment h10 = dVar2 != null ? dVar2.h() : null;
                this.f20118f = h10 != null ? h10.isPostponed() : false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
