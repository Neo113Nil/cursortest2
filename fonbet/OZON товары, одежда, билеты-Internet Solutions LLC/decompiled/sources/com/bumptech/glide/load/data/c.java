package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FileOutputStream f57623a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f57624b;

    /* renamed from: c, reason: collision with root package name */
    private W5.b f57625c;

    /* renamed from: d, reason: collision with root package name */
    private int f57626d;

    public c(@NonNull FileOutputStream fileOutputStream, @NonNull W5.b bVar) {
        this.f57623a = fileOutputStream;
        this.f57625c = bVar;
        this.f57624b = (byte[]) bVar.b(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f57623a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f57624b;
            if (bArr != null) {
                this.f57625c.a(bArr);
                this.f57624b = null;
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i11 = this.f57626d;
        FileOutputStream fileOutputStream = this.f57623a;
        if (i11 > 0) {
            fileOutputStream.write(this.f57624b, 0, i11);
            this.f57626d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i11) throws IOException {
        byte[] bArr = this.f57624b;
        int i12 = this.f57626d;
        int i13 = i12 + 1;
        this.f57626d = i13;
        bArr[i12] = (byte) i11;
        if (i13 != bArr.length || i13 <= 0) {
            return;
        }
        this.f57623a.write(bArr, 0, i13);
        this.f57626d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        do {
            int i14 = i12 - i13;
            int i15 = i11 + i13;
            int i16 = this.f57626d;
            FileOutputStream fileOutputStream = this.f57623a;
            if (i16 == 0 && i14 >= this.f57624b.length) {
                fileOutputStream.write(bArr, i15, i14);
                return;
            }
            int min = Math.min(i14, this.f57624b.length - i16);
            System.arraycopy(bArr, i15, this.f57624b, this.f57626d, min);
            int i17 = this.f57626d + min;
            this.f57626d = i17;
            i13 += min;
            byte[] bArr2 = this.f57624b;
            if (i17 == bArr2.length && i17 > 0) {
                fileOutputStream.write(bArr2, 0, i17);
                this.f57626d = 0;
            }
        } while (i13 < i12);
    }
}
