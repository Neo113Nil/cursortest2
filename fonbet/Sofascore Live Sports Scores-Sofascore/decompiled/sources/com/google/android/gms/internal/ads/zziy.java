package com.google.android.gms.internal.ads;

import defpackage.me4;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zziy extends zzit {
    public zzv b;
    public final zziv c = new zziv();
    public ByteBuffer d;
    public long e;
    public ByteBuffer f;
    public final int g;

    static {
        zzal.a("media3.decoder");
    }

    public zziy(int i) {
        this.g = i;
    }

    public void c() {
        this.a = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = g(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer g = g(i2);
        g.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            g.put(byteBuffer);
        }
        this.d = g;
    }

    public final boolean e() {
        return b(1073741824);
    }

    public final void f() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer g(int i) {
        int i2 = this.g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(String.valueOf(capacity).length() + 21 + String.valueOf(i).length() + 1);
        me4.r(sb, "Buffer too small (", capacity, " < ", i);
        sb.append(")");
        throw new zzix(sb.toString());
    }
}
