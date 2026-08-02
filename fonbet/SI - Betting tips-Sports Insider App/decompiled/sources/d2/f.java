package d2;

import e.a0;
import e.y;
import hg.d1;
import hg.p0;
import hg.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.e0;
import kotlin.collections.t;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f8090a = u0.b(g.f8103c);

    /* renamed from: b, reason: collision with root package name */
    public final d1 f8091b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f8092c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.collections.l f8093d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.collections.l f8094e;

    /* renamed from: f, reason: collision with root package name */
    public y f8095f;

    /* renamed from: g, reason: collision with root package name */
    public int f8096g;

    /* renamed from: h, reason: collision with root package name */
    public e f8097h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f8098i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f8099k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8100l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8101m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8102n;

    public f() {
        d1 b10 = u0.b(new d());
        this.f8091b = b10;
        this.f8092c = new p0(b10);
        this.f8093d = new kotlin.collections.l();
        this.f8094e = new kotlin.collections.l();
        this.f8098i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.f8099k = new LinkedHashSet();
    }

    public final void a(c dispatcher, e input, int i5) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.f8088a != null) {
            throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.f8088a + '.').toString());
        }
        (i5 != 0 ? i5 != 1 ? this.f8098i : this.j : this.f8099k).add(input);
        input.f8088a = dispatcher;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        d history = (d) this.f8092c.f10742a.getValue();
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(history, "history");
        input.b(i5 != 0 ? i5 != 1 ? this.f8102n : this.f8100l : this.f8101m);
    }

    public final void b() {
        boolean z5;
        boolean z7;
        d history;
        kotlin.collections.l lVar = this.f8093d;
        if (lVar == null || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (((y) it.next()).f8450d) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        kotlin.collections.l lVar2 = this.f8094e;
        if (lVar2 == null || !lVar2.isEmpty()) {
            Iterator it2 = lVar2.iterator();
            while (it2.hasNext()) {
                if (((y) it2.next()).f8450d) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        boolean z10 = z5 || z7;
        boolean z11 = this.f8101m != z5;
        boolean z12 = this.f8100l != z7;
        boolean z13 = this.f8102n != z10;
        LinkedHashSet linkedHashSet = this.f8099k;
        if (z11) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).b(z5);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z12) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((e) it4.next()).b(z7);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f8098i;
        if (z13) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((e) it5.next()).b(z10);
            }
        }
        this.f8101m = z5;
        this.f8100l = z7;
        this.f8102n = z10;
        y yVar = this.f8095f;
        if (yVar == null) {
            yVar = c(0);
        }
        y yVar2 = this.f8095f;
        if (yVar2 == null) {
            yVar2 = c(0);
        }
        if (Intrinsics.areEqual(yVar2, yVar)) {
            if (yVar2 == null) {
                history = new d();
            } else {
                ArrayList backInfo = new ArrayList();
                Iterator<E> it6 = lVar.iterator();
                while (it6.hasNext()) {
                    y yVar3 = (y) it6.next();
                    if (yVar3.f8450d) {
                        yVar3.f8448b.getClass();
                    }
                }
                Iterator<E> it7 = lVar2.iterator();
                while (it7.hasNext()) {
                    y yVar4 = (y) it7.next();
                    if (yVar4.f8450d) {
                        yVar4.f8448b.getClass();
                    }
                }
                a0 currentInfo = yVar2.f8447a;
                e0 forwardInfo = yVar2.f8449c;
                Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
                Intrinsics.checkNotNullParameter(backInfo, "backInfo");
                Intrinsics.checkNotNullParameter(forwardInfo, "forwardInfo");
                hf.e b10 = t.b();
                z.n(backInfo, b10);
                b10.add(currentInfo);
                z.n(forwardInfo, b10);
                history = new d(backInfo.size(), t.a(b10));
            }
            d1 d1Var = this.f8091b;
            if (Intrinsics.areEqual((d) d1Var.getValue(), history)) {
                return;
            }
            d1Var.k(null, history);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((e) it8.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((e) it9.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((e) it10.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
        }
    }

    public final y c(int i5) {
        Object obj;
        Object obj2;
        kotlin.collections.l lVar = this.f8094e;
        kotlin.collections.l lVar2 = this.f8093d;
        Object obj3 = null;
        if (i5 == -1) {
            Iterator it = lVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((y) obj).f8450d) {
                    break;
                }
            }
            y yVar = (y) obj;
            if (yVar != null) {
                return yVar;
            }
            Iterator it2 = lVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((y) next).f8450d) {
                    obj3 = next;
                    break;
                }
            }
            return (y) obj3;
        }
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i5 + "'.").toString());
            }
            Iterator it3 = lVar2.iterator();
            while (it3.hasNext()) {
                ((y) it3.next()).getClass();
            }
            Iterator it4 = lVar.iterator();
            while (it4.hasNext()) {
                ((y) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = lVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((y) obj2).f8450d) {
                break;
            }
        }
        y yVar2 = (y) obj2;
        if (yVar2 != null) {
            return yVar2;
        }
        Iterator it6 = lVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((y) next2).f8450d) {
                obj3 = next2;
                break;
            }
        }
        return (y) obj3;
    }
}
