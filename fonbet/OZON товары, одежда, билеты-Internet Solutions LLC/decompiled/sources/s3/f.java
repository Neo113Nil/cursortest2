package s3;

import j3.C7272n;
import j3.r;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends AbstractC9587a {

    /* renamed from: b, reason: collision with root package name */
    public C7272n f98182b;

    /* renamed from: c, reason: collision with root package name */
    public final C9589c f98183c = new C9589c();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f98184d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f98185e;

    /* renamed from: f, reason: collision with root package name */
    public long f98186f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f98187g;

    /* renamed from: h, reason: collision with root package name */
    private final int f98188h;

    public static final class a extends IllegalStateException {
    }

    static {
        r.a("media3.decoder");
    }

    public f(int i11) {
        this.f98188h = i11;
    }

    private ByteBuffer n(int i11) {
        int i12 = this.f98188h;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f98184d;
        throw new a(Cm.e.c("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", ")", i11));
    }

    @Override // s3.AbstractC9587a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f98184d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f98187g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f98185e = false;
    }

    public final void o(int i11) {
        ByteBuffer byteBuffer = this.f98184d;
        if (byteBuffer == null) {
            this.f98184d = n(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f98184d = byteBuffer;
            return;
        }
        ByteBuffer n11 = n(i12);
        n11.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            n11.put(byteBuffer);
        }
        this.f98184d = n11;
    }

    public final void p() {
        ByteBuffer byteBuffer = this.f98184d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f98187g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean q() {
        return g(1073741824);
    }
}
