package defpackage;

import android.os.Trace;
import androidx.compose.runtime.d;
import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class av8 implements of3 {
    public int A;
    public int B;
    public boolean C;
    public final zu8 D;
    public final ArrayList E;
    public boolean F;
    public ilh G;
    public jlh H;
    public mlh I;
    public boolean J;
    public aee K;
    public hn2 L;
    public final pf3 M;
    public vu8 N;
    public t68 O;
    public vfh P;
    public final qg3 Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public bv8 U;
    public final y0 a;
    public final mg3 b;
    public final jlh c;
    public final a1d d;
    public final hn2 e;
    public final hn2 f;
    public final hpo g;
    public final sg3 h;
    public dv8 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public szc p;
    public boolean q;
    public boolean r;
    public uzc v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final e7a n = new e7a(1, false);
    public final ArrayList s = new ArrayList();
    public final e7a t = new e7a(1, false);
    public aee u = aee.g;
    public final e7a x = new e7a(1, false);
    public int z = -1;

    public av8(y0 y0Var, mg3 mg3Var, jlh jlhVar, a1d a1dVar, hn2 hn2Var, hn2 hn2Var2, hpo hpoVar, sg3 sg3Var) {
        this.a = y0Var;
        this.b = mg3Var;
        this.c = jlhVar;
        this.d = a1dVar;
        this.e = hn2Var;
        this.f = hn2Var2;
        this.g = hpoVar;
        this.h = sg3Var;
        this.C = mg3Var.g() || mg3Var.e();
        this.D = new zu8(this, 0);
        this.E = new ArrayList();
        ilh m = jlhVar.m();
        m.c();
        this.G = m;
        jlh jlhVar2 = new jlh();
        if (mg3Var.g()) {
            jlhVar2.c();
        }
        if (mg3Var.e()) {
            jlhVar2.k = new uzc();
        }
        this.H = jlhVar2;
        mlh n = jlhVar2.n();
        n.e(true);
        this.I = n;
        this.M = new pf3(this, hn2Var);
        ilh m2 = this.H.m();
        try {
            vu8 a = m2.a(0);
            m2.c();
            this.N = a;
            this.O = new t68();
            this.Q = new qg3(this);
            CoroutineContext k = mg3Var.k();
            CoroutineContext C = C();
            this.R = k.plus(C == null ? g.a : C);
        } catch (Throwable th) {
            m2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final twc Q(int i, av8 av8Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int t;
        int i2 = av8Var.G.i(i);
        ilh ilhVar = av8Var.G;
        Object p = ilhVar.p(i, ilhVar.b);
        if (i2 != 126665345 || !(p instanceof rwc)) {
            return null;
        }
        if (av8Var.G.d(i)) {
            ArrayList arrayList3 = new ArrayList();
            R(av8Var, arrayList3, i);
            if (!arrayList3.isEmpty()) {
                arrayList = arrayList3;
                ilh ilhVar2 = av8Var.G;
                Object p2 = ilhVar2.p(i, ilhVar2.b);
                p2.getClass();
                rwc rwcVar = (rwc) p2;
                Object h = av8Var.G.h(i, 0);
                vu8 a = av8Var.G.a(i);
                int i3 = av8Var.G.b[(i * 5) + 3] + i;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = av8Var.s;
                t = dy0.t(i, arrayList2);
                if (t < 0) {
                    t = -(t + 1);
                }
                while (t < arrayList2.size()) {
                    qaa qaaVar = (qaa) arrayList2.get(t);
                    if (qaaVar.b >= i3) {
                        break;
                    }
                    arrayList4.add(new Pair(qaaVar.a, qaaVar.c));
                    t++;
                }
                return new twc(rwcVar, h, av8Var.h, av8Var.c, a, arrayList4, av8Var.n(i), arrayList);
            }
        }
        arrayList = null;
        ilh ilhVar22 = av8Var.G;
        Object p22 = ilhVar22.p(i, ilhVar22.b);
        p22.getClass();
        rwc rwcVar2 = (rwc) p22;
        Object h2 = av8Var.G.h(i, 0);
        vu8 a2 = av8Var.G.a(i);
        int i32 = av8Var.G.b[(i * 5) + 3] + i;
        ArrayList arrayList42 = new ArrayList();
        arrayList2 = av8Var.s;
        t = dy0.t(i, arrayList2);
        if (t < 0) {
        }
        while (t < arrayList2.size()) {
        }
        return new twc(rwcVar2, h2, av8Var.h, av8Var.c, a2, arrayList42, av8Var.n(i), arrayList);
    }

    public static final void R(av8 av8Var, ArrayList arrayList, int i) {
        int i2 = av8Var.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (av8Var.G.j(i3)) {
                twc Q = Q(i3, av8Var);
                if (Q != null) {
                    arrayList.add(Q);
                }
            } else if (av8Var.G.d(i3)) {
                R(av8Var, arrayList, i3);
            }
            i3 += av8Var.G.b[(i3 * 5) + 3];
        }
    }

    public static final int S(av8 av8Var, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        long[] jArr2;
        Object[] objArr2;
        int i6;
        int i7;
        ilh ilhVar = av8Var.G;
        int i8 = 0;
        if (ilhVar.j(i2)) {
            int i9 = ilhVar.i(i2);
            Object p = ilhVar.p(i2, ilhVar.b);
            if (i9 == 126665345 && (p instanceof rwc)) {
                twc Q = Q(i2, av8Var);
                if (Q != null) {
                    av8Var.b.c(Q);
                    av8Var.M.e();
                    pf3 pf3Var = av8Var.M;
                    sg3 sg3Var = av8Var.h;
                    mg3 mg3Var = av8Var.b;
                    evd evdVar = pf3Var.b.k;
                    evdVar.l0(mud.c);
                    wba.J(evdVar, sg3Var, mg3Var, Q);
                }
                if (!z || i2 == i) {
                    return ilhVar.o(i2);
                }
                pf3 pf3Var2 = av8Var.M;
                pf3Var2.c();
                pf3Var2.b();
                av8 av8Var2 = pf3Var2.a;
                int o = av8Var2.G.l(i2) ? 1 : av8Var2.G.o(i2);
                if (o > 0) {
                    pf3Var2.f(i3, o);
                }
                return 0;
            }
            if (i9 == 206 && Intrinsics.c(p, sf3.e)) {
                Object h = ilhVar.h(i2, 0);
                ev8 ev8Var = h instanceof ev8 ? (ev8) h : null;
                Object obj = ev8Var != null ? ev8Var.a : null;
                yu8 yu8Var = obj instanceof yu8 ? (yu8) obj : null;
                if (yu8Var != null) {
                    y0d y0dVar = yu8Var.a.e;
                    Object[] objArr3 = y0dVar.b;
                    long[] jArr3 = y0dVar.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j = jArr3[i10];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = i8;
                                while (i13 < i12) {
                                    if ((255 & j) < 128) {
                                        av8 av8Var3 = (av8) objArr3[(i10 << 3) + i13];
                                        jlh jlhVar = av8Var3.c;
                                        if (jlhVar.b <= 0 || (jlhVar.a[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i6 = i8;
                                            i7 = i11;
                                        } else {
                                            sg3 sg3Var2 = av8Var3.h;
                                            synchronized (sg3Var2.d) {
                                                sg3Var2.s();
                                                i7 = i11;
                                                x0d x0dVar = sg3Var2.n;
                                                sg3Var2.n = t6a.t();
                                                try {
                                                    sg3Var2.v.k0(x0dVar);
                                                    Unit unit = Unit.a;
                                                } finally {
                                                }
                                            }
                                            hn2 hn2Var = new hn2();
                                            av8Var3.L = hn2Var;
                                            ilh m = av8Var3.c.m();
                                            try {
                                                av8Var3.G = m;
                                                pf3 pf3Var3 = av8Var3.M;
                                                hn2 hn2Var2 = pf3Var3.b;
                                                try {
                                                    pf3Var3.b = hn2Var;
                                                    av8Var3.P(0);
                                                    pf3 pf3Var4 = av8Var3.M;
                                                    pf3Var4.b();
                                                    jArr2 = jArr3;
                                                    if (pf3Var4.c) {
                                                        objArr2 = objArr3;
                                                        pf3Var4.b.k.l0(tud.c);
                                                        if (pf3Var4.c) {
                                                            pf3Var4.d(false);
                                                            pf3Var4.d(false);
                                                            pf3Var4.b.k.l0(cud.c);
                                                            i6 = 0;
                                                            pf3Var4.c = false;
                                                        }
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                } finally {
                                                }
                                            } finally {
                                                m.c();
                                            }
                                        }
                                        av8Var.b.u(av8Var3.h);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i6 = i8;
                                        i7 = i11;
                                    }
                                    j >>= i7;
                                    i13++;
                                    i11 = i7;
                                    objArr3 = objArr2;
                                    i8 = i6;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                i5 = i8;
                                if (i12 != i11) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i5 = i8;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            objArr3 = objArr;
                            i8 = i5;
                            jArr3 = jArr;
                        }
                    }
                }
                return ilhVar.o(i2);
            }
            i4 = 1;
            if (!ilhVar.l(i2)) {
                return ilhVar.o(i2);
            }
        } else {
            i4 = 1;
            if (ilhVar.d(i2)) {
                int i14 = ilhVar.b[(i2 * 5) + 3] + i2;
                int i15 = 0;
                for (int i16 = i2 + 1; i16 < i14; i16 += ilhVar.b[(i16 * 5) + 3]) {
                    boolean l = ilhVar.l(i16);
                    if (l) {
                        av8Var.M.c();
                        pf3 pf3Var5 = av8Var.M;
                        Object n = ilhVar.n(i16);
                        pf3Var5.c();
                        pf3Var5.h.add(n);
                    }
                    i15 += S(av8Var, i, i16, l || z, l ? 0 : i3 + i15);
                    if (l) {
                        av8Var.M.c();
                        av8Var.M.a();
                    }
                }
                if (!ilhVar.l(i2)) {
                    return i15;
                }
            } else if (!ilhVar.l(i2)) {
                return ilhVar.o(i2);
            }
        }
        return i4;
    }

    public final eqf A() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (eqf) mz1.h(arrayList, 1);
    }

    public final boolean B() {
        if (!D() || this.w) {
            return true;
        }
        eqf A = A();
        return (A == null || (A.b & 4) == 0) ? false : true;
    }

    public final qg3 C() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean D() {
        eqf A;
        return (this.S || this.y || this.w || (A = A()) == null || (A.b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:35|(1:37)(1:137)|(1:39)(1:136)|(4:(7:41|(1:43)|44|(1:46)(1:134)|47|(1:49)(1:133)|(33:51|52|53|54|55|(4:57|(1:59)(1:126)|60|(1:62)(1:125))(1:127)|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|(1:87)|88|89|90))(1:135)|88|89|90)|132|52|53|54|55|(0)(0)|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025c, code lost:
    
        r23 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131 A[Catch: all -> 0x00ac, TryCatch #6 {all -> 0x00ac, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:10:0x0066, B:19:0x00a2, B:20:0x020d, B:25:0x00b4, B:26:0x00b7, B:31:0x0058, B:33:0x005e, B:34:0x0063, B:35:0x00b8, B:37:0x00be, B:39:0x00c8, B:41:0x00d2, B:43:0x00d6, B:44:0x00db, B:47:0x00e5, B:49:0x00f2, B:52:0x0112, B:55:0x0128, B:57:0x0131, B:59:0x013c, B:60:0x014d, B:63:0x0165, B:90:0x020a, B:92:0x025e, B:93:0x0261, B:125:0x0152, B:130:0x0263, B:131:0x0266, B:132:0x0110, B:133:0x0100, B:134:0x00e0, B:139:0x0267, B:54:0x011f), top: B:2:0x000a, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f8 A[Catch: all -> 0x0220, TRY_LEAVE, TryCatch #0 {all -> 0x0220, blocks: (B:85:0x01eb, B:87:0x01f8, B:99:0x024c, B:100:0x024e), top: B:84:0x01eb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(ArrayList arrayList) {
        swc swcVar;
        mg3 mg3Var;
        vu8 vu8Var;
        ArrayList arrayList2;
        ilh m;
        vu8 vu8Var2;
        ilh m2;
        ilh ilhVar;
        ilh ilhVar2;
        int[] iArr;
        uzc uzcVar;
        uzc uzcVar2;
        int[] iArr2;
        hn2 hn2Var;
        hn2 hn2Var2;
        hn2 hn2Var3;
        boolean z;
        boolean z2;
        int i;
        int i2;
        ilh ilhVar3;
        av8 av8Var = this;
        mg3 mg3Var2 = av8Var.b;
        hn2 hn2Var4 = av8Var.f;
        pf3 pf3Var = av8Var.M;
        hn2 hn2Var5 = pf3Var.b;
        try {
            pf3Var.b = hn2Var4;
            hn2Var4.k.l0(rud.c);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Pair pair = (Pair) arrayList.get(i4);
                twc twcVar = (twc) pair.a;
                twc twcVar2 = (twc) pair.b;
                vu8 J = o02.J(twcVar.e);
                jlh a = llh.a(twcVar.d);
                int a2 = a.a(J);
                z6a z6aVar = new z6a();
                pf3Var.b();
                evd evdVar = pf3Var.b.k;
                evdVar.l0(ztd.c);
                wba.I(evdVar, i3, z6aVar, 1, J);
                if (twcVar2 == null) {
                    if (a == av8Var.H) {
                        if (!av8Var.I.w) {
                            sf3.a("Check failed");
                        }
                        av8Var.y();
                    }
                    ilh m3 = a.m();
                    try {
                        m3.r(a2);
                        pf3Var.f = a2;
                        hn2 hn2Var6 = new hn2();
                        m61 m61Var = new m61(av8Var, hn2Var6, m3, twcVar, 9);
                        ilhVar3 = m3;
                        try {
                            av8Var = this;
                            av8Var.J(null, null, null, km5.a, m61Var);
                            hn2 hn2Var7 = pf3Var.b;
                            hn2Var7.getClass();
                            if (!hn2Var6.k.k0()) {
                                evd evdVar2 = hn2Var7.k;
                                evdVar2.l0(vtd.c);
                                wba.I(evdVar2, i3, hn2Var6, 1, z6aVar);
                            }
                            Unit unit = Unit.a;
                            ilhVar3.c();
                            mg3Var = mg3Var2;
                            i = size;
                            i2 = i4;
                        } catch (Throwable th) {
                            th = th;
                            ilhVar3.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ilhVar3 = m3;
                    }
                } else {
                    swc p = mg3Var2.p(twcVar2);
                    jlh a3 = p != null ? llh.a(p.a) : null;
                    jlh a4 = a3 == null ? llh.a(twcVar2.d) : a3;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (a3 != null) {
                                                                if (a3.g) {
                                                                    sf3.a("use active SlotWriter to create an anchor location instead");
                                                                }
                                                                if (a3.b <= 0) {
                                                                    h3f.a("Parameter index is out of range");
                                                                }
                                                                ArrayList arrayList3 = a3.i;
                                                                swcVar = p;
                                                                int c = llh.c(arrayList3, 0, a3.b);
                                                                if (c < 0) {
                                                                    mg3Var = mg3Var2;
                                                                    vu8Var = new vu8(0);
                                                                    arrayList3.add(-(c + 1), vu8Var);
                                                                } else {
                                                                    mg3Var = mg3Var2;
                                                                    vu8Var = (vu8) arrayList3.get(c);
                                                                }
                                                                if (vu8Var != null) {
                                                                    vu8 J2 = o02.J(vu8Var);
                                                                    arrayList2 = new ArrayList();
                                                                    m = a4.m();
                                                                    dy0.p(m, arrayList2, a4.a(J2));
                                                                    Unit unit2 = Unit.a;
                                                                    m.c();
                                                                    if (arrayList2.isEmpty()) {
                                                                        hn2 hn2Var8 = pf3Var.b;
                                                                        hn2Var8.getClass();
                                                                        if (arrayList2.isEmpty()) {
                                                                            vu8Var2 = J2;
                                                                        } else {
                                                                            evd evdVar3 = hn2Var8.k;
                                                                            evdVar3.l0(wtd.c);
                                                                            vu8Var2 = J2;
                                                                            wba.I(evdVar3, 1, arrayList2, 0, z6aVar);
                                                                        }
                                                                        jlh jlhVar = av8Var.c;
                                                                        if (a == jlhVar) {
                                                                            int a5 = jlhVar.a(J);
                                                                            av8Var.l0(a5, av8Var.p0(a5) + arrayList2.size());
                                                                        }
                                                                    } else {
                                                                        vu8Var2 = J2;
                                                                    }
                                                                    evd evdVar4 = pf3Var.b.k;
                                                                    evdVar4.l0(xtd.c);
                                                                    int i5 = evdVar4.h - evdVar4.c[evdVar4.d - 1].b;
                                                                    Object[] objArr = evdVar4.g;
                                                                    objArr[i5] = swcVar;
                                                                    objArr[i5 + 1] = mg3Var;
                                                                    objArr[i5 + 3] = twcVar;
                                                                    objArr[i5 + 2] = twcVar2;
                                                                    m2 = a4.m();
                                                                    ilhVar2 = av8Var.G;
                                                                    iArr = av8Var.o;
                                                                    uzcVar = av8Var.v;
                                                                    av8Var.o = null;
                                                                    av8Var.v = null;
                                                                    av8Var.G = m2;
                                                                    int a6 = a4.a(o02.J(vu8Var2));
                                                                    m2.r(a6);
                                                                    pf3Var.f = a6;
                                                                    hn2Var = new hn2();
                                                                    hn2Var2 = pf3Var.b;
                                                                    pf3Var.b = hn2Var;
                                                                    z = pf3Var.e;
                                                                    pf3Var.e = false;
                                                                    sg3 sg3Var = twcVar2.c;
                                                                    sg3 sg3Var2 = twcVar.c;
                                                                    Integer valueOf = Integer.valueOf(m2.g);
                                                                    List list = twcVar2.f;
                                                                    ilhVar = m2;
                                                                    i = size;
                                                                    iArr2 = iArr;
                                                                    uzcVar2 = uzcVar;
                                                                    z2 = z;
                                                                    i2 = i4;
                                                                    hn2Var3 = hn2Var2;
                                                                    av8Var.J(sg3Var, sg3Var2, valueOf, list, new ij8(6, av8Var, twcVar));
                                                                    pf3Var.e = z2;
                                                                    pf3Var.b = hn2Var3;
                                                                    hn2Var3.getClass();
                                                                    if (!hn2Var.k.k0()) {
                                                                        evd evdVar5 = hn2Var3.k;
                                                                        evdVar5.l0(vtd.c);
                                                                        wba.I(evdVar5, 0, hn2Var, 1, z6aVar);
                                                                    }
                                                                    av8Var.G = ilhVar2;
                                                                    av8Var.o = iArr2;
                                                                    av8Var.v = uzcVar2;
                                                                    ilhVar.c();
                                                                }
                                                            } else {
                                                                swcVar = p;
                                                                mg3Var = mg3Var2;
                                                            }
                                                            av8Var.G = ilhVar2;
                                                            av8Var.o = iArr2;
                                                            av8Var.v = uzcVar2;
                                                            ilhVar.c();
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            ilhVar.c();
                                                            throw th;
                                                        }
                                                        pf3Var.b = hn2Var3;
                                                        hn2Var3.getClass();
                                                        if (!hn2Var.k.k0()) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        av8Var.G = ilhVar2;
                                                        av8Var.o = iArr2;
                                                        av8Var.v = uzcVar2;
                                                        throw th;
                                                    }
                                                    pf3Var.e = z2;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    pf3Var.b = hn2Var3;
                                                    throw th;
                                                }
                                                av8Var.J(sg3Var, sg3Var2, valueOf, list, new ij8(6, av8Var, twcVar));
                                            } catch (Throwable th6) {
                                                th = th6;
                                                pf3Var.e = z2;
                                                throw th;
                                            }
                                            ilhVar = m2;
                                            i = size;
                                            iArr2 = iArr;
                                            uzcVar2 = uzcVar;
                                            z2 = z;
                                            i2 = i4;
                                            hn2Var3 = hn2Var2;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            hn2Var3 = hn2Var2;
                                            ilhVar = m2;
                                            iArr2 = iArr;
                                            uzcVar2 = uzcVar;
                                            z2 = z;
                                        }
                                        sg3 sg3Var22 = twcVar.c;
                                        Integer valueOf2 = Integer.valueOf(m2.g);
                                        List list2 = twcVar2.f;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        hn2Var3 = hn2Var2;
                                        z2 = z;
                                        ilhVar = m2;
                                        iArr2 = iArr;
                                        uzcVar2 = uzcVar;
                                    }
                                    pf3Var.e = false;
                                    sg3 sg3Var3 = twcVar2.c;
                                } catch (Throwable th9) {
                                    th = th9;
                                    uzcVar2 = uzcVar;
                                    hn2Var3 = hn2Var2;
                                    z2 = z;
                                    ilhVar = m2;
                                    iArr2 = iArr;
                                }
                                pf3Var.b = hn2Var;
                                z = pf3Var.e;
                            } catch (Throwable th10) {
                                th = th10;
                                uzcVar2 = uzcVar;
                                hn2Var3 = hn2Var2;
                                ilhVar = m2;
                                iArr2 = iArr;
                            }
                            av8Var.G = m2;
                            int a62 = a4.a(o02.J(vu8Var2));
                            m2.r(a62);
                            pf3Var.f = a62;
                            hn2Var = new hn2();
                            hn2Var2 = pf3Var.b;
                        } catch (Throwable th11) {
                            th = th11;
                            uzcVar2 = uzcVar;
                            ilhVar = m2;
                            iArr2 = iArr;
                        }
                        dy0.p(m, arrayList2, a4.a(J2));
                        Unit unit22 = Unit.a;
                        m.c();
                        if (arrayList2.isEmpty()) {
                        }
                        evd evdVar42 = pf3Var.b.k;
                        evdVar42.l0(xtd.c);
                        int i52 = evdVar42.h - evdVar42.c[evdVar42.d - 1].b;
                        Object[] objArr2 = evdVar42.g;
                        objArr2[i52] = swcVar;
                        objArr2[i52 + 1] = mg3Var;
                        objArr2[i52 + 3] = twcVar;
                        objArr2[i52 + 2] = twcVar2;
                        m2 = a4.m();
                        ilhVar2 = av8Var.G;
                        iArr = av8Var.o;
                        uzcVar = av8Var.v;
                        av8Var.o = null;
                        av8Var.v = null;
                    } catch (Throwable th12) {
                        m.c();
                        throw th12;
                    }
                    vu8Var = twcVar2.e;
                    vu8 J22 = o02.J(vu8Var);
                    arrayList2 = new ArrayList();
                    m = a4.m();
                }
                pf3Var.b.k.l0(tud.c);
                i4 = i2 + 1;
                size = i;
                mg3Var2 = mg3Var;
                i3 = 0;
            }
            pf3Var.b();
            pf3Var.b.k.l0(dud.c);
            pf3Var.f = 0;
            pf3Var.b = hn2Var5;
        } catch (Throwable th13) {
            pf3Var.b = hn2Var5;
            throw th13;
        }
    }

    public final void F(rwc rwcVar, aee aeeVar, Object obj, boolean z) {
        a0(126665345, rwcVar);
        G();
        o0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                mlh.y(this.I);
            }
            boolean z2 = (this.S || Intrinsics.c(this.G.f(), aeeVar)) ? false : true;
            if (z2) {
                M(aeeVar);
            }
            X(202, sf3.c, aeeVar, 0);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                iz8.v(this, new tc3(-59194059, new hl7(rwcVar, obj), true));
                this.w = z3;
            } else {
                this.J = true;
                mlh mlhVar = this.I;
                this.b.m(new twc(rwcVar, obj, this.h, this.H, mlhVar.b(mlhVar.F(mlhVar.v, mlhVar.b)), km5.a, m(), null));
            }
        } catch (Throwable th) {
            try {
                u6h.W(th, new xu8(1, this));
                throw th;
            } finally {
                s(false);
                this.K = null;
                this.T = j;
                s(false);
            }
        }
    }

    public final Object G() {
        boolean z = this.S;
        a99 a99Var = nf3.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof e4g)) {
                return m;
            }
        } else if (this.r) {
            sf3.a("A call to createNode(), emitNode() or useNode() expected");
            return a99Var;
        }
        return a99Var;
    }

    public final List H() {
        mg3 mg3Var = this.b;
        lg3 i = mg3Var.i();
        sg3 sg3Var = i != null ? (sg3) i : null;
        if (sg3Var == null) {
            return km5.a;
        }
        jlh jlhVar = sg3Var.f;
        ilh m = llh.a(jlhVar).m();
        try {
            Integer D = v9g.D(m, mg3Var, 0, m.c);
            if (D == null) {
                return km5.a;
            }
            m = llh.a(jlhVar).m();
            try {
                ArrayList N = v9g.N(m, D.intValue(), 0);
                m.c();
                return CollectionsKt.w0(sg3Var.v.H(), N);
            } finally {
            }
        } finally {
        }
    }

    public final int I(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(sg3 sg3Var, sg3 sg3Var2, Integer num, List list, Function0 function0) {
        Object invoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                eqf eqfVar = (eqf) pair.a;
                Object obj = pair.b;
                if (obj != null) {
                    j0(eqfVar, obj);
                } else {
                    j0(eqfVar, null);
                }
            }
            if (sg3Var != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (sg3Var2 == null || sg3Var2 == sg3Var || intValue < 0) {
                    invoke = function0.invoke();
                } else {
                    sg3Var.r = sg3Var2;
                    sg3Var.s = intValue;
                    try {
                        invoke = function0.invoke();
                        sg3Var.r = null;
                        sg3Var.s = 0;
                    } catch (Throwable th) {
                        sg3Var.r = null;
                        sg3Var.s = 0;
                        throw th;
                    }
                }
            }
            invoke = function0.invoke();
            this.F = z;
            this.k = i;
            return invoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        qaa qaaVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        h0d h0dVar;
        long j2;
        int t;
        int i8;
        int hashCode;
        Object b;
        int hashCode2;
        wib wibVar = wib.i;
        boolean z2 = this.F;
        this.F = true;
        ilh ilhVar = this.G;
        int i9 = ilhVar.i;
        int i10 = (i9 * 5) + 3;
        int i11 = ilhVar.b[i10] + i9;
        int i12 = this.k;
        long j3 = this.T;
        int i13 = this.l;
        int i14 = this.m;
        int i15 = ilhVar.g;
        ArrayList arrayList = this.s;
        int t2 = dy0.t(i15, arrayList);
        if (t2 < 0) {
            t2 = -(t2 + 1);
        }
        if (t2 < arrayList.size()) {
            qaaVar = (qaa) arrayList.get(t2);
        }
        qaaVar = null;
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (qaaVar != null) {
            eqf eqfVar = qaaVar.a;
            int i19 = qaaVar.b;
            wib wibVar2 = wibVar;
            int t3 = dy0.t(i19, arrayList);
            if (t3 >= 0) {
            }
            Object obj = qaaVar.c;
            if (obj == null) {
                eqfVar.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                x0d x0dVar = eqfVar.g;
                if (x0dVar == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof ay4) {
                        ay4 ay4Var = (ay4) obj;
                        foh fohVar = ay4Var.c;
                        if (fohVar == null) {
                            fohVar = wibVar2;
                        }
                        i2 = i12;
                        i6 = !fohVar.q(ay4Var.i().f, x0dVar.g(ay4Var)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof y0d) {
                            y0d y0dVar = (y0d) obj;
                            if (y0dVar.h()) {
                                Object[] objArr = y0dVar.b;
                                long[] jArr = y0dVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof ay4)) {
                                                        break;
                                                    }
                                                    ay4 ay4Var2 = (ay4) obj2;
                                                    foh fohVar2 = ay4Var2.c;
                                                    if (fohVar2 == null) {
                                                        fohVar2 = wibVar2;
                                                    }
                                                    if (!fohVar2.q(ay4Var2.i().f, x0dVar.g(ay4Var2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                        }
                                        if (i21 == length) {
                                            break;
                                        }
                                        i21++;
                                        i11 = i3;
                                        objArr = objArr2;
                                        i20 = 8;
                                    }
                                    i6 = 0;
                                }
                            }
                            i3 = i11;
                            i4 = i13;
                            i5 = i14;
                            i6 = 0;
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.G.r(i19);
                        int i24 = this.G.g;
                        N(i17, i24, i9);
                        int q = this.G.q(i24);
                        while (q != i9 && !this.G.l(q)) {
                            q = this.G.q(q);
                        }
                        int i25 = this.G.l(q) ? 0 : i2;
                        if (q != i24) {
                            int p0 = (p0(q) - this.G.o(i24)) + i25;
                            while (i25 < p0 && q != i19) {
                                q++;
                                while (q < i19) {
                                    ilh ilhVar2 = this.G;
                                    int i26 = ilhVar2.b[(q * 5) + 3] + q;
                                    if (i19 >= i26) {
                                        i25 += ilhVar2.l(q) ? i16 : p0(q);
                                        q = i26;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = i25;
                        this.m = I(i24);
                        int q2 = this.G.q(i24);
                        long j5 = 0;
                        int i27 = 3;
                        int i28 = 0;
                        while (true) {
                            if (q2 < 0) {
                                break;
                            }
                            if (q2 == i9) {
                                j5 ^= Long.rotateLeft(j3, i28);
                                break;
                            }
                            ilh ilhVar3 = this.G;
                            boolean k = ilhVar3.k(q2);
                            int[] iArr = ilhVar3.b;
                            i8 = i24;
                            if (k) {
                                Object p = ilhVar3.p(q2, iArr);
                                if (p != null) {
                                    if (p instanceof Enum) {
                                        hashCode2 = ((Enum) p).ordinal();
                                    } else if (p instanceof rwc) {
                                        hashCode = 126665345;
                                    } else {
                                        hashCode2 = p.hashCode();
                                    }
                                    hashCode = hashCode2;
                                } else {
                                    hashCode = 0;
                                }
                            } else {
                                int i29 = ilhVar3.i(q2);
                                hashCode = (i29 != 207 || (b = ilhVar3.b(q2, iArr)) == null || b.equals(nf3.a)) ? i29 : b.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j5 ^= Long.rotateLeft(hashCode, i28);
                                break;
                            }
                            j5 = (j5 ^ Long.rotateLeft(hashCode, i27)) ^ Long.rotateLeft(this.G.k(q2) ? 0 : I(q2), i28);
                            i27 = (i27 + 6) % 64;
                            i28 = (i28 + 6) % 64;
                            q2 = this.G.q(q2);
                            i24 = i8;
                        }
                        i8 = i24;
                        this.T = j5;
                        this.K = null;
                        Function2 function2 = eqfVar.d;
                        if (function2 == null) {
                            a70.r("Invalid restart scope");
                            return;
                        }
                        function2.invoke(this, Integer.valueOf(i16));
                        this.K = null;
                        ilh ilhVar4 = this.G;
                        int i30 = ilhVar4.b[i] + i9;
                        int i31 = ilhVar4.g;
                        if (i31 < i9 || i31 > i30) {
                            sf3.a("Index " + i9 + " is not a parent of " + i31);
                        }
                        ilhVar4.i = i9;
                        ilhVar4.h = i30;
                        ilhVar4.l = 0;
                        ilhVar4.m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(eqfVar);
                        this.g.t();
                        fqf fqfVar = eqfVar.a;
                        if (fqfVar == null || (h0dVar = eqfVar.f) == null) {
                            z = z2;
                        } else {
                            eqfVar.d(i16);
                            try {
                                Object[] objArr3 = h0dVar.b;
                                int[] iArr2 = h0dVar.c;
                                long[] jArr2 = h0dVar.a;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j6 = jArr2[i32];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j6 & 255) < 128) {
                                                    int i35 = (i32 << 3) + i34;
                                                    j2 = j6;
                                                    Object obj3 = objArr4[i35];
                                                    int i36 = iArr2[i35];
                                                    fqfVar.l(obj3);
                                                } else {
                                                    j2 = j6;
                                                }
                                                i34++;
                                                j6 = j2 >> 8;
                                            }
                                            if (i33 != 8) {
                                                break;
                                            }
                                        }
                                        if (i32 == length2) {
                                            break;
                                        }
                                        i32++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                eqfVar.d(false);
                            } catch (Throwable th) {
                                eqfVar.d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    t = dy0.t(this.G.g, arrayList);
                    if (t < 0) {
                        t = -(t + 1);
                    }
                    if (t >= arrayList.size()) {
                        qaa qaaVar2 = (qaa) arrayList.get(t);
                        i11 = i3;
                        if (qaaVar2.b < i11) {
                            qaaVar = qaaVar2;
                            z2 = z;
                            wibVar = wibVar2;
                            i10 = i;
                            i12 = i2;
                            i13 = i4;
                            i14 = i5;
                        }
                    } else {
                        i11 = i3;
                    }
                    qaaVar = null;
                    z2 = z;
                    wibVar = wibVar2;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            t = dy0.t(this.G.g, arrayList);
            if (t < 0) {
            }
            if (t >= arrayList.size()) {
            }
            qaaVar = null;
            z2 = z;
            wibVar = wibVar2;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i37 = i12;
        int i38 = i13;
        int i39 = i14;
        if (i18 != 0) {
            N(i17, i9, i9);
            this.G.t();
            int p02 = p0(i9);
            this.k = i37 + p02;
            this.l = i38 + p02;
            this.m = i39;
        } else {
            V();
        }
        this.T = j3;
        this.F = z3;
    }

    public final void L() {
        P(this.G.g);
        pf3 pf3Var = this.M;
        pf3Var.d(false);
        pf3Var.e();
        pf3Var.b.k.l0(pud.c);
        int i = pf3Var.f;
        ilh ilhVar = pf3Var.a.G;
        pf3Var.f = ilhVar.b[(ilhVar.g * 5) + 3] + i;
    }

    public final void M(aee aeeVar) {
        uzc uzcVar = this.v;
        if (uzcVar == null) {
            uzcVar = new uzc();
            this.v = uzcVar;
        }
        uzcVar.i(this.G.g, aeeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(int i, int i2, int i3) {
        ilh ilhVar = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (ilhVar.q(i) == i2) {
                    i3 = i2;
                } else if (ilhVar.q(i2) != i) {
                    if (ilhVar.q(i) == ilhVar.q(i2)) {
                        i3 = ilhVar.q(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = ilhVar.q(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = ilhVar.q(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = ilhVar.q(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = ilhVar.q(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = ilhVar.q(i14)) {
                            i3 = ilhVar.q(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!ilhVar.l(i)) {
                    this.M.a();
                }
                i = ilhVar.q(i);
            }
            q(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!ilhVar.l(i)) {
            }
            i = ilhVar.q(i);
        }
        q(i2, i3);
    }

    public final Object O() {
        boolean z = this.S;
        a99 a99Var = nf3.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof e4g)) {
                return m instanceof ev8 ? ((ev8) m).a : m;
            }
        } else if (this.r) {
            sf3.a("A call to createNode(), emitNode() or useNode() expected");
            return a99Var;
        }
        return a99Var;
    }

    public final void P(int i) {
        boolean l = this.G.l(i);
        pf3 pf3Var = this.M;
        if (l) {
            pf3Var.c();
            Object n = this.G.n(i);
            pf3Var.c();
            pf3Var.h.add(n);
        }
        S(this, i, i, l, 0);
        pf3Var.c();
        if (l) {
            pf3Var.a();
        }
    }

    public final boolean T(int i, boolean z) {
        eqf A;
        if ((i & 1) == 0 && (this.S || this.y)) {
            vfh vfhVar = this.P;
            if (vfhVar != null && (A = A()) != null && vfhVar.e()) {
                int i2 = A.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                A.b = i3;
                A.b = (this.y ? i2 | 129 : i3 & (-129)) | NotificationCompat.FLAG_LOCAL_ONLY;
                evd evdVar = this.M.b.k;
                evdVar.l0(oud.c);
                wba.H(evdVar, 0, A);
                this.b.t(A);
                return false;
            }
        } else if (!z && D()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        long rotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        ilh ilhVar = this.G;
        int g = ilhVar.g();
        int[] iArr = ilhVar.b;
        int i = ilhVar.g;
        Object p = i < ilhVar.h ? ilhVar.p(i, iArr) : null;
        Object f = ilhVar.f();
        int i2 = this.m;
        a99 a99Var = nf3.a;
        if (p != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode()), 3);
        } else {
            if (f != null && g == 207 && !f.equals(a99Var)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ f.hashCode(), 3) ^ i2;
                c0(null, (iArr[(ilhVar.g * 5) + 1] & 1073741824) != 0);
                K();
                ilhVar.e();
                if (p == null) {
                    if (p instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((Enum) p).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ p.hashCode(), 3);
                        return;
                    }
                }
                if (f == null || g != 207 || f.equals(a99Var)) {
                    this.T = Long.rotateRight(g ^ Long.rotateRight(this.T ^ i2, 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i2, 3) ^ f.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g, 3) ^ i2;
        }
        this.T = rotateLeft;
        c0(null, (iArr[(ilhVar.g * 5) + 1] & 1073741824) != 0);
        K();
        ilhVar.e();
        if (p == null) {
        }
    }

    public final void V() {
        ilh ilhVar = this.G;
        int i = ilhVar.i;
        this.l = i >= 0 ? ilhVar.b[(i * 5) + 1] & 67108863 : 0;
        ilhVar.t();
    }

    public final void W() {
        if (this.l != 0) {
            sf3.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        eqf A = A();
        if (A != null) {
            int i = A.b;
            if ((i & 128) == 0) {
                A.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            V();
        } else {
            K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i, Object obj, Object obj2, int i2) {
        long rotateLeft;
        boolean z;
        dv8 dv8Var;
        dv8 dv8Var2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Object obj3 = obj;
        if (this.r) {
            sf3.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i8 = this.m;
        Object obj4 = nf3.a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i8;
                if (obj3 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    mlh mlhVar = this.I;
                    int i9 = mlhVar.t;
                    if (z3) {
                        mlhVar.R(obj4, obj4, true, i);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        mlhVar.R(obj3, obj2, false, i);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        mlhVar.R(obj3, obj4, false, i);
                    }
                    dv8 dv8Var3 = this.j;
                    if (dv8Var3 != null) {
                        int i10 = (-2) - i9;
                        uia uiaVar = new uia(i, -1, i10, -1);
                        dv8Var3.e.i(i10, new x39(-1, this.k - dv8Var3.b, 0));
                        dv8Var3.d.add(uiaVar);
                    }
                    x(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int g = this.G.g();
                    if (!z4 && g == i) {
                        ilh ilhVar = this.G;
                        int i11 = ilhVar.g;
                        if (Intrinsics.c(obj3, i11 < ilhVar.h ? ilhVar.p(i11, ilhVar.b) : null)) {
                            c0(obj2, z3);
                        }
                    }
                    ilh ilhVar2 = this.G;
                    int[] iArr = ilhVar2.b;
                    ArrayList arrayList = new ArrayList();
                    if (ilhVar2.k <= 0) {
                        int i12 = ilhVar2.g;
                        while (i12 < ilhVar2.h) {
                            int i13 = i12 * 5;
                            int i14 = iArr[i13];
                            Object p = ilhVar2.p(i12, iArr);
                            int i15 = iArr[i13 + 1];
                            if ((i15 & 1073741824) != 0) {
                                z2 = z4;
                                i7 = 1;
                            } else {
                                z2 = z4;
                                i7 = i15 & 67108863;
                            }
                            arrayList.add(new uia(i14, p, i12, i7));
                            i12 += iArr[i13 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new dv8(arrayList, this.k);
                    dv8Var = this.j;
                    if (dv8Var != null) {
                        ArrayList arrayList2 = dv8Var.d;
                        uzc uzcVar = dv8Var.e;
                        int i16 = dv8Var.b;
                        Object teaVar = obj3 != null ? new tea(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        x0d x0dVar = ((uyc) dv8Var.f.getValue()).a;
                        Object g2 = x0dVar.g(teaVar);
                        if (g2 == null) {
                            g2 = null;
                        } else if (g2 instanceof l0d) {
                            l0d l0dVar = (l0d) g2;
                            Object k = l0dVar.k(0);
                            if (l0dVar.h()) {
                                x0dVar.k(teaVar);
                            }
                            if (l0dVar.b == 1) {
                                x0dVar.m(teaVar, l0dVar.e());
                            }
                            g2 = k;
                        } else {
                            x0dVar.k(teaVar);
                        }
                        uia uiaVar2 = (uia) g2;
                        if (z || uiaVar2 == null) {
                            this.G.k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.w) {
                                mlh n = this.H.n();
                                this.I = n;
                                n.N();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            mlh mlhVar2 = this.I;
                            int i17 = mlhVar2.t;
                            if (z3) {
                                mlhVar2.R(obj4, obj4, true, i);
                                i3 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i3 = 0;
                                mlhVar2.R(obj4, obj2, false, i);
                            } else {
                                i3 = 0;
                                mlhVar2.R(obj == null ? obj4 : obj, obj4, false, i);
                            }
                            this.N = this.I.b(i17);
                            int i18 = (-2) - i17;
                            uia uiaVar3 = new uia(i, -1, i18, -1);
                            uzcVar.i(i18, new x39(-1, this.k - i16, i3));
                            arrayList2.add(uiaVar3);
                            dv8Var2 = new dv8(new ArrayList(), z3 ? i3 : this.k);
                            x(z3, dv8Var2);
                            return;
                        }
                        int i19 = uiaVar2.c;
                        arrayList2.add(uiaVar2);
                        x39 x39Var = (x39) uzcVar.b(i19);
                        this.k = (x39Var != null ? x39Var.b : -1) + i16;
                        x39 x39Var2 = (x39) uzcVar.b(i19);
                        int i20 = x39Var2 != null ? x39Var2.a : -1;
                        int i21 = dv8Var.c;
                        int i22 = i20 - i21;
                        int i23 = 8;
                        if (i20 > i21) {
                            Object[] objArr3 = uzcVar.c;
                            long[] jArr = uzcVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j = jArr[i24];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i25 = 8 - ((~(i24 - length)) >>> 31);
                                        int i26 = 0;
                                        while (i26 < i25) {
                                            if ((j & 255) < 128) {
                                                i6 = i23;
                                                x39 x39Var3 = (x39) objArr3[(i24 << 3) + i26];
                                                i5 = i22;
                                                int i27 = x39Var3.a;
                                                if (i27 == i20) {
                                                    x39Var3.a = i21;
                                                } else if (i21 <= i27 && i27 < i20) {
                                                    x39Var3.a = i27 + 1;
                                                }
                                            } else {
                                                i5 = i22;
                                                i6 = i23;
                                            }
                                            j >>= i6;
                                            i26++;
                                            i23 = i6;
                                            i22 = i5;
                                        }
                                        i4 = i22;
                                        if (i25 != i23) {
                                            break;
                                        }
                                    } else {
                                        i4 = i22;
                                    }
                                    if (i24 == length) {
                                        break;
                                    }
                                    i24++;
                                    i22 = i4;
                                    i23 = 8;
                                }
                            } else {
                                i4 = i22;
                            }
                        } else {
                            i4 = i22;
                            if (i21 > i20) {
                                Object[] objArr4 = uzcVar.c;
                                long[] jArr2 = uzcVar.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i28 = 0;
                                    while (true) {
                                        long j2 = jArr2[i28];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                            int i30 = 0;
                                            while (i30 < i29) {
                                                if ((j2 & 255) < 128) {
                                                    x39 x39Var4 = (x39) objArr4[(i28 << 3) + i30];
                                                    int i31 = x39Var4.a;
                                                    if (i31 == i20) {
                                                        x39Var4.a = i21;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i20 + 1 <= i31 && i31 < i21) {
                                                            x39Var4.a = i31 - 1;
                                                        }
                                                        j2 >>= 8;
                                                        i30++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j2 >>= 8;
                                                i30++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i29 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i28 == length2) {
                                            break;
                                        }
                                        i28++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        pf3 pf3Var = this.M;
                        pf3Var.f = (i19 - pf3Var.a.G.g) + pf3Var.f;
                        this.G.r(i19);
                        if (i4 > 0) {
                            pf3Var.d(false);
                            pf3Var.e();
                            evd evdVar = pf3Var.b.k;
                            evdVar.l0(kud.c);
                            evdVar.e[evdVar.f - evdVar.c[evdVar.d - 1].a] = i4;
                        }
                        c0(obj2, z3);
                    }
                    dv8Var2 = null;
                    x(z3, dv8Var2);
                    return;
                }
                z = z4;
                dv8Var = this.j;
                if (dv8Var != null) {
                }
                dv8Var2 = null;
                x(z3, dv8Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ i8;
        }
        this.T = rotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void Y() {
        X(-127, null, null, 0);
    }

    public final void Z(int i, otd otdVar) {
        X(i, otdVar, null, 0);
    }

    public final void a() {
        j();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        t68 t68Var = this.O;
        t68Var.d.i0();
        t68Var.c.i0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        ilh ilhVar = this.G;
        if (!ilhVar.f) {
            ilhVar.c();
        }
        if (this.I.w) {
            return;
        }
        y();
    }

    public final void a0(int i, Object obj) {
        X(i, obj, null, 0);
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            evd evdVar = this.O.c;
            evdVar.l0(zud.c);
            wba.H(evdVar, 0, obj);
            function2.getClass();
            i5k.e(2, function2);
            wba.H(evdVar, 1, function2);
            return;
        }
        pf3 pf3Var = this.M;
        pf3Var.b();
        evd evdVar2 = pf3Var.b.k;
        evdVar2.l0(zud.c);
        function2.getClass();
        i5k.e(2, function2);
        wba.I(evdVar2, 0, obj, 1, function2);
    }

    public final void b0() {
        X(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, null, 1);
        this.r = true;
    }

    public final boolean c(double d) {
        Object G = G();
        if ((G instanceof Double) && d == ((Number) G).doubleValue()) {
            return false;
        }
        o0(Double.valueOf(d));
        return true;
    }

    public final void c0(Object obj, boolean z) {
        if (z) {
            ilh ilhVar = this.G;
            if (ilhVar.k <= 0) {
                if ((ilhVar.b[(ilhVar.g * 5) + 1] & 1073741824) == 0) {
                    h3f.a("Expected a node group");
                }
                ilhVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            pf3 pf3Var = this.M;
            pf3Var.getClass();
            pf3Var.d(false);
            evd evdVar = pf3Var.b.k;
            evdVar.l0(yud.c);
            wba.H(evdVar, 0, obj);
        }
        this.G.u();
    }

    public final boolean d(float f) {
        Object G = G();
        if ((G instanceof Float) && f == ((Number) G).floatValue()) {
            return false;
        }
        o0(Float.valueOf(f));
        return true;
    }

    public final void d0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            X(i, null, null, 0);
            return;
        }
        if (this.r) {
            sf3.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        ilh ilhVar = this.G;
        boolean z = this.S;
        a99 a99Var = nf3.a;
        if (z) {
            ilhVar.k++;
            this.I.R(a99Var, a99Var, false, i);
            x(false, null);
            return;
        }
        if (ilhVar.g() == i && ((i3 = ilhVar.g) >= ilhVar.h || (ilhVar.b[(i3 * 5) + 1] & 536870912) == 0)) {
            ilhVar.u();
            x(false, null);
            return;
        }
        if (ilhVar.k <= 0 && (i2 = ilhVar.g) != ilhVar.h) {
            int i4 = this.k;
            L();
            this.M.f(i4, ilhVar.s());
            dy0.E(this.s, i2, ilhVar.g);
        }
        ilhVar.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            mlh n = this.H.n();
            this.I = n;
            n.N();
            this.J = false;
            this.K = null;
        }
        mlh mlhVar = this.I;
        mlhVar.d();
        int i5 = mlhVar.t;
        mlhVar.R(a99Var, a99Var, false, i);
        this.N = mlhVar.b(i5);
        x(false, null);
    }

    public final boolean e(int i) {
        Object G = G();
        if ((G instanceof Integer) && i == ((Number) G).intValue()) {
            return false;
        }
        o0(Integer.valueOf(i));
        return true;
    }

    public final void e0(int i) {
        X(i, null, null, 0);
    }

    public final boolean f(long j) {
        Object G = G();
        if ((G instanceof Long) && j == ((Number) G).longValue()) {
            return false;
        }
        o0(Long.valueOf(j));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final av8 f0(int i) {
        eqf eqfVar;
        boolean z;
        int i2;
        d0(i);
        boolean z2 = this.S;
        hpo hpoVar = this.g;
        ArrayList arrayList = this.E;
        sg3 sg3Var = this.h;
        if (z2) {
            eqf eqfVar2 = new eqf(sg3Var);
            arrayList.add(eqfVar2);
            o0(eqfVar2);
            eqfVar2.e = this.B;
            eqfVar2.b &= -17;
            hpoVar.t();
            return this;
        }
        int i3 = this.G.i;
        ArrayList arrayList2 = this.s;
        int t = dy0.t(i3, arrayList2);
        qaa qaaVar = t >= 0 ? (qaa) arrayList2.remove(t) : null;
        Object m = this.G.m();
        if (Intrinsics.c(m, nf3.a)) {
            eqfVar = new eqf(sg3Var);
            o0(eqfVar);
        } else {
            m.getClass();
            eqfVar = (eqf) m;
        }
        if (qaaVar == null) {
            int i4 = eqfVar.b;
            boolean z3 = (i4 & 64) != 0;
            if (z3) {
                eqfVar.b = i4 & (-65);
            }
            if (!z3) {
                z = false;
                int i5 = eqfVar.b;
                eqfVar.b = !z ? i5 | 8 : i5 & (-9);
                arrayList.add(eqfVar);
                eqfVar.e = this.B;
                eqfVar.b &= -17;
                hpoVar.t();
                i2 = eqfVar.b;
                if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    eqfVar.b = (i2 & (-257)) | 512;
                    evd evdVar = this.M.b.k;
                    evdVar.l0(uud.c);
                    wba.H(evdVar, 0, eqfVar);
                    if (!this.y) {
                        int i6 = eqfVar.b;
                        if ((i6 & 128) != 0) {
                            this.y = true;
                            this.z = this.G.i;
                            eqfVar.b = i6 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i52 = eqfVar.b;
        eqfVar.b = !z ? i52 | 8 : i52 & (-9);
        arrayList.add(eqfVar);
        eqfVar.e = this.B;
        eqfVar.b &= -17;
        hpoVar.t();
        i2 = eqfVar.b;
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
        }
        return this;
    }

    public final boolean g(Object obj) {
        if (Intrinsics.c(G(), obj)) {
            return false;
        }
        o0(obj);
        return true;
    }

    public final void g0(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.c(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        X(207, null, obj, 0);
    }

    public final boolean h(boolean z) {
        Object G = G();
        if ((G instanceof Boolean) && z == ((Boolean) G).booleanValue()) {
            return false;
        }
        o0(Boolean.valueOf(z));
        return true;
    }

    public final void h0() {
        X(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, null, 2);
        this.r = true;
    }

    public final boolean i(Object obj) {
        if (G() == obj) {
            return false;
        }
        o0(obj);
        return true;
    }

    public final void i0() {
        this.m = 0;
        this.G = this.c.m();
        X(100, null, null, 0);
        mg3 mg3Var = this.b;
        mg3Var.w();
        aee j = mg3Var.j();
        this.x.e(this.w ? 1 : 0);
        this.w = g(j);
        this.K = null;
        if (!this.q) {
            this.q = mg3Var.f();
        }
        boolean z = this.C;
        if (!z) {
            z = mg3Var.g();
            this.C = z;
        }
        if (z) {
            ff5 ff5Var = rg3.a;
            ff5Var.getClass();
            j = j.j(ff5Var, new gei(C()));
        }
        this.u = j;
        Set set = (Set) ktm.I(j, g5a.a);
        if (set != null) {
            set.add(z());
            mg3Var.r(set);
        }
        X(Long.hashCode(mg3Var.h()), null, null, 0);
    }

    public final void j() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        pf3 pf3Var = this.M;
        pf3Var.c = false;
        pf3Var.d.b = 0;
        pf3Var.f = 0;
        pf3Var.e = true;
        pf3Var.g = 0;
        pf3Var.h.clear();
        pf3Var.i = -1;
        pf3Var.j = -1;
        pf3Var.k = -1;
        pf3Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final boolean j0(eqf eqfVar, Object obj) {
        vu8 vu8Var = eqfVar.c;
        if (vu8Var == null) {
            return false;
        }
        int a = this.G.a.a(o02.J(vu8Var));
        if (!this.F || a < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int t = dy0.t(a, arrayList);
        if (t < 0) {
            int i = -(t + 1);
            if (!(obj instanceof ay4)) {
                obj = null;
            }
            arrayList.add(i, new qaa(eqfVar, a, obj));
            return true;
        }
        qaa qaaVar = (qaa) arrayList.get(t);
        if (!(obj instanceof ay4)) {
            qaaVar.c = null;
            return true;
        }
        Object obj2 = qaaVar.c;
        if (obj2 == null) {
            qaaVar.c = obj;
            return true;
        }
        if (obj2 instanceof y0d) {
            ((y0d) obj2).a(obj);
            return true;
        }
        y0d y0dVar = rrg.a;
        y0d y0dVar2 = new y0d(2);
        y0dVar2.k(obj2);
        y0dVar2.k(obj);
        qaaVar.c = y0dVar2;
        return true;
    }

    public final Object k(d dVar) {
        return ktm.I(m(), dVar);
    }

    public final void k0(x0d x0dVar) {
        ArrayList arrayList = this.s;
        for (int i = b.i(arrayList); -1 < i; i--) {
            qaa qaaVar = (qaa) arrayList.get(i);
            vu8 vu8Var = qaaVar.a.c;
            vu8 J = vu8Var != null ? o02.J(vu8Var) : null;
            if (J == null || !J.a()) {
                arrayList.remove(i);
            } else {
                int i2 = qaaVar.b;
                int i3 = J.a;
                if (i2 != i3) {
                    qaaVar.b = i3;
                }
            }
        }
        Object[] objArr = x0dVar.b;
        Object[] objArr2 = x0dVar.c;
        long[] jArr = x0dVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            obj.getClass();
                            eqf eqfVar = (eqf) obj;
                            vu8 vu8Var2 = eqfVar.c;
                            if (vu8Var2 != null) {
                                int i8 = o02.J(vu8Var2).a;
                                if (obj2 == hjg.g) {
                                    obj2 = null;
                                }
                                arrayList.add(new qaa(eqfVar, i8, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        n13.u(dy0.k, arrayList);
    }

    public final void l(Function0 function0) {
        if (!this.r) {
            sf3.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            sf3.a("createNode() can only be called when inserting");
        }
        e7a e7aVar = this.n;
        int i = e7aVar.a[e7aVar.b - 1];
        mlh mlhVar = this.I;
        vu8 b = mlhVar.b(mlhVar.v);
        this.l++;
        t68 t68Var = this.O;
        evd evdVar = t68Var.c;
        evdVar.l0(hud.d);
        wba.H(evdVar, 0, function0);
        evdVar.e[evdVar.f - evdVar.c[evdVar.d - 1].a] = i;
        wba.H(evdVar, 1, b);
        evd evdVar2 = t68Var.d;
        evdVar2.l0(hud.e);
        evdVar2.e[evdVar2.f - evdVar2.c[evdVar2.d - 1].a] = i;
        wba.H(evdVar2, 0, b);
    }

    public final void l0(int i, int i2) {
        if (p0(i) != i2) {
            if (i < 0) {
                szc szcVar = this.p;
                if (szcVar == null) {
                    szcVar = new szc();
                    this.p = szcVar;
                }
                szcVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final aee m() {
        aee aeeVar = this.K;
        return aeeVar != null ? aeeVar : n(this.G.i);
    }

    public final void m0(int i, int i2) {
        int p0 = p0(i);
        if (p0 != i2) {
            int i3 = i2 - p0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int p02 = p0(i) + i3;
                l0(i, p02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        dv8 dv8Var = (dv8) arrayList.get(i4);
                        if (dv8Var != null && dv8Var.a(i, p02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                ilh ilhVar = this.G;
                if (i < 0) {
                    i = ilhVar.i;
                } else if (ilhVar.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final aee n(int i) {
        aee aeeVar;
        boolean z = this.S;
        otd otdVar = sf3.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.r(i2) == 202 && Intrinsics.c(this.I.s(i2), otdVar)) {
                    Object p = this.I.p(i2);
                    p.getClass();
                    aee aeeVar2 = (aee) p;
                    this.K = aeeVar2;
                    return aeeVar2;
                }
                mlh mlhVar = this.I;
                i2 = mlhVar.F(i2, mlhVar.b);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    ilh ilhVar = this.G;
                    if (Intrinsics.c(ilhVar.p(i, ilhVar.b), otdVar)) {
                        uzc uzcVar = this.v;
                        if (uzcVar == null || (aeeVar = (aee) uzcVar.b(i)) == null) {
                            ilh ilhVar2 = this.G;
                            Object b = ilhVar2.b(i, ilhVar2.b);
                            b.getClass();
                            aeeVar = (aee) b;
                        }
                        this.K = aeeVar;
                        return aeeVar;
                    }
                }
                i = this.G.q(i);
            }
        }
        aee aeeVar3 = this.u;
        this.K = aeeVar3;
        return aeeVar3;
    }

    public final void n0(Object obj) {
        if (obj instanceof swf) {
            ev8 ev8Var = new ev8((swf) obj, this.m - 1);
            if (this.S) {
                evd evdVar = this.M.b.k;
                evdVar.l0(nud.c);
                wba.H(evdVar, 0, ev8Var);
            }
            this.d.add(obj);
            obj = ev8Var;
        }
        o0(obj);
    }

    public final df3 o() {
        Collection collection;
        if (!this.b.l()) {
            return null;
        }
        xbb b = a.b();
        mlh mlhVar = this.I;
        b.addAll(v9g.w(mlhVar, null, mlhVar.t, null));
        ilh ilhVar = this.G;
        boolean z = ilhVar.f;
        int[] iArr = ilhVar.b;
        if (z || ilhVar.c == 0) {
            collection = km5.a;
        } else {
            gof gofVar = new gof(ilhVar);
            int i = ilhVar.i;
            Object valueOf = Integer.valueOf(ilhVar.l - llh.d(i, iArr));
            while (i >= 0) {
                gofVar.E(ilhVar.i(i), ilhVar.k(i) ? ilhVar.p(i, iArr) : nf3.a, ilhVar.a.p(i), valueOf);
                valueOf = ilhVar.a(i);
                i = ilhVar.q(i);
            }
            collection = (ArrayList) gofVar.b;
        }
        b.addAll(collection);
        b.addAll(H());
        return new df3(a.a(b), this.C);
    }

    public final void o0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        ilh ilhVar = this.G;
        boolean z = ilhVar.n;
        pf3 pf3Var = this.M;
        if (!z) {
            vu8 a = ilhVar.a(ilhVar.i);
            evd evdVar = pf3Var.b.k;
            evdVar.l0(utd.c);
            wba.I(evdVar, 0, a, 1, obj);
            return;
        }
        int d = (ilhVar.l - llh.d(ilhVar.i, ilhVar.b)) - 1;
        if (pf3Var.a.G.i - pf3Var.f >= 0) {
            pf3Var.d(true);
            evd evdVar2 = pf3Var.b.k;
            evdVar2.l0(hud.g);
            wba.H(evdVar2, 0, obj);
            evdVar2.e[evdVar2.f - evdVar2.c[evdVar2.d - 1].a] = d;
            return;
        }
        ilh ilhVar2 = this.G;
        vu8 a2 = ilhVar2.a(ilhVar2.i);
        evd evdVar3 = pf3Var.b.k;
        evdVar3.l0(hud.f);
        wba.I(evdVar3, 0, obj, 1, a2);
        evdVar3.e[evdVar3.f - evdVar3.c[evdVar3.d - 1].a] = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(x0d x0dVar, Function2 function2) {
        ArrayList arrayList = this.s;
        if (this.F) {
            sf3.a("Reentrant composition is not supported");
        }
        this.g.t();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(snh.h().g());
            this.v = null;
            k0(x0dVar);
            this.k = 0;
            this.F = true;
            try {
                i0();
                Object G = G();
                if (G != function2 && function2 != null) {
                    Function2 function22 = function2;
                    o0(function2);
                }
                zu8 zu8Var = this.D;
                i1d a = goh.a();
                try {
                    a.b(zu8Var);
                    otd otdVar = sf3.a;
                    if (function2 != null) {
                        Z(200, otdVar);
                        iz8.v(this, function2);
                        s(false);
                    } else if (!this.w || G == null || G.equals(nf3.a)) {
                        U();
                    } else {
                        Z(200, otdVar);
                        i5k.e(2, G);
                        iz8.v(this, (Function2) G);
                        s(false);
                    }
                    a.r(a.c - 1);
                    w();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        sf3.a("Check failed");
                    }
                    y();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    a.r(a.c - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final int p0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        szc szcVar = this.p;
        if (szcVar != null && szcVar.c(i) >= 0) {
            int c = szcVar.c(i);
            if (c >= 0) {
                return szcVar.c[c];
            }
            ogj.m(ljg.j(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final void q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        q(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object n = this.G.n(i);
            pf3 pf3Var = this.M;
            pf3Var.c();
            pf3Var.h.add(n);
        }
    }

    public final void q0() {
        if (!this.r) {
            sf3.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            sf3.a("useNode() called while inserting");
        }
        ilh ilhVar = this.G;
        Object n = ilhVar.n(ilhVar.i);
        pf3 pf3Var = this.M;
        pf3Var.c();
        pf3Var.h.add(n);
        if (this.y && (n instanceof qe3)) {
            pf3Var.b();
            pf3Var.b.k.l0(bvd.c);
        }
    }

    public final void r() {
        this.y = this.z >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04cc  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z) {
        long rotateRight;
        e7a e7aVar;
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        int i3;
        ilh ilhVar;
        dv8 dv8Var;
        ?? r5;
        int i4;
        e7a e7aVar2;
        int i5;
        int i6;
        ArrayList arrayList2;
        y0d y0dVar;
        int i7;
        int i8;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i9;
        dv8 dv8Var2;
        int i10;
        Object[] objArr;
        long[] jArr;
        int i11;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        Object[] objArr3;
        long[] jArr3;
        int i13;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        e7a e7aVar3 = this.n;
        int i14 = e7aVar3.a[e7aVar3.b - 2] - 1;
        boolean z3 = this.S;
        a99 a99Var = nf3.a;
        if (z3) {
            mlh mlhVar = this.I;
            int i15 = mlhVar.v;
            int r = mlhVar.r(i15);
            Object s = this.I.s(i15);
            Object p = this.I.p(i15);
            if (s != null) {
                rotateRight2 = Long.rotateRight(this.T, 3) ^ (s instanceof Enum ? ((Enum) s).ordinal() : s.hashCode());
            } else if (p == null || r != 207 || p.equals(a99Var)) {
                rotateRight2 = Long.rotateRight(this.T ^ i14, 3) ^ r;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i14, 3) ^ p.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            ilh ilhVar2 = this.G;
            int i16 = ilhVar2.i;
            int i17 = ilhVar2.i(i16);
            ilh ilhVar3 = this.G;
            Object p2 = ilhVar3.p(i16, ilhVar3.b);
            ilh ilhVar4 = this.G;
            Object b = ilhVar4.b(i16, ilhVar4.b);
            if (p2 != null) {
                rotateRight = Long.rotateRight(this.T, 3) ^ (p2 instanceof Enum ? ((Enum) p2).ordinal() : p2.hashCode());
            } else if (b == null || i17 != 207 || b.equals(a99Var)) {
                rotateRight = Long.rotateRight(this.T ^ i14, 3) ^ i17;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i14, 3) ^ b.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i18 = this.l;
        dv8 dv8Var3 = this.j;
        ArrayList arrayList5 = this.s;
        pf3 pf3Var = this.M;
        if (dv8Var3 != null) {
            uzc uzcVar = dv8Var3.e;
            int i19 = dv8Var3.b;
            ArrayList arrayList6 = dv8Var3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = dv8Var3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i20 = 0; i20 < size; i20++) {
                    hashSet2.add(arrayList7.get(i20));
                }
                i2 = -1;
                y0d y0dVar2 = rrg.a;
                y0d y0dVar3 = new y0d();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                i = 1;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size3) {
                    uia uiaVar = (uia) arrayList6.get(i21);
                    if (hashSet2.contains(uiaVar)) {
                        e7aVar2 = e7aVar3;
                        i5 = i21;
                        if (!y0dVar3.c(uiaVar)) {
                            int i24 = i22;
                            if (i24 < size2) {
                                uia uiaVar2 = (uia) arrayList7.get(i24);
                                if (uiaVar2 != uiaVar) {
                                    x39 x39Var = (x39) uzcVar.b(uiaVar2.c);
                                    int i25 = x39Var != null ? x39Var.b : -1;
                                    y0dVar3.a(uiaVar2);
                                    i6 = i24;
                                    i9 = i23;
                                    dv8Var2 = dv8Var3;
                                    if (i25 != i9) {
                                        x39 x39Var2 = (x39) uzcVar.b(uiaVar2.c);
                                        int i26 = x39Var2 != null ? x39Var2.c : uiaVar2.d;
                                        y0dVar = y0dVar3;
                                        int i27 = i25 + i19;
                                        i7 = size2;
                                        int i28 = i9 + i19;
                                        if (i26 > 0) {
                                            i8 = i19;
                                            int i29 = pf3Var.l;
                                            if (i29 > 0) {
                                                arrayList3 = arrayList6;
                                                if (pf3Var.j == i27 - i29 && pf3Var.k == i28 - i29) {
                                                    pf3Var.l = i29 + i26;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            pf3Var.c();
                                            pf3Var.j = i27;
                                            pf3Var.k = i28;
                                            pf3Var.l = i26;
                                        } else {
                                            i8 = i19;
                                            arrayList3 = arrayList6;
                                            pf3Var.getClass();
                                        }
                                        if (i25 > i9) {
                                            Object[] objArr5 = uzcVar.c;
                                            long[] jArr5 = uzcVar.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i30 = 0;
                                                while (true) {
                                                    long j = jArr5[i30];
                                                    int i31 = i26;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i32 = 8 - ((~(i30 - length)) >>> 31);
                                                        int i33 = 0;
                                                        while (i33 < i32) {
                                                            if ((j & 255) < 128) {
                                                                i13 = i33;
                                                                x39 x39Var3 = (x39) objArr5[(i30 << 3) + i33];
                                                                objArr4 = objArr5;
                                                                int i34 = x39Var3.b;
                                                                jArr4 = jArr5;
                                                                if (i25 <= i34 && i34 < i25 + i31) {
                                                                    x39Var3.b = (i34 - i25) + i9;
                                                                } else if (i9 <= i34 && i34 < i25) {
                                                                    x39Var3.b = i34 + i31;
                                                                }
                                                            } else {
                                                                i13 = i33;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i33 = i13 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i32 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i30 == length) {
                                                        break;
                                                    }
                                                    i30++;
                                                    arrayList5 = arrayList2;
                                                    i26 = i31;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i35 = i26;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i9 > i25) {
                                                Object[] objArr6 = uzcVar.c;
                                                long[] jArr6 = uzcVar.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i36 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i36];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i37 = 8 - ((~(i36 - length2)) >>> 31);
                                                            int i38 = 0;
                                                            while (i38 < i37) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    x39 x39Var4 = (x39) objArr6[(i36 << 3) + i38];
                                                                    jArr2 = jArr6;
                                                                    int i39 = x39Var4.b;
                                                                    i12 = i25;
                                                                    if (i25 <= i39 && i39 < i12 + i35) {
                                                                        x39Var4.b = (i39 - i12) + i9;
                                                                    } else if (i12 + 1 <= i39 && i39 < i9) {
                                                                        x39Var4.b = i39 - i35;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i12 = i25;
                                                                }
                                                                j2 >>= 8;
                                                                i38++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i25 = i12;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i25;
                                                            if (i37 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i25;
                                                        }
                                                        if (i36 == length2) {
                                                            break;
                                                        }
                                                        i36++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i25 = i11;
                                                    }
                                                }
                                            }
                                        }
                                        i10 = i5;
                                    } else {
                                        arrayList2 = arrayList5;
                                        y0dVar = y0dVar3;
                                        i7 = size2;
                                        i8 = i19;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i10 = i5;
                                } else {
                                    i6 = i24;
                                    arrayList2 = arrayList5;
                                    y0dVar = y0dVar3;
                                    i7 = size2;
                                    i8 = i19;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i9 = i23;
                                    dv8Var2 = dv8Var3;
                                    i10 = i5 + 1;
                                }
                                i22 = i6 + 1;
                                x39 x39Var5 = (x39) uzcVar.b(uiaVar2.c);
                                int i40 = i9 + (x39Var5 != null ? x39Var5.c : uiaVar2.d);
                                i21 = i10;
                                dv8Var3 = dv8Var2;
                                y0dVar3 = y0dVar;
                                size2 = i7;
                                i19 = i8;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i23 = i40;
                                e7aVar3 = e7aVar2;
                            } else {
                                i22 = i24;
                                e7aVar3 = e7aVar2;
                                i21 = i5;
                            }
                        }
                    } else {
                        e7aVar2 = e7aVar3;
                        x39 x39Var6 = (x39) uzcVar.b(uiaVar.c);
                        int i41 = x39Var6 != null ? x39Var6.b : -1;
                        int i42 = uiaVar.c;
                        i5 = i21;
                        pf3Var.f(i41 + i19, uiaVar.d);
                        dv8Var3.a(i42, 0);
                        pf3Var.f = (i42 - pf3Var.a.G.g) + pf3Var.f;
                        this.G.r(i42);
                        L();
                        this.G.s();
                        dy0.E(arrayList5, i42, this.G.b[(i42 * 5) + 3] + i42);
                    }
                    i21 = i5 + 1;
                    e7aVar3 = e7aVar2;
                }
                e7aVar = e7aVar3;
                arrayList = arrayList5;
                pf3Var.c();
                if (arrayList6.size() > 0) {
                    ilh ilhVar5 = this.G;
                    pf3Var.f = (ilhVar5.h - pf3Var.a.G.g) + pf3Var.f;
                    ilhVar5.t();
                }
                z2 = this.S;
                if (!z2) {
                    ilh ilhVar6 = this.G;
                    int i43 = ilhVar6.m - ilhVar6.l;
                    if (i43 > 0) {
                        if (i43 > 0) {
                            pf3Var.d(false);
                            pf3Var.e();
                            evd evdVar = pf3Var.b.k;
                            evdVar.l0(xud.c);
                            evdVar.e[evdVar.f - evdVar.c[evdVar.d - 1].a] = i43;
                        } else {
                            pf3Var.getClass();
                        }
                    }
                }
                i3 = this.k;
                while (true) {
                    ilhVar = this.G;
                    if (ilhVar.k > 0 && (i4 = ilhVar.g) != ilhVar.h) {
                        L();
                        pf3Var.f(i3, this.G.s());
                        dy0.E(arrayList, i4, this.G.g);
                    }
                }
                if (z2) {
                    if (z) {
                        pf3Var.a();
                    }
                    int i44 = pf3Var.a.G.i;
                    e7a e7aVar4 = pf3Var.d;
                    int i45 = i2;
                    if (e7aVar4.c(i45) > i44) {
                        sf3.a("Missed recording an endGroup");
                    }
                    if (e7aVar4.c(i45) == i44) {
                        pf3Var.d(false);
                        e7aVar4.d();
                        pf3Var.b.k.l0(cud.c);
                    }
                    int i46 = this.G.i;
                    if (i18 != p0(i46)) {
                        m0(i46, i18);
                    }
                    if (z) {
                        i18 = 1;
                    }
                    this.G.e();
                    pf3Var.c();
                } else {
                    if (z) {
                        t68 t68Var = this.O;
                        evd evdVar2 = t68Var.d;
                        if (evdVar2.d == 0) {
                            sf3.a("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        evd evdVar3 = t68Var.c;
                        cvd[] cvdVarArr = evdVar2.c;
                        int i47 = evdVar2.d - 1;
                        evdVar2.d = i47;
                        cvd cvdVar = cvdVarArr[i47];
                        cvdVarArr[i47] = null;
                        evdVar3.l0(cvdVar);
                        Object[] objArr7 = evdVar2.g;
                        Object[] objArr8 = evdVar3.g;
                        int i48 = evdVar3.h;
                        int i49 = cvdVar.b;
                        int i50 = evdVar2.h;
                        int i51 = i50 - i49;
                        System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                        Object[] objArr9 = evdVar2.g;
                        int i52 = evdVar2.h;
                        Arrays.fill(objArr9, i52 - i49, i52, (Object) null);
                        int[] iArr = evdVar2.e;
                        int[] iArr2 = evdVar3.e;
                        int i53 = evdVar3.f;
                        int i54 = cvdVar.a;
                        int i55 = evdVar2.f;
                        mh0.e(i53 - i54, i55 - i54, iArr, iArr2, i55);
                        evdVar2.h -= i49;
                        evdVar2.f -= i54;
                        i18 = i;
                    }
                    if (this.G.k <= 0) {
                        h3f.a("Unbalanced begin/end empty");
                    }
                    r3.k--;
                    mlh mlhVar2 = this.I;
                    int i56 = mlhVar2.v;
                    mlhVar2.i();
                    if (this.G.k <= 0) {
                        int i57 = (-2) - i56;
                        this.I.j();
                        this.I.e(i);
                        vu8 vu8Var = this.N;
                        boolean k0 = this.O.c.k0();
                        jlh jlhVar = this.H;
                        if (k0) {
                            pf3Var.b();
                            r5 = 0;
                            pf3Var.d(false);
                            pf3Var.e();
                            pf3Var.c();
                            evd evdVar4 = pf3Var.b.k;
                            evdVar4.l0(iud.c);
                            wba.I(evdVar4, 0, vu8Var, 1, jlhVar);
                        } else {
                            t68 t68Var2 = this.O;
                            pf3Var.b();
                            pf3Var.d(false);
                            pf3Var.e();
                            pf3Var.c();
                            evd evdVar5 = pf3Var.b.k;
                            evdVar5.l0(jud.c);
                            wba.J(evdVar5, vu8Var, jlhVar, t68Var2);
                            this.O = new t68();
                            r5 = 0;
                        }
                        this.S = r5;
                        if (this.c.b != 0) {
                            l0(i57, r5);
                            m0(i57, i18);
                        }
                    }
                }
                dv8Var = (dv8) this.i.remove(r3.size() - 1);
                if (dv8Var != null && !z2) {
                    dv8Var.c++;
                }
                this.j = dv8Var;
                this.k = e7aVar.d() + i18;
                this.m = e7aVar.d();
                this.l = e7aVar.d() + i18;
            }
        }
        e7aVar = e7aVar3;
        i = 1;
        arrayList = arrayList5;
        i2 = -1;
        z2 = this.S;
        if (!z2) {
        }
        i3 = this.k;
        while (true) {
            ilhVar = this.G;
            if (ilhVar.k > 0) {
                break;
            }
            L();
            pf3Var.f(i3, this.G.s());
            dy0.E(arrayList, i4, this.G.g);
        }
        if (z2) {
        }
        dv8Var = (dv8) this.i.remove(r3.size() - 1);
        if (dv8Var != null) {
            dv8Var.c++;
        }
        this.j = dv8Var;
        this.k = e7aVar.d() + i18;
        this.m = e7aVar.d();
        this.l = e7aVar.d() + i18;
    }

    public final void t() {
        s(false);
        eqf A = A();
        if (A != null) {
            int i = A.b;
            if ((i & 1) != 0) {
                A.b = i | 2;
            }
        }
    }

    public final eqf u() {
        eqf eqfVar;
        vu8 a;
        y51 y51Var;
        ArrayList arrayList = this.E;
        eqf eqfVar2 = !arrayList.isEmpty() ? (eqf) arrayList.remove(arrayList.size() - 1) : null;
        if (eqfVar2 != null) {
            eqfVar2.b &= -9;
            this.g.t();
            int i = this.B;
            h0d h0dVar = eqfVar2.f;
            if (h0dVar != null && (eqfVar2.b & 16) == 0) {
                Object[] objArr = h0dVar.b;
                int[] iArr = h0dVar.c;
                long[] jArr = h0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        y51Var = new y51(eqfVar2, i, h0dVar, 9);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            y51Var = null;
            pf3 pf3Var = this.M;
            if (y51Var != null) {
                evd evdVar = pf3Var.b.k;
                evdVar.l0(bud.c);
                wba.I(evdVar, 0, y51Var, 1, this.h);
            }
            int i6 = eqfVar2.b;
            if ((i6 & 512) != 0) {
                eqfVar2.b = i6 & (-513);
                evd evdVar2 = pf3Var.b.k;
                evdVar2.l0(eud.c);
                wba.H(evdVar2, 0, eqfVar2);
                int i7 = eqfVar2.b;
                eqfVar2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    eqfVar2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (eqfVar2 != null) {
            int i8 = eqfVar2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (eqfVar2.c == null) {
                    if (this.S) {
                        mlh mlhVar = this.I;
                        a = mlhVar.b(mlhVar.v);
                    } else {
                        ilh ilhVar = this.G;
                        a = ilhVar.a(ilhVar.i);
                    }
                    eqfVar2.c = a;
                }
                eqfVar2.b &= -5;
                eqfVar = eqfVar2;
                s(false);
                return eqfVar;
            }
        }
        eqfVar = null;
        s(false);
        return eqfVar;
    }

    public final void v() {
        if (this.F || this.z != 0) {
            h3f.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void w() {
        s(false);
        this.b.d();
        s(false);
        pf3 pf3Var = this.M;
        if (pf3Var.c) {
            pf3Var.d(false);
            pf3Var.d(false);
            pf3Var.b.k.l0(cud.c);
            pf3Var.c = false;
        }
        pf3Var.b();
        if (pf3Var.d.b != 0) {
            sf3.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            sf3.a("Start/end imbalance");
        }
        j();
        this.G.c();
        this.w = this.x.d() != 0;
    }

    public final void x(boolean z, dv8 dv8Var) {
        this.i.add(this.j);
        this.j = dv8Var;
        int i = this.l;
        e7a e7aVar = this.n;
        e7aVar.e(i);
        e7aVar.e(this.m);
        e7aVar.e(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void y() {
        jlh jlhVar = new jlh();
        if (this.C) {
            jlhVar.c();
        }
        if (this.b.e()) {
            jlhVar.k = new uzc();
        }
        this.H = jlhVar;
        mlh n = jlhVar.n();
        n.e(true);
        this.I = n;
    }

    public final og3 z() {
        bv8 bv8Var = this.U;
        if (bv8Var != null) {
            return bv8Var;
        }
        bv8 bv8Var2 = new bv8(this.h);
        this.U = bv8Var2;
        return bv8Var2;
    }
}
