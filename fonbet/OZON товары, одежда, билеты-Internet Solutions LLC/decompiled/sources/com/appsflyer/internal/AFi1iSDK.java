package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1jSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AFi1iSDK {
    public final List<AFi1jSDK> AFInAppEventParameterName = new ArrayList();
    public final AFd1mSDK AFInAppEventType;

    public AFi1iSDK(AFd1mSDK aFd1mSDK) {
        this.AFInAppEventType = aFd1mSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(Runnable runnable) {
        AFj1zSDK.AFKeystoreWrapper(this.AFInAppEventType.valueOf(), new L3.q(2, this, runnable), 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Runnable runnable) {
        try {
            if (AFInAppEventType(new AFh1wSDK())) {
                runnable.run();
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void values() {
    }

    @NonNull
    public final synchronized AFi1jSDK[] AFKeystoreWrapper() {
        return (AFi1jSDK[]) this.AFInAppEventParameterName.toArray(new AFi1jSDK[0]);
    }

    public final synchronized void valueOf(AFi1jSDK aFi1jSDK) {
        this.AFInAppEventParameterName.add(aFi1jSDK);
    }

    public final AFi1sSDK AFKeystoreWrapper(Runnable runnable) {
        return new AFi1sSDK(new s(0, this, runnable), this.AFInAppEventType.AFInAppEventParameterName(), this.AFInAppEventType.AFInAppEventType());
    }

    public final void values(final Runnable runnable) {
        valueOf(new AFi1mSDK(this.AFInAppEventType.AFInAppEventType(), this.AFInAppEventType.AFInAppEventParameterName(), AFi1kSDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                AFi1iSDK.this.valueOf(runnable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFi1sSDK aFi1sSDK, Runnable runnable) {
        AFd1tSDK values = this.AFInAppEventType.values();
        int AFInAppEventParameterName = this.AFInAppEventType.AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0);
        boolean values2 = values.values(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z11 = aFi1sSDK.f57489d == AFi1jSDK.AFa1tSDK.NOT_STARTED;
        if (AFInAppEventParameterName == 1) {
            if (z11 || values2) {
                runnable.run();
            }
        }
    }

    public final boolean valueOf() {
        return this.AFInAppEventType.AFInAppEventType().values("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf(Runnable runnable) {
        AFi1mSDK aFi1mSDK = new AFi1mSDK(this.AFInAppEventType.AFInAppEventType(), this.AFInAppEventType.AFInAppEventParameterName(), AFi1kSDK.INSTAGRAM, runnable, new r());
        valueOf(aFi1mSDK);
        aFi1mSDK.valueOf(this.AFInAppEventType.w().valueOf);
    }

    public final boolean AFInAppEventType(AFa1pSDK aFa1pSDK) {
        int AFInAppEventParameterName = this.AFInAppEventType.AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0);
        return (!this.AFInAppEventType.values().values(AppsFlyerProperties.NEW_REFERRER_SENT) && AFInAppEventParameterName == 1) || (AFInAppEventParameterName == 1 && !(aFa1pSDK instanceof AFh1wSDK));
    }

    public final Runnable AFInAppEventType(final AFi1sSDK aFi1sSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.u
            @Override // java.lang.Runnable
            public final void run() {
                AFi1iSDK.this.AFInAppEventParameterName(aFi1sSDK, runnable);
            }
        };
    }
}
