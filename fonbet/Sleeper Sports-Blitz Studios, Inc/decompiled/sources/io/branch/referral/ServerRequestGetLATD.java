package io.branch.referral;

import android.content.Context;
import io.branch.referral.ServerRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ServerRequestGetLATD extends ServerRequest {
    protected static final int defaultAttributionWindow = -1;
    private int attributionWindow;
    private BranchLastAttributedTouchDataListener callback;

    public interface BranchLastAttributedTouchDataListener {
        void onDataFetched(JSONObject jSONObject, BranchError branchError);
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

    ServerRequestGetLATD(Context context, String str, BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener) {
        this(context, str, branchLastAttributedTouchDataListener, PrefHelper.getInstance(context).getLATDAttributionWindow());
    }

    ServerRequestGetLATD(Context context, String str, BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener, int i) {
        super(context, str);
        this.callback = branchLastAttributedTouchDataListener;
        this.attributionWindow = i;
        JSONObject jSONObject = new JSONObject();
        try {
            setPost(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        updateEnvironment(context, jSONObject);
    }

    protected int getAttributionWindow() {
        return this.attributionWindow;
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        if (serverResponse != null) {
            BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener = this.callback;
            if (branchLastAttributedTouchDataListener != null) {
                branchLastAttributedTouchDataListener.onDataFetched(serverResponse.getObject(), null);
                return;
            }
            return;
        }
        handleFailure(BranchError.ERR_BRANCH_INVALID_REQUEST, "Failed to get last attributed touch data");
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
        BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener = this.callback;
        if (branchLastAttributedTouchDataListener != null) {
            branchLastAttributedTouchDataListener.onDataFetched(null, new BranchError("Failed to get last attributed touch data", BranchError.ERR_BRANCH_INVALID_REQUEST));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public ServerRequest.BRANCH_API_VERSION getBranchRemoteAPIVersion() {
        return ServerRequest.BRANCH_API_VERSION.V1_LATD;
    }
}
