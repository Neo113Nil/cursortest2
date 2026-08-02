package com.google.ads.interactivemedia.v3.impl.data;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData;
import defpackage.l8o;
import defpackage.q1p;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class WebViewInitData {

    @NonNull
    public JavaScriptNativeBridgeInitData initData;
    public l8o omidInitializer;

    @NonNull
    public WebView webView;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q1p(zza = AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData.class)
    public static abstract class JavaScriptNativeBridgeInitData {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static abstract class Builder {
            @NonNull
            public abstract JavaScriptNativeBridgeInitData build();

            @NonNull
            public abstract Builder setAdTimeUpdateMs(@NonNull Long l);

            @NonNull
            public abstract Builder setAppSetIdTimeoutMs(@NonNull Long l);

            @NonNull
            public abstract Builder setConsentSettingsConfig(@NonNull ConsentSettingsConfig consentSettingsConfig);

            @NonNull
            public abstract Builder setDisableAppSetId(@NonNull Boolean bool);

            @NonNull
            public abstract Builder setDisableJsIdLessEvaluation(@NonNull Boolean bool);

            @NonNull
            public abstract Builder setEnableGks(@NonNull Boolean bool);

            @NonNull
            public abstract Builder setEnableInstrumentation(@NonNull Boolean bool);

            @NonNull
            public abstract Builder setEnableOmidJsManagedSessions(@NonNull Boolean bool);

            @NonNull
            public abstract Builder setEnableSeparateWebviewForDai(@NonNull Boolean bool);

            @NonNull
            public abstract Builder setEspAdapterTimeoutMs(@NonNull Integer num);

            @NonNull
            public abstract Builder setEspAdapters(@NonNull List<String> list);

            @NonNull
            public abstract Builder setGksDaiNativeXhrApps(@NonNull List<String> list);

            @NonNull
            public abstract Builder setGksFirstPartyAdServers(@NonNull List<String> list);

            @NonNull
            public abstract Builder setGksTimeoutMs(@NonNull Integer num);

            @NonNull
            public abstract Builder setJsConsentCheckRequiredParameters(@NonNull Set<String> set);

            @NonNull
            public abstract Builder setMsParameterTimeoutMs(@NonNull Integer num);

            @NonNull
            public abstract Builder setPlatformSignalCollectorTimeoutMs(@NonNull Integer num);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @q1p(zza = AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData_ConsentSettingsConfig.class)
        public static abstract class ConsentSettingsConfig {
            @NonNull
            public static ConsentSettingsConfig create(@NonNull Map<String, String> map) {
                return new AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData_ConsentSettingsConfig(map);
            }

            @Nullable
            public abstract Map<String, String> consentKeyTypes();
        }

        @NonNull
        public static Builder builder() {
            return new AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData.Builder();
        }

        @Nullable
        public abstract Long adTimeUpdateMs();

        @Nullable
        public abstract Long appSetIdTimeoutMs();

        @Nullable
        public abstract ConsentSettingsConfig consentSettingsConfig();

        @Nullable
        public abstract Boolean disableAppSetId();

        @Nullable
        public abstract Boolean disableJsIdLessEvaluation();

        @Nullable
        public abstract Boolean enableGks();

        @Nullable
        public abstract Boolean enableInstrumentation();

        @Nullable
        public abstract Boolean enableOmidJsManagedSessions();

        @Nullable
        public abstract Boolean enableSeparateWebviewForDai();

        @Nullable
        public abstract Integer espAdapterTimeoutMs();

        @Nullable
        public abstract List<String> espAdapters();

        @Nullable
        public abstract List<String> gksDaiNativeXhrApps();

        @Nullable
        public abstract List<String> gksFirstPartyAdServers();

        @Nullable
        public abstract Integer gksTimeoutMs();

        @Nullable
        public abstract Set<String> jsConsentCheckRequiredParameters();

        @Nullable
        public abstract Integer msParameterTimeoutMs();

        @Nullable
        public abstract Integer platformSignalCollectorTimeoutMs();
    }

    public WebViewInitData(JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData, WebView webView, l8o l8oVar) {
        this.initData = javaScriptNativeBridgeInitData;
        this.webView = webView;
        this.omidInitializer = l8oVar;
    }
}
