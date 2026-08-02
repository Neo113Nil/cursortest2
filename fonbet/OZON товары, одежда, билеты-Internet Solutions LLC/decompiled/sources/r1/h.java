package r1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r1.g;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private float[] f82798a = new float[64];

    public static ArrayList a(h hVar, String str) {
        int i11;
        char charAt;
        int i12;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        char c11 = 0;
        int i13 = 0;
        while (i13 < length && Intrinsics.i(str.charAt(i13), 32) <= 0) {
            i13++;
        }
        while (length > i13 && Intrinsics.i(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i14 = 0;
        while (i13 < length) {
            while (true) {
                i11 = i13 + 1;
                charAt = str.charAt(i13);
                int i15 = charAt | ' ';
                if ((i15 - 122) * (i15 - 97) <= 0 && i15 != 101) {
                    break;
                }
                if (i11 >= length) {
                    charAt = c11;
                    break;
                }
                i13 = i11;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i14 = c11;
                    while (true) {
                        if (i11 >= length || Intrinsics.i(str.charAt(i11), 32) > 0) {
                            long a11 = C9154b.a(i11, length, str);
                            i12 = (int) (a11 >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (a11 & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = hVar.f82798a;
                                int i16 = i14 + 1;
                                fArr[i14] = intBitsToFloat;
                                if (i16 >= fArr.length) {
                                    float[] destination = new float[i16 * 2];
                                    hVar.f82798a = destination;
                                    int length2 = fArr.length;
                                    Intrinsics.checkNotNullParameter(fArr, "<this>");
                                    Intrinsics.checkNotNullParameter(destination, "destination");
                                    System.arraycopy(fArr, c11, destination, c11, length2);
                                }
                                i14 = i16;
                            }
                            while (i12 < length && str.charAt(i12) == ',') {
                                i12++;
                            }
                            if (i12 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            i11++;
                        }
                    }
                    i11 = i12;
                }
                float[] fArr2 = hVar.f82798a;
                if (charAt == 'z' || charAt == 'Z') {
                    arrayList.add(g.b.f82746c);
                } else {
                    int i17 = 2;
                    if (charAt == 'm') {
                        int i18 = i14 - 2;
                        if (i18 >= 0) {
                            arrayList.add(new g.n(fArr2[c11], fArr2[1]));
                            while (i17 <= i18) {
                                arrayList.add(new g.m(fArr2[i17], fArr2[i17 + 1]));
                                i17 += 2;
                            }
                        }
                    } else if (charAt == 'M') {
                        int i19 = i14 - 2;
                        if (i19 >= 0) {
                            arrayList.add(new g.f(fArr2[c11], fArr2[1]));
                            while (i17 <= i19) {
                                arrayList.add(new g.e(fArr2[i17], fArr2[i17 + 1]));
                                i17 += 2;
                            }
                        }
                    } else if (charAt == 'l') {
                        int i21 = i14 - 2;
                        for (int i22 = c11; i22 <= i21; i22 += 2) {
                            arrayList.add(new g.m(fArr2[i22], fArr2[i22 + 1]));
                        }
                    } else if (charAt == 'L') {
                        int i23 = i14 - 2;
                        for (int i24 = c11; i24 <= i23; i24 += 2) {
                            arrayList.add(new g.e(fArr2[i24], fArr2[i24 + 1]));
                        }
                    } else if (charAt == 'h') {
                        int i25 = i14 - 1;
                        for (int i26 = c11; i26 <= i25; i26++) {
                            arrayList.add(new g.l(fArr2[i26]));
                        }
                    } else if (charAt == 'H') {
                        int i27 = i14 - 1;
                        for (int i28 = c11; i28 <= i27; i28++) {
                            arrayList.add(new g.d(fArr2[i28]));
                        }
                    } else if (charAt == 'v') {
                        int i29 = i14 - 1;
                        for (int i31 = c11; i31 <= i29; i31++) {
                            arrayList.add(new g.r(fArr2[i31]));
                        }
                    } else if (charAt == 'V') {
                        int i32 = i14 - 1;
                        for (int i33 = c11; i33 <= i32; i33++) {
                            arrayList.add(new g.s(fArr2[i33]));
                        }
                    } else if (charAt == 'c') {
                        int i34 = i14 - 6;
                        for (int i35 = c11; i35 <= i34; i35 += 6) {
                            arrayList.add(new g.k(fArr2[i35], fArr2[i35 + 1], fArr2[i35 + 2], fArr2[i35 + 3], fArr2[i35 + 4], fArr2[i35 + 5]));
                        }
                    } else if (charAt == 'C') {
                        int i36 = i14 - 6;
                        for (int i37 = c11; i37 <= i36; i37 += 6) {
                            arrayList.add(new g.c(fArr2[i37], fArr2[i37 + 1], fArr2[i37 + 2], fArr2[i37 + 3], fArr2[i37 + 4], fArr2[i37 + 5]));
                        }
                    } else if (charAt == 's') {
                        int i38 = i14 - 4;
                        for (int i39 = c11; i39 <= i38; i39 += 4) {
                            arrayList.add(new g.p(fArr2[i39], fArr2[i39 + 1], fArr2[i39 + 2], fArr2[i39 + 3]));
                        }
                    } else if (charAt == 'S') {
                        int i41 = i14 - 4;
                        for (int i42 = c11; i42 <= i41; i42 += 4) {
                            arrayList.add(new g.h(fArr2[i42], fArr2[i42 + 1], fArr2[i42 + 2], fArr2[i42 + 3]));
                        }
                    } else if (charAt == 'q') {
                        int i43 = i14 - 4;
                        for (int i44 = c11; i44 <= i43; i44 += 4) {
                            arrayList.add(new g.o(fArr2[i44], fArr2[i44 + 1], fArr2[i44 + 2], fArr2[i44 + 3]));
                        }
                    } else if (charAt == 'Q') {
                        int i45 = i14 - 4;
                        for (int i46 = c11; i46 <= i45; i46 += 4) {
                            arrayList.add(new g.C1408g(fArr2[i46], fArr2[i46 + 1], fArr2[i46 + 2], fArr2[i46 + 3]));
                        }
                    } else if (charAt == 't') {
                        int i47 = i14 - 2;
                        for (int i48 = c11; i48 <= i47; i48 += 2) {
                            arrayList.add(new g.q(fArr2[i48], fArr2[i48 + 1]));
                        }
                    } else if (charAt == 'T') {
                        int i49 = i14 - 2;
                        for (int i51 = c11; i51 <= i49; i51 += 2) {
                            arrayList.add(new g.i(fArr2[i51], fArr2[i51 + 1]));
                        }
                    } else if (charAt == 'a') {
                        int i52 = i14 - 7;
                        for (int i53 = c11; i53 <= i52; i53 += 7) {
                            arrayList.add(new g.j(fArr2[i53], fArr2[i53 + 1], fArr2[i53 + 2], Float.compare(fArr2[i53 + 3], 0.0f) != 0, Float.compare(fArr2[i53 + 4], 0.0f) != 0, fArr2[i53 + 5], fArr2[i53 + 6]));
                        }
                    } else {
                        if (charAt != 'A') {
                            throw new IllegalArgumentException(Pk0.i.a("Unknown command for: ", charAt));
                        }
                        int i54 = i14 - 7;
                        for (int i55 = 0; i55 <= i54; i55 += 7) {
                            arrayList.add(new g.a(fArr2[i55], fArr2[i55 + 1], fArr2[i55 + 2], Float.compare(fArr2[i55 + 3], 0.0f) != 0, Float.compare(fArr2[i55 + 4], 0.0f) != 0, fArr2[i55 + 5], fArr2[i55 + 6]));
                        }
                    }
                }
                i13 = i11;
                c11 = 0;
            } else {
                i13 = i11;
            }
        }
        return arrayList;
    }
}
