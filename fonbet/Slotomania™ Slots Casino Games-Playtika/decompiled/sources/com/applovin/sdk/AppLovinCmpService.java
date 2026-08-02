package com.applovin.sdk;

import android.app.Activity;

/* loaded from: classes5.dex */
public interface AppLovinCmpService {

    public interface OnCompletedListener {
        void onCompleted(AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(Activity activity, OnCompletedListener onCompletedListener);
}
