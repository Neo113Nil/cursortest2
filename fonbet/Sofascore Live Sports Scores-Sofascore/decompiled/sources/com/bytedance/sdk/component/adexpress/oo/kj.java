package com.bytedance.sdk.component.adexpress.oo;

import android.graphics.drawable.GradientDrawable;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    public static GradientDrawable pcc(int i, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable b = w1l.b(i);
        if (num != null) {
            b.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            b.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            b.setCornerRadii(new float[]{i2, i2, i3, i3, i4, i4, i5, i5});
        }
        if (iArr2 != null && iArr2.length == 2) {
            b.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            b.setStroke(num2.intValue(), num3.intValue());
        }
        return b;
    }
}
