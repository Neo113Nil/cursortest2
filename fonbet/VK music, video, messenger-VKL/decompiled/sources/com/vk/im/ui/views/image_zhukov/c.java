package com.vk.im.ui.views.image_zhukov;

import android.graphics.Rect;
import android.view.View;
import com.vk.im.ui.views.image_zhukov.a;
import java.util.ArrayList;
import xsna.e6y0;
import xsna.j3r0;

/* compiled from: StrategyFor2.java */
/* loaded from: classes2.dex */
public final class c implements a {
    public static final c b = new c();
    public final float[] a = new float[2];

    @Override // com.vk.im.ui.views.image_zhukov.a
    public final void a(a.C1181a c1181a, a.b bVar) {
        float f;
        int mode = View.MeasureSpec.getMode(c1181a.a);
        int size = View.MeasureSpec.getSize(c1181a.a);
        int mode2 = View.MeasureSpec.getMode(c1181a.b);
        int size2 = View.MeasureSpec.getSize(c1181a.b);
        int i = c1181a.e;
        ArrayList arrayList = c1181a.g;
        if (arrayList.size() != 2) {
            throw new UnsupportedOperationException("Strategy supports only 2 items layout logic");
        }
        if (mode != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
            throw new UnsupportedOperationException("Only 'AT_MOST' mode is supported for both width and height");
        }
        int b2 = j3r0.b(arrayList);
        float a = j3r0.a((e6y0) arrayList.get(0));
        float a2 = j3r0.a((e6y0) arrayList.get(1));
        char c = (b2 != 1 || ((double) Math.abs(a - a2)) >= 0.2d) ? (b2 == 1 || b2 == 4) ? (char) 2 : (char) 3 : (char) 1;
        if (c == 1) {
            float f2 = size;
            float c2 = j3r0.c(f2 / a, c1181a.f, Math.min(f2 / a2, (size2 - i) / 2.0f));
            int i2 = (int) f2;
            int i3 = (int) ((2.0f * c2) + i);
            Rect rect = (Rect) bVar.b.get(0);
            rect.left = 0;
            rect.top = 0;
            rect.right = i2;
            int i4 = (int) c2;
            rect.bottom = i4;
            Rect rect2 = (Rect) bVar.b.get(1);
            rect2.left = 0;
            rect2.top = i3 - i4;
            rect2.right = i2;
            rect2.bottom = i3;
            e6y0 e6y0Var = bVar.a;
            e6y0Var.a = i2;
            e6y0Var.b = i3;
            return;
        }
        if (c == 2) {
            float f3 = (size - i) / 2;
            int i5 = (int) ((2.0f * f3) + i);
            int c3 = (int) j3r0.c(f3 / a, c1181a.f, Math.min(f3 / a2, size2));
            Rect rect3 = (Rect) bVar.b.get(0);
            rect3.left = 0;
            rect3.top = 0;
            int i6 = (int) f3;
            rect3.right = i6;
            rect3.bottom = c3;
            Rect rect4 = (Rect) bVar.b.get(1);
            rect4.left = i5 - i6;
            rect4.top = 0;
            rect4.right = i5;
            rect4.bottom = c3;
            e6y0 e6y0Var2 = bVar.a;
            e6y0Var2.a = i5;
            e6y0Var2.b = c3;
            return;
        }
        if (c == 3) {
            float f4 = size - i;
            float f5 = c1181a.f;
            float f6 = (f4 * a) / (a + a2);
            float f7 = f4 - f6;
            if (f7 < f5) {
                f5 = f4 - f5;
                f = f5;
            } else if (f6 < f5) {
                f = f4 - f5;
            } else {
                f5 = f6;
                f = f7;
            }
            float[] fArr = this.a;
            fArr[0] = f5;
            fArr[1] = f;
            float c4 = j3r0.c(Math.min(f5 / a, f / a2), c1181a.f, size2);
            int i7 = (int) (i + f5 + f);
            int i8 = (int) c4;
            Rect rect5 = (Rect) bVar.b.get(0);
            rect5.left = 0;
            rect5.top = 0;
            rect5.right = (int) f5;
            rect5.bottom = i8;
            Rect rect6 = (Rect) bVar.b.get(1);
            rect6.left = i7 - ((int) f);
            rect6.top = 0;
            rect6.right = i7;
            rect6.bottom = i8;
            e6y0 e6y0Var3 = bVar.a;
            e6y0Var3.a = i7;
            e6y0Var3.b = i8;
        }
    }
}
