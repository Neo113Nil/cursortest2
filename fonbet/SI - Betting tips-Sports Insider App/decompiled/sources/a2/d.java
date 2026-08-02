package a2;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b1;
import androidx.fragment.app.j1;
import androidx.fragment.app.n1;
import androidx.lifecycle.y;
import hg.d1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import y1.b0;
import y1.i0;
import y1.s0;
import y1.t0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"La2/d;", "Ly1/t0;", "La2/b;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@s0("dialog")
/* loaded from: classes.dex */
public final class d extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f23c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f24d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f25e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.a f26f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f27g;

    public d(Context context, j1 fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f23c = context;
        this.f24d = fragmentManager;
        this.f25e = new LinkedHashSet();
        this.f26f = new q2.a(1, this);
        this.f27g = new LinkedHashMap();
    }

    @Override // y1.t0
    public final b0 a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new b(this);
    }

    @Override // y1.t0
    public final void d(List entries, i0 i0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        j1 j1Var = this.f24d;
        if (j1Var.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            y1.l lVar = (y1.l) it.next();
            k(lVar).show(j1Var, lVar.f25587f);
            y1.l lVar2 = (y1.l) CollectionsKt.L((List) b().f25604e.f10742a.getValue());
            boolean A = CollectionsKt.A((Iterable) b().f25605f.f10742a.getValue(), lVar2);
            b().h(lVar);
            if (lVar2 != null && !A) {
                b().c(lVar2);
            }
        }
    }

    @Override // y1.t0
    public final void e(y1.p state) {
        y lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        Iterator it = ((List) state.f25604e.f10742a.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j1 j1Var = this.f24d;
            if (!hasNext) {
                j1Var.f1977p.add(new n1() { // from class: a2.a
                    @Override // androidx.fragment.app.n1
                    public final void a(j1 j1Var2, Fragment childFragment) {
                        Intrinsics.checkNotNullParameter(j1Var2, "<unused var>");
                        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
                        d dVar = d.this;
                        LinkedHashSet linkedHashSet = dVar.f25e;
                        if (TypeIntrinsics.asMutableCollection(linkedHashSet).remove(childFragment.getTag())) {
                            childFragment.getLifecycle().a(dVar.f26f);
                        }
                        LinkedHashMap linkedHashMap = dVar.f27g;
                        TypeIntrinsics.asMutableMap(linkedHashMap).remove(childFragment.getTag());
                    }
                });
                return;
            }
            y1.l lVar = (y1.l) it.next();
            androidx.fragment.app.y yVar = (androidx.fragment.app.y) j1Var.E(lVar.f25587f);
            if (yVar == null || (lifecycle = yVar.getLifecycle()) == null) {
                this.f25e.add(lVar.f25587f);
            } else {
                lifecycle.a(this.f26f);
            }
        }
    }

    @Override // y1.t0
    public final void f(y1.l backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        j1 j1Var = this.f24d;
        if (j1Var.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        String str = backStackEntry.f25587f;
        androidx.fragment.app.y yVar = (androidx.fragment.app.y) this.f27g.get(str);
        if (yVar == null) {
            Fragment E = j1Var.E(str);
            yVar = E instanceof androidx.fragment.app.y ? (androidx.fragment.app.y) E : null;
        }
        if (yVar != null) {
            yVar.getLifecycle().b(this.f26f);
            yVar.dismiss();
        }
        k(backStackEntry).show(j1Var, str);
        y1.p b10 = b();
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) b10.f25604e.f10742a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            y1.l lVar = (y1.l) listIterator.previous();
            if (Intrinsics.areEqual(lVar.f25587f, str)) {
                d1 d1Var = b10.f25602c;
                d1Var.k(null, w0.c(w0.c((Set) d1Var.getValue(), lVar), backStackEntry));
                b10.d(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // y1.t0
    public final void i(y1.l popUpTo, boolean z5) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        j1 j1Var = this.f24d;
        if (j1Var.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f25604e.f10742a.getValue();
        int indexOf = list.indexOf(popUpTo);
        Iterator it = CollectionsKt.P(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment E = j1Var.E(((y1.l) it.next()).f25587f);
            if (E != null) {
                ((androidx.fragment.app.y) E).dismiss();
            }
        }
        l(indexOf, popUpTo, z5);
    }

    public final androidx.fragment.app.y k(y1.l lVar) {
        b0 b0Var = lVar.f25583b;
        Intrinsics.checkNotNull(b0Var, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) b0Var;
        String str = bVar.f22g;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
        char charAt = str.charAt(0);
        Context context = this.f23c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        b1 I = this.f24d.I();
        context.getClassLoader();
        Fragment a7 = I.a(str);
        Intrinsics.checkNotNullExpressionValue(a7, "instantiate(...)");
        if (androidx.fragment.app.y.class.isAssignableFrom(a7.getClass())) {
            androidx.fragment.app.y yVar = (androidx.fragment.app.y) a7;
            yVar.setArguments(lVar.f25589h.a());
            yVar.getLifecycle().a(this.f26f);
            this.f27g.put(lVar.f25587f, yVar);
            return yVar;
        }
        StringBuilder sb2 = new StringBuilder("Dialog destination ");
        String str2 = bVar.f22g;
        if (str2 == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
        sb2.append(str2);
        sb2.append(" is not an instance of DialogFragment");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void l(int i5, y1.l lVar, boolean z5) {
        y1.l lVar2 = (y1.l) CollectionsKt.G(i5 - 1, (List) b().f25604e.f10742a.getValue());
        boolean A = CollectionsKt.A((Iterable) b().f25605f.f10742a.getValue(), lVar2);
        b().f(lVar, z5);
        if (lVar2 == null || A) {
            return;
        }
        b().c(lVar2);
    }
}
