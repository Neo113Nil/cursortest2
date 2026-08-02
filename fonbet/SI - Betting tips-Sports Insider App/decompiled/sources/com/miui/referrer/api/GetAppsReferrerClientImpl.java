package com.miui.referrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import ca.a;
import com.miui.referrer.IGetAppsReferrerService;
import com.miui.referrer.commons.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0002'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/miui/referrer/api/GetAppsReferrerClientImpl;", "Lcom/miui/referrer/api/GetAppsReferrerClient;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "strMess", "", "response", "Lcom/miui/referrer/api/GetAppsReferrerStateListener;", "stateListener", "state", "", "logState", "(Ljava/lang/String;ILcom/miui/referrer/api/GetAppsReferrerStateListener;I)V", "logWarnState", "startConnection", "(Lcom/miui/referrer/api/GetAppsReferrerStateListener;)V", "endConnection", "()V", "clientState", "I", "mApplicationContext", "Landroid/content/Context;", "Lcom/miui/referrer/IGetAppsReferrerService;", "service", "Lcom/miui/referrer/IGetAppsReferrerService;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "", "isGetAppsCompatible", "()Z", "isReady", "Lcom/miui/referrer/api/GetAppsReferrerDetails;", "getInstallReferrer", "()Lcom/miui/referrer/api/GetAppsReferrerDetails;", "installReferrer", "Companion", "ca/a", "referrer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetAppsReferrerClientImpl extends GetAppsReferrerClient {
    private static final int GETAPPS_MIN_APP_VER = 4002161;

    @NotNull
    private static final String LOG_BLOCKED = "Connection to service is blocked.";

    @NotNull
    private static final String LOG_CLOSED = "Client was already closed and can't be reused. Please create another instance.";

    @NotNull
    private static final String LOG_CONNECTING = "Client is already in the process of connecting to the service.";

    @NotNull
    private static final String LOG_CONNECT_VALID = "Service connection is valid. No need to re-initialize.";

    @NotNull
    private static final String LOG_GETAPPS_ERROR = "GetApps missing or incompatible. Version 4002161 or later required.";

    @NotNull
    private static final String LOG_NO_PERMISSION = "No permission to connect to service.";

    @NotNull
    private static final String LOG_REMOTE_EXCEPTION = "RemoteException getting GetApps referrer information";

    @NotNull
    private static final String LOG_SERVICE_NOT_CONNECT = "Service not connected. Please start a connection before using the service.";

    @NotNull
    private static final String LOG_SERVICE_UNAVAILABLE = "GetApps Referrer service unavailable on device.";

    @NotNull
    private static final String LOG_START_SERVICE = "Starting install referrer service setup.";

    @NotNull
    private static final String LOG_SUCCESS = "Service was bonded successfully.";

    @NotNull
    private static final String LOG_UNBIND_SERVICE = "Unbinding from service.";

    @NotNull
    private static final String PACKAGE_NAME = "package_name";

    @NotNull
    private static final String SERVICE_ACTION_NAME = "com.miui.referrer.BIND_GET_INSTALL_REFERRER_SERVICE";

    @NotNull
    private static final String SERVICE_CONNECT = "GetApps Referrer service connected.";

    @NotNull
    private static final String SERVICE_DISCONNECT = "GetApps Referrer service disconnected.";

    @NotNull
    private static final String SERVICE_NAME = "com.miui.referrer.GetAppsReferrerInfoService";

    @NotNull
    private static final String SERVICE_PACKAGE_NAME = "com.xiaomi.mipicks";

    @NotNull
    public static final String TAG = "InstallReferrerClient";
    private int clientState;

    @NotNull
    private final Context mApplicationContext;

    @Nullable
    private IGetAppsReferrerService service;

    @Nullable
    private ServiceConnection serviceConnection;

    public GetAppsReferrerClientImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.mApplicationContext = applicationContext;
    }

    private final boolean isGetAppsCompatible() {
        return this.mApplicationContext.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, 128).versionCode >= GETAPPS_MIN_APP_VER;
    }

    private final void logState(String strMess, int response, GetAppsReferrerStateListener stateListener, int state) {
        this.clientState = state;
        LogUtils.log(strMess, response, stateListener);
    }

    public static /* synthetic */ void logState$default(GetAppsReferrerClientImpl getAppsReferrerClientImpl, String str, int i5, GetAppsReferrerStateListener getAppsReferrerStateListener, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        getAppsReferrerClientImpl.logState(str, i5, getAppsReferrerStateListener, i10);
    }

    private final void logWarnState(String strMess, int response, GetAppsReferrerStateListener stateListener, int state) {
        this.clientState = state;
        LogUtils.logWarn(strMess, response, stateListener);
    }

    public static /* synthetic */ void logWarnState$default(GetAppsReferrerClientImpl getAppsReferrerClientImpl, String str, int i5, GetAppsReferrerStateListener getAppsReferrerStateListener, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        getAppsReferrerClientImpl.logWarnState(str, i5, getAppsReferrerStateListener, i10);
    }

    @Override // com.miui.referrer.api.GetAppsReferrerClient
    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            LogUtils.logVerbose(TAG, LOG_UNBIND_SERVICE);
            Context context = this.mApplicationContext;
            ServiceConnection serviceConnection = this.serviceConnection;
            Intrinsics.checkNotNull(serviceConnection);
            context.unbindService(serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    @Override // com.miui.referrer.api.GetAppsReferrerClient
    @NotNull
    public GetAppsReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException(LOG_SERVICE_NOT_CONNECT);
        }
        Bundle bundle = new Bundle();
        bundle.putString(PACKAGE_NAME, this.mApplicationContext.getPackageName());
        try {
            IGetAppsReferrerService iGetAppsReferrerService = this.service;
            Intrinsics.checkNotNull(iGetAppsReferrerService);
            Bundle referrerBundle = iGetAppsReferrerService.referrerBundle(bundle);
            Intrinsics.checkNotNullExpressionValue(referrerBundle, "service!!.referrerBundle(bundle)");
            return new GetAppsReferrerDetails(referrerBundle);
        } catch (RemoteException e7) {
            LogUtils.logWarn(TAG, LOG_REMOTE_EXCEPTION);
            this.clientState = 0;
            throw e7;
        }
    }

    @Override // com.miui.referrer.api.GetAppsReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    @Override // com.miui.referrer.api.GetAppsReferrerClient
    public void startConnection(@NotNull GetAppsReferrerStateListener stateListener) {
        a aVar;
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        if (isReady()) {
            LogUtils.log(LOG_CONNECT_VALID, 0, stateListener);
            return;
        }
        int i5 = this.clientState;
        if (i5 == 1) {
            LogUtils.logWarn(LOG_CONNECTING, 3, stateListener);
            return;
        }
        if (i5 == 3) {
            LogUtils.logWarn(LOG_CLOSED, 3, stateListener);
            return;
        }
        LogUtils.logVerbose(TAG, LOG_START_SERVICE);
        Intent intent = new Intent(SERVICE_ACTION_NAME);
        intent.setComponent(new ComponentName(SERVICE_PACKAGE_NAME, SERVICE_NAME));
        List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "mApplicationContext.pack…IntentServices(intent, 0)");
        if (queryIntentServices.isEmpty()) {
            logState$default(this, LOG_SERVICE_UNAVAILABLE, 2, stateListener, 0, 8, null);
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        if (resolveInfo == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.pm.ResolveInfo");
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo == null) {
            aVar = null;
        } else if (!Intrinsics.areEqual(SERVICE_PACKAGE_NAME, serviceInfo.packageName) || serviceInfo.name == null || !isGetAppsCompatible()) {
            logWarnState$default(this, LOG_GETAPPS_ERROR, 2, stateListener, 0, 8, null);
            return;
        } else {
            aVar = new a(this, stateListener);
            this.serviceConnection = aVar;
        }
        try {
            Context context = this.mApplicationContext;
            Intent intent2 = new Intent(intent);
            Intrinsics.checkNotNull(aVar);
            if (context.bindService(intent2, aVar, 1)) {
                LogUtils.logVerbose(TAG, LOG_SUCCESS);
            } else {
                logWarnState$default(this, LOG_BLOCKED, 1, stateListener, 0, 8, null);
            }
        } catch (SecurityException unused) {
            logWarnState$default(this, LOG_NO_PERMISSION, 4, stateListener, 0, 8, null);
        }
    }
}
