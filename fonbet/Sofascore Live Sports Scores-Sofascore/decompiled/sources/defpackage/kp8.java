package defpackage;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kp8 implements cp8 {
    public final /* synthetic */ h6d a;
    public final /* synthetic */ ip8 b;

    public kp8(h6d h6dVar, ip8 ip8Var) {
        this.a = h6dVar;
        this.b = ip8Var;
    }

    @Override // defpackage.cp8
    public final void a(Fragment fragment, boolean z) {
        Object obj;
        Object obj2;
        ip8 ip8Var = this.b;
        ArrayList arrayList = ip8Var.g;
        fragment.getClass();
        h6d h6dVar = this.a;
        ArrayList w0 = CollectionsKt.w0((Iterable) h6dVar.f.a.getValue(), (Collection) h6dVar.e.a.getValue());
        ListIterator listIterator = w0.listIterator(w0.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator.previous();
                if (((d6d) obj2).f.equals(fragment.getTag())) {
                    break;
                }
            }
        }
        d6d d6dVar = (d6d) obj2;
        boolean z2 = z && arrayList.isEmpty() && fragment.isRemoving();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.c(((Pair) next).a, fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z2 && ip8.n()) {
            Objects.toString(fragment);
            Objects.toString(d6dVar);
        }
        boolean z3 = pair != null && ((Boolean) pair.b).booleanValue();
        if (!z && !z3 && d6dVar == null) {
            ogj.h(fc6.m("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (d6dVar != null) {
            ip8Var.l(fragment, d6dVar, h6dVar);
            if (z2) {
                if (ip8.n()) {
                    fragment.toString();
                    d6dVar.toString();
                }
                h6dVar.f(d6dVar, false);
            }
        }
    }

    @Override // defpackage.cp8
    public final void b(Fragment fragment, boolean z) {
        Object obj;
        fragment.getClass();
        if (z) {
            h6d h6dVar = this.a;
            List list = (List) h6dVar.e.a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((d6d) obj).f.equals(fragment.getTag())) {
                        break;
                    }
                }
            }
            d6d d6dVar = (d6d) obj;
            if (ip8.n()) {
                Objects.toString(fragment);
                Objects.toString(d6dVar);
            }
            if (d6dVar != null) {
                h6dVar.g(d6dVar);
            }
        }
    }

    @Override // defpackage.cp8
    public final void onBackStackChanged() {
    }
}
