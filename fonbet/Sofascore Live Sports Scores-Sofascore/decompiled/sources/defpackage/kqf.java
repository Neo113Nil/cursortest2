package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kqf extends mg3 {
    public static final fdi A = gdi.a(cfe.e);
    public static final AtomicReference B = new AtomicReference(Boolean.FALSE);
    public long a;
    public final l52 b;
    public final l2a c;
    public final Object d;
    public yda e;
    public Throwable f;
    public final ArrayList g;
    public List h;
    public y0d i;
    public final i1d j;
    public final ArrayList k;
    public final ArrayList l;
    public final x0d m;
    public final k1d n;
    public final x0d o;
    public final x0d p;
    public ArrayList q;
    public y0d r;
    public lj2 s;
    public final fdi t;
    public boolean u;
    public final fdi v;
    public final l2a w;
    public final aea x;
    public final CoroutineContext y;
    public final wje z;

    public kqf(CoroutineContext coroutineContext) {
        l52 l52Var = new l52(new gqf(this, 0));
        this.b = l52Var;
        this.c = new l2a(new gqf(this, 1));
        this.d = new Object();
        this.g = new ArrayList();
        this.i = new y0d();
        this.j = new i1d(new sg3[16], 0);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new x0d();
        this.n = new k1d(2);
        this.o = new x0d();
        this.p = new x0d();
        this.t = gdi.a(null);
        this.v = gdi.a(iqf.c);
        this.w = new l2a(20);
        aea aeaVar = new aea((yda) coroutineContext.get(uic.g));
        aeaVar.n(new mme(this, 18));
        this.x = aeaVar;
        this.y = coroutineContext.plus(l52Var).plus(aeaVar);
        this.z = new wje(1);
    }

    public static final void B(kqf kqfVar, twc twcVar, twc twcVar2) {
        List list = twcVar2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                twc twcVar3 = (twc) list.get(i);
                k1d k1dVar = kqfVar.n;
                rwc rwcVar = twcVar3.a;
                uyc.a((x0d) k1dVar.b, rwcVar, new b9d(twcVar3, twcVar));
                uyc.a((x0d) k1dVar.c, twcVar, rwcVar);
                B(kqfVar, twcVar, twcVar3);
            }
        }
    }

    public static final void K(ArrayList arrayList, kqf kqfVar, sg3 sg3Var) {
        arrayList.clear();
        synchronized (kqfVar.d) {
            try {
                Iterator it = kqfVar.l.iterator();
                while (it.hasNext()) {
                    twc twcVar = (twc) it.next();
                    if (twcVar.c.equals(sg3Var)) {
                        arrayList.add(twcVar);
                        it.remove();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void z(c1d c1dVar) {
        try {
            if (c1dVar.w() instanceof onh) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c1dVar.c();
        }
    }

    public final void A() {
        synchronized (this.d) {
            try {
                if (((iqf) this.v.getValue()).compareTo(iqf.e) >= 0) {
                    fdi fdiVar = this.v;
                    iqf iqfVar = iqf.b;
                    fdiVar.getClass();
                    fdiVar.m(null, iqfVar);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.x.e(null);
    }

    public final kj2 C() {
        iqf iqfVar;
        fdi fdiVar = this.v;
        int compareTo = ((iqf) fdiVar.getValue()).compareTo(iqf.b);
        fdi fdiVar2 = this.t;
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.k;
        i1d i1dVar = this.j;
        if (compareTo > 0) {
            if (fdiVar2.getValue() != null) {
                iqfVar = iqf.c;
            } else if (this.e == null) {
                this.i = new y0d();
                i1dVar.n();
                iqfVar = (D() || F()) ? iqf.d : iqf.c;
            } else {
                iqfVar = (i1dVar.c != 0 || this.i.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.m.j()) ? iqf.f : iqf.e;
            }
            fdiVar.getClass();
            fdiVar.m(null, iqfVar);
            if (iqfVar != iqf.f) {
                return null;
            }
            lj2 lj2Var = this.s;
            this.s = null;
            return lj2Var;
        }
        List H = H();
        int size = H.size();
        for (int i = 0; i < size; i++) {
        }
        this.g.clear();
        this.h = km5.a;
        this.i = new y0d();
        i1dVar.n();
        arrayList2.clear();
        arrayList.clear();
        this.q = null;
        lj2 lj2Var2 = this.s;
        if (lj2Var2 != null) {
            lj2Var2.a(null);
        }
        this.s = null;
        fdiVar2.l(null);
        return null;
    }

    public final boolean D() {
        return !this.u && (((em0) this.b.b.d).get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.j.c != 0 || D() || F() || this.m.j();
    }

    public final boolean F() {
        return !this.u && (((em0) ((p03) this.c.c).d).get() & 134217727) > 0;
    }

    public final boolean G() {
        boolean z;
        synchronized (this.d) {
            if (!this.i.h() && this.j.c == 0 && !D()) {
                z = F();
            }
        }
        return z;
    }

    public final List H() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.g;
        List arrayList2 = arrayList.isEmpty() ? km5.a : new ArrayList(arrayList);
        this.h = arrayList2;
        return arrayList2;
    }

    public final void I() {
        kj2 C;
        synchronized (this.d) {
            C = C();
            if (((iqf) this.v.getValue()).compareTo(iqf.b) <= 0) {
                throw ml4.e("Recomposer shutdown; frame clock awaiter will never resume", this.f);
            }
        }
        if (C != null) {
            p2g p2gVar = w2g.b;
            ((lj2) C).resumeWith(Unit.a);
        }
    }

    public final void J(sg3 sg3Var) {
        synchronized (this.d) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((twc) arrayList.get(i)).c.equals(sg3Var)) {
                    Unit unit = Unit.a;
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, sg3Var);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, sg3Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        if (r4 >= r3) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).b == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0166, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
    
        if (r8 >= r4) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0181, code lost:
    
        if (r11.b != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0183, code lost:
    
        r11 = (defpackage.twc) r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018c, code lost:
    
        if (r11 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018e, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0191, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018a, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
    
        r4 = r16.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0196, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0197, code lost:
    
        defpackage.o13.v(r3, r16.l);
        r3 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ad, code lost:
    
        if (r8 >= r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01af, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b8, code lost:
    
        if (((kotlin.Pair) r11).b == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ba, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bd, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c0, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List L(List list, y0d y0dVar) {
        c1d C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            sg3 sg3Var = ((twc) obj).c;
            Object obj2 = hashMap.get(sg3Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(sg3Var, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            sg3 sg3Var2 = (sg3) entry.getKey();
            List list2 = (List) entry.getValue();
            if (sg3Var2.v.F) {
                sf3.a("Check failed");
            }
            mme mmeVar = new mme(sg3Var2, 17);
            aaf aafVar = new aaf(5, sg3Var2, y0dVar);
            nnh h = snh.h();
            c1d c1dVar = h instanceof c1d ? (c1d) h : null;
            if (c1dVar == null || (C = c1dVar.C(mmeVar, aafVar)) == null) {
                a70.r("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                nnh j = C.j();
                try {
                    synchronized (this.d) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                twc twcVar = (twc) list2.get(i2);
                                Object b = uyc.b(this.m, twcVar.a);
                                twc twcVar2 = (twc) b;
                                if (twcVar2 != null) {
                                    this.n.x(twcVar2);
                                }
                                arrayList.add(new Pair(twcVar, b));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.b == null) {
                                    if (((x0d) this.n.b).b(((twc) pair.a).a)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            Pair pair2 = (Pair) arrayList.get(i4);
                                            if (pair2.b == null) {
                                                k1d k1dVar = this.n;
                                                rwc rwcVar = ((twc) pair2.a).a;
                                                x0d x0dVar = (x0d) k1dVar.b;
                                                b9d b9dVar = (b9d) uyc.b(x0dVar, rwcVar);
                                                if (x0dVar.i()) {
                                                    ((x0d) k1dVar.c).a();
                                                }
                                                if (b9dVar != null) {
                                                    twc twcVar3 = b9dVar.a;
                                                    uyc.a(this.p, b9dVar.b, twcVar3);
                                                    pair2 = new Pair(pair2.a, twcVar3);
                                                }
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((Pair) arrayList.get(i5)).b != null) {
                            break;
                        }
                        i5++;
                    }
                    sg3Var2.u(arrayList);
                    Unit unit = Unit.a;
                    nnh.q(j);
                } catch (Throwable th) {
                    nnh.q(j);
                    throw th;
                }
            } finally {
                z(C);
            }
        }
        return CollectionsKt.S0(hashMap.keySet());
    }

    public final sg3 M(sg3 sg3Var, y0d y0dVar) {
        c1d C;
        if (sg3Var.v.F || sg3Var.w == 3) {
            return null;
        }
        y0d y0dVar2 = this.r;
        if (y0dVar2 == null || !y0dVar2.c(sg3Var)) {
            mme mmeVar = new mme(sg3Var, 17);
            aaf aafVar = new aaf(5, sg3Var, y0dVar);
            nnh h = snh.h();
            c1d c1dVar = h instanceof c1d ? (c1d) h : null;
            if (c1dVar == null || (C = c1dVar.C(mmeVar, aafVar)) == null) {
                a70.r("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    nnh j = C.j();
                    if (y0dVar != null) {
                        try {
                            if (y0dVar.h()) {
                                zbe zbeVar = new zbe(19, y0dVar, sg3Var);
                                av8 av8Var = sg3Var.v;
                                if (av8Var.F) {
                                    sf3.a("Preparing a composition while composing is not supported");
                                }
                                av8Var.F = true;
                                try {
                                    zbeVar.invoke();
                                    av8Var.F = false;
                                } catch (Throwable th) {
                                    av8Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            nnh.q(j);
                            throw th2;
                        }
                    }
                    boolean y = sg3Var.y();
                    nnh.q(j);
                    if (y) {
                        return sg3Var;
                    }
                } finally {
                    z(C);
                }
            }
        }
        return null;
    }

    public final void N(Throwable th, sg3 sg3Var) {
        if (!((Boolean) B.get()).booleanValue() || (th instanceof ue3)) {
            synchronized (this.d) {
                hqf hqfVar = (hqf) this.t.getValue();
                if (hqfVar != null) {
                    throw hqfVar.a;
                }
                fdi fdiVar = this.t;
                hqf hqfVar2 = new hqf(th);
                fdiVar.getClass();
                fdiVar.m(null, hqfVar2);
                Unit unit = Unit.a;
            }
            throw th;
        }
        synchronized (this.d) {
            try {
                this.k.clear();
                this.j.n();
                this.i = new y0d();
                this.l.clear();
                this.m.a();
                this.o.a();
                fdi fdiVar2 = this.t;
                hqf hqfVar3 = new hqf(th);
                fdiVar2.getClass();
                fdiVar2.m(null, hqfVar3);
                if (sg3Var != null) {
                    P(sg3Var);
                }
                if (C() != null) {
                    sf3.a("expected to go to inactive state due to composition error");
                }
                Unit unit2 = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean O() {
        boolean E;
        synchronized (this.d) {
            if (this.i.g()) {
                return E();
            }
            List H = H();
            srg srgVar = new srg(this.i);
            this.i = new y0d();
            try {
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    ((sg3) H.get(i)).z(srgVar);
                    if (((iqf) this.v.getValue()).compareTo(iqf.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.d) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    E = E();
                }
                return E;
            } catch (Throwable th) {
                synchronized (this.d) {
                    y0d y0dVar = this.i;
                    y0dVar.getClass();
                    Iterator<E> it = srgVar.iterator();
                    while (it.hasNext()) {
                        y0dVar.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void P(sg3 sg3Var) {
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.q = arrayList;
        }
        if (!arrayList.contains(sg3Var)) {
            arrayList.add(sg3Var);
        }
        if (this.g.remove(sg3Var)) {
            this.h = null;
        }
    }

    public final Object Q(hoi hoiVar) {
        Object R = xw3.R(this.b, new h10(this, new jqf(this, null), bea.y(hoiVar.getContext()), (rq3) null, 22), hoiVar);
        lu3 lu3Var = lu3.a;
        if (R != lu3Var) {
            R = Unit.a;
        }
        return R == lu3Var ? R : Unit.a;
    }

    @Override // defpackage.mg3
    public final void a(sg3 sg3Var, Function2 function2) {
        iqf iqfVar;
        boolean contains;
        c1d C;
        boolean z = sg3Var.v.F;
        synchronized (this.d) {
            iqf iqfVar2 = (iqf) this.v.getValue();
            iqfVar = iqf.b;
            contains = iqfVar2.compareTo(iqfVar) > 0 ? true ^ H().contains(sg3Var) : true;
        }
        try {
            mme mmeVar = new mme(sg3Var, 17);
            aaf aafVar = new aaf(5, sg3Var, null);
            nnh h = snh.h();
            c1d c1dVar = h instanceof c1d ? (c1d) h : null;
            if (c1dVar == null || (C = c1dVar.C(mmeVar, aafVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                nnh j = C.j();
                try {
                    sg3Var.n(function2);
                    Unit unit = Unit.a;
                    synchronized (this.d) {
                        if (((iqf) this.v.getValue()).compareTo(iqfVar) > 0 && !H().contains(sg3Var)) {
                            this.g.add(sg3Var);
                            this.h = null;
                        }
                    }
                    if (!z) {
                        snh.h().m();
                    }
                    try {
                        J(sg3Var);
                        try {
                            sg3Var.g();
                            sg3Var.i();
                            if (z) {
                                return;
                            }
                            snh.h().m();
                        } catch (Throwable th) {
                            N(th, null);
                        }
                    } catch (Throwable th2) {
                        N(th2, sg3Var);
                    }
                } finally {
                    nnh.q(j);
                }
            } finally {
                z(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.d) {
                    Unit unit2 = Unit.a;
                }
            }
            N(th3, sg3Var);
        }
    }

    @Override // defpackage.mg3
    public final y0d b(sg3 sg3Var, vfh vfhVar, Function2 function2) {
        l2a l2aVar = this.w;
        try {
            vfh vfhVar2 = sg3Var.p;
            sg3Var.p = vfhVar;
            try {
                a(sg3Var, function2);
                y0d y0dVar = (y0d) l2aVar.l();
                if (y0dVar == null) {
                    y0dVar = rrg.a;
                    y0dVar.getClass();
                }
                return y0dVar;
            } finally {
                sg3Var.p = vfhVar2;
            }
        } finally {
            l2aVar.I(null);
        }
    }

    @Override // defpackage.mg3
    public final void c(twc twcVar) {
        kj2 C;
        synchronized (this.d) {
            try {
                uyc.a(this.m, twcVar.a, twcVar);
                if (twcVar.h != null) {
                    B(this, twcVar, twcVar);
                }
                C = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C != null) {
            p2g p2gVar = w2g.b;
            ((lj2) C).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.mg3
    public final boolean e() {
        return ((Boolean) B.get()).booleanValue();
    }

    @Override // defpackage.mg3
    public final boolean f() {
        return false;
    }

    @Override // defpackage.mg3
    public final boolean g() {
        return false;
    }

    @Override // defpackage.mg3
    public final long h() {
        return 1000L;
    }

    @Override // defpackage.mg3
    public final lg3 i() {
        return null;
    }

    @Override // defpackage.mg3
    public final CoroutineContext k() {
        return this.y;
    }

    @Override // defpackage.mg3
    public final boolean l() {
        return false;
    }

    @Override // defpackage.mg3
    public final void m(twc twcVar) {
        kj2 C;
        synchronized (this.d) {
            this.l.add(twcVar);
            C = C();
        }
        if (C != null) {
            p2g p2gVar = w2g.b;
            ((lj2) C).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.mg3
    public final void n(sg3 sg3Var) {
        kj2 kj2Var;
        synchronized (this.d) {
            if (this.j.o(sg3Var)) {
                kj2Var = null;
            } else {
                this.j.b(sg3Var);
                kj2Var = C();
            }
        }
        if (kj2Var != null) {
            p2g p2gVar = w2g.b;
            ((lj2) kj2Var).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.mg3
    public final void o(twc twcVar, swc swcVar, qf0 qf0Var) {
        l0d l0dVar;
        synchronized (this.d) {
            try {
                this.o.m(twcVar, swcVar);
                Object g = this.p.g(twcVar);
                if (g == null) {
                    l0dVar = yjd.b;
                    l0dVar.getClass();
                } else if (g instanceof l0d) {
                    l0dVar = (l0d) g;
                } else {
                    Object[] objArr = yjd.a;
                    l0d l0dVar2 = new l0d(1);
                    l0dVar2.a(g);
                    l0dVar = l0dVar2;
                }
                if (l0dVar.i()) {
                    x0d d = swcVar.a.d(qf0Var, l0dVar);
                    Object[] objArr2 = d.b;
                    Object[] objArr3 = d.c;
                    long[] jArr = d.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj = objArr2[i4];
                                        this.o.m((twc) obj, (swc) objArr3[i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mg3
    public final swc p(twc twcVar) {
        swc swcVar;
        synchronized (this.d) {
            swcVar = (swc) this.o.k(twcVar);
        }
        return swcVar;
    }

    @Override // defpackage.mg3
    public final y0d q(sg3 sg3Var, vfh vfhVar, y0d y0dVar) {
        l2a l2aVar = this.w;
        try {
            O();
            sg3Var.z(new srg(y0dVar));
            vfh vfhVar2 = sg3Var.p;
            sg3Var.p = vfhVar;
            try {
                sg3 M = M(sg3Var, null);
                if (M != null) {
                    J(sg3Var);
                    M.g();
                    M.i();
                }
                y0d y0dVar2 = (y0d) l2aVar.l();
                if (y0dVar2 == null) {
                    y0dVar2 = rrg.a;
                    y0dVar2.getClass();
                }
                return y0dVar2;
            } finally {
                sg3Var.p = vfhVar2;
            }
        } finally {
            l2aVar.I(null);
        }
    }

    @Override // defpackage.mg3
    public final void t(eqf eqfVar) {
        l2a l2aVar = this.w;
        y0d y0dVar = (y0d) l2aVar.l();
        if (y0dVar == null) {
            y0d y0dVar2 = rrg.a;
            y0dVar = new y0d();
            l2aVar.I(y0dVar);
        }
        y0dVar.a(eqfVar);
    }

    @Override // defpackage.mg3
    public final void u(sg3 sg3Var) {
        synchronized (this.d) {
            try {
                y0d y0dVar = this.r;
                if (y0dVar == null) {
                    y0d y0dVar2 = rrg.a;
                    y0dVar = new y0d();
                    this.r = y0dVar;
                }
                y0dVar.a(sg3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mg3
    public final qj2 v(hv7 hv7Var) {
        l2a l2aVar = this.c;
        p03 p03Var = (p03) l2aVar.c;
        fcd fcdVar = new fcd();
        fcdVar.a = hv7Var;
        return p03Var.f(fcdVar, (ixa) l2aVar.d);
    }

    @Override // defpackage.mg3
    public final void y(sg3 sg3Var) {
        synchronized (this.d) {
            if (this.g.remove(sg3Var)) {
                this.h = null;
            }
            this.j.q(sg3Var);
            this.k.remove(sg3Var);
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.mg3
    public final void r(Set set) {
    }
}
