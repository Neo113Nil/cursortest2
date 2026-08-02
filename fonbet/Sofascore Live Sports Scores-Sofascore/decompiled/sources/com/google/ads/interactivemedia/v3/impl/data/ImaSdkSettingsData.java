package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_ImaSdkSettingsData;
import defpackage.bqn;
import defpackage.z3p;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ImaSdkSettingsData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        public abstract ImaSdkSettingsData build();

        public abstract Builder setAutoPlayAdBreaks(boolean z);

        public abstract Builder setDebugMode(boolean z);

        public abstract Builder setFeatureFlags(Map<String, String> map);

        public abstract Builder setNumRedirects(int i);

        public abstract Builder setPlayerType(String str);

        public abstract Builder setPlayerVersion(String str);

        public abstract Builder setPpid(String str);

        public abstract Builder setSessionId(String str);

        public abstract Builder setSupportsMultipleVideoDisplayChannels(boolean z);

        public abstract Builder setTestingConfig(TestingConfiguration testingConfiguration);
    }

    public static Builder builder() {
        return new AutoValue_ImaSdkSettingsData.Builder();
    }

    public static ImaSdkSettingsData createFromImaSdkSettingsImpl(bqn bqnVar) {
        Builder builder = builder();
        builder.setSupportsMultipleVideoDisplayChannels(true);
        bqnVar.getClass();
        builder.setPpid(null);
        builder.setPlayerType(bqnVar.a);
        builder.setPlayerVersion(bqnVar.b);
        builder.setNumRedirects(4);
        builder.setAutoPlayAdBreaks(true);
        builder.setDebugMode(bqnVar.c);
        builder.setSessionId(null);
        builder.setTestingConfig(null);
        builder.setFeatureFlags(null);
        return builder.build();
    }

    public abstract boolean autoPlayAdBreaks();

    public abstract boolean debugMode();

    public abstract z3p featureFlags();

    public abstract int numRedirects();

    @NonNull
    public abstract String playerType();

    @NonNull
    public abstract String playerVersion();

    @NonNull
    public abstract String ppid();

    @NonNull
    public abstract String sessionId();

    public abstract boolean supportsMultipleVideoDisplayChannels();

    @NonNull
    public abstract TestingConfiguration testingConfig();
}
