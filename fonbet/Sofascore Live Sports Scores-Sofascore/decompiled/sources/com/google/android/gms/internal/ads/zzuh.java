package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzuh extends zzcq {
    public static void j(int i, ByteBuffer byteBuffer) {
        float f = (float) (i * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer e;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.b.c;
        if (i2 == 2) {
            e = e(i + i);
            while (position < limit) {
                j(byteBuffer.getShort(position) << 16, e);
                position += 2;
            }
        } else if (i2 == 3) {
            e = e(i * 4);
            while (position < limit) {
                j(((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128) << 24, e);
                position++;
            }
        } else if (i2 == 21) {
            e = e((i / 3) * 4);
            while (position < limit) {
                j(zzhbj.c(byteBuffer.get(position + 2), byteBuffer.get(position + 1), byteBuffer.get(position), (byte) 0), e);
                position += 3;
            }
        } else if (i2 == 22) {
            e = e(i);
            while (position < limit) {
                j(byteBuffer.getInt(position), e);
                position += 4;
            }
        } else if (i2 == 268435456) {
            e = e(i + i);
            while (position < limit) {
                j(Short.reverseBytes(byteBuffer.getShort(position)) << 16, e);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            e = e((i / 3) * 4);
            while (position < limit) {
                j(zzhbj.c(byteBuffer.get(position), byteBuffer.get(position + 1), byteBuffer.get(position + 2), (byte) 0), e);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            e = e(i);
            while (position < limit) {
                j(Integer.reverseBytes(byteBuffer.getInt(position)), e);
                position += 4;
            }
        } else if (i2 == 1879048192) {
            e = e(i / 2);
            while (position < limit) {
                e.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i2 == 1895825408) {
            e = e(i);
            while (position < limit) {
                e.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position))));
                position += 4;
            }
        } else {
            if (i2 != 1912602624) {
                defpackage.zzl.s();
                return;
            }
            e = e(i / 2);
            while (position < limit) {
                e.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))));
                position += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        e.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) {
        int i = zzclVar.c;
        if (zzfm.d(i)) {
            return i != 4 ? new zzcl(zzclVar.a, zzclVar.b, 4) : zzcl.e;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
