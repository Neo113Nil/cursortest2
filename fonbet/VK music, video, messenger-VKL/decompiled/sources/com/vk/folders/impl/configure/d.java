package com.vk.folders.impl.configure;

import com.vk.folders.impl.configure.a;
import com.vk.folders.impl.configure.d;
import com.vk.folders.impl.configure.e;
import com.vk.folders.impl.configure.g;
import com.vk.folders.impl.configure.i;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import defpackage.x;
import defpackage.y;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.single.j;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.asu0;
import xsna.ayr;
import xsna.b0s;
import xsna.b9b;
import xsna.bwl;
import xsna.c40;
import xsna.c5g;
import xsna.cau0;
import xsna.d0s;
import xsna.di6;
import xsna.drm0;
import xsna.drz;
import xsna.dyr;
import xsna.e43;
import xsna.epx;
import xsna.eum0;
import xsna.eyr;
import xsna.fxj;
import xsna.gn0;
import xsna.gr;
import xsna.gtz;
import xsna.hfz;
import xsna.htm;
import xsna.ig4;
import xsna.igh;
import xsna.ir0;
import xsna.izs;
import xsna.j5g;
import xsna.jgp;
import xsna.k5;
import xsna.kwg0;
import xsna.l2i;
import xsna.m0s;
import xsna.m1k;
import xsna.on00;
import xsna.ozo0;
import xsna.p4g;
import xsna.pff;
import xsna.q3v;
import xsna.qcl;
import xsna.qs2;
import xsna.ri0;
import xsna.sdy;
import xsna.tr0;
import xsna.tz;
import xsna.uxr;
import xsna.wt90;
import xsna.xrm;
import xsna.xs90;
import xsna.xxr;
import xsna.yaq;
import xsna.ygk0;
import xsna.yt90;
import xsna.z0s;

/* compiled from: FolderConfigurationFeature.kt */
/* loaded from: classes18.dex */
public final class d extends di6<ayr, g, i, e> {
    public final com.vk.folders.impl.configure.a h;
    public final m0s i;
    public final drz<xrm> j;
    public final z0s k;
    public final htm l;
    public final cau0 m;
    public final w n;
    public io.reactivex.rxjava3.disposables.c o;
    public final eyr p;

    /* compiled from: FolderConfigurationFeature.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0272, code lost:
        
            if (com.vk.toggle.b.A.a(r0) == false) goto L88;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ListBuilder a(Map map, Map map2, Set set, Set set2, List list, Boolean bool, Boolean bool2, String str, FolderType folderType, List list2, com.vk.im.engine.models.c cVar, eyr eyrVar) {
            Object obj;
            FolderType folderType2;
            boolean z;
            List<hfz> list3 = list;
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((hfz) obj) instanceof xxr) {
                    break;
                }
            }
            hfz hfzVar = (hfz) obj;
            pff pffVar = new pff(new Ref$IntRef(), 22);
            ListBuilder e = e43.e();
            e.add(new ygk0(18, ((Number) pffVar.invoke()).intValue()));
            boolean z2 = false;
            if (hfzVar == null) {
                folderType2 = folderType;
                hfzVar = new xxr(str, 0L, !(defpackage.b.e(str) <= 16), 16, folderType2);
            } else {
                folderType2 = folderType;
            }
            e.add(hfzVar);
            if (eyrVar != null && eyrVar.d(folderType2)) {
                e.add(new ygk0(12, ((Number) pffVar.invoke()).intValue()));
                e.add(new fxj(((Number) pffVar.invoke()).intValue(), folderType2, eyrVar.a(folderType2)));
            }
            if (sdy.o(folderType2, cVar)) {
                e.add(new ygk0(20, ((Number) pffVar.invoke()).intValue()));
                e.add(new ozo0(R.string.vkim_contacts_included));
                e.add(new ygk0(9, ((Number) pffVar.invoke()).intValue()));
                e.add(new xs90());
            }
            ListBuilder g = e.g();
            boolean z3 = list3 instanceof Collection;
            if (!z3 || !list3.isEmpty()) {
                for (hfz hfzVar2 : list3) {
                    if ((hfzVar2 instanceof gtz) && ((gtz) hfzVar2).b == -1) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z3 || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    hfz hfzVar3 = (hfz) it2.next();
                    if ((hfzVar3 instanceof gtz) && ((gtz) hfzVar3).b == -2) {
                        z2 = true;
                        break;
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (set2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List y0 = j5g.y0(linkedHashMap.values());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (!set.contains(entry2.getKey()) && !map.containsKey(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            ArrayList u0 = j5g.u0(linkedHashMap2.values(), y0);
            ListBuilder e2 = e43.e();
            if (folderType2 != FolderType.DEFAULT) {
                e2.add(new ygk0(12, ((Number) pffVar.invoke()).intValue()));
                e2.add(new bwl());
                e2.add(new ygk0(12, ((Number) pffVar.invoke()).intValue()));
                e2.add(q3v.b);
                e2.add(new ygk0(12, ((Number) pffVar.invoke()).intValue()));
            }
            ListBuilder g2 = e2.g();
            ListBuilder e3 = e43.e();
            e3.addAll(g);
            Boolean bool3 = Boolean.TRUE;
            if (epx.f(bool, bool3) || (bool == null && z)) {
                e3.add(new gtz(-1));
            }
            e3.addAll(u0);
            if (epx.f(bool2, bool3) || (bool2 == null && z2)) {
                e3.add(new gtz(-2));
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                b0s b0sVar = (b0s) it3.next();
                e3.add(new eum0(b0sVar.b, b0sVar.c, b0sVar.a));
            }
            if (folderType2 == FolderType.CHANNELS) {
                ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
                imFeatures.getClass();
            }
            e3.addAll(g2);
            return e3.g();
        }
    }

    /* compiled from: FolderConfigurationFeature.kt */
    public static final class b {
        public final eyr a;
        public final q<Boolean> b;

