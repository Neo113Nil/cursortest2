package androidx.media3.exoplayer.smoothstreaming;

import B1.d;
import B1.f;
import B1.g;
import B1.j;
import B1.m;
import D1.e;
import D1.f;
import D1.k;
import D1.n;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.a;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.smoothstreaming.b;
import androidx.media3.exoplayer.source.C2201b;
import androidx.media3.exoplayer.trackselection.E;
import androidx.media3.exoplayer.trackselection.y;
import b2.C2378h;
import b2.t;
import b2.u;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.U;
import e2.C4166h;
import e2.s;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import m1.o1;
import z1.C6909a;

/* loaded from: classes.dex */
public class a implements androidx.media3.exoplayer.smoothstreaming.b {

    /* renamed from: a, reason: collision with root package name */
    public final n f21468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21469b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4411g f21470c;
    private final f[] chunkExtractors;

    /* renamed from: d, reason: collision with root package name */
    public final e f21471d;

    /* renamed from: e, reason: collision with root package name */
    public y f21472e;

    /* renamed from: f, reason: collision with root package name */
    public C6909a f21473f;

    /* renamed from: g, reason: collision with root package name */
    public int f21474g;

    /* renamed from: h, reason: collision with root package name */
    public IOException f21475h;

    /* renamed from: i, reason: collision with root package name */
    public long f21476i = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.smoothstreaming.a$a, reason: collision with other inner class name */
    public static final class C0391a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4411g.a f21477a;

        /* renamed from: b, reason: collision with root package name */
        public s.a f21478b = new C4166h();

        /* renamed from: c, reason: collision with root package name */
        public boolean f21479c;

