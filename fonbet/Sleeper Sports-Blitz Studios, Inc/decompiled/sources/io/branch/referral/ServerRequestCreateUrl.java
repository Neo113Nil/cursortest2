package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class ServerRequestCreateUrl extends ServerRequest {
    private static final String DEF_BASE_URL = "https://bnc.lt/a/";
    private Branch.BranchLinkCreateListener callback_;
    private boolean defaultToLongUrl_;
    private boolean isAsync_;
    private boolean isReqStartedFromBranchShareSheet_;
    private BranchLinkData linkPost_;

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    boolean isPersistable() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    protected boolean prepareExecuteWithoutTracking() {
        return true;
    }

    public ServerRequestCreateUrl(Context context, String str, int i, int i2, Collection<String> collection, String str2, String str3, String str4, String str5, JSONObject jSONObject, Branch.BranchLinkCreateListener branchLinkCreateListener, boolean z, boolean z2) {
        super(context, Defines.RequestPath.GetURL.getPath());
        this.callback_ = branchLinkCreateListener;
        this.isAsync_ = z;
        this.defaultToLongUrl_ = z2;
        BranchLinkData branchLinkData = new BranchLinkData();
        this.linkPost_ = branchLinkData;
        try {
            branchLinkData.put(Defines.Jsonkey.IdentityID.getKey(), this.prefHelper_.getIdentityID());
            this.linkPost_.put(Defines.Jsonkey.DeviceFingerprintID.getKey(), this.prefHelper_.getDeviceFingerPrintID());
            this.linkPost_.put(Defines.Jsonkey.SessionID.getKey(), this.prefHelper_.getSessionID());
            if (!this.prefHelper_.getLinkClickID().equals(PrefHelper.NO_STRING_VALUE)) {
                this.linkPost_.put(Defines.Jsonkey.LinkClickID.getKey(), this.prefHelper_.getLinkClickID());
            }
            this.linkPost_.putType(i);
            this.linkPost_.putDuration(i2);
            this.linkPost_.putTags(collection);
            this.linkPost_.putAlias(str);
            this.linkPost_.putChannel(str2);
            this.linkPost_.putFeature(str3);
            this.linkPost_.putStage(str4);
            this.linkPost_.putCampaign(str5);
            this.linkPost_.putParams(jSONObject);
            setPost(this.linkPost_);
        } catch (JSONException e) {
            e.printStackTrace();
            this.constructError_ = true;
        }
    }

    public ServerRequestCreateUrl(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.isAsync_ = true;
        this.defaultToLongUrl_ = true;
    }

    public BranchLinkData getLinkPost() {
        return this.linkPost_;
    }

    boolean isDefaultToLongUrl() {
        return this.defaultToLongUrl_;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        if (super.doesAppHasInternetPermission(context)) {
            return false;
        }
        Branch.BranchLinkCreateListener branchLinkCreateListener = this.callback_;
        if (branchLinkCreateListener == null) {
            return true;
        }
        branchLinkCreateListener.onLinkCreate(null, new BranchError("Trouble creating a URL.", -102));
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        try {
            String string = serverResponse.getObject().getString("url");
            Branch.BranchLinkCreateListener branchLinkCreateListener = this.callback_;
            if (branchLinkCreateListener != null) {
                branchLinkCreateListener.onLinkCreate(string, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onUrlAvailable(String str) {
        Branch.BranchLinkCreateListener branchLinkCreateListener = this.callback_;
        if (branchLinkCreateListener != null) {
            branchLinkCreateListener.onLinkCreate(str, null);
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
        if (this.callback_ != null) {
            String longUrl = this.defaultToLongUrl_ ? getLongUrl() : null;
            this.callback_.onLinkCreate(longUrl, new BranchError("Trouble creating a URL. " + str, i));
        }
    }

    public String getLongUrl() {
        if (!this.prefHelper_.getUserURL().equals(PrefHelper.NO_STRING_VALUE)) {
            return generateLongUrlWithParams(this.prefHelper_.getUserURL());
        }
        return generateLongUrlWithParams(DEF_BASE_URL + this.prefHelper_.getBranchKey());
    }

    public void handleDuplicateURLError() {
        Branch.BranchLinkCreateListener branchLinkCreateListener = this.callback_;
        if (branchLinkCreateListener != null) {
            branchLinkCreateListener.onLinkCreate(null, new BranchError("Trouble creating a URL.", -105));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
        this.callback_ = null;
    }

    public boolean isAsync() {
        return this.isAsync_;
    }

    private String generateLongUrlWithParams(String str) {
        try {
            if (Branch.getInstance().isTrackingDisabled() && !str.contains(DEF_BASE_URL)) {
                str = str.replace(new URL(str).getQuery(), "");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains("?") ? "" : "?");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(sb2.endsWith("?") ? "" : "&");
            String sb4 = sb3.toString();
            Collection<String> tags = this.linkPost_.getTags();
            if (tags != null) {
                for (String str2 : tags) {
                    if (str2 != null && str2.length() > 0) {
                        sb4 = sb4 + Defines.LinkParam.Tags + "=" + URLEncoder.encode(str2, "UTF8") + "&";
                    }
                }
            }
            String alias = this.linkPost_.getAlias();
            if (alias != null && alias.length() > 0) {
                sb4 = sb4 + Defines.LinkParam.Alias + "=" + URLEncoder.encode(alias, "UTF8") + "&";
            }
            String channel = this.linkPost_.getChannel();
            if (channel != null && channel.length() > 0) {
                sb4 = sb4 + Defines.LinkParam.Channel + "=" + URLEncoder.encode(channel, "UTF8") + "&";
            }
            String feature = this.linkPost_.getFeature();
            if (feature != null && feature.length() > 0) {
                sb4 = sb4 + Defines.LinkParam.Feature + "=" + URLEncoder.encode(feature, "UTF8") + "&";
            }
            String stage = this.linkPost_.getStage();
            if (stage != null && stage.length() > 0) {
                sb4 = sb4 + Defines.LinkParam.Stage + "=" + URLEncoder.encode(stage, "UTF8") + "&";
            }
            String campaign = this.linkPost_.getCampaign();
            if (campaign != null && campaign.length() > 0) {
                sb4 = sb4 + Defines.LinkParam.Campaign + "=" + URLEncoder.encode(campaign, "UTF8") + "&";
            }
            String str3 = (sb4 + Defines.LinkParam.Type + "=" + this.linkPost_.getType() + "&") + Defines.LinkParam.Duration + "=" + this.linkPost_.getDuration();
            String jSONObject = this.linkPost_.getParams().toString();
            if (jSONObject == null || jSONObject.length() <= 0) {
                return str3;
            }
            return str3 + "&source=android&data=" + URLEncoder.encode(Base64.encodeToString(jSONObject.getBytes(), 2), "UTF8");
        } catch (Exception unused) {
            this.callback_.onLinkCreate(null, new BranchError("Trouble creating a URL.", BranchError.ERR_BRANCH_INVALID_REQUEST));
            return str;
        }
    }

    void setIsReqStartedFromBranchShareSheet(boolean z) {
        this.isReqStartedFromBranchShareSheet_ = z;
    }

    boolean isReqStartedFromBranchShareSheet() {
        return this.isReqStartedFromBranchShareSheet_;
    }
}
