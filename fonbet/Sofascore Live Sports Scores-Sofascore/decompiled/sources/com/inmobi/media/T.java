package com.inmobi.media;

import android.graphics.Point;
import android.graphics.RectF;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class T extends To {
    public final /* synthetic */ U a;

    public T(U u) {
        this.a = u;
    }

    @Override // com.inmobi.media.To
    public final void a(WindowInsets windowInsets) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        windowInsets.getClass();
        F5.a.getClass();
        if (F5.u()) {
            RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
            int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
            RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(1);
            int radius2 = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(2);
            int radius3 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(3);
            int radius4 = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
            RoundedCorner roundedCorner5 = windowInsets.getRoundedCorner(0);
            RectF rectF4 = null;
            Point center = roundedCorner5 != null ? roundedCorner5.getCenter() : null;
            RoundedCorner roundedCorner6 = windowInsets.getRoundedCorner(1);
            Point center2 = roundedCorner6 != null ? roundedCorner6.getCenter() : null;
            RoundedCorner roundedCorner7 = windowInsets.getRoundedCorner(2);
            Point center3 = roundedCorner7 != null ? roundedCorner7.getCenter() : null;
            RoundedCorner roundedCorner8 = windowInsets.getRoundedCorner(3);
            Point center4 = roundedCorner8 != null ? roundedCorner8.getCenter() : null;
            if (radius <= 0 || center == null) {
                rectF = null;
            } else {
                rectF = new RectF(r9 - radius, r0 - radius, center.x, center.y);
            }
            if (radius2 <= 0 || center2 == null) {
                rectF2 = null;
            } else {
                rectF2 = new RectF(center2.x, r2 - radius, r9 + radius2, center2.y);
            }
            if (radius4 <= 0 || center4 == null) {
                rectF3 = null;
            } else {
                int i = center4.x;
                rectF3 = new RectF(i - radius4, center4.y, i, r13 + radius4);
            }
            if (radius3 > 0 && center3 != null) {
                rectF4 = new RectF(center3.x, center3.y, r13 + radius3, r3 + radius3);
            }
            this.a.g = new L(rectF, rectF2, rectF3, rectF4);
        }
    }
}
