package G6;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface h extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int i(int i10, byte[] bArr, int i11, int i12);

    boolean isClosed();

    ByteBuffer j();

    byte s(int i10);

    int size();

    long u();
}
