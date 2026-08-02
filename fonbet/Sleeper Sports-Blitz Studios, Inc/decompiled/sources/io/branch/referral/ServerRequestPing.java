package io.branch.referral;

import android.content.Context;

/* loaded from: classes9.dex */
public class ServerRequestPing extends ServerRequest {
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
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
    }

    public ServerRequestPing(Context context) {
        super(context, null);
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        return !super.doesAppHasInternetPermission(context);
    }
}
