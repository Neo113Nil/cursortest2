package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Build;
import android.os.ext.SdkExtensions;
import org.chromium.net.AbstractC8761e;
import org.chromium.net.i;

/* loaded from: classes6.dex */
public class HttpEngineNativeProvider extends org.chromium.net.g {
    public HttpEngineNativeProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.g
    public final AbstractC8761e.a createBuilder() {
        vf.c.c("HttpEngineNativeProvider#createBuilder");
        C2.M.e();
        return new i.a(new C8773l(C2.L.a(this.mContext)));
    }

    @Override // org.chromium.net.g
    public final String getName() {
        return "HttpEngine-Native-Provider";
    }

    @Override // org.chromium.net.g
    public final String getVersion() {
        String versionString;
        versionString = HttpEngine.getVersionString();
        return versionString;
    }

    @Override // org.chromium.net.g
    public final boolean isEnabled() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(31);
        return extensionVersion >= 7;
    }
}
