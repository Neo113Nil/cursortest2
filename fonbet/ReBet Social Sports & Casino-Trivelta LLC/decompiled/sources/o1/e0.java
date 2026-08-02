package o1;

import c1.p;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class e0 extends c1.r {

    /* renamed from: i, reason: collision with root package name */
    public static final int f58822i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f58822i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // c1.p
    public void d(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f26785b.f26782c;
        if (i11 == 21) {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24), l10);
                position += 3;
            }
        } else if (i11 == 22) {
            l10 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24), l10);
                position += 4;
            }
        } else if (i11 == 1342177280) {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UByte.MAX_VALUE) << 24), l10);
                position += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            l10 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UByte.MAX_VALUE) << 24), l10);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override // c1.r
    public p.a h(p.a aVar) {
        int i10 = aVar.f26782c;
        if (e1.Z.N0(i10)) {
            return i10 != 4 ? new p.a(aVar.f26780a, aVar.f26781b, 4) : p.a.f26779e;
        }
        throw new p.b(aVar);
    }
}
