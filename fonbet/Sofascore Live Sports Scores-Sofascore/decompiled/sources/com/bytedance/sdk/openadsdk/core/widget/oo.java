package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.utils.rj;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static Drawable pcc() {
        GradientDrawable b = w1l.b(1);
        b.setStroke(rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), 1.0f), Color.parseColor("#33FFFFFF"));
        b.setColor(Color.parseColor("#99333333"));
        return b;
    }

    public static Drawable sf() {
        GradientDrawable b = w1l.b(0);
        b.setCornerRadius(rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), 44.0f));
        b.setStroke(rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), 1.0f), Color.parseColor("#33FFFFFF"));
        b.setColor(Color.parseColor("#99333333"));
        return b;
    }
}
