package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.L;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import h1.InterfaceC4403F;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n1.G1;
import q1.t;

/* renamed from: androidx.media3.exoplayer.source.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2200a implements D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21674a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21675b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final L.a f21676c = new L.a();

    /* renamed from: d, reason: collision with root package name */
    public final t.a f21677d = new t.a();

    /* renamed from: e, reason: collision with root package name */
    public Looper f21678e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC2346O f21679f;

    /* renamed from: g, reason: collision with root package name */
    public G1 f21680g;

    public void A() {
    }

    public final G1 B() {
        return (G1) AbstractC4134a.i(this.f21680g);
    }

    public final boolean C() {
        return !this.f21675b.isEmpty();
    }

    public abstract void D(InterfaceC4403F interfaceC4403F);

    public final void E(AbstractC2346O abstractC2346O) {
        this.f21679f = abstractC2346O;
        Iterator it = this.f21674a.iterator();
        while (it.hasNext()) {
            ((D.c) it.next()).a(this, abstractC2346O);
        }
    }

    public abstract void F();

    @Override // androidx.media3.exoplayer.source.D
    public final void a(Handler handler, L l10) {
        AbstractC4134a.e(handler);
        AbstractC4134a.e(l10);
        this.f21676c.h(handler, l10);
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void b(L l10) {
        this.f21676c.x(l10);
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void g(D.c cVar) {
        AbstractC4134a.e(this.f21678e);
        boolean isEmpty = this.f21675b.isEmpty();
        this.f21675b.add(cVar);
        if (isEmpty) {
            A();
        }
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void k(D.c cVar) {
        this.f21674a.remove(cVar);
        if (!this.f21674a.isEmpty()) {
            m(cVar);
            return;
        }
        this.f21678e = null;
        this.f21679f = null;
        this.f21680g = null;
        this.f21675b.clear();
        F();
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void m(D.c cVar) {
        boolean isEmpty = this.f21675b.isEmpty();
        this.f21675b.remove(cVar);
        if (isEmpty || !this.f21675b.isEmpty()) {
            return;
        }
        z();
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void p(D.c cVar, InterfaceC4403F interfaceC4403F, G1 g12) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21678e;
        AbstractC4134a.a(looper == null || looper == myLooper);
        this.f21680g = g12;
        AbstractC2346O abstractC2346O = this.f21679f;
        this.f21674a.add(cVar);
        if (this.f21678e == null) {
            this.f21678e = myLooper;
            this.f21675b.add(cVar);
            D(interfaceC4403F);
        } else if (abstractC2346O != null) {
            g(cVar);
            cVar.a(this, abstractC2346O);
        }
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void t(q1.t tVar) {
        this.f21677d.n(tVar);
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void u(Handler handler, q1.t tVar) {
        AbstractC4134a.e(handler);
        AbstractC4134a.e(tVar);
        this.f21677d.g(handler, tVar);
    }

    public final t.a v(int i10, D.b bVar) {
        return this.f21677d.o(i10, bVar);
    }

    public final t.a w(D.b bVar) {
        return this.f21677d.o(0, bVar);
    }

    public final L.a x(int i10, D.b bVar) {
        return this.f21676c.A(i10, bVar);
    }

    public final L.a y(D.b bVar) {
        return this.f21676c.A(0, bVar);
    }

    public void z() {
    }
}
