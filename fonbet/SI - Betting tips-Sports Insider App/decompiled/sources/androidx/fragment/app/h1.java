package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f1951a;

    public h1(j1 j1Var) {
        this.f1951a = j1Var;
    }

    @Override // androidx.fragment.app.f1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean U;
        j1 j1Var = this.f1951a;
        ArrayList arrayList5 = j1Var.f1975n;
        if (j1.L(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + j1Var.f1963a);
        }
        if (j1Var.f1966d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            ArrayList arrayList6 = j1Var.f1966d;
            a aVar = (a) arrayList6.get(arrayList6.size() - 1);
            j1Var.f1970h = aVar;
            Iterator it = aVar.f2069a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((r1) it.next()).f2061b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            U = j1Var.U(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(j1.G((a) it2.next()));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                a2.o oVar = (a2.o) it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    oVar.b((Fragment) it4.next(), booleanValue);
                }
            }
        }
        return U;
    }
}
