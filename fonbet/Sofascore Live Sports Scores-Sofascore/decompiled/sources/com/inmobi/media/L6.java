package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class L6 {
    public static final void a(ProgressBar progressBar, Wg wg, float f) {
        progressBar.getClass();
        wg.getClass();
        progressBar.setProgressTintList(ColorStateList.valueOf(H3.a(wg.c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(H3.a(wg.d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (wg.e * f));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
