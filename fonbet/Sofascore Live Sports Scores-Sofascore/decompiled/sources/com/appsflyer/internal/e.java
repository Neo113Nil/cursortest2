package com.appsflyer.internal;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit AFKeystoreWrapper;
        SharedPreferences q_;
        Unit afErrorLog;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AFKeystoreWrapper = ((AFa1zSDK) obj).AFKeystoreWrapper();
                return AFKeystoreWrapper;
            case 1:
                q_ = AFc1iSDK.q_((AFc1iSDK) obj);
                return q_;
            case 2:
                return ((AFc1aSDK) obj).setOutOfStore();
            default:
                afErrorLog = ((AFf1wSDK) obj).afErrorLog();
                return afErrorLog;
        }
    }
}
