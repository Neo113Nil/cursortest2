package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AspectRatioMeasure.java */
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: AspectRatioMeasure.java */
    /* renamed from: com.facebook.drawee.view.a$a, reason: collision with other inner class name */
    public static class C0107a {
        public int a;
        public int b;
    }

    public static void a(C0107a c0107a, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || layoutParams == null) {
            return;
        }
        int i3 = layoutParams.height;
        if (i3 == 0 || i3 == -2) {
            c0107a.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0107a.a) - i) / f) + i2), c0107a.b), 1073741824);
            return;
        }
        int i4 = layoutParams.width;
        if (i4 == 0 || i4 == -2) {
            c0107a.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0107a.b) - i2) * f) + i), c0107a.a), 1073741824);
        }
    }
}
