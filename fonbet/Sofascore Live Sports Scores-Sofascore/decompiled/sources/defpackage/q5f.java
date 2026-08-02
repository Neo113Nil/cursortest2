package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q5f implements dra {
    public final int a;
    public final sx2 b;
    public final Function1 c;
    public an3 d;
    public vji e;
    public jna f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public m78 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ en0 r;

    public q5f(en0 en0Var, int i, sx2 sx2Var, Function1 function1) {
        this.r = en0Var;
        this.a = i;
        this.b = sx2Var;
        this.c = function1;
        xhj.a.getClass();
        xuc.a.getClass();
        this.p = xuc.b();
    }

    @Override // defpackage.dra
    public final void a() {
        this.m = true;
    }

    public final void b() {
        jna jnaVar = this.f;
        if (jnaVar != null) {
            switch (jnaVar.a) {
                case 0:
                    break;
                default:
                    cna b = jnaVar.b();
                    if ((b != null ? b.f : null) != null) {
                        jnaVar.b.h(jnaVar.c);
                        break;
                    }
                    break;
            }
        }
        this.f = null;
        vji vjiVar = this.e;
        if (vjiVar != null) {
            vjiVar.d();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(yli yliVar) {
        boolean d;
        if (!this.r.b) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(yliVar);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(yliVar);
        }
        eq3.a0(-1L, "compose:lazy:prefetch:execute:item");
        return d;
    }

    @Override // defpackage.dra
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0212 A[Catch: all -> 0x022d, LOOP:2: B:102:0x01e6->B:112:0x0212, LOOP_END, TRY_ENTER, TryCatch #5 {all -> 0x022d, blocks: (B:90:0x01a5, B:92:0x01ad, B:94:0x01b3, B:97:0x01c1, B:101:0x01df, B:102:0x01e6, B:104:0x01ee, B:109:0x01ff, B:110:0x0204, B:112:0x0212, B:119:0x0218, B:121:0x0227), top: B:89:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(yli yliVar) {
        long j;
        ?? r12;
        vji d;
        int i = this.a;
        long j2 = i;
        eq3.a0(j2, "compose:lazy:prefetch:execute:item");
        uqa uqaVar = (uqa) ((tqa) this.r.c).b.invoke();
        if (!this.h) {
            int itemCount = uqaVar.getItemCount();
            if (i >= 0 && i < itemCount) {
                Object d2 = uqaVar.d(i);
                Object obj = this.j;
                if (obj != null && !d2.equals(obj)) {
                    b();
                    return false;
                }
                Object b = uqaVar.b(i);
                sx2 sx2Var = this.b;
                xv0 xv0Var = (xv0) sx2Var.c;
                if (sx2Var.b != b || xv0Var == null) {
                    x0d x0dVar = (x0d) sx2Var.a;
                    Object g = x0dVar.g(b);
                    Object obj2 = g;
                    if (g == null) {
                        xv0 xv0Var2 = new xv0();
                        xv0Var2.e = -1;
                        x0dVar.m(b, xv0Var2);
                        obj2 = xv0Var2;
                    }
                    xv0Var = (xv0) obj2;
                    sx2Var.b = b;
                    sx2Var.c = xv0Var;
                }
                e();
                long a = yliVar.a();
                this.n = a;
                xhj.a.getClass();
                xuc.a.getClass();
                this.p = xuc.b();
                this.o = 0L;
                eq3.a0(a, "compose:lazy:prefetch:available_time_nanos");
                if (e()) {
                    j = 0;
                } else {
                    j = 0;
                    if (g(this.n, xv0Var.a + xv0Var.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(d2, b, xv0Var);
                            Unit unit = Unit.a;
                        } finally {
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, xv0Var.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        jna jnaVar = this.f;
                        if (jnaVar == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (jnaVar.a) {
                            case 0:
                                d = jnaVar.b.d(jnaVar.c);
                                break;
                            default:
                                kna knaVar = jnaVar.b;
                                cna b2 = jnaVar.b();
                                if (b2 != null) {
                                    knaVar.b(b2, false);
                                }
                                d = knaVar.d(jnaVar.c);
                                break;
                        }
                        this.e = d;
                        this.f = null;
                        this.i = true;
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                        h();
                        xv0Var.c = xv0.a(this.o, xv0Var.c);
                    } finally {
                    }
                }
                if (!this.k) {
                    if (this.n <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        vji vjiVar = this.e;
                        if (vjiVar == null) {
                            throw wv8.d("Should precompose before resolving nested prefetch states");
                        }
                        fsf fsfVar = new fsf();
                        vjiVar.c(new k31(fsfVar, 2));
                        List list = (List) fsfVar.a;
                        this.l = list != null ? new m78(this, list) : null;
                        this.k = true;
                        Unit unit3 = Unit.a;
                    } finally {
                    }
                }
                m78 m78Var = this.l;
                if (m78Var != null) {
                    int i2 = xv0Var.e;
                    boolean z = this.m;
                    List[] listArr = (List[]) m78Var.e;
                    int i3 = m78Var.a;
                    List list2 = m78Var.d;
                    if (i3 < list2.size()) {
                        if (((q5f) m78Var.f).h) {
                            u3a.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((era) list2.get(i4)).d = i2;
                            }
                            Unit unit4 = Unit.a;
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (m78Var.a < list2.size()) {
                                try {
                                    if (listArr[m78Var.a] == null) {
                                        if (yliVar.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = m78Var.a;
                                        era eraVar = (era) list2.get(i5);
                                        Function1 function1 = eraVar.a;
                                        cra craVar = new cra(eraVar, eraVar.d);
                                        function1.invoke(craVar);
                                        ArrayList arrayList = craVar.b;
                                        eraVar.f = arrayList.size();
                                        listArr[i5] = arrayList;
                                    }
                                    List list3 = listArr[m78Var.a];
                                    list3.getClass();
                                    while (m78Var.b < list3.size()) {
                                        q5f q5fVar = (q5f) list3.get(m78Var.b);
                                        if (z) {
                                            q5f q5fVar2 = q5fVar != null ? q5fVar : null;
                                            if (q5fVar2 != null) {
                                                r12 = 1;
                                                q5fVar2.m = true;
                                                m78Var.c = r12;
                                                if (!q5fVar.c(yliVar)) {
                                                    return r12;
                                                }
                                                m78Var.b += r12;
                                            }
                                        }
                                        r12 = 1;
                                        m78Var.c = r12;
                                        if (!q5fVar.c(yliVar)) {
                                        }
                                    }
                                    m78Var.b = 0;
                                    m78Var.a++;
                                } finally {
                                }
                            }
                            Unit unit5 = Unit.a;
                        } finally {
                        }
                    }
                }
                m78 m78Var2 = this.l;
                if (m78Var2 != null && m78Var2.c) {
                    h();
                    eq3.a0(j2, "compose:lazy:prefetch:execute:item");
                    m78 m78Var3 = this.l;
                    if (m78Var3 != null) {
                        m78Var3.c = false;
                    }
                }
                an3 an3Var = this.d;
                if (!this.g && an3Var != null) {
                    if (!g(this.n, xv0Var.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = an3Var.a;
                        if (this.h) {
                            u3a.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            u3a.a("Request was already measured!");
                        }
                        this.g = true;
                        vji vjiVar2 = this.e;
                        if (vjiVar2 == null) {
                            throw wv8.d("performComposition() must be called before performMeasure()");
                        }
                        int b3 = vjiVar2.b();
                        for (int i6 = 0; i6 < b3; i6++) {
                            vjiVar2.e(i6, j3);
                        }
                        Unit unit6 = Unit.a;
                        Trace.endSection();
                        h();
                        xv0Var.d = xv0.a(this.o, xv0Var.d);
                        Function1 function12 = this.c;
                        if (function12 != null) {
                            function12.invoke(this);
                        }
                    } finally {
                    }
                }
                m78 m78Var4 = this.l;
                if (this.g && this.k && m78Var4 != null) {
                    List list4 = m78Var4.d;
                    int size2 = list4.size();
                    int i7 = Integer.MAX_VALUE;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 = Math.min(i7, ((era) list4.get(i8)).e);
                    }
                    if (i7 == Integer.MAX_VALUE) {
                        i7 = 0;
                    }
                    int i9 = xv0Var.e;
                    xv0Var.e = i9 == -1 ? i7 : ((i9 * 3) + i7) / 4;
                    int size3 = list4.size();
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < size3; i11++) {
                        i10 = Math.min(i10, ((era) list4.get(i11)).f);
                    }
                    if (i10 == Integer.MAX_VALUE) {
                        i10 = 0;
                    }
                    if (i10 < i7) {
                        xv0Var.d = j;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        jna jnaVar;
        return this.i || ((jnaVar = this.f) != null && jnaVar.c());
    }

    public final void f(Object obj, Object obj2, xv0 xv0Var) {
        jna jnaVar;
        jna jnaVar2 = this.f;
        int i = 0;
        if (jnaVar2 == null) {
            en0 en0Var = this.r;
            Function2 a = ((tqa) en0Var.c).a(this.a, obj, obj2);
            kna a2 = ((xji) en0Var.d).a();
            if (a2.a.H()) {
                a2.l(obj, a, true);
                jnaVar = new jna(a2, obj, 1);
            } else {
                jnaVar = new jna(a2, obj, i);
            }
            jnaVar2 = jnaVar;
            this.f = jnaVar2;
            this.j = obj;
        }
        this.q = false;
        while (!jnaVar2.c() && !this.q) {
            ow9 ow9Var = new ow9(6, this, xv0Var);
            switch (jnaVar2.a) {
                case 0:
                    break;
                default:
                    cna b = jnaVar2.b();
                    fce fceVar = b != null ? b.f : null;
                    if (fceVar != null && !fceVar.c()) {
                        nnh w = bea.w();
                        Function1 e = w != null ? w.e() : null;
                        nnh C = bea.C(w);
                        try {
                            fceVar.e(ow9Var);
                            break;
                        } finally {
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            xv0Var.b = xv0.a(j, xv0Var.b);
        } else {
            xv0Var.a = xv0.a(j, xv0Var.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        xhj.a.getClass();
        xuc xucVar = xuc.a;
        xucVar.getClass();
        long b = xuc.b();
        long j = this.p;
        xucVar.getClass();
        long y = haa.y(b, j, be5.NANOSECONDS);
        long j2 = y >> 1;
        wd5 wd5Var = xd5.b;
        if ((1 & ((int) y)) != 0) {
            j2 = j2 > 9223372036854L ? Long.MAX_VALUE : j2 < -9223372036854L ? Long.MIN_VALUE : j2 * 1000000;
        }
        this.o = j2;
        long j3 = this.n - j2;
        this.n = j3;
        this.p = b;
        eq3.a0(j3, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(this.d);
        sb.append(", isComposed = ");
        sb.append(e());
        sb.append(", isMeasured = ");
        sb.append(this.g);
        sb.append(", isCanceled = ");
        return wt3.p(sb, this.h, " }");
    }
}
