package com.applovin.impl;

import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.l lVar) {
        String b = d.b(appLovinFullscreenActivity);
        String a = d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z = StringUtils.isValidString(b) && !b.equals(packageName);
        boolean z2 = StringUtils.isValidString(a) && !a.equals(packageName);
        if (z || z2) {
            Map a2 = h2.a((AppLovinAdImpl) bVar);
            a2.put("details", "activityTaskAffinityMismatch=" + z + ",baseActivityTaskAffinityMismatch=" + z2);
            lVar.E().a(f2.M0, "taskAffinityMismatch", a2);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.l lVar) {
        if (bVar == null) {
            return;
        }
        boolean a = s.a(bVar);
        boolean canDrawOverlays = Settings.canDrawOverlays(bVar.getContext());
        if (canDrawOverlays || a) {
            Map a2 = h2.a((AppLovinAdImpl) bVar.getCurrentAd());
            a2.put("details", "canDrawOverlays=" + canDrawOverlays + ",isViewOverlaid=" + a);
            lVar.E().a(f2.M0, "overlayViolation", a2);
        }
    }
}
