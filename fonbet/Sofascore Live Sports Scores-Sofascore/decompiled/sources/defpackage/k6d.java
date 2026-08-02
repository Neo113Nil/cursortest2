package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k6d {
    public final k7d a;
    public final bb7 b;
    public g7d c;
    public Bundle d;
    public Bundle[] e;
    public final vg0 f = new vg0();
    public final fdi g;
    public final fdi h;
    public final jof i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public u6b n;
    public l6d o;
    public final ArrayList p;
    public e6b q;
    public final ga r;
    public final z8d s;
    public final LinkedHashMap t;
    public Function1 u;
    public b05 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final aeh z;

    public k6d(k7d k7dVar, bb7 bb7Var) {
        this.a = k7dVar;
        this.b = bb7Var;
        km5 km5Var = km5.a;
        this.g = gdi.a(km5Var);
        fdi a = gdi.a(km5Var);
        this.h = a;
        this.i = un0.u(a);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = e6b.b;
        this.r = new ga(this, 3);
        this.s = new z8d();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = beh.b(1, 0, a62.b, 2);
    }

    public static s6d d(int i, s6d s6dVar, s6d s6dVar2, boolean z) {
        s6dVar.getClass();
        if (s6dVar.b.b == i && (s6dVar2 == null || (s6dVar.equals(s6dVar2) && Intrinsics.c(s6dVar.c, s6dVar2.c)))) {
            return s6dVar;
        }
        g7d g7dVar = s6dVar instanceof g7d ? (g7d) s6dVar : null;
        if (g7dVar == null) {
            g7dVar = s6dVar.c;
            g7dVar.getClass();
        }
        return g7dVar.g.l(i, g7dVar, s6dVar2, z);
    }

    public static /* synthetic */ void o(k6d k6dVar, d6d d6dVar) {
        k6dVar.n(d6dVar, false, new vg0());
    }

    public final void a(s6d s6dVar, Bundle bundle, d6d d6dVar, List list) {
        Object obj;
        Object obj2;
        fl5 fl5Var = this.a.c;
        s6d s6dVar2 = d6dVar.b;
        boolean z = s6dVar2 instanceof x88;
        vg0 vg0Var = this.f;
        if (!z) {
            while (!vg0Var.isEmpty() && (((d6d) vg0Var.last()).b instanceof x88) && m(((d6d) vg0Var.last()).b.b.b, true, false)) {
            }
        }
        vg0 vg0Var2 = new vg0();
        Object obj3 = null;
        if (s6dVar instanceof g7d) {
            s6d s6dVar3 = s6dVar2;
            do {
                s6dVar3.getClass();
                s6dVar3 = s6dVar3.c;
                if (s6dVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (Intrinsics.c(((d6d) obj2).b, s6dVar3)) {
                                break;
                            }
                        }
                    }
                    d6d d6dVar2 = (d6d) obj2;
                    if (d6dVar2 == null) {
                        d6dVar2 = q1f.h(fl5Var, s6dVar3, bundle, h(), this.o);
                    }
                    vg0Var2.addFirst(d6dVar2);
                    if (!vg0Var.isEmpty() && ((d6d) vg0Var.last()).b == s6dVar3) {
                        o(this, (d6d) vg0Var.last());
                    }
                }
                if (s6dVar3 == null) {
                    break;
                }
            } while (s6dVar3 != s6dVar);
        }
        s6d s6dVar4 = vg0Var2.isEmpty() ? s6dVar2 : ((d6d) vg0Var2.first()).b;
        while (s6dVar4 != null && c(s6dVar4.b.b, s6dVar4) != s6dVar4) {
            s6dVar4 = s6dVar4.c;
            if (s6dVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (Intrinsics.c(((d6d) obj).b, s6dVar4)) {
                            break;
                        }
                    }
                }
                d6d d6dVar3 = (d6d) obj;
                if (d6dVar3 == null) {
                    d6dVar3 = q1f.h(fl5Var, s6dVar4, s6dVar4.c(bundle2), h(), this.o);
                }
                vg0Var2.addFirst(d6dVar3);
            }
        }
        if (!vg0Var2.isEmpty()) {
            s6dVar2 = ((d6d) vg0Var2.first()).b;
        }
        while (!vg0Var.isEmpty() && (((d6d) vg0Var.last()).b instanceof g7d)) {
            s6d s6dVar5 = ((d6d) vg0Var.last()).b;
            s6dVar5.getClass();
            if (gz8.C((zwh) ((g7d) s6dVar5).g.e, s6dVar2.b.b) != null) {
                break;
            } else {
                o(this, (d6d) vg0Var.last());
            }
        }
        d6d d6dVar4 = (d6d) vg0Var.d();
        if (d6dVar4 == null) {
            d6dVar4 = (d6d) vg0Var2.d();
        }
        if (!Intrinsics.c(d6dVar4 != null ? d6dVar4.b : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                s6d s6dVar6 = ((d6d) previous).b;
                g7d g7dVar = this.c;
                g7dVar.getClass();
                if (Intrinsics.c(s6dVar6, g7dVar)) {
                    obj3 = previous;
                    break;
                }
            }
            d6d d6dVar5 = (d6d) obj3;
            if (d6dVar5 == null) {
                g7d g7dVar2 = this.c;
                g7dVar2.getClass();
                g7d g7dVar3 = this.c;
                g7dVar3.getClass();
                d6dVar5 = q1f.h(fl5Var, g7dVar2, g7dVar3.c(bundle), h(), this.o);
            }
            vg0Var2.addFirst(d6dVar5);
        }
        Iterator it = vg0Var2.iterator();
        while (it.hasNext()) {
            d6d d6dVar6 = (d6d) it.next();
            Object obj4 = this.t.get(this.s.b(d6dVar6.b.a));
            if (obj4 == null) {
                hc5.f(mz1.o(new StringBuilder("NavigatorBackStack for "), s6dVar.a, " should already be created"));
                return;
            }
            ((h6d) obj4).a(d6dVar6);
        }
        vg0Var.addAll(vg0Var2);
        vg0Var.addLast(d6dVar);
        Iterator it2 = CollectionsKt.x0(vg0Var2, d6dVar).iterator();
        while (it2.hasNext()) {
            d6d d6dVar7 = (d6d) it2.next();
            g7d g7dVar4 = d6dVar7.b.c;
            if (g7dVar4 != null) {
                j(d6dVar7, e(g7dVar4.b.b));
            }
        }
    }

    public final boolean b() {
        vg0 vg0Var;
        while (true) {
            vg0Var = this.f;
            if (vg0Var.isEmpty() || !(((d6d) vg0Var.last()).b instanceof g7d)) {
                break;
            }
            o(this, (d6d) vg0Var.last());
        }
        d6d d6dVar = (d6d) vg0Var.m();
        ArrayList arrayList = this.y;
        if (d6dVar != null) {
            arrayList.add(d6dVar);
        }
        this.x++;
        t();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList U0 = CollectionsKt.U0(arrayList);
            arrayList.clear();
            Iterator it = U0.iterator();
            while (it.hasNext()) {
                d6d d6dVar2 = (d6d) it.next();
                Iterator it2 = CollectionsKt.S0(this.p).iterator();
                while (it2.hasNext()) {
                    ((i6d) it2.next()).a(this.a, d6dVar2.b, d6dVar2.h.a());
                }
                this.z.b(d6dVar2);
            }
            ArrayList arrayList2 = new ArrayList(vg0Var);
            fdi fdiVar = this.g;
            fdiVar.getClass();
            fdiVar.m(null, arrayList2);
            ArrayList p = p();
            fdi fdiVar2 = this.h;
            fdiVar2.getClass();
            fdiVar2.m(null, p);
        }
        return d6dVar != null;
    }

    public final s6d c(int i, s6d s6dVar) {
        s6d s6dVar2;
        g7d g7dVar = this.c;
        if (g7dVar == null) {
            return null;
        }
        if (g7dVar.b.b == i) {
            if (s6dVar == null) {
                return g7dVar;
            }
            if (Intrinsics.c(g7dVar, s6dVar) && s6dVar.c == null) {
                return this.c;
            }
        }
        d6d d6dVar = (d6d) this.f.m();
        if (d6dVar == null || (s6dVar2 = d6dVar.b) == null) {
            s6dVar2 = this.c;
            s6dVar2.getClass();
        }
        return d(i, s6dVar2, s6dVar, false);
    }

    public final d6d e(int i) {
        Object obj;
        vg0 vg0Var = this.f;
        ListIterator<E> listIterator = vg0Var.listIterator(vg0Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((d6d) obj).b.b.b == i) {
                break;
            }
        }
        d6d d6dVar = (d6d) obj;
        if (d6dVar != null) {
            return d6dVar;
        }
        StringBuilder t = lnb.t(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        t.append(f());
        throw new IllegalArgumentException(t.toString().toString());
    }

    public final s6d f() {
        d6d d6dVar = (d6d) this.f.m();
        if (d6dVar != null) {
            return d6dVar.b;
        }
        return null;
    }

    public final g7d g() {
        g7d g7dVar = this.c;
        if (g7dVar != null) {
            g7dVar.getClass();
            return g7dVar;
        }
        a70.r("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final e6b h() {
        return this.n == null ? e6b.c : this.q;
    }

    public final g7d i() {
        s6d s6dVar;
        d6d d6dVar = (d6d) this.f.m();
        if (d6dVar == null || (s6dVar = d6dVar.b) == null) {
            s6dVar = this.c;
            s6dVar.getClass();
        }
        g7d g7dVar = s6dVar instanceof g7d ? (g7d) s6dVar : null;
        if (g7dVar != null) {
            return g7dVar;
        }
        g7d g7dVar2 = s6dVar.c;
        g7dVar2.getClass();
        return g7dVar2;
    }

    public final void j(d6d d6dVar, d6d d6dVar2) {
        this.j.put(d6dVar, d6dVar2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(d6dVar2) == null) {
            linkedHashMap.put(d6dVar2, new dm0());
        }
        Object obj = linkedHashMap.get(d6dVar2);
        obj.getClass();
        ((dm0) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
    
        if (r13.equals(r0) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        r0 = new defpackage.vg0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        if ((r12.size() - r4) < r14) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0116, code lost:
    
        r10 = (defpackage.d6d) defpackage.o13.D(r12);
        s(r10);
        r24 = r1;
        r15 = new defpackage.d6d(r10.a, r10.b, r10.b.c(r27), r10.d, r10.e, r10.f, r10.g);
        r1 = r10.d;
        r8 = r15.h;
        r8.getClass();
        r1.getClass();
        r8.d = r1;
        r8.k = r10.h.k;
        r8.b();
        r0.addFirst(r15);
        r1 = r24;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0162, code lost:
    
        r24 = r1;
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        if (r1.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016e, code lost:
    
        r4 = (defpackage.d6d) r1.next();
        r8 = r4.b.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        if (r8 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017a, code lost:
    
        j(r4, e(r8.b.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        r12.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0189, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0191, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0193, code lost:
    
        r1 = (defpackage.d6d) r0.next();
        r11.b(r1.b.a).f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a5, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0108, code lost:
    
        if (r10.b == r0.b.b) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f2 A[LOOP:1: B:19:0x01ec->B:21:0x01f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(s6d s6dVar, Bundle bundle, u7d u7dVar) {
        boolean z;
        i3d i3dVar;
        asf asfVar;
        boolean z2;
        ListIterator listIterator;
        int i;
        Iterator it;
        s6dVar.getClass();
        LinkedHashMap linkedHashMap = this.t;
        Iterator it2 = linkedHashMap.values().iterator();
        while (true) {
            int i2 = 1;
            if (!it2.hasNext()) {
                break;
            } else {
                ((h6d) it2.next()).d = true;
            }
        }
        asf asfVar2 = new asf();
        if (u7dVar != null) {
            boolean z3 = u7dVar.e;
            boolean z4 = u7dVar.d;
            int i3 = u7dVar.c;
            if (i3 != -1) {
                z = m(i3, z4, z3);
                Bundle c = s6dVar.c(bundle);
                i3dVar = s6dVar.b;
                if (u7dVar != null && u7dVar.b) {
                    if (this.l.containsKey(Integer.valueOf(i3dVar.b))) {
                        asfVar2.a = q(i3dVar.b, c, u7dVar);
                        z2 = false;
                        this.b.invoke();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((h6d) it.next()).d = false;
                        }
                        if (!z || asfVar2.a || z2) {
                            b();
                        } else {
                            t();
                            return;
                        }
                    }
                }
                z8d z8dVar = this.s;
                if (u7dVar != null && u7dVar.a) {
                    vg0 vg0Var = this.f;
                    d6d d6dVar = (d6d) vg0Var.m();
                    listIterator = vg0Var.listIterator(vg0Var.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i = -1;
                            break;
                        } else if (((d6d) listIterator.previous()).b == s6dVar) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i != -1) {
                        if (s6dVar instanceof g7d) {
                            int i4 = g7d.h;
                            List q = i5h.q(i5h.n(e5h.e((g7d) s6dVar, new a7d(2)), new clc(25)));
                            if (vg0Var.size() - i == q.size()) {
                                List subList = vg0Var.subList(i, vg0Var.size());
                                ArrayList arrayList = new ArrayList(k13.r(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Integer.valueOf(((d6d) it3.next()).b.b.b));
                                }
                            }
                        } else if (d6dVar != null) {
                            s6d s6dVar2 = d6dVar.b;
                            if (s6dVar2 != null) {
                            }
                        }
                        if (z2) {
                            asfVar2 = asfVar;
                        } else {
                            d6d h = q1f.h(this.a.c, s6dVar, c, h(), this.o);
                            y8d b = z8dVar.b(s6dVar.a);
                            List c2 = a.c(h);
                            asfVar2 = asfVar;
                            lwc lwcVar = new lwc(asfVar2, this, s6dVar, c, 1);
                            c2.getClass();
                            this.u = lwcVar;
                            b.d(c2, u7dVar);
                            this.u = null;
                        }
                        this.b.invoke();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        if (z) {
                        }
                        b();
                    }
                }
                asfVar = asfVar2;
                z2 = false;
                if (z2) {
                }
                this.b.invoke();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                }
                if (z) {
                }
                b();
            }
        }
        z = false;
        Bundle c3 = s6dVar.c(bundle);
        i3dVar = s6dVar.b;
        if (u7dVar != null) {
            if (this.l.containsKey(Integer.valueOf(i3dVar.b))) {
            }
        }
        z8d z8dVar2 = this.s;
        if (u7dVar != null) {
            vg0 vg0Var2 = this.f;
            d6d d6dVar2 = (d6d) vg0Var2.m();
            listIterator = vg0Var2.listIterator(vg0Var2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        asfVar = asfVar2;
        z2 = false;
        if (z2) {
        }
        this.b.invoke();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        b();
    }

    public final void l(Object obj, u7d u7dVar) {
        String str;
        obj.getClass();
        obj.getClass();
        Class<?> cls = obj.getClass();
        fuf fufVar = duf.a;
        s6d d = d(waa.y(sha.R(fufVar.getOrCreateKotlinClass(cls))), g(), null, true);
        if (d != null) {
            Map m = d.m();
            LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(m.size()));
            for (Map.Entry entry : m.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((a6d) entry.getValue()).a);
            }
            str = waa.z(obj, linkedHashMap);
        } else {
            pvd.s("Destination with route ", fufVar.getOrCreateKotlinClass(obj.getClass()).getSimpleName(), " cannot be found in navigation graph ", this.c);
            str = null;
        }
        if (this.c == null) {
            i3c.j("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        g7d i = i();
        r6d s = i.s(str, true, i);
        if (s == null) {
            vp2.f(wt3.q("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.c);
            return;
        }
        s6d s6dVar = s.a;
        Bundle c = s6dVar.c(s.b);
        if (c == null) {
            lm5.a.getClass();
            c = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        int i2 = s6d.f;
        String str2 = (String) s6dVar.b.g;
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        parse.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        c.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        k(s6dVar, c, u7dVar);
    }

    public final boolean m(int i, boolean z, boolean z2) {
        s6d s6dVar;
        final k6d k6dVar;
        boolean z3;
        vg0 vg0Var = this.f;
        final int i2 = 0;
        if (vg0Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.B0(vg0Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                s6dVar = null;
                break;
            }
            s6dVar = ((d6d) it.next()).b;
            String str = s6dVar.a;
            i3d i3dVar = s6dVar.b;
            y8d b = this.s.b(str);
            if (z || i3dVar.b != i) {
                arrayList.add(b);
            }
            if (i3dVar.b == i) {
                break;
            }
        }
        if (s6dVar == null) {
            int i3 = s6d.f;
            l4a.q(this.a.c, i);
            return false;
        }
        asf asfVar = new asf();
        vg0 vg0Var2 = new vg0();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                k6dVar = this;
                z3 = z2;
                break;
            }
            y8d y8dVar = (y8d) it2.next();
            asf asfVar2 = new asf();
            d6d d6dVar = (d6d) vg0Var.last();
            k6dVar = this;
            z3 = z2;
            b05 b05Var = new b05(asfVar2, asfVar, k6dVar, z3, vg0Var2);
            y8dVar.getClass();
            d6dVar.getClass();
            k6dVar.v = b05Var;
            y8dVar.i(d6dVar, z3);
            k6dVar.v = null;
            if (!asfVar2.a) {
                break;
            }
            this = k6dVar;
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = k6dVar.l;
            if (!z) {
                Sequence e = e5h.e(s6dVar, new clc(23));
                Function1 function1 = new Function1(k6dVar) { // from class: j6d
                    public final /* synthetic */ k6d b;

                    {
                        this.b = k6dVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        int i4 = i2;
                        k6d k6dVar2 = this.b;
                        s6d s6dVar2 = (s6d) obj;
                        switch (i4) {
                            case 0:
                                s6dVar2.getClass();
                                containsKey = k6dVar2.l.containsKey(Integer.valueOf(s6dVar2.b.b));
                                break;
                            default:
                                s6dVar2.getClass();
                                containsKey = k6dVar2.l.containsKey(Integer.valueOf(s6dVar2.b.b));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                };
                e.getClass();
                c38 c38Var = new c38(new a65(e, function1));
                while (c38Var.hasNext()) {
                    Integer valueOf = Integer.valueOf(((s6d) c38Var.next()).b.b);
                    g6d g6dVar = (g6d) vg0Var2.d();
                    linkedHashMap.put(valueOf, g6dVar != null ? (String) g6dVar.a.b : null);
                }
            }
            if (!vg0Var2.isEmpty()) {
                fig figVar = ((g6d) vg0Var2.first()).a;
                String str2 = (String) figVar.b;
                Sequence e2 = e5h.e(k6dVar.c(figVar.a, null), new clc(24));
                final int i4 = 1;
                Function1 function12 = new Function1(k6dVar) { // from class: j6d
                    public final /* synthetic */ k6d b;

                    {
                        this.b = k6dVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        int i42 = i4;
                        k6d k6dVar2 = this.b;
                        s6d s6dVar2 = (s6d) obj;
                        switch (i42) {
                            case 0:
                                s6dVar2.getClass();
                                containsKey = k6dVar2.l.containsKey(Integer.valueOf(s6dVar2.b.b));
                                break;
                            default:
                                s6dVar2.getClass();
                                containsKey = k6dVar2.l.containsKey(Integer.valueOf(s6dVar2.b.b));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                };
                e2.getClass();
                c38 c38Var2 = new c38(new a65(e2, function12));
                while (c38Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((s6d) c38Var2.next()).b.b), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    k6dVar.m.put(str2, vg0Var2);
                }
            }
        }
        k6dVar.b.invoke();
        return asfVar.a;
    }

    public final void n(d6d d6dVar, boolean z, vg0 vg0Var) {
        l6d l6dVar;
        Set set;
        d6dVar.getClass();
        vg0 vg0Var2 = this.f;
        d6d d6dVar2 = (d6d) vg0Var2.last();
        if (!Intrinsics.c(d6dVar2, d6dVar)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(d6dVar.b);
            s6d s6dVar = d6dVar2.b;
            sb.append(", which is not the top of the back stack (");
            sb.append(s6dVar);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        o13.D(vg0Var2);
        s6d s6dVar2 = d6dVar2.b;
        f6d f6dVar = d6dVar2.h;
        h6d h6dVar = (h6d) this.t.get(this.s.b(s6dVar2.a));
        boolean z2 = true;
        if ((h6dVar == null || (set = (Set) h6dVar.f.a.getValue()) == null || !set.contains(d6dVar2)) && !this.k.containsKey(d6dVar2)) {
            z2 = false;
        }
        e6b e6bVar = f6dVar.j.i;
        e6b e6bVar2 = e6b.c;
        if (e6bVar.compareTo(e6bVar2) >= 0) {
            if (z) {
                f6dVar.k = e6bVar2;
                f6dVar.b();
                vg0Var.addFirst(new g6d(d6dVar2));
            }
            if (z2) {
                f6dVar.k = e6bVar2;
                f6dVar.b();
            } else {
                f6dVar.k = e6b.a;
                f6dVar.b();
                s(d6dVar2);
            }
        }
        if (z || z2 || (l6dVar = this.o) == null) {
            return;
        }
        stk stkVar = (stk) l6dVar.b.remove(d6dVar2.f);
        if (stkVar != null) {
            stkVar.a();
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((h6d) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                d6d d6dVar = (d6d) obj;
                if (!arrayList.contains(d6dVar) && d6dVar.h.k.compareTo(e6b.d) < 0) {
                    arrayList2.add(obj);
                }
            }
            o13.v(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            d6d d6dVar2 = (d6d) next;
            if (!arrayList.contains(d6dVar2) && d6dVar2.h.k.compareTo(e6b.d) >= 0) {
                arrayList3.add(next);
            }
        }
        o13.v(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((d6d) next2).b instanceof g7d)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, u7d u7dVar) {
        s6d g;
        d6d d6dVar;
        s6d s6dVar;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        o13.z(linkedHashMap.values(), new jp1(str, 22));
        vg0 vg0Var = (vg0) i5k.c(this.m).remove(str);
        fl5 fl5Var = this.a.c;
        ArrayList arrayList = new ArrayList();
        d6d d6dVar2 = (d6d) this.f.m();
        if (d6dVar2 == null || (g = d6dVar2.b) == null) {
            g = g();
        }
        if (vg0Var != null) {
            Iterator it = vg0Var.iterator();
            while (it.hasNext()) {
                g6d g6dVar = (g6d) it.next();
                fig figVar = g6dVar.a;
                fig figVar2 = g6dVar.a;
                s6d d = d(figVar.a, g, null, true);
                if (d == null) {
                    int i2 = s6d.f;
                    a70.n("Restore State failed: destination ", l4a.q(fl5Var, figVar2.a), " cannot be found from the current destination ", g);
                    return false;
                }
                e6b h = h();
                l6d l6dVar = this.o;
                fl5Var.getClass();
                h.getClass();
                Bundle bundle3 = (Bundle) figVar2.c;
                if (bundle3 != null) {
                    Context context = fl5Var.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new d6d(fl5Var, d, bundle2, h, l6dVar, (String) figVar2.b, (Bundle) figVar2.d));
                g = d;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((d6d) next).b instanceof g7d)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            d6d d6dVar3 = (d6d) it3.next();
            List list = (List) CollectionsKt.j0(arrayList2);
            if (Intrinsics.c((list == null || (d6dVar = (d6d) CollectionsKt.h0(list)) == null || (s6dVar = d6dVar.b) == null) ? null : s6dVar.a, d6dVar3.b.a)) {
                list.add(d6dVar3);
            } else {
                arrayList2.add(b.l(d6dVar3));
            }
        }
        asf asfVar = new asf();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            y8d b = this.s.b(((d6d) CollectionsKt.Y(list2)).b.a);
            ArrayList arrayList4 = arrayList;
            this.u = new ke(asfVar, arrayList4, new dsf(), this, bundle, 11);
            b.d(list2, u7dVar);
            this.u = null;
            arrayList = arrayList4;
        }
        return asfVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x023f  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.os.Bundle[], s6d] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(g7d g7dVar, Bundle bundle) {
        vg0 vg0Var;
        ?? r4;
        boolean z;
        vg0 vg0Var2;
        Intent intent;
        int[] intArray;
        Bundle bundle2;
        r6d r;
        int[] iArr;
        int length;
        int i;
        String str;
        s6d h;
        int i2;
        int i3;
        k7d k7dVar;
        Bundle[] bundleArr;
        int[] iArr2;
        g7d g7dVar2;
        g7d g7dVar3;
        Bundle bundle3;
        s6d h2;
        g7d g7dVar4;
        g7dVar.getClass();
        gtj gtjVar = g7dVar.g;
        vg0 vg0Var3 = this.f;
        if (!vg0Var3.isEmpty() && h() == e6b.a) {
            a70.r("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        if (Intrinsics.c(this.c, g7dVar)) {
            int e = ((zwh) gtjVar.e).e();
            for (int i4 = 0; i4 < e; i4++) {
                s6d s6dVar = (s6d) ((zwh) gtjVar.e).f(i4);
                g7d g7dVar5 = this.c;
                g7dVar5.getClass();
                int c = ((zwh) g7dVar5.g.e).c(i4);
                g7d g7dVar6 = this.c;
                g7dVar6.getClass();
                zwh zwhVar = (zwh) g7dVar6.g.e;
                if (zwhVar.a) {
                    gz8.H(zwhVar);
                }
                int h3 = kik.h(zwhVar.d, c, zwhVar.b);
                if (h3 >= 0) {
                    Object[] objArr = zwhVar.c;
                    Object obj = objArr[h3];
                    objArr[h3] = s6dVar;
                }
            }
            Iterator it = vg0Var3.iterator();
            while (it.hasNext()) {
                d6d d6dVar = (d6d) it.next();
                int i5 = s6d.f;
                sxb F = p13.F(i5h.q(l4a.t(d6dVar.b)));
                s6d s6dVar2 = this.c;
                s6dVar2.getClass();
                Iterator it2 = F.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((k4g) it2).b;
                    if (listIterator.hasPrevious()) {
                        s6d s6dVar3 = (s6d) listIterator.previous();
                        if (!Intrinsics.c(s6dVar3, this.c) || !Intrinsics.c(s6dVar2, g7dVar)) {
                            if (s6dVar2 instanceof g7d) {
                                s6dVar2 = ((g7d) s6dVar2).g.h(s6dVar3.b.b);
                                s6dVar2.getClass();
                            }
                        }
                    }
                }
                d6dVar.b = s6dVar2;
            }
            return;
        }
        g7d g7dVar7 = this.c;
        LinkedHashMap linkedHashMap = this.t;
        boolean z2 = true;
        Bundle bundle4 = null;
        if (g7dVar7 != null) {
            Iterator it3 = new ArrayList(this.l.keySet()).iterator();
            while (it3.hasNext()) {
                Integer num = (Integer) it3.next();
                num.getClass();
                int intValue = num.intValue();
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((h6d) it4.next()).d = true;
                }
                Unit unit = Unit.a;
                Bundle bundle5 = bundle4;
                vg0 vg0Var4 = vg0Var3;
                boolean q = q(intValue, bundle5, new u7d(false, true, -1, false, false, -1, -1, -1, -1));
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    ((h6d) it5.next()).d = false;
                }
                if (q) {
                    m(intValue, true, false);
                }
                bundle4 = bundle5;
                vg0Var3 = vg0Var4;
            }
            vg0Var = vg0Var3;
            r4 = bundle4;
            m(g7dVar7.b.b, true, false);
        } else {
            vg0Var = vg0Var3;
            r4 = 0;
        }
        this.c = g7dVar;
        k7d k7dVar2 = this.a;
        k6d k6dVar = k7dVar2.b;
        fl5 fl5Var = k7dVar2.c;
        Bundle bundle6 = this.d;
        z8d z8dVar = this.s;
        if (bundle6 != null && bundle6.containsKey("android-support-nav:controller:navigatorState:names")) {
            for (String str2 : o3a.E(bundle6, "android-support-nav:controller:navigatorState:names")) {
                y8d b = z8dVar.b(str2);
                if (bundle6.containsKey(str2)) {
                    b.g(o3a.B(bundle6, str2));
                }
            }
        }
        Bundle[] bundleArr2 = this.e;
        if (bundleArr2 != null) {
            int length2 = bundleArr2.length;
            int i6 = 0;
            while (i6 < length2) {
                Bundle bundle7 = bundleArr2[i6];
                bundle7.getClass();
                bundle7.setClassLoader(g6d.class.getClassLoader());
                String C = o3a.C(bundle7, "nav-entry-state:id");
                int y = o3a.y(bundle7, "nav-entry-state:destination-id");
                Bundle B = o3a.B(bundle7, "nav-entry-state:args");
                boolean z3 = z2;
                Bundle B2 = o3a.B(bundle7, "nav-entry-state:saved-state");
                s6d c2 = c(y, r4);
                if (c2 == null) {
                    int i7 = s6d.f;
                    zzl.m(wt3.q("Restoring the Navigation back stack failed: destination ", l4a.q(fl5Var, y), " cannot be found from the current destination "), f());
                    return;
                }
                e6b h4 = h();
                l6d l6dVar = this.o;
                fl5Var.getClass();
                h4.getClass();
                Context context = fl5Var.a;
                B.setClassLoader(context != null ? context.getClassLoader() : r4);
                d6d d6dVar2 = new d6d(fl5Var, c2, B, h4, l6dVar, C, B2);
                y8d b2 = z8dVar.b(c2.a);
                Object obj2 = linkedHashMap.get(b2);
                if (obj2 == null) {
                    obj2 = new h6d(k7dVar2, b2);
                    linkedHashMap.put(b2, obj2);
                }
                vg0 vg0Var5 = vg0Var;
                vg0Var5.addLast(d6dVar2);
                ((h6d) obj2).a(d6dVar2);
                g7d g7dVar8 = d6dVar2.b.c;
                if (g7dVar8 != null) {
                    j(d6dVar2, e(g7dVar8.b.b));
                }
                i6++;
                vg0Var = vg0Var5;
                z2 = z3;
            }
            z = z2;
            vg0Var2 = vg0Var;
            this.b.invoke();
            this.e = r4;
        } else {
            z = true;
            vg0Var2 = vg0Var;
        }
        Collection values = tub.p(z8dVar.a).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : values) {
            if (!((y8d) obj3).b) {
                arrayList.add(obj3);
            }
        }
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            y8d y8dVar = (y8d) it6.next();
            Object obj4 = linkedHashMap.get(y8dVar);
            if (obj4 == null) {
                y8dVar.getClass();
                obj4 = new h6d(k7dVar2, y8dVar);
                linkedHashMap.put(y8dVar, obj4);
            }
            y8dVar.e((h6d) obj4);
        }
        if (this.c == null || !vg0Var2.isEmpty()) {
            b();
            return;
        }
        Activity activity = k7dVar2.d;
        if (!k7dVar2.e && activity != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception unused) {
                    intent.toString();
                }
                ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : r4;
                lm5.a.getClass();
                Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundle2 = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : r4;
                if (bundle2 != null) {
                    E.putAll(bundle2);
                }
                if (intArray != null || intArray.length == 0) {
                    g7d i8 = k6dVar.i();
                    r = i8.r(new x6k(14, intent.getData(), intent.getAction(), intent.getType()), i8);
                    if (r != null) {
                        s6d s6dVar4 = r.a;
                        intArray = s6dVar4.d(null);
                        Bundle c3 = s6dVar4.c(r.b);
                        if (c3 != null) {
                            E.putAll(c3);
                        }
                        parcelableArrayList = null;
                    }
                }
                iArr = intArray;
                if (iArr != null && iArr.length != 0) {
                    k6dVar.getClass();
                    g7d g7dVar9 = k6dVar.c;
                    length = iArr.length;
                    g7d g7dVar10 = g7dVar9;
                    i = 0;
                    while (true) {
                        if (i < length) {
                            str = null;
                            break;
                        }
                        int i9 = iArr[i];
                        if (i == 0) {
                            g7d g7dVar11 = k6dVar.c;
                            g7dVar11.getClass();
                            h2 = g7dVar11.b.b == i9 ? k6dVar.c : null;
                        } else {
                            g7dVar10.getClass();
                            h2 = g7dVar10.g.h(i9);
                        }
                        if (h2 == null) {
                            int i10 = s6d.f;
                            str = l4a.q(k6dVar.a.c, i9);
                            break;
                        }
                        if (i != iArr.length - 1 && (h2 instanceof g7d)) {
                            while (true) {
                                g7dVar4 = (g7d) h2;
                                g7dVar4.getClass();
                                gtj gtjVar2 = g7dVar4.g;
                                if (!(gtjVar2.h(gtjVar2.b) instanceof g7d)) {
                                    break;
                                } else {
                                    h2 = gtjVar2.h(gtjVar2.b);
                                }
                            }
                            g7dVar10 = g7dVar4;
                        }
                        i++;
                    }
                    if (str != null) {
                        E.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                        int length3 = iArr.length;
                        Bundle[] bundleArr3 = new Bundle[length3];
                        for (int i11 = 0; i11 < length3; i11++) {
                            lm5.a.getClass();
                            Bundle E2 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            E2.putAll(E);
                            if (parcelableArrayList != null && (bundle3 = (Bundle) parcelableArrayList.get(i11)) != null) {
                                E2.putAll(bundle3);
                            }
                            bundleArr3[i11] = E2;
                        }
                        int flags = intent.getFlags();
                        int i12 = 268435456 & flags;
                        if (i12 != 0 && (flags & 32768) == 0) {
                            intent.addFlags(32768);
                            ica icaVar = new ica(k7dVar2.a);
                            icaVar.a(intent);
                            icaVar.c();
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                            return;
                        }
                        if (i12 != 0 ? z : false) {
                            if (!k6dVar.f.isEmpty()) {
                                g7d g7dVar12 = k6dVar.c;
                                g7dVar12.getClass();
                                k6dVar.m(g7dVar12.b.b, z, false);
                            }
                            int i13 = 0;
                            while (i13 < iArr.length) {
                                int i14 = iArr[i13];
                                int i15 = i13 + 1;
                                Bundle bundle8 = bundleArr3[i13];
                                s6d c4 = k6dVar.c(i14, null);
                                if (c4 == null) {
                                    int i16 = s6d.f;
                                    zzl.m(wt3.q("Deep Linking failed: destination ", l4a.q(fl5Var, i14), " cannot be found from the current destination "), k6dVar.f());
                                    return;
                                }
                                lsb lsbVar = new lsb(16, c4, k7dVar2);
                                v7d v7dVar = new v7d();
                                lsbVar.invoke(v7dVar);
                                t7d t7dVar = v7dVar.a;
                                t7dVar.a = false;
                                t7dVar.b = false;
                                int i17 = v7dVar.b;
                                boolean z4 = v7dVar.c;
                                boolean z5 = v7dVar.d;
                                t7dVar.c = i17;
                                t7dVar.d = z4;
                                t7dVar.e = z5;
                                k6dVar.k(c4, bundle8, t7dVar.a());
                                i13 = i15;
                            }
                            k7dVar2.e = true;
                            return;
                        }
                        g7d g7dVar13 = k6dVar.c;
                        int length4 = iArr.length;
                        int i18 = 0;
                        while (i18 < length4) {
                            int i19 = iArr[i18];
                            Bundle bundle9 = bundleArr3[i18];
                            if (i18 == 0) {
                                h = k6dVar.c;
                            } else {
                                g7dVar13.getClass();
                                h = g7dVar13.g.h(i19);
                            }
                            if (h == null) {
                                int i20 = s6d.f;
                                zzl.l("Deep Linking failed: destination ", l4a.q(fl5Var, i19), " cannot be found in graph ", g7dVar13);
                                return;
                            }
                            if (i18 == iArr.length - 1) {
                                g7d g7dVar14 = k6dVar.c;
                                g7dVar14.getClass();
                                i2 = length4;
                                i3 = i18;
                                k7dVar = k7dVar2;
                                bundleArr = bundleArr3;
                                iArr2 = iArr;
                                g7dVar2 = g7dVar13;
                                k6dVar.k(h, bundle9, new u7d(false, false, g7dVar14.b.b, true, false, 0, 0, -1, -1));
                            } else if (h instanceof g7d) {
                                while (true) {
                                    g7dVar3 = (g7d) h;
                                    g7dVar3.getClass();
                                    gtj gtjVar3 = g7dVar3.g;
                                    if (!(gtjVar3.h(gtjVar3.b) instanceof g7d)) {
                                        break;
                                    } else {
                                        h = gtjVar3.h(gtjVar3.b);
                                    }
                                }
                                k7dVar = k7dVar2;
                                iArr2 = iArr;
                                i2 = length4;
                                i3 = i18;
                                g7dVar13 = g7dVar3;
                                bundleArr = bundleArr3;
                                iArr = iArr2;
                                i18 = i3 + 1;
                                bundleArr3 = bundleArr;
                                k7dVar2 = k7dVar;
                                length4 = i2;
                            } else {
                                k7dVar = k7dVar2;
                                iArr2 = iArr;
                                g7dVar2 = g7dVar13;
                                i2 = length4;
                                i3 = i18;
                                bundleArr = bundleArr3;
                            }
                            g7dVar13 = g7dVar2;
                            iArr = iArr2;
                            i18 = i3 + 1;
                            bundleArr3 = bundleArr;
                            k7dVar2 = k7dVar;
                            length4 = i2;
                        }
                        k7dVar2.e = true;
                        return;
                    }
                    intent.toString();
                }
            }
            intArray = r4;
            if (extras == null) {
            }
            lm5.a.getClass();
            Bundle E3 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (extras == null) {
            }
            if (bundle2 != null) {
            }
            if (intArray != null) {
            }
            g7d i82 = k6dVar.i();
            r = i82.r(new x6k(14, intent.getData(), intent.getAction(), intent.getType()), i82);
            if (r != null) {
            }
            iArr = intArray;
            if (iArr != null) {
                k6dVar.getClass();
                g7d g7dVar92 = k6dVar.c;
                length = iArr.length;
                g7d g7dVar102 = g7dVar92;
                i = 0;
                while (true) {
                    if (i < length) {
                    }
                    i++;
                }
                if (str != null) {
                }
            }
        }
        g7d g7dVar15 = this.c;
        g7dVar15.getClass();
        k(g7dVar15, bundle, null);
    }

    public final void s(d6d d6dVar) {
        d6dVar.getClass();
        d6d d6dVar2 = (d6d) this.j.remove(d6dVar);
        if (d6dVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        dm0 dm0Var = (dm0) linkedHashMap.get(d6dVar2);
        Integer valueOf = dm0Var != null ? Integer.valueOf(dm0Var.a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            h6d h6dVar = (h6d) this.t.get(this.s.b(d6dVar2.b.a));
            if (h6dVar != null) {
                h6dVar.c(d6dVar2);
            }
            linkedHashMap.remove(d6dVar2);
        }
    }

    public final void t() {
        dm0 dm0Var;
        Set set;
        ArrayList U0 = CollectionsKt.U0(this.f);
        if (U0.isEmpty()) {
            return;
        }
        ArrayList l = b.l(((d6d) CollectionsKt.h0(U0)).b);
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.h0(l) instanceof x88) {
            Iterator it = CollectionsKt.B0(U0).iterator();
            while (it.hasNext()) {
                s6d s6dVar = ((d6d) it.next()).b;
                arrayList.add(s6dVar);
                if (!(s6dVar instanceof x88) && !(s6dVar instanceof g7d)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (d6d d6dVar : CollectionsKt.B0(U0)) {
            f6d f6dVar = d6dVar.h;
            e6b e6bVar = f6dVar.k;
            s6d s6dVar2 = d6dVar.b;
            s6d s6dVar3 = (s6d) CollectionsKt.firstOrNull(l);
            if (s6dVar3 != null && s6dVar3.b.b == s6dVar2.b.b) {
                e6b e6bVar2 = e6b.e;
                if (e6bVar != e6bVar2) {
                    h6d h6dVar = (h6d) this.t.get(this.s.b(d6dVar.b.a));
                    if (Intrinsics.c((h6dVar == null || (set = (Set) h6dVar.f.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(d6dVar)), Boolean.TRUE) || ((dm0Var = (dm0) this.k.get(d6dVar)) != null && dm0Var.a.get() == 0)) {
                        hashMap.put(d6dVar, e6b.d);
                    } else {
                        hashMap.put(d6dVar, e6bVar2);
                    }
                }
                s6d s6dVar4 = (s6d) CollectionsKt.firstOrNull(arrayList);
                if (s6dVar4 != null && s6dVar4.b.b == s6dVar2.b.b) {
                    o13.B(arrayList);
                }
                o13.B(l);
                g7d g7dVar = s6dVar2.c;
                if (g7dVar != null) {
                    l.add(g7dVar);
                }
            } else if (arrayList.isEmpty() || s6dVar2.b.b != ((s6d) CollectionsKt.Y(arrayList)).b.b) {
                f6dVar.k = e6b.c;
                f6dVar.b();
            } else {
                s6d s6dVar5 = (s6d) o13.B(arrayList);
                if (e6bVar == e6b.e) {
                    f6dVar.k = e6b.d;
                    f6dVar.b();
                } else {
                    e6b e6bVar3 = e6b.d;
                    if (e6bVar != e6bVar3) {
                        hashMap.put(d6dVar, e6bVar3);
                    }
                }
                g7d g7dVar2 = s6dVar5.c;
                if (g7dVar2 != null && !arrayList.contains(g7dVar2)) {
                    arrayList.add(g7dVar2);
                }
            }
        }
        Iterator it2 = U0.iterator();
        while (it2.hasNext()) {
            d6d d6dVar2 = (d6d) it2.next();
            e6b e6bVar4 = (e6b) hashMap.get(d6dVar2);
            if (e6bVar4 != null) {
                d6dVar2.getClass();
                f6d f6dVar2 = d6dVar2.h;
                f6dVar2.k = e6bVar4;
                f6dVar2.b();
            } else {
                d6dVar2.h.b();
            }
        }
    }
}
