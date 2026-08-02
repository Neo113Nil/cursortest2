package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import defpackage.a70;
import defpackage.lnb;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c {
    public int a;
    public ByteBuffer c;
    public long d;
    public final b b = new b();
    public final int e = 0;

    public final ByteBuffer a(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        a70.r(lnb.j(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
        return null;
    }

    public final boolean b(int i) {
        return (this.a & i) == i;
    }

    public final void a() {
        this.a = 0;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
