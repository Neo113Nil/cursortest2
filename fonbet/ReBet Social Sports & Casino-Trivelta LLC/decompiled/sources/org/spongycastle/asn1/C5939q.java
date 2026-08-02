package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: org.spongycastle.asn1.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5939q {

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f62264a;

    /* renamed from: org.spongycastle.asn1.q$a */
    public class a extends C5939q {

        /* renamed from: b, reason: collision with root package name */
        public boolean f62265b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.f62265b = true;
        }

        @Override // org.spongycastle.asn1.C5939q
        public void c(int i10) {
            if (this.f62265b) {
                this.f62265b = false;
            } else {
                super.c(i10);
            }
        }
    }

    public C5939q(OutputStream outputStream) {
        this.f62264a = outputStream;
    }

    public C5939q a() {
        return new b0(this.f62264a);
    }

    public C5939q b() {
        return new o0(this.f62264a);
    }

    public void c(int i10) {
        this.f62264a.write(i10);
    }

    public void d(byte[] bArr) {
        this.f62264a.write(bArr);
    }

    public void e(byte[] bArr, int i10, int i11) {
        this.f62264a.write(bArr, i10, i11);
    }

    public void f(int i10, int i11, byte[] bArr) {
        k(i10, i11);
        i(bArr.length);
        d(bArr);
    }

    public void g(int i10, byte[] bArr) {
        c(i10);
        i(bArr.length);
        d(bArr);
    }

    public void h(AbstractC5940s abstractC5940s) {
        if (abstractC5940s == null) {
            throw new IOException("null object detected");
        }
        abstractC5940s.e(new a(this.f62264a));
    }

    public void i(int i10) {
        if (i10 <= 127) {
            c((byte) i10);
            return;
        }
        int i11 = i10;
        int i12 = 1;
        while (true) {
            i11 >>>= 8;
            if (i11 == 0) {
                break;
            } else {
                i12++;
            }
        }
        c((byte) (i12 | 128));
        for (int i13 = (i12 - 1) * 8; i13 >= 0; i13 -= 8) {
            c((byte) (i10 >> i13));
        }
    }

    public void j(InterfaceC5927e interfaceC5927e) {
        if (interfaceC5927e == null) {
            throw new IOException("null object detected");
        }
        interfaceC5927e.toASN1Primitive().e(this);
    }

    public void k(int i10, int i11) {
        if (i11 < 31) {
            c(i10 | i11);
            return;
        }
        c(i10 | 31);
        if (i11 < 128) {
            c(i11);
            return;
        }
        byte[] bArr = new byte[5];
        int i12 = 4;
        bArr[4] = (byte) (i11 & 127);
        do {
            i11 >>= 7;
            i12--;
            bArr[i12] = (byte) ((i11 & 127) | 128);
        } while (i11 > 127);
        e(bArr, i12, 5 - i12);
    }
}