        public C0391a(InterfaceC4411g.a aVar) {
            this.f21477a = aVar;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public androidx.media3.exoplayer.smoothstreaming.b c(n nVar, C6909a c6909a, int i10, y yVar, InterfaceC4403F interfaceC4403F, e eVar) {
            InterfaceC4411g a10 = this.f21477a.a();
            if (interfaceC4403F != null) {
                a10.c(interfaceC4403F);
            }
            return new a(nVar, c6909a, i10, yVar, a10, eVar, this.f21478b, this.f21479c);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public androidx.media3.common.a d(androidx.media3.common.a aVar) {
            String str;
            if (!this.f21479c || !this.f21478b.a(aVar)) {
                return aVar;
            }
            a.b Y10 = aVar.b().y0("application/x-media3-cues").Y(this.f21478b.b(aVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.f20543o);
            if (aVar.f20539k != null) {
                str = " " + aVar.f20539k;
            } else {
                str = "";
            }
            sb2.append(str);
            return Y10.U(sb2.toString()).C0(LongCompanionObject.MAX_VALUE).P();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0391a b(boolean z10) {
            this.f21479c = z10;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0391a a(s.a aVar) {
            this.f21478b = aVar;
            return this;
        }
    }

    public static final class b extends B1.b {

        /* renamed from: e, reason: collision with root package name */
        public final C6909a.b f21480e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21481f;

        public b(C6909a.b bVar, int i10, int i11) {
            super(i11, bVar.f68488j - 1);
            this.f21480e = bVar;
            this.f21481f = i10;
        }

        @Override // B1.n
        public long a() {
            c();
            return this.f21480e.e((int) d());
        }

        @Override // B1.n
        public long b() {
            return a() + this.f21480e.c((int) d());
        }
    }

    public a(n nVar, C6909a c6909a, int i10, y yVar, InterfaceC4411g interfaceC4411g, e eVar, s.a aVar, boolean z10) {
        this.f21468a = nVar;
        this.f21473f = c6909a;
        this.f21469b = i10;
        this.f21472e = yVar;
        this.f21470c = interfaceC4411g;
        this.f21471d = eVar;
        C6909a.b bVar = c6909a.streamElements[i10];
        this.chunkExtractors = new f[yVar.length()];
        for (int i11 = 0; i11 < this.chunkExtractors.length; i11++) {
            int f10 = yVar.f(i11);
            androidx.media3.common.a aVar2 = bVar.formats[f10];
            u[] uVarArr = aVar2.f20547s != null ? ((C6909a.C0978a) AbstractC4134a.e(c6909a.f68475e)).trackEncryptionBoxes : null;
            int i12 = bVar.f68479a;
            int i13 = i12 == 2 ? 4 : 0;
            long j10 = bVar.f68481c;
            long j11 = c6909a.f68476f;
            this.chunkExtractors[i11] = new d(new C2378h(aVar, !z10 ? 35 : 3, null, new t(f10, i12, j10, -9223372036854775807L, j11, j11, aVar2, 0, uVarArr, i13, null, null), AbstractC3445z.t(), null), bVar.f68479a, aVar2);
        }
    }

    public static m e(androidx.media3.common.a aVar, InterfaceC4411g interfaceC4411g, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, f fVar, f.C0047f c0047f) {
        C4418n a10 = new C4418n.b().i(uri).a();
        if (c0047f != null) {
            a10 = c0047f.a().a(a10);
        }
        return new j(interfaceC4411g, a10, aVar, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, fVar);
    }

    @Override // B1.i
    public void a() {
        IOException iOException = this.f21475h;
        if (iOException != null) {
            throw iOException;
        }
        this.f21468a.a();
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void b(y yVar) {
        this.f21472e = yVar;
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void d(C6909a c6909a) {
        C6909a.b[] bVarArr = this.f21473f.streamElements;
        int i10 = this.f21469b;
        C6909a.b bVar = bVarArr[i10];
        int i11 = bVar.f68488j;
        C6909a.b bVar2 = c6909a.streamElements[i10];
        if (i11 == 0 || bVar2.f68488j == 0) {
            this.f21474g += i11;
        } else {
            int i12 = i11 - 1;
            long e10 = bVar.e(i12) + bVar.c(i12);
            long e11 = bVar2.e(0);
            if (e10 <= e11) {
                this.f21474g += i11;
            } else {
                this.f21474g += bVar.d(e11);
            }
        }
        this.f21473f = c6909a;
    }

    @Override // B1.i
    public long f(long j10, o1 o1Var) {
        C6909a.b bVar = this.f21473f.streamElements[this.f21469b];
        int d10 = bVar.d(j10);
        long e10 = bVar.e(d10);
        return o1Var.a(j10, e10, (e10 >= j10 || d10 >= bVar.f68488j + (-1)) ? e10 : bVar.e(d10 + 1));
    }

    @Override // B1.i
    public boolean g(long j10, B1.e eVar, List list) {
        if (this.f21475h != null) {
            return false;
        }
        return this.f21472e.g(j10, eVar, list);
    }

    @Override // B1.i
    public final void h(k kVar, long j10, List list, g gVar) {
        List list2;
        int g10;
        f.C0047f c0047f;
        if (this.f21475h != null) {
            return;
        }
        C6909a.b bVar = this.f21473f.streamElements[this.f21469b];
        if (bVar.f68488j == 0) {
            gVar.f566b = !r5.f68474d;
            return;
        }
        if (list.isEmpty()) {
            g10 = bVar.d(j10);
            list2 = list;
        } else {
            list2 = list;
            g10 = (int) (((m) list2.get(list.size() - 1)).g() - this.f21474g);
            if (g10 < 0) {
                this.f21475h = new C2201b();
                return;
            }
        }
        if (g10 >= bVar.f68488j) {
            gVar.f566b = !this.f21473f.f68474d;
            return;
        }
        long j11 = kVar.f21352a;
        long j12 = j10 - j11;
        long l10 = l(j11);
        int length = this.f21472e.length();
        B1.n[] nVarArr = new B1.n[length];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10;
            nVarArr[i11] = new b(bVar, this.f21472e.f(i10), g10);
            i10 = i11 + 1;
        }
        this.f21472e.n(j11, j12, l10, list2, nVarArr);
        long e10 = bVar.e(g10);
        long c10 = e10 + bVar.c(g10);
        long j13 = list.isEmpty() ? j10 : -9223372036854775807L;
        int i12 = g10 + this.f21474g;
        int d10 = this.f21472e.d();
        B1.f fVar = this.chunkExtractors[d10];
        int f10 = this.f21472e.f(d10);
        Uri a10 = bVar.a(f10, g10);
        if (this.f21471d != null) {
            c0047f = new f.C0047f(this.f21471d, "s").n(this.f21472e).e(Math.max(0L, j12)).m(kVar.f21353b).i(this.f21473f.f68474d).g(kVar.b(this.f21476i)).h(list.isEmpty()).f(c10 - e10);
            int i13 = g10 + 1;
            if (i13 < bVar.f68488j) {
                c0047f.j(U.a(a10, bVar.a(f10, i13)));
            }
        } else {
            c0047f = null;
        }
        f.C0047f c0047f2 = c0047f;
        this.f21476i = SystemClock.elapsedRealtime();
        gVar.f565a = e(this.f21472e.r(), this.f21470c, a10, i12, e10, c10, j13, this.f21472e.s(), this.f21472e.j(), fVar, c0047f2);
    }

    @Override // B1.i
    public boolean i(B1.e eVar, boolean z10, k.c cVar, D1.k kVar) {
        k.b a10 = kVar.a(E.c(this.f21472e), cVar);
        if (!z10 || a10 == null || a10.f2448a != 2) {
            return false;
        }
        y yVar = this.f21472e;
        return yVar.h(yVar.c(eVar.f559d), a10.f2449b);
    }

    @Override // B1.i
    public int j(long j10, List list) {
        return (this.f21475h != null || this.f21472e.length() < 2) ? list.size() : this.f21472e.p(j10, list);
    }

    public final long l(long j10) {
        C6909a c6909a = this.f21473f;
        if (!c6909a.f68474d) {
            return -9223372036854775807L;
        }
        C6909a.b bVar = c6909a.streamElements[this.f21469b];
        int i10 = bVar.f68488j - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    @Override // B1.i
    public void release() {
        for (B1.f fVar : this.chunkExtractors) {
            fVar.release();
        }
    }

    @Override // B1.i
    public void k(B1.e eVar) {
    }
}
