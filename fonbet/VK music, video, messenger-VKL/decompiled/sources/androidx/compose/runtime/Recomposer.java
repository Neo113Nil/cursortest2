package androidx.compose.runtime;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ag8;
import xsna.asp;
import xsna.b8e0;
import xsna.bvi;
import xsna.ci50;
import xsna.cvi;
import xsna.dak0;
import xsna.eak0;
import xsna.eg1;
import xsna.epx;
import xsna.evi;
import xsna.eyx;
import xsna.f880;
import xsna.fc30;
import xsna.fd3;
import xsna.fh50;
import xsna.fsk;
import xsna.ghj0;
import xsna.gu5;
import xsna.gyx;
import xsna.h5h0;
import xsna.hc30;
import xsna.hqj;
import xsna.ic30;
import xsna.ivi;
import xsna.j5g;
import xsna.j5h0;
import xsna.jbk0;
import xsna.k5h0;
import xsna.kq9;
import xsna.l5h0;
import xsna.lq9;
import xsna.m5z;
import xsna.owv;
import xsna.ph50;
import xsna.q010;
import xsna.qak0;
import xsna.qh50;
import xsna.qq9;
import xsna.r170;
import xsna.rp70;
import xsna.s3q0;
import xsna.s640;
import xsna.sp70;
import xsna.t060;
import xsna.uh50;
import xsna.utk0;
import xsna.v0a0;
import xsna.vtk0;
import xsna.wzs;
import xsna.x060;
import xsna.yu1;
import xsna.zrp;

