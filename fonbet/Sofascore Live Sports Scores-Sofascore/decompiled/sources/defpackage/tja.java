package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tja implements yd5 {
    public final sja a;

    public tja(sja sjaVar) {
        this.a = sjaVar;
    }

    @Override // defpackage.yd5, defpackage.c80
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final tmk a(q4k q4kVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        sja sjaVar = this.a;
        uzc uzcVar = sjaVar.b;
        tzc tzcVar = new tzc(uzcVar.e + 2);
        uzc uzcVar2 = new uzc(uzcVar.e);
        int[] iArr3 = uzcVar.b;
        Object[] objArr3 = uzcVar.c;
        long[] jArr = uzcVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            rja rjaVar = (rja) objArr3[i6];
                            tzcVar.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            uzcVar2.i(i7, new smk((j80) q4kVar.a.invoke(rjaVar.a), rjaVar.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!uzcVar.a(0)) {
            int i8 = tzcVar.b;
            if (i8 < 0) {
                zzl.r("Index must be between 0 and size");
                return null;
            }
            tzcVar.b(i8 + 1);
            int[] iArr4 = tzcVar.a;
            int i9 = tzcVar.b;
            if (i9 != 0) {
                mh0.e(1, 0, iArr4, iArr4, i9);
            }
            iArr4[0] = 0;
            tzcVar.b++;
        }
        if (!uzcVar.a(sjaVar.a)) {
            tzcVar.a(sjaVar.a);
        }
        int i10 = tzcVar.b;
        if (i10 != 0) {
            int[] iArr5 = tzcVar.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new tmk(tzcVar, uzcVar2, sjaVar.a, jg5.d);
    }
}
