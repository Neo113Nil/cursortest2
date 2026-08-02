package com.davidehrmann.vcdiff.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class CountingOutputStream extends FilterOutputStream {
    private final AtomicLong bytesWritten;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.bytesWritten = new AtomicLong();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        super.write(i);
        this.bytesWritten.getAndIncrement();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.bytesWritten.getAndAdd(i2);
    }

    public long getBytesWritten() {
        return this.bytesWritten.get();
    }
}
