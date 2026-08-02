package a2;

import android.util.Log;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.x;
import hg.d1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1.p f56a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f57b;

    public o(y1.p pVar, m mVar) {
        this.f56a = pVar;
        this.f57b = mVar;
    }

    public final void a(Fragment fragment, boolean z5) {
        Object obj;
        Object obj2;
        m mVar = this.f57b;
        ArrayList arrayList = mVar.f51g;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        y1.p pVar = this.f56a;
        ArrayList N = CollectionsKt.N((Collection) pVar.f25604e.f10742a.getValue(), (Iterable) pVar.f25605f.f10742a.getValue());
        ListIterator listIterator = N.listIterator(N.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator.previous();
                if (Intrinsics.areEqual(((y1.l) obj2).f25587f, fragment.getTag())) {
                    break;
                }
            }
        }
        y1.l lVar = (y1.l) obj2;
        boolean z7 = z5 && arrayList.isEmpty() && fragment.isRemoving();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Pair) next).f19192a, fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z7 && m.n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + lVar);
        }
        boolean z10 = pair != null && ((Boolean) pair.f19193b).booleanValue();
        if (!z5 && !z10 && lVar == null) {
            throw new IllegalArgumentException(c1.l("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (lVar != null) {
            mVar.l(fragment, lVar, pVar);
            if (z7) {
                if (m.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + lVar + " via system back");
                }
                pVar.f(lVar, false);
            }
        }
    }

    public final void b(Fragment fragment, boolean z5) {
        Object obj;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (z5) {
            y1.p pVar = this.f56a;
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
            y1.l entry = (y1.l) obj;
            if (m.n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + entry);
            }
            if (entry != null) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(entry, "entry");
                d1 d1Var = pVar.f25602c;
                d1Var.k(null, w0.c((Set) d1Var.getValue(), entry));
                b2.j jVar = pVar.f25607h.f25625b;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(entry, "entry");
                if (!jVar.f2991f.contains(entry)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                entry.a(x.f2256d);
            }
        }
    }
}
