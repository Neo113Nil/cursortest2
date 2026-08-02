package com.twilio.voice;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.twilio.voice.Constants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class EventMetadata {
    String callSid;
    String eventName;
    String groupName;
    boolean isPrivate = false;
    Constants.SeverityLevel level;
    String payloadType;
    String productName;
    String timeStamp;
    long timestampMS;

    public String getCallSid() {
        return this.callSid;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Constants.SeverityLevel getLevel() {
        return this.level;
    }

    public Object getPayloadType() {
        return this.payloadType;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public long getTimestampMillis() {
        return this.timestampMS;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public JSONObject jsonEnvelopePreparation(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.eventName);
        jSONObject.put(EventKeys.EVENT_GROUP, this.groupName);
        jSONObject.put(EventKeys.TIMESTAMP, this.timeStamp);
        jSONObject.put("level", this.level);
        jSONObject.put(EventKeys.PRIVATE, this.isPrivate);
        jSONObject.put(EventKeys.PAYLOAD_TYPE, this.payloadType);
        jSONObject.put(EventKeys.PUBLISHER, this.productName);
        return jSONObject;
    }

    public JSONObject jsonPublisherMetadataPreparation(Context context) {
        PackageInfo packageInfo;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PublisherMetadata.CLIENT_ADDRESS, Utils.getIPAddress(false));
        jSONObject.put(PublisherMetadata.OS_NAME, Constants.PLATFORM_ANDROID);
        jSONObject.put(PublisherMetadata.OS_VERSION, Build.VERSION.RELEASE);
        String str = Build.MODEL;
        jSONObject.put(PublisherMetadata.DEVICE_MODEL, str);
        jSONObject.put(PublisherMetadata.DEVICE_VENDOR, Build.MANUFACTURER);
        jSONObject.put(PublisherMetadata.DEVICE_TYPE, str);
        jSONObject.put(PublisherMetadata.CPU_ARCHITECTURE, Build.CPU_ABI);
        if (context != null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            String str2 = packageInfo.versionName;
            String valueOf = String.valueOf(packageInfo.versionCode);
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                jSONObject.put(PublisherMetadata.APP_NAME, context.getString(i10));
            }
            jSONObject.put(PublisherMetadata.APP_ID, applicationInfo.packageName);
            jSONObject.put(PublisherMetadata.APP_VERSION, str2);
            jSONObject.put(PublisherMetadata.APP_BUILD_NUMBER, valueOf);
            jSONObject.put(PublisherMetadata.APP_MIN_OS_VERSION, applicationInfo.minSdkVersion);
            jSONObject.put(PublisherMetadata.APP_TARGET_OS_VERSION, applicationInfo.targetSdkVersion);
        }
        String property = System.getProperty(Constants.GLOBAL_ENV_SDK_EXPO_VERSION);
        if (property != null) {
            jSONObject.put(PublisherMetadata.EXPO_VERSION, property);
        }
        return jSONObject;
    }
}
