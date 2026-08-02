package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzauu extends ByteArrayOutputStream {
    public final zzauj a;

    public zzauu(zzauj zzaujVar, int i) {
        this.a = zzaujVar;
        ((ByteArrayOutputStream) this).buf = zzaujVar.a(Math.max(i, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void e(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        zzauj zzaujVar = this.a;
        byte[] a = zzaujVar.a(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
        zzaujVar.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a;
    }

    public final void finalize() {
        this.a.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        e(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        e(i2);
        super.write(bArr, i, i2);
    }
}
