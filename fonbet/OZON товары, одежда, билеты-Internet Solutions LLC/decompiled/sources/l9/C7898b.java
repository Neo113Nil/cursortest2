package l9;

import o9.C8659a;

/* renamed from: l9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C7898b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f73116c;

    /* renamed from: d, reason: collision with root package name */
    private final short f73117d;

    C7898b(g gVar, int i11, int i12) {
        super(gVar);
        this.f73116c = (short) i11;
        this.f73117d = (short) i12;
    }

    @Override // l9.g
    public final void a(C8659a c8659a, byte[] bArr) {
        int i11 = 0;
        while (true) {
            short s11 = this.f73117d;
            if (i11 >= s11) {
                return;
            }
            if (i11 == 0 || (i11 == 31 && s11 <= 62)) {
                c8659a.c(31, 5);
                if (s11 > 62) {
                    c8659a.c(s11 - 31, 16);
                } else if (i11 == 0) {
                    c8659a.c(Math.min((int) s11, 31), 5);
                } else {
                    c8659a.c(s11 - 31, 5);
                }
            }
            c8659a.c(bArr[this.f73116c + i11], 8);
            i11++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f73116c);
        sb2.append("::");
        sb2.append((r1 + this.f73117d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
