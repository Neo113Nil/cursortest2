package y1;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.o1;
import hg.b1;
import hg.d1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final y8.d f25600a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f25601b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f25602c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25603d;

    /* renamed from: e, reason: collision with root package name */
    public final hg.p0 f25604e;

    /* renamed from: f, reason: collision with root package name */
    public final hg.p0 f25605f;

    /* renamed from: g, reason: collision with root package name */
    public final t0 f25606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f25607h;

    public p(r rVar, t0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f25607h = rVar;
        this.f25600a = new y8.d();
        d1 b10 = hg.u0.b(kotlin.collections.e0.f19204a);
        this.f25601b = b10;
        d1 b11 = hg.u0.b(kotlin.collections.g0.f19206a);
        this.f25602c = b11;
        this.f25604e = new hg.p0(b10);
        this.f25605f = new hg.p0(b11);
        this.f25606g = navigator;
    }

    public final void a(l backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        synchronized (this.f25600a) {
            d1 d1Var = this.f25601b;
            ArrayList O = CollectionsKt.O((Collection) d1Var.getValue(), backStackEntry);
            d1Var.getClass();
            d1Var.k(null, O);
            Unit unit = Unit.f19194a;
        }
    }

    public final l b(b0 destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        b2.j jVar = this.f25607h.f25625b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        return r0.a(jVar.f2986a.f25626c, destination, bundle, jVar.h(), jVar.f2998n);
    }

    public final void c(l entry) {
        s sVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        b2.j jVar = this.f25607h.f25625b;
        o superCallback = new o(this, entry);
        d1 d1Var = jVar.f2993h;
        Intrinsics.checkNotNullParameter(this, "state");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        LinkedHashMap linkedHashMap = jVar.f3005v;
        boolean areEqual = Intrinsics.areEqual(linkedHashMap.get(entry), Boolean.TRUE);
        superCallback.invoke();
        linkedHashMap.remove(entry);
        kotlin.collections.l lVar = jVar.f2991f;
        if (lVar.contains(entry)) {
            if (this.f25603d) {
                return;
            }
            jVar.s();
            d1 d1Var2 = jVar.f2992g;
            ArrayList X = CollectionsKt.X(lVar);
            d1Var2.getClass();
            d1Var2.k(null, X);
            ArrayList o3 = jVar.o();
            d1Var.getClass();
            d1Var.k(null, o3);
            return;
        }
        jVar.r(entry);
        b2.d dVar = entry.f25589h;
        String backStackEntryId = entry.f25587f;
        if (dVar.j.f2169d.a(androidx.lifecycle.x.f2255c)) {
            entry.a(androidx.lifecycle.x.f2253a);
        }
        if (!lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((l) it.next()).f25587f, backStackEntryId)) {
                    break;
                }
            }
        }
        if (!areEqual && (sVar = jVar.f2998n) != null) {
            Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
            o1 o1Var = (o1) sVar.f25632b.remove(backStackEntryId);
            if (o1Var != null) {
                o1Var.a();
            }
        }
        jVar.s();
        ArrayList o4 = jVar.o();
        d1Var.getClass();
        d1Var.k(null, o4);
    }

    public final void d(l backStackEntry) {
        int i5;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        synchronized (this.f25600a) {
            try {
                ArrayList X = CollectionsKt.X((Collection) this.f25604e.f10742a.getValue());
                ListIterator listIterator = X.listIterator(X.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i5 = -1;
                        break;
                    } else if (Intrinsics.areEqual(((l) listIterator.previous()).f25587f, backStackEntry.f25587f)) {
                        i5 = listIterator.nextIndex();
                        break;
                    }
                }
                X.set(i5, backStackEntry);
                d1 d1Var = this.f25601b;
                d1Var.getClass();
                d1Var.k(null, X);
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(l popUpTo, boolean z5) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        b2.j jVar = this.f25607h.f25625b;
        o superCallback = new o(this, popUpTo, z5);
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "state");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        t0 b10 = jVar.f3001r.b(popUpTo.f25583b.f25533a);
        jVar.f3005v.put(popUpTo, Boolean.valueOf(z5));
        if (!Intrinsics.areEqual(b10, this.f25606g)) {
            Object obj = jVar.f3002s.get(b10);
            Intrinsics.checkNotNull(obj);
            ((p) obj).e(popUpTo, z5);
            return;
        }
        b2.h hVar = jVar.f3004u;
        if (hVar != null) {
            hVar.invoke(popUpTo);
            superCallback.invoke();
            return;
        }
        a2.q onComplete = new a2.q(3, superCallback);
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        kotlin.collections.l lVar = jVar.f2991f;
        int indexOf = lVar.indexOf(popUpTo);
        if (indexOf < 0) {
            String message = "Ignoring pop of " + popUpTo + " as it was not found on the current back stack";
            Intrinsics.checkNotNullParameter("NavController", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Log.i("NavController", message);
            return;
        }
        int i5 = indexOf + 1;
        if (i5 != lVar.f19213c) {
            jVar.l(((l) lVar.get(i5)).f25583b.f25534b.f3017e, true, false);
        }
        b2.j.n(jVar, popUpTo);
        onComplete.invoke();
        jVar.f2987b.invoke();
        jVar.b();
    }

    public final void f(l popUpTo, boolean z5) {
        Object obj;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        d1 d1Var = this.f25602c;
        Iterable iterable = (Iterable) d1Var.getValue();
        boolean z7 = iterable instanceof Collection;
        hg.p0 p0Var = this.f25604e;
        if (!z7 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((l) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) p0Var.f10742a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((l) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        d1Var.k(null, kotlin.collections.w0.c((Set) d1Var.getValue(), popUpTo));
        b1 b1Var = p0Var.f10742a;
        b1 b1Var2 = p0Var.f10742a;
        List list = (List) b1Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            l lVar = (l) obj;
            if (!Intrinsics.areEqual(lVar, popUpTo) && ((List) b1Var2.getValue()).lastIndexOf(lVar) < ((List) b1Var2.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        l lVar2 = (l) obj;
        if (lVar2 != null) {
            d1Var.k(null, kotlin.collections.w0.c((Set) d1Var.getValue(), lVar2));
        }
        e(popUpTo, z5);
    }

    public final void g(l backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        b2.j jVar = this.f25607h.f25625b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "state");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        t0 b10 = jVar.f3001r.b(backStackEntry.f25583b.f25533a);
        if (!Intrinsics.areEqual(b10, this.f25606g)) {
            Object obj = jVar.f3002s.get(b10);
            if (obj == null) {
                throw new IllegalStateException(d9.e.l(new StringBuilder("NavigatorBackStack for "), backStackEntry.f25583b.f25533a, " should already be created").toString());
            }
            ((p) obj).g(backStackEntry);
            return;
        }
        Function1 function1 = jVar.f3003t;
        if (function1 != null) {
            function1.invoke(backStackEntry);
            a(backStackEntry);
            return;
        }
        String message = "Ignoring add of destination " + backStackEntry.f25583b + " outside of the call to navigate(). ";
        Intrinsics.checkNotNullParameter("NavController", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i("NavController", message);
    }

    public final void h(l backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        d1 d1Var = this.f25602c;
        Iterable iterable = (Iterable) d1Var.getValue();
        boolean z5 = iterable instanceof Collection;
        hg.p0 p0Var = this.f25604e;
        if (!z5 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((l) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) p0Var.f10742a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((l) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        l lVar = (l) CollectionsKt.L((List) p0Var.f10742a.getValue());
        if (lVar != null) {
            LinkedHashSet c2 = kotlin.collections.w0.c((Set) d1Var.getValue(), lVar);
            d1Var.getClass();
            d1Var.k(null, c2);
        }
        LinkedHashSet c8 = kotlin.collections.w0.c((Set) d1Var.getValue(), backStackEntry);
        d1Var.getClass();
        d1Var.k(null, c8);
        g(backStackEntry);
    }
}
