package t2;

import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import java.nio.ByteBuffer;
import r2.C6198a;
import r2.InterfaceC6199b;
import t2.B0;

/* loaded from: classes.dex */
public final class D implements InterfaceC6199b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f65007b = B0.f64979h;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6199b f65008a;

    public static final class b implements InterfaceC6199b.a {

        /* renamed from: a, reason: collision with root package name */
        public final B0.b f65009a = new B0.b();

        @Override // r2.InterfaceC6199b.a
        public AbstractC3445z a(int i10) {
            return this.f65009a.a(i10);
        }

        @Override // r2.InterfaceC6199b.a
        public InterfaceC6199b c(String str) {
            return new D(this.f65009a.c(str));
        }
    }

    @Override // r2.InterfaceC6199b
    public void H(C2334C.a aVar) {
        this.f65008a.H(aVar);
    }

    @Override // r2.InterfaceC6199b
    public int I1(androidx.media3.common.a aVar) {
        return this.f65008a.I1(aVar);
    }

    @Override // r2.InterfaceC6199b
    public void L(int i10, ByteBuffer byteBuffer, C6198a c6198a) {
        this.f65008a.L(i10, byteBuffer, c6198a);
    }

    @Override // r2.InterfaceC6199b, java.lang.AutoCloseable
    public void close() {
        this.f65008a.close();
    }

    public D(InterfaceC6199b interfaceC6199b) {
        this.f65008a = interfaceC6199b;
    }
}
