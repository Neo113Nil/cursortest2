package com.unity3d.ads.core.data.model;

import com.unity3d.ads.LogLevel;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.dmi;
import defpackage.lm5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "isTestModeEnabled", "", "logLevel", "Lcom/unity3d/ads/LogLevel;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "<init>", "(Ljava/lang/String;ZLcom/unity3d/ads/LogLevel;Ljava/util/Map;Lcom/unity3d/ads/MediationInfo;)V", "getGameId", "()Ljava/lang/String;", "()Z", "getLogLevel", "()Lcom/unity3d/ads/LogLevel;", "getExtras", "()Ljava/util/Map;", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InitializationConfigurationInternal {

    @NotNull
    private final Map<String, String> extras;

    @NotNull
    private final String gameId;
    private final boolean isTestModeEnabled;

    @NotNull
    private final LogLevel logLevel;

    @Nullable
    private final MediationInfo mediationInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InitializationConfigurationInternal(String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, r3, map, (i & 16) != 0 ? null : mediationInfo);
        LogLevel logLevel2 = (i & 4) != 0 ? LogLevel.INFO : logLevel;
        if ((i & 8) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    public static /* synthetic */ InitializationConfigurationInternal copy$default(InitializationConfigurationInternal initializationConfigurationInternal, String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationConfigurationInternal.gameId;
        }
        if ((i & 2) != 0) {
            z = initializationConfigurationInternal.isTestModeEnabled;
        }
        if ((i & 4) != 0) {
            logLevel = initializationConfigurationInternal.logLevel;
        }
        if ((i & 8) != 0) {
            map = initializationConfigurationInternal.extras;
        }
        if ((i & 16) != 0) {
            mediationInfo = initializationConfigurationInternal.mediationInfo;
        }
        MediationInfo mediationInfo2 = mediationInfo;
        LogLevel logLevel2 = logLevel;
        return initializationConfigurationInternal.copy(str, z, logLevel2, map, mediationInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.extras;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    @NotNull
    public final InitializationConfigurationInternal copy(@NotNull String gameId, boolean isTestModeEnabled, @NotNull LogLevel logLevel, @NotNull Map<String, String> extras, @Nullable MediationInfo mediationInfo) {
        gameId.getClass();
        logLevel.getClass();
        extras.getClass();
        return new InitializationConfigurationInternal(gameId, isTestModeEnabled, logLevel, extras, mediationInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializationConfigurationInternal)) {
            return false;
        }
        InitializationConfigurationInternal initializationConfigurationInternal = (InitializationConfigurationInternal) other;
        return Intrinsics.c(this.gameId, initializationConfigurationInternal.gameId) && this.isTestModeEnabled == initializationConfigurationInternal.isTestModeEnabled && this.logLevel == initializationConfigurationInternal.logLevel && Intrinsics.c(this.extras, initializationConfigurationInternal.extras) && Intrinsics.c(this.mediationInfo, initializationConfigurationInternal.mediationInfo);
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

    public int hashCode() {
        int g = dmi.g(this.extras, (this.logLevel.hashCode() + dmi.e(this.gameId.hashCode() * 31, 31, this.isTestModeEnabled)) * 31, 31);
        MediationInfo mediationInfo = this.mediationInfo;
        return g + (mediationInfo == null ? 0 : mediationInfo.hashCode());
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    @NotNull
    public String toString() {
        return "InitializationConfigurationInternal(gameId=" + this.gameId + ", isTestModeEnabled=" + this.isTestModeEnabled + ", logLevel=" + this.logLevel + ", extras=" + this.extras + ", mediationInfo=" + this.mediationInfo + ')';
    }

    public InitializationConfigurationInternal(@NotNull String str, boolean z, @NotNull LogLevel logLevel, @NotNull Map<String, String> map, @Nullable MediationInfo mediationInfo) {
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
