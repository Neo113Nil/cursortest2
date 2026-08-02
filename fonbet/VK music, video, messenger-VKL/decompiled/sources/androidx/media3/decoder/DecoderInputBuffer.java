package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import java.nio.ByteBuffer;
import xsna.nr10;
import xsna.sl9;
import xsna.tjk;
import xsna.xl8;

/* loaded from: classes12.dex */
public class DecoderInputBuffer extends xl8 {

    @Nullable
    public a c;
    public final tjk d = new tjk();

    @Nullable
    public ByteBuffer e;
    public boolean f;
    public long g;

    @Nullable
    public ByteBuffer h;
    public final int i;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super(sl9.c(i, i2, "Buffer too small (", " < ", ")"));
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    static {
        nr10.a("media3.decoder");
    }

    public DecoderInputBuffer(int i) {
        this.i = i;
    }

    public void c() {
        this.b = 0;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final ByteBuffer d(int i) {
        int i2 = this.i;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.e;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public final void e(int i) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            this.e = d(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.e = byteBuffer;
            return;
        }
        ByteBuffer d = d(i2);
        d.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            d.put(byteBuffer);
        }
        this.e = d;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
