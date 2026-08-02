package androidx.media3.effect;

import androidx.media3.effect.i;
import b1.C2368w;
import b1.InterfaceC2367v;
import b1.V;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.L;
import java.util.concurrent.Executor;
import l1.Y0;

/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Y0 f20662a;

    /* renamed from: b, reason: collision with root package name */
    public i.b f20663b = new C0389a();

    /* renamed from: c, reason: collision with root package name */
    public i.c f20664c = new b();

    /* renamed from: d, reason: collision with root package name */
    public i.a f20665d = new i.a() { // from class: l1.a
        @Override // androidx.media3.effect.i.a
        public final void a(b1.V v10) {
            AbstractC4156x.e("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", v10);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public Executor f20666e = Ta.r.a();

    /* renamed from: f, reason: collision with root package name */
    public int f20667f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f20668g = -1;

    /* renamed from: androidx.media3.effect.a$a, reason: collision with other inner class name */
    public class C0389a implements i.b {
        public C0389a() {
        }
    }

    public class b implements i.c {
        public b() {
        }
    }

    public a(boolean z10, int i10) {
        this.f20662a = new Y0(z10, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[Catch: a -> 0x0015, V -> 0x0017, TryCatch #2 {V -> 0x0017, a -> 0x0015, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:9:0x0032, B:11:0x0047, B:12:0x004a, B:16:0x0019), top: B:1:0x0000 }] */
    @Override // androidx.media3.effect.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(InterfaceC2367v interfaceC2367v, C2368w c2368w, long j10) {
        try {
            if (this.f20667f == c2368w.f24638d) {
                if (this.f20668g == c2368w.f24639e) {
                    if (!this.f20662a.k()) {
                    }
                    C2368w m10 = this.f20662a.m();
                    AbstractC4151s.D(m10.f24636b, m10.f24638d, m10.f24639e);
                    if (o()) {
                        AbstractC4151s.f();
                    }
                    i(c2368w.f24635a, j10);
                    this.f20663b.b(c2368w);
                    this.f20664c.d(m10, j10);
                }
            }
            int i10 = c2368w.f24638d;
            this.f20667f = i10;
            int i11 = c2368w.f24639e;
            this.f20668g = i11;
            L e10 = e(i10, i11);
            this.f20662a.d(interfaceC2367v, e10.b(), e10.a());
            C2368w m102 = this.f20662a.m();
            AbstractC4151s.D(m102.f24636b, m102.f24638d, m102.f24639e);
            if (o()) {
            }
            i(c2368w.f24635a, j10);
            this.f20663b.b(c2368w);
            this.f20664c.d(m102, j10);
        } catch (V e11) {
            e = e11;
            this.f20666e.execute(new Runnable() { // from class: l1.b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.a.this.f20665d.a(b1.V.a(e));
                }
            });
        } catch (AbstractC4151s.a e12) {
            e = e12;
            this.f20666e.execute(new Runnable() { // from class: l1.b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.a.this.f20665d.a(b1.V.a(e));
                }
            });
        }
    }

    public abstract L e(int i10, int i11);

    @Override // androidx.media3.effect.i
    public void f(Executor executor, i.a aVar) {
        this.f20666e = executor;
        this.f20665d = aVar;
    }

    @Override // androidx.media3.effect.i
    public void flush() {
        this.f20662a.e();
        this.f20663b.a();
        for (int i10 = 0; i10 < this.f20662a.a(); i10++) {
            this.f20663b.e();
        }
    }

    @Override // androidx.media3.effect.i
    public void g() {
        this.f20664c.c();
    }

    public abstract void i(int i10, long j10);

    public final i.c k() {
        return this.f20664c;
    }

    @Override // androidx.media3.effect.i
    public void l(i.c cVar) {
        this.f20664c = cVar;
    }

    @Override // androidx.media3.effect.i
    public void m(C2368w c2368w) {
        if (this.f20662a.l(c2368w)) {
            this.f20662a.g(c2368w);
            this.f20663b.e();
        }
    }

    @Override // androidx.media3.effect.i
    public void n(i.b bVar) {
        this.f20663b = bVar;
        for (int i10 = 0; i10 < this.f20662a.h(); i10++) {
            bVar.e();
        }
    }

    public boolean o() {
        return true;
    }

    @Override // androidx.media3.effect.i
    public void release() {
        try {
            this.f20662a.c();
        } catch (AbstractC4151s.a e10) {
            throw new V(e10);
        }
    }
}
