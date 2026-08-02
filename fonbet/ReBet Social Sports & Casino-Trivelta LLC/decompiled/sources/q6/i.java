package q6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f63442a = new i();

    public static final void a(C6119a x10, C6119a b10) {
        if (Y7.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(b10, "b");
            int b11 = x10.b(0);
            int b12 = x10.b(1);
            int b13 = x10.b(2);
            float[] a10 = x10.a();
            float[] a11 = b10.a();
            if (b11 <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (b12 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        if (b13 > 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                int i16 = (i10 * b12 * b13) + (i12 * b13) + i14;
                                a10[i16] = a10[i16] + a11[i14];
                                if (i15 >= b13) {
                                    break;
                                } else {
                                    i14 = i15;
                                }
                            }
                        }
                        if (i13 >= b12) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                if (i11 >= b11) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
        }
    }

    public static final C6119a b(C6119a[] tensors) {
        int i10;
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int i11 = 0;
            int b10 = tensors[0].b(0);
            int length = tensors.length - 1;
            if (length >= 0) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    i10 += tensors[i12].b(1);
                    if (i13 > length) {
                        break;
                    }
                    i12 = i13;
                }
            } else {
                i10 = 0;
            }
            C6119a c6119a = new C6119a(new int[]{b10, i10});
            float[] a10 = c6119a.a();
            if (b10 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    int i16 = i14 * i10;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i17 = i11;
                        while (true) {
                            int i18 = i17 + 1;
                            float[] a11 = tensors[i17].a();
                            int b11 = tensors[i17].b(1);
                            System.arraycopy(a11, i14 * b11, a10, i16, b11);
                            i16 += b11;
                            if (i18 > length2) {
                                break;
                            }
                            i17 = i18;
                        }
                    }
                    if (i15 >= b10) {
                        break;
                    }
                    i14 = i15;
                    i11 = 0;
                }
            }
            return c6119a;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final C6119a c(C6119a x10, C6119a w10) {
        C6119a c6119a;
        float[] fArr;
        float[] fArr2;
        C6119a c6119a2 = null;
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int i10 = 0;
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            int b12 = x10.b(2);
            int b13 = w10.b(0);
            int i11 = (b11 - b13) + 1;
            int b14 = w10.b(2);
            C6119a c6119a3 = new C6119a(new int[]{b10, i11, b14});
            float[] a10 = x10.a();
            float[] a11 = c6119a3.a();
            float[] a12 = w10.a();
            if (b10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (b14 > 0) {
                        int i14 = i10;
                        while (true) {
                            int i15 = i14 + 1;
                            if (i11 > 0) {
                                int i16 = 0;
                                while (true) {
                                    c6119a = c6119a2;
                                    int i17 = i16 + 1;
                                    float f10 = 0.0f;
                                    if (b13 > 0) {
                                        int i18 = 0;
                                        while (true) {
                                            fArr = a10;
                                            int i19 = i18 + 1;
                                            if (b12 > 0) {
                                                int i20 = 0;
                                                while (true) {
                                                    fArr2 = a12;
                                                    int i21 = i20 + 1;
                                                    try {
                                                        f10 += fArr[(b11 * b12 * i12) + ((i18 + i16) * b12) + i20] * fArr2[(((i18 * b12) + i20) * b14) + i14];
                                                        if (i21 >= b12) {
                                                            break;
                                                        }
                                                        i20 = i21;
                                                        a12 = fArr2;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Y7.a.b(th, i.class);
                                                        return c6119a;
                                                    }
                                                }
                                            } else {
                                                fArr2 = a12;
                                            }
                                            if (i19 >= b13) {
                                                break;
                                            }
                                            a12 = fArr2;
                                            i18 = i19;
                                            a10 = fArr;
                                        }
                                    } else {
                                        fArr = a10;
                                        fArr2 = a12;
                                    }
                                    a11[(i11 * b14 * i12) + (i16 * b14) + i14] = f10;
                                    if (i17 >= i11) {
                                        break;
                                    }
                                    a10 = fArr;
                                    a12 = fArr2;
                                    i16 = i17;
                                    c6119a2 = c6119a;
                                }
                            } else {
                                fArr = a10;
                                fArr2 = a12;
                                c6119a = c6119a2;
                            }
                            if (i15 >= b14) {
                                break;
                            }
                            a10 = fArr;
                            a12 = fArr2;
                            i14 = i15;
                            c6119a2 = c6119a;
                        }
                    } else {
                        fArr = a10;
                        fArr2 = a12;
                        c6119a = c6119a2;
                    }
                    if (i13 >= b10) {
                        break;
                    }
                    a10 = fArr;
                    a12 = fArr2;
                    i12 = i13;
                    c6119a2 = c6119a;
                    i10 = 0;
                }
            }
            return c6119a3;
        } catch (Throwable th3) {
            th = th3;
            c6119a = null;
        }
    }

    public static final C6119a d(C6119a x10, C6119a w10, C6119a b10) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            Intrinsics.checkNotNullParameter(b10, "b");
            int b11 = x10.b(0);
            int b12 = b10.b(0);
            C6119a h10 = h(x10, w10);
            float[] a10 = b10.a();
            float[] a11 = h10.a();
            if (b11 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (b12 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * b12) + i12;
                            a11[i14] = a11[i14] + a10[i12];
                            if (i13 >= b12) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= b11) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return h10;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final C6119a e(String[] texts, int i10, C6119a w10) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w10, "w");
            int length = texts.length;
            int b10 = w10.b(1);
            C6119a c6119a = new C6119a(new int[]{length, i10, b10});
            float[] a10 = c6119a.a();
            float[] a11 = w10.a();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    int[] d10 = j.f63443a.d(texts[i11], i10);
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            System.arraycopy(a11, d10[i13] * b10, a10, (b10 * i10 * i11) + (i13 * b10), b10);
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return c6119a;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final void f(C6119a x10, int i10) {
        if (Y7.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            if (i10 >= x10.c()) {
                return;
            }
            int c10 = x10.c();
            int i11 = 1;
            if (i10 < c10) {
                int i12 = i10;
                while (true) {
                    int i13 = i12 + 1;
                    i11 *= x10.b(i12);
                    if (i13 >= c10) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
            }
            int[] iArr = new int[i10 + 1];
            if (i10 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    iArr[i14] = x10.b(i14);
                    if (i15 >= i10) {
                        break;
                    } else {
                        i14 = i15;
                    }
                }
            }
            iArr[i10] = i11;
            x10.d(iArr);
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
        }
    }

    public static final C6119a g(C6119a x10, int i10) {
        C6119a c6119a;
        float[] fArr;
        C6119a c6119a2 = null;
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int i11 = 0;
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            int b12 = x10.b(2);
            int i12 = (b11 - i10) + 1;
            C6119a c6119a3 = new C6119a(new int[]{b10, i12, b12});
            float[] a10 = x10.a();
            float[] a11 = c6119a3.a();
            if (b10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (b12 > 0) {
                        int i15 = i11;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = i11;
                                while (true) {
                                    int i18 = i17 + 1;
                                    int i19 = i17 * b12;
                                    int i20 = (i13 * i12 * b12) + i19 + i15;
                                    int i21 = (i13 * b11 * b12) + i19 + i15;
                                    a11[i20] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i22 = 0;
                                        while (true) {
                                            c6119a = c6119a2;
                                            int i23 = i22 + 1;
                                            fArr = a10;
                                            try {
                                                a11[i20] = Math.max(a11[i20], fArr[i21 + (i22 * b12)]);
                                                if (i23 >= i10) {
                                                    break;
                                                }
                                                a10 = fArr;
                                                i22 = i23;
                                                c6119a2 = c6119a;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Y7.a.b(th, i.class);
                                                return c6119a;
                                            }
                                        }
                                    } else {
                                        fArr = a10;
                                        c6119a = c6119a2;
                                    }
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    a10 = fArr;
                                    i17 = i18;
                                    c6119a2 = c6119a;
                                }
                            } else {
                                fArr = a10;
                                c6119a = c6119a2;
                            }
                            if (i16 >= b12) {
                                break;
                            }
                            a10 = fArr;
                            i15 = i16;
                            c6119a2 = c6119a;
                            i11 = 0;
                        }
                    } else {
                        fArr = a10;
                        c6119a = c6119a2;
                    }
                    if (i14 >= b10) {
                        break;
                    }
                    a10 = fArr;
                    i13 = i14;
                    c6119a2 = c6119a;
                    i11 = 0;
                }
            }
            return c6119a3;
        } catch (Throwable th3) {
            th = th3;
            c6119a = c6119a2;
        }
    }

    public static final C6119a h(C6119a x10, C6119a w10) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int i10 = 0;
            int b10 = x10.b(0);
            int b11 = w10.b(0);
            int b12 = w10.b(1);
            C6119a c6119a = new C6119a(new int[]{b10, b12});
            float[] a10 = x10.a();
            float[] a11 = w10.a();
            float[] a12 = c6119a.a();
            if (b10 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (b12 > 0) {
                        int i13 = i10;
                        while (true) {
                            int i14 = i13 + 1;
                            int i15 = (i11 * b12) + i13;
                            a12[i15] = 0.0f;
                            if (b11 > 0) {
                                int i16 = i10;
                                while (true) {
                                    int i17 = i16 + 1;
                                    a12[i15] = a12[i15] + (a10[(i11 * b11) + i16] * a11[(i16 * b12) + i13]);
                                    if (i17 >= b11) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i14 >= b12) {
                                break;
                            }
                            i13 = i14;
                            i10 = 0;
                        }
                    }
                    if (i12 >= b10) {
                        break;
                    }
                    i11 = i12;
                    i10 = 0;
                }
            }
            return c6119a;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final void i(C6119a x10) {
        if (Y7.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            float[] a10 = x10.a();
            int length = a10.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (a10[i10] < 0.0f) {
                    a10[i10] = 0.0f;
                }
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
        }
    }

    public static final void j(C6119a x10) {
        if (Y7.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int i10 = 0;
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            float[] a10 = x10.a();
            if (b10 <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                int i12 = i10 * b11;
                int i13 = i12 + b11;
                float f10 = Float.MIN_VALUE;
                if (i12 < i13) {
                    int i14 = i12;
                    while (true) {
                        int i15 = i14 + 1;
                        float f11 = a10[i14];
                        if (f11 > f10) {
                            f10 = f11;
                        }
                        if (i15 >= i13) {
                            break;
                        } else {
                            i14 = i15;
                        }
                    }
                }
                float f12 = 0.0f;
                if (i12 < i13) {
                    int i16 = i12;
                    while (true) {
                        int i17 = i16 + 1;
                        float exp = (float) Math.exp(a10[i16] - f10);
                        a10[i16] = exp;
                        f12 += exp;
                        if (i17 >= i13) {
                            break;
                        } else {
                            i16 = i17;
                        }
                    }
                }
                if (i12 < i13) {
                    while (true) {
                        int i18 = i12 + 1;
                        a10[i12] = a10[i12] / f12;
                        if (i18 >= i13) {
                            break;
                        } else {
                            i12 = i18;
                        }
                    }
                }
                if (i11 >= b10) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
        }
    }

    public static final C6119a k(C6119a x10) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            C6119a c6119a = new C6119a(new int[]{b11, b10});
            float[] a10 = x10.a();
            float[] a11 = c6119a.a();
            if (b10 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (b11 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            a11[(i12 * b10) + i10] = a10[(i10 * b11) + i12];
                            if (i13 >= b11) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= b10) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return c6119a;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final C6119a l(C6119a x10) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            int b12 = x10.b(2);
            C6119a c6119a = new C6119a(new int[]{b12, b11, b10});
            float[] a10 = x10.a();
            float[] a11 = c6119a.a();
            if (b10 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (b11 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (b12 > 0) {
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14 + 1;
                                    a11[(i14 * b10 * b11) + (i12 * b10) + i10] = a10[(i10 * b11 * b12) + (i12 * b12) + i14];
                                    if (i15 >= b12) {
                                        break;
                                    }
                                    i14 = i15;
                                }
                            }
                            if (i13 >= b11) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= b10) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return c6119a;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }
}
