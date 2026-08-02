package G6;

import java.nio.ByteBuffer;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class b implements InterfaceC6775d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3898a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static int f3899b = 16384;

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f3900c = new a();

    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(b.f3899b);
        }
    }

    public static int c() {
        return f3899b;
    }

    @Override // x0.InterfaceC6775d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer acquire() {
        return (ByteBuffer) f3900c.get();
    }

    @Override // x0.InterfaceC6775d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean release(ByteBuffer byteBuffer) {
        return true;
    }
}
