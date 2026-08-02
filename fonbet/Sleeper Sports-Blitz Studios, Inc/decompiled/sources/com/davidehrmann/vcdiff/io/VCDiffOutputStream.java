package com.davidehrmann.vcdiff.io;

import com.davidehrmann.vcdiff.VCDiffEncoderBuilder;
import com.davidehrmann.vcdiff.VCDiffStreamingEncoder;
import com.davidehrmann.vcdiff.util.Objects;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class VCDiffOutputStream extends FilterOutputStream {
    private volatile long bytesWritten;
    private volatile boolean closed;
    private final VCDiffStreamingEncoder<OutputStream> encoder;
    private volatile boolean started;

    public VCDiffOutputStream(OutputStream outputStream, byte[] bArr, boolean z, boolean z2, boolean z3) {
        super(outputStream);
        this.started = false;
        this.closed = false;
        this.bytesWritten = 0L;
        this.encoder = VCDiffEncoderBuilder.builder().withDictionary(bArr).withTargetMatches(z).withInterleaving(z2).withChecksum(z3).buildStreaming();
    }

    public VCDiffOutputStream(OutputStream outputStream, VCDiffStreamingEncoder<OutputStream> vCDiffStreamingEncoder) {
        super(outputStream);
        this.started = false;
        this.closed = false;
        this.bytesWritten = 0L;
        this.encoder = (VCDiffStreamingEncoder) Objects.requireNotNull(vCDiffStreamingEncoder, "encoder was null");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("OutputStream closed");
        }
        if (!this.started) {
            this.started = true;
            this.encoder.startEncoding(((FilterOutputStream) this).out);
        }
        try {
            this.encoder.encodeChunk(bArr, i, i2, ((FilterOutputStream) this).out);
            this.bytesWritten += i2;
        } catch (IOException e) {
            throw new IOException("Error trying to encode data chunk at offset " + this.bytesWritten, e);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.started) {
                this.started = true;
                this.encoder.startEncoding(((FilterOutputStream) this).out);
            }
            if (!this.closed) {
                this.closed = true;
                this.encoder.finishEncoding(((FilterOutputStream) this).out);
            }
        } finally {
            super.close();
        }
    }
}
