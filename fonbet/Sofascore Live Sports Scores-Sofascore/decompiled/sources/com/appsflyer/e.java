package com.appsflyer;

import com.appsflyer.sdk_base.logger.AFLoggerBase;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFLoggerBase[] b;

    public /* synthetic */ e(AFLoggerBase[] aFLoggerBaseArr, int i) {
        this.a = i;
        this.b = aFLoggerBaseArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AFLoggerBase[] aFLoggerBaseArr = this.b;
        switch (i) {
            case 0:
                AFLogger.d(aFLoggerBaseArr);
                break;
            default:
                AFLogger.AFKeystoreWrapper(aFLoggerBaseArr);
                break;
        }
    }
}
