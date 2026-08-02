package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends e.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f2117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var) {
        super(false);
        this.f2117d = j1Var;
    }

    @Override // e.z
    public final void a() {
        boolean L = j1.L(3);
        j1 j1Var = this.f2117d;
        if (L) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + j1Var);
        }
        if (j1.L(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + j1Var.f1970h);
        }
        a aVar = j1Var.f1970h;
        if (aVar != null) {
            aVar.f1861s = false;
            aVar.e();
            a aVar2 = j1Var.f1970h;
            z zVar = new z(4, j1Var);
            if (aVar2.q == null) {
                aVar2.q = new ArrayList();
            }
            aVar2.q.add(zVar);
            j1Var.f1970h.f();
            j1Var.f1971i = true;
            j1Var.z(true);
            j1Var.F();
            j1Var.f1971i = false;
            j1Var.f1970h = null;
        }
    }

    @Override // e.z
    public final void b() {
        boolean L = j1.L(3);
        j1 j1Var = this.f2117d;
        if (L) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + j1Var);
        }
        z0 z0Var = j1Var.j;
        ArrayList arrayList = j1Var.f1975n;
        j1Var.f1971i = true;
        j1Var.z(true);
        j1Var.f1971i = false;
        if (j1Var.f1970h == null) {
            if (z0Var.f8455b) {
                if (j1.L(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                j1Var.S();
                return;
            } else {
                if (j1.L(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                j1Var.f1969g.f8405c.a();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(j1.G(j1Var.f1970h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a2.o oVar = (a2.o) it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    oVar.a((Fragment) it2.next(), true);
                }
            }
        }
        Iterator it3 = j1Var.f1970h.f2069a.iterator();
        while (it3.hasNext()) {
            Fragment fragment = ((r1) it3.next()).f2061b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it4 = j1Var.f(new ArrayList(Collections.singletonList(j1Var.f1970h)), 0, 1).iterator();
        while (it4.hasNext()) {
            k2 k2Var = (k2) it4.next();
            ArrayList arrayList2 = k2Var.f1990c;
            if (j1.L(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            k2Var.m(arrayList2);
            k2Var.c(arrayList2);
        }
        Iterator it5 = j1Var.f1970h.f2069a.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = ((r1) it5.next()).f2061b;
            if (fragment2 != null && fragment2.mContainer == null) {
                j1Var.g(fragment2).k();
            }
        }
        j1Var.f1970h = null;
        j1Var.g0();
        if (j1.L(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + z0Var.f8455b + " for  FragmentManager " + j1Var);
        }
    }

    @Override // e.z
    public final void c(e.a backEvent) {
        boolean L = j1.L(2);
        j1 j1Var = this.f2117d;
        if (L) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + j1Var);
        }
        if (j1Var.f1970h != null) {
            Iterator it = j1Var.f(new ArrayList(Collections.singletonList(j1Var.f1970h)), 0, 1).iterator();
            while (it.hasNext()) {
                k2 k2Var = (k2) it.next();
                k2Var.getClass();
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                if (j1.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f8390c);
                }
                ArrayList arrayList = k2Var.f1990c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    kotlin.collections.z.n(((f2) it2.next()).f1912k, arrayList2);
                }
                List W = CollectionsKt.W(CollectionsKt.Z(arrayList2));
                int size = W.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((e2) W.get(i5)).d(backEvent, k2Var.f1988a);
                }
            }
            Iterator it3 = j1Var.f1975n.iterator();
            while (it3.hasNext()) {
                ((a2.o) it3.next()).getClass();
            }
        }
    }

    @Override // e.z
    public final void d(e.a aVar) {
        boolean L = j1.L(3);
        j1 j1Var = this.f2117d;
        if (L) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + j1Var);
        }
        j1Var.w();
        j1Var.x(new h1(j1Var), false);
    }
}
