package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ojj extends v01 {
    @Override // defpackage.v01
    public final ho0 d(ho0 ho0Var) {
        int i = ho0Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192) {
            return i != 2 ? new ho0(ho0Var.a, ho0Var.b, 2) : ho0.e;
        }
        throw new ko0(ho0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[ADDED_TO_REGION, LOOP:7: B:48:0x0113->B:49:0x0115, LOOP_START, PHI: r0
      0x0113: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0042, B:49:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void queueInput(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 != 1879048192) {
                                        zzl.s();
                                        return;
                                    }
                                    i2 /= 4;
                                }
                            }
                        }
                        ByteBuffer h = h(i2);
                        i = this.b.c;
                        if (i == 3) {
                            while (position < limit) {
                                h.put((byte) 0);
                                h.put((byte) ((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                short i4 = (short) (nik.i(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                h.put((byte) (i4 & 255));
                                h.put((byte) ((i4 >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                h.put(byteBuffer.get(position + 1));
                                h.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                h.put(byteBuffer.get(position + 2));
                                h.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                h.put(byteBuffer.get(position + 1));
                                h.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                h.put(byteBuffer.get(position + 1));
                                h.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i == 1610612736) {
                            while (position < limit) {
                                h.put(byteBuffer.get(position + 1));
                                h.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else {
                            if (i != 1879048192) {
                                zzl.s();
                                return;
                            }
                            while (position < limit) {
                                short max = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                h.put((byte) (max & 255));
                                h.put((byte) ((max >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        h.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer h2 = h(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            h2.flip();
        }
        i2 *= 2;
        ByteBuffer h22 = h(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        h22.flip();
    }
}
