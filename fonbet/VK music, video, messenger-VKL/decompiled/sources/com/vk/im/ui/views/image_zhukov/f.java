package com.vk.im.ui.views.image_zhukov;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.image_zhukov.a;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import xsna.e6y0;
import xsna.ir;
import xsna.j3r0;
import xsna.tvb0;
import xsna.uq;
import xsna.yny;

/* compiled from: StrategyFor5_10.java */
/* loaded from: classes2.dex */
public final class f implements a {
    public static final f h = new f();
    public final float[] a = new float[10];
    public final ArrayList b = new ArrayList();
    public final tvb0 c = new tvb0(30);
    public int d;
    public int e;
    public int f;
    public int g;

    @Override // com.vk.im.ui.views.image_zhukov.a
    public final void a(a.C1181a c1181a, a.b bVar) {
        float f;
        int i;
        float f2;
        int i2;
        int mode = View.MeasureSpec.getMode(c1181a.a);
        int mode2 = View.MeasureSpec.getMode(c1181a.b);
        ArrayList arrayList = c1181a.g;
        int size = arrayList.size();
        if (size < 5 || size > 10) {
            throw new UnsupportedOperationException("Strategy supports only [5,10] items layout logic");
        }
        if (mode != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
            throw new UnsupportedOperationException("Only 'AT_MOST' mode is supported for both width and height");
        }
        float[] fArr = this.a;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList2 = this.b;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.c.a((yny) it.next());
        }
        arrayList2.clear();
        this.e = Math.min(View.MeasureSpec.getSize(c1181a.a), c1181a.c);
        this.f = Math.min(View.MeasureSpec.getSize(c1181a.b), c1181a.d);
        int i3 = c1181a.e;
        this.g = i3;
        float f4 = this.e - (i3 * 3);
        int i4 = c1181a.f;
        float f5 = i4;
        float f6 = f4 / f5;
        if (f6 <= 4.0f) {
            i4 = (int) ((f6 / 4.0f) * f5);
        }
        this.d = i4;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            fArr[i6] = j3r0.c(j3r0.a((e6y0) arrayList.get(i6)), 0.25f, 4.0f);
        }
        int size2 = arrayList.size();
        int i7 = this.e / this.d;
        int i8 = 1;
        for (int i9 = 1; i9 <= size2 - 1; i9++) {
            int i10 = size2 - i9;
            if (i9 <= i7 && i10 <= i7) {
                arrayList2.add(b(i9, i10));
            }
            for (int i11 = 1; i11 <= i10 - 1; i11++) {
                int i12 = i10 - i11;
                if (i9 <= i7 && i11 <= i7 && i12 <= i7) {
                    arrayList2.add(b(i9, i11, i12));
                }
                for (int i13 = 1; i13 <= ((size2 - i11) - i9) - 1; i13++) {
                    int i14 = i12 - i13;
                    if (i9 <= i7 && i11 <= i7 && i13 <= i7 && i14 <= i7) {
                        arrayList2.add(b(i9, i11, i13, i14));
                    }
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        float f7 = Float.MAX_VALUE;
        yny ynyVar = null;
        while (true) {
            if (!it2.hasNext()) {
                f = f3;
                i = i8;
                f2 = 0.618f;
                break;
            }
            yny ynyVar2 = (yny) it2.next();
            float a = ynyVar2.a() + ((ynyVar2.d - i8) * this.g);
            int i15 = this.f;
            int i16 = this.d;
            int i17 = this.e;
            f = f3;
            int[] iArr = ynyVar2.a;
            float f8 = i15;
            float abs = (a < f8 * 0.618f || a > f8) ? Math.abs(f8 - a) : f;
            i = i8;
            f2 = 0.618f;
            float f9 = f;
            for (int i18 = 0; i18 < ynyVar2.d; i18++) {
                f9 += Math.max(0, (iArr[i18] * i16) - i17);
            }
            float f10 = f9 * 2.0f;
            if (a > f8) {
                abs *= 3.0f;
            }
            int i19 = 0;
            float f11 = f;
            while (true) {
                i2 = ynyVar2.d;
                if (i19 >= i2 - 1) {
                    break;
                }
                int i20 = iArr[i19];
                i19++;
                f11 += Math.abs(Math.abs(i20 - iArr[i19]) - 1);
            }
            float f12 = f11 * 0.15f * f8;
            if (i2 != 2 ? !(i2 != 3 || iArr[i] <= iArr[2]) : iArr[0] > iArr[i]) {
                f12 *= 1.1f;
            }
            float f13 = abs + f10 + f12;
            if (ynyVar == null || f13 < f7) {
                ynyVar = ynyVar2;
                if (f13 == f) {
                    break;
                } else {
                    f7 = f13;
                }
            }
            f3 = f;
            i8 = i;
        }
        if (ynyVar == null) {
            e6y0 e6y0Var = bVar.a;
            e6y0Var.a = 0;
            e6y0Var.b = 0;
            return;
        }
        int[] iArr2 = ynyVar.a;
        float[][] fArr2 = ynyVar.c;
        float[] fArr3 = ynyVar.b;
        float a2 = ynyVar.a();
        float f14 = this.f;
        if (a2 > f14 || a2 < f14 * f2) {
            int i21 = this.g;
            int i22 = ynyVar.d;
            float f15 = (r9 - (this.d * i22)) - ((i22 - 1) * i21);
            for (int i23 = 0; i23 < ynyVar.d; i23++) {
                fArr3[i23] = n0.b(fArr3[i23], a2, f15, this.d);
            }
        }
        int i24 = 0;
        while (i24 < ynyVar.d) {
            int i25 = iArr2[i24];
            float f16 = fArr3[i24];
            int i26 = i5;
            int i27 = i26;
            while (i26 < i24 && i26 < ynyVar.d) {
                i27 += iArr2[i26];
                i26++;
            }
            for (int i28 = i5; i28 < i25; i28++) {
                fArr2[i24][i28] = (int) j3r0.c(Math.round(fArr[i27] * f16), this.d, this.e);
                i27++;
            }
            int i29 = iArr2[i24];
            float[] fArr4 = fArr2[i24];
            int i30 = (i29 - 1) * this.g;
            int i31 = i5;
            int i32 = i31;
            while (i31 < i24 && i31 < ynyVar.d) {
                i32 += iArr2[i31];
                i31++;
            }
            int i33 = i5;
            int i34 = i33;
            while (i33 < iArr2[i24]) {
                i34 = (int) (i34 + fArr2[i24][i33]);
                i33++;
            }
            if (i34 != this.e - i30) {
                float f17 = f;
                for (int i35 = i5; i35 < i29; i35++) {
                    f17 += fArr[i32 + i35];
                }
                float f18 = (this.e - (this.d * i29)) - i30;
                for (int i36 = i5; i36 < i29; i36++) {
                    fArr4[i36] = uq.a(f18, fArr[i32 + i36], f17, this.d);
                }
            }
            i24++;
            i5 = 0;
        }
        int i37 = this.g;
        e6y0 e6y0Var2 = bVar.a;
        ArrayList arrayList3 = bVar.b;
        e6y0Var2.a = this.e;
        e6y0Var2.b = ir.b(ynyVar.d, i, i37, ynyVar.a());
        int i38 = 0;
        int i39 = 0;
        for (int i40 = 0; i40 < ynyVar.d; i40++) {
            for (int i41 = 0; i41 < iArr2[i40]; i41++) {
                Rect rect = (Rect) arrayList3.get(i39);
                if (i41 == 0) {
                    rect.left = 0;
                } else {
                    rect.left = ((Rect) arrayList3.get(i39 - 1)).right + i37;
                }
                rect.top = i38;
                rect.right = (int) Math.min(e6y0Var2.a, rect.left + fArr2[i40][i41]);
                rect.bottom = (int) Math.min(e6y0Var2.b, rect.top + fArr3[i40]);
                i39++;
            }
            i38 = ((Rect) arrayList3.get(i39 - 1)).bottom + i37;
        }
    }

    public final yny b(int... iArr) {
        yny ynyVar = (yny) this.c.c();
        if (ynyVar == null) {
            ynyVar = new yny();
        }
        int[] iArr2 = ynyVar.a;
        ynyVar.d = 0;
        Arrays.fill(iArr2, 0);
        ynyVar.d = iArr.length;
        int i = 0;
        for (int i2 = 0; i2 < ynyVar.d; i2++) {
            iArr2[i2] = iArr[i2];
            float[] fArr = ynyVar.b;
            int i3 = iArr[i2] + i;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i4 = i; i4 < i3; i4++) {
                f += this.a[i4];
            }
            fArr[i2] = Math.max(this.d, (this.e - (((i3 - i) - 1) * this.g)) / f);
            i += iArr[i2];
        }
        return ynyVar;
    }
}
