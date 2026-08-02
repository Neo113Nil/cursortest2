package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nzc {
    public final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    public long b = 0;
    public long c = 0;
    public int d = 0;

    public final void a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long rotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.b;
        this.b = rotateLeft;
        long rotateLeft2 = Long.rotateLeft(rotateLeft, 27);
        long j3 = this.c;
        this.b = ((rotateLeft2 + j3) * 5) + 1390208809;
        long rotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.c = rotateLeft3;
        this.c = ((Long.rotateLeft(rotateLeft3, 31) + this.b) * 5) + 944331445;
        this.d += 16;
    }

    public final nzc c(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int remaining = order.remaining();
        ByteBuffer byteBuffer = this.a;
        if (remaining <= byteBuffer.remaining()) {
            byteBuffer.put(order);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int position = 16 - byteBuffer.position();
        for (int i = 0; i < position; i++) {
            byteBuffer.put(order.get());
        }
        a();
        while (order.remaining() >= 16) {
            b(order);
        }
        byteBuffer.put(order);
        return this;
    }
}