/* compiled from: Recomposer.kt */
/* loaded from: classes11.dex */
public final class Recomposer extends cvi {
    public final ag8 a;
    public final r170 b;
    public final Object c;
    public eyx d;
    public Throwable e;
    public final ArrayList f;
    public Object g;
    public qh50<Object> h;
    public final ci50<hqj> i;
    public final ArrayList j;
    public final ArrayList k;
    public final ph50<Object, Object> l;
    public final t060 m;
    public final ph50<ic30, hc30> n;
    public final ph50<Object, Object> o;
    public ArrayList p;
    public qh50<hqj> q;
    public lq9 r;
    public final utk0 s;
    public boolean t;
    public final utk0 u;
    public final jbk0<qh50<f>> v;
    public final gyx w;
    public final kotlin.coroutines.d x;
    public final c y;
    public static final utk0 z = vtk0.a(v0a0.e);
    public static final AtomicReference<Boolean> A = new AtomicReference<>(Boolean.FALSE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Recomposer.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Idle;
        public static final State Inactive;
        public static final State InactivePendingWork;
        public static final State PendingWork;
        public static final State ShutDown;
        public static final State ShuttingDown;

        static {
            State state = new State("ShutDown", 0);
            ShutDown = state;
            State state2 = new State("ShuttingDown", 1);
            ShuttingDown = state2;
            State state3 = new State("Inactive", 2);
            Inactive = state3;
            State state4 = new State("InactivePendingWork", 3);
            InactivePendingWork = state4;
            State state5 = new State("Idle", 4);
            Idle = state5;
            State state6 = new State("PendingWork", 5);
            PendingWork = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: Recomposer.kt */
    public static final class a {
    }

    /* compiled from: Recomposer.kt */
    public static final class b {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }
    }

    /* compiled from: Recomposer.kt */
    public final class c {
    }

    public Recomposer(kotlin.coroutines.d dVar) {
        ag8 ag8Var = new ag8(new f880(this, 17));
        this.a = ag8Var;
        this.b = new r170(new q010(this, 25));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new qh50<>((Object) null);
        this.i = new ci50<>(new hqj[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = s640.b();
        this.m = new t060();
        this.n = h5h0.b();
        this.o = s640.b();
        this.s = vtk0.a(null);
        this.u = vtk0.a(State.Inactive);
        this.v = new jbk0<>();
        gyx gyxVar = new gyx((eyx) dVar.get(eyx.a.b));
        gyxVar.E(new owv(this, 29));
        this.w = gyxVar;
        this.x = dVar.plus(ag8Var).plus(gyxVar);
        this.y = new c();
    }

    public static final void B(Recomposer recomposer, ic30 ic30Var, ic30 ic30Var2) {
        List<ic30> list = ic30Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ic30 ic30Var3 = list.get(i);
                t060 t060Var = recomposer.m;
                fc30<Object> fc30Var = ic30Var3.a;
                s640.a((ph50) t060Var.b, fc30Var, new x060(ic30Var3, ic30Var));
                s640.a((ph50) t060Var.c, ic30Var, fc30Var);
                B(recomposer, ic30Var, ic30Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, Recomposer recomposer, hqj hqjVar) {
        arrayList.clear();
        synchronized (recomposer.c) {
            try {
                Iterator it = recomposer.k.iterator();
                while (it.hasNext()) {
                    ic30 ic30Var = (ic30) it.next();
                    if (epx.f(ic30Var.c, hqjVar)) {
                        arrayList.add(ic30Var);
                        it.remove();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void z(uh50 uh50Var) {
        try {
            if (uh50Var.w() instanceof eak0.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            uh50Var.c();
        }
    }

    public final void A() {
        synchronized (this.c) {
            try {
                if (((State) this.u.getValue()).compareTo(State.Idle) >= 0) {
                    this.u.setValue(State.ShuttingDown);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w.b(null);
    }

    public final kq9<s3q0> C() {
        State state;
        utk0 utk0Var = this.u;
        int compareTo = ((State) utk0Var.getValue()).compareTo(State.ShuttingDown);
        utk0 utk0Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        ci50<hqj> ci50Var = this.i;
        if (compareTo > 0) {
            if (utk0Var2.getValue() != null) {
                state = State.Inactive;
            } else if (this.d == null) {
                this.h = new qh50<>((Object) null);
                ci50Var.g();
                state = (D() || F()) ? State.InactivePendingWork : State.Inactive;
            } else {
                state = (ci50Var.d != 0 || this.h.d() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.l.g()) ? State.PendingWork : State.Idle;
            }
            utk0Var.setValue(state);
            if (state != State.PendingWork) {
                return null;
            }
            lq9 lq9Var = this.r;
            this.r = null;
            return lq9Var;
        }
        List<hqj> H = H();
        int size = H.size();
        for (int i = 0; i < size; i++) {
            H.get(i);
        }
        this.f.clear();
        this.g = EmptyList.b;
        this.h = new qh50<>((Object) null);
        ci50Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        lq9 lq9Var2 = this.r;
        if (lq9Var2 != null) {
            lq9Var2.z(null);
        }
        this.r = null;
        utk0Var2.setValue(null);
        return null;
    }

    public final boolean D() {
        return !this.t && (this.a.c.c.get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.i.d != 0 || D() || F() || this.l.g();
    }

    public final boolean F() {
        return !this.t && (this.b.b.c.get() & 134217727) > 0;
    }

    public final boolean G() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.d() && this.i.d == 0 && !D()) {
                z2 = F();
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<xsna.hqj>] */
    public final List<hqj> H() {
        ?? r0 = this.g;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.f;
        List<hqj> arrayList2 = arrayList.isEmpty() ? EmptyList.b : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void I() {
        kq9<s3q0> C;
        synchronized (this.c) {
            C = C();
            if (((State) this.u.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw fsk.j("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (C != null) {
            ((lq9) C).resumeWith(s3q0.a);
        }
    }

    public final void J(hqj hqjVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (epx.f(((ic30) arrayList.get(i)).c, hqjVar)) {
                    s3q0 s3q0Var = s3q0.a;
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, hqjVar);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, hqjVar);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0166, code lost:
    
        if (r4 >= r3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0172, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).j() == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0174, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0177, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
    
        if (r8 >= r4) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0187, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
    
        if (r11.j() != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        r11 = (xsna.ic30) r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019d, code lost:
    
        if (r11 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019f, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019c, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a5, code lost:
    
        r4 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a8, code lost:
    
        xsna.g5g.y(r3, r16.k);
        r3 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01be, code lost:
    
        if (r8 >= r4) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c0, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cb, code lost:
    
        if (((kotlin.Pair) r11).j() == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cd, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d0, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d3, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<hqj> L(List<ic30> list, qh50<Object> qh50Var) {
        uh50 C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ic30 ic30Var = list.get(i);
            hqj hqjVar = ic30Var.c;
            Object obj = hashMap.get(hqjVar);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(hqjVar, obj);
            }
            ((ArrayList) obj).add(ic30Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            hqj hqjVar2 = (hqj) entry.getKey();
            List list2 = (List) entry.getValue();
            if (hqjVar2.u()) {
                androidx.compose.runtime.b.a("Check failed");
            }
            b8e0 b8e0Var = new b8e0(hqjVar2, 2);
            yu1 yu1Var = new yu1(25, hqjVar2, qh50Var);
            dak0 j = qak0.j();
            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
            if (uh50Var == null || (C = uh50Var.C(b8e0Var, yu1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dak0 j2 = C.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ic30 ic30Var2 = (ic30) list2.get(i2);
                                Object c2 = s640.c(this.l, ic30Var2.a);
                                ic30 ic30Var3 = (ic30) c2;
                                if (ic30Var3 != null) {
                                    this.m.b(ic30Var3);
                                }
                                arrayList.add(new Pair(ic30Var2, c2));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.j() == null) {
                                    if (((ph50) this.m.b).a(((ic30) pair.i()).a)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            Pair pair2 = (Pair) arrayList.get(i4);
                                            if (pair2.j() == null) {
                                                t060 t060Var = this.m;
                                                fc30<Object> fc30Var = ((ic30) pair2.i()).a;
                                                ph50 ph50Var = (ph50) t060Var.b;
                                                x060 x060Var = (x060) s640.c(ph50Var, fc30Var);
                                                if (ph50Var.f()) {
                                                    ((ph50) t060Var.c).h();
                                                }
                                                if (x060Var != null) {
                                                    ic30 ic30Var4 = x060Var.a;
                                                    s640.a(this.o, x060Var.b, ic30Var4);
                                                    pair2 = new Pair(pair2.i(), ic30Var4);
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
                        if (((Pair) arrayList.get(i5)).j() != null) {
                            break;
                        }
                        i5++;
                    }
                    hqjVar2.e(arrayList);
                    s3q0 s3q0Var = s3q0.a;
                    dak0.q(j2);
                } catch (Throwable th) {
                    dak0.q(j2);
                    throw th;
                }
            } finally {
                z(C);
            }
        }
        return j5g.O0(hashMap.keySet());
    }

    public final hqj M(hqj hqjVar, qh50<Object> qh50Var) {
        qh50<hqj> qh50Var2;
        uh50 C;
        if (!hqjVar.u() && !hqjVar.h() && ((qh50Var2 = this.q) == null || !qh50Var2.a(hqjVar))) {
            b8e0 b8e0Var = new b8e0(hqjVar, 2);
            yu1 yu1Var = new yu1(25, hqjVar, qh50Var);
            dak0 j = qak0.j();
            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
            if (uh50Var == null || (C = uh50Var.C(b8e0Var, yu1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dak0 j2 = C.j();
                if (qh50Var != null) {
                    try {
                        if (qh50Var.d()) {
                            hqjVar.g(new eg1(15, qh50Var, hqjVar));
                        }
                    } catch (Throwable th) {
                        dak0.q(j2);
                        throw th;
                    }
                }
                boolean l = hqjVar.l();
                dak0.q(j2);
                if (l) {
                    return hqjVar;
                }
            } finally {
                z(C);
            }
        }
        return null;
    }

    public final void N(Throwable th, hqj hqjVar) {
        if (!A.get().booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                b bVar = (b) this.s.getValue();
                if (bVar != null) {
                    throw bVar.a;
                }
                utk0 utk0Var = this.s;
                b bVar2 = new b(th);
                utk0Var.getClass();
                utk0Var.i(null, bVar2);
                s3q0 s3q0Var = s3q0.a;
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new qh50<>((Object) null);
                this.k.clear();
                this.l.h();
                this.n.h();
                utk0 utk0Var2 = this.s;
                b bVar3 = new b(th);
                utk0Var2.getClass();
                utk0Var2.i(null, bVar3);
                if (hqjVar != null) {
                    P(hqjVar);
                }
                if (C() != null) {
                    androidx.compose.runtime.b.a("expected to go to inactive state due to composition error");
                }
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean O() {
        boolean E;
        EmptyList emptyList = EmptyList.b;
        synchronized (this.c) {
            if (this.h.c()) {
                return E();
            }
            List<hqj> H = H();
            l5h0 l5h0Var = new l5h0(this.h);
            this.h = new qh50<>((Object) null);
            try {
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    H.get(i).n(l5h0Var);
                    if (((State) this.u.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    E = E();
                }
                return E;
            } catch (Throwable th) {
                synchronized (this.c) {
                    qh50<Object> qh50Var = this.h;
                    int i2 = qh50Var.d;
                    Iterator<T> it = l5h0Var.iterator();
                    while (it.hasNext()) {
                        qh50Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void P(hqj hqjVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(hqjVar)) {
            arrayList.add(hqjVar);
        }
        if (this.f.remove(hqjVar)) {
            this.g = null;
        }
    }

    @Override // xsna.cvi
    public final void a(hqj hqjVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        State state;
        boolean contains;
        uh50 C;
        boolean u = hqjVar.u();
        synchronized (this.c) {
            State state2 = (State) this.u.getValue();
            state = State.ShuttingDown;
            contains = state2.compareTo(state) > 0 ? true ^ H().contains(hqjVar) : true;
        }
        try {
            b8e0 b8e0Var = new b8e0(hqjVar, 2);
            yu1 yu1Var = new yu1(25, hqjVar, (Object) null);
            dak0 j = qak0.j();
            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
            if (uh50Var == null || (C = uh50Var.C(b8e0Var, yu1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dak0 j2 = C.j();
                try {
                    hqjVar.b(wzsVar);
                    s3q0 s3q0Var = s3q0.a;
                    synchronized (this.c) {
                        if (((State) this.u.getValue()).compareTo(state) > 0 && !H().contains(hqjVar)) {
                            this.f.add(hqjVar);
                            this.g = null;
                        }
                    }
                    if (!u) {
                        qak0.j().m();
                    }
                    try {
                        J(hqjVar);
                        try {
                            hqjVar.X();
                            hqjVar.r();
                            if (u) {
                                return;
                            }
                            qak0.j().m();
                        } catch (Throwable th) {
                            N(th, null);
                        }
                    } catch (Throwable th2) {
                        N(th2, hqjVar);
                    }
                } finally {
                    dak0.q(j2);
                }
            } finally {
                z(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.c) {
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
            N(th3, hqjVar);
        }
    }

    @Override // xsna.cvi
    public final j5h0<f> b(hqj hqjVar, ghj0 ghj0Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        jbk0<qh50<f>> jbk0Var = this.v;
        try {
            ghj0 c2 = hqjVar.c(ghj0Var);
            try {
                a(hqjVar, wzsVar);
                qh50<Object> a2 = jbk0Var.a();
                if (a2 == null) {
                    a2 = k5h0.a;
                }
                return a2;
            } finally {
                hqjVar.c(c2);
            }
        } finally {
            jbk0Var.b(null);
        }
    }

    @Override // xsna.cvi
    public final void c(ic30 ic30Var) {
        kq9<s3q0> C;
        synchronized (this.c) {
            try {
                s640.a(this.l, ic30Var.a, ic30Var);
                if (ic30Var.h != null) {
                    B(this, ic30Var, ic30Var);
                }
                C = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C != null) {
            ((lq9) C).resumeWith(s3q0.a);
        }
    }

    @Override // xsna.cvi
    public final boolean e() {
        return A.get().booleanValue();
    }

    @Override // xsna.cvi
    public final boolean f() {
        return false;
    }

    @Override // xsna.cvi
    public final boolean g() {
        return false;
    }

    @Override // xsna.cvi
    public final long h() {
        return 1000;
    }

    @Override // xsna.cvi
    public final bvi i() {
        return null;
    }

    @Override // xsna.cvi
    public final kotlin.coroutines.d k() {
        return this.x;
    }

    @Override // xsna.cvi
    public final boolean l() {
        return false;
    }

    @Override // xsna.cvi
    public final void m(ic30 ic30Var) {
        kq9<s3q0> C;
        synchronized (this.c) {
            this.k.add(ic30Var);
            C = C();
        }
        if (C != null) {
            ((lq9) C).resumeWith(s3q0.a);
        }
    }

    @Override // xsna.cvi
    public final void n(hqj hqjVar) {
        kq9<s3q0> kq9Var;
        synchronized (this.c) {
            if (this.i.h(hqjVar)) {
                kq9Var = null;
            } else {
                this.i.b(hqjVar);
                kq9Var = C();
            }
        }
        if (kq9Var != null) {
            ((lq9) kq9Var).resumeWith(s3q0.a);
        }
    }

    @Override // xsna.cvi
    public final void o(ic30 ic30Var, hc30 hc30Var, fd3<?> fd3Var) {
        rp70 rp70Var;
        synchronized (this.c) {
            try {
                this.n.p(ic30Var, hc30Var);
                Object d = this.o.d(ic30Var);
                if (d == null) {
                    rp70Var = sp70.b;
                } else if (d instanceof fh50) {
                    rp70Var = (rp70) d;
                } else {
                    Object[] objArr = sp70.a;
                    fh50 fh50Var = new fh50(1);
                    fh50Var.j(d);
                    rp70Var = fh50Var;
                }
                if (rp70Var.g()) {
                    ph50 N = hc30Var.a.N(fd3Var, rp70Var);
                    Object[] objArr2 = N.b;
                    Object[] objArr3 = N.c;
                    long[] jArr = N.a;
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
                                        this.n.p((ic30) obj, (hc30) objArr3[i4]);
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
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.cvi
    public final hc30 p(ic30 ic30Var) {
        hc30 n;
        synchronized (this.c) {
            n = this.n.n(ic30Var);
        }
        return n;
    }

    @Override // xsna.cvi
    public final j5h0<f> q(hqj hqjVar, ghj0 ghj0Var, j5h0<f> j5h0Var) {
        jbk0<qh50<f>> jbk0Var = this.v;
        try {
            O();
            hqjVar.n(new l5h0(j5h0Var));
            ghj0 c2 = hqjVar.c(ghj0Var);
            try {
                hqj M = M(hqjVar, null);
                if (M != null) {
                    J(hqjVar);
                    M.X();
                    M.r();
                }
                qh50<Object> a2 = jbk0Var.a();
                if (a2 == null) {
                    a2 = k5h0.a;
                }
                return a2;
            } finally {
                hqjVar.c(c2);
            }
        } finally {
            jbk0Var.b(null);
        }
    }

    @Override // xsna.cvi
    public final void t(f fVar) {
        jbk0<qh50<f>> jbk0Var = this.v;
        qh50<f> a2 = jbk0Var.a();
        if (a2 == null) {
            a2 = k5h0.a();
            jbk0Var.b(a2);
        }
        a2.e(fVar);
    }

    @Override // xsna.cvi
    public final void u(hqj hqjVar) {
        synchronized (this.c) {
            try {
                qh50<hqj> qh50Var = this.q;
                if (qh50Var == null) {
                    qh50Var = k5h0.a();
                    this.q = qh50Var;
                }
                qh50Var.e(hqjVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.cvi
    public final qq9 v(m5z m5zVar) {
        r170 r170Var = this.b;
        gu5<r170.a> gu5Var = r170Var.b;
        r170.a aVar = new r170.a();
        aVar.a = m5zVar;
        return gu5Var.a(aVar, r170Var.c);
    }

    @Override // xsna.cvi
    public final void y(ivi iviVar) {
        synchronized (this.c) {
            if (this.f.remove(iviVar)) {
                this.g = null;
            }
            this.i.j(iviVar);
            this.j.remove(iviVar);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.cvi
    public final void r(Set<evi> set) {
    }
}
