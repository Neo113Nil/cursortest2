package l9;

import o9.C8659a;

/* loaded from: classes9.dex */
final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f73124c;

    /* renamed from: d, reason: collision with root package name */
    private final short f73125d;

    e(g gVar, int i11, int i12) {
        super(gVar);
        this.f73124c = (short) i11;
        this.f73125d = (short) i12;
    }

    @Override // l9.g
    final void a(C8659a c8659a, byte[] bArr) {
        c8659a.c(this.f73124c, this.f73125d);
    }

    public final String toString() {
        short s11 = this.f73125d;
        return "<" + Integer.toBinaryString((1 << s11) | (((1 << s11) - 1) & this.f73124c) | (1 << s11)).substring(1) + '>';
    }
}
