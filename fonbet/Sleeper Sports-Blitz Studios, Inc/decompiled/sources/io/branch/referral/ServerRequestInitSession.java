package io.branch.referral;

import android.app.Activity;
import android.content.Context;
import io.branch.indexing.ContentDiscoverer;
import io.branch.indexing.ContentDiscoveryManifest;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.validators.DeepLinkRoutingValidator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
abstract class ServerRequestInitSession extends ServerRequest {
    static final String ACTION_INSTALL = "install";
    static final String ACTION_OPEN = "open";
    private static final int STATE_FRESH_INSTALL = 0;
    private static final int STATE_NO_CHANGE = 1;
    private static final int STATE_UPDATE = 2;
    private final ContentDiscoveryManifest contentDiscoveryManifest_;
    private final Context context_;

    public abstract String getRequestActionName();

    public abstract boolean hasCallBack();

    @Override // io.branch.referral.ServerRequest
    protected boolean shouldUpdateLimitFacebookTracking() {
        return true;
    }

    ServerRequestInitSession(Context context, String str) {
        super(context, str);
        this.context_ = context;
        this.contentDiscoveryManifest_ = ContentDiscoveryManifest.getInstance(context);
    }

    ServerRequestInitSession(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.context_ = context;
        this.contentDiscoveryManifest_ = ContentDiscoveryManifest.getInstance(context);
    }

    @Override // io.branch.referral.ServerRequest
    protected void setPost(JSONObject jSONObject) throws JSONException {
        super.setPost(jSONObject);
        String appVersion = DeviceInfo.getInstance().getAppVersion();
        if (!DeviceInfo.isNullOrEmptyOrBlank(appVersion)) {
            jSONObject.put(Defines.Jsonkey.AppVersion.getKey(), appVersion);
        }
        jSONObject.put(Defines.Jsonkey.FaceBookAppLinkChecked.getKey(), this.prefHelper_.getIsAppLinkTriggeredInit());
        jSONObject.put(Defines.Jsonkey.IsReferrable.getKey(), this.prefHelper_.getIsReferrable());
        jSONObject.put(Defines.Jsonkey.Debug.getKey(), BranchUtil.isDebugEnabled());
        updateInstallStateAndTimestamps(jSONObject);
        updateEnvironment(this.context_, jSONObject);
    }

