package H1;

import b1.InterfaceC2358l;

/* renamed from: H1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1184q extends InterfaceC2358l {
    int a(int i10);

    boolean d(int i10, boolean z10);

    boolean e(byte[] bArr, int i10, int i11, boolean z10);

    void g();

    long getLength();

    long getPosition();

    boolean h(byte[] bArr, int i10, int i11, boolean z10);

    long i();

    void j(int i10);

    int k(byte[] bArr, int i10, int i11);

    void l(int i10);

    boolean m(int i10, boolean z10);

    void n(byte[] bArr, int i10, int i11);

    @Override // b1.InterfaceC2358l
    int read(byte[] bArr, int i10, int i11);

    void readFully(byte[] bArr, int i10, int i11);
}
