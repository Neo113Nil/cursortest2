package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l extends RelativeLayout {
    public final float a;

    public l(Context context, float f) {
        super(context);
        this.a = f;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        View.MeasureSpec.getMode(i);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 0 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > 0)) {
            int size = View.MeasureSpec.getSize(i);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            float f = this.a;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (size * f), 1073741824);
            }
            i3 = makeMeasureSpec;
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        }
        super.onMeasure(i3, i2);
    }
}
