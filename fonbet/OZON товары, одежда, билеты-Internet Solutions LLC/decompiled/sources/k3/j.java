package k3;

import java.nio.ByteBuffer;
import k3.e;
import m3.N;

/* loaded from: classes.dex */
public final class j extends g {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e4->B:43:0x00e6, LOOP_START, PHI: r0
      0x00e4: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // k3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ByteBuffer byteBuffer) {
        int i11;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i12 = limit - position;
        int i13 = this.f70388b.f70386c;
        if (i13 != 3) {
            if (i13 != 4) {
                if (i13 != 21) {
                    if (i13 != 22) {
                        if (i13 != 268435456) {
                            if (i13 != 1342177280) {
                                if (i13 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer k11 = k(i12);
                        i11 = this.f70388b.f70386c;
                        if (i11 == 3) {
                            while (position < limit) {
                                k11.put((byte) 0);
                                k11.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i11 == 4) {
                            while (position < limit) {
                                short h11 = (short) (N.h(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                k11.put((byte) (h11 & 255));
                                k11.put((byte) ((h11 >> 8) & 255));
                                position += 4;
                            }
                        } else if (i11 == 21) {
                            while (position < limit) {
                                k11.put(byteBuffer.get(position + 1));
                                k11.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i11 == 22) {
                            while (position < limit) {
                                k11.put(byteBuffer.get(position + 2));
                                k11.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i11 == 268435456) {
                            while (position < limit) {
                                k11.put(byteBuffer.get(position + 1));
                                k11.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i11 == 1342177280) {
                            while (position < limit) {
                                k11.put(byteBuffer.get(position + 1));
                                k11.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i11 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                k11.put(byteBuffer.get(position + 1));
                                k11.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        k11.flip();
                    }
                }
                i12 /= 3;
            }
            i12 /= 2;
            ByteBuffer k112 = k(i12);
            i11 = this.f70388b.f70386c;
            if (i11 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            k112.flip();
        }
        i12 *= 2;
        ByteBuffer k1122 = k(i12);
        i11 = this.f70388b.f70386c;
        if (i11 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        k1122.flip();
    }

    @Override // k3.g
    public final e.a g(e.a aVar) throws e.b {
        int i11 = aVar.f70386c;
        if (i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4) {
            return i11 != 2 ? new e.a(aVar.f70384a, aVar.f70385b, 2) : e.a.f70383e;
        }
        throw new e.b(aVar);
    }
}
