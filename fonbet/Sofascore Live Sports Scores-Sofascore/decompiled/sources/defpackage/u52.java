package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u52 implements Closeable {
    public x52 a;
    public boolean b;
    public long c;
    public byte[] d;
    public int e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a == null) {
            a70.r("not attached to a buffer");
            return;
        }
        this.a = null;
        this.c = -1L;
        this.d = null;
        this.e = -1;
    }
}
