package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f37764a = 0;

    public long d() {
        return this.f37764a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f37764a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f37764a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f37764a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
