package a2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b1;
import androidx.fragment.app.g1;
import androidx.fragment.app.i1;
import androidx.fragment.app.j1;
import androidx.fragment.app.n1;
import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import y1.b0;
import y1.i0;
import y1.s0;
import y1.t0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"La2/m;", "Ly1/t0;", "La2/n;", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@s0("fragment")
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n32#2:713\n69#2,2:714\n774#3:716\n865#3,2:717\n1863#3,2:719\n528#3,7:721\n543#3,6:728\n1755#3,3:734\n1863#3,2:737\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n268#1:713\n268#1:714,2\n314#1:716\n314#1:717,2\n322#1:719,2\n99#1:721,7\n148#1:728,6\n247#1:734,3\n273#1:737,2\n*E\n"})
/* loaded from: classes.dex */
public class m extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f47c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f48d;

    /* renamed from: e, reason: collision with root package name */
    public final int f49e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f50f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f51g;

    /* renamed from: h, reason: collision with root package name */
    public final e f52h;

    /* renamed from: i, reason: collision with root package name */
    public final f f53i;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class a extends k1 {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f54b;

        @Override // androidx.lifecycle.k1
        public final void d() {
            WeakReference weakReference = this.f54b;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
                weakReference = null;
            }
            Function0 function0 = (Function0) weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public m(Context context, j1 fragmentManager, int i5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f47c = context;
        this.f48d = fragmentManager;
        this.f49e = i5;
        this.f50f = new LinkedHashSet();
        this.f51g = new ArrayList();
        int i10 = 0;
        this.f52h = new e(i10, this);
        this.f53i = new f(i10, this);
    }

    public static void k(m mVar, String str, int i5) {
        boolean z5 = (i5 & 2) == 0;
        boolean z7 = (i5 & 4) != 0;
        ArrayList arrayList = mVar.f51g;
        if (z7) {
            z.q(arrayList, new k(str, 0));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z5)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // y1.t0
    public final b0 a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new n(this);
    }

    @Override // y1.t0
    public final void d(List entries, i0 i0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        j1 j1Var = this.f48d;
        if (j1Var.P()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            y1.l lVar = (y1.l) it.next();
            boolean isEmpty = ((List) b().f25604e.f10742a.getValue()).isEmpty();
            if (i0Var == null || isEmpty || !i0Var.f25563b || !this.f50f.remove(lVar.f25587f)) {
                androidx.fragment.app.a m6 = m(lVar, i0Var);
                String str = lVar.f25587f;
                if (!isEmpty) {
                    y1.l lVar2 = (y1.l) CollectionsKt.L((List) b().f25604e.f10742a.getValue());
                    if (lVar2 != null) {
                        k(this, lVar2.f25587f, 6);
                    }
                    k(this, str, 6);
                    if (!m6.f2076h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    m6.f2075g = true;
                    m6.f2077i = str;
                }
                m6.f();
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + lVar);
                }
                b().h(lVar);
            } else {
                j1Var.x(new i1(j1Var, lVar.f25587f, 0), false);
                b().h(lVar);
            }
        }
    }

    @Override // y1.t0
    public final void e(final y1.p state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        n1 n1Var = new n1() { // from class: a2.h
            @Override // androidx.fragment.app.n1
            public final void a(j1 j1Var, Fragment fragment) {
                Object obj;
                Intrinsics.checkNotNullParameter(j1Var, "<unused var>");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                y1.p pVar = y1.p.this;
                List list = (List) pVar.f25604e.f10742a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator.previous();
                        if (Intrinsics.areEqual(((y1.l) obj).f25587f, fragment.getTag())) {
                            break;
                        }
                    }
                }
                y1.l lVar = (y1.l) obj;
                boolean n9 = m.n();
                m mVar = this;
                if (n9) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + lVar + " to FragmentManager " + mVar.f48d);
                }
                if (lVar != null) {
                    fragment.getViewLifecycleOwnerLiveData().e(fragment, new p(new i(mVar, fragment, lVar, 0)));
                    fragment.getLifecycle().a(mVar.f52h);
                    mVar.l(fragment, lVar, pVar);
                }
            }
        };
        j1 j1Var = this.f48d;
        j1Var.f1977p.add(n1Var);
        j1Var.f1975n.add(new o(state, this));
    }

    @Override // y1.t0
    public final void f(y1.l backStackEntry) {
        String str = backStackEntry.f25587f;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        j1 j1Var = this.f48d;
        if (j1Var.P()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a m6 = m(backStackEntry, null);
        List list = (List) b().f25604e.f10742a.getValue();
        if (list.size() > 1) {
            y1.l lVar = (y1.l) CollectionsKt.G(u.e(list) - 1, list);
            if (lVar != null) {
                k(this, lVar.f25587f, 6);
            }
            k(this, str, 4);
            j1Var.x(new g1(j1Var, str, -1), false);
            k(this, str, 2);
            if (!m6.f2076h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            m6.f2075g = true;
            m6.f2077i = str;
        }
        m6.f();
        b().d(backStackEntry);
    }

    @Override // y1.t0
    public final void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f50f;
            linkedHashSet.clear();
            z.n(stringArrayList, linkedHashSet);
        }
    }

    @Override // y1.t0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f50f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return a.a.b(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // y1.t0
    public final void i(y1.l popUpTo, boolean z5) {
        int i5;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        j1 j1Var = this.f48d;
        if (j1Var.P()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f25604e.f10742a.getValue();
        int indexOf = list.indexOf(popUpTo);
        List subList = list.subList(indexOf, list.size());
        y1.l lVar = (y1.l) CollectionsKt.F(list);
        y1.l lVar2 = (y1.l) CollectionsKt.G(indexOf - 1, list);
        if (lVar2 != null) {
            k(this, lVar2.f25587f, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            y1.l lVar3 = (y1.l) obj;
            bg.r f6 = bg.q.f(CollectionsKt.z(this.f51g), new j(0));
            String str = lVar3.f25587f;
            Intrinsics.checkNotNullParameter(f6, "<this>");
            Intrinsics.checkNotNullParameter(f6, "<this>");
            Iterator it = ((Sequence) f6.f3224b).iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                }
                Object invoke = f6.f3225c.invoke(it.next());
                if (i10 < 0) {
                    u.j();
                    throw null;
                }
                if (Intrinsics.areEqual(str, invoke)) {
                    i5 = i10;
                    break;
                }
                i10++;
            }
            if ((i5 >= 0) || !Intrinsics.areEqual(lVar3.f25587f, lVar.f25587f)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k(this, ((y1.l) it2.next()).f25587f, 4);
        }
        if (z5) {
            for (y1.l lVar4 : CollectionsKt.P(subList)) {
                if (Intrinsics.areEqual(lVar4, lVar)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + lVar4);
                } else {
                    j1Var.x(new i1(j1Var, lVar4.f25587f, 1), false);
                    this.f50f.add(lVar4.f25587f);
                }
            }
        } else {
            j1Var.x(new g1(j1Var, popUpTo.f25587f, -1), false);
        }
        if (n()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + z5);
        }
        b().f(popUpTo, z5);
    }

    public final void l(Fragment fragment, y1.l entry, y1.p state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        o1 store = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(store, "<get-viewModelStore>(...)");
        e3.i iVar = new e3.i(5);
        iVar.a(Reflection.getOrCreateKotlinClass(a.class), new j(1));
        t1.d factory = iVar.d();
        t1.a defaultCreationExtras = t1.a.f23739b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(a.class, "modelClass");
        Intrinsics.checkNotNullParameter(a.class, "<this>");
        ag.c modelClass = Reflection.getOrCreateKotlinClass(a.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        a aVar = (a) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        WeakReference weakReference = new WeakReference(new l(entry, state, this, fragment));
        aVar.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        aVar.f54b = weakReference;
    }

    public final androidx.fragment.app.a m(y1.l lVar, i0 i0Var) {
        b0 b0Var = lVar.f25583b;
        Intrinsics.checkNotNull(b0Var, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle a7 = lVar.f25589h.a();
        String str = ((n) b0Var).f55g;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
        char charAt = str.charAt(0);
        Context context = this.f47c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        j1 j1Var = this.f48d;
        b1 I = j1Var.I();
        context.getClassLoader();
        Fragment a10 = I.a(str);
        Intrinsics.checkNotNullExpressionValue(a10, "instantiate(...)");
        a10.setArguments(a7);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(j1Var);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
        int i5 = i0Var != null ? i0Var.f25567f : -1;
        int i10 = i0Var != null ? i0Var.f25568g : -1;
        int i11 = i0Var != null ? i0Var.f25569h : -1;
        int i12 = i0Var != null ? i0Var.f25570i : -1;
        if (i5 != -1 || i10 != -1 || i11 != -1 || i12 != -1) {
            if (i5 == -1) {
                i5 = 0;
            }
            if (i10 == -1) {
                i10 = 0;
            }
            if (i11 == -1) {
                i11 = 0;
            }
            int i13 = i12 != -1 ? i12 : 0;
            aVar.f2070b = i5;
            aVar.f2071c = i10;
            aVar.f2072d = i11;
            aVar.f2073e = i13;
        }
        String str2 = lVar.f25587f;
        int i14 = this.f49e;
        if (i14 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        aVar.c(i14, a10, str2, 2);
        aVar.i(a10);
        aVar.f2083p = true;
        return aVar;
    }
}
