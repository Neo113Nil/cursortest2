package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.L;
import e1.AbstractC4134a;
import e1.InterfaceC4148o;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface L {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f21543a;

        /* renamed from: b, reason: collision with root package name */
        public final D.b f21544b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f21545c;

        /* renamed from: androidx.media3.exoplayer.source.L$a$a, reason: collision with other inner class name */
        public static final class C0392a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f21546a;

            /* renamed from: b, reason: collision with root package name */
            public L f21547b;

            public C0392a(Handler handler, L l10) {
                this.f21546a = handler;
                this.f21547b = l10;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a A(int i10, D.b bVar) {
            return new a(this.f21545c, i10, bVar);
        }

        public void h(Handler handler, L l10) {
            AbstractC4134a.e(handler);
            AbstractC4134a.e(l10);
            this.f21545c.add(new C0392a(handler, l10));
        }

        public void i(final InterfaceC4148o interfaceC4148o) {
            Iterator it = this.f21545c.iterator();
            while (it.hasNext()) {
                C0392a c0392a = (C0392a) it.next();
                final L l10 = c0392a.f21547b;
                e1.Z.l1(c0392a.f21546a, new Runnable() { // from class: androidx.media3.exoplayer.source.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4148o.this.accept(l10);
                    }
                });
            }
        }

        public void j(int i10, androidx.media3.common.a aVar, int i11, Object obj, long j10) {
            k(new B(1, i10, aVar, i11, obj, e1.Z.J1(j10), -9223372036854775807L));
        }

        public void k(final B b10) {
            i(new InterfaceC4148o() { // from class: androidx.media3.exoplayer.source.E
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.j0(r0.f21543a, L.a.this.f21544b, b10);
                }
            });
        }

        public void l(C2223y c2223y, int i10) {
            m(c2223y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(C2223y c2223y, int i10, int i11, androidx.media3.common.a aVar, int i12, Object obj, long j10, long j11) {
            n(c2223y, new B(i10, i11, aVar, i12, obj, e1.Z.J1(j10), e1.Z.J1(j11)));
        }

        public void n(final C2223y c2223y, final B b10) {
            i(new InterfaceC4148o() { // from class: androidx.media3.exoplayer.source.I
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.a0(r0.f21543a, L.a.this.f21544b, c2223y, b10);
                }
            });
        }

        public void o(C2223y c2223y, int i10) {
            p(c2223y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(C2223y c2223y, int i10, int i11, androidx.media3.common.a aVar, int i12, Object obj, long j10, long j11) {
            q(c2223y, new B(i10, i11, aVar, i12, obj, e1.Z.J1(j10), e1.Z.J1(j11)));
        }

        public void q(final C2223y c2223y, final B b10) {
            i(new InterfaceC4148o() { // from class: androidx.media3.exoplayer.source.G
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.h0(r0.f21543a, L.a.this.f21544b, c2223y, b10);
                }
            });
        }

        public void r(C2223y c2223y, int i10, int i11, androidx.media3.common.a aVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(c2223y, new B(i10, i11, aVar, i12, obj, e1.Z.J1(j10), e1.Z.J1(j11)), iOException, z10);
        }

        public void s(C2223y c2223y, int i10, IOException iOException, boolean z10) {
            r(c2223y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void t(final C2223y c2223y, final B b10, final IOException iOException, final boolean z10) {
            i(new InterfaceC4148o() { // from class: androidx.media3.exoplayer.source.H
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.U(r0.f21543a, L.a.this.f21544b, c2223y, b10, iOException, z10);
                }
            });
        }

        public void u(C2223y c2223y, int i10, int i11) {
            v(c2223y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        public void v(C2223y c2223y, int i10, int i11, androidx.media3.common.a aVar, int i12, Object obj, long j10, long j11, int i13) {
            w(c2223y, new B(i10, i11, aVar, i12, obj, e1.Z.J1(j10), e1.Z.J1(j11)), i13);
        }

        public void w(final C2223y c2223y, final B b10, final int i10) {
            i(new InterfaceC4148o() { // from class: androidx.media3.exoplayer.source.F
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.R(r0.f21543a, L.a.this.f21544b, c2223y, b10, i10);
                }
            });
        }

        public void x(L l10) {
            Iterator it = this.f21545c.iterator();
            while (it.hasNext()) {
                C0392a c0392a = (C0392a) it.next();
                if (c0392a.f21547b == l10) {
                    this.f21545c.remove(c0392a);
                }
            }
        }

        public void y(int i10, long j10, long j11) {
            z(new B(1, i10, null, 3, null, e1.Z.J1(j10), e1.Z.J1(j11)));
        }

        public void z(final B b10) {
            final D.b bVar = (D.b) AbstractC4134a.e(this.f21544b);
            i(new InterfaceC4148o() { // from class: androidx.media3.exoplayer.source.J
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.m(L.a.this.f21543a, bVar, b10);
                }
            });
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, D.b bVar) {
            this.f21545c = copyOnWriteArrayList;
            this.f21543a = i10;
            this.f21544b = bVar;
        }
    }

    void R(int i10, D.b bVar, C2223y c2223y, B b10, int i11);

    void U(int i10, D.b bVar, C2223y c2223y, B b10, IOException iOException, boolean z10);

    void a0(int i10, D.b bVar, C2223y c2223y, B b10);

    void h0(int i10, D.b bVar, C2223y c2223y, B b10);

    void j0(int i10, D.b bVar, B b10);

    void m(int i10, D.b bVar, B b10);
}
