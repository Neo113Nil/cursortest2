package u4;

import N3.C3655f;
import N3.M;
import j3.C7272n;
import java.util.List;
import m3.C8050C;
import n3.C8436i;
import u4.J;

/* loaded from: classes8.dex */
final class L {

    /* renamed from: a, reason: collision with root package name */
    private final List<C7272n> f99972a;

    /* renamed from: b, reason: collision with root package name */
    private final M[] f99973b;

    /* renamed from: c, reason: collision with root package name */
    private final C8436i f99974c;

    public L(List list) {
        this.f99972a = list;
        this.f99973b = new M[list.size()];
        C8436i c8436i = new C8436i(new C8436i.b() { // from class: u4.K
            @Override // n3.C8436i.b
            public final void c(long j11, C8050C c8050c) {
                C3655f.b(j11, c8050c, L.this.f99973b);
            }
        });
        this.f99974c = c8436i;
        c8436i.f(3);
    }

    public final void b(long j11, C8050C c8050c) {
        if (c8050c.a() < 9) {
            return;
        }
        int p11 = c8050c.p();
        int p12 = c8050c.p();
        int E11 = c8050c.E();
        if (p11 == 434 && p12 == 1195456820 && E11 == 3) {
            this.f99974c.a(j11, c8050c);
        }
    }

    public final void c(N3.r rVar, J.d dVar) {
        int i11 = 0;
        while (true) {
            M[] mArr = this.f99973b;
            if (i11 >= mArr.length) {
                return;
            }
            dVar.a();
            M track = rVar.track(dVar.c(), 3);
            C7272n c7272n = this.f99972a.get(i11);
            String str = c7272n.f69127o;
            G10.a.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C7272n.a aVar = new C7272n.a();
            aVar.j0(dVar.b());
            aVar.W("video/mp2t");
            aVar.y0(str);
            aVar.A0(c7272n.f69117e);
            aVar.n0(c7272n.f69116d);
            aVar.Q(c7272n.f69107L);
            aVar.k0(c7272n.f69130r);
            track.a(aVar.P());
            mArr[i11] = track;
            i11++;
        }
    }
}
