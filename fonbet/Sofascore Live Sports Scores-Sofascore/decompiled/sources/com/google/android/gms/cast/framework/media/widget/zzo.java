package com.google.android.gms.cast.framework.media.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.gms.cast.internal.Logger;
import defpackage.eq3;
import defpackage.o23;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzo {
    public static final Logger a = new Logger("WidgetUtil", null);

    public static Drawable a(Context context, int i, int i2) {
        return b(context, i, i2, R.attr.colorForeground, 0);
    }

    public static Drawable b(Context context, int i, int i2, int i3, int i4) {
        int color;
        ColorStateList colorStateList;
        Drawable mutate = context.getResources().getDrawable(i2).mutate();
        mutate.setTintMode(PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = eq3.q(i, context);
        } else {
            if (i3 != 0) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
                color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
            } else {
                color = context.getColor(i4);
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{color, o23.k(color, 128)});
        }
        mutate.setTintList(colorStateList);
        return mutate;
    }
}
