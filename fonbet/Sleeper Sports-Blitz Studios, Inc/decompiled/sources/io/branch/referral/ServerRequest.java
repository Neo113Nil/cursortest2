package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.Defines;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class ServerRequest {
    private static final String POST_KEY = "REQ_POST";
    private static final String POST_PATH_KEY = "REQ_POST_PATH";
    private static final String[] initializationAndEventRoutes = {Defines.RequestPath.RegisterInstall.getPath(), Defines.RequestPath.RegisterOpen.getPath(), Defines.RequestPath.CompletedAction.getPath(), Defines.RequestPath.ContentEvent.getPath(), Defines.RequestPath.TrackStandardEvent.getPath(), Defines.RequestPath.TrackCustomEvent.getPath()};
    public boolean constructError_;
    private final Context context_;
    private final Set<PROCESS_WAIT_LOCK> locks_;
    private JSONObject params_;
    protected final PrefHelper prefHelper_;
    private long queueWaitTime_;
    private String requestPath_;
    boolean skipOnTimeOut;

    public enum BRANCH_API_VERSION {
        V1,
        V1_CPID,
        V1_LATD,
        V2
    }

    enum PROCESS_WAIT_LOCK {
        SDK_INIT_WAIT_LOCK,
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK
    }

    public abstract void clearCallbacks();

    public abstract boolean handleErrors(Context context);

    public abstract void handleFailure(int i, String str);

    public boolean isGAdsParamsRequired() {
        return true;
    }

    public abstract boolean isGetRequest();

    boolean isPersistable() {
        return true;
    }

    public void onPreExecute() {
    }

    public abstract void onRequestSucceeded(ServerResponse serverResponse, Branch branch);

    protected boolean prepareExecuteWithoutTracking() {
        return false;
    }

    public boolean shouldRetryOnFail() {
        return false;
    }

    protected boolean shouldUpdateLimitFacebookTracking() {
        return false;
    }

    public ServerRequest(Context context, String str) {
        this.queueWaitTime_ = 0L;
        this.constructError_ = false;
        this.skipOnTimeOut = false;
        this.context_ = context;
        this.requestPath_ = str;
        this.prefHelper_ = PrefHelper.getInstance(context);
        this.params_ = new JSONObject();
        this.locks_ = new HashSet();
    }

    protected ServerRequest(String str, JSONObject jSONObject, Context context) {
        this.queueWaitTime_ = 0L;
        this.constructError_ = false;
        this.skipOnTimeOut = false;
        this.context_ = context;
        this.requestPath_ = str;
        this.params_ = jSONObject;
        this.prefHelper_ = PrefHelper.getInstance(context);
        this.locks_ = new HashSet();
    }

    public final String getRequestPath() {
        return this.requestPath_;
    }

    public String getRequestUrl() {
        return this.prefHelper_.getAPIBaseUrl() + this.requestPath_;
    }

    protected void setPost(JSONObject jSONObject) throws JSONException {
        this.params_ = jSONObject;
        if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1) {
            DeviceInfo.getInstance().updateRequestWithV1Params(this, this.params_);
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            this.params_.put(Defines.Jsonkey.UserData.getKey(), jSONObject2);
            DeviceInfo.getInstance().updateRequestWithV2Params(this, this.context_, this.prefHelper_, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public JSONObject getPost() {
        return this.params_;
    }

    public JSONObject getPostWithInstrumentationValues(ConcurrentHashMap<String, String> concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.params_ != null) {
                JSONObject jSONObject2 = new JSONObject(this.params_.toString());
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            if (concurrentHashMap.size() <= 0) {
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            for (String str : concurrentHashMap.keySet()) {
                jSONObject3.put(str, concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
            jSONObject.put(Defines.Jsonkey.Branch_Instrumentation.getKey(), jSONObject3);
            return jSONObject;
        } catch (ConcurrentModificationException unused) {
            return this.params_;
        } catch (JSONException unused2) {
            return jSONObject;
        }
    }

    public JSONObject getGetParams() {
        return this.params_;
    }

    protected void addGetParam(String str, String str2) {
        try {
            this.params_.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(POST_KEY, this.params_);
            jSONObject.put(POST_PATH_KEY, this.requestPath_);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|2|3|(6:5|7|8|(2:10|11)|13|(2:15|16)(1:18))|20|7|8|(0)|13|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[Catch: JSONException -> 0x001e, TRY_LEAVE, TryCatch #1 {JSONException -> 0x001e, blocks: (B:8:0x0013, B:10:0x0019), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ServerRequest fromJSON(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2;
        String str = "";
        if (jSONObject.has(POST_KEY)) {
            jSONObject2 = jSONObject.getJSONObject(POST_KEY);
            if (jSONObject.has(POST_PATH_KEY)) {
                str = jSONObject.getString(POST_PATH_KEY);
            }
            if (TextUtils.isEmpty(str)) {
                return getExtendedServerRequest(str, jSONObject2, context);
            }
            return null;
        }
        jSONObject2 = null;
        if (jSONObject.has(POST_PATH_KEY)) {
        }
        if (TextUtils.isEmpty(str)) {
        }
    }

    private static ServerRequest getExtendedServerRequest(String str, JSONObject jSONObject, Context context) {
        if (str.equalsIgnoreCase(Defines.RequestPath.CompletedAction.getPath())) {
            return new ServerRequestActionCompleted(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.GetURL.getPath())) {
            return new ServerRequestCreateUrl(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.GetCreditHistory.getPath())) {
            return new ServerRequestGetRewardHistory(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.GetCredits.getPath())) {
            return new ServerRequestGetRewards(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.IdentifyUser.getPath())) {
            return new ServerRequestIdentifyUserRequest(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.Logout.getPath())) {
            return new ServerRequestLogout(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.RedeemRewards.getPath())) {
            return new ServerRequestRedeemRewards(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.RegisterClose.getPath())) {
            return new ServerRequestRegisterClose(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.RegisterInstall.getPath())) {
            return new ServerRequestRegisterInstall(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.RegisterOpen.getPath())) {
            return new ServerRequestRegisterOpen(str, jSONObject, context);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4 A[Catch: JSONException -> 0x00d8, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x001c, B:5:0x0021, B:7:0x0032, B:12:0x00c4, B:15:0x004f, B:17:0x0057, B:19:0x0065, B:21:0x0071, B:23:0x007f, B:25:0x008e, B:26:0x00a5, B:28:0x00ab, B:30:0x00b7), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateGAdsParams() {
        String keyToBeUsedInAdIdsObject;
        BRANCH_API_VERSION branchRemoteAPIVersion = getBranchRemoteAPIVersion();
        int lATVal = DeviceInfo.getInstance().getSystemObserver().getLATVal();
        String aid = DeviceInfo.getInstance().getSystemObserver().getAID();
        try {
            if (branchRemoteAPIVersion == BRANCH_API_VERSION.V1) {
                this.params_.put(Defines.Jsonkey.LATVal.getKey(), lATVal);
                if (!TextUtils.isEmpty(aid)) {
                    this.params_.put(Defines.Jsonkey.GoogleAdvertisingID.getKey(), aid);
                    this.params_.remove(Defines.Jsonkey.UnidentifiedDevice.getKey());
                    keyToBeUsedInAdIdsObject = getKeyToBeUsedInAdIdsObject(this.params_);
                    if (keyToBeUsedInAdIdsObject != null) {
                        return;
                    }
                    this.params_.put(Defines.Jsonkey.AdvertisingIDs.getKey(), new JSONObject().put(keyToBeUsedInAdIdsObject, aid));
                    return;
                }
                if (!payloadContainsDeviceIdentifiers(this.params_) && !this.params_.optBoolean(Defines.Jsonkey.UnidentifiedDevice.getKey())) {
                    this.params_.put(Defines.Jsonkey.UnidentifiedDevice.getKey(), true);
                }
                keyToBeUsedInAdIdsObject = null;
                if (keyToBeUsedInAdIdsObject != null) {
                }
            } else {
                JSONObject optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey());
                if (optJSONObject != null) {
                    optJSONObject.put(Defines.Jsonkey.LimitedAdTracking.getKey(), lATVal);
                    if (!TextUtils.isEmpty(aid)) {
                        optJSONObject.put(Defines.Jsonkey.AAID.getKey(), aid);
                        optJSONObject.remove(Defines.Jsonkey.UnidentifiedDevice.getKey());
                        keyToBeUsedInAdIdsObject = getKeyToBeUsedInAdIdsObject(optJSONObject);
                        if (keyToBeUsedInAdIdsObject != null) {
                        }
                    } else if (!payloadContainsDeviceIdentifiers(optJSONObject) && !optJSONObject.optBoolean(Defines.Jsonkey.UnidentifiedDevice.getKey())) {
                        optJSONObject.put(Defines.Jsonkey.UnidentifiedDevice.getKey(), true);
                    }
                }
                keyToBeUsedInAdIdsObject = null;
                if (keyToBeUsedInAdIdsObject != null) {
                }
            }
        } catch (JSONException unused) {
        }
    }

    private boolean payloadContainsDeviceIdentifiers(JSONObject jSONObject) {
        return jSONObject.has(Defines.Jsonkey.AndroidID.getKey()) || jSONObject.has(Defines.Jsonkey.DeviceFingerprintID.getKey()) || jSONObject.has(Defines.ModuleNameKeys.imei.getKey());
    }

    private String getKeyToBeUsedInAdIdsObject(JSONObject jSONObject) {
        String optString = jSONObject.optString(Defines.Jsonkey.OS.getKey());
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString.toLowerCase().contains("amazon") ? Defines.Jsonkey.FireAdId.getKey() : Defines.Jsonkey.AAID.getKey();
    }

    private void updateDeviceInfo() {
        JSONObject optJSONObject;
        if (getBranchRemoteAPIVersion() != BRANCH_API_VERSION.V2 || (optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey())) == null) {
            return;
        }
        try {
            optJSONObject.put(Defines.Jsonkey.DeveloperIdentity.getKey(), this.prefHelper_.getIdentity());
            optJSONObject.put(Defines.Jsonkey.DeviceFingerprintID.getKey(), this.prefHelper_.getDeviceFingerPrintID());
        } catch (JSONException unused) {
        }
    }

    private void updateRequestMetadata() {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = this.prefHelper_.getRequestMetadata().keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, this.prefHelper_.getRequestMetadata().get(next));
            }
            JSONObject optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.Metadata.getKey());
            if (optJSONObject != null) {
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject.put(next2, optJSONObject.get(next2));
                }
            }
            if ((this instanceof ServerRequestRegisterInstall) && this.prefHelper_.getInstallMetadata().length() > 0) {
                Iterator<String> keys3 = this.prefHelper_.getInstallMetadata().keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    this.params_.putOpt(next3, this.prefHelper_.getInstallMetadata().get(next3));
                }
            }
            this.params_.put(Defines.Jsonkey.Metadata.getKey(), jSONObject);
        } catch (JSONException unused) {
            PrefHelper.Debug("Could not merge metadata, ignoring user metadata.");
        }
    }

    private void updateLimitFacebookTracking() {
        boolean isAppTrackingLimited;
        JSONObject optJSONObject = getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1 ? this.params_ : this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey());
        if (optJSONObject == null || !(isAppTrackingLimited = this.prefHelper_.isAppTrackingLimited())) {
            return;
        }
        try {
            optJSONObject.putOpt(Defines.Jsonkey.limitFacebookTracking.getKey(), Boolean.valueOf(isAppTrackingLimited));
        } catch (JSONException unused) {
        }
    }

    void doFinalUpdateOnMainThread() {
        updateRequestMetadata();
        if (shouldUpdateLimitFacebookTracking()) {
            updateLimitFacebookTracking();
        }
    }

    void doFinalUpdateOnBackgroundThread() {
        if (this instanceof ServerRequestInitSession) {
            ((ServerRequestInitSession) this).updateLinkReferrerParams();
        }
        updateDeviceInfo();
        if (!isGAdsParamsRequired() || BranchUtil.isTestModeEnabled()) {
            return;
        }
        updateGAdsParams();
    }

    protected boolean doesAppHasInternetPermission(Context context) {
        int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.INTERNET");
        if (checkCallingOrSelfPermission != 0) {
            PrefHelper.Debug("Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        }
        return checkCallingOrSelfPermission == 0;
    }

    public void onRequestQueued() {
        this.queueWaitTime_ = System.currentTimeMillis();
    }

    public long getQueueWaitTime() {
        if (this.queueWaitTime_ > 0) {
            return System.currentTimeMillis() - this.queueWaitTime_;
        }
        return 0L;
    }

    public void addProcessWaitLock(PROCESS_WAIT_LOCK process_wait_lock) {
        if (process_wait_lock != null) {
            this.locks_.add(process_wait_lock);
        }
    }

    public void removeProcessWaitLock(PROCESS_WAIT_LOCK process_wait_lock) {
        this.locks_.remove(process_wait_lock);
    }

    public boolean isWaitingOnProcessToFinish() {
        return this.locks_.size() > 0;
    }

    protected void updateEnvironment(Context context, JSONObject jSONObject) {
        try {
            String key = (DeviceInfo.getInstance().isPackageInstalled() ? Defines.Jsonkey.NativeApp : Defines.Jsonkey.InstantApp).getKey();
            if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V2) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Defines.Jsonkey.UserData.getKey());
                if (optJSONObject != null) {
                    optJSONObject.put(Defines.Jsonkey.Environment.getKey(), key);
                    return;
                }
                return;
            }
            jSONObject.put(Defines.Jsonkey.Environment.getKey(), key);
        } catch (Exception unused) {
        }
    }

    public BRANCH_API_VERSION getBranchRemoteAPIVersion() {
        return BRANCH_API_VERSION.V1;
    }

    public void reportTrackingDisabledError() {
        PrefHelper.Debug("Requested operation cannot be completed since tracking is disabled [" + this.requestPath_ + "]");
        handleFailure(-117, "");
    }

    boolean isInitializationOrEventRequest() {
        for (String str : initializationAndEventRoutes) {
            if (str.equals(this.requestPath_)) {
                return true;
            }
        }
        return false;
    }
}
