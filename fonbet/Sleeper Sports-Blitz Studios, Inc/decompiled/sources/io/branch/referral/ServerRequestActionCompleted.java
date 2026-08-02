package io.branch.referral;

import android.app.Activity;
import android.content.Context;
import io.branch.referral.BranchViewHandler;
import io.branch.referral.Defines;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.CommerceEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class ServerRequestActionCompleted extends ServerRequest {
    private final BranchViewHandler.IBranchViewEvents callback_;

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean shouldRetryOnFail() {
        return true;
    }

    public ServerRequestActionCompleted(Context context, String str, CommerceEvent commerceEvent, JSONObject jSONObject, BranchViewHandler.IBranchViewEvents iBranchViewEvents) {
        super(context, Defines.RequestPath.CompletedAction.getPath());
        this.callback_ = iBranchViewEvents;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Defines.Jsonkey.IdentityID.getKey(), this.prefHelper_.getIdentityID());
            jSONObject2.put(Defines.Jsonkey.DeviceFingerprintID.getKey(), this.prefHelper_.getDeviceFingerPrintID());
            jSONObject2.put(Defines.Jsonkey.SessionID.getKey(), this.prefHelper_.getSessionID());
            if (!this.prefHelper_.getLinkClickID().equals(PrefHelper.NO_STRING_VALUE)) {
                jSONObject2.put(Defines.Jsonkey.LinkClickID.getKey(), this.prefHelper_.getLinkClickID());
            }
            jSONObject2.put(Defines.Jsonkey.Event.getKey(), str);
            if (jSONObject != null) {
                jSONObject2.put(Defines.Jsonkey.Metadata.getKey(), jSONObject);
            }
            if (commerceEvent != null) {
                jSONObject2.put(Defines.Jsonkey.CommerceData.getKey(), commerceEvent.getCommerceJSONObject());
            }
            updateEnvironment(context, jSONObject2);
            setPost(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
            this.constructError_ = true;
        }
        if (str != null && str.equalsIgnoreCase(BRANCH_STANDARD_EVENT.PURCHASE.getName()) && commerceEvent == null) {
            PrefHelper.Debug("Warning: You are sending a purchase event with our non-dedicated purchase function. Please see function sendCommerceEvent");
        }
    }

    public ServerRequestActionCompleted(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.callback_ = null;
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        if (serverResponse.getObject() == null || !serverResponse.getObject().has(Defines.Jsonkey.BranchViewData.getKey()) || Branch.getInstance().currentActivityReference_ == null || Branch.getInstance().currentActivityReference_.get() == null) {
            return;
        }
        String str = "";
        try {
            JSONObject post = getPost();
            if (post != null && post.has(Defines.Jsonkey.Event.getKey())) {
                str = post.getString(Defines.Jsonkey.Event.getKey());
            }
            if (Branch.getInstance().currentActivityReference_ != null) {
                Activity activity = Branch.getInstance().currentActivityReference_.get();
                BranchViewHandler.getInstance().showBranchView(serverResponse.getObject().getJSONObject(Defines.Jsonkey.BranchViewData.getKey()), str, activity, this.callback_);
            }
        } catch (JSONException unused) {
            BranchViewHandler.IBranchViewEvents iBranchViewEvents = this.callback_;
            if (iBranchViewEvents != null) {
                iBranchViewEvents.onBranchViewError(-201, "Unable to show branch view. Branch view received is invalid ", str);
            }
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        return !super.doesAppHasInternetPermission(context);
    }
}
