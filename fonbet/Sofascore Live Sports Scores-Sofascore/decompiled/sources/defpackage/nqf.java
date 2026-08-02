package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.DialogFragment;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nqf implements p6b {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nqf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        int i;
        int i2 = this.a;
        Object obj = this.b;
        Object obj2 = null;
        switch (i2) {
            case 0:
                qqg qqgVar = (qqg) obj;
                if (d6bVar != d6b.ON_CREATE) {
                    a70.j("Next event must be ON_CREATE");
                    return;
                }
                u6bVar.getLifecycle().d(this);
                Bundle a = qqgVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    a70.r("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, nqf.class.getClassLoader()).asSubclass(lqg.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(qqgVar instanceof ttk)) {
                                    i3c.i(qqgVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                stk viewModelStore = ((ttk) qqgVar).getViewModelStore();
                                nqg savedStateRegistry = qqgVar.getSavedStateRegistry();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                LinkedHashMap linkedHashMap2 = viewModelStore.a;
                                Iterator it = CollectionsKt.W0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    ltk ltkVar = (ltk) linkedHashMap2.get(it.next());
                                    if (ltkVar != null) {
                                        nq8.t(ltkVar, savedStateRegistry, qqgVar.getLifecycle());
                                    }
                                }
                                if (!CollectionsKt.W0(linkedHashMap2.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                vp2.e(dmi.q("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        vp2.e(lnb.o("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                ComponentActivity.access$ensureViewModelStore(componentActivity);
                componentActivity.getLifecycle().d(this);
                return;
            case 2:
                new HashMap();
                sv8[] sv8VarArr = (sv8[]) obj;
                if (sv8VarArr.length > 0) {
                    sv8 sv8Var = sv8VarArr[0];
                    throw null;
                }
                if (sv8VarArr.length <= 0) {
                    return;
                }
                sv8 sv8Var2 = sv8VarArr[0];
                throw null;
            case 3:
                u15 u15Var = (u15) obj;
                int i3 = t15.a[d6bVar.ordinal()];
                if (i3 == 1) {
                    DialogFragment dialogFragment = (DialogFragment) u6bVar;
                    Iterable iterable = (Iterable) u15Var.b().e.a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (((d6d) it2.next()).f.equals(dialogFragment.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogFragment.j();
                    return;
                }
                if (i3 == 2) {
                    DialogFragment dialogFragment2 = (DialogFragment) u6bVar;
                    for (Object obj3 : (Iterable) u15Var.b().f.a.getValue()) {
                        if (((d6d) obj3).f.equals(dialogFragment2.getTag())) {
                            obj2 = obj3;
                        }
                    }
                    d6d d6dVar = (d6d) obj2;
                    if (d6dVar != null) {
                        u15Var.b().c(d6dVar);
                        return;
                    }
                    return;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) u6bVar;
                    for (Object obj4 : (Iterable) u15Var.b().f.a.getValue()) {
                        if (((d6d) obj4).f.equals(dialogFragment3.getTag())) {
                            obj2 = obj4;
                        }
                    }
                    d6d d6dVar2 = (d6d) obj2;
                    if (d6dVar2 != null) {
                        u15Var.b().c(d6dVar2);
                    }
                    dialogFragment3.getLifecycle().d(this);
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) u6bVar;
                if (dialogFragment4.m().isShowing()) {
                    return;
                }
                List list = (List) u15Var.b().e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (((d6d) listIterator.previous()).f.equals(dialogFragment4.getTag())) {
                        i = listIterator.nextIndex();
                    }
                }
                d6d d6dVar3 = (d6d) CollectionsKt.a0(i, list);
                if (!Intrinsics.c(CollectionsKt.j0(list), d6dVar3)) {
                    dialogFragment4.toString();
                }
                if (d6dVar3 != null) {
                    u15Var.l(i, d6dVar3, false);
                    return;
                }
                return;
            case 4:
                ((ei3) obj).h(false);
                return;
            case 5:
                if (d6bVar != d6b.ON_CREATE) {
                    i3c.i(d6bVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    u6bVar.getLifecycle().d(this);
                    ((jqg) obj).b();
                    return;
                }
            default:
                if (d6bVar == d6b.ON_DESTROY) {
                    csk cskVar = (csk) obj;
                    cskVar.a = null;
                    cskVar.b = null;
                    return;
                }
                return;
        }
    }
}