    static boolean isInitSessionAction(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase(ACTION_INSTALL);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean handleBranchViewIfAvailable(ServerResponse serverResponse) {
        if (serverResponse == null || serverResponse.getObject() == null || !serverResponse.getObject().has(Defines.Jsonkey.BranchViewData.getKey())) {
            return false;
        }
        try {
            JSONObject jSONObject = serverResponse.getObject().getJSONObject(Defines.Jsonkey.BranchViewData.getKey());
            String requestActionName = getRequestActionName();
            if (Branch.getInstance().currentActivityReference_ != null && Branch.getInstance().currentActivityReference_.get() != null) {
                Activity activity = Branch.getInstance().currentActivityReference_.get();
                if (activity instanceof Branch.IBranchViewControl ? true ^ ((Branch.IBranchViewControl) activity).skipBranchViewsOnThisActivity() : true) {
                    return BranchViewHandler.getInstance().showBranchView(jSONObject, requestActionName, activity, Branch.getInstance());
                }
                return BranchViewHandler.getInstance().markInstallOrOpenBranchViewPending(jSONObject, requestActionName);
            }
            return BranchViewHandler.getInstance().markInstallOrOpenBranchViewPending(jSONObject, requestActionName);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        Branch.getInstance().unlockSDKInitWaitLock();
        this.prefHelper_.setLinkClickIdentifier(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setGoogleSearchInstallIdentifier(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setGooglePlayReferrer(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setExternalIntentUri(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setExternalIntentExtra(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setAppLink(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setPushIdentifier(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setIsAppLinkTriggeredInit(false);
        this.prefHelper_.setInstallReferrerParams(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setIsFullAppConversion(false);
        if (this.prefHelper_.getLong("bnc_previous_update_time") == 0) {
            this.prefHelper_.setLong("bnc_previous_update_time", this.prefHelper_.getLong("bnc_last_known_update_time"));
        }
    }

    void onInitSessionCompleted(ServerResponse serverResponse, Branch branch) {
        ContentDiscoveryManifest contentDiscoveryManifest = this.contentDiscoveryManifest_;
        if (contentDiscoveryManifest != null) {
            contentDiscoveryManifest.onBranchInitialised(serverResponse.getObject());
            if (branch.currentActivityReference_ != null) {
                try {
                    ContentDiscoverer.getInstance().onSessionStarted(branch.currentActivityReference_.get(), branch.getSessionReferredLink());
                } catch (Exception unused) {
                }
            }
        }
        DeepLinkRoutingValidator.validate(branch.currentActivityReference_);
        branch.updateSkipURLFormats();
    }

    void updateLinkReferrerParams() {
        String linkClickIdentifier = this.prefHelper_.getLinkClickIdentifier();
        if (!linkClickIdentifier.equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                getPost().put(Defines.Jsonkey.LinkIdentifier.getKey(), linkClickIdentifier);
                getPost().put(Defines.Jsonkey.FaceBookAppLinkChecked.getKey(), this.prefHelper_.getIsAppLinkTriggeredInit());
            } catch (JSONException unused) {
            }
        }
        String googleSearchInstallIdentifier = this.prefHelper_.getGoogleSearchInstallIdentifier();
        if (!googleSearchInstallIdentifier.equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                getPost().put(Defines.Jsonkey.GoogleSearchInstallReferrer.getKey(), googleSearchInstallIdentifier);
            } catch (JSONException unused2) {
            }
        }
        String googlePlayReferrer = this.prefHelper_.getGooglePlayReferrer();
        if (!googlePlayReferrer.equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                getPost().put(Defines.Jsonkey.GooglePlayInstallReferrer.getKey(), googlePlayReferrer);
            } catch (JSONException unused3) {
            }
        }
        if (this.prefHelper_.isFullAppConversion()) {
            try {
                getPost().put(Defines.Jsonkey.AndroidAppLinkURL.getKey(), this.prefHelper_.getAppLink());
                getPost().put(Defines.Jsonkey.IsFullAppConv.getKey(), true);
            } catch (JSONException unused4) {
            }
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void onPreExecute() {
        JSONObject post = getPost();
        try {
            if (!this.prefHelper_.getAppLink().equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.AndroidAppLinkURL.getKey(), this.prefHelper_.getAppLink());
            }
            if (!this.prefHelper_.getPushIdentifier().equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.AndroidPushIdentifier.getKey(), this.prefHelper_.getPushIdentifier());
            }
            if (!this.prefHelper_.getExternalIntentUri().equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.External_Intent_URI.getKey(), this.prefHelper_.getExternalIntentUri());
            }
            if (!this.prefHelper_.getExternalIntentExtra().equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.External_Intent_Extra.getKey(), this.prefHelper_.getExternalIntentExtra());
            }
            if (this.contentDiscoveryManifest_ != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ContentDiscoveryManifest.MANIFEST_VERSION_KEY, this.contentDiscoveryManifest_.getManifestVersion());
                jSONObject.put(ContentDiscoveryManifest.PACKAGE_NAME_KEY, this.context_.getPackageName());
                post.put(ContentDiscoveryManifest.CONTENT_DISCOVER_KEY, jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    private void updateInstallStateAndTimestamps(JSONObject jSONObject) throws JSONException {
        String appVersion = DeviceInfo.getInstance().getAppVersion();
        long firstInstallTime = DeviceInfo.getInstance().getFirstInstallTime();
        long lastUpdateTime = DeviceInfo.getInstance().getLastUpdateTime();
        int i = 2;
        if (PrefHelper.NO_STRING_VALUE.equals(this.prefHelper_.getAppVersion())) {
            if (lastUpdateTime - firstInstallTime < 86400000) {
                i = 0;
            }
        } else if (this.prefHelper_.getAppVersion().equals(appVersion)) {
            i = 1;
        }
        jSONObject.put(Defines.Jsonkey.Update.getKey(), i);
        jSONObject.put(Defines.Jsonkey.FirstInstallTime.getKey(), firstInstallTime);
        jSONObject.put(Defines.Jsonkey.LastUpdateTime.getKey(), lastUpdateTime);
        long j = this.prefHelper_.getLong("bnc_original_install_time");
        if (j == 0) {
            this.prefHelper_.setLong("bnc_original_install_time", firstInstallTime);
        } else {
            firstInstallTime = j;
        }
        jSONObject.put(Defines.Jsonkey.OriginalInstallTime.getKey(), firstInstallTime);
        long j2 = this.prefHelper_.getLong("bnc_last_known_update_time");
        if (j2 < lastUpdateTime) {
            this.prefHelper_.setLong("bnc_previous_update_time", j2);
            this.prefHelper_.setLong("bnc_last_known_update_time", lastUpdateTime);
        }
        jSONObject.put(Defines.Jsonkey.PreviousUpdateTime.getKey(), this.prefHelper_.getLong("bnc_previous_update_time"));
    }

    @Override // io.branch.referral.ServerRequest
    protected boolean prepareExecuteWithoutTracking() {
        JSONObject post = getPost();
        if (post.has(Defines.Jsonkey.AndroidAppLinkURL.getKey()) || post.has(Defines.Jsonkey.AndroidPushIdentifier.getKey()) || post.has(Defines.Jsonkey.LinkIdentifier.getKey())) {
            post.remove(Defines.Jsonkey.DeviceFingerprintID.getKey());
            post.remove(Defines.Jsonkey.IdentityID.getKey());
            post.remove(Defines.Jsonkey.FaceBookAppLinkChecked.getKey());
            post.remove(Defines.Jsonkey.External_Intent_Extra.getKey());
            post.remove(Defines.Jsonkey.External_Intent_URI.getKey());
            post.remove(Defines.Jsonkey.FirstInstallTime.getKey());
            post.remove(Defines.Jsonkey.LastUpdateTime.getKey());
            post.remove(Defines.Jsonkey.OriginalInstallTime.getKey());
            post.remove(Defines.Jsonkey.PreviousUpdateTime.getKey());
            post.remove(Defines.Jsonkey.InstallBeginTimeStamp.getKey());
            post.remove(Defines.Jsonkey.ClickedReferrerTimeStamp.getKey());
            post.remove(Defines.Jsonkey.HardwareID.getKey());
            post.remove(Defines.Jsonkey.IsHardwareIDReal.getKey());
            post.remove(Defines.Jsonkey.LocalIP.getKey());
            try {
                post.put(Defines.Jsonkey.TrackingDisabled.getKey(), true);
            } catch (JSONException unused) {
            }
            return true;
        }
        return super.prepareExecuteWithoutTracking();
    }
}
