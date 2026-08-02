package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes7.dex */
class GmsRpc {
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider<HeartBeatInfo> heartbeatInfo;
    private final Metadata metadata;
    private final Rpc rpc;
    private final Provider<UserAgentPublisher> userAgentPublisher;

    GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Rpc rpc, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = rpc;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }

    GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new Rpc(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private static String base64UrlSafe(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> extractResponseWhenComplete(Task<Bundle> task) {
        return task.continueWith(new Executor() { // from class: com.google.firebase.messaging.GmsRpc$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new Continuation() { // from class: com.google.firebase.messaging.GmsRpc$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return GmsRpc.this.m5673xb80eb67f(task2);
            }
        });
    }

    private String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.app.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String handleResponse(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException(com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String obj = bundle.toString();
        Log.w(Constants.TAG, "Unexpected response: ".concat(obj), new Throwable());
        throw new IOException(com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
    }

    static boolean isErrorMessageForRetryableError(String str) {
        return com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE.equals(str) || com.google.firebase.iid.GmsRpc.ERROR_INTERNAL_SERVER_ERROR.equals(str) || "InternalServerError".equals(str);
    }

    private void setDefaultAttributesToBundle(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.app.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.metadata.getAppVersionCode());
        bundle.putString("app_ver_name", this.metadata.getAppVersionName());
        bundle.putString("firebase-app-name-hash", getHashedFirebaseAppName());
        try {
            String token = ((InstallationTokenResult) Tasks.await(this.firebaseInstallations.getToken(false))).getToken();
            if (TextUtils.isEmpty(token)) {
                Log.w(Constants.TAG, "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e(Constants.TAG, "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.firebaseInstallations.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        HeartBeatInfo heartBeatInfo = this.heartbeatInfo.get();
        UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
        bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
    }

    private Task<Bundle> startRpc(String str, String str2, Bundle bundle) {
        try {
            setDefaultAttributesToBundle(str, str2, bundle);
            return this.rpc.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    Task<?> deleteToken() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), "*", bundle));
    }

    Task<String> getToken() {
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), "*", new Bundle()));
    }

    /* renamed from: lambda$extractResponseWhenComplete$0$com-google-firebase-messaging-GmsRpc, reason: not valid java name */
    /* synthetic */ String m5673xb80eb67f(Task task) throws Exception {
        return handleResponse((Bundle) task.getResult(IOException.class));
    }

    Task<?> subscribeToTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str2);
        return extractResponseWhenComplete(startRpc(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    Task<?> unsubscribeFromTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str2);
        return extractResponseWhenComplete(startRpc(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
