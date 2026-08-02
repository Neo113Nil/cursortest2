package com.unity3d.ads;

import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.lm5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0017BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/InitializationConfiguration;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "isTestModeEnabled", "", "logLevel", "Lcom/unity3d/ads/LogLevel;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "<init>", "(Ljava/lang/String;ZLcom/unity3d/ads/LogLevel;Ljava/util/Map;Lcom/unity3d/ads/MediationInfo;)V", "getGameId", "()Ljava/lang/String;", "()Z", "getLogLevel", "()Lcom/unity3d/ads/LogLevel;", "getExtras", "()Ljava/util/Map;", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitializationConfiguration {

    @NotNull
    private final Map<String, String> extras;

    @NotNull
    private final String gameId;
    private final boolean isTestModeEnabled;

    @NotNull
    private final LogLevel logLevel;

    @Nullable
    private final MediationInfo mediationInfo;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/InitializationConfiguration$Builder;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "<init>", "(Ljava/lang/String;)V", "logLevel", "Lcom/unity3d/ads/LogLevel;", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "isTestModeEnabled", "", "withLogLevel", "withMediationInfo", "withExtras", "withTestMode", "build", "Lcom/unity3d/ads/InitializationConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private Map<String, String> extras;

        @NotNull
        private final String gameId;
        private boolean isTestModeEnabled;

        @NotNull
        private LogLevel logLevel;

        @Nullable
        private MediationInfo mediationInfo;

        public Builder(@NotNull String str) {
            str.getClass();
            this.gameId = str;
            this.logLevel = LogLevel.INFO;
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            this.extras = lm5Var;
        }

        @NotNull
        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.gameId, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> extras) {
            extras.getClass();
            this.extras = extras;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            logLevel.getClass();
            this.logLevel = logLevel;
            return this;
        }

        @NotNull
        public final Builder withMediationInfo(@Nullable MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        @NotNull
        public final Builder withTestMode(boolean isTestModeEnabled) {
            this.isTestModeEnabled = isTestModeEnabled;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InitializationConfiguration(String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, r3, map, (i & 16) != 0 ? null : mediationInfo);
        LogLevel logLevel2 = (i & 4) != 0 ? LogLevel.INFO : logLevel;
        if ((i & 8) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Nullable
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    /* renamed from: isTestModeEnabled, reason: from getter */
    public final boolean getIsTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public InitializationConfiguration(@NotNull String str, boolean z, @NotNull LogLevel logLevel, @NotNull Map<String, String> map, @Nullable MediationInfo mediationInfo) {
        str.getClass();
        logLevel.getClass();
        map.getClass();
        this.gameId = str;
        this.isTestModeEnabled = z;
        this.logLevel = logLevel;
        this.extras = map;
        this.mediationInfo = mediationInfo;
    }
}
