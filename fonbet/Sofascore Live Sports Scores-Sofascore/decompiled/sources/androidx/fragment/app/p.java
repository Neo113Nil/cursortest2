package androidx.fragment.app;

import defpackage.cp8;
import defpackage.fq8;
import defpackage.ixh;
import defpackage.nx0;
import defpackage.o13;
import defpackage.ppd;
import defpackage.wb3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p extends ppd {
    public final /* synthetic */ s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar) {
        super(false);
        this.d = sVar;
    }

    @Override // defpackage.ppd
    public final void a() {
        boolean O = s.O(3);
        s sVar = this.d;
        if (O) {
            Objects.toString(sVar);
        }
        if (s.O(3)) {
            Objects.toString(sVar.h);
        }
        a aVar = sVar.h;
        if (aVar != null) {
            aVar.u = false;
            aVar.e();
            a aVar2 = sVar.h;
            wb3 wb3Var = new wb3(sVar, 29);
            ArrayList arrayList = aVar2.s;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVar2.s = arrayList;
            }
            arrayList.add(wb3Var);
            sVar.h.f();
            sVar.i = true;
            sVar.z(true);
            sVar.H();
            sVar.i = false;
            sVar.h = null;
        }
    }

    @Override // defpackage.ppd
    public final void b() {
        boolean O = s.O(3);
        s sVar = this.d;
        if (O) {
            Objects.toString(sVar);
        }
        p pVar = sVar.j;
        ArrayList arrayList = sVar.o;
        sVar.i = true;
        sVar.z(true);
        sVar.i = false;
        if (sVar.h == null) {
            if (pVar.b) {
                sVar.V();
                return;
            } else {
                sVar.g.c();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s.I(sVar.h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cp8 cp8Var = (cp8) it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    cp8Var.a((Fragment) it2.next(), true);
                }
            }
        }
        Iterator it3 = sVar.h.c.iterator();
        while (it3.hasNext()) {
            Fragment fragment = ((fq8) it3.next()).b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it4 = sVar.f(new ArrayList(Collections.singletonList(sVar.h)), 0, 1).iterator();
        while (it4.hasNext()) {
            h hVar = (h) it4.next();
            ArrayList arrayList2 = hVar.c;
            hVar.m(arrayList2);
            hVar.c(arrayList2);
        }
        Iterator it5 = sVar.h.c.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = ((fq8) it5.next()).b;
            if (fragment2 != null && fragment2.mContainer == null) {
                sVar.g(fragment2).i();
            }
        }
        sVar.h = null;
        sVar.o0();
        if (s.O(3)) {
            boolean z = pVar.b;
            sVar.toString();
        }
    }

    @Override // defpackage.ppd
    public final void c(nx0 nx0Var) {
        boolean O = s.O(2);
        s sVar = this.d;
        if (O) {
            Objects.toString(sVar);
        }
        if (sVar.h != null) {
            Iterator it = sVar.f(new ArrayList(Collections.singletonList(sVar.h)), 0, 1).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.getClass();
                ArrayList arrayList = hVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    o13.v(((y) it2.next()).k, arrayList2);
                }
                List S0 = CollectionsKt.S0(CollectionsKt.W0(arrayList2));
                int size = S0.size();
                for (int i = 0; i < size; i++) {
                    ((ixh) S0.get(i)).d(nx0Var, hVar.a);
                }
            }
            Iterator it3 = sVar.o.iterator();
            while (it3.hasNext()) {
                ((cp8) it3.next()).getClass();
            }
        }
    }

    @Override // defpackage.ppd
    public final void d(nx0 nx0Var) {
        boolean O = s.O(3);
        s sVar = this.d;
        if (O) {
            Objects.toString(sVar);
        }
        sVar.w();
        sVar.x(new q(sVar), false);
    }
}
