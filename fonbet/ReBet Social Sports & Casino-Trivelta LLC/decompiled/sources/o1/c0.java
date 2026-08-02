package o1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class c0 {
    public static ByteBuffer a(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i12 < i13) {
            c(order, (int) ((b(byteBuffer, i10) * i12) / i13), i10);
            if (byteBuffer.position() == position + i11) {
                i12++;
                position = byteBuffer.position();
            }
        }
        order.put(byteBuffer);
        order.flip();
        return order;
    }

    public static int b(ByteBuffer byteBuffer, int i10) {
        if (i10 == 2) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i10 == 3) {
            return (byteBuffer.get() & UByte.MAX_VALUE) << 24;
        }
        if (i10 == 4) {
            float n10 = e1.Z.n(byteBuffer.getFloat(), -1.0f, 1.0f);
            return n10 < 0.0f ? (int) ((-n10) * (-2.1474836E9f)) : (int) (n10 * 2.1474836E9f);
        }
        if (i10 == 21) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 8) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i10 == 22) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | (byteBuffer.get() & UByte.MAX_VALUE) | ((byteBuffer.get() & UByte.MAX_VALUE) << 8) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i10 == 268435456) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 16) | ((byteBuffer.get() & UByte.MAX_VALUE) << 24);
        }
        if (i10 == 1342177280) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 8) | ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i10 == 1610612736) {
            return (byteBuffer.get() & UByte.MAX_VALUE) | ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16) | ((byteBuffer.get() & UByte.MAX_VALUE) << 8);
        }
        throw new IllegalStateException();
    }

    public static void c(ByteBuffer byteBuffer, int i10, int i11) {
        if (i11 == 2) {
            byteBuffer.put((byte) (i10 >> 16));
            byteBuffer.put((byte) (i10 >> 24));
            return;
        }
        if (i11 == 3) {
            byteBuffer.put((byte) (i10 >> 24));
            return;
        }
        if (i11 == 4) {
            if (i10 < 0) {
                byteBuffer.putFloat((-i10) / (-2.1474836E9f));
                return;
            } else {
                byteBuffer.putFloat(i10 / 2.1474836E9f);
                return;
            }
        }
        if (i11 == 21) {
            byteBuffer.put((byte) (i10 >> 8));
            byteBuffer.put((byte) (i10 >> 16));
            byteBuffer.put((byte) (i10 >> 24));
            return;
        }
        if (i11 == 22) {
            byteBuffer.put((byte) i10);
            byteBuffer.put((byte) (i10 >> 8));
            byteBuffer.put((byte) (i10 >> 16));
            byteBuffer.put((byte) (i10 >> 24));
            return;
        }
        if (i11 == 268435456) {
            byteBuffer.put((byte) (i10 >> 24));
            byteBuffer.put((byte) (i10 >> 16));
            return;
        }
        if (i11 == 1342177280) {
            byteBuffer.put((byte) (i10 >> 24));
            byteBuffer.put((byte) (i10 >> 16));
            byteBuffer.put((byte) (i10 >> 8));
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBuffer.put((byte) (i10 >> 24));
            byteBuffer.put((byte) (i10 >> 16));
            byteBuffer.put((byte) (i10 >> 8));
            byteBuffer.put((byte) i10);
        }
    }
}
