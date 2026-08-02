package com.vk.im.ui.views.image_zhukov;

import android.graphics.Rect;
import android.view.View;
import com.vk.im.ui.views.image_zhukov.a;
import java.util.ArrayList;
import xsna.e6y0;

/* compiled from: StrategyFor1.java */
/* loaded from: classes2.dex */
public final class b implements a {
    public static final b a = new b();

    @Override // com.vk.im.ui.views.image_zhukov.a
    public final void a(a.C1181a c1181a, a.b bVar) {
        int mode = View.MeasureSpec.getMode(c1181a.a);
        View.MeasureSpec.getSize(c1181a.a);
        View.MeasureSpec.getMode(c1181a.b);
        View.MeasureSpec.getSize(c1181a.b);
        int i = c1181a.c;
        int i2 = c1181a.d;
        ArrayList arrayList = c1181a.g;
        if (arrayList.size() != 1) {
            throw new UnsupportedOperationException("Strategy supports only 1 item layout logic");
        }
        if (mode == 0) {
            throw new UnsupportedOperationException("'UNSPECIFIED' is not supported for width measure spec");
        }
        e6y0 e6y0Var = (e6y0) arrayList.get(0);
        float f = e6y0Var.a;
        int i3 = e6y0Var.b;
        float f2 = f / i3;
        if (i2 == Integer.MAX_VALUE) {
            i2 = i3;
        }
        if (f2 > 1.0f) {
            i2 = Math.round(i / f2);
        } else {
            i = Math.round(i2 * f2);
        }
        ((Rect) bVar.b.get(0)).set(0, 0, i, i2);
        e6y0 e6y0Var2 = bVar.a;
        e6y0Var2.a = i;
        e6y0Var2.b = i2;
    }
}
