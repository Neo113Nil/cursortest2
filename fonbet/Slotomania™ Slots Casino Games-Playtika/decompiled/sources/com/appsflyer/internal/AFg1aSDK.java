package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes7.dex */
public enum AFg1aSDK {
    application,
    activity,
    other;

    public static AFg1aSDK getRevenue(Context context) {
        if (context instanceof Activity) {
            return activity;
        }
        if (context instanceof Application) {
            return application;
        }
        return other;
    }
}
