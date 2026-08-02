package v3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f101848d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f101849e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f101850a = k3.e.f70382a;

    /* renamed from: c, reason: collision with root package name */
    private int f101852c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f101851b = 2;

    private static void c(ByteBuffer byteBuffer, long j11, int i11, int i12, boolean z11) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z11 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j11);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i11);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.e.a(i12));
    }

    public final void a(s3.f fVar, List<byte[]> list) {
        int i11;
        ByteBuffer byteBuffer;
        fVar.f98184d.getClass();
        if (fVar.f98184d.limit() - fVar.f98184d.position() == 0) {
            return;
        }
        byte[] bArr = (this.f101851b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null;
        ByteBuffer byteBuffer2 = fVar.f98184d;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i12 = limit - position;
        int i13 = (i12 + 255) / 255;
        int i14 = i13 + 27 + i12;
        if (this.f101851b == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i14 += length + 44;
            i11 = length;
        } else {
            i11 = 0;
        }
        if (this.f101850a.capacity() < i14) {
            this.f101850a = ByteBuffer.allocate(i14).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f101850a.clear();
        }
        ByteBuffer byteBuffer3 = this.f101850a;
        if (this.f101851b == 2) {
            if (bArr != null) {
                c(byteBuffer3, 0L, 0, 1, true);
                byteBuffer = byteBuffer2;
                byteBuffer3.put(com.google.common.primitives.e.a(bArr.length));
                byteBuffer3.put(bArr);
                byteBuffer3.putInt(22, m3.N.n(byteBuffer3.arrayOffset(), byteBuffer3.array(), bArr.length + 28, 0));
                byteBuffer3.position(bArr.length + 28);
            } else {
                byteBuffer = byteBuffer2;
                byteBuffer3.put(f101848d);
            }
            byteBuffer3.put(f101849e);
        } else {
            byteBuffer = byteBuffer2;
        }
        int h11 = this.f101852c + Jb.b.h(byteBuffer);
        this.f101852c = h11;
        c(byteBuffer3, h11, this.f101851b, i13, false);
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 >= 255) {
                byteBuffer3.put((byte) -1);
                i12 -= 255;
            } else {
                byteBuffer3.put((byte) i12);
                i12 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer.get(position));
            position++;
        }
        ByteBuffer byteBuffer4 = byteBuffer;
        byteBuffer4.position(byteBuffer4.limit());
        byteBuffer3.flip();
        if (this.f101851b == 2) {
            byteBuffer3.putInt(i11 + 66, m3.N.n(byteBuffer3.arrayOffset() + i11 + 44, byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, m3.N.n(byteBuffer3.arrayOffset(), byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.f101851b++;
        this.f101850a = byteBuffer3;
        fVar.f();
        fVar.o(this.f101850a.remaining());
        fVar.f98184d.put(this.f101850a);
        fVar.p();
    }

    public final void b() {
        this.f101850a = k3.e.f70382a;
        this.f101852c = 0;
        this.f101851b = 2;
    }
}
