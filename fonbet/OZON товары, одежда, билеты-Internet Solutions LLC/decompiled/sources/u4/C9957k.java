package u4;

import N3.M;
import j3.C7272n;
import java.util.Collections;
import java.util.List;
import m3.C8050C;
import u4.J;

/* renamed from: u4.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9957k implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final List<J.a> f100062a;

    /* renamed from: b, reason: collision with root package name */
    private final M[] f100063b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f100064c;

    /* renamed from: d, reason: collision with root package name */
    private int f100065d;

    /* renamed from: e, reason: collision with root package name */
    private int f100066e;

    /* renamed from: f, reason: collision with root package name */
    private long f100067f = -9223372036854775807L;

    public C9957k(List list) {
        this.f100062a = list;
        this.f100063b = new M[list.size()];
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100064c = false;
        this.f100067f = -9223372036854775807L;
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) {
        boolean z11;
        boolean z12;
        if (this.f100064c) {
            if (this.f100065d == 2) {
                if (c8050c.a() == 0) {
                    z12 = false;
                } else {
                    if (c8050c.E() != 32) {
                        this.f100064c = false;
                    }
                    this.f100065d--;
                    z12 = this.f100064c;
                }
                if (!z12) {
                    return;
                }
            }
            if (this.f100065d == 1) {
                if (c8050c.a() == 0) {
                    z11 = false;
                } else {
                    if (c8050c.E() != 0) {
                        this.f100064c = false;
                    }
                    this.f100065d--;
                    z11 = this.f100064c;
                }
                if (!z11) {
                    return;
                }
            }
            int f7 = c8050c.f();
            int a11 = c8050c.a();
            for (M m11 : this.f100063b) {
                c8050c.R(f7);
                m11.e(a11, c8050c);
            }
            this.f100066e += a11;
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f100064c = true;
        this.f100067f = j11;
        this.f100066e = 0;
        this.f100065d = 2;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        int i11 = 0;
        while (true) {
            M[] mArr = this.f100063b;
            if (i11 >= mArr.length) {
                return;
            }
            J.a aVar = this.f100062a.get(i11);
            dVar.a();
            M track = rVar.track(dVar.c(), 3);
            C7272n.a aVar2 = new C7272n.a();
            aVar2.j0(dVar.b());
            aVar2.W("video/mp2t");
            aVar2.y0("application/dvbsubs");
            aVar2.k0(Collections.singletonList(aVar.f99961b));
            aVar2.n0(aVar.f99960a);
            track.a(aVar2.P());
            mArr[i11] = track;
            i11++;
        }
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
        if (this.f100064c) {
            G10.a.h(this.f100067f != -9223372036854775807L);
            for (M m11 : this.f100063b) {
                m11.b(this.f100067f, 1, this.f100066e, 0, null);
            }
            this.f100064c = false;
        }
    }
}
