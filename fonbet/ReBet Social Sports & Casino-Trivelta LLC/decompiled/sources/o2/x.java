package o2;

import androidx.media3.common.a;
import e1.AbstractC4134a;
import e1.Q;
import e1.Z;
import o2.L;

/* loaded from: classes.dex */
public final class x implements InterfaceC5777D {

    /* renamed from: a, reason: collision with root package name */
    public androidx.media3.common.a f59287a;

    /* renamed from: b, reason: collision with root package name */
    public Q f59288b;

    /* renamed from: c, reason: collision with root package name */
    public H1.O f59289c;

    public x(String str, String str2) {
        this.f59287a = new a.b().W(str2).y0(str).P();
    }

    @Override // o2.InterfaceC5777D
    public void a(e1.J j10) {
        b();
        long e10 = this.f59288b.e();
        long f10 = this.f59288b.f();
        if (e10 == -9223372036854775807L || f10 == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.a aVar = this.f59287a;
        if (f10 != aVar.f20548t) {
            androidx.media3.common.a P10 = aVar.b().C0(f10).P();
            this.f59287a = P10;
            this.f59289c.c(P10);
        }
        int a10 = j10.a();
        this.f59289c.a(j10, a10);
        this.f59289c.g(e10, 1, a10, 0, null);
    }

    public final void b() {
        AbstractC4134a.i(this.f59288b);
        Z.i(this.f59289c);
    }

    @Override // o2.InterfaceC5777D
    public void c(Q q10, H1.r rVar, L.d dVar) {
        this.f59288b = q10;
        dVar.a();
        H1.O c10 = rVar.c(dVar.c(), 5);
        this.f59289c = c10;
        c10.c(this.f59287a);
    }
}
