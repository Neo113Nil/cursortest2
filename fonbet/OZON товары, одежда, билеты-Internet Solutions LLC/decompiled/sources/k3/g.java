package k3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import k3.e;

/* loaded from: classes.dex */
public abstract class g implements e {

    /* renamed from: b, reason: collision with root package name */
    protected e.a f70388b;

    /* renamed from: c, reason: collision with root package name */
    protected e.a f70389c;

    /* renamed from: d, reason: collision with root package name */
    private e.a f70390d;

    /* renamed from: e, reason: collision with root package name */
    private e.a f70391e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f70392f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f70393g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f70394h;

    public g() {
        ByteBuffer byteBuffer = e.f70382a;
        this.f70392f = byteBuffer;
        this.f70393g = byteBuffer;
        e.a aVar = e.a.f70383e;
        this.f70390d = aVar;
        this.f70391e = aVar;
        this.f70388b = aVar;
        this.f70389c = aVar;
    }

    @Override // k3.e
    public boolean a() {
        return this.f70394h && this.f70393g == e.f70382a;
    }

    @Override // k3.e
    public final void c() {
        this.f70394h = true;
        i();
    }

    @Override // k3.e
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f70393g;
        this.f70393g = e.f70382a;
        return byteBuffer;
    }

    @Override // k3.e
    public final e.a e(e.a aVar) throws e.b {
        this.f70390d = aVar;
        this.f70391e = g(aVar);
        return isActive() ? this.f70391e : e.a.f70383e;
    }

    protected final boolean f() {
        return this.f70393g.hasRemaining();
    }

    @Override // k3.e
    public final void flush() {
        this.f70393g = e.f70382a;
        this.f70394h = false;
        this.f70388b = this.f70390d;
        this.f70389c = this.f70391e;
        h();
    }

    protected abstract e.a g(e.a aVar) throws e.b;

    protected void h() {
    }

    protected void i() {
    }

    @Override // k3.e
    public boolean isActive() {
        return this.f70391e != e.a.f70383e;
    }

    protected void j() {
    }

    protected final ByteBuffer k(int i11) {
        if (this.f70392f.capacity() < i11) {
            this.f70392f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f70392f.clear();
        }
        ByteBuffer byteBuffer = this.f70392f;
        this.f70393g = byteBuffer;
        return byteBuffer;
    }

    @Override // k3.e
    public final void reset() {
        ByteBuffer byteBuffer = e.f70382a;
        this.f70393g = byteBuffer;
        this.f70394h = false;
        this.f70392f = byteBuffer;
        e.a aVar = e.a.f70383e;
        this.f70390d = aVar;
        this.f70391e = aVar;
        this.f70388b = aVar;
        this.f70389c = aVar;
        j();
    }
}
