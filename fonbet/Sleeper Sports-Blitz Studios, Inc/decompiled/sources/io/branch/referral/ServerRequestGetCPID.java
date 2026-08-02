package io.branch.referral;

import android.content.Context;
import io.branch.referral.ServerRequest;
import io.branch.referral.util.BranchCPID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ServerRequestGetCPID extends ServerRequest {
    private BranchCrossPlatformIdListener callback;

    public interface BranchCrossPlatformIdListener {
        void onDataFetched(BranchCPID branchCPID, BranchError branchError);
    }

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean shouldRetryOnFail() {
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    protected boolean shouldUpdateLimitFacebookTracking() {
        return true;
    }

    ServerRequestGetCPID(Context context, String str, BranchCrossPlatformIdListener branchCrossPlatformIdListener) {
        super(context, str);
        this.callback = branchCrossPlatformIdListener;
        JSONObject jSONObject = new JSONObject();
        try {
            setPost(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        updateEnvironment(context, jSONObject);
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        if (serverResponse != null) {
            BranchCrossPlatformIdListener branchCrossPlatformIdListener = this.callback;
            if (branchCrossPlatformIdListener != null) {
                branchCrossPlatformIdListener.onDataFetched(new BranchCPID(serverResponse.getObject()), null);
                return;
            }
            return;
        }
        this.callback.onDataFetched(null, new BranchError("Failed to get the Cross Platform IDs", BranchError.ERR_BRANCH_INVALID_REQUEST));
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
        this.callback.onDataFetched(null, new BranchError("Failed to get the Cross Platform IDs", BranchError.ERR_BRANCH_INVALID_REQUEST));
    }

    @Override // io.branch.referral.ServerRequest
    public ServerRequest.BRANCH_API_VERSION getBranchRemoteAPIVersion() {
        return ServerRequest.BRANCH_API_VERSION.V1_CPID;
    }
}
