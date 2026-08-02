package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class ServerRequestRegisterOpen extends ServerRequestInitSession {
    Branch.BranchReferralInitListener callback_;

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    ServerRequestRegisterOpen(Context context, Branch.BranchReferralInitListener branchReferralInitListener) {
        super(context, Defines.RequestPath.RegisterOpen.getPath());
        this.callback_ = branchReferralInitListener;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Defines.Jsonkey.DeviceFingerprintID.getKey(), this.prefHelper_.getDeviceFingerPrintID());
            jSONObject.put(Defines.Jsonkey.IdentityID.getKey(), this.prefHelper_.getIdentityID());
            setPost(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.constructError_ = true;
        }
    }

    ServerRequestRegisterOpen(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onPreExecute() {
        super.onPreExecute();
        if (Branch.getInstance().isInstantDeepLinkPossible()) {
            this.callback_.onInitFinished(Branch.getInstance().getLatestReferringParams(), null);
            Branch.getInstance().addExtraInstrumentationData(Defines.Jsonkey.InstantDeepLinkSession.getKey(), "true");
            Branch.getInstance().setInstantDeepLinkPossible(false);
        }
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        super.onRequestSucceeded(serverResponse, branch);
        try {
            if (serverResponse.getObject().has(Defines.Jsonkey.LinkClickID.getKey())) {
                this.prefHelper_.setLinkClickID(serverResponse.getObject().getString(Defines.Jsonkey.LinkClickID.getKey()));
            } else {
                this.prefHelper_.setLinkClickID(PrefHelper.NO_STRING_VALUE);
            }
            if (serverResponse.getObject().has(Defines.Jsonkey.Data.getKey())) {
                JSONObject jSONObject = new JSONObject(serverResponse.getObject().getString(Defines.Jsonkey.Data.getKey()));
                if (jSONObject.has(Defines.Jsonkey.Clicked_Branch_Link.getKey()) && jSONObject.getBoolean(Defines.Jsonkey.Clicked_Branch_Link.getKey()) && this.prefHelper_.getInstallParams().equals(PrefHelper.NO_STRING_VALUE) && this.prefHelper_.getIsReferrable() == 1) {
                    this.prefHelper_.setInstallParams(serverResponse.getObject().getString(Defines.Jsonkey.Data.getKey()));
                }
            }
            if (serverResponse.getObject().has(Defines.Jsonkey.Data.getKey())) {
                this.prefHelper_.setSessionParams(serverResponse.getObject().getString(Defines.Jsonkey.Data.getKey()));
            } else {
                this.prefHelper_.setSessionParams(PrefHelper.NO_STRING_VALUE);
            }
            Branch.BranchReferralInitListener branchReferralInitListener = this.callback_;
            if (branchReferralInitListener != null) {
                branchReferralInitListener.onInitFinished(branch.getLatestReferringParams(), null);
            }
            this.prefHelper_.setAppVersion(DeviceInfo.getInstance().getAppVersion());
        } catch (Exception e) {
            e.printStackTrace();
        }
        onInitSessionCompleted(serverResponse, branch);
    }

    void setInitFinishedCallback(Branch.BranchReferralInitListener branchReferralInitListener) {
        if (branchReferralInitListener != null) {
            this.callback_ = branchReferralInitListener;
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
        if (this.callback_ != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.callback_.onInitFinished(jSONObject, new BranchError("Trouble initializing Branch. " + str, i));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        if (super.doesAppHasInternetPermission(context)) {
            return false;
        }
        Branch.BranchReferralInitListener branchReferralInitListener = this.callback_;
        if (branchReferralInitListener == null) {
            return true;
        }
        branchReferralInitListener.onInitFinished(null, new BranchError("Trouble initializing Branch.", -102));
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
        this.callback_ = null;
    }

    @Override // io.branch.referral.ServerRequestInitSession
    public boolean hasCallBack() {
        return this.callback_ != null;
    }

    @Override // io.branch.referral.ServerRequestInitSession
    public String getRequestActionName() {
        return "open";
    }
}
