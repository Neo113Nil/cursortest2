package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes13.dex */
public class InterstitialActivity extends ControllerActivity {
    private static final String s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(s, X3.i.t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(s, X3.i.u0);
    }
}
