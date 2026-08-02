package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import xsna.g5o0;
import xsna.szy0;

/* loaded from: classes13.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {
    private Context a;
    private TOption b;
    private Context c;
    private AbstractClientBuilder<?, TOption> d;
    private String e;
    private String f;
    private SubAppInfo g;
    private WeakReference<Activity> h;
    private int i;
    private int j = 1;
    private boolean k = false;
    private String l;
    private boolean m;
    private RequestManager n;

    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final AnyClient b;
        private final HuaweiApi<OptionsT> d;
        private ResolveClientBean e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();
        private final Queue<TaskApiCallbackWrapper> a = new LinkedList();
        private ConnectionResult c = null;

        public RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.d = huaweiApi;
            this.b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        public AnyClient getClient() {
            return this.b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.c();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.a().getTaskApiCall().getTransactionId(), this);
            this.a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.a().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.d).c == null ? this.d.getContext() : ((HuaweiApi) this.d).c).getPackageName();
            if (((HuaweiApi) this.d).c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.d;
                huaweiApi.b(((HuaweiApi) huaweiApi).c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.d.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.a().getTaskApiCall();
            requestHeader.setTransactionId(a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.d.getApiLevel(), taskApiCall.getApiLevel()));
            this.b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack b = taskApiCallbackWrapper.b();
                    if (b != null) {
                        b.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        private TaskApiCallbackWrapper b(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1
                private AtomicBoolean a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (iMessageEntity instanceof ResponseHeader) {
                        ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                        if (responseHeader.getErrorCode() == 11) {
                            RequestHandler.this.a();
                        }
                        if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                            responseHeader.getResolution();
                        }
                        if (this.a.compareAndSet(true, false)) {
                            HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.d.getContext(), responseHeader, String.valueOf(RequestHandler.this.d.getKitSdkVersion()));
                        }
                        taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.callbackWaitQueue.size();
            this.a.size();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.a.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.a.clear();
            this.c = null;
            this.b.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ConnectionResult connectionResult) {
            this.c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z = true;
            while (it.hasNext()) {
                TaskApiCallWrapper a = it.next().a();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + a(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(a.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.d.getContext(), responseHeader, String.valueOf(this.d.getKitSdkVersion()));
                if (this.c.getResolution() != null && z) {
                    responseHeader.setParcelable(this.c.getResolution());
                    if (Util.isAvailableLibExist(this.d.getContext()) && this.c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z = false;
                }
                int errorCode = this.c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                a.getTaskApiCall().onResponse(this.b, responseHeader, null, a.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.a.clear();
            this.c = null;
            this.b.disconnect();
        }

        public void a(TaskApiCallWrapper taskApiCallWrapper) {
            TaskApiCallbackWrapper b = b(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.d).a).getHmsVersionCode();
            if (hmsVersionCode < 40000000 && hmsVersionCode > 0 && this.b.isConnected() && !((HuaweiApi) this.d).m && ((BaseHmsClient) this.b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.b.disconnect();
                }
            }
            if (this.b.isConnected()) {
                BinderAdapter adapter = ((BaseHmsClient) this.b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(b);
                return;
            }
            this.callbackWaitQueue.add(b);
            ConnectionResult connectionResult = this.c;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                this.c.getErrorCode();
                onConnectionFailed(this.c);
                return;
            }
            RequestManager.addRequestToQueue(this);
            Object obj = this.b;
            if (obj instanceof BaseHmsClient) {
                ((BaseHmsClient) obj).setInternalRequest(this);
            }
            a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.c = null;
            this.a.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        private String a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.d.getAppID(), str2) : str;
        }

        public synchronized void a(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            try {
                if (this.b.isConnected()) {
                    return;
                }
                if (this.b.isConnecting()) {
                    return;
                }
                if (this.d.getActivity() != null) {
                    if (this.e == null) {
                        this.e = new ResolveClientBean(this.b, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.e)) {
                        return;
                    } else {
                        BindResolveClients.getInstance().register(this.e);
                    }
                }
                this.b.connect(i);
            } catch (Throwable th) {
                throw th;
            }
        }

        public void a() {
            this.b.disconnect();
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper a = taskApiCallbackWrapper.a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(a.getTaskApiCall().getTransactionId());
            a.getTaskApiCall().onResponse(this.b, responseHeader, null, a.getTaskCompletionSource());
        }

        private String a(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.d.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode == -1) {
                    return "get update result, but has other error codes";
                }
                if (errorCode == 3) {
                    return "HuaWei Mobile Service is disabled";
                }
                if (errorCode == 8) {
                    return "internal error";
                }
                if (errorCode == 10) {
                    return "application configuration error, please developer check configuration";
                }
                if (errorCode == 13) {
                    return "update cancelled";
                }
                if (errorCode != 21) {
                    switch (errorCode) {
                        case 25:
                            return "failed to get update result";
                        case 26:
                            return "update failed, because no activity incoming, can't pop update page";
                        case 27:
                            return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                        default:
                            return "unknown errorReason";
                    }
                }
                return "device is too old to be support";
            }
            int errorCode2 = connectionResult.getErrorCode();
            return errorCode2 != -1 ? errorCode2 != 8 ? errorCode2 != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration" : "internal error" : "get update result, but has other error codes";
        }
    }

    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper a;
        private final AnyClient.CallBack b;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.a = taskApiCallWrapper;
            this.b = callBack;
        }

        public TaskApiCallWrapper a() {
            return this.a;
        }

        public AnyClient.CallBack b() {
            return this.b;
        }
    }

    public static class a<OptionsT extends Api.ApiOptions> implements Runnable {
        private final HuaweiApi<OptionsT> a;
        private final TaskApiCallWrapper b;

        public a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.a = huaweiApi;
            this.b = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(RequestHandler requestHandler, Throwable th) {
            Throwable th2;
            AnyClient anyClient;
            String str;
            ResponseHeader responseHeader;
            g5o0 g5o0Var;
            TaskApiCall taskApiCall = null;
            try {
                anyClient = requestHandler.getClient();
                try {
                    responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.INTERNAL_ERROR, th.getMessage());
                    try {
                        str = new JSONObject().toString();
                        try {
                            g5o0Var = this.b.getTaskCompletionSource();
                            try {
                                taskApiCall = this.b.getTaskApiCall();
                            } catch (Throwable th3) {
                                th2 = th3;
                                th2.getMessage();
                                if (anyClient == null) {
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            g5o0Var = null;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        str = null;
                        g5o0Var = null;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    str = null;
                    responseHeader = null;
                    g5o0Var = null;
                    th2.getMessage();
                    if (anyClient == null) {
                        return;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th7) {
                th2 = th7;
                anyClient = null;
            }
            if (anyClient == null || responseHeader == null || str == null || g5o0Var == null || taskApiCall == null) {
                return;
            }
            taskApiCall.onResponse(anyClient, responseHeader, str, g5o0Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.a);
            try {
                requestHandler.a(this.b);
            } catch (Throwable th) {
                a(requestHandler, th);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, null);
    }

    @Deprecated
    public Task<Boolean> disconnectService() {
        final g5o0 g5o0Var = new g5o0();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.a((HuaweiApi<?>) this, (g5o0<Boolean>) g5o0Var);
            }
        });
        return g5o0Var.a;
    }

    public <TResult, TClient extends AnyClient> Task<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.k = true;
        if (taskApiCall != null) {
            HiAnalyticsInnerClient.reportEntryClient(this.a, taskApiCall.getUri(), TextUtils.isEmpty(this.g.getSubAppID()) ? this.f : this.g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
            if (this.n == null) {
                this.n = RequestManager.getInstance();
            }
            return a(taskApiCall);
        }
        szy0 szy0Var = new szy0();
        ApiException apiException = new ApiException(Status.FAILURE);
        synchronized (szy0Var.a) {
            try {
                if (!szy0Var.b) {
                    szy0Var.b = true;
                    szy0Var.d = apiException;
                    szy0Var.a.notifyAll();
                    szy0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return szy0Var;
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.j;
    }

    public String getAppID() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.huawei.hms.common.internal.AnyClient] */
    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.d.buildClient(this.a, getClientSetting(), requestHandler, requestHandler);
    }

    public ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.a.getPackageName(), this.a.getClass().getName(), getScopes(), this.e, null, this.g);
        if (!this.m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = "com.huawei.hwid";
            }
            this.l = hMSPackageNameForMultiService;
        }
        clientSettings.setInnerHmsPkg(this.l);
        clientSettings.setUseInnerHms(this.m);
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.a;
    }

    public int getKitSdkVersion() {
        return this.i;
    }

    public TOption getOption() {
        return this.b;
    }

    public List<Scope> getScopes() {
        return Collections.EMPTY_LIST;
    }

    public String getSubAppID() {
        return this.g.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.j = i;
    }

    public void setHostContext(Context context) {
        this.c = context;
    }

    public void setInnerHms() {
        this.l = this.a.getPackageName();
        this.m = true;
    }

    public void setKitSdkVersion(int i) {
        this.i = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        SubAppInfo subAppInfo2 = this.g;
        if ((subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) || subAppInfo == null) {
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID) || subAppID.equals(this.e) || this.k) {
            return false;
        }
        this.g = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        String appId = Util.getAppId(context);
        this.e = appId;
        this.f = appId;
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.a = context.getApplicationContext();
        this.b = toption;
        this.d = abstractClientBuilder;
        b(context);
        this.g = new SubAppInfo("");
        this.i = i;
        if (!TextUtils.isEmpty(str) && !str.equals(this.e)) {
            this.g = new SubAppInfo(str);
        }
        a(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    private void a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuaweiApi<?> huaweiApi, g5o0<Boolean> g5o0Var) {
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            g5o0Var.b(Boolean.TRUE);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, null);
    }

    private <TResult, TClient extends AnyClient> Task<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
        taskApiCall.getToken();
        g5o0 g5o0Var = new g5o0();
        RequestManager.getHandler().post(new a(this, new TaskApiCallWrapper(taskApiCall, g5o0Var)));
        return g5o0Var.a;
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, 0, null);
    }
}
