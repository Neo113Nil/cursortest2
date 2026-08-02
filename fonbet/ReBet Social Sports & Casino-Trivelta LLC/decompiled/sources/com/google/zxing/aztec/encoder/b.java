package com.google.zxing.aztec.encoder;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f38365c;

    /* renamed from: d, reason: collision with root package name */
    public final short f38366d;

    public b(g gVar, int i10, int i11) {
        super(gVar);
        this.f38365c = (short) i10;
        this.f38366d = (short) i11;
    }

    @Override // com.google.zxing.aztec.encoder.g
    public void c(Lb.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f38366d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                aVar.c(31, 5);
                short s11 = this.f38366d;
                if (s11 > 62) {
                    aVar.c(s11 - 31, 16);
                } else if (i10 == 0) {
                    aVar.c(Math.min((int) s11, 31), 5);
                } else {
                    aVar.c(s11 - 31, 5);
                }
            }
            aVar.c(bArr[this.f38365c + i10], 8);
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f38365c);
        sb2.append("::");
        sb2.append((this.f38365c + this.f38366d) - 1);
        sb2.append(Typography.greater);
        return sb2.toString();
    }
}
