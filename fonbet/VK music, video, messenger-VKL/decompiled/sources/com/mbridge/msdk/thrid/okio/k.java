package com.mbridge.msdk.thrid.okio;

import defpackage.k0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.java */
/* loaded from: classes14.dex */
public final class k implements s {
    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.a = eVar;
        this.b = inflater;
    }

    private void h() throws IOException {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j) throws IOException {
        boolean d;
        if (j < 0) {
            throw new IllegalArgumentException(k0.a(j, "byteCount < 0: "));
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            d = d();
            try {
                o b = cVar.b(1);
                int inflate = this.b.inflate(b.a, b.c, (int) Math.min(j, 8192 - b.c));
                if (inflate > 0) {
                    b.c += inflate;
                    long j2 = inflate;
                    cVar.b += j2;
                    return j2;
                }
                if (!this.b.finished() && !this.b.needsDictionary()) {
                }
                h();
                if (b.b != b.c) {
                    return -1L;
                }
                cVar.a = b.b();
                p.a(b);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!d);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public final boolean d() throws IOException {
        if (!this.b.needsInput()) {
            return false;
        }
        h();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.a.f()) {
            return true;
        }
        o oVar = this.a.a().a;
        int i = oVar.c;
        int i2 = oVar.b;
        int i3 = i - i2;
        this.c = i3;
        this.b.setInput(oVar.a, i2, i3);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.a.b();
    }
}
