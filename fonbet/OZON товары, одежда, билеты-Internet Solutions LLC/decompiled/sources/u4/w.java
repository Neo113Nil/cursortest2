package u4;

import N3.M;
import j3.C7272n;
import m3.C8050C;
import m3.C8056I;
import m3.N;
import u4.J;

/* loaded from: classes8.dex */
public final class w implements C {

    /* renamed from: a, reason: collision with root package name */
    private C7272n f100269a;

    /* renamed from: b, reason: collision with root package name */
    private C8056I f100270b;

    /* renamed from: c, reason: collision with root package name */
    private M f100271c;

    public w(String str) {
        C7272n.a aVar = new C7272n.a();
        aVar.W("video/mp2t");
        aVar.y0(str);
        this.f100269a = aVar.P();
    }

    @Override // u4.C
    public final void a(C8056I c8056i, N3.r rVar, J.d dVar) {
        this.f100270b = c8056i;
        dVar.a();
        M track = rVar.track(dVar.c(), 5);
        this.f100271c = track;
        track.a(this.f100269a);
    }

    @Override // u4.C
    public final void c(C8050C c8050c) {
        G10.a.i(this.f100270b);
        int i11 = N.f74289a;
        long e11 = this.f100270b.e();
        long f7 = this.f100270b.f();
        if (e11 == -9223372036854775807L || f7 == -9223372036854775807L) {
            return;
        }
        C7272n c7272n = this.f100269a;
        if (f7 != c7272n.f69132t) {
            C7272n.a a11 = c7272n.a();
            a11.C0(f7);
            C7272n P11 = a11.P();
            this.f100269a = P11;
            this.f100271c.a(P11);
        }
        int a12 = c8050c.a();
        this.f100271c.e(a12, c8050c);
        this.f100271c.b(e11, 1, a12, 0, null);
    }
}
