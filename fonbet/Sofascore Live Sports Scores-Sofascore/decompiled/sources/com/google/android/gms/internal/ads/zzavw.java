package com.google.android.gms.internal.ads;

import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzavw {
    public final int a;
    public final int[] b;

    public zzavw(int i, int[] iArr) {
        int length = iArr.length;
        if (length == 4) {
            this.a = i;
            this.b = iArr;
            return;
        }
        StringBuilder sb = new StringBuilder(fn0.a(length, 44));
        String a = zzawc.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k");
        String a2 = zzawc.a("a0CvvBEaN339T0zNlXk=");
        sb.append(a);
        sb.append(length);
        sb.append(a2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(int i, byte[] bArr) {
        int i2 = 1777080124;
        int i3 = 1777080124;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        char c2 = 0;
        char c3 = 0;
        while (true) {
            if (i3 == 719824015) {
                int i17 = (-235787554) + i3;
                i3 += 799411447;
                if (i4 == i5) {
                    i3 = i17;
                }
            } else if (i3 == 1519235462) {
                int[] iArr = this.b;
                i6 += (((i7 << i8) ^ (i7 >>> i9)) + i7) ^ (i4 + iArr[i4 & i10]);
                i4 += i11;
                i7 += (iArr[(i4 >>> i12) & i10] + i4) ^ (((i6 << i8) ^ (i6 >>> i9)) + i6);
                i3 -= 799411447;
            } else {
                if (i3 != i2) {
                    bArr[0] = (byte) (i6 >> i13);
                    bArr[1] = (byte) ((((i6 >> i14) & i15) << i13) >> i13);
                    bArr[c] = (byte) ((((i6 >> i16) & i15) << i13) >> i13);
                    bArr[i10] = (byte) (((i6 & i15) << i13) >> i13);
                    bArr[i8] = (byte) (i7 >> i13);
                    bArr[i9] = (byte) ((((i7 >> i14) & i15) << i13) >> i13);
                    bArr[c2] = (byte) ((((i7 >> i16) & i15) << i13) >> i13);
                    bArr[c3] = (byte) (((i7 & i15) << i13) >> i13);
                    return;
                }
                i3 -= 1057256109;
                i10 = 3;
                i15 = 255;
                c3 = 7;
                c2 = 6;
                c = 2;
                i13 = 24;
                i12 = 11;
                i11 = 1340169305;
                i9 = 5;
                i8 = 4;
                i5 = -64255200;
                i14 = 16;
                i6 = this.a;
                i16 = 8;
                i7 = i;
                i4 = 0;
            }
            i2 = 1777080124;
        }
    }
}
