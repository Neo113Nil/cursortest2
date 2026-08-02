package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.drm0;
import xsna.e43;
import xsna.so;

/* renamed from: com.ironsource.bg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4249bg {
    public static final C4249bg a = new C4249bg();
    private static final String b = ",";
    private static final String c = "[";
    private static final String d = "]";
    private static final int e = 118;

    private C4249bg() {
    }

    public final List<Object> a(Object... objArr) {
        return e43.l(Arrays.copyOf(objArr, objArr.length));
    }

    public final String b(List<? extends Object> list) {
        String str = new String();
        for (Object obj : list) {
            str = ((Object) (((Object) str) + (obj instanceof List ? a.a((List<?>) obj) : a.a(obj)))) + ",";
        }
        return drm0.W(str, ",");
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + a.a(it.next()) + ",";
        }
        return ((Object) drm0.W(str, ",")) + "]";
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return so.a(obj, "'", "'");
        }
        return String.valueOf(obj);
    }

    public final AdInfo a(LevelPlayAdInfo levelPlayAdInfo) {
        return new AdInfo(new W8(levelPlayAdInfo), null);
    }

    public final IronSourceError a(LevelPlayAdError levelPlayAdError) {
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final ViewGroup.LayoutParams a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(Context context, int i) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : displayMetrics.density));
    }
}
