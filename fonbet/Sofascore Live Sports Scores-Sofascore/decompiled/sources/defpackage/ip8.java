package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import androidx.fragment.app.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@x8d("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lip8;", "Ly8d;", "Ljp8;", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ip8 extends y8d {
    public final Context c;
    public final s d;
    public final int e;
    public final LinkedHashSet f;
    public final ArrayList g;
    public final ga h;
    public final yx7 i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends ltk {
        public WeakReference b;

        @Override // defpackage.ltk
        public final void e() {
            WeakReference weakReference = this.b;
            if (weakReference == null) {
                Intrinsics.i("completeTransition");
                throw null;
            }
            Function0 function0 = (Function0) weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public ip8(Context context, s sVar, int i) {
        context.getClass();
        sVar.getClass();
        this.c = context;
        this.d = sVar;
        this.e = i;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
        this.h = new ga(this, 1);
        this.i = new yx7(this, 15);
    }

    public static void k(ip8 ip8Var, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = ip8Var.g;
        if (z2) {
            o13.A(arrayList, new jp1(str, 16));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // defpackage.y8d
    public final s6d a() {
        return new jp8(this);
    }

    @Override // defpackage.y8d
    public final void d(List list, u7d u7dVar) {
        list.getClass();
        s sVar = this.d;
        if (sVar.S()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d6d d6dVar = (d6d) it.next();
            boolean isEmpty = ((List) b().e.a.getValue()).isEmpty();
            if (u7dVar == null || isEmpty || !u7dVar.b || !this.f.remove(d6dVar.f)) {
                androidx.fragment.app.a m = m(d6dVar, u7dVar);
                String str = d6dVar.f;
                if (!isEmpty) {
                    d6d d6dVar2 = (d6d) CollectionsKt.j0((List) b().e.a.getValue());
                    if (d6dVar2 != null) {
                        k(this, d6dVar2.f, 6);
                    }
                    k(this, str, 6);
                    m.c(str);
                }
                m.f();
                if (n()) {
                    d6dVar.toString();
                }
                b().i(d6dVar);
            } else {
                sVar.x(new r(sVar, d6dVar.f, 0), false);
                b().i(d6dVar);
            }
        }
    }

    @Override // defpackage.y8d
    public final void e(final h6d h6dVar) {
        this.a = h6dVar;
        this.b = true;
        lp8 lp8Var = new lp8() { // from class: hp8
            @Override // defpackage.lp8
            public final void a(s sVar, Fragment fragment) {
                Object obj;
                sVar.getClass();
                h6d h6dVar2 = h6d.this;
                List list = (List) h6dVar2.e.a.getValue();
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
                boolean n = ip8.n();
                ip8 ip8Var = this;
                if (n) {
                    Objects.toString(fragment);
                    Objects.toString(d6dVar);
                    Objects.toString(ip8Var.d);
                }
                if (d6dVar != null) {
                    fragment.getViewLifecycleOwnerLiveData().e(fragment, new y7(26, new dr6(14, ip8Var, fragment, d6dVar)));
                    fragment.getLifecycle().a(ip8Var.h);
                    ip8Var.l(fragment, d6dVar, h6dVar2);
                }
            }
        };
        s sVar = this.d;
        sVar.q.add(lp8Var);
        sVar.o.add(new kp8(h6dVar, this));
    }

    @Override // defpackage.y8d
    public final void f(d6d d6dVar) {
        String str = d6dVar.f;
        s sVar = this.d;
        if (sVar.S()) {
            return;
        }
        androidx.fragment.app.a m = m(d6dVar, null);
        List list = (List) b().e.a.getValue();
        if (list.size() > 1) {
            d6d d6dVar2 = (d6d) CollectionsKt.a0(list.size() - 2, list);
            if (d6dVar2 != null) {
                k(this, d6dVar2.f, 6);
            }
            k(this, str, 4);
            sVar.x(new ep8(sVar, str, -1, 1), false);
            k(this, str, 2);
            m.c(str);
        }
        m.f();
        b().d(d6dVar);
    }

    @Override // defpackage.y8d
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            o13.v(stringArrayList, linkedHashSet);
        }
    }

    @Override // defpackage.y8d
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return hz8.E(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r10 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r12.f.equals(r7.f) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        r4.add(r9);
     */
    @Override // defpackage.y8d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(d6d d6dVar, boolean z) {
        int i;
        s sVar = this.d;
        if (sVar.S()) {
            return;
        }
        List list = (List) b().e.a.getValue();
        int indexOf = list.indexOf(d6dVar);
        List subList = list.subList(indexOf, list.size());
        d6d d6dVar2 = (d6d) CollectionsKt.Y(list);
        int i2 = 1;
        d6d d6dVar3 = (d6d) CollectionsKt.a0(indexOf - 1, list);
        if (d6dVar3 != null) {
            k(this, d6dVar3.f, 6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = subList.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    k(this, ((d6d) it2.next()).f, 4);
                }
                if (z) {
                    for (d6d d6dVar4 : CollectionsKt.B0(subList)) {
                        if (Intrinsics.c(d6dVar4, d6dVar2)) {
                            Objects.toString(d6dVar4);
                        } else {
                            sVar.x(new r(sVar, d6dVar4.f, 1), false);
                            this.f.add(d6dVar4.f);
                        }
                    }
                } else {
                    sVar.x(new ep8(sVar, d6dVar.f, -1, 1), false);
                }
                if (n()) {
                    Objects.toString(d6dVar);
                }
                b().f(d6dVar, z);
                return;
            }
            Object next = it.next();
            d6d d6dVar5 = (d6d) next;
            lwj n = i5h.n(new oh0(this.g, i2), new ol8(7));
            String str = d6dVar5.f;
            Iterator it3 = n.a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i = -1;
                    break;
                }
                Object invoke = n.b.invoke(it3.next());
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                if (str.equals(invoke)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i2 = 1;
        }
    }

    public final void l(Fragment fragment, d6d d6dVar, h6d h6dVar) {
        fragment.getClass();
        stk viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        l3a l3aVar = new l3a(0);
        ol8 ol8Var = new ol8(8);
        fuf fufVar = duf.a;
        l3aVar.a(fufVar.getOrCreateKotlinClass(a.class), ol8Var);
        ne b = l3aVar.b();
        jy3 jy3Var = jy3.b;
        jy3Var.getClass();
        g7h g7hVar = new g7h(viewModelStore, b, jy3Var);
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(a.class);
        orCreateKotlinClass.getClass();
        String t = kik.t(orCreateKotlinClass);
        if (t == null) {
            a70.p("Local and anonymous classes can not be ViewModels");
        } else {
            ((a) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t), orCreateKotlinClass)).b = new WeakReference(new ij8(d6dVar, h6dVar, this, fragment));
        }
    }

    public final androidx.fragment.app.a m(d6d d6dVar, u7d u7dVar) {
        s6d s6dVar = d6dVar.b;
        s6dVar.getClass();
        Bundle a2 = d6dVar.h.a();
        String str = ((jp8) s6dVar).g;
        if (str == null) {
            a70.r("Fragment class was not set");
            return null;
        }
        char charAt = str.charAt(0);
        Context context = this.c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        s sVar = this.d;
        xo8 M = sVar.M();
        context.getClassLoader();
        Fragment a3 = M.a(str);
        a3.getClass();
        a3.setArguments(a2);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(sVar);
        int i = u7dVar != null ? u7dVar.f : -1;
        int i2 = u7dVar != null ? u7dVar.g : -1;
        int i3 = u7dVar != null ? u7dVar.h : -1;
        int i4 = u7dVar != null ? u7dVar.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            aVar.d = i;
            aVar.e = i2;
            aVar.f = i3;
            aVar.g = i5;
        }
        aVar.l(this.e, a3, d6dVar.f);
        aVar.n(a3);
        aVar.r = true;
        return aVar;
    }
}
