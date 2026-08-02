package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.L;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import h1.InterfaceC4403F;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import q1.t;

/* renamed from: androidx.media3.exoplayer.source.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2207h extends AbstractC2200a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f21787h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f21788i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC4403F f21789j;

    /* renamed from: androidx.media3.exoplayer.source.h$a */
    public final class a implements L, q1.t {

        /* renamed from: a, reason: collision with root package name */
        public final Object f21790a;

        /* renamed from: b, reason: collision with root package name */
        public L.a f21791b;

        /* renamed from: c, reason: collision with root package name */
        public t.a f21792c;

        public a(Object obj) {
            this.f21791b = AbstractC2207h.this.y(null);
            this.f21792c = AbstractC2207h.this.w(null);
            this.f21790a = obj;
        }

        @Override // q1.t
        public void O(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f21792c.h();
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void R(int i10, D.b bVar, C2223y c2223y, B b10, int i11) {
            if (a(i10, bVar)) {
                this.f21791b.w(c2223y, b(b10, bVar), i11);
            }
        }

        @Override // q1.t
        public void T(int i10, D.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f21792c.k(i11);
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void U(int i10, D.b bVar, C2223y c2223y, B b10, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f21791b.t(c2223y, b(b10, bVar), iOException, z10);
            }
        }

        @Override // q1.t
        public void Y(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f21792c.i();
            }
        }

        @Override // q1.t
        public void Z(int i10, D.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f21792c.l(exc);
            }
        }

        public final boolean a(int i10, D.b bVar) {
            D.b bVar2;
            if (bVar != null) {
                bVar2 = AbstractC2207h.this.H(this.f21790a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int J10 = AbstractC2207h.this.J(this.f21790a, i10);
            L.a aVar = this.f21791b;
            if (aVar.f21543a != J10 || !Objects.equals(aVar.f21544b, bVar2)) {
                this.f21791b = AbstractC2207h.this.x(J10, bVar2);
            }
            t.a aVar2 = this.f21792c;
            if (aVar2.f63345a == J10 && Objects.equals(aVar2.f63346b, bVar2)) {
                return true;
            }
            this.f21792c = AbstractC2207h.this.v(J10, bVar2);
            return true;
        }

        @Override // androidx.media3.exoplayer.source.L
        public void a0(int i10, D.b bVar, C2223y c2223y, B b10) {
            if (a(i10, bVar)) {
                this.f21791b.n(c2223y, b(b10, bVar));
            }
        }

        public final B b(B b10, D.b bVar) {
            long I10 = AbstractC2207h.this.I(this.f21790a, b10.f21513f, bVar);
            long I11 = AbstractC2207h.this.I(this.f21790a, b10.f21514g, bVar);
            return (I10 == b10.f21513f && I11 == b10.f21514g) ? b10 : new B(b10.f21508a, b10.f21509b, b10.f21510c, b10.f21511d, b10.f21512e, I10, I11);
        }

        @Override // androidx.media3.exoplayer.source.L
        public void h0(int i10, D.b bVar, C2223y c2223y, B b10) {
            if (a(i10, bVar)) {
                this.f21791b.q(c2223y, b(b10, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void j0(int i10, D.b bVar, B b10) {
            if (a(i10, bVar)) {
                this.f21791b.k(b(b10, bVar));
            }
        }

        @Override // q1.t
        public void k0(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f21792c.j();
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void m(int i10, D.b bVar, B b10) {
            if (a(i10, bVar)) {
                this.f21791b.z(b(b10, bVar));
            }
        }

        @Override // q1.t
        public void p0(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f21792c.m();
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.h$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final D f21794a;

        /* renamed from: b, reason: collision with root package name */
        public final D.c f21795b;

        /* renamed from: c, reason: collision with root package name */
        public final a f21796c;

        public b(D d10, D.c cVar, a aVar) {
            this.f21794a = d10;
            this.f21795b = cVar;
            this.f21796c = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void A() {
        for (b bVar : this.f21787h.values()) {
            bVar.f21794a.g(bVar.f21795b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        this.f21789j = interfaceC4403F;
        this.f21788i = e1.Z.z();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        for (b bVar : this.f21787h.values()) {
            bVar.f21794a.k(bVar.f21795b);
            bVar.f21794a.b(bVar.f21796c);
            bVar.f21794a.t(bVar.f21796c);
        }
        this.f21787h.clear();
    }

    public abstract D.b H(Object obj, D.b bVar);

    public long I(Object obj, long j10, D.b bVar) {
        return j10;
    }

    public int J(Object obj, int i10) {
        return i10;
    }

    public abstract void K(Object obj, D d10, AbstractC2346O abstractC2346O);

    public final void L(final Object obj, D d10) {
        AbstractC4134a.a(!this.f21787h.containsKey(obj));
        D.c cVar = new D.c() { // from class: androidx.media3.exoplayer.source.g
            @Override // androidx.media3.exoplayer.source.D.c
            public final void a(D d11, AbstractC2346O abstractC2346O) {
                AbstractC2207h.this.K(obj, d11, abstractC2346O);
            }
        };
        a aVar = new a(obj);
        this.f21787h.put(obj, new b(d10, cVar, aVar));
        d10.a((Handler) AbstractC4134a.e(this.f21788i), aVar);
        d10.u((Handler) AbstractC4134a.e(this.f21788i), aVar);
        d10.p(cVar, this.f21789j, B());
        if (C()) {
            return;
        }
        d10.m(cVar);
    }

    @Override // androidx.media3.exoplayer.source.D
    public void q() {
        Iterator it = this.f21787h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f21794a.q();
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void z() {
        for (b bVar : this.f21787h.values()) {
            bVar.f21794a.m(bVar.f21795b);
        }
    }
}
