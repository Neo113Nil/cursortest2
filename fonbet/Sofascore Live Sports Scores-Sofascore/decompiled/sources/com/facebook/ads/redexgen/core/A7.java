package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC3097oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3097oQ
    public final C14203i A09(C14203i c14203i) throws C14213j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C14203i.A05;
        }
        if (c14203i.A02 == 2) {
            int i = c14203i.A01 != iArr.length ? 1 : 0;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 < c14203i.A01) {
                    i |= i3 != i2 ? 1 : 0;
                    i2++;
                } else {
                    throw new C14213j(c14203i);
                }
            }
            if (i != 0) {
                return new C14203i(c14203i.A03, iArr.length, 2);
            }
            return C14203i.A05;
        }
        throw new C14213j(c14203i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3097oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14223k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC14363y.A01(this.A00);
        int position = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position2 = outputSize - position;
        ByteBuffer A00 = A00(this.A06.A00 * (position2 / this.A05.A00));
        while (position < outputSize) {
            for (int i : iArr) {
                A00.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        A00.flip();
    }
}
