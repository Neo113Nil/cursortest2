package com.vk.im.ui.views.image_zhukov;

import android.graphics.Rect;
import android.view.View;
import com.vk.im.ui.views.image_zhukov.a;
import java.util.ArrayList;
import xsna.e6y0;
import xsna.j3r0;
import xsna.lr;

/* compiled from: StrategyFor4.java */
/* loaded from: classes2.dex */
public final class e implements a {
    public static final e a = new e();

    @Override // com.vk.im.ui.views.image_zhukov.a
    public final void a(a.C1181a c1181a, a.b bVar) {
        int i;
        float f;
        char c;
        int mode = View.MeasureSpec.getMode(c1181a.a);
        int size = View.MeasureSpec.getSize(c1181a.a);
        int mode2 = View.MeasureSpec.getMode(c1181a.b);
        int size2 = View.MeasureSpec.getSize(c1181a.b);
        int i2 = c1181a.e;
        ArrayList arrayList = c1181a.g;
        if (arrayList.size() != 4) {
            throw new UnsupportedOperationException("Strategy supports only 4 items layout logic");
        }
        if (mode != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
            throw new UnsupportedOperationException("Only 'AT_MOST' mode is supported for both width and height");
        }
        int b = j3r0.b(arrayList);
        float a2 = j3r0.a((e6y0) arrayList.get(0));
        float a3 = j3r0.a((e6y0) arrayList.get(1));
        float a4 = j3r0.a((e6y0) arrayList.get(2));
        float a5 = j3r0.a((e6y0) arrayList.get(3));
        boolean z = (b == 1) | ((a2 > 1.7f ? 1 : (a2 == 1.7f ? 0 : -1)) > 0) ? true : 2;
        if (z) {
            f = 0.618f;
            int c2 = (int) j3r0.c(size / a2, c1181a.f, (size2 - i2) * 0.618f);
            int i3 = i2 * 2;
            int i4 = size - i3;
            int c3 = (int) j3r0.c(i4 / ((a3 + a4) + a5), c1181a.f, (size2 - c2) - i2);
            float f2 = c3;
            int max = (int) Math.max(c1181a.f, f2 * a3);
            i = i2;
            int max2 = (int) Math.max(c1181a.f, f2 * a4);
            int max3 = (int) Math.max(c1181a.f, f2 * a5);
            if (lr.a(max, max2, max3, i3) > size) {
                max = i4 / 3;
                max3 = max;
            }
            int i5 = c2 + i + c3;
            ArrayList arrayList2 = bVar.b;
            Rect rect = (Rect) arrayList2.get(0);
            rect.left = 0;
            rect.top = 0;
            rect.right = size;
            rect.bottom = c2;
            Rect rect2 = (Rect) arrayList2.get(1);
            rect2.left = 0;
            int i6 = i5 - c3;
            rect2.top = i6;
            rect2.right = max;
            int i7 = i6 + c3;
            rect2.bottom = i7;
            Rect rect3 = (Rect) arrayList2.get(3);
            int i8 = size - max3;
            rect3.left = i8;
            rect3.top = i6;
            rect3.right = i8 + max3;
            rect3.bottom = i7;
            Rect rect4 = (Rect) arrayList2.get(2);
            rect4.left = ((Rect) arrayList2.get(1)).right + i;
            rect4.top = i6;
            rect4.right = ((Rect) arrayList2.get(3)).left - i;
            rect4.bottom = rect4.top + c3;
            e6y0 e6y0Var = bVar.a;
            e6y0Var.a = size;
            e6y0Var.b = i5;
            c = 2;
        } else {
            i = i2;
            f = 0.618f;
            c = 2;
        }
        if (z == c) {
            int c4 = (int) j3r0.c(size2 * a2, c1181a.f, (size - i) * f);
            int i9 = i * 2;
            int i10 = size2 - i9;
            int c5 = (int) j3r0.c(i10 / ((1.0f / a5) + ((1.0f / a4) + (1.0f / a3))), c1181a.f, (size - c4) - i);
            float f3 = c5;
            int max4 = (int) Math.max(c1181a.f, f3 / a3);
            int max5 = (int) Math.max(c1181a.f, f3 / a4);
            int max6 = (int) Math.max(c1181a.f, f3 / a5);
            if (((max5 + max4) + max6) - i9 > size2) {
                max4 = i10 / 3;
                max6 = max4;
            }
            int i11 = c4 + i + c5;
            ArrayList arrayList3 = bVar.b;
            Rect rect5 = (Rect) arrayList3.get(0);
            rect5.left = 0;
            rect5.top = 0;
            rect5.right = c4;
            rect5.bottom = size2;
            Rect rect6 = (Rect) arrayList3.get(1);
            int i12 = i11 - c5;
            rect6.left = i12;
            rect6.top = 0;
            int i13 = i12 + c5;
            rect6.right = i13;
            rect6.bottom = max4;
            Rect rect7 = (Rect) arrayList3.get(3);
            rect7.left = i12;
            int i14 = size2 - max6;
            rect7.top = i14;
            rect7.right = i13;
            rect7.bottom = i14 + max6;
            Rect rect8 = (Rect) arrayList3.get(2);
            rect8.left = i12;
            rect8.top = ((Rect) arrayList3.get(1)).bottom + i;
            rect8.right = rect8.left + c5;
            rect8.bottom = ((Rect) arrayList3.get(3)).top - i;
            e6y0 e6y0Var2 = bVar.a;
            e6y0Var2.a = i11;
            e6y0Var2.b = size2;
        }
    }
}
