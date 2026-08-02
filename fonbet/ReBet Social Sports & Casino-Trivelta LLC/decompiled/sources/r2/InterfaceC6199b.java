package r2;

import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import java.nio.ByteBuffer;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6199b extends AutoCloseable {

    /* renamed from: r2.b$a */
    public interface a {
        AbstractC3445z a(int i10);

        default boolean b() {
            return false;
        }

        InterfaceC6199b c(String str);
    }

    void H(C2334C.a aVar);

    int I1(androidx.media3.common.a aVar);

    void L(int i10, ByteBuffer byteBuffer, C6198a c6198a);

    @Override // java.lang.AutoCloseable
    void close();
}
