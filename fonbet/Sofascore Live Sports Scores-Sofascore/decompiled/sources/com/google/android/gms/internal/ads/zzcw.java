package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcw extends zzcq {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181 A[ADDED_TO_REGION, LOOP:9: B:60:0x0181->B:61:0x0183, LOOP_START, PHI: r2
      0x0181: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:17:0x004e, B:61:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
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
                                        if (i3 != 1895825408) {
                                            if (i3 != 1912602624) {
                                                defpackage.zzl.s();
                                                return;
                                            }
                                        }
                                    }
                                    i2 /= 4;
                                }
                            }
                        }
                        ByteBuffer e = e(i2);
                        i = this.b.c;
                        if (i == 3) {
                            while (position < limit) {
                                e.put((byte) 0);
                                e.put((byte) ((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                float f = byteBuffer.getFloat(position);
                                String str = zzfm.a;
                                short max = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                                e.put((byte) (max & 255));
                                e.put((byte) ((max >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                e.put(byteBuffer.get(position + 1));
                                e.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                e.put(byteBuffer.get(position + 2));
                                e.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                e.put(byteBuffer.get(position + 1));
                                e.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                e.put(byteBuffer.get(position + 1));
                                e.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i == 1610612736) {
                            while (position < limit) {
                                e.put(byteBuffer.get(position + 1));
                                e.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else if (i == 1879048192) {
                            while (position < limit) {
                                short max2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                e.put((byte) (max2 & 255));
                                e.put((byte) ((max2 >> 8) & 255));
                                position += 8;
                            }
                        } else if (i == 1895825408) {
                            while (position < limit) {
                                float intBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position)));
                                String str2 = zzfm.a;
                                short max3 = (short) (Math.max(-1.0f, Math.min(intBitsToFloat, 1.0f)) * 32767.0f);
                                e.put((byte) (max3 & 255));
                                e.put((byte) ((max3 >> 8) & 255));
                                position += 4;
                            }
                        } else {
                            if (i != 1912602624) {
                                defpackage.zzl.s();
                                return;
                            }
                            while (position < limit) {
                                short max4 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))), 1.0d)) * 32767.0d);
                                e.put((byte) (max4 & 255));
                                e.put((byte) ((max4 >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        e.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer e2 = e(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            e2.flip();
        }
        i2 += i2;
        ByteBuffer e22 = e(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        e22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) {
        int i = zzclVar.c;
        if (zzfm.d(i)) {
            return i != 2 ? new zzcl(zzclVar.a, zzclVar.b, 2) : zzcl.e;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
