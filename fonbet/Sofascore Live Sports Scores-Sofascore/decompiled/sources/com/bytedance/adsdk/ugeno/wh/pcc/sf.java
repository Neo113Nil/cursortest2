package com.bytedance.adsdk.ugeno.wh.pcc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends pcc {
    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.wh.pcc.pcc
    public Drawable sf(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
