package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1lSDK {
    public final AFi1rSDK AFKeystoreWrapper;
    public final AFc1aSDK registerClient;
    public final CopyOnWriteArrayList<Referrer> unregisterClient = new CopyOnWriteArrayList<>();

    public AFi1lSDK(AFc1aSDK aFc1aSDK, AFi1rSDK aFi1rSDK) {
        this.registerClient = aFc1aSDK;
        this.AFKeystoreWrapper = aFi1rSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Runnable runnable) {
        try {
            new AFh1vSDK();
            boolean z = false;
            int d = this.registerClient.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0);
            if (!this.registerClient.registerClient().registerClient(AppsFlyerProperties.NEW_REFERRER_SENT) && d == 1) {
                z = true;
            }
            if (z) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.REFERRER, th.getMessage() != null ? th.getMessage() : "Error processing referrer data", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient(Context context, ReferrerProp referrerProp, AFc1aSDK aFc1aSDK) {
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (queryIntentContentProviders == null || queryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFi1kSDK(providerInfo, referrerProp, aFc1aSDK));
            } else {
                AFLogger.INSTANCE.w(LogTag.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.unregisterClient.addAll(arrayList);
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.PREINSTALL;
        StringBuilder sb = new StringBuilder("Detected ");
        sb.append(arrayList.size());
        sb.append(" valid preinstall provider(s)");
        aFLogger.d(logTag, sb.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Referrer) it2.next()).start(aFc1aSDK.valueOf().d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void unregisterClient(ReferrerProp referrerProp) {
        AFi1tSDK aFi1tSDK = new AFi1tSDK(this.registerClient.AFKeystoreWrapper(), AFi1qSDK.FACEBOOK_LITE, referrerProp, new w(0));
        this.unregisterClient.add(aFi1tSDK);
        aFi1tSDK.start(this.registerClient.valueOf().d);
    }

    public final void d(final Context context, final ReferrerProp referrerProp, final AFc1aSDK aFc1aSDK) {
        if (aFc1aSDK.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.d(LogTag.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFc1aSDK.unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1lSDK.this.registerClient(context, referrerProp, aFc1aSDK);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void unregisterClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(ReferrerProp referrerProp) {
        AFi1tSDK aFi1tSDK = new AFi1tSDK(this.registerClient.AFKeystoreWrapper(), AFi1qSDK.INSTAGRAM, referrerProp, new v(this, referrerProp, 1));
        this.unregisterClient.add(aFi1tSDK);
        aFi1tSDK.start(this.registerClient.valueOf().d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(AFi1sSDK aFi1sSDK, Runnable runnable) {
        AFc1pSDK registerClient = this.registerClient.registerClient();
        int d = this.registerClient.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0);
        boolean registerClient2 = registerClient.registerClient(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z = aFi1sSDK.getState() == Referrer.State.NOT_STARTED;
        if (d == 1) {
            if (z || registerClient2) {
                runnable.run();
            }
        }
    }

    public final void registerClient(ReferrerProp referrerProp) {
        this.unregisterClient.add(new AFi1tSDK(this.registerClient.AFKeystoreWrapper(), AFi1qSDK.FACEBOOK, referrerProp, new v(this, referrerProp, 0)));
    }

    public final AFi1sSDK registerClient(Runnable runnable) {
        ExecutorService unregisterClient = this.registerClient.unregisterClient();
        return new AFi1sSDK(new ReferrerProp(new p(2, this, unregisterClient, runnable), this.registerClient.afInfoLog(), unregisterClient));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient(ExecutorService executorService, Runnable runnable) {
        executorService.execute(new n(1, this, runnable));
    }

    public final Runnable registerClient(AFi1sSDK aFi1sSDK, Runnable runnable) {
        return new p(1, this, aFi1sSDK, runnable);
    }
}
