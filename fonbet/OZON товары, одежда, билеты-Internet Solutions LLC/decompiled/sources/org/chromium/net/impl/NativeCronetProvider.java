package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Build;
import android.os.ext.SdkExtensions;
import gm0.C6752a;
import java.util.Arrays;
import org.chromium.net.AbstractC8761e;
import org.chromium.net.httpflags.c;
import org.chromium.net.i;

/* loaded from: classes6.dex */
public class NativeCronetProvider extends org.chromium.net.g {
    public static final String OVERRIDE_NATIVE_CRONET_WITH_HTTPENGINE_FLAG = "Cronet_OverrideNativeCronetWithHttpEngine";
    private final HttpEngineNativeProvider mHttpEngineProvider;

    public NativeCronetProvider(Context context) {
        super(context);
        this.mHttpEngineProvider = new HttpEngineNativeProvider(this.mContext);
    }

    private boolean shouldUseHttpEngine() {
        boolean z11;
        c.b bVar;
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            if (extensionVersion >= 7) {
                z11 = true;
                return z11 && (bVar = C6752a.a(this.mContext).b().get(OVERRIDE_NATIVE_CRONET_WITH_HTTPENGINE_FLAG)) != null && bVar.c();
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    @Override // org.chromium.net.g
    public AbstractC8761e.a createBuilder() {
        return shouldUseHttpEngine() ? this.mHttpEngineProvider.createBuilder() : new i.a(new V(this.mContext));
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.g
    public String getName() {
        return org.chromium.net.g.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.g
    public String getVersion() {
        String versionString;
        if (!shouldUseHttpEngine()) {
            return ImplVersion.getCronetVersion();
        }
        this.mHttpEngineProvider.getClass();
        versionString = HttpEngine.getVersionString();
        return versionString;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.g
    public boolean isEnabled() {
        return true;
    }
}
