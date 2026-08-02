package com.safedk.android.analytics;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class AppLovinBridge {
    private static final String A = "private";
    private static final String B = "ad_review_creative_id";
    private static Context S = null;
    public static final String a = "SafeDK";
    public static final String b = "v1/events";
    public static final String c = "v1/image_uploaded";
    public static final String d = "v1/resolved";
    public static final String e = "v1/file_uploaded";
    public static final String f = "v1/vf_uploaded";
    public static final String g = "platform";
    public static final String h = "package";
    public static final String i = "android";
    public static final String j = "body";
    private static final String l = "AppLovinBridge";
    private static final String m = "max_ad_events";
    private static final String n = "safedk_init";
    private static final String o = "user_info";
    private static final String p = "send_http_request";
    private static final String q = "receive_http_response";
    private static final String r = "safedk_ad_info";
    private static final String s = "max_revenue_events";
    private static final String t = "url";
    private static final String u = "backup_url";
    private static final String v = "post_body";
    private static final String w = "report";
    private static final String x = "metadata";
    private static final String y = "events";
    private static final String z = "public";
    private static String C = "https://edge.safedk.com/v1/events";
    private static String D = "https://edge.safedk.com/v1/events";
    private static String E = "https://edge.safedk.com/v1/image_uploaded";
    private static String F = "https://edge.safedk.com/v1/image_uploaded";
    private static String G = "https://edge.safedk.com/v1/vf_uploaded";
    private static String H = "https://edge.safedk.com/v1/vf_uploaded";
    private static String I = "https://edge.safedk.com/v1/resolved";
    private static String J = "https://edge.safedk.com/v1/resolved";
    private static String K = "https://edge.safedk.com/v1/file_uploaded";
    private static String L = "https://edge.safedk.com/v1/file_uploaded";
    private static final String[] M = {"platform"};
    private static final String[] N = {"sdk_uuid", "impression_id", "ad_format_type", "timestamp"};
    private static final String[] O = {"fingerprint"};
    private static final String[] P = {"file"};
    private static final String[] Q = {FileUploadManager.b};
    private static final HashMap<String, ArrayList<b>> R = new HashMap<>();
    private static AppLovinCommunicator T = null;
    static AppLovinCommunicatorSubscriber k = new AppLovinCommunicatorSubscriber() { // from class: com.safedk.android.analytics.AppLovinBridge.1
        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Logger.d(AppLovinBridge.l, "Response received ", message.getMessageData(), ", topic=", message.getTopic(), ", url=", message.getMessageData().getString("url"));
            Bundle messageData = message.getMessageData();
            String string = message.getMessageData().getString("url");
            if (string.endsWith(AppLovinBridge.b)) {
                AppLovinBridge.b(AppLovinBridge.b, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.c)) {
                AppLovinBridge.b(AppLovinBridge.c, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.d)) {
                AppLovinBridge.b(AppLovinBridge.d, messageData.getBundle("body"));
            }
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return AppLovinBridge.a;
        }
    };

    public static void init(Context context) {
        S = context;
        registerToReceiveResponse(k);
    }

    public static void receiveEdgeUrls(String url, String backupUrl) {
        Logger.d(l, "receive edge urls, url=", url, ", backupUrl=", backupUrl);
        if (!TextUtils.isEmpty(url)) {
            String str = url + "/" + b;
            C = str;
            Logger.d(l, "receive edge urls, BrandSafetyReportUrl updated to ", str);
            String str2 = url + "/" + c;
            E = str2;
            Logger.d(l, "receive edge urls, ImageUploadedUrl updated to ", str2);
            String str3 = url + "/" + d;
            I = str3;
            Logger.d(l, "receive edge urls, ResolvedUrl updated to ", str3);
            String str4 = url + "/" + e;
            K = str4;
            Logger.d(l, "receive edge urls, FileUploadedUrl updated to ", str4);
            String str5 = url + "/" + f;
            G = str5;
            Logger.d(l, "receive edge urls, VideoFrameUploadedUrl updated to ", str5);
        }
        if (!TextUtils.isEmpty(backupUrl)) {
            String str6 = backupUrl + "/" + b;
            D = str6;
            Logger.d(l, "Backup BrandSafetyReportUrl updated to ", str6);
            String str7 = backupUrl + "/" + c;
            F = str7;
            Logger.d(l, "Backup ImageUploadedUrl updated to ", str7);
            String str8 = backupUrl + "/" + d;
            J = str8;
            Logger.d(l, "Backup ResolvedUrl updated to ", str8);
            String str9 = backupUrl + "/" + e;
            L = str9;
            Logger.d(l, "Backup FileUploadUrl updated to ", str9);
            String str10 = backupUrl + "/" + f;
            H = str10;
            Logger.d(l, "Backup VideoFrameUploadedUrl updated to ", str10);
        }
    }

    public static AppLovinCommunicator getApplovinCommunicator() {
        AppLovinCommunicator appLovinCommunicator = T;
        if (appLovinCommunicator != null) {
            return appLovinCommunicator;
        }
        Object obj = null;
        try {
            Logger.d(l, "get communicator: current applovin sdk is: ", AppLovinSdk.VERSION);
            Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicator");
            try {
                T = (AppLovinCommunicator) cls.getMethod(Constants.GET_INSTANCE, Context.class).invoke(null, S);
                obj = "Context";
            } catch (Throwable th) {
                T = (AppLovinCommunicator) cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                obj = "empty";
            }
        } catch (Throwable th2) {
            Logger.d(l, "Failed to initialize AppLovinCommunicator", th2);
        }
        Logger.d(l, "get communicator: returned: ", T, " with overload: ", obj);
        return T;
    }

    static void a(ArrayList<Bundle> arrayList, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        Logger.printFullVerboseLog(l, "report stats events start ", Integer.valueOf(arrayList.size()), " events. edgeUrl=", C, ", events : ", arrayList);
        Bundle bundle = new Bundle();
        bundle.putString("url", C);
        bundle.putString(u, D);
        Bundle bundle2 = new Bundle();
        Bundle c2 = SafeDK.getInstance().x().c();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Iterator<Bundle> it = arrayList.iterator();
        while (it.hasNext()) {
            Bundle next = it.next();
            if (("impression".equals(next.getString(StatsEvent.z)) && a(next, N, "stats event")) || !a(next)) {
                Logger.d(l, "report stats events, skipping event with missing fields.");
            } else {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty() || a(c2, M, "metadata")) {
            Logger.d(l, "report stats events not completed. there are missing fields.");
            return;
        }
        bundle2.putBundle("metadata", c2);
        bundle2.putParcelableArrayList("events", arrayList2);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("report", bundle2);
        bundle.putBundle(v, bundle3);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, p, appLovinCommunicatorPublisher);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(l, "could not get communicator");
        } else {
            Logger.d(l, "publishing message with ", Integer.valueOf(arrayList.size()), " events");
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static Bundle initHttpRequestBundle(String httpRequestUrl, String httpRequestBackupUrl, Bundle data) {
        Bundle bundle = new Bundle();
        bundle.putString("url", httpRequestUrl);
        bundle.putString(u, httpRequestBackupUrl);
        bundle.putBundle(v, data);
        return bundle;
    }

    public static void reportImageUploadEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(l, "report image upload event start. Data=", data);
        Bundle c2 = SafeDK.getInstance().x().c();
        data.putBundle("metadata", c2);
        if (a(data, O, "image uploaded") || a(c2, M, "metadata")) {
            Logger.d(l, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(initHttpRequestBundle(E, F, data), p, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(l, "could not get communicator");
        } else {
            Logger.d(l, "publishing message. body=", data);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static void reportVideoFrameUploadEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(l, "report video frame upload event - start. Data=", data);
        data.putBundle("metadata", SafeDK.getInstance().x().c());
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(initHttpRequestBundle(G, H, data), p, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(l, "report video frame upload event - could not get communicator");
        } else {
            Logger.d(l, "report video frame upload event - publishing message. body=", data);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static void reportFileUploadEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(l, "report File upload event start. Data=", data);
        data.putString("sdk_key", SafeDK.getInstance().x().a());
        Bundle c2 = SafeDK.getInstance().x().c();
        data.putBundle("metadata", c2);
        if (a(data, P, "file uploaded") || a(c2, M, "metadata")) {
            Logger.d(l, "report File upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(initHttpRequestBundle(K, L, data), p, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(l, "could not get communicator");
        } else {
            Logger.d(l, "publishing message. body=", data);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static void reportClickUrlResolvedEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(l, "report click url resolved event start");
        Bundle c2 = SafeDK.getInstance().x().c();
        data.putBundle("metadata", c2);
        if (a(data, Q, "resolved") || a(c2, M, "metadata")) {
            Logger.d(l, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(initHttpRequestBundle(I, J, data), p, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(l, "could not get communicator");
        } else {
            Logger.d(l, "publishing message. body=", data);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static void reportMaxCreativeId(Bundle appLovinMaxBundle, String creativeId, AppLovinCommunicatorPublisher callback) {
        Logger.d(l, "report max creative ID start, creative ID=", creativeId, ", appLovin max bundle=", appLovinMaxBundle.toString());
        Bundle bundle = new Bundle();
        bundle.putString(B, creativeId);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("public", bundle);
        bundle2.putBundle("private", appLovinMaxBundle);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle2, r, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(l, "could not get communicator");
        } else {
            Logger.d(l, "report max creative ID, publishing message. body=", bundle2);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    private static boolean a(Bundle bundle) {
        return SdksMapping.getSdkPackageByPackageUUID(bundle.getString("sdk_uuid")) != null;
    }

    private static boolean a(Bundle bundle, String[] strArr, String str) {
        if (strArr != null) {
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                if (!bundle.containsKey(str2)) {
                    hashSet.add(str2);
                } else {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && TextUtils.isEmpty((String) obj)) {
                        hashSet.add(str2);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                Logger.d(l, "missing fields in ", str, " data: ", hashSet);
                return true;
            }
        }
        return false;
    }

    public static void registerToReceiveMaxEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, m);
    }

    public static void registerToReceiveResponse(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, q);
    }

    public static void registerToReceiveSafeDKSettings(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, n);
    }

    public static void registerToReceiveMaxRevenueEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, "max_revenue_events");
    }

    public static void registerToReceiveUserInfo(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, o);
    }

    private static void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (getApplovinCommunicator() != null) {
            getApplovinCommunicator().subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
        } else {
            Logger.d(l, "could not register - communicator is null");
        }
    }

    public static void registerListener(String requestName, b listener) {
        try {
            Logger.d(l, "register listener started, request name=", requestName);
            if (!R.containsKey(requestName)) {
                Logger.d(l, "register listener, listener list created for request name=", requestName);
                R.put(requestName, new ArrayList<>());
            }
            ArrayList<b> arrayList = R.get(requestName);
            Logger.d(l, "register listener, listener added for request name=", requestName, ",", listener);
            arrayList.add(listener);
        } catch (Throwable th) {
            Logger.e(l, "register listener failed. request name:", requestName, ", listener: ", listener, th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Bundle bundle) {
        try {
            Logger.d(l, "notify listeners started, request name=", str, ", data=", bundle);
            ArrayList<b> arrayList = R.get(str);
            if (arrayList != null) {
                Iterator<b> it = arrayList.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    Logger.d(l, "Invoking handler for request name '", str, "', Bundle : ", bundle);
                    next.a(str, bundle);
                }
            }
        } catch (Throwable th) {
            Logger.e(l, "Failed to read response", th);
        }
    }
}
