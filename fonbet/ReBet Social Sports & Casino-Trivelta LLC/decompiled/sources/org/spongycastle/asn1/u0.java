package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class u0 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public int f62272c;

    /* renamed from: d, reason: collision with root package name */
    public int f62273d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62274e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62275f;

    public u0(InputStream inputStream, int i10) {
        super(inputStream, i10);
        this.f62274e = false;
        this.f62275f = true;
        this.f62272c = inputStream.read();
        int read = inputStream.read();
        this.f62273d = read;
        if (read < 0) {
            throw new EOFException();
        }
        r();
    }

    public void B(boolean z10) {
        this.f62275f = z10;
        r();
    }

    public final boolean r() {
        if (!this.f62274e && this.f62275f && this.f62272c == 0 && this.f62273d == 0) {
            this.f62274e = true;
            k(true);
        }
        return this.f62274e;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f62275f || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f62274e) {
            return -1;
        }
        int read = this.f62283a.read(bArr, i10 + 2, i11 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this.f62272c;
        bArr[i10 + 1] = (byte) this.f62273d;
        this.f62272c = this.f62283a.read();
        int read2 = this.f62283a.read();
        this.f62273d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read() {
        if (r()) {
            return -1;
        }
        int read = this.f62283a.read();
        if (read >= 0) {
            int i10 = this.f62272c;
            this.f62272c = this.f62273d;
            this.f62273d = read;
            return i10;
        }
        throw new EOFException();
    }
}
