package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public class t extends c {
    boolean W;
    boolean X;
    boolean Y;
    ScheduledFuture<?> Z;
    ScheduledFuture<?> aa;
    WeakReference<Activity> ab;
    public NativeFinder.a ac;
    boolean ad;
    long ae;
    long af;
    float ag;
    String ah;
    boolean ai;

    public t(String[] strArr, String str, int i, String str2, Bundle bundle, String str3) {
        this(strArr, str, i, str2, bundle, str3, BrandSafetyUtils.AdType.NATIVE);
    }

    public t(String str, long j) {
        super(str, j, BrandSafetyUtils.AdType.NATIVE);
        this.W = false;
        this.X = false;
        this.Y = false;
        this.ac = null;
        this.ad = false;
        this.ae = 0L;
        this.af = 0L;
        this.ag = 0.0f;
        this.ah = null;
        this.ai = false;
    }

    public t(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.NATIVE);
    }

    protected t(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.W = false;
        this.X = false;
        this.Y = false;
        this.ac = null;
        this.ad = false;
        this.ae = 0L;
        this.af = 0L;
        this.ag = 0.0f;
        this.ah = null;
        this.ai = false;
        this.q = str5;
    }

    private t(String[] strArr, String str, int i, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.W = false;
        this.X = false;
        this.Y = false;
        this.ac = null;
        this.ad = false;
        this.ae = 0L;
        this.af = 0L;
        this.ag = 0.0f;
        this.ah = null;
        this.ai = false;
        this.ah = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }
}
