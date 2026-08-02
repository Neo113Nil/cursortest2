package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Build;
import android.os.ext.SdkExtensions;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import retrofit2.Reflection$Java8$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes10.dex */
public class HttpEngineNativeProvider extends CronetProvider {
    static final int EXT_API_LEVEL = 31;
    static final int EXT_VERSION = 7;
    public static final String PROVIDER_NAME_HTTPENGINE_NATIVE = "HttpEngine-Native-Provider";

    public HttpEngineNativeProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("HttpEngineNativeProvider#createBuilder");
        try {
            Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15657m();
            ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder(new AndroidHttpEngineBuilderWrapper(Reflection$Java8$$ExternalSyntheticApiModelOutline0.m(this.mContext)));
            if (scoped != null) {
                scoped.close();
            }
            return builder;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return PROVIDER_NAME_HTTPENGINE_NATIVE;
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String versionString;
        versionString = HttpEngine.getVersionString();
        return versionString;
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return isHttpEngineAvailable();
    }

    static boolean isHttpEngineAvailable() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(31);
        return extensionVersion >= 7;
    }
}
