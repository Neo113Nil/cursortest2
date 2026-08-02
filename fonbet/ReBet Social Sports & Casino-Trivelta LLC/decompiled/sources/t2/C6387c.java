package t2;

import c1.p;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l1.AbstractC5366l;
import t2.InterfaceC6391e;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6387c {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6391e f65270b;

    /* renamed from: c, reason: collision with root package name */
    public final c1.o f65271c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65273e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65274f;

    /* renamed from: g, reason: collision with root package name */
    public long f65275g;

    /* renamed from: i, reason: collision with root package name */
    public int f65277i;

    /* renamed from: a, reason: collision with root package name */
    public final List f65269a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public p.a f65272d = p.a.f26779e;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f65276h = c1.p.f26778a;

    /* renamed from: t2.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C6389d f65278a;

        /* renamed from: b, reason: collision with root package name */
        public int f65279b = -1;

        public a(C6389d c6389d) {
            this.f65278a = c6389d;
        }
    }

    public C6387c(InterfaceC6391e.a aVar, AbstractC3445z abstractC3445z) {
        this.f65270b = aVar.create();
        this.f65271c = new c1.o(abstractC3445z);
    }

    public static boolean h(p.a aVar) {
        return (aVar.f26782c == -1 || aVar.f26780a == -1 || aVar.f26781b == -1) ? false : true;
    }

    public final boolean a() {
        if (this.f65274f) {
            return true;
        }
        if (!this.f65273e) {
            try {
                this.f65270b.g(this.f65272d, -1, this.f65275g);
                this.f65273e = true;
            } catch (p.b e10) {
                throw C6427w0.b(e10, "Error while configuring mixer");
            }
        }
        this.f65274f = true;
        for (int i10 = 0; i10 < this.f65269a.size(); i10++) {
            a aVar = (a) this.f65269a.get(i10);
            if (aVar.f65279b == -1) {
                C6389d c6389d = aVar.f65278a;
                try {
                    c6389d.p();
                    long s10 = c6389d.s();
                    if (s10 == -9223372036854775807L) {
                        this.f65274f = false;
                    } else if (s10 != Long.MIN_VALUE) {
                        aVar.f65279b = this.f65270b.d(c6389d.q(), s10);
                    }
                } catch (p.b e11) {
                    throw C6427w0.b(e11, "Unhandled format while adding source " + aVar.f65279b);
                }
            }
        }
        return this.f65274f;
    }

    public final void b() {
        for (int i10 = 0; i10 < this.f65269a.size(); i10++) {
            c((a) this.f65269a.get(i10));
        }
    }

    public final void c(a aVar) {
        int i10 = aVar.f65279b;
        if (this.f65270b.e(i10)) {
            C6389d c6389d = aVar.f65278a;
            if (c6389d.u()) {
                this.f65270b.c(i10);
                aVar.f65279b = -1;
                this.f65277i++;
                return;
            }
            try {
                this.f65270b.f(i10, c6389d.p());
            } catch (p.b e10) {
                throw C6427w0.b(e10, "AudioGraphInput (sourceId=" + i10 + ") reconfiguration");
            }
        }
    }

    public final void d() {
        if (i()) {
            this.f65271c.i();
        } else {
            this.f65271c.j(this.f65276h);
        }
    }

    public ByteBuffer e() {
        if (!a()) {
            return c1.p.f26778a;
        }
        if (!this.f65270b.b()) {
            b();
        }
        if (!this.f65276h.hasRemaining()) {
            this.f65276h = this.f65270b.a();
        }
        if (!this.f65271c.g()) {
            return this.f65276h;
        }
        d();
        return this.f65271c.d();
    }

    public p.a f() {
        return this.f65271c.e();
    }

    public boolean g() {
        return this.f65271c.g() ? this.f65271c.f() : i();
    }

    public final boolean i() {
        return !this.f65276h.hasRemaining() && this.f65277i >= this.f65269a.size() && this.f65270b.b();
    }

    public C6389d j(E e10, androidx.media3.common.a aVar) {
        AbstractC4134a.a(aVar.f20520H != -1);
        try {
            C6389d c6389d = new C6389d(this.f65272d, e10, aVar);
            if (Objects.equals(this.f65272d, p.a.f26779e)) {
                p.a q10 = c6389d.q();
                this.f65272d = q10;
                this.f65271c.a(q10);
                this.f65271c.b();
            }
            this.f65269a.add(new a(c6389d));
            AbstractC5366l.f("AudioGraph", "RegisterNewInputStream", -9223372036854775807L, "%s", aVar);
            return c6389d;
        } catch (p.b e11) {
            throw C6427w0.b(e11, "Error while registering input " + this.f65269a.size());
        }
    }

    public void k() {
        for (int i10 = 0; i10 < this.f65269a.size(); i10++) {
            ((a) this.f65269a.get(i10)).f65278a.v();
        }
        this.f65269a.clear();
        this.f65270b.reset();
        this.f65271c.k();
        this.f65277i = 0;
        this.f65276h = c1.p.f26778a;
        this.f65272d = p.a.f26779e;
    }
}