        public b(dyr dyrVar, q qVar) {
            this.a = dyrVar;
            this.b = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CountersInteractorContainer(interactor=" + this.a + ", visibilityObservable=" + this.b + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(com.vk.folders.impl.configure.a aVar, m0s m0sVar, drz drzVar, z0s z0sVar, htm htmVar, d0s d0sVar, io.reactivex.rxjava3.subjects.f fVar, cau0 cau0Var, b bVar) {
        super(new ayr(r17, false, !(defpackage.b.e(r10) <= 16), r10, r3, r3, r7, r24, r24, new ProfilesInfo(), false, r11 != FolderType.CHANNELS));
        Pair pair;
        if (aVar instanceof a.C1068a) {
            pair = new Pair("", FolderType.DEFAULT);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar2 = (a.b) aVar;
            pair = new Pair(bVar2.b, bVar2.c);
        }
        String str = (String) pair.d();
        FolderType folderType = (FolderType) pair.g();
        EmptyList emptyList = EmptyList.b;
        EmptySet emptySet = EmptySet.b;
        Boolean bool = Boolean.FALSE;
        jgp jgpVar = jgp.b;
        ListBuilder a2 = a.a(jgpVar, jgpVar, emptySet, emptySet, emptyList, bool, bool, str, folderType, emptyList, cau0Var, null);
        boolean z = true;
        this.h = aVar;
        this.i = m0sVar;
        this.j = drzVar;
        this.k = z0sVar;
        this.l = htmVar;
        this.m = cau0Var;
        w c = asu0.a.c();
        this.n = c;
        this.o = EmptyDisposable.INSTANCE;
        this.p = bVar.a;
        m1 a0 = fVar.r0(c).a0(c);
        ir0 ir0Var = new ir0(this, 15);
        a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
        i(a0, nVar, ir0Var);
        if (!epx.f(aVar, a.C1068a.a)) {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z = sdy.o(((a.b) aVar).c, cau0Var);
        }
        if (z) {
            i(new c0(drzVar.getState().r0(c).a0(c), io.reactivex.rxjava3.internal.functions.a.d, new b9b(this, 1)), nVar, new tz(this, 17));
            i(htmVar.d().r0(c).a0(c), nVar, new k5(this, 21));
            if (aVar instanceof a.b) {
                drzVar.a(30);
            }
        }
        if (aVar instanceof a.b) {
            i(d0sVar.b(((a.b) aVar).a).a0(c), nVar, new c40(this, 20));
        }
        q<Boolean> qVar = bVar.b;
        gr grVar = new gr(new tr0(18), 15);
        qVar.getClass();
        this.b.b(new i0(qVar, grVar).subscribe(new x(this, 22), kwg0.b()));
    }

    public static boolean u(Map map, Map map2, Set set, Set set2) {
        boolean z;
        boolean z2;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (set2.contains(((Map.Entry) it.next()).getKey())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!map2.isEmpty()) {
            for (Map.Entry entry : map2.entrySet()) {
                if (!set.contains(entry.getKey()) && !map.containsKey(entry.getKey())) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        return z || z2;
    }

    public static boolean v(Set set, Set set2) {
        return (set.isEmpty() && set2.isEmpty()) ? false : true;
    }

    public static LinkedHashMap w(List list, Map map, Set set, ProfilesInfo profilesInfo) {
        ProfilesInfo profilesInfo2;
        List<Dialog> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Dialog dialog : list2) {
            wt90 wt90Var = (wt90) map.get(dialog.Sb());
            Long Sb = dialog.Sb();
            if (wt90Var == null || set.contains(dialog.Sb())) {
                profilesInfo2 = profilesInfo;
                wt90Var = yaq.a(dialog, profilesInfo2, false, false, true, false);
            } else {
                profilesInfo2 = profilesInfo;
            }
            Pair pair = new Pair(Sb, wt90Var);
            linkedHashMap.put(pair.i(), pair.j());
            profilesInfo = profilesInfo2;
        }
        return p4g.h(linkedHashMap);
    }

    @Override // xsna.di6
    public final void d(g gVar) {
        g gVar2 = gVar;
        if (gVar2.equals(g.a.b)) {
            m(e.b.a);
            return;
        }
        if (gVar2.equals(g.c.b)) {
            r(new igh(this, 13));
            return;
        }
        if (gVar2.equals(g.i.b)) {
            r(new m1k(this, 8));
            return;
        }
        if (gVar2 instanceof g.j) {
            q(new ri0(13, this, (g.j) gVar2));
            return;
        }
        boolean equals = gVar2.equals(g.e.b);
        com.vk.folders.impl.configure.a aVar = this.h;
        if (equals) {
            if (aVar instanceof a.b) {
                n(i.c.a);
                return;
            }
            return;
        }
        if (gVar2.equals(g.f.b)) {
            if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                if (bVar.c != FolderType.DEFAULT) {
                    di6.a(this, this.k.F(bVar.a));
                    m(e.c.a);
                    return;
                }
                return;
            }
            return;
        }
        if (gVar2 instanceof g.d) {
            if (aVar instanceof a.b) {
                r(new y(9, gVar2, this));
                return;
            }
            return;
        }
        if (gVar2 instanceof g.h) {
            wt90 wt90Var = ((g.h) gVar2).b;
            n(new i.d(Collections.singletonList(new yt90.a(wt90Var)), wt90Var));
            return;
        }
        if (gVar2 instanceof g.C1069g) {
            final long j = ((g.C1069g) gVar2).b.b;
            q(new izs() { // from class: xsna.vxr
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ayr ayrVar = (ayr) obj;
                    Set<Long> set = ayrVar.h;
                    Set R0 = j5g.R0(set);
                    Set R02 = j5g.R0(ayrVar.i);
                    long j2 = j;
                    if (set.contains(Long.valueOf(j2))) {
                        R0.remove(Long.valueOf(j2));
                    } else {
                        R02.add(Long.valueOf(j2));
                    }
                    String str = ayrVar.d;
                    boolean z = ayrVar.c;
                    boolean u = com.vk.folders.impl.configure.d.u(ayrVar.e, ayrVar.f, R02, R0);
                    boolean v = com.vk.folders.impl.configure.d.v(R0, R02);
                    com.vk.folders.impl.configure.d dVar = this;
                    return ayr.a(ayrVar, d.a.a(ayrVar.e, ayrVar.f, R02, R0, ayrVar.a, null, null, ayrVar.d, com.vk.folders.impl.configure.b.a(dVar.h), ayrVar.g, dVar.m, dVar.p), dVar.s(str, z, u, v), false, null, null, null, null, R0, R02, null, false, 15996);
                }
            });
        } else {
            if (!(gVar2 instanceof g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            g.b bVar2 = (g.b) gVar2;
            this.o.dispose();
            this.o = j(new o(new j(new n(this.p.c(bVar2.b, bVar2.c), new gn0(new qcl(this, 9), 21)), new ig4(this, 3)), new qs2(new l2i(bVar2, 10), 16)), new defpackage.d(this, 28), new uxr(0, this, bVar2));
        }
    }

    public final boolean s(String str, boolean z, boolean z2, boolean z3) {
        if (drm0.N(str) || z) {
            return false;
        }
        com.vk.folders.impl.configure.a aVar = this.h;
        if (aVar instanceof a.C1068a) {
            return z2;
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        boolean equals = bVar.b.equals(str);
        boolean z4 = !equals;
        if (!sdy.o(bVar.c, this.m)) {
            return z4;
        }
        if (bVar.c != FolderType.DEFAULT) {
            return !equals || z3;
        }
        if (z2) {
            return !equals || z3;
        }
        return false;
    }
}
