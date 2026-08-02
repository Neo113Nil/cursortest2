package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import androidx.media3.exoplayer.q;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.m0;
import b1.AbstractC2346O;
import b1.C2350d;
import b1.S;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public b f21911a;

    /* renamed from: b, reason: collision with root package name */
    public D1.d f21912b;

    public interface a {
        F a(Context context);
    }

    public interface b {
        void a(androidx.media3.exoplayer.p pVar);

        void b();
    }

    public final D1.d b() {
        return (D1.d) AbstractC4134a.i(this.f21912b);
    }

    public abstract S c();

    public abstract q.a d();

    public void e(b bVar, D1.d dVar) {
        AbstractC4134a.g(this.f21911a == null);
        this.f21911a = bVar;
        this.f21912b = dVar;
    }

    public final void f() {
        b bVar = this.f21911a;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void g(androidx.media3.exoplayer.p pVar) {
        b bVar = this.f21911a;
        if (bVar != null) {
            bVar.a(pVar);
        }
    }

    public abstract boolean h();

    public abstract void i(Object obj);

    public void j() {
        this.f21911a = null;
        this.f21912b = null;
    }

    public abstract G k(androidx.media3.exoplayer.q[] qVarArr, m0 m0Var, D.b bVar, AbstractC2346O abstractC2346O);

    public abstract void l(C2350d c2350d);

    public abstract void m(S s10);
}
