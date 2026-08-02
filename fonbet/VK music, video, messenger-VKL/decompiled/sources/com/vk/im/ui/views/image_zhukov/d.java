package com.vk.im.ui.views.image_zhukov;

import android.graphics.Rect;
import android.view.View;
import com.vk.im.ui.views.image_zhukov.a;
import java.util.ArrayList;
import xsna.e6y0;
import xsna.j3r0;

/* compiled from: StrategyFor3.java */
/* loaded from: classes2.dex */
public final class d implements a {
    public static final d b = new d();
    public final float[] a = new float[2];

    @Override // com.vk.im.ui.views.image_zhukov.a
    public final void a(a.C1181a c1181a, a.b bVar) {
        int i;
        float f;
        float f2;
        char c;
        float f3;
        float f4;
        int mode = View.MeasureSpec.getMode(c1181a.a);
        int size = View.MeasureSpec.getSize(c1181a.a);
        int mode2 = View.MeasureSpec.getMode(c1181a.b);
        int size2 = View.MeasureSpec.getSize(c1181a.b);
        int i2 = c1181a.e;
        ArrayList arrayList = c1181a.g;
        if (arrayList.size() != 3) {
            throw new UnsupportedOperationException("Strategy supports only 3 items layout logic");
        }
        if (mode != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
            throw new UnsupportedOperationException("Only 'AT_MOST' mode is supported for both width and height");
        }
        int b2 = j3r0.b(arrayList);
        float a = j3r0.a((e6y0) arrayList.get(0));
        float a2 = j3r0.a((e6y0) arrayList.get(1));
        float a3 = j3r0.a((e6y0) arrayList.get(2));
        boolean z = (b2 == 1) | ((a > 1.7f ? 1 : (a == 1.7f ? 0 : -1)) > 0) ? true : 2;
        float[] fArr = this.a;
        if (z) {
            f2 = 0.618f;
            int c2 = (int) j3r0.c(size / a, c1181a.f, (size2 - i2) * 0.618f);
            int i3 = size - i2;
            float f5 = i3;
            float f6 = c1181a.f;
            float f7 = (f5 * a2) / (a2 + a3);
            float f8 = f5 - f7;
            if (f8 < f6) {
                float f9 = f5 - f6;
                f4 = f6;
                f6 = f9;
            } else if (f7 < f6) {
                f4 = f5 - f6;
            } else {
                f6 = f7;
                f4 = f8;
            }
            fArr[0] = f6;
            fArr[1] = f4;
            int i4 = (int) f6;
            i = i2;
            int c3 = (int) j3r0.c(Math.min(i4 / a2, ((int) f4) / a3), c1181a.f, (size2 - c2) - i);
            int i5 = c2 + i + c3;
            ArrayList arrayList2 = bVar.b;
            f = a3;
            Rect rect = (Rect) arrayList2.get(0);
            rect.left = 0;
            rect.top = 0;
            rect.right = size;
            rect.bottom = c2;
            Rect rect2 = (Rect) arrayList2.get(1);
            rect2.left = 0;
            int i6 = i5 - c3;
            rect2.top = i6;
            rect2.right = i4;
            int i7 = i6 + c3;
            rect2.bottom = i7;
            int i8 = i3 - i4;
            Rect rect3 = (Rect) arrayList2.get(2);
            int i9 = size - i8;
            rect3.left = i9;
            rect3.top = i6;
            rect3.right = i9 + i8;
            rect3.bottom = i7;
            e6y0 e6y0Var = bVar.a;
            e6y0Var.a = size;
            e6y0Var.b = i5;
            c = 2;
        } else {
            i = i2;
            f = a3;
            f2 = 0.618f;
            c = 2;
        }
        if (z == c) {
            int c4 = (int) j3r0.c(size2 * a, c1181a.f, (size - i) * f2);
            float f10 = size2 - i;
            float f11 = c1181a.f;
            float f12 = (f10 / a2) / ((1.0f / f) + (1.0f / a2));
            float f13 = f10 - f12;
            if (f13 < f11) {
                f11 = f10 - f11;
                f3 = f11;
            } else if (f12 < f11) {
                f3 = f10 - f11;
            } else {
                f11 = f12;
                f3 = f13;
            }
            fArr[0] = f11;
            fArr[1] = f3;
            int c5 = (int) j3r0.c(Math.max(f3 * f, a2 * f11), c1181a.f, (size - c4) - i);
            int i10 = c4 + i + c5;
            ArrayList arrayList3 = bVar.b;
            Rect rect4 = (Rect) arrayList3.get(0);
            rect4.left = 0;
            rect4.top = 0;
            rect4.right = c4;
            rect4.bottom = size2;
            int i11 = (int) f11;
            Rect rect5 = (Rect) arrayList3.get(1);
            int i12 = i10 - c5;
            rect5.left = i12;
            rect5.top = 0;
            int i13 = c5 + i12;
            rect5.right = i13;
            rect5.bottom = i11;
            int i14 = (int) f3;
            Rect rect6 = (Rect) arrayList3.get(2);
            rect6.left = i12;
            int i15 = size2 - i14;
            rect6.top = i15;
            rect6.right = i13;
            rect6.bottom = i15 + i14;
            e6y0 e6y0Var2 = bVar.a;
            e6y0Var2.a = i10;
            e6y0Var2.b = size2;
        }
    }
}
