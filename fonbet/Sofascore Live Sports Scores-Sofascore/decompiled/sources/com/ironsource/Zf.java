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
import defpackage.lnb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Zf {

    @NotNull
    public static final Zf a = new Zf();

    @NotNull
    private static final String b = ",";

    @NotNull
    private static final String c = "[";

    @NotNull
    private static final String d = "]";
    private static final int e = 118;

    private Zf() {
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + a.a(it.next()) + ",";
        }
        return ((Object) StringsKt.W(str, ",")) + "]";
    }

    @NotNull
    public final String b(@NotNull List<? extends Object> list) {
        list.getClass();
        String str = new String();
        for (Object obj : list) {
            str = ((Object) (((Object) str) + (obj instanceof List ? a.a((List<?>) obj) : a.a(obj)))) + ",";
        }
        return StringsKt.W(str, ",");
    }

    @NotNull
    public final List<Object> a(@NotNull Object... objArr) {
        objArr.getClass();
        return kotlin.collections.b.j(Arrays.copyOf(objArr, objArr.length));
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return lnb.m(obj, "'", "'");
        }
        return String.valueOf(obj);
    }

    @NotNull
    public final AdInfo a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        return new AdInfo(new V8(levelPlayAdInfo), null);
    }

    @NotNull
    public final IronSourceError a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @NotNull
    public final ViewGroup.LayoutParams a(@Nullable Context context) {
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
