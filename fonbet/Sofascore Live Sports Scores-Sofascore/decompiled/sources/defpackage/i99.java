package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i99 {
    public final g99 a;
    public final h99 b;
    public final k9 c;

    public i99(g99 g99Var, h99 h99Var, k9 k9Var) {
        this.a = g99Var;
        this.b = h99Var;
        this.c = k9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5 A[LOOP:11: B:102:0x01c3->B:103:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[LOOP:0: B:18:0x006b->B:19:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124 A[LOOP:5: B:69:0x0124->B:71:0x0134, LOOP_START, PHI: r1
      0x0124: PHI (r1v37 int) = (r1v3 int), (r1v38 int) binds: [B:68:0x0122, B:71:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141 A[LOOP:6: B:74:0x013f->B:75:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap b(i99 i99Var, Context context, Iterable iterable, int i, boolean z, boolean z2, boolean z3, int i2) {
        double d;
        int i3;
        int i4;
        Iterator it;
        int i5;
        int i6;
        int i7;
        int[] R0;
        float[] fArr;
        float f;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11 = 0;
        boolean z5 = (i2 & 8) != 0 ? false : z;
        boolean z6 = (i2 & 16) != 0 ? false : z2;
        boolean z7 = (i2 & 32) != 0 ? false : z3;
        boolean z8 = (i2 & 64) != 0;
        g99 g99Var = i99Var.a;
        k9 k9Var = i99Var.c;
        int i12 = k9Var.b;
        h99 h99Var = i99Var.b;
        context.getClass();
        iterable.getClass();
        if (Integer.MIN_VALUE > i || i >= 2) {
            int i13 = k9Var.c;
            int i14 = k9Var.a;
            if (i13 > i || i > Integer.MAX_VALUE) {
                d = 1.0d;
                i12 = wzb.a(((1.0d - Math.pow(i / i13, 0.28d)) * (i12 - i14)) + i14);
                int i15 = g99Var.a;
                int i16 = g99Var.b;
                i3 = i16 + 1;
                float[][] fArr2 = new float[i3][];
                for (i4 = 0; i4 < i3; i4++) {
                    fArr2[i4] = new float[i15 + 1];
                }
                it = iterable.iterator();
                while (it.hasNext()) {
                    Point2D point2D = (Point2D) it.next();
                    int c = llf.c(wzb.b((point2D.getX() * g99Var.c) - g99Var.d), i11, i15);
                    int c2 = llf.c(wzb.b(point2D.getY() - g99Var.e), 0, i16);
                    if (z6) {
                        c = i15 - c;
                    }
                    if (z7) {
                        c2 = i16 - c2;
                    }
                    float[] fArr3 = fArr2[c2];
                    fArr3[c] = fArr3[c] + 1.0f;
                    i11 = 0;
                }
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z8 && i > 5) {
                    for (i9 = 0; i9 < 101; i9++) {
                        float f3 = 0.0f;
                        float f4 = 0.0f;
                        int i17 = 0;
                        int i18 = 2;
                        while (true) {
                            i17++;
                            int i19 = 80 - i18;
                            if (i19 >= 0) {
                                f3 += fArr2[i9][i19];
                            }
                            int i20 = 80 + i18;
                            float[] fArr4 = fArr2[i9];
                            if (i20 < fArr4.length) {
                                f4 += fArr4[i20];
                            }
                            if (i18 == 10) {
                                break;
                            }
                            i18++;
                        }
                        float f5 = i17 != 0 ? (f3 + f4) / (i17 * 2) : 0.0f;
                        while (true) {
                            int i21 = 80 + i10;
                            float[] fArr5 = fArr2[i9];
                            if (i21 < fArr5.length) {
                                fArr5[i21] = f5;
                            }
                            int i22 = 80 - i10;
                            if (i22 >= 0) {
                                fArr5[i22] = f5;
                            }
                            i10 = i10 != 2 ? i10 + 1 : 0;
                        }
                    }
                }
                float f6 = i12 / 3.0f;
                float[] fArr6 = new float[(i12 * 2) + 1];
                float f7 = 2.0f * f6 * f6;
                i5 = -i12;
                if (i5 <= i12) {
                    while (true) {
                        fArr6[i5 + i12] = (float) Math.exp(((-i5) * i5) / f7);
                        if (i5 == i12) {
                            break;
                        }
                        i5++;
                    }
                }
                int length = fArr2[0].length;
                float[][] fArr7 = new float[i3][];
                for (i6 = 0; i6 < i3; i6++) {
                    fArr7[i6] = new float[length];
                }
                for (i7 = 0; i7 < i3; i7++) {
                    int i23 = 0;
                    while (i23 < length) {
                        float f8 = fArr2[i7][i23];
                        if (f8 == f2) {
                            i8 = length;
                            z4 = z5;
                            f = f2;
                        } else {
                            int i24 = i7 - i12;
                            int max = Math.max(0, i24);
                            f = f2;
                            int min = Math.min(i16, i7 + i12);
                            i8 = length;
                            int i25 = i23 - i12;
                            z4 = z5;
                            int max2 = Math.max(0, i25);
                            int min2 = Math.min(i8 - 1, i23 + i12);
                            if (max <= min) {
                                while (true) {
                                    if (max2 <= min2) {
                                        int i26 = max2;
                                        while (true) {
                                            float[] fArr8 = fArr7[max];
                                            fArr8[i26] = (fArr6[max - i24] * f8 * fArr6[i26 - i25]) + fArr8[i26];
                                            if (i26 == min2) {
                                                break;
                                            }
                                            i26++;
                                        }
                                    }
                                    if (max != min) {
                                        max++;
                                    }
                                }
                            }
                        }
                        i23++;
                        f2 = f;
                        length = i8;
                        z5 = z4;
                    }
                }
                boolean z9 = z5;
                float f9 = f2;
                int[] iArr = h99Var.a;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i27 : iArr) {
                    arrayList.add(Integer.valueOf(context.getColor(i27)));
                }
                R0 = CollectionsKt.R0(arrayList);
                fArr = h99Var.b;
                if (R0.length == fArr.length) {
                    a70.p("colors and startPoints should be same length");
                    return null;
                }
                if (R0.length == 0) {
                    a70.p("No colors have been defined");
                    return null;
                }
                for (int i28 = 1; i28 < fArr.length; i28++) {
                    if (fArr[i28] <= fArr[i28 - 1]) {
                        a70.p("startPoints should be in increasing order");
                        return null;
                    }
                }
                int length2 = R0.length;
                int[] iArr2 = new int[length2];
                int length3 = fArr.length;
                float[] fArr9 = new float[length3];
                System.arraycopy(R0, 0, iArr2, 0, R0.length);
                System.arraycopy(fArr, 0, fArr9, 0, fArr.length);
                double d2 = h99Var.c;
                HashMap hashMap = new HashMap();
                float f10 = 1000.0f;
                if (fArr9[0] != f9) {
                    hashMap.put(0, new w19(Color.argb(0, Color.red(iArr2[0]), Color.green(iArr2[0]), Color.blue(iArr2[0])), iArr2[0], 1000.0f * fArr9[0]));
                }
                int i29 = 1;
                while (i29 < length2) {
                    int i30 = i29 - 1;
                    float f11 = f10;
                    hashMap.put(Integer.valueOf((int) (fArr9[i30] * f10)), new w19(iArr2[i30], iArr2[i29], (fArr9[i29] - fArr9[i30]) * f11));
                    i29++;
                    f10 = f11;
                    d2 = d2;
                }
                double d3 = d2;
                float f12 = f10;
                int i31 = length3 - 1;
                float f13 = fArr9[i31];
                if (f13 != 1.0f) {
                    Integer valueOf = Integer.valueOf((int) (f12 * f13));
                    int i32 = iArr2[i31];
                    hashMap.put(valueOf, new w19(i32, i32, (1.0f - fArr9[i31]) * f12));
                }
                int[] iArr3 = new int[1000];
                w19 w19Var = (w19) hashMap.get(0);
                int i33 = 0;
                int i34 = 0;
                for (int i35 = 1000; i33 < i35; i35 = 1000) {
                    if (hashMap.containsKey(Integer.valueOf(i33))) {
                        w19Var = (w19) hashMap.get(Integer.valueOf(i33));
                        i34 = i33;
                    }
                    float f14 = (i33 - i34) / w19Var.c;
                    int i36 = w19Var.a;
                    int i37 = w19Var.b;
                    int alpha = (int) (((Color.alpha(i37) - Color.alpha(i36)) * f14) + Color.alpha(i36));
                    float[] fArr10 = new float[3];
                    Color.RGBToHSV(Color.red(i36), Color.green(i36), Color.blue(i36), fArr10);
                    float[] fArr11 = new float[3];
                    Color.RGBToHSV(Color.red(i37), Color.green(i37), Color.blue(i37), fArr11);
                    float f15 = fArr10[0];
                    float f16 = fArr11[0];
                    if (f15 - f16 > 180.0f) {
                        fArr11[0] = f16 + 360.0f;
                    } else if (f16 - f15 > 180.0f) {
                        fArr10[0] = f15 + 360.0f;
                    }
                    float[] fArr12 = new float[3];
                    int i38 = 0;
                    for (int i39 = 3; i38 < i39; i39 = 3) {
                        float f17 = fArr11[i38];
                        float f18 = fArr10[i38];
                        fArr12[i38] = me4.b(f17, f18, f14, f18);
                        i38++;
                    }
                    iArr3[i33] = Color.HSVToColor(alpha, fArr12);
                    i33++;
                }
                if (d3 != d) {
                    for (int i40 = 0; i40 < 1000; i40++) {
                        int i41 = iArr3[i40];
                        iArr3[i40] = Color.argb((int) (Color.alpha(i41) * d3), Color.red(i41), Color.green(i41), Color.blue(i41));
                    }
                }
                double d4 = h99Var.d;
                int length4 = fArr7[0].length;
                int L = ph0.L(iArr3);
                double d5 = 999.0d / d4;
                int[] iArr4 = new int[i3 * length4];
                for (int i42 = 0; i42 < i3; i42++) {
                    for (int i43 = 0; i43 < length4; i43++) {
                        float f19 = fArr7[i42][i43];
                        int i44 = (i42 * length4) + i43;
                        int i45 = (int) (f19 * d5);
                        if (f19 == f9) {
                            iArr4[i44] = 0;
                        } else {
                            iArr4[i44] = i45 < 1000 ? iArr3[i45] : L;
                        }
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(length4, i3, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                createBitmap.setPixels(iArr4, 0, length4, 0, 0, length4, i3);
                if (!z9) {
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(90.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
                createBitmap2.getClass();
                return createBitmap2;
            }
            i12 = i14;
        }
        d = 1.0d;
        int i152 = g99Var.a;
        int i162 = g99Var.b;
        i3 = i162 + 1;
        float[][] fArr22 = new float[i3][];
        while (i4 < i3) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        float f22 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z8) {
            while (i9 < 101) {
            }
        }
        float f62 = i12 / 3.0f;
        float[] fArr62 = new float[(i12 * 2) + 1];
        float f72 = 2.0f * f62 * f62;
        i5 = -i12;
        if (i5 <= i12) {
        }
        int length5 = fArr22[0].length;
        float[][] fArr72 = new float[i3][];
        while (i6 < i3) {
        }
        while (i7 < i3) {
        }
        boolean z92 = z5;
        float f92 = f22;
        int[] iArr5 = h99Var.a;
        ArrayList arrayList2 = new ArrayList(iArr5.length);
        while (r4 < r3) {
        }
        R0 = CollectionsKt.R0(arrayList2);
        fArr = h99Var.b;
        if (R0.length == fArr.length) {
        }
    }

    public final Bitmap a(Context context, Iterable iterable, int i, boolean z, int i2) {
        context.getClass();
        iterable.getClass();
        return b(this, context, iterable, i, z, i2 == 2, i2 == 1, 64);
    }
}
