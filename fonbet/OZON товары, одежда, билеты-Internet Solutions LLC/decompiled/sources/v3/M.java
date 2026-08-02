package v3;

import java.nio.ByteBuffer;
import k3.e;

/* loaded from: classes.dex */
public final class M extends k3.g {

    /* renamed from: i, reason: collision with root package name */
    private static final int f101867i = Float.floatToIntBits(Float.NaN);

    private static void l(int i11, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i11 * 4.656612875245797E-10d));
        if (floatToIntBits == f101867i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // k3.e
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer k11;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.f70388b.f70386c;
        if (i12 == 21) {
            k11 = k((i11 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), k11);
                position += 3;
            }
        } else if (i12 == 22) {
            k11 = k(i11);
            while (position < limit) {
                l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), k11);
                position += 4;
            }
        } else if (i12 == 1342177280) {
            k11 = k((i11 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k11);
                position += 3;
            }
        } else {
            if (i12 != 1610612736) {
                throw new IllegalStateException();
            }
            k11 = k(i11);
            while (position < limit) {
                l((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k11);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k11.flip();
    }

    @Override // k3.g
    public final e.a g(e.a aVar) throws e.b {
        int i11 = aVar.f70386c;
        if (i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4) {
            return i11 != 4 ? new e.a(aVar.f70384a, aVar.f70385b, 4) : e.a.f70383e;
        }
        throw new e.b(aVar);
    }
}
