package n1;

import android.util.Base64;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
import n1.D1;
import n1.InterfaceC5608b;

/* renamed from: n1.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5654v0 implements D1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Ra.t f56916i = new Ra.t() { // from class: n1.u0
        @Override // Ra.t
        public final Object get() {
            String m10;
            m10 = C5654v0.m();
            return m10;
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final Random f56917j = new Random();

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2346O.c f56918a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2346O.b f56919b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f56920c;

    /* renamed from: d, reason: collision with root package name */
    public final Ra.t f56921d;

    /* renamed from: e, reason: collision with root package name */
    public D1.a f56922e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC2346O f56923f;

    /* renamed from: g, reason: collision with root package name */
    public String f56924g;

    /* renamed from: h, reason: collision with root package name */
    public long f56925h;

    /* renamed from: n1.v0$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f56926a;

        /* renamed from: b, reason: collision with root package name */
        public int f56927b;

        /* renamed from: c, reason: collision with root package name */
        public long f56928c;

        /* renamed from: d, reason: collision with root package name */
        public D.b f56929d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f56930e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f56931f;

        public a(String str, int i10, D.b bVar) {
            this.f56926a = str;
            this.f56927b = i10;
            this.f56928c = bVar == null ? -1L : bVar.f21519d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f56929d = bVar;
        }

        public boolean i(int i10, D.b bVar) {
            if (bVar == null) {
                return i10 == this.f56927b;
            }
            D.b bVar2 = this.f56929d;
            return bVar2 == null ? !bVar.b() && bVar.f21519d == this.f56928c : bVar.f21519d == bVar2.f21519d && bVar.f21517b == bVar2.f21517b && bVar.f21518c == bVar2.f21518c;
        }

        public boolean j(InterfaceC5608b.a aVar) {
            D.b bVar = aVar.f56811d;
            if (bVar == null) {
                return this.f56927b != aVar.f56810c;
            }
            long j10 = this.f56928c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f21519d > j10) {
                return true;
            }
            if (this.f56929d == null) {
                return false;
            }
            int b10 = aVar.f56809b.b(bVar.f21516a);
            int b11 = aVar.f56809b.b(this.f56929d.f21516a);
            D.b bVar2 = aVar.f56811d;
            if (bVar2.f21519d < this.f56929d.f21519d || b10 < b11) {
                return false;
            }
            if (b10 > b11) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f56811d.f21520e;
                return i10 == -1 || i10 > this.f56929d.f21517b;
            }
            D.b bVar3 = aVar.f56811d;
            int i11 = bVar3.f21517b;
            int i12 = bVar3.f21518c;
            D.b bVar4 = this.f56929d;
            int i13 = bVar4.f21517b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f21518c);
        }

        public void k(int i10, D.b bVar) {
            if (this.f56928c != -1 || i10 != this.f56927b || bVar == null || bVar.f21519d < C5654v0.this.n()) {
                return;
            }
            this.f56928c = bVar.f21519d;
        }

        public final int l(AbstractC2346O abstractC2346O, AbstractC2346O abstractC2346O2, int i10) {
            if (i10 >= abstractC2346O.p()) {
                if (i10 < abstractC2346O2.p()) {
                    return i10;
                }
                return -1;
            }
            abstractC2346O.n(i10, C5654v0.this.f56918a);
            for (int i11 = C5654v0.this.f56918a.f24390n; i11 <= C5654v0.this.f56918a.f24391o; i11++) {
                int b10 = abstractC2346O2.b(abstractC2346O.m(i11));
                if (b10 != -1) {
                    return abstractC2346O2.f(b10, C5654v0.this.f56919b).f24356c;
                }
            }
            return -1;
        }

        public boolean m(AbstractC2346O abstractC2346O, AbstractC2346O abstractC2346O2) {
            int l10 = l(abstractC2346O, abstractC2346O2, this.f56927b);
            this.f56927b = l10;
            if (l10 == -1) {
                return false;
            }
            D.b bVar = this.f56929d;
            return bVar == null || abstractC2346O2.b(bVar.f21516a) != -1;
        }
    }

    public C5654v0() {
        this(f56916i);
    }

    public static String m() {
        byte[] bArr = new byte[12];
        f56917j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // n1.D1
    public synchronized String a() {
        return this.f56924g;
    }

    @Override // n1.D1
    public synchronized void b(InterfaceC5608b.a aVar) {
        D1.a aVar2;
        try {
            String str = this.f56924g;
            if (str != null) {
                l((a) AbstractC4134a.e((a) this.f56920c.get(str)));
            }
            Iterator it = this.f56920c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f56930e && (aVar2 = this.f56922e) != null) {
                    aVar2.u(aVar, aVar3.f56926a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // n1.D1
    public synchronized String c(AbstractC2346O abstractC2346O, D.b bVar) {
        return o(abstractC2346O.h(bVar.f21516a, this.f56919b).f24356c, bVar).f56926a;
    }

    @Override // n1.D1
    public synchronized void d(InterfaceC5608b.a aVar) {
        try {
            AbstractC4134a.e(this.f56922e);
            AbstractC2346O abstractC2346O = this.f56923f;
            this.f56923f = aVar.f56809b;
            Iterator it = this.f56920c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.m(abstractC2346O, this.f56923f) && !aVar2.j(aVar)) {
                }
                it.remove();
                if (aVar2.f56930e) {
                    if (aVar2.f56926a.equals(this.f56924g)) {
                        l(aVar2);
                    }
                    this.f56922e.u(aVar, aVar2.f56926a, false);
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // n1.D1
    public void e(D1.a aVar) {
        this.f56922e = aVar;
    }

    @Override // n1.D1
    public synchronized void f(InterfaceC5608b.a aVar, int i10) {
        try {
            AbstractC4134a.e(this.f56922e);
            boolean z10 = i10 == 0;
            Iterator it = this.f56920c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f56930e) {
                        boolean equals = aVar2.f56926a.equals(this.f56924g);
                        boolean z11 = z10 && equals && aVar2.f56931f;
                        if (equals) {
                            l(aVar2);
                        }
                        this.f56922e.u(aVar, aVar2.f56926a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // n1.D1
    public synchronized void g(InterfaceC5608b.a aVar) {
        AbstractC4134a.e(this.f56922e);
        if (aVar.f56809b.q()) {
            return;
        }
        D.b bVar = aVar.f56811d;
        if (bVar != null) {
            if (bVar.f21519d < n()) {
                return;
            }
            a aVar2 = (a) this.f56920c.get(this.f56924g);
            if (aVar2 != null && aVar2.f56928c == -1 && aVar2.f56927b != aVar.f56810c) {
                return;
            }
        }
        a o10 = o(aVar.f56810c, aVar.f56811d);
        if (this.f56924g == null) {
            this.f56924g = o10.f56926a;
        }
        D.b bVar2 = aVar.f56811d;
        if (bVar2 != null && bVar2.b()) {
            D.b bVar3 = aVar.f56811d;
            D.b bVar4 = new D.b(bVar3.f21516a, bVar3.f21519d, bVar3.f21517b);
            a o11 = o(aVar.f56810c, bVar4);
            if (!o11.f56930e) {
                o11.f56930e = true;
                aVar.f56809b.h(aVar.f56811d.f21516a, this.f56919b);
                this.f56922e.R(new InterfaceC5608b.a(aVar.f56808a, aVar.f56809b, aVar.f56810c, bVar4, Math.max(0L, e1.Z.J1(this.f56919b.f(aVar.f56811d.f21517b)) + this.f56919b.n()), aVar.f56813f, aVar.f56814g, aVar.f56815h, aVar.f56816i, aVar.f56817j), o11.f56926a);
            }
        }
        if (!o10.f56930e) {
            o10.f56930e = true;
            this.f56922e.R(aVar, o10.f56926a);
        }
        if (o10.f56926a.equals(this.f56924g) && !o10.f56931f) {
            o10.f56931f = true;
            this.f56922e.r(aVar, o10.f56926a);
        }
    }

    public final void l(a aVar) {
        if (aVar.f56928c != -1) {
            this.f56925h = aVar.f56928c;
        }
        this.f56924g = null;
    }

    public final long n() {
        a aVar = (a) this.f56920c.get(this.f56924g);
        return (aVar == null || aVar.f56928c == -1) ? this.f56925h + 1 : aVar.f56928c;
    }

    public final a o(int i10, D.b bVar) {
        a aVar = null;
        long j10 = LongCompanionObject.MAX_VALUE;
        for (a aVar2 : this.f56920c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f56928c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) e1.Z.i(aVar)).f56929d != null && aVar2.f56929d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f56921d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f56920c.put(str, aVar3);
        return aVar3;
    }

    public final void p(InterfaceC5608b.a aVar) {
        if (aVar.f56809b.q()) {
            String str = this.f56924g;
            if (str != null) {
                l((a) AbstractC4134a.e((a) this.f56920c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f56920c.get(this.f56924g);
        a o10 = o(aVar.f56810c, aVar.f56811d);
        this.f56924g = o10.f56926a;
        g(aVar);
        D.b bVar = aVar.f56811d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f56928c == aVar.f56811d.f21519d && aVar2.f56929d != null && aVar2.f56929d.f21517b == aVar.f56811d.f21517b && aVar2.f56929d.f21518c == aVar.f56811d.f21518c) {
            return;
        }
        D.b bVar2 = aVar.f56811d;
        this.f56922e.p(aVar, o(aVar.f56810c, new D.b(bVar2.f21516a, bVar2.f21519d)).f56926a, o10.f56926a);
    }

    public C5654v0(Ra.t tVar) {
        this.f56921d = tVar;
        this.f56918a = new AbstractC2346O.c();
        this.f56919b = new AbstractC2346O.b();
        this.f56920c = new HashMap();
        this.f56923f = AbstractC2346O.f24345a;
        this.f56925h = -1L;
    }
}
