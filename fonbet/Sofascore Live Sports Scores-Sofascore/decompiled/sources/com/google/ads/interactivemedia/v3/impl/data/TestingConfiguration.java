package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_TestingConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.q1p;
import defpackage.q3p;
import defpackage.z3p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_TestingConfiguration.class, zzb = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
/* loaded from: classes2.dex */
public abstract class TestingConfiguration {

    @NonNull
    public static final String PARAMETER_KEY = "tcnfp";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Builder {
        @NonNull
        @KeepForSdk
        TestingConfiguration build();

        @NonNull
        Builder disableExperiments(boolean z);

        @NonNull
        Builder disableOnScreenDetection(boolean z);

        @NonNull
        Builder disableSkipFadeTransition(boolean z);

        @NonNull
        Builder enableMonitorAppLifecycle(boolean z);

        @NonNull
        Builder enableStrictJsonParsing(boolean z);

        Builder extraParams(z3p z3pVar);

        @NonNull
        Builder forceAndroidTvMode(boolean z);

        Builder forceExperimentIds(q3p q3pVar);

        @NonNull
        Builder forceTvMode(boolean z);

        @NonNull
        Builder ignoreStrictModeFalsePositives(boolean z);

        @NonNull
        Builder useTestStreamManager(boolean z);

        @NonNull
        Builder useVideoElementMock(boolean z);

        @NonNull
        Builder videoElementMockDuration(float f);
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        AutoValue_TestingConfiguration.Builder builder = new AutoValue_TestingConfiguration.Builder();
        builder.disableExperiments(true);
        builder.disableOnScreenDetection(false);
        builder.disableSkipFadeTransition(true);
        builder.useVideoElementMock(false);
        builder.videoElementMockDuration(30.0f);
        builder.useTestStreamManager(false);
        builder.ignoreStrictModeFalsePositives(false);
        builder.forceTvMode(false);
        builder.forceAndroidTvMode(false);
        builder.forceExperimentIds(null);
        builder.enableMonitorAppLifecycle(true);
        builder.enableStrictJsonParsing(true);
        return builder;
    }

    @NonNull
    @KeepForSdk
    public Builder copy() {
        AutoValue_TestingConfiguration.Builder builder = new AutoValue_TestingConfiguration.Builder();
        builder.disableExperiments(disableExperiments());
        builder.disableOnScreenDetection(disableOnScreenDetection());
        builder.disableSkipFadeTransition(disableSkipFadeTransition());
        builder.useVideoElementMock(useVideoElementMock());
        builder.videoElementMockDuration(videoElementMockDuration());
        builder.useTestStreamManager(useTestStreamManager());
        builder.forceExperimentIds(forceExperimentIds());
        builder.enableMonitorAppLifecycle(enableMonitorAppLifecycle());
        builder.forceTvMode(forceTvMode());
        builder.forceAndroidTvMode(forceAndroidTvMode());
        builder.ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives());
        builder.enableStrictJsonParsing(enableStrictJsonParsing());
        builder.extraParams(extraParams());
        return builder;
    }

    public abstract boolean disableExperiments();

    public abstract boolean disableOnScreenDetection();

    public abstract boolean disableSkipFadeTransition();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract boolean enableStrictJsonParsing();

    @Nullable
    public abstract z3p extraParams();

    public abstract boolean forceAndroidTvMode();

    @Nullable
    public abstract q3p forceExperimentIds();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();

    public abstract boolean useTestStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();
}
