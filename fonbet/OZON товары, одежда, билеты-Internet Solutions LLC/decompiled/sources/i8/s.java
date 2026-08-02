package i8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes9.dex */
public interface s {
    void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) throws GeneralSecurityException;

    void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException;

    ByteBuffer getHeader();
}
