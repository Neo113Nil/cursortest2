package io.branch.referral;

import android.app.Application;

/* loaded from: classes9.dex */
public class BranchApp extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (!BranchUtil.checkTestMode(this)) {
            Branch.getInstance(this);
        } else {
            Branch.getTestInstance(this);
        }
    }
}
