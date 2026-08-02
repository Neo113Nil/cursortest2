package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.FirebaseMessagingServiceListener;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1fSDK {
    public final AFc1pSDK AFKeystoreWrapper = AFa1zSDK.d().AFKeystoreWrapper.registerClient();
    private final AppsFlyerProperties AFLogger = AFa1zSDK.d().AFKeystoreWrapper.AFLogger();

    public static boolean registerClient(Context context) {
        if (!AppsFlyerLib.getInstance().isStopped()) {
            try {
                String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
                if (context.getPackageManager().queryIntentServices(new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class), 0).size() > 0) {
                    return true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(LogTag.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
            }
        }
        return false;
    }

    @Nullable
    public final AFf1eSDK AFLogger() {
        String string;
        String string2;
        String d = this.AFKeystoreWrapper.d("afUninstallToken");
        long AFKeystoreWrapper = this.AFKeystoreWrapper.AFKeystoreWrapper("afUninstallToken_received_time", 0L);
        boolean registerClient = this.AFKeystoreWrapper.registerClient("afUninstallToken_queued");
        this.AFKeystoreWrapper.unregisterClient("afUninstallToken_queued", false);
        if (d == null && (string2 = this.AFLogger.getString("afUninstallToken")) != null) {
            d = string2.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)[r0.length - 1];
        }
        if (AFKeystoreWrapper == 0 && (string = this.AFLogger.getString("afUninstallToken")) != null) {
            String[] split = string.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            if (split.length >= 2) {
                try {
                    AFKeystoreWrapper = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (d != null) {
            return new AFf1eSDK(d, AFKeystoreWrapper, registerClient);
        }
        return null;
    }
}
