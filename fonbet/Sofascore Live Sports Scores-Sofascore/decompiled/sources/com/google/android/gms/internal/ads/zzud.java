package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzud {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a = zzcp.a;
    public int c = 0;
    public int b = 2;

    public static final void b(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(zzhbn.a(i2));
    }

    public final void a(zziy zziyVar, List list) {
        int i;
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2 = zziyVar.d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zziyVar.d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zziyVar.d;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i3 = limit - position;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.b == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i5 += i + 44;
        } else {
            i = 0;
        }
        if (this.a.capacity() < i5) {
            this.a = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        ByteBuffer byteBuffer4 = this.a;
        if (this.b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i2 = 22;
                b(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(zzhbn.a(length));
                byteBuffer.put(bArr);
                int i6 = length + 28;
                byteBuffer.putInt(22, zzfm.h(byteBuffer.arrayOffset(), i6, 0, byteBuffer.array()));
                byteBuffer.position(i6);
            } else {
                byteBuffer = byteBuffer4;
                i2 = 22;
                byteBuffer.put(d);
            }
            byteBuffer.put(e);
        } else {
            byteBuffer = byteBuffer4;
            i2 = 22;
        }
        int b = this.c + ((int) ((zzgy.b(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.c = b;
        int i7 = i2;
        ByteBuffer byteBuffer5 = byteBuffer;
        b(byteBuffer5, b, this.b, i4, false);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.b == 2) {
            byteBuffer5.putInt(i + 66, zzfm.h(byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(i7, zzfm.h(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.b++;
        this.a = byteBuffer5;
        zziyVar.c();
        zziyVar.d(this.a.remaining());
        zziyVar.d.put(this.a);
        zziyVar.f();
    }
}
