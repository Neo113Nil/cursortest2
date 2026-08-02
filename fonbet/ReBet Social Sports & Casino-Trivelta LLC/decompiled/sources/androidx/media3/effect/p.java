package androidx.media3.effect;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.effect.i;
import androidx.media3.effect.r;
import b1.C2366u;
import b1.InterfaceC2336E;
import e1.S;

/* loaded from: classes.dex */
public abstract class p implements i.b {

    /* renamed from: a, reason: collision with root package name */
    public final r f20844a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20845b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public r.b f20846c;

    public p(r rVar) {
        this.f20844a = rVar;
    }

    @Override // androidx.media3.effect.i.b
    public final void a() {
        this.f20844a.j(new r.b() { // from class: l1.X0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.p.this.d();
            }
        });
    }

    public void c() {
    }

    public void d() {
        synchronized (this.f20845b) {
            try {
                r.b bVar = this.f20846c;
                if (bVar != null) {
                    this.f20844a.l(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Surface f() {
        throw new UnsupportedOperationException();
    }

    public abstract int g();

    public void h(Bitmap bitmap, C2366u c2366u, S s10) {
        throw new UnsupportedOperationException();
    }

    public void i(int i10, long j10) {
        throw new UnsupportedOperationException();
    }

    public void j(C2366u c2366u) {
        throw new UnsupportedOperationException();
    }

    public abstract void k();

    public void l() {
    }

    public final void n(r.b bVar) {
        synchronized (this.f20845b) {
            this.f20846c = bVar;
        }
    }

    public void o(InterfaceC2336E interfaceC2336E) {
        throw new UnsupportedOperationException();
    }

    public abstract void p(i iVar);

    public abstract void q();

    public void m(C2366u c2366u, boolean z10) {
    }
}
