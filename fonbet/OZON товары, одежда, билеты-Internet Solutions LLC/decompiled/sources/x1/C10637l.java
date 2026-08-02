package x1;

import D1.C2823x;
import androidx.collection.C5153w;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10637l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<C10636k> f104894a = new U0.b<>(new C10636k[16]);

    public boolean a(@NotNull C5153w c5153w, @NotNull C2823x c2823x, @NotNull C10633h c10633h, boolean z11) {
        U0.b<C10636k> bVar = this.f104894a;
        int m11 = bVar.m();
        if (m11 <= 0) {
            return false;
        }
        C10636k[] l11 = bVar.l();
        int i11 = 0;
        boolean z12 = false;
        do {
            z12 = l11[i11].a(c5153w, c2823x, c10633h, z11) || z12;
            i11++;
        } while (i11 < m11);
        return z12;
    }

    public void b(@NotNull C10633h c10633h) {
        U0.b<C10636k> bVar = this.f104894a;
        int m11 = bVar.m();
        while (true) {
            m11--;
            if (-1 >= m11) {
                return;
            }
            if (bVar.l()[m11].k().f()) {
                bVar.u(m11);
            }
        }
    }

    public final void c() {
        this.f104894a.h();
    }

    public void d() {
        U0.b<C10636k> bVar = this.f104894a;
        int m11 = bVar.m();
        if (m11 > 0) {
            C10636k[] l11 = bVar.l();
            int i11 = 0;
            do {
                l11[i11].d();
                i11++;
            } while (i11 < m11);
        }
    }

    public boolean e(@NotNull C10633h c10633h) {
        U0.b<C10636k> bVar = this.f104894a;
        int m11 = bVar.m();
        boolean z11 = false;
        if (m11 > 0) {
            C10636k[] l11 = bVar.l();
            int i11 = 0;
            boolean z12 = false;
            do {
                z12 = l11[i11].e(c10633h) || z12;
                i11++;
            } while (i11 < m11);
            z11 = z12;
        }
        b(c10633h);
        return z11;
    }

    public boolean f(@NotNull C5153w<x> c5153w, @NotNull B1.B b11, @NotNull C10633h c10633h, boolean z11) {
        U0.b<C10636k> bVar = this.f104894a;
        int m11 = bVar.m();
        if (m11 <= 0) {
            return false;
        }
        C10636k[] l11 = bVar.l();
        int i11 = 0;
        boolean z12 = false;
        do {
            z12 = l11[i11].f(c5153w, b11, c10633h, z11) || z12;
            i11++;
        } while (i11 < m11);
        return z12;
    }

    @NotNull
    public final U0.b<C10636k> g() {
        return this.f104894a;
    }

    public final void h() {
        int i11 = 0;
        while (true) {
            U0.b<C10636k> bVar = this.f104894a;
            if (i11 >= bVar.m()) {
                return;
            }
            C10636k c10636k = bVar.l()[i11];
            if (c10636k.j().isAttached()) {
                i11++;
                c10636k.h();
            } else {
                c10636k.d();
                bVar.u(i11);
            }
        }
    }

    public void i(long j11, @NotNull androidx.collection.J<C10636k> j12) {
        U0.b<C10636k> bVar = this.f104894a;
        int m11 = bVar.m();
        if (m11 > 0) {
            C10636k[] l11 = bVar.l();
            int i11 = 0;
            do {
                l11[i11].i(j11, j12);
                i11++;
            } while (i11 < m11);
        }
    }
}
