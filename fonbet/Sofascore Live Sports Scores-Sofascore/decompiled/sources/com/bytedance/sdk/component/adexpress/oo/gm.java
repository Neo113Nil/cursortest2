package com.bytedance.sdk.component.adexpress.oo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    public static Drawable pcc(Context context, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        if (context == null || qfVar == null) {
            return null;
        }
        return pcc(context, (int) qf.pcc(context, qfVar.nac()), qfVar.dax(), qfVar.mk());
    }

    public static Drawable pcc(Context context, int i, int i2, int i3) {
        GradientDrawable b = w1l.b(1);
        if (context != null) {
            b.setStroke(i, i2);
        }
        b.setColor(i3);
        return b;
    }
}
