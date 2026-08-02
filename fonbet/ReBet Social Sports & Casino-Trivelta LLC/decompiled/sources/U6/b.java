package U6;

import H7.m;
import com.facebook.drawee.drawable.G;
import java.io.Closeable;
import o7.C5819a;
import o7.EnumC5823e;
import o7.InterfaceC5820b;
import o7.i;
import o7.j;
import o7.n;

/* loaded from: classes2.dex */
public class b extends C5819a implements Closeable, G {

    /* renamed from: c, reason: collision with root package name */
    public final K6.b f12109c;

    /* renamed from: d, reason: collision with root package name */
    public final j f12110d;

    /* renamed from: e, reason: collision with root package name */
    public final i f12111e;

    /* renamed from: f, reason: collision with root package name */
    public i f12112f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12113g;

    public b(K6.b bVar, j jVar, i iVar) {
        this(bVar, jVar, iVar, true);
    }

    public final void A0(j jVar, long j10) {
        jVar.R(false);
        jVar.L(j10);
        y1(jVar, n.f59469e);
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void B(String str, InterfaceC5820b.a aVar) {
        long now = this.f12109c.now();
        j jVar = this.f12110d;
        jVar.F(aVar);
        jVar.B(str);
        n1(jVar, EnumC5823e.f59382i);
        if (this.f12113g) {
            A0(jVar, now);
        }
    }

    public void D0(j jVar, long j10) {
        jVar.R(true);
        jVar.Q(j10);
        y1(jVar, n.f59468d);
    }

    @Override // com.facebook.drawee.drawable.G
    public void U(boolean z10) {
        if (z10) {
            D0(this.f12110d, this.f12109c.now());
        } else {
            A0(this.f12110d, this.f12109c.now());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1();
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void d(String str, Object obj, InterfaceC5820b.a aVar) {
        long now = this.f12109c.now();
        j jVar = this.f12110d;
        jVar.x();
        jVar.D(now);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        n1(jVar, EnumC5823e.f59377d);
        if (this.f12113g) {
            D0(jVar, now);
        }
    }

    public void m1() {
        this.f12110d.w();
    }

    public final void n1(j jVar, EnumC5823e enumC5823e) {
        jVar.H(enumC5823e);
        this.f12111e.b(jVar, enumC5823e);
        i iVar = this.f12112f;
        if (iVar != null) {
            iVar.b(jVar, enumC5823e);
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void r(String str, Throwable th2, InterfaceC5820b.a aVar) {
        long now = this.f12109c.now();
        j jVar = this.f12110d;
        jVar.F(aVar);
        jVar.z(now);
        jVar.B(str);
        jVar.E(th2);
        n1(jVar, EnumC5823e.f59380g);
        A0(jVar, now);
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void k(String str, m mVar, InterfaceC5820b.a aVar) {
        long now = this.f12109c.now();
        j jVar = this.f12110d;
        jVar.F(aVar);
        jVar.A(now);
        jVar.J(now);
        jVar.B(str);
        jVar.G(mVar);
        n1(jVar, EnumC5823e.f59379f);
    }

    public final void y1(j jVar, n nVar) {
        this.f12111e.a(jVar, nVar);
        i iVar = this.f12112f;
        if (iVar != null) {
            iVar.a(jVar, nVar);
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void onIntermediateImageSet(String str, m mVar) {
        long now = this.f12109c.now();
        j jVar = this.f12110d;
        jVar.C(now);
        jVar.B(str);
        jVar.G(mVar);
        n1(jVar, EnumC5823e.f59378e);
    }

    public b(K6.b bVar, j jVar, i iVar, boolean z10) {
        this.f12112f = null;
        this.f12109c = bVar;
        this.f12110d = jVar;
        this.f12111e = iVar;
        this.f12113g = z10;
    }

    @Override // com.facebook.drawee.drawable.G
    public void onDraw() {
    }
}
