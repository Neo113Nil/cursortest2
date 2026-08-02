package u4;

import N3.M;
import j3.C7272n;
import java.util.List;
import m3.C8050C;
import n3.C8436i;
import u4.J;

/* loaded from: classes8.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final List<C7272n> f99919a;

    /* renamed from: b, reason: collision with root package name */
    private final M[] f99920b;

    /* renamed from: c, reason: collision with root package name */
    private final C8436i f99921c = new C8436i(new B90.K(this));

    public E(List list) {
        this.f99919a = list;
        this.f99920b = new M[list.size()];
    }

    public final void b() {
        this.f99921c.c();
    }

    public final void c(long j11, C8050C c8050c) {
        this.f99921c.a(j11, c8050c);
    }

    public final void d(N3.r rVar, J.d dVar) {
        int i11 = 0;
        while (true) {
            M[] mArr = this.f99920b;
            if (i11 >= mArr.length) {
                return;
            }
            dVar.a();
            M track = rVar.track(dVar.c(), 3);
            C7272n c7272n = this.f99919a.get(i11);
            String str = c7272n.f69127o;
            G10.a.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c7272n.f69113a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            C7272n.a aVar = new C7272n.a();
            aVar.j0(str2);
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

    public final void e() {
        this.f99921c.c();
    }

    public final void f(int i11) {
        this.f99921c.f(i11);
    }
}
