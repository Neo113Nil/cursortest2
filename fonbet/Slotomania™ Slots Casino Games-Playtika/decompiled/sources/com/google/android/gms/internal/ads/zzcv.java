package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzcv extends zzcp {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[ADDED_TO_REGION, LOOP:7: B:48:0x0119->B:49:0x011b, LOOP_START, PHI: r0
      0x0119: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0044, B:49:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    i2 /= 4;
                                }
                            }
                        }
                        ByteBuffer zzk = zzk(i2);
                        i = this.zzb.zzd;
                        if (i == 3) {
                            while (position < limit) {
                                zzk.put((byte) 0);
                                zzk.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                float f = byteBuffer.getFloat(position);
                                String str = zzfk.zza;
                                short max = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                                zzk.put((byte) (max & 255));
                                zzk.put((byte) ((max >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 2));
                                zzk.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i == 1610612736) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else {
                            if (i != 1879048192) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                short zzm = (short) (zzfk.zzm(byteBuffer.getDouble(position), -1.0d, 1.0d) * 32767.0d);
                                zzk.put((byte) (zzm & 255));
                                zzk.put((byte) ((zzm >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        zzk.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer zzk2 = zzk(i2);
            i = this.zzb.zzd;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzk2.flip();
        }
        i2 += i2;
        ByteBuffer zzk22 = zzk(i2);
        i = this.zzb.zzd;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzk22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i = zzclVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zzcl.zza;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4 && i != 1879048192) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 2);
    }
}
