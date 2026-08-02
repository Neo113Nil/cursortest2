package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* loaded from: classes4.dex */
public class s extends e {
    public s(String[] strArr, String str, int i, String str2, Bundle bundle, String str3) {
        super(strArr, str, i, str2, bundle, str3, BrandSafetyUtils.AdType.MREC);
    }

    public s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.MREC);
    }

    public s(String str, long j) {
        super(str, j, BrandSafetyUtils.AdType.MREC);
    }
}
