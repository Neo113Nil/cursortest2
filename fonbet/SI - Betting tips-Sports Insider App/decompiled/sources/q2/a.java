package q2;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.y;
import androidx.lifecycle.c0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import androidx.lifecycle.s;
import androidx.lifecycle.w;
import e.j;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y1.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21923a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21924b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f21923a = i5;
        this.f21924b = obj;
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 source, w event) {
        int i5;
        switch (this.f21923a) {
            case 0:
                f owner = (f) this.f21924b;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != w.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.getLifecycle().b(this);
                Bundle source2 = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (source2 == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(source2, "source");
                Intrinsics.checkNotNullParameter("classes_to_restore", "key");
                ArrayList<String> stringArrayList = source2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(b.class);
                        Intrinsics.checkNotNull(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                Intrinsics.checkNotNull(newInstance);
                                ((s) ((b) newInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof p1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
                                }
                                o1 viewModelStore = ((p1) owner).getViewModelStore();
                                d savedStateRegistry = owner.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f2228a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    k1 k1Var = (k1) linkedHashMap.get(key);
                                    if (k1Var != null) {
                                        d1.b(k1Var, savedStateRegistry, owner.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException(c1.m("Failed to instantiate ", str), e7);
                            }
                        } catch (NoSuchMethodException e9) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
                        }
                    } catch (ClassNotFoundException e10) {
                        throw new RuntimeException(c1.n("Class ", str, " wasn't found"), e10);
                    }
                }
                return;
            case 1:
                a2.d dVar = (a2.d) this.f21924b;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i10 = a2.c.$EnumSwitchMapping$0[event.ordinal()];
                if (i10 == 1) {
                    y yVar = (y) source;
                    Iterable iterable = (Iterable) dVar.b().f25604e.f10742a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(((l) it2.next()).f25587f, yVar.getTag())) {
                                return;
                            }
                        }
                    }
                    yVar.dismiss();
                    return;
                }
                Object obj = null;
                if (i10 == 2) {
                    y yVar2 = (y) source;
                    for (Object obj2 : (Iterable) dVar.b().f25605f.f10742a.getValue()) {
                        if (Intrinsics.areEqual(((l) obj2).f25587f, yVar2.getTag())) {
                            obj = obj2;
                        }
                    }
                    l lVar = (l) obj;
                    if (lVar != null) {
                        dVar.b().c(lVar);
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    y yVar3 = (y) source;
                    for (Object obj3 : (Iterable) dVar.b().f25605f.f10742a.getValue()) {
                        if (Intrinsics.areEqual(((l) obj3).f25587f, yVar3.getTag())) {
                            obj = obj3;
                        }
                    }
                    l lVar2 = (l) obj;
                    if (lVar2 != null) {
                        dVar.b().c(lVar2);
                    }
                    yVar3.getLifecycle().b(this);
                    return;
                }
                y yVar4 = (y) source;
                if (yVar4.requireDialog().isShowing()) {
                    return;
                }
                List list = (List) dVar.b().f25604e.f10742a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i5 = -1;
                    } else if (Intrinsics.areEqual(((l) listIterator.previous()).f25587f, yVar4.getTag())) {
                        i5 = listIterator.nextIndex();
                    }
                }
                l lVar3 = (l) CollectionsKt.G(i5, list);
                if (!Intrinsics.areEqual(CollectionsKt.L(list), lVar3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + yVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (lVar3 != null) {
                    dVar.l(i5, lVar3, false);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                j jVar = (j) this.f21924b;
                if (jVar.f8420e == null) {
                    e.f fVar = (e.f) jVar.getLastNonConfigurationInstance();
                    if (fVar != null) {
                        jVar.f8420e = fVar.f8407a;
                    }
                    if (jVar.f8420e == null) {
                        jVar.f8420e = new o1();
                    }
                }
                jVar.f3250a.b(this);
                return;
        }
    }

    public a(f owner) {
        this.f21923a = 0;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f21924b = owner;
    }
}
