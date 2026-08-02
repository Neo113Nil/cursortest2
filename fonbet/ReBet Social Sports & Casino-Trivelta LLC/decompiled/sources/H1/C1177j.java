package H1;

import b1.AbstractC2332A;
import b1.InterfaceC2358l;
import e1.Z;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: H1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177j implements InterfaceC1184q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2358l f4444a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4445b;

    /* renamed from: c, reason: collision with root package name */
    public long f4446c;

    /* renamed from: d, reason: collision with root package name */
    public int f4447d;

    /* renamed from: e, reason: collision with root package name */
    public int f4448e;
    private byte[] peekBuffer = new byte[PKIFailureInfo.notAuthorized];
    private final byte[] scratchSpace = new byte[4096];

    static {
        AbstractC2332A.a("media3.extractor");
    }

    public C1177j(InterfaceC2358l interfaceC2358l, long j10, long j11) {
        this.f4444a = interfaceC2358l;
        this.f4446c = j10;
        this.f4445b = j11;
    }

    @Override // H1.InterfaceC1184q
    public int a(int i10) {
        int s10 = s(i10);
        if (s10 == 0) {
            byte[] bArr = this.scratchSpace;
            s10 = r(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        o(s10);
        return s10;
    }

    @Override // H1.InterfaceC1184q
    public boolean d(int i10, boolean z10) {
        int s10 = s(i10);
        while (s10 < i10 && s10 != -1) {
            s10 = r(this.scratchSpace, -s10, Math.min(i10, this.scratchSpace.length + s10), s10, z10);
        }
        o(s10);
        return s10 != -1;
    }

    @Override // H1.InterfaceC1184q
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) {
        if (!m(i11, z10)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.f4447d - i11, bArr, i10, i11);
        return true;
    }

    @Override // H1.InterfaceC1184q
    public void g() {
        this.f4447d = 0;
    }

    @Override // H1.InterfaceC1184q
    public long getLength() {
        return this.f4445b;
    }

    @Override // H1.InterfaceC1184q
    public long getPosition() {
        return this.f4446c;
    }

    @Override // H1.InterfaceC1184q
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        int q10 = q(bArr, i10, i11);
        while (q10 < i11 && q10 != -1) {
            q10 = r(bArr, i10, i11, q10, z10);
        }
        o(q10);
        return q10 != -1;
    }

    @Override // H1.InterfaceC1184q
    public long i() {
        return this.f4446c + this.f4447d;
    }

    @Override // H1.InterfaceC1184q
    public void j(int i10) {
        m(i10, false);
    }

    @Override // H1.InterfaceC1184q
    public int k(byte[] bArr, int i10, int i11) {
        C1177j c1177j;
        int min;
        p(i11);
        int i12 = this.f4448e;
        int i13 = this.f4447d;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c1177j = this;
            min = c1177j.r(this.peekBuffer, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            c1177j.f4448e += min;
        } else {
            c1177j = this;
            min = Math.min(i11, i14);
        }
        System.arraycopy(c1177j.peekBuffer, c1177j.f4447d, bArr, i10, min);
        c1177j.f4447d += min;
        return min;
    }

    @Override // H1.InterfaceC1184q
    public void l(int i10) {
        d(i10, false);
    }

    @Override // H1.InterfaceC1184q
    public boolean m(int i10, boolean z10) {
        p(i10);
        int i11 = this.f4448e - this.f4447d;
        while (i11 < i10) {
            int i12 = i10;
            boolean z11 = z10;
            i11 = r(this.peekBuffer, this.f4447d, i12, i11, z11);
            if (i11 == -1) {
                return false;
            }
            this.f4448e = this.f4447d + i11;
            i10 = i12;
            z10 = z11;
        }
        this.f4447d += i10;
        return true;
    }

    @Override // H1.InterfaceC1184q
    public void n(byte[] bArr, int i10, int i11) {
        e(bArr, i10, i11, false);
    }

    public final void o(int i10) {
        if (i10 != -1) {
            this.f4446c += i10;
        }
    }

    public final void p(int i10) {
        int i11 = this.f4447d + i10;
        byte[] bArr = this.peekBuffer;
        if (i11 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Z.o(bArr.length * 2, PKIFailureInfo.notAuthorized + i11, i11 + PKIFailureInfo.signerNotTrusted));
        }
    }

    public final int q(byte[] bArr, int i10, int i11) {
        int i12 = this.f4448e;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.peekBuffer, 0, bArr, i10, min);
        t(min);
        return min;
    }

    public final int r(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f4444a.read(bArr, i10 + i12, i11 - i12);
        if (read != -1) {
            return i12 + read;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // H1.InterfaceC1184q, b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        int q10 = q(bArr, i10, i11);
        if (q10 == 0) {
            q10 = r(bArr, i10, i11, 0, true);
        }
        o(q10);
        return q10;
    }

    @Override // H1.InterfaceC1184q
    public void readFully(byte[] bArr, int i10, int i11) {
        h(bArr, i10, i11, false);
    }

    public final int s(int i10) {
        int min = Math.min(this.f4448e, i10);
        t(min);
        return min;
    }

    public final void t(int i10) {
        int i11 = this.f4448e - i10;
        this.f4448e = i11;
        this.f4447d = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i11 < bArr.length - PKIFailureInfo.signerNotTrusted ? new byte[PKIFailureInfo.notAuthorized + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.peekBuffer = bArr2;
    }
}
