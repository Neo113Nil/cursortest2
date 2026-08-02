package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.appsflyer.internal.AFi1aSDK.AnonymousClass1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1aSDK {
    public static Uri AFKeystoreWrapper(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFi1aSDK aFi1aSDK = new AFi1aSDK(intent);
        Intrinsics.checkNotNullParameter("android.intent.extra.REFERRER", "");
        Uri uri = (Uri) ((Parcelable) aFi1aSDK.AFInAppEventType(aFi1aSDK.new AnonymousClass1("android.intent.extra.REFERRER"), "Error while trying to read android.intent.extra.REFERRER extra from intent", null, true));
        if (uri != null) {
            return uri;
        }
        String AFKeystoreWrapper = aFi1aSDK.AFKeystoreWrapper("android.intent.extra.REFERRER_NAME");
        if (AFKeystoreWrapper != null) {
            return Uri.parse(AFKeystoreWrapper);
        }
        return null;
    }
}
