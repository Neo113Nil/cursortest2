package com.vk.push.core.remote.config.omicron.fingerprint;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Map;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* loaded from: classes.dex */
public class AppFingerprint implements OmicronFingerprint {
    public final Context a;

    public AppFingerprint(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint
    public void collect(Map<String, Object> map) {
        Context context = this.a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            map.put("app_id", context.getPackageName());
            map.put("app_build", Integer.valueOf(packageInfo.versionCode));
            map.put(CallAnalyticsApiRequest.KEY_APP_VERSION, "7.4.0-rc01");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
