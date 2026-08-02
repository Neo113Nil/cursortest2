package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.օ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0440 extends AbstractC0430 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public Context f1250;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0430
    /* renamed from: ﻛ */
    public final boolean mo263() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f1250.getSystemService(StringFog.decrypt("TFtl1/sctFQ=\n", "LTgRvo11wC0=\n"))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = this.f1250.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0430
    /* renamed from: ﾒ */
    public final synchronized void mo266(Application application, Activity activity) {
        try {
            if (application != null) {
                this.f1250 = application.getApplicationContext();
            } else if (activity != null) {
                this.f1250 = activity.getApplicationContext();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0430
    /* renamed from: ﾒ */
    public final Activity mo265() {
        return null;
    }
}
