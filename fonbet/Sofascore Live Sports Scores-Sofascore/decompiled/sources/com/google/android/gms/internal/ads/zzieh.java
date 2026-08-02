package com.google.android.gms.internal.ads;

import defpackage.mpo;
import defpackage.vxd;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzieh extends OutputStream {
    public static final byte[] e = new byte[0];
    public int b;
    public int d;
    public final ArrayList a = new ArrayList();
    public byte[] c = new byte[128];

    public final synchronized zziei h() {
        try {
            int i = this.d;
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                this.a.add(new mpo(this.c));
                this.c = e;
            } else if (i > 0) {
                this.a.add(new mpo(Arrays.copyOf(bArr, i)));
            }
            this.b += this.d;
            this.d = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zziei.D(this.a);
    }

    public final void i(int i) {
        this.a.add(new mpo(this.c));
        int length = this.b + this.c.length;
        this.b = length;
        this.c = new byte[Math.max(128, Math.max(i, length >>> 1))];
        this.d = 0;
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.b + this.d;
        }
        return vxd.k(i, "<ByteString.Output@", hexString, " size=", ">");
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.c;
        int length = bArr2.length;
        int i3 = this.d;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        i(i5);
        System.arraycopy(bArr, i + i4, this.c, 0, i5);
        this.d = i5;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.d == this.c.length) {
                i(1);
            }
            byte[] bArr = this.c;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
