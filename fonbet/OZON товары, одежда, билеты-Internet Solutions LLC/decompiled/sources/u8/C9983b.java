package u8;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* renamed from: u8.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9983b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f100371a = 0;

    C9983b() {
    }

    final long c() {
        return this.f100371a;
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.f100371a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f100371a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) <= bArr.length && i13 >= 0) {
            this.f100371a += i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
