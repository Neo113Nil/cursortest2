package com.squareup.picasso;

import defpackage.is8;
import defpackage.yhk;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
final class MarkableInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_LIMIT_INCREMENT = 1024;
    private boolean allowExpire;
    private long defaultMark;
    private final InputStream in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    private MarkableInputStream(InputStream inputStream, int i, int i2) {
        this.defaultMark = -1L;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
        this.limitIncrement = i2;
    }

    private void setLimit(long j) {
        try {
            long j2 = this.reset;
            long j3 = this.offset;
            if (j2 >= j3 || j3 > this.limit) {
                this.reset = j3;
                this.in.mark((int) (j - j3));
            } else {
                this.in.reset();
                this.in.mark((int) (j - this.reset));
                skip(this.reset, this.offset);
            }
            this.limit = j;
        } catch (IOException e) {
            yhk.r(e, "Unable to mark: ");
        }
    }

    public void allowMarksToExpire(boolean z) {
        this.allowExpire = z;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.defaultMark = savePosition(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.allowExpire) {
            long j = this.offset;
            if (bArr.length + j > this.limit) {
                setLimit(j + bArr.length + this.limitIncrement);
            }
        }
        int read = this.in.read(bArr);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }

    public void reset(long j) throws IOException {
        if (this.offset > this.limit || j < this.reset) {
            is8.e("Cannot reset");
            return;
        }
        this.in.reset();
        skip(this.reset, j);
        this.offset = j;
    }

    public long savePosition(int i) {
        long j = this.offset + i;
        if (this.limit < j) {
            setLimit(j);
        }
        return this.offset;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (!this.allowExpire) {
            long j2 = this.offset;
            if (j2 + j > this.limit) {
                setLimit(j2 + j + this.limitIncrement);
            }
        }
        long skip = this.in.skip(j);
        this.offset += skip;
        return skip;
    }

    public MarkableInputStream(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    public MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    private void skip(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.in.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.allowExpire) {
            long j = this.offset + 1;
            long j2 = this.limit;
            if (j > j2) {
                setLimit(j2 + this.limitIncrement);
            }
        }
        int read = this.in.read();
        if (read != -1) {
            this.offset++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.allowExpire) {
            long j = this.offset;
            long j2 = i2;
            if (j + j2 > this.limit) {
                setLimit(j + j2 + this.limitIncrement);
            }
        }
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }
}
