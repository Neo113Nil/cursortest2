package J1;

import H1.G;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.O;
import H1.r;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.C2338G;
import com.google.common.collect.m0;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e2.s;
import e2.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final J f5877a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5878b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5879c;
    private e[] chunkReaders;

    /* renamed from: d, reason: collision with root package name */
    public final s.a f5880d;

    /* renamed from: e, reason: collision with root package name */
    public int f5881e;

    /* renamed from: f, reason: collision with root package name */
    public r f5882f;

    /* renamed from: g, reason: collision with root package name */
    public J1.c f5883g;

    /* renamed from: h, reason: collision with root package name */
    public long f5884h;

    /* renamed from: i, reason: collision with root package name */
    public long f5885i;

    /* renamed from: j, reason: collision with root package name */
    public e f5886j;

    /* renamed from: k, reason: collision with root package name */
    public int f5887k;

    /* renamed from: l, reason: collision with root package name */
    public long f5888l;

    /* renamed from: m, reason: collision with root package name */
    public long f5889m;

    /* renamed from: n, reason: collision with root package name */
    public int f5890n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5891o;

    /* renamed from: J1.b$b, reason: collision with other inner class name */
    public class C0127b implements H1.J {

        /* renamed from: a, reason: collision with root package name */
        public final long f5892a;

        public C0127b(long j10) {
            this.f5892a = j10;
        }

        @Override // H1.J
        public J.a e(long j10) {
            J.a i10 = b.this.chunkReaders[0].i(j10);
            for (int i11 = 1; i11 < b.this.chunkReaders.length; i11++) {
                J.a i12 = b.this.chunkReaders[i11].i(j10);
                if (i12.f4334a.f4340b < i10.f4334a.f4340b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        @Override // H1.J
        public boolean i() {
            return true;
        }

        @Override // H1.J
        public long m() {
            return this.f5892a;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f5894a;

        /* renamed from: b, reason: collision with root package name */
        public int f5895b;

        /* renamed from: c, reason: collision with root package name */
        public int f5896c;

        public c() {
        }

        public void a(e1.J j10) {
            this.f5894a = j10.z();
            this.f5895b = j10.z();
            this.f5896c = 0;
        }

        public void b(e1.J j10) {
            a(j10);
            if (this.f5894a == 1414744396) {
                this.f5896c = j10.z();
                return;
            }
            throw C2338G.a("LIST expected, found: " + this.f5894a, null);
        }
    }

    public b(int i10, s.a aVar) {
        this.f5880d = aVar;
        this.f5879c = (i10 & 1) == 0;
        this.f5877a = new e1.J(12);
        this.f5878b = new c();
        this.f5882f = new G();
        this.chunkReaders = new e[0];
        this.f5888l = -1L;
        this.f5889m = -1L;
        this.f5887k = -1;
        this.f5884h = -9223372036854775807L;
    }

    public static void d(InterfaceC1184q interfaceC1184q) {
        if ((interfaceC1184q.getPosition() & 1) == 1) {
            interfaceC1184q.l(1);
        }
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f5885i = -1L;
        this.f5886j = null;
        for (e eVar : this.chunkReaders) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f5881e = 6;
        } else if (this.chunkReaders.length == 0) {
            this.f5881e = 0;
        } else {
            this.f5881e = 3;
        }
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f5881e = 0;
        if (this.f5879c) {
            rVar = new t(rVar, this.f5880d);
        }
        this.f5882f = rVar;
        this.f5885i = -1L;
    }

    public final e e(int i10) {
        for (e eVar : this.chunkReaders) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        if (o(interfaceC1184q, i10)) {
            return 1;
        }
        switch (this.f5881e) {
            case 0:
                if (!j(interfaceC1184q)) {
                    throw C2338G.a("AVI Header List not found", null);
                }
                interfaceC1184q.l(12);
                this.f5881e = 1;
                return 0;
            case 1:
                interfaceC1184q.readFully(this.f5877a.f(), 0, 12);
                this.f5877a.b0(0);
                this.f5878b.b(this.f5877a);
                c cVar = this.f5878b;
                if (cVar.f5896c == 1819436136) {
                    this.f5887k = cVar.f5895b;
                    this.f5881e = 2;
                    return 0;
                }
                throw C2338G.a("hdrl expected, found: " + this.f5878b.f5896c, null);
            case 2:
                int i11 = this.f5887k - 4;
                e1.J j10 = new e1.J(i11);
                interfaceC1184q.readFully(j10.f(), 0, i11);
                h(j10);
                this.f5881e = 3;
                return 0;
            case 3:
                if (this.f5888l != -1) {
                    long position = interfaceC1184q.getPosition();
                    long j11 = this.f5888l;
                    if (position != j11) {
                        this.f5885i = j11;
                        return 0;
                    }
                }
                interfaceC1184q.n(this.f5877a.f(), 0, 12);
                interfaceC1184q.g();
                this.f5877a.b0(0);
                this.f5878b.a(this.f5877a);
                int z10 = this.f5877a.z();
                int i12 = this.f5878b.f5894a;
                if (i12 == 1179011410) {
                    interfaceC1184q.l(12);
                    return 0;
                }
                if (i12 != 1414744396 || z10 != 1769369453) {
                    this.f5885i = interfaceC1184q.getPosition() + this.f5878b.f5895b + 8;
                    return 0;
                }
                long position2 = interfaceC1184q.getPosition();
                this.f5888l = position2;
                this.f5889m = position2 + this.f5878b.f5895b + 8;
                if (!this.f5891o) {
                    if (((J1.c) AbstractC4134a.e(this.f5883g)).a()) {
                        this.f5881e = 4;
                        this.f5885i = this.f5889m;
                        return 0;
                    }
                    this.f5882f.q(new J.b(this.f5884h));
                    this.f5891o = true;
                }
                this.f5885i = interfaceC1184q.getPosition() + 12;
                this.f5881e = 6;
                return 0;
            case 4:
                interfaceC1184q.readFully(this.f5877a.f(), 0, 8);
                this.f5877a.b0(0);
                int z11 = this.f5877a.z();
                int z12 = this.f5877a.z();
                if (z11 == 829973609) {
                    this.f5881e = 5;
                    this.f5890n = z12;
                } else {
                    this.f5885i = interfaceC1184q.getPosition() + z12;
                }
                return 0;
            case 5:
                e1.J j12 = new e1.J(this.f5890n);
                interfaceC1184q.readFully(j12.f(), 0, this.f5890n);
                i(j12);
                this.f5881e = 6;
                this.f5885i = this.f5888l;
                return 0;
            case 6:
                return n(interfaceC1184q);
            default:
                throw new AssertionError();
        }
    }

    public final void h(e1.J j10) {
        f c10 = f.c(1819436136, j10);
        if (c10.getType() != 1819436136) {
            throw C2338G.a("Unexpected header list type " + c10.getType(), null);
        }
        J1.c cVar = (J1.c) c10.b(J1.c.class);
        if (cVar == null) {
            throw C2338G.a("AviHeader not found", null);
        }
        this.f5883g = cVar;
        this.f5884h = cVar.f5899c * cVar.f5897a;
        ArrayList arrayList = new ArrayList();
        m0 it = c10.f5920a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            J1.a aVar = (J1.a) it.next();
            if (aVar.getType() == 1819440243) {
                int i11 = i10 + 1;
                e m10 = m((f) aVar, i10);
                if (m10 != null) {
                    arrayList.add(m10);
                }
                i10 = i11;
            }
        }
        this.chunkReaders = (e[]) arrayList.toArray(new e[0]);
        this.f5882f.s();
    }

    public final void i(e1.J j10) {
        int i10;
        long l10 = l(j10);
        while (true) {
            if (j10.a() < 16) {
                break;
            }
            int z10 = j10.z();
            int z11 = j10.z();
            long z12 = j10.z() + l10;
            j10.c0(4);
            e e10 = e(z10);
            if (e10 != null) {
                e10.b(z12, (z11 & 16) == 16);
            }
        }
        for (e eVar : this.chunkReaders) {
            eVar.c();
        }
        this.f5891o = true;
        if (this.chunkReaders.length == 0) {
            this.f5882f.q(new J.b(this.f5884h));
        } else {
            this.f5882f.q(new C0127b(this.f5884h));
        }
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.n(this.f5877a.f(), 0, 12);
        this.f5877a.b0(0);
        if (this.f5877a.z() != 1179011410) {
            return false;
        }
        this.f5877a.c0(4);
        return this.f5877a.z() == 541677121;
    }

    public final long l(e1.J j10) {
        if (j10.a() < 16) {
            return 0L;
        }
        int g10 = j10.g();
        j10.c0(8);
        long z10 = j10.z();
        long j11 = this.f5888l;
        long j12 = z10 <= j11 ? j11 + 8 : 0L;
        j10.b0(g10);
        return j12;
    }

    public final e m(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            AbstractC4156x.i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            AbstractC4156x.i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long a10 = dVar.a();
        androidx.media3.common.a aVar = gVar.f5922a;
        a.b b10 = aVar.b();
        b10.i0(i10);
        int i11 = dVar.f5906f;
        if (i11 != 0) {
            b10.o0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            b10.l0(hVar.f5923a);
        }
        int k10 = AbstractC2335D.k(aVar.f20543o);
        if (k10 != 1 && k10 != 2) {
            return null;
        }
        O c10 = this.f5882f.c(i10, k10);
        c10.c(b10.P());
        c10.d(a10);
        this.f5884h = Math.max(this.f5884h, a10);
        return new e(i10, dVar, c10);
    }

    public final int n(InterfaceC1184q interfaceC1184q) {
        if (interfaceC1184q.getPosition() >= this.f5889m) {
            return -1;
        }
        e eVar = this.f5886j;
        if (eVar == null) {
            d(interfaceC1184q);
            interfaceC1184q.n(this.f5877a.f(), 0, 12);
            this.f5877a.b0(0);
            int z10 = this.f5877a.z();
            if (z10 == 1414744396) {
                this.f5877a.b0(8);
                interfaceC1184q.l(this.f5877a.z() != 1769369453 ? 8 : 12);
                interfaceC1184q.g();
                return 0;
            }
            int z11 = this.f5877a.z();
            if (z10 == 1263424842) {
                this.f5885i = interfaceC1184q.getPosition() + z11 + 8;
                return 0;
            }
            interfaceC1184q.l(8);
            interfaceC1184q.g();
            e e10 = e(z10);
            if (e10 == null) {
                this.f5885i = interfaceC1184q.getPosition() + z11;
                return 0;
            }
            e10.n(z11);
            this.f5886j = e10;
        } else if (eVar.m(interfaceC1184q)) {
            this.f5886j = null;
        }
        return 0;
    }

    public final boolean o(InterfaceC1184q interfaceC1184q, I i10) {
        boolean z10;
        if (this.f5885i != -1) {
            long position = interfaceC1184q.getPosition();
            long j10 = this.f5885i;
            if (j10 < position || j10 > 262144 + position) {
                i10.f4333a = j10;
                z10 = true;
                this.f5885i = -1L;
                return z10;
            }
            interfaceC1184q.l((int) (j10 - position));
        }
        z10 = false;
        this.f5885i = -1L;
        return z10;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
