package c1;

import c1.p;
import e1.Z;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class z extends r {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e4->B:43:0x00e6, LOOP_START, PHI: r0
      0x00e4: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(ByteBuffer byteBuffer) {
        int i10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.f26785b.f26782c;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 21) {
                    if (i12 != 22) {
                        if (i12 != 268435456) {
                            if (i12 != 1342177280) {
                                if (i12 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer l10 = l(i11);
                        i10 = this.f26785b.f26782c;
                        if (i10 == 3) {
                            while (position < limit) {
                                l10.put((byte) 0);
                                l10.put((byte) ((byteBuffer.get(position) & UByte.MAX_VALUE) - 128));
                                position++;
                            }
                        } else if (i10 == 4) {
                            while (position < limit) {
                                short n10 = (short) (Z.n(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                l10.put((byte) (n10 & 255));
                                l10.put((byte) ((n10 >> 8) & 255));
                                position += 4;
                            }
                        } else if (i10 == 21) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i10 == 22) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 2));
                                l10.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i10 == 268435456) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i10 == 1342177280) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i10 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        l10.flip();
                    }
                }
                i11 /= 3;
            }
            i11 /= 2;
            ByteBuffer l102 = l(i11);
            i10 = this.f26785b.f26782c;
            if (i10 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            l102.flip();
        }
        i11 *= 2;
        ByteBuffer l1022 = l(i11);
        i10 = this.f26785b.f26782c;
        if (i10 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        l1022.flip();
    }

    @Override // c1.r
    public p.a h(p.a aVar) {
        int i10 = aVar.f26782c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new p.a(aVar.f26780a, aVar.f26781b, 2) : p.a.f26779e;
        }
        throw new p.b(aVar);
    }
}
