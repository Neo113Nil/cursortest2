package b2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.c1;
import androidx.lifecycle.e0;
import androidx.lifecycle.o1;
import androidx.lifecycle.x;
import c0.m0;
import com.google.android.gms.internal.measurement.d5;
import hg.d1;
import hg.p0;
import hg.t0;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.collections.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import s.o;
import y1.a0;
import y1.b0;
import y1.d0;
import y1.i0;
import y1.p;
import y1.q;
import y1.r;
import y1.r0;
import y1.s;
import y1.u0;
import y1.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final y1.n f2987b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f2988c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f2989d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f2990e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.collections.l f2991f;

    /* renamed from: g, reason: collision with root package name */
    public final d1 f2992g;

    /* renamed from: h, reason: collision with root package name */
    public final d1 f2993h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f2994i;
    public final LinkedHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2995k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2996l;

    /* renamed from: m, reason: collision with root package name */
    public e0 f2997m;

    /* renamed from: n, reason: collision with root package name */
    public s f2998n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2999o;

    /* renamed from: p, reason: collision with root package name */
    public x f3000p;
    public final a2.e q;

    /* renamed from: r, reason: collision with root package name */
    public final u0 f3001r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f3002s;

    /* renamed from: t, reason: collision with root package name */
    public Function1 f3003t;

    /* renamed from: u, reason: collision with root package name */
    public h f3004u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f3005v;

    /* renamed from: w, reason: collision with root package name */
    public int f3006w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f3007x;

    /* renamed from: y, reason: collision with root package name */
    public final t0 f3008y;

    public j(r navController, y1.n updateOnBackPressedCallbackEnabledCallback) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(updateOnBackPressedCallbackEnabledCallback, "updateOnBackPressedCallbackEnabledCallback");
        this.f2986a = navController;
        this.f2987b = updateOnBackPressedCallbackEnabledCallback;
        this.f2991f = new kotlin.collections.l();
        kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
        this.f2992g = hg.u0.b(e0Var);
        this.f2993h = hg.u0.b(e0Var);
        this.f2994i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.f2995k = new LinkedHashMap();
        this.f2996l = new LinkedHashMap();
        this.f2999o = new ArrayList();
        this.f3000p = x.f2254b;
        this.q = new a2.e(1, this);
        this.f3001r = new u0();
        this.f3002s = new LinkedHashMap();
        this.f3005v = new LinkedHashMap();
        this.f3007x = new ArrayList();
        this.f3008y = hg.u0.a(1, 0, gg.a.f10049b);
    }

    public static b0 d(int i5, b0 destination, b0 b0Var, boolean z5) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.f25534b.f3017e == i5 && (b0Var == null || (Intrinsics.areEqual(destination, b0Var) && Intrinsics.areEqual(destination.f25535c, b0Var.f25535c)))) {
            return destination;
        }
        d0 d0Var = destination instanceof d0 ? (d0) destination : null;
        if (d0Var == null) {
            d0Var = destination.f25535c;
            Intrinsics.checkNotNull(d0Var);
        }
        return d0Var.f25543g.b(i5, d0Var, b0Var, z5);
    }

    public static /* synthetic */ void n(j jVar, y1.l lVar) {
        jVar.m(lVar, false, new kotlin.collections.l());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b0 b0Var, Bundle source, y1.l lVar, List list) {
        Bundle bundle;
        ListIterator listIterator;
        Object obj;
        y1.l lVar2;
        Object obj2;
        e eVar = this.f2986a.f25626c;
        b0 b0Var2 = lVar.f25583b;
        boolean z5 = b0Var2 instanceof y1.g;
        kotlin.collections.l lVar3 = this.f2991f;
        if (!z5) {
            while (!lVar3.isEmpty() && (((y1.l) lVar3.last()).f25583b instanceof y1.g) && l(((y1.l) lVar3.last()).f25583b.f25534b.f3017e, true, false)) {
            }
        }
        kotlin.collections.l lVar4 = new kotlin.collections.l();
        Object obj3 = null;
        if (b0Var instanceof d0) {
            b0 b0Var3 = b0Var2;
            do {
                Intrinsics.checkNotNull(b0Var3);
                b0Var3 = b0Var3.f25535c;
                if (b0Var3 != null) {
                    ListIterator listIterator2 = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator2.previous();
                            if (Intrinsics.areEqual(((y1.l) obj2).f25583b, b0Var3)) {
                                break;
                            }
                        }
                    }
                    y1.l lVar5 = (y1.l) obj2;
                    if (lVar5 == null) {
                        lVar5 = r0.a(eVar, b0Var3, source, h(), this.f2998n);
                    }
                    lVar4.addFirst(lVar5);
                    if (!lVar3.isEmpty() && ((y1.l) lVar3.last()).f25583b == b0Var3) {
                        n(this, (y1.l) lVar3.last());
                    }
                }
                if (b0Var3 == null) {
                    break;
                }
            } while (b0Var3 != b0Var);
        }
        b0 b0Var4 = lVar4.isEmpty() ? b0Var2 : ((y1.l) lVar4.first()).f25583b;
        while (b0Var4 != null && c(b0Var4.f25534b.f3017e, b0Var4) != b0Var4) {
            b0Var4 = b0Var4.f25535c;
            if (b0Var4 != null) {
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    if (source.isEmpty()) {
                        bundle = null;
                        listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                obj = null;
                                break;
                            } else {
                                obj = listIterator.previous();
                                if (Intrinsics.areEqual(((y1.l) obj).f25583b, b0Var4)) {
                                    break;
                                }
                            }
                        }
                        lVar2 = (y1.l) obj;
                        if (lVar2 == null) {
                            lVar2 = r0.a(eVar, b0Var4, b0Var4.a(bundle), h(), this.f2998n);
                        }
                        lVar4.addFirst(lVar2);
                    }
                }
                bundle = source;
                listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                    }
                }
                lVar2 = (y1.l) obj;
                if (lVar2 == null) {
                }
                lVar4.addFirst(lVar2);
            }
        }
        if (!lVar4.isEmpty()) {
            b0Var2 = ((y1.l) lVar4.first()).f25583b;
        }
        while (!lVar3.isEmpty() && (((y1.l) lVar3.last()).f25583b instanceof d0)) {
            b0 b0Var5 = ((y1.l) lVar3.last()).f25583b;
            Intrinsics.checkNotNull(b0Var5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((o) ((d0) b0Var5).f25543g.f3080c).d(b0Var2.f25534b.f3017e) != null) {
                break;
            } else {
                n(this, (y1.l) lVar3.last());
            }
        }
        y1.l lVar6 = (y1.l) lVar3.f();
        if (lVar6 == null) {
            lVar6 = (y1.l) lVar4.f();
        }
        if (!Intrinsics.areEqual(lVar6 != null ? lVar6.f25583b : null, this.f2988c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                b0 b0Var6 = ((y1.l) previous).f25583b;
                d0 d0Var = this.f2988c;
                Intrinsics.checkNotNull(d0Var);
                if (Intrinsics.areEqual(b0Var6, d0Var)) {
                    obj3 = previous;
                    break;
                }
            }
            y1.l lVar7 = (y1.l) obj3;
            if (lVar7 == null) {
                d0 d0Var2 = this.f2988c;
                Intrinsics.checkNotNull(d0Var2);
                d0 d0Var3 = this.f2988c;
                Intrinsics.checkNotNull(d0Var3);
                lVar7 = r0.a(eVar, d0Var2, d0Var3.a(source), h(), this.f2998n);
            }
            lVar4.addFirst(lVar7);
        }
        Iterator it = lVar4.iterator();
        while (it.hasNext()) {
            y1.l lVar8 = (y1.l) it.next();
            Object obj4 = this.f3002s.get(this.f3001r.b(lVar8.f25583b.f25533a));
            if (obj4 == null) {
                throw new IllegalStateException(d9.e.l(new StringBuilder("NavigatorBackStack for "), b0Var.f25533a, " should already be created").toString());
            }
            ((p) obj4).a(lVar8);
        }
        lVar3.addAll(lVar4);
        lVar3.addLast(lVar);
        Iterator it2 = CollectionsKt.O(lVar4, lVar).iterator();
        while (it2.hasNext()) {
            y1.l lVar9 = (y1.l) it2.next();
            d0 d0Var4 = lVar9.f25583b.f25535c;
            if (d0Var4 != null) {
                j(lVar9, e(d0Var4.f25534b.f3017e));
            }
        }
    }

    public final boolean b() {
        kotlin.collections.l lVar;
        while (true) {
            lVar = this.f2991f;
            if (lVar.isEmpty() || !(((y1.l) lVar.last()).f25583b instanceof d0)) {
                break;
            }
            n(this, (y1.l) lVar.last());
        }
        y1.l lVar2 = (y1.l) lVar.h();
        ArrayList arrayList = this.f3007x;
        if (lVar2 != null) {
            arrayList.add(lVar2);
        }
        this.f3006w++;
        s();
        int i5 = this.f3006w - 1;
        this.f3006w = i5;
        if (i5 == 0) {
            ArrayList X = CollectionsKt.X(arrayList);
            arrayList.clear();
            Iterator it = X.iterator();
            while (it.hasNext()) {
                y1.l lVar3 = (y1.l) it.next();
                for (q qVar : CollectionsKt.W(this.f2999o)) {
                    b0 b0Var = lVar3.f25583b;
                    lVar3.f25589h.a();
                    qVar.a(this.f2986a, b0Var);
                }
                this.f3008y.b(lVar3);
            }
            ArrayList X2 = CollectionsKt.X(lVar);
            d1 d1Var = this.f2992g;
            d1Var.getClass();
            d1Var.k(null, X2);
            ArrayList o3 = o();
            d1 d1Var2 = this.f2993h;
            d1Var2.getClass();
            d1Var2.k(null, o3);
        }
        return lVar2 != null;
    }

    public final b0 c(int i5, b0 b0Var) {
        b0 b0Var2;
        d0 d0Var = this.f2988c;
        if (d0Var == null) {
            return null;
        }
        Intrinsics.checkNotNull(d0Var);
        if (d0Var.f25534b.f3017e == i5) {
            if (b0Var == null) {
                return this.f2988c;
            }
            if (Intrinsics.areEqual(this.f2988c, b0Var) && b0Var.f25535c == null) {
                return this.f2988c;
            }
        }
        y1.l lVar = (y1.l) this.f2991f.h();
        if (lVar == null || (b0Var2 = lVar.f25583b) == null) {
            b0Var2 = this.f2988c;
            Intrinsics.checkNotNull(b0Var2);
        }
        return d(i5, b0Var2, b0Var, false);
    }

    public final y1.l e(int i5) {
        Object obj;
        kotlin.collections.l lVar = this.f2991f;
        ListIterator<E> listIterator = lVar.listIterator(lVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((y1.l) obj).f25583b.f25534b.f3017e == i5) {
                break;
            }
        }
        y1.l lVar2 = (y1.l) obj;
        if (lVar2 != null) {
            return lVar2;
        }
        StringBuilder r5 = c1.r(i5, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        r5.append(f());
        throw new IllegalArgumentException(r5.toString().toString());
    }

    public final b0 f() {
        y1.l lVar = (y1.l) this.f2991f.h();
        if (lVar != null) {
            return lVar.f25583b;
        }
        return null;
    }

    public final d0 g() {
        d0 d0Var = this.f2988c;
        if (d0Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.checkNotNull(d0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return d0Var;
    }

    public final x h() {
        return this.f2997m == null ? x.f2255c : this.f3000p;
    }

    public final d0 i() {
        b0 b0Var;
        y1.l lVar = (y1.l) this.f2991f.h();
        if (lVar == null || (b0Var = lVar.f25583b) == null) {
            b0Var = this.f2988c;
            Intrinsics.checkNotNull(b0Var);
        }
        d0 d0Var = b0Var instanceof d0 ? (d0) b0Var : null;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = b0Var.f25535c;
        Intrinsics.checkNotNull(d0Var2);
        return d0Var2;
    }

    public final void j(y1.l child, y1.l parent) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f2994i.put(child, parent);
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap.get(parent) == null) {
            linkedHashMap.put(parent, new a());
        }
        Object obj = linkedHashMap.get(parent);
        Intrinsics.checkNotNull(obj);
        ((a) obj).f2953a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, r1) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
    
        r1 = new kotlin.collections.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (kotlin.collections.u.e(r12) < r14) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
    
        r10 = (y1.l) kotlin.collections.z.s(r12);
        r(r10);
        r18 = r10.f25583b.a(r27);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "entry");
        r24 = r0;
        r15 = new y1.l(r10.f25582a, r10.f25583b, r18, r10.f25585d, r10.f25586e, r10.f25587f, r10.f25588g);
        r0 = r10.f25585d;
        r8 = r15.f25589h;
        r8.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "<set-?>");
        r8.f2959d = r0;
        r0 = r10.f25589h.f2965k;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "maxState");
        r8.f2965k = r0;
        r8.b();
        r1.addFirst(r15);
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016f, code lost:
    
        r24 = r0;
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
    
        if (r0.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017b, code lost:
    
        r2 = (y1.l) r0.next();
        r8 = r2.f25583b.f25535c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0185, code lost:
    
        if (r8 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        j(r2, e(r8.f25534b.f3017e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0192, code lost:
    
        r12.addLast(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0196, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019e, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a0, code lost:
    
        r1 = (y1.l) r0.next();
        r11.b(r1.f25583b.f25533a).f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010a, code lost:
    
        if (r10.f3017e == r1.f25534b.f3017e) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0208 A[LOOP:1: B:19:0x0202->B:21:0x0208, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(b0 node, Bundle bundle, i0 i0Var) {
        boolean z5;
        m mVar;
        Ref.BooleanRef booleanRef;
        boolean z7;
        Ref.BooleanRef booleanRef2;
        ListIterator listIterator;
        int i5;
        Iterator it;
        Intrinsics.checkNotNullParameter(node, "node");
        LinkedHashMap linkedHashMap = this.f3002s;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f25603d = true;
        }
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        if (i0Var != null) {
            boolean z10 = i0Var.f25566e;
            boolean z11 = i0Var.f25565d;
            int i10 = i0Var.f25564c;
            if (i10 != -1) {
                z5 = l(i10, z11, z10);
                Bundle a7 = node.a(bundle);
                mVar = node.f25534b;
                if (i0Var != null && i0Var.f25563b) {
                    if (this.f2995k.containsKey(Integer.valueOf(mVar.f3017e))) {
                        booleanRef3.element = p(mVar.f3017e, a7, i0Var);
                        booleanRef2 = booleanRef3;
                        z7 = false;
                        this.f2987b.invoke();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((p) it.next()).f25603d = false;
                        }
                        if (!z5 || booleanRef2.element || z7) {
                            b();
                        } else {
                            s();
                            return;
                        }
                    }
                }
                u0 u0Var = this.f3001r;
                if (i0Var != null && i0Var.f25562a) {
                    kotlin.collections.l lVar = this.f2991f;
                    y1.l lVar2 = (y1.l) lVar.h();
                    listIterator = lVar.listIterator(lVar.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i5 = -1;
                            break;
                        } else if (((y1.l) listIterator.previous()).f25583b == node) {
                            i5 = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i5 != -1) {
                        if (node instanceof d0) {
                            int i11 = d0.f25542h;
                            d0 d0Var = (d0) node;
                            Intrinsics.checkNotNullParameter(d0Var, "<this>");
                            List h10 = bg.q.h(bg.q.f(bg.n.b(new ub.b(13), d0Var), new a2.j(4)));
                            if (lVar.f19213c - i5 == h10.size()) {
                                List subList = lVar.subList(i5, lVar.f19213c);
                                ArrayList arrayList = new ArrayList(v.k(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Integer.valueOf(((y1.l) it3.next()).f25583b.f25534b.f3017e));
                                }
                            }
                        } else if (lVar2 != null) {
                            b0 b0Var = lVar2.f25583b;
                            if (b0Var != null) {
                            }
                        }
                        if (z7) {
                            booleanRef2 = booleanRef;
                        } else {
                            y1.l a10 = r0.a(this.f2986a.f25626c, node, a7, h(), this.f2998n);
                            y1.t0 navigator = u0Var.b(node.f25533a);
                            List entries = t.c(a10);
                            booleanRef2 = booleanRef;
                            f handler = new f(0, booleanRef2, this, node, a7);
                            Intrinsics.checkNotNullParameter(navigator, "navigator");
                            Intrinsics.checkNotNullParameter(entries, "entries");
                            Intrinsics.checkNotNullParameter(handler, "handler");
                            this.f3003t = handler;
                            navigator.d(entries, i0Var);
                            this.f3003t = null;
                        }
                        this.f2987b.invoke();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        if (z5) {
                        }
                        b();
                    }
                }
                booleanRef = booleanRef3;
                z7 = false;
                if (z7) {
                }
                this.f2987b.invoke();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                }
                if (z5) {
                }
                b();
            }
        }
        z5 = false;
        Bundle a72 = node.a(bundle);
        mVar = node.f25534b;
        if (i0Var != null) {
            if (this.f2995k.containsKey(Integer.valueOf(mVar.f3017e))) {
            }
        }
        u0 u0Var2 = this.f3001r;
        if (i0Var != null) {
            kotlin.collections.l lVar3 = this.f2991f;
            y1.l lVar22 = (y1.l) lVar3.h();
            listIterator = lVar3.listIterator(lVar3.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i5 != -1) {
            }
        }
        booleanRef = booleanRef3;
        z7 = false;
        if (z7) {
        }
        this.f2987b.invoke();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z5) {
        }
        b();
    }

    public final boolean l(int i5, boolean z5, boolean z7) {
        b0 foundDestination;
        j jVar;
        boolean z10;
        kotlin.collections.l lVar = this.f2991f;
        final int i10 = 0;
        if (lVar.isEmpty()) {
            return false;
        }
        ArrayList popOperations = new ArrayList();
        Iterator it = CollectionsKt.P(lVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                foundDestination = null;
                break;
            }
            foundDestination = ((y1.l) it.next()).f25583b;
            String str = foundDestination.f25533a;
            m mVar = foundDestination.f25534b;
            y1.t0 b10 = this.f3001r.b(str);
            if (z5 || mVar.f3017e != i5) {
                popOperations.add(b10);
            }
            if (mVar.f3017e == i5) {
                break;
            }
        }
        if (foundDestination == null) {
            int i11 = b0.f25532f;
            String message = "Ignoring popBackStack to destination " + z.a(this.f2986a.f25626c, i5) + " as it was not found on the current back stack";
            Intrinsics.checkNotNullParameter("NavController", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Log.i("NavController", message);
            return false;
        }
        Intrinsics.checkNotNullParameter(popOperations, "popOperations");
        Intrinsics.checkNotNullParameter(foundDestination, "foundDestination");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        kotlin.collections.l lVar2 = new kotlin.collections.l();
        Iterator it2 = popOperations.iterator();
        while (true) {
            if (!it2.hasNext()) {
                jVar = this;
                z10 = z7;
                break;
            }
            y1.t0 navigator = (y1.t0) it2.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            y1.l popUpTo = (y1.l) lVar.last();
            jVar = this;
            z10 = z7;
            h handler = new h(booleanRef2, booleanRef, jVar, z10, lVar2);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Intrinsics.checkNotNullParameter(handler, "handler");
            jVar.f3004u = handler;
            navigator.i(popUpTo, z10);
            jVar.f3004u = null;
            if (!booleanRef2.element) {
                break;
            }
            z7 = z10;
        }
        if (z10) {
            LinkedHashMap linkedHashMap = jVar.f2995k;
            if (!z5) {
                Sequence b11 = bg.n.b(new a2.j(6), foundDestination);
                Function1 predicate = new Function1(this) { // from class: b2.i

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ j f2985b;

                    {
                        this.f2985b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        b0 destination = (b0) obj;
                        switch (i10) {
                            case 0:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                containsKey = this.f2985b.f2995k.containsKey(Integer.valueOf(destination.f25534b.f3017e));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                containsKey = this.f2985b.f2995k.containsKey(Integer.valueOf(destination.f25534b.f3017e));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                };
                Intrinsics.checkNotNullParameter(b11, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                bg.f fVar = new bg.f(new bg.r(b11, predicate, 0));
                while (fVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((b0) fVar.next()).f25534b.f3017e);
                    y1.m mVar2 = (y1.m) lVar2.f();
                    linkedHashMap.put(valueOf, mVar2 != null ? (String) mVar2.f25591a.f3079b : null);
                }
            }
            if (!lVar2.isEmpty()) {
                b6.p pVar = ((y1.m) lVar2.first()).f25591a;
                Sequence b12 = bg.n.b(new a2.j(7), c(pVar.f3078a, null));
                final int i12 = 1;
                Function1 predicate2 = new Function1(this) { // from class: b2.i

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ j f2985b;

                    {
                        this.f2985b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        b0 destination = (b0) obj;
                        switch (i12) {
                            case 0:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                containsKey = this.f2985b.f2995k.containsKey(Integer.valueOf(destination.f25534b.f3017e));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                containsKey = this.f2985b.f2995k.containsKey(Integer.valueOf(destination.f25534b.f3017e));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                };
                Intrinsics.checkNotNullParameter(b12, "<this>");
                Intrinsics.checkNotNullParameter(predicate2, "predicate");
                bg.f fVar2 = new bg.f(new bg.r(b12, predicate2, 0));
                while (fVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((b0) fVar2.next()).f25534b.f3017e), (String) pVar.f3079b);
                }
                if (linkedHashMap.values().contains((String) pVar.f3079b)) {
                    jVar.f2996l.put((String) pVar.f3079b, lVar2);
                }
            }
        }
        jVar.f2987b.invoke();
        return booleanRef.element;
    }

    public final void m(y1.l popUpTo, boolean z5, kotlin.collections.l savedState) {
        s sVar;
        p0 p0Var;
        Set set;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        kotlin.collections.l lVar = this.f2991f;
        y1.l lVar2 = (y1.l) lVar.last();
        if (!Intrinsics.areEqual(lVar2, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f25583b + ", which is not the top of the back stack (" + lVar2.f25583b + ')').toString());
        }
        kotlin.collections.z.s(lVar);
        p pVar = (p) this.f3002s.get(this.f3001r.b(lVar2.f25583b.f25533a));
        boolean z7 = true;
        if ((pVar == null || (p0Var = pVar.f25605f) == null || (set = (Set) p0Var.f10742a.getValue()) == null || !set.contains(lVar2)) && !this.j.containsKey(lVar2)) {
            z7 = false;
        }
        x xVar = lVar2.f25589h.j.f2169d;
        x xVar2 = x.f2255c;
        if (xVar.a(xVar2)) {
            if (z5) {
                lVar2.a(xVar2);
                savedState.addFirst(new y1.m(lVar2));
            }
            if (z7) {
                lVar2.a(xVar2);
            } else {
                lVar2.a(x.f2253a);
                r(lVar2);
            }
        }
        if (z5 || z7 || (sVar = this.f2998n) == null) {
            return;
        }
        String backStackEntryId = lVar2.f25587f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        o1 o1Var = (o1) sVar.f25632b.remove(backStackEntryId);
        if (o1Var != null) {
            o1Var.a();
        }
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3002s.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((p) it.next()).f25605f.f10742a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                y1.l lVar = (y1.l) obj;
                if (!arrayList.contains(lVar) && !lVar.f25589h.f2965k.a(x.f2256d)) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.z.n(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f2991f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            y1.l lVar2 = (y1.l) next;
            if (!arrayList.contains(lVar2) && lVar2.f25589h.f2965k.a(x.f2256d)) {
                arrayList3.add(next);
            }
        }
        kotlin.collections.z.n(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((y1.l) next2).f25583b instanceof d0)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean p(int i5, Bundle bundle, i0 i0Var) {
        b0 g10;
        y1.l lVar;
        b0 b0Var;
        Integer valueOf = Integer.valueOf(i5);
        LinkedHashMap linkedHashMap = this.f2995k;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i5));
        Collection values = linkedHashMap.values();
        a2.k predicate = new a2.k(str, 1);
        Intrinsics.checkNotNullParameter(values, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.collections.z.p(values, predicate, true);
        kotlin.collections.l lVar2 = (kotlin.collections.l) TypeIntrinsics.asMutableMap(this.f2996l).remove(str);
        e eVar = this.f2986a.f25626c;
        final ArrayList arrayList = new ArrayList();
        y1.l lVar3 = (y1.l) this.f2991f.h();
        if (lVar3 == null || (g10 = lVar3.f25583b) == null) {
            g10 = g();
        }
        if (lVar2 != null) {
            Iterator it = lVar2.iterator();
            while (it.hasNext()) {
                y1.m mVar = (y1.m) it.next();
                b0 d10 = d(mVar.f25591a.f3078a, g10, null, true);
                if (d10 == null) {
                    int i10 = b0.f25532f;
                    throw new IllegalStateException(("Restore State failed: destination " + z.a(eVar, mVar.f25591a.f3078a) + " cannot be found from the current destination " + g10).toString());
                }
                arrayList.add(mVar.a(eVar, d10, h(), this.f2998n));
                g10 = d10;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((y1.l) next).f25583b instanceof d0)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            y1.l lVar4 = (y1.l) it3.next();
            List list = (List) CollectionsKt.L(arrayList2);
            if (Intrinsics.areEqual((list == null || (lVar = (y1.l) CollectionsKt.K(list)) == null || (b0Var = lVar.f25583b) == null) ? null : b0Var.f25533a, lVar4.f25583b.f25533a)) {
                list.add(lVar4);
            } else {
                arrayList2.add(u.g(lVar4));
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List entries = (List) it4.next();
            y1.t0 navigator = this.f3001r.b(((y1.l) CollectionsKt.F(entries)).f25583b.f25533a);
            final Ref.IntRef intRef = new Ref.IntRef();
            final Bundle bundle2 = bundle;
            Function1 handler = new Function1() { // from class: b2.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List list2;
                    y1.l entry = (y1.l) obj;
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    Ref.BooleanRef.this.element = true;
                    ArrayList arrayList4 = arrayList;
                    int indexOf = arrayList4.indexOf(entry);
                    if (indexOf != -1) {
                        Ref.IntRef intRef2 = intRef;
                        int i11 = indexOf + 1;
                        list2 = arrayList4.subList(intRef2.element, i11);
                        intRef2.element = i11;
                    } else {
                        list2 = kotlin.collections.e0.f19204a;
                    }
                    this.a(entry.f25583b, bundle2, entry, list2);
                    return Unit.f19194a;
                }
            };
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(entries, "entries");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f3003t = handler;
            navigator.d(entries, i0Var);
            this.f3003t = null;
            bundle = bundle2;
        }
        return booleanRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x030b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(d0 graph, Bundle bundle) {
        boolean z5;
        int[] intArray;
        ArrayList parcelableArrayList;
        Bundle from;
        int[] iArr;
        ArrayList arrayList;
        String str;
        a0 j;
        int[] deepLink;
        ArrayList arrayList2;
        int length;
        int i5;
        String str2;
        b0 i10;
        int i11;
        Bundle[] bundleArr;
        int[] iArr2;
        r rVar;
        int i12;
        e eVar;
        d0 d0Var;
        Bundle from2;
        int i13;
        b0 i14;
        d0 d0Var2;
        b6.p pVar = graph.f25543g;
        Intrinsics.checkNotNullParameter(graph, "graph");
        kotlin.collections.l lVar = this.f2991f;
        if (!lVar.isEmpty() && h() == x.f2253a) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (Intrinsics.areEqual(this.f2988c, graph)) {
            int g10 = ((o) pVar.f3080c).g();
            for (int i15 = 0; i15 < g10; i15++) {
                b0 b0Var = (b0) ((o) pVar.f3080c).h(i15);
                d0 d0Var3 = this.f2988c;
                Intrinsics.checkNotNull(d0Var3);
                int e7 = ((o) d0Var3.f25543g.f3080c).e(i15);
                d0 d0Var4 = this.f2988c;
                Intrinsics.checkNotNull(d0Var4);
                o oVar = (o) d0Var4.f25543g.f3080c;
                if (oVar.f22576a) {
                    s.k.a(oVar);
                }
                int a7 = t.a.a(oVar.f22579d, e7, oVar.f22577b);
                if (a7 >= 0) {
                    Object[] objArr = oVar.f22578c;
                    Object obj = objArr[a7];
                    objArr[a7] = b0Var;
                }
            }
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                y1.l lVar2 = (y1.l) it.next();
                int i16 = b0.f25532f;
                b0 b0Var2 = lVar2.f25583b;
                Intrinsics.checkNotNullParameter(b0Var2, "<this>");
                kotlin.collections.t0 v5 = kotlin.collections.a0.v(bg.q.h(bg.n.b(new ub.b(12), b0Var2)));
                b0 b0Var3 = this.f2988c;
                Intrinsics.checkNotNull(b0Var3);
                Iterator it2 = v5.iterator();
                while (true) {
                    ListIterator listIterator = ((s0) it2).f19217a;
                    if (listIterator.hasPrevious()) {
                        b0 b0Var4 = (b0) listIterator.previous();
                        if (!Intrinsics.areEqual(b0Var4, this.f2988c) || !Intrinsics.areEqual(b0Var3, graph)) {
                            if (b0Var3 instanceof d0) {
                                b0Var3 = ((d0) b0Var3).i(b0Var4.f25534b.f3017e);
                                Intrinsics.checkNotNull(b0Var3);
                            }
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(b0Var3, "<set-?>");
                lVar2.f25583b = b0Var3;
            }
            return;
        }
        d0 d0Var5 = this.f2988c;
        LinkedHashMap linkedHashMap = this.f3002s;
        if (d0Var5 != null) {
            Iterator it3 = new ArrayList(this.f2995k.keySet()).iterator();
            while (it3.hasNext()) {
                Integer num = (Integer) it3.next();
                Intrinsics.checkNotNull(num);
                int intValue = num.intValue();
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((p) it4.next()).f25603d = true;
                }
                boolean p10 = p(intValue, null, ci.c.M(new a2.j(5)));
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    ((p) it5.next()).f25603d = false;
                }
                if (p10) {
                    l(intValue, true, false);
                }
            }
            l(d0Var5.f25534b.f3017e, true, false);
        }
        this.f2988c = graph;
        r rVar2 = this.f2986a;
        j jVar = rVar2.f25625b;
        e eVar2 = rVar2.f25626c;
        Bundle source = this.f2989d;
        u0 u0Var = this.f3001r;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter("android-support-nav:controller:navigatorState:names", "key");
            if (source.containsKey("android-support-nav:controller:navigatorState:names")) {
                Intrinsics.checkNotNullParameter("android-support-nav:controller:navigatorState:names", "key");
                ArrayList<String> stringArrayList = source.getStringArrayList("android-support-nav:controller:navigatorState:names");
                if (stringArrayList == null) {
                    com.google.android.play.core.appupdate.b.v("android-support-nav:controller:navigatorState:names");
                    throw null;
                }
                for (String key : stringArrayList) {
                    y1.t0 b10 = u0Var.b(key);
                    Intrinsics.checkNotNullParameter(key, "key");
                    if (source.containsKey(key)) {
                        b10.g(d5.x(source, key));
                    }
                }
            }
        }
        Bundle[] bundleArr2 = this.f2990e;
        if (bundleArr2 != null) {
            int length2 = bundleArr2.length;
            z5 = true;
            int i17 = 0;
            while (i17 < length2) {
                y1.m mVar = new y1.m(bundleArr2[i17]);
                b6.p pVar2 = mVar.f25591a;
                Bundle[] bundleArr3 = bundleArr2;
                int i18 = i17;
                b0 c2 = c(pVar2.f3078a, null);
                if (c2 == null) {
                    int i19 = b0.f25532f;
                    StringBuilder p11 = d9.e.p("Restoring the Navigation back stack failed: destination ", z.a(eVar2, pVar2.f3078a), " cannot be found from the current destination ");
                    p11.append(f());
                    throw new IllegalStateException(p11.toString());
                }
                y1.l a10 = mVar.a(eVar2, c2, h(), this.f2998n);
                y1.t0 navigator = u0Var.b(c2.f25533a);
                Object obj2 = linkedHashMap.get(navigator);
                if (obj2 == null) {
                    Intrinsics.checkNotNullParameter(navigator, "navigator");
                    obj2 = new p(rVar2, navigator);
                    linkedHashMap.put(navigator, obj2);
                }
                lVar.addLast(a10);
                ((p) obj2).a(a10);
                d0 d0Var6 = a10.f25583b.f25535c;
                if (d0Var6 != null) {
                    j(a10, e(d0Var6.f25534b.f3017e));
                }
                i17 = i18 + 1;
                bundleArr2 = bundleArr3;
            }
            this.f2987b.invoke();
            this.f2990e = null;
        } else {
            z5 = true;
        }
        Collection values = n0.i(u0Var.f25639a).values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : values) {
            if (!((y1.t0) obj3).f25635b) {
                arrayList3.add(obj3);
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            y1.t0 navigator2 = (y1.t0) it6.next();
            Object obj4 = linkedHashMap.get(navigator2);
            if (obj4 == null) {
                Intrinsics.checkNotNullParameter(navigator2, "navigator");
                obj4 = new p(rVar2, navigator2);
                linkedHashMap.put(navigator2, obj4);
            }
            navigator2.e((p) obj4);
        }
        if (this.f2988c == null || !lVar.isEmpty()) {
            b();
            return;
        }
        Activity activity = rVar2.f25627d;
        if (!rVar2.f25628e && activity != null) {
            Intrinsics.checkNotNull(activity);
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    try {
                        intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    } catch (Exception e9) {
                        w0.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e9);
                    }
                    parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                    n0.c().getClass();
                    Bundle source2 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source2, "source");
                    from = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                    if (from != null) {
                        Intrinsics.checkNotNullParameter(source2, "source");
                        Intrinsics.checkNotNullParameter(from, "from");
                        source2.putAll(from);
                    }
                    if (intArray != null || intArray.length == 0) {
                        d0 i20 = jVar.i();
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        iArr = intArray;
                        arrayList = parcelableArrayList;
                        str = " cannot be found from the current destination ";
                        j = i20.j(new kh.g(intent.getData(), intent.getAction(), intent.getType(), 14), i20);
                        if (j != null) {
                            b0 b0Var5 = j.f25524a;
                            int[] c8 = b0Var5.c(null);
                            Bundle from3 = b0Var5.a(j.f25525b);
                            if (from3 != null) {
                                Intrinsics.checkNotNullParameter(source2, "source");
                                Intrinsics.checkNotNullParameter(from3, "from");
                                source2.putAll(from3);
                            }
                            deepLink = c8;
                            arrayList2 = null;
                            if (deepLink != null && deepLink.length != 0) {
                                jVar.getClass();
                                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                                d0 d0Var7 = jVar.f2988c;
                                length = deepLink.length;
                                i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        str2 = null;
                                        break;
                                    }
                                    int i21 = deepLink[i5];
                                    if (i5 == 0) {
                                        i13 = length;
                                        d0 d0Var8 = jVar.f2988c;
                                        Intrinsics.checkNotNull(d0Var8);
                                        i14 = d0Var8.f25534b.f3017e == i21 ? jVar.f2988c : null;
                                    } else {
                                        i13 = length;
                                        Intrinsics.checkNotNull(d0Var7);
                                        i14 = d0Var7.i(i21);
                                    }
                                    if (i14 == null) {
                                        int i22 = b0.f25532f;
                                        str2 = z.a(jVar.f2986a.f25626c, i21);
                                        break;
                                    }
                                    if (i5 != deepLink.length - 1 && (i14 instanceof d0)) {
                                        while (true) {
                                            d0Var2 = (d0) i14;
                                            Intrinsics.checkNotNull(d0Var2);
                                            if (!(d0Var2.i(d0Var2.f25543g.f3078a) instanceof d0)) {
                                                break;
                                            } else {
                                                i14 = d0Var2.i(d0Var2.f25543g.f3078a);
                                            }
                                        }
                                        d0Var7 = d0Var2;
                                    }
                                    i5++;
                                    length = i13;
                                }
                                if (str2 != null) {
                                    Intrinsics.checkNotNullParameter(source2, "source");
                                    Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkIntent", "key");
                                    Intrinsics.checkNotNullParameter(intent, "value");
                                    source2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                    int length3 = deepLink.length;
                                    Bundle[] bundleArr4 = new Bundle[length3];
                                    for (int i23 = 0; i23 < length3; i23++) {
                                        n0.c().getClass();
                                        Bundle source3 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                        Intrinsics.checkNotNullParameter(source3, "source");
                                        Intrinsics.checkNotNullParameter(source2, "from");
                                        source3.putAll(source2);
                                        if (arrayList2 != null && (from2 = (Bundle) arrayList2.get(i23)) != null) {
                                            Intrinsics.checkNotNullParameter(from2, "from");
                                            source3.putAll(from2);
                                        }
                                        bundleArr4[i23] = source3;
                                    }
                                    int flags = intent.getFlags();
                                    int i24 = 268435456 & flags;
                                    if (i24 != 0 && (flags & 32768) == 0) {
                                        intent.addFlags(32768);
                                        m0 m0Var = new m0(rVar2.f25624a);
                                        ComponentName component = intent.getComponent();
                                        if (component == null) {
                                            component = intent.resolveActivity(m0Var.f3285b.getPackageManager());
                                        }
                                        if (component != null) {
                                            m0Var.a(component);
                                        }
                                        m0Var.f3284a.add(intent);
                                        Intrinsics.checkNotNullExpressionValue(m0Var, "addNextIntentWithParentStack(...)");
                                        m0Var.b();
                                        activity.finish();
                                        activity.overridePendingTransition(0, 0);
                                    } else if (i24 != 0 ? z5 : false) {
                                        if (!jVar.f2991f.isEmpty()) {
                                            d0 d0Var9 = jVar.f2988c;
                                            Intrinsics.checkNotNull(d0Var9);
                                            jVar.l(d0Var9.f25534b.f3017e, z5, false);
                                        }
                                        int i25 = 0;
                                        while (i25 < deepLink.length) {
                                            int i26 = deepLink[i25];
                                            int i27 = i25 + 1;
                                            Bundle bundle2 = bundleArr4[i25];
                                            b0 c10 = jVar.c(i26, null);
                                            if (c10 == null) {
                                                int i28 = b0.f25532f;
                                                StringBuilder p12 = d9.e.p("Deep Linking failed: destination ", z.a(eVar2, i26), str);
                                                p12.append(jVar.f());
                                                throw new IllegalStateException(p12.toString());
                                            }
                                            jVar.k(c10, bundle2, ci.c.M(new fg.d(18, c10, rVar2)));
                                            i25 = i27;
                                        }
                                        rVar2.f25628e = true;
                                    } else {
                                        d0 d0Var10 = jVar.f2988c;
                                        int length4 = deepLink.length;
                                        int i29 = 0;
                                        while (i29 < length4) {
                                            int i30 = deepLink[i29];
                                            Bundle bundle3 = bundleArr4[i29];
                                            if (i29 == 0) {
                                                i10 = jVar.f2988c;
                                            } else {
                                                Intrinsics.checkNotNull(d0Var10);
                                                i10 = d0Var10.i(i30);
                                            }
                                            if (i10 == null) {
                                                int i31 = b0.f25532f;
                                                throw new IllegalStateException("Deep Linking failed: destination " + z.a(eVar2, i30) + " cannot be found in graph " + d0Var10);
                                            }
                                            if (i29 != deepLink.length - 1) {
                                                if (i10 instanceof d0) {
                                                    while (true) {
                                                        d0Var = (d0) i10;
                                                        Intrinsics.checkNotNull(d0Var);
                                                        if (!(d0Var.i(d0Var.f25543g.f3078a) instanceof d0)) {
                                                            break;
                                                        } else {
                                                            i10 = d0Var.i(d0Var.f25543g.f3078a);
                                                        }
                                                    }
                                                    rVar = rVar2;
                                                    i12 = length4;
                                                    i11 = i29;
                                                    eVar = eVar2;
                                                    bundleArr = bundleArr4;
                                                    d0Var10 = d0Var;
                                                } else {
                                                    rVar = rVar2;
                                                    i12 = length4;
                                                    i11 = i29;
                                                    eVar = eVar2;
                                                    bundleArr = bundleArr4;
                                                }
                                                iArr2 = deepLink;
                                            } else {
                                                d0 d0Var11 = jVar.f2988c;
                                                Intrinsics.checkNotNull(d0Var11);
                                                i11 = i29;
                                                bundleArr = bundleArr4;
                                                iArr2 = deepLink;
                                                rVar = rVar2;
                                                i12 = length4;
                                                eVar = eVar2;
                                                jVar.k(i10, bundle3, new i0(false, false, d0Var11.f25534b.f3017e, true, false, 0, 0, -1, -1));
                                            }
                                            i29 = i11 + 1;
                                            eVar2 = eVar;
                                            deepLink = iArr2;
                                            rVar2 = rVar;
                                            bundleArr4 = bundleArr;
                                            length4 = i12;
                                        }
                                        rVar2.f25628e = true;
                                    }
                                    return;
                                }
                                String message = "Could not find destination " + str2 + " in the navigation graph, ignoring the deep link from " + intent;
                                Intrinsics.checkNotNullParameter("NavController", "tag");
                                Intrinsics.checkNotNullParameter(message, "message");
                                Log.i("NavController", message);
                            }
                        }
                    } else {
                        iArr = intArray;
                        arrayList = parcelableArrayList;
                        str = " cannot be found from the current destination ";
                    }
                    deepLink = iArr;
                    arrayList2 = arrayList;
                    if (deepLink != null) {
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                        d0 d0Var72 = jVar.f2988c;
                        length = deepLink.length;
                        i5 = 0;
                        while (true) {
                            if (i5 < length) {
                            }
                            i5++;
                            length = i13;
                        }
                        if (str2 != null) {
                        }
                    }
                }
                intArray = null;
                if (extras == null) {
                }
                n0.c().getClass();
                Bundle source22 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source22, "source");
                if (extras == null) {
                }
                if (from != null) {
                }
                if (intArray != null) {
                }
                d0 i202 = jVar.i();
                Intrinsics.checkNotNullParameter(intent, "intent");
                iArr = intArray;
                arrayList = parcelableArrayList;
                str = " cannot be found from the current destination ";
                j = i202.j(new kh.g(intent.getData(), intent.getAction(), intent.getType(), 14), i202);
                if (j != null) {
                }
                deepLink = iArr;
                arrayList2 = arrayList;
                if (deepLink != null) {
                }
            }
        }
        d0 d0Var12 = this.f2988c;
        Intrinsics.checkNotNull(d0Var12);
        k(d0Var12, bundle, null);
    }

    public final void r(y1.l child) {
        Intrinsics.checkNotNullParameter(child, "child");
        y1.l lVar = (y1.l) this.f2994i.remove(child);
        if (lVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.j;
        a aVar = (a) linkedHashMap.get(lVar);
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f2953a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            p pVar = (p) this.f3002s.get(this.f3001r.b(lVar.f25583b.f25533a));
            if (pVar != null) {
                pVar.c(lVar);
            }
            linkedHashMap.remove(lVar);
        }
    }

    public final void s() {
        a aVar;
        p0 p0Var;
        Set set;
        ArrayList X = CollectionsKt.X(this.f2991f);
        if (X.isEmpty()) {
            return;
        }
        ArrayList g10 = u.g(((y1.l) CollectionsKt.K(X)).f25583b);
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.K(g10) instanceof y1.g) {
            Iterator it = CollectionsKt.P(X).iterator();
            while (it.hasNext()) {
                b0 b0Var = ((y1.l) it.next()).f25583b;
                arrayList.add(b0Var);
                if (!(b0Var instanceof y1.g) && !(b0Var instanceof d0)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (y1.l lVar : CollectionsKt.P(X)) {
            x xVar = lVar.f25589h.f2965k;
            b0 b0Var2 = lVar.f25583b;
            b0 b0Var3 = (b0) CollectionsKt.firstOrNull(g10);
            if (b0Var3 != null && b0Var3.f25534b.f3017e == b0Var2.f25534b.f3017e) {
                x xVar2 = x.f2257e;
                if (xVar != xVar2) {
                    p pVar = (p) this.f3002s.get(this.f3001r.b(lVar.f25583b.f25533a));
                    if (Intrinsics.areEqual((pVar == null || (p0Var = pVar.f25605f) == null || (set = (Set) p0Var.f10742a.getValue()) == null) ? null : Boolean.valueOf(set.contains(lVar)), Boolean.TRUE) || ((aVar = (a) this.j.get(lVar)) != null && aVar.f2953a.get() == 0)) {
                        hashMap.put(lVar, x.f2256d);
                    } else {
                        hashMap.put(lVar, xVar2);
                    }
                }
                b0 b0Var4 = (b0) CollectionsKt.firstOrNull(arrayList);
                if (b0Var4 != null && b0Var4.f25534b.f3017e == b0Var2.f25534b.f3017e) {
                    kotlin.collections.z.r(arrayList);
                }
                kotlin.collections.z.r(g10);
                d0 d0Var = b0Var2.f25535c;
                if (d0Var != null) {
                    g10.add(d0Var);
                }
            } else if (arrayList.isEmpty() || b0Var2.f25534b.f3017e != ((b0) CollectionsKt.F(arrayList)).f25534b.f3017e) {
                lVar.a(x.f2255c);
            } else {
                b0 b0Var5 = (b0) kotlin.collections.z.r(arrayList);
                if (xVar == x.f2257e) {
                    lVar.a(x.f2256d);
                } else {
                    x xVar3 = x.f2256d;
                    if (xVar != xVar3) {
                        hashMap.put(lVar, xVar3);
                    }
                }
                d0 d0Var2 = b0Var5.f25535c;
                if (d0Var2 != null && !arrayList.contains(d0Var2)) {
                    arrayList.add(d0Var2);
                }
            }
        }
        Iterator it2 = X.iterator();
        while (it2.hasNext()) {
            y1.l lVar2 = (y1.l) it2.next();
            x xVar4 = (x) hashMap.get(lVar2);
            if (xVar4 != null) {
                lVar2.a(xVar4);
            } else {
                lVar2.f25589h.b();
            }
        }
    }
}
