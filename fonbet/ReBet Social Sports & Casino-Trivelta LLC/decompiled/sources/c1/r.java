package c1;

import c1.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class r implements p {

    /* renamed from: b, reason: collision with root package name */
    public p.a f26785b;

    /* renamed from: c, reason: collision with root package name */
    public p.a f26786c;

    /* renamed from: d, reason: collision with root package name */
    public p.a f26787d;

    /* renamed from: e, reason: collision with root package name */
    public p.a f26788e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f26789f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f26790g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26791h;

    public r() {
        ByteBuffer byteBuffer = p.f26778a;
        this.f26789f = byteBuffer;
        this.f26790g = byteBuffer;
        p.a aVar = p.a.f26779e;
        this.f26787d = aVar;
        this.f26788e = aVar;
        this.f26785b = aVar;
        this.f26786c = aVar;
    }

    @Override // c1.p
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f26790g;
        this.f26790g = p.f26778a;
        return byteBuffer;
    }

    @Override // c1.p
    public boolean b() {
        return this.f26791h && this.f26790g == p.f26778a;
    }

    @Override // c1.p
    public final p.a c(p.a aVar) {
        this.f26787d = aVar;
        this.f26788e = h(aVar);
        return isActive() ? this.f26788e : p.a.f26779e;
    }

    @Override // c1.p
    public final void e() {
        this.f26791h = true;
        j();
    }

    @Override // c1.p
    public final void flush() {
        this.f26790g = p.f26778a;
        this.f26791h = false;
        this.f26785b = this.f26787d;
        this.f26786c = this.f26788e;
        i();
    }

    public final boolean g() {
        return this.f26790g.hasRemaining();
    }

    public abstract p.a h(p.a aVar);

    @Override // c1.p
    public boolean isActive() {
        return this.f26788e != p.a.f26779e;
    }

    public final ByteBuffer l(int i10) {
        if (this.f26789f.capacity() < i10) {
            this.f26789f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f26789f.clear();
        }
        ByteBuffer byteBuffer = this.f26789f;
        this.f26790g = byteBuffer;
        return byteBuffer;
    }

    @Override // c1.p
    public final void reset() {
        ByteBuffer byteBuffer = p.f26778a;
        this.f26790g = byteBuffer;
        this.f26791h = false;
        this.f26789f = byteBuffer;
        p.a aVar = p.a.f26779e;
        this.f26787d = aVar;
        this.f26788e = aVar;
        this.f26785b = aVar;
        this.f26786c = aVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
