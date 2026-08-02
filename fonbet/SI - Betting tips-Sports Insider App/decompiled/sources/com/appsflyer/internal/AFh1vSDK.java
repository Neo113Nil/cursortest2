package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum AFh1vSDK {
    application,
    activity,
    other;

    public static AFh1vSDK getMediationNetwork(Context context) {
        return context instanceof Activity ? activity : context instanceof Application ? application : other;
    }
}
