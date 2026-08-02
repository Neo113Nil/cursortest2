package com.logrocket.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class i extends h {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6728d;

    public i(byte[] bArr) {
        bArr.getClass();
        this.f6728d = bArr;
    }

    @Override // com.logrocket.protobuf.j
    public byte b(int i5) {
        return this.f6728d[i5];
    }

    @Override // com.logrocket.protobuf.j
    public void e(int i5, byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f6728d, i5, bArr, i10, i11);
    }

    @Override // com.logrocket.protobuf.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j) && size() == ((j) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int i5 = this.f6738a;
            int i10 = iVar.f6738a;
            if (i5 == 0 || i10 == 0 || i5 == i10) {
                return q(iVar, 0, size());
            }
        }
        return false;
    }

    @Override // com.logrocket.protobuf.j
    public byte g(int i5) {
        return this.f6728d[i5];
    }

    @Override // com.logrocket.protobuf.j
    public final boolean i() {
        int s8 = s();
        return a2.f6667a.e(0, this.f6728d, s8, size() + s8) == 0;
    }

    @Override // com.logrocket.protobuf.j
    public final int j(int i5, int i10, int i11) {
        int s8 = s() + i10;
        Charset charset = d0.f6681a;
        for (int i12 = s8; i12 < s8 + i11; i12++) {
            i5 = (i5 * 31) + this.f6728d[i12];
        }
        return i5;
    }

    @Override // com.logrocket.protobuf.j
    public final int l(int i5, int i10, int i11) {
        int s8 = s() + i10;
        return a2.f6667a.e(i5, this.f6728d, s8, i11 + s8);
    }

    @Override // com.logrocket.protobuf.j
    public final j m(int i5, int i10) {
        int d10 = j.d(i5, i10, size());
        if (d10 == 0) {
            return j.f6736b;
        }
        return new g(this.f6728d, s() + i5, d10);
    }

    @Override // com.logrocket.protobuf.j
    public final String o(Charset charset) {
        return new String(this.f6728d, s(), size(), charset);
    }

    @Override // com.logrocket.protobuf.j
    public final void p(p pVar) {
        pVar.f(this.f6728d, s(), size());
    }

    @Override // com.logrocket.protobuf.h
    public final boolean q(h hVar, int i5, int i10) {
        if (i10 > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i10 + size());
        }
        int i11 = i5 + i10;
        if (i11 > hVar.size()) {
            throw new IllegalArgumentException("Ran off end of other: " + i5 + ", " + i10 + ", " + hVar.size());
        }
        if (!(hVar instanceof i)) {
            return hVar.m(i5, i11).equals(m(0, i10));
        }
        i iVar = (i) hVar;
        byte[] bArr = iVar.f6728d;
        int s8 = s() + i10;
        int s10 = s();
        int s11 = iVar.s() + i5;
        while (s10 < s8) {
            if (this.f6728d[s10] != bArr[s11]) {
                return false;
            }
            s10++;
            s11++;
        }
        return true;
    }

    public int s() {
        return 0;
    }

    @Override // com.logrocket.protobuf.j
    public int size() {
        return this.f6728d.length;
    }
}
