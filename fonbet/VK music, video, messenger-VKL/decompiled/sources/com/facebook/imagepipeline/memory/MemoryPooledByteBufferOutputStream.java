package com.facebook.imagepipeline.memory;

import java.io.IOException;
import xsna.a320;
import xsna.kcl;
import xsna.lvb0;
import xsna.odj;
import xsna.s220;
import xsna.uvf;

/* compiled from: MemoryPooledByteBufferOutputStream.kt */
/* loaded from: classes12.dex */
public final class MemoryPooledByteBufferOutputStream extends lvb0 {
    public final b c;
    public kcl d;
    public int e;

    /* compiled from: MemoryPooledByteBufferOutputStream.kt */
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(b bVar, int i) {
        super(0);
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.c = bVar;
        this.e = 0;
        this.d = uvf.x(bVar.get(i), bVar, uvf.g);
    }

    @Override // xsna.lvb0, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uvf.q(this.d);
        this.d = null;
        this.e = -1;
        super.close();
    }

    @Override // xsna.lvb0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final a320 p() {
        if (!uvf.t(this.d)) {
            throw new InvalidStreamException();
        }
        kcl kclVar = this.d;
        if (kclVar != null) {
            return new a320(kclVar, this.e);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // xsna.lvb0
    public final int size() {
        return this.e;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (uvf.t(this.d)) {
                int i3 = this.e + i2;
                if (uvf.t(this.d)) {
                    kcl kclVar = this.d;
                    if (kclVar != null) {
                        if (i3 > ((s220) kclVar.r()).getSize()) {
                            b bVar = this.c;
                            s220 s220Var = bVar.get(i3);
                            kcl kclVar2 = this.d;
                            if (kclVar2 != null) {
                                ((s220) kclVar2.r()).b(s220Var, this.e);
                                this.d.close();
                                this.d = uvf.x(s220Var, bVar, uvf.g);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        kcl kclVar3 = this.d;
                        if (kclVar3 != null) {
                            ((s220) kclVar3.r()).c(this.e, i, i2, bArr);
                            this.e += i2;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new InvalidStreamException();
            }
            throw new InvalidStreamException();
        }
        StringBuilder a = odj.a(bArr.length, i, "length=", "; regionStart=", "; regionLength=");
        a.append(i2);
        throw new ArrayIndexOutOfBoundsException(a.toString());
    }

    public MemoryPooledByteBufferOutputStream(b bVar) {
        this(bVar, bVar.k[0]);
    }
}
