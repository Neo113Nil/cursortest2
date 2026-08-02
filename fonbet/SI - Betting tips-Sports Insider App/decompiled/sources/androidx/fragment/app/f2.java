package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public i2 f1903a;

    /* renamed from: b, reason: collision with root package name */
    public g2 f1904b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f1905c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1906d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1907e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1908f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1909g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1910h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1911i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1912k;

    /* renamed from: l, reason: collision with root package name */
    public final p1 f1913l;

    public f2(i2 finalState, g2 lifecycleImpact, p1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.f2041c;
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f1903a = finalState;
        this.f1904b = lifecycleImpact;
        this.f1905c = fragment;
        this.f1906d = new ArrayList();
        this.f1911i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.f1912k = arrayList;
        this.f1913l = fragmentStateManager;
    }

    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f1910h = false;
        if (this.f1907e) {
            return;
        }
        this.f1907e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (e2 e2Var : CollectionsKt.W(this.f1912k)) {
            e2Var.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            if (!e2Var.f1899b) {
                e2Var.b(container);
            }
            e2Var.f1899b = true;
        }
    }

    public final void b() {
        this.f1910h = false;
        if (!this.f1908f) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1908f = true;
            Iterator it = this.f1906d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1905c.mTransitioning = false;
        this.f1913l.k();
    }

    public final void c(e2 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(i2 finalState, g2 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int ordinal = lifecycleImpact.ordinal();
        Fragment fragment = this.f1905c;
        i2 i2Var = i2.f1957a;
        if (ordinal == 0) {
            if (this.f1903a != i2Var) {
                if (j1.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f1903a + " -> " + finalState + '.');
                }
                this.f1903a = finalState;
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (this.f1903a == i2Var) {
                if (j1.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1904b + " to ADDING.");
                }
                this.f1903a = i2.f1958b;
                this.f1904b = g2.f1926b;
                this.f1911i = true;
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f1903a + " -> REMOVED. mLifecycleImpact  = " + this.f1904b + " to REMOVING.");
        }
        this.f1903a = i2Var;
        this.f1904b = g2.f1927c;
        this.f1911i = true;
    }

    public final String toString() {
        StringBuilder p10 = d9.e.p("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        p10.append(this.f1903a);
        p10.append(" lifecycleImpact = ");
        p10.append(this.f1904b);
        p10.append(" fragment = ");
        p10.append(this.f1905c);
        p10.append('}');
        return p10.toString();
    }
}
