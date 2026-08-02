package K7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class F extends G6.k {

    /* renamed from: a, reason: collision with root package name */
    public final B f6254a;

    /* renamed from: b, reason: collision with root package name */
    public H6.a f6255b;

    /* renamed from: c, reason: collision with root package name */
    public int f6256c;

    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ F(B b10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, (i11 & 2) != 0 ? b10.C() : i10);
    }

    @Override // G6.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public D d() {
        k();
        H6.a aVar = this.f6255b;
        if (aVar != null) {
            return new D(aVar, this.f6256c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // G6.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H6.a.U(this.f6255b);
        this.f6255b = null;
        this.f6256c = -1;
        super.close();
    }

    public final void k() {
        if (!H6.a.isValid(this.f6255b)) {
            throw new a();
        }
    }

    public final void r(int i10) {
        k();
        H6.a aVar = this.f6255b;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.checkNotNull(aVar);
        if (i10 <= ((A) aVar.z0()).getSize()) {
            return;
        }
        Object obj = this.f6254a.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        A a10 = (A) obj;
        H6.a aVar2 = this.f6255b;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.checkNotNull(aVar2);
        ((A) aVar2.z0()).r(0, a10, 0, this.f6256c);
        H6.a aVar3 = this.f6255b;
        Intrinsics.checkNotNull(aVar3);
        aVar3.close();
        this.f6255b = H6.a.n1(a10, this.f6254a);
    }

    @Override // G6.k
    public int size() {
        return this.f6256c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        write(new byte[]{(byte) i10});
    }

    public F(B pool, int i10) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i10 > 0) {
            this.f6254a = pool;
            this.f6256c = 0;
            this.f6255b = H6.a.n1(pool.get(i10), pool);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= buffer.length) {
            k();
            r(this.f6256c + i11);
            H6.a aVar = this.f6255b;
            if (aVar != null) {
                ((A) aVar.z0()).k(this.f6256c, buffer, i10, i11);
                this.f6256c += i11;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
