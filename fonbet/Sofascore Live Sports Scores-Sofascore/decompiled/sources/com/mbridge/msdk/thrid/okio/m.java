package com.mbridge.msdk.thrid.okio;

import defpackage.a70;
import defpackage.yhk;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class m implements d {
    public final c a = new c();
    public final r b;
    boolean c;

    public m(r rVar) {
        if (rVar != null) {
            this.b = rVar;
        } else {
            yhk.s("sink == null");
            throw null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.a.a(str);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        try {
            c cVar = this.a;
            long j = cVar.b;
            if (j > 0) {
                this.b.a(cVar, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        long m = this.a.m();
        if (m > 0) {
            this.b.a(this.a, m);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.c) {
            a70.r("closed");
            return;
        }
        c cVar = this.a;
        long j = cVar.b;
        if (j > 0) {
            this.b.a(cVar, j);
        }
        this.b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    public String toString() {
        return "buffer(" + this.b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i) throws IOException {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.a.writeByte(i);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i) throws IOException {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.a.writeInt(i);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i) throws IOException {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.a.writeShort(i);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j) throws IOException {
        if (!this.c) {
            this.a.a(cVar, j);
            d();
        } else {
            a70.r("closed");
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            this.a.write(bArr, i, i2);
            return d();
        }
        a70.r("closed");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.a;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.c) {
            int write = this.a.write(byteBuffer);
            d();
            return write;
        }
        a70.r("closed");
        return 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j) throws IOException {
        if (!this.c) {
            this.a.a(j);
            return d();
        }
        a70.r("closed");
        return null;
    }
}
