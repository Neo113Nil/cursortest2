package k1;

import b1.AbstractC2332A;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends AbstractC5145a {

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.common.a f54106b;

    /* renamed from: c, reason: collision with root package name */
    public final c f54107c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f54108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f54109e;

    /* renamed from: f, reason: collision with root package name */
    public long f54110f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f54111g;

    /* renamed from: h, reason: collision with root package name */
    public final int f54112h;

    /* renamed from: i, reason: collision with root package name */
    public final int f54113i;

    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f54114a;

        /* renamed from: b, reason: collision with root package name */
        public final int f54115b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f54114a = i10;
            this.f54115b = i11;
        }
    }

    static {
        AbstractC2332A.a("media3.decoder");
    }

    public f(int i10) {
        this(i10, 0);
    }

    public static f s() {
        return new f(0);
    }

    @Override // k1.AbstractC5145a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f54108d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f54111g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f54109e = false;
    }

    public final ByteBuffer o(int i10) {
        int i11 = this.f54112h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f54108d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public void p(int i10) {
        int i11 = i10 + this.f54113i;
        ByteBuffer byteBuffer = this.f54108d;
        if (byteBuffer == null) {
            this.f54108d = o(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f54108d = byteBuffer;
            return;
        }
        ByteBuffer o10 = o(i12);
        o10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            o10.put(byteBuffer);
        }
        this.f54108d = o10;
    }

    public final void q() {
        ByteBuffer byteBuffer = this.f54108d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f54111g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean r() {
        return g(1073741824);
    }

    public void t(int i10) {
        ByteBuffer byteBuffer = this.f54111g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f54111g = ByteBuffer.allocate(i10);
        } else {
            this.f54111g.clear();
        }
    }

    public f(int i10, int i11) {
        this.f54107c = new c();
        this.f54112h = i10;
        this.f54113i = i11;
    }
}
