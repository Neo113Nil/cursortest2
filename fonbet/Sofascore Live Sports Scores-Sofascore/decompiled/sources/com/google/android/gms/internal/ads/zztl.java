package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.me4;
import defpackage.wt3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztl extends zzcq {
    public zzhbf i;
    public zzhbf j;

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void a(ByteBuffer byteBuffer) {
        zzhbf zzhbfVar = this.j;
        zzhbfVar.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer e = e(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i = 0; i < zzhbfVar.b; i++) {
                int f = (zzfm.f(this.b.c) * zzhbfVar.a(i)) + position;
                int i2 = this.b.c;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 21) {
                                if (i2 != 22) {
                                    if (i2 != 268435456) {
                                        if (i2 != 1342177280) {
                                            if (i2 != 1610612736) {
                                                if (i2 != 1879048192) {
                                                    if (i2 != 1895825408) {
                                                        if (i2 != 1912602624) {
                                                            a70.r(me4.g(i2, "Unexpected encoding: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                                                            return;
                                                        }
                                                    }
                                                }
                                                e.putDouble(byteBuffer.getDouble(f));
                                            }
                                        }
                                    }
                                }
                                e.putInt(byteBuffer.getInt(f));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            byte b = byteBuffer.get(order == byteOrder ? f : f + 2);
                            byte b2 = byteBuffer.get(f + 1);
                            if (byteBuffer.order() == byteOrder) {
                                f += 2;
                            }
                            int i3 = ((b << 24) & (-16777216)) | ((b2 << 16) & 16711680) | ((byteBuffer.get(f) << 8) & 65280);
                            int i4 = i3 >> 8;
                            zzguk.e(Integer.toHexString(i4), "Value out of range of 24-bit integer: %s", (i4 & (-16777216)) == 0 || (i4 & (-8388608)) == -8388608);
                            zzguk.a(e.remaining() >= 3);
                            e.put((byte) (e.order() == byteOrder ? (i3 >> 24) & 255 : i4 & 255)).put((byte) ((i3 >> 16) & 255)).put((byte) (e.order() == byteOrder ? i4 & 255 : (i3 >> 24) & 255));
                        }
                        e.putFloat(byteBuffer.getFloat(f));
                    } else {
                        e.put(byteBuffer.get(f));
                    }
                }
                e.putShort(byteBuffer.getShort(f));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        e.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) {
        zzhbf zzhbfVar = this.i;
        if (zzhbfVar == null) {
            return zzcl.e;
        }
        int i = zzclVar.c;
        if (!zzfm.d(i)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i2 = zzhbfVar.b;
        int i3 = zzclVar.b;
        boolean z = i3 != i2;
        int i4 = 0;
        while (i4 < i2) {
            int a = zzhbfVar.a(i4);
            if (a >= i3) {
                String zzhbfVar2 = zzhbfVar.toString();
                throw new zzco(wt3.m("Channel map (", zzhbfVar2, new StringBuilder(zzhbfVar2.length() + 59), ") trying to access non-existent input channel."), zzclVar);
            }
            z |= a != i4;
            i4++;
        }
        return z ? new zzcl(zzclVar.a, i2, i) : zzcl.e;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void h() {
        this.j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
