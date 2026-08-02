package o1;

import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public final class b0 {
    private static final byte[] OGG_DEFAULT_ID_HEADER_PAGE = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, ByteCompanionObject.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] OGG_DEFAULT_COMMENT_HEADER_PAGE = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, Tnaf.POW_2_WIDTH, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f58798a = c1.p.f26778a;

    /* renamed from: c, reason: collision with root package name */
    public int f58800c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f58799b = 2;

    public void a(k1.f fVar, List list) {
        AbstractC4134a.e(fVar.f54108d);
        if (fVar.f54108d.limit() - fVar.f54108d.position() == 0) {
            return;
        }
        this.f58798a = b(fVar.f54108d, (this.f58799b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        fVar.f();
        fVar.p(this.f58798a.remaining());
        fVar.f54108d.put(this.f58798a);
        fVar.q();
    }

    public final ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.f58799b == 2) {
            int length = bArr != null ? bArr.length + 28 : OGG_DEFAULT_ID_HEADER_PAGE.length;
            i13 += OGG_DEFAULT_COMMENT_HEADER_PAGE.length + length;
            i10 = length;
        } else {
            i10 = 0;
        }
        ByteBuffer c10 = c(i13);
        if (this.f58799b == 2) {
            if (bArr != null) {
                e(c10, bArr);
            } else {
                c10.put(OGG_DEFAULT_ID_HEADER_PAGE);
            }
            c10.put(OGG_DEFAULT_COMMENT_HEADER_PAGE);
        }
        int j10 = this.f58800c + H1.H.j(byteBuffer);
        this.f58800c = j10;
        f(c10, j10, this.f58799b, i12, false);
        for (int i14 = 0; i14 < i12; i14++) {
            if (i11 >= 255) {
                c10.put((byte) -1);
                i11 -= 255;
            } else {
                c10.put((byte) i11);
                i11 = 0;
            }
        }
        while (position < limit) {
            c10.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        c10.flip();
        if (this.f58799b == 2) {
            byte[] array = c10.array();
            int arrayOffset = c10.arrayOffset() + i10;
            byte[] bArr2 = OGG_DEFAULT_COMMENT_HEADER_PAGE;
            c10.putInt(i10 + bArr2.length + 22, e1.Z.w(array, arrayOffset + bArr2.length, c10.limit() - c10.position(), 0));
        } else {
            c10.putInt(22, e1.Z.w(c10.array(), c10.arrayOffset(), c10.limit() - c10.position(), 0));
        }
        this.f58799b++;
        return c10;
    }

    public final ByteBuffer c(int i10) {
        if (this.f58798a.capacity() < i10) {
            this.f58798a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f58798a.clear();
        }
        return this.f58798a;
    }

    public void d() {
        this.f58798a = c1.p.f26778a;
        this.f58800c = 0;
        this.f58799b = 2;
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, e1.Z.w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    public final void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.i.a(i11));
    }
}
