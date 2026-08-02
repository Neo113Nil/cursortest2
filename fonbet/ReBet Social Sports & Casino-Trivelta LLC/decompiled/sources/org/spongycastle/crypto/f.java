package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f62618a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5948a f62619b;
    protected byte[] buf;

    public f(InterfaceC5948a interfaceC5948a) {
        this.f62619b = interfaceC5948a;
    }

    public byte[] a() {
        byte[] processBlock = this.f62619b.processBlock(this.buf, 0, this.f62618a);
        f();
        return processBlock;
    }

    public int b() {
        return this.f62619b.getInputBlockSize();
    }

    public int c() {
        return this.f62619b.getOutputBlockSize();
    }

    public void d(boolean z10, j jVar) {
        f();
        this.f62619b.a(z10, jVar);
        this.buf = new byte[this.f62619b.getInputBlockSize() + (z10 ? 1 : 0)];
        this.f62618a = 0;
    }

    public void e(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i12 = this.f62618a;
        int i13 = i12 + i11;
        byte[] bArr2 = this.buf;
        if (i13 > bArr2.length) {
            throw new l("attempt to process message too long for cipher");
        }
        System.arraycopy(bArr, i10, bArr2, i12, i11);
        this.f62618a += i11;
    }

    public void f() {
        if (this.buf != null) {
            int i10 = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i10 >= bArr.length) {
                    break;
                }
                bArr[i10] = 0;
                i10++;
            }
        }
        this.f62618a = 0;
    }
}
