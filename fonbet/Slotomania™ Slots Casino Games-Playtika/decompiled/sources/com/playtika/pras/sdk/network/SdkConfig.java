package com.playtika.pras.sdk.network;

import android.os.Bundle;
import com.ironsource.X3;
import com.playtika.pras.sdk.network.models.SdkInitResponse;
import com.playtika.pras.sdk.network.models.WidgetGeneration;

/* loaded from: classes5.dex */
public class SdkConfig {
    private static SdkConfig INSTANCE = null;
    private static final String PLATFORM_PARAM = "BUNDLE_SDK_CONFIG_PLATFORM";
    private static final String SDK_INIT_RESPONSE_PARAM = "BUNDLE_SDK_CONFIG_INIT_RESPONSE_PARAM";
    private static final String WIDGET_GENERATION_PARAM = "BUNDLE_SDK_CONFIG_WIDGET_GENERATION";
    private final SdkInitResponse initResponse;
    private final String platform;
    private final WidgetGeneration widgetGeneration;

    private SdkConfig(SdkInitResponse sdkInitResponse, String str) {
        this.initResponse = sdkInitResponse;
        this.widgetGeneration = WidgetGeneration.GEN_4;
        this.platform = str;
    }

    public static SdkConfig getInstance() {
        return INSTANCE;
    }

    public static String getLockOrientation() {
        SdkConfig sdkConfig = INSTANCE;
        if (sdkConfig == null) {
            return X3.i.C;
        }
        SdkInitResponse sdkInitResponse = sdkConfig.initResponse;
        return sdkInitResponse != null ? sdkInitResponse.getWidgetParams().getLockOrientation() : sdkConfig.widgetGeneration.getValue() >= 5 ? X3.i.D : X3.i.C;
    }

    public static WidgetGeneration getWidgetGeneration() {
        SdkConfig sdkConfig = INSTANCE;
        return (sdkConfig == null || sdkConfig.initResponse != null) ? WidgetGeneration.GEN_4 : sdkConfig.widgetGeneration;
    }

    public static void init(SdkInitResponse sdkInitResponse, String str) {
        INSTANCE = new SdkConfig(sdkInitResponse, str);
    }

    public static void initFallback(WidgetGeneration widgetGeneration, String str) {
        INSTANCE = new SdkConfig(widgetGeneration, str);
    }

    public static boolean isDynamicConfigFlow() {
        SdkConfig sdkConfig = INSTANCE;
        return (sdkConfig == null || sdkConfig.initResponse == null) ? false : true;
    }

    public static boolean isFullScreen() {
        SdkConfig sdkConfig = INSTANCE;
        if (sdkConfig == null) {
            return false;
        }
        SdkInitResponse sdkInitResponse = sdkConfig.initResponse;
        return sdkInitResponse != null ? sdkInitResponse.getWidgetParams().isFullScreen() : sdkConfig.widgetGeneration.getValue() >= 5;
    }

    public static void restore(Bundle bundle) {
        String string = bundle.getString(PLATFORM_PARAM, "android");
        SdkInitResponse sdkInitResponse = (SdkInitResponse) bundle.getParcelable(SDK_INIT_RESPONSE_PARAM);
        if (sdkInitResponse != null) {
            init(sdkInitResponse, string);
        } else if (bundle.containsKey(WIDGET_GENERATION_PARAM)) {
            initFallback(WidgetGeneration.fromInt(bundle.getInt(WIDGET_GENERATION_PARAM, 4)), string);
        }
    }

    public static void save(Bundle bundle) {
        SdkConfig sdkConfig = INSTANCE;
        if (sdkConfig != null) {
            bundle.putString(PLATFORM_PARAM, sdkConfig.platform);
            SdkConfig sdkConfig2 = INSTANCE;
            SdkInitResponse sdkInitResponse = sdkConfig2.initResponse;
            if (sdkInitResponse != null) {
                bundle.putParcelable(SDK_INIT_RESPONSE_PARAM, sdkInitResponse);
            } else {
                bundle.putInt(WIDGET_GENERATION_PARAM, sdkConfig2.widgetGeneration.getValue());
            }
        }
    }

    public static boolean useInternalBrowserForRedirects() {
        Boolean isRedirectPMUseInternalBrowser;
        SdkConfig sdkConfig = INSTANCE;
        if (sdkConfig == null) {
            return true;
        }
        SdkInitResponse sdkInitResponse = sdkConfig.initResponse;
        return (sdkInitResponse == null || (isRedirectPMUseInternalBrowser = sdkInitResponse.isRedirectPMUseInternalBrowser()) == null) ? !"google_dtc".equals(INSTANCE.platform) : isRedirectPMUseInternalBrowser.booleanValue();
    }

    public SdkInitResponse getInitResponse() {
        return this.initResponse;
    }

    private SdkConfig(WidgetGeneration widgetGeneration, String str) {
        this.initResponse = null;
        this.widgetGeneration = widgetGeneration;
        this.platform = str;
    }
}
