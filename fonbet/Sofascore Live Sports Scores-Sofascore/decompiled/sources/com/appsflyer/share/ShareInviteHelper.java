package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1zSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
        String str = AFa1zSDK.d().AFKeystoreWrapper.setImeiData().AFLoggerLogLevel;
        String string = AFa1zSDK.d().AFKeystoreWrapper.AFLogger().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        LinkGenerator addParameter = new LinkGenerator("af_app_invites").setBaseURL(str, string, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(((AFa1zSDK) appsFlyerLib).AFKeystoreWrapper.setImeiData().afDebugLog).addParameter("af_siteid", context.getPackageName());
        String string2 = AFa1zSDK.d().AFKeystoreWrapper.AFLogger().getString(AppsFlyerProperties.ONELINK_SCHEME);
        if (string2 != null && string2.length() > 3) {
            addParameter.setBaseDeeplink(string2);
        }
        return addParameter;
    }

    public static void logInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.INSTANCE.w(LogTag.ENGAGEMENT, "[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        LinkGenerator generateInviteUrl = generateInviteUrl(context);
        generateInviteUrl.addParameters(map);
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.ENGAGEMENT;
        aFLogger.d(logTag, "[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder("[Invite] Generated URL: ");
        sb.append(generateInviteUrl.generateLink());
        aFLogger.d(logTag, sb.toString());
        String mediaSource = generateInviteUrl.getMediaSource();
        if ("af_app_invites".equals(mediaSource)) {
            mediaSource = AFInAppEventType.INVITE;
        } else if ("af_user_share".equals(mediaSource)) {
            mediaSource = AFInAppEventType.SHARE;
        }
        HashMap hashMap = new HashMap();
        if (generateInviteUrl.getUserParams() != null) {
            hashMap.putAll(generateInviteUrl.getUserParams());
        }
        hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str);
        AppsFlyerLib.getInstance().logEvent(context, mediaSource, hashMap);
    }
}
