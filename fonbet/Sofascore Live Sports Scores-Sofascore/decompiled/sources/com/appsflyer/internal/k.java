package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFc1dSDK b;

    public /* synthetic */ k(AFc1dSDK aFc1dSDK, int i) {
        this.a = i;
        this.b = aFc1dSDK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences t_;
        ExceptionManagerConfiguration start;
        int i = this.a;
        AFc1dSDK aFc1dSDK = this.b;
        switch (i) {
            case 0:
                return aFc1dSDK.AFKeystoreWrapper();
            case 1:
                return aFc1dSDK.onPause();
            case 2:
                t_ = aFc1dSDK.t_();
                return t_;
            default:
                start = aFc1dSDK.start();
                return start;
        }
    }
}
