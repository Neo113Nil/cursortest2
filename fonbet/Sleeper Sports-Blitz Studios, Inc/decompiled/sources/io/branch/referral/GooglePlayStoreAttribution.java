package io.branch.referral;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.branch.referral.Defines;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes9.dex */
class GooglePlayStoreAttribution {
    private static IInstallReferrerEvents callback_ = null;
    static boolean erroredOut = false;
    static boolean hasBeenUsed = false;
    private static String installID_ = "bnc_no_value";

    interface IInstallReferrerEvents {
        void onInstallReferrerEventsFinished();
    }

    GooglePlayStoreAttribution() {
    }

    void captureInstallReferrer(final Context context, long j, IInstallReferrerEvents iInstallReferrerEvents) {
        hasBeenUsed = true;
        callback_ = iInstallReferrerEvents;
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            build.startConnection(new InstallReferrerStateListener() { // from class: io.branch.referral.GooglePlayStoreAttribution.1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i) {
                    String str;
                    long j2;
                    long j3;
                    PrefHelper.Debug("onInstallReferrerSetupFinished, responseCode = " + i);
                    if (i != -1) {
                        if (i == 0) {
                            try {
                                ReferrerDetails installReferrer = build.getInstallReferrer();
                                if (installReferrer != null) {
                                    str = installReferrer.getInstallReferrer();
                                    j2 = installReferrer.getReferrerClickTimestampSeconds();
                                    j3 = installReferrer.getInstallBeginTimestampSeconds();
                                } else {
                                    str = null;
                                    j2 = 0;
                                    j3 = 0;
                                }
                                GooglePlayStoreAttribution.onReferrerClientFinished(context, str, j2, j3);
                                return;
                            } catch (RemoteException e) {
                                PrefHelper.Debug("onInstallReferrerSetupFinished() Exception: " + e.getMessage());
                                GooglePlayStoreAttribution.onReferrerClientError();
                                return;
                            }
                        }
                        if (i != 1 && i != 2 && i != 3) {
                            return;
                        }
                    }
                    GooglePlayStoreAttribution.onReferrerClientError();
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    PrefHelper.Debug("onInstallReferrerServiceDisconnected()");
                }
            });
        } catch (Throwable th) {
            PrefHelper.Debug("ReferrerClientWrapper Exception: " + th.getMessage());
        }
        new Timer().schedule(new TimerTask() { // from class: io.branch.referral.GooglePlayStoreAttribution.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                GooglePlayStoreAttribution.reportInstallReferrer();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onReferrerClientFinished(Context context, String str, long j, long j2) {
        PrefHelper.Debug("onReferrerClientFinished()");
        processReferrerInfo(context, str, j, j2);
        reportInstallReferrer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onReferrerClientError() {
        PrefHelper.Debug("onReferrerClientError()");
        erroredOut = true;
        reportInstallReferrer();
    }

    private static void processReferrerInfo(Context context, String str, long j, long j2) {
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        if (j > 0) {
            prefHelper.setLong("bnc_referrer_click_ts", j);
        }
        if (j2 > 0) {
            prefHelper.setLong("bnc_install_begin_ts", j2);
        }
        if (str != null) {
            try {
                String decode = URLDecoder.decode(str, "UTF-8");
                HashMap hashMap = new HashMap();
                for (String str2 : decode.split("&")) {
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split = str2.split((str2.contains("=") || !str2.contains("-")) ? "=" : "-");
                        if (split.length > 1) {
                            hashMap.put(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                        }
                    }
                }
                if (hashMap.containsKey(Defines.Jsonkey.LinkClickID.getKey())) {
                    String str3 = (String) hashMap.get(Defines.Jsonkey.LinkClickID.getKey());
                    installID_ = str3;
                    prefHelper.setLinkClickIdentifier(str3);
                }
                if (hashMap.containsKey(Defines.Jsonkey.IsFullAppConv.getKey()) && hashMap.containsKey(Defines.Jsonkey.ReferringLink.getKey())) {
                    prefHelper.setIsFullAppConversion(Boolean.parseBoolean((String) hashMap.get(Defines.Jsonkey.IsFullAppConv.getKey())));
                    prefHelper.setAppLink((String) hashMap.get(Defines.Jsonkey.ReferringLink.getKey()));
                }
                if (hashMap.containsKey(Defines.Jsonkey.GoogleSearchInstallReferrer.getKey())) {
                    prefHelper.setGoogleSearchInstallIdentifier((String) hashMap.get(Defines.Jsonkey.GoogleSearchInstallReferrer.getKey()));
                    prefHelper.setGooglePlayReferrer(decode);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                PrefHelper.Debug("Illegal characters in url encoded string");
            }
        }
    }

    public static String getInstallationID() {
        return installID_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportInstallReferrer() {
        IInstallReferrerEvents iInstallReferrerEvents = callback_;
        if (iInstallReferrerEvents != null) {
            iInstallReferrerEvents.onInstallReferrerEventsFinished();
            callback_ = null;
        }
    }
}
