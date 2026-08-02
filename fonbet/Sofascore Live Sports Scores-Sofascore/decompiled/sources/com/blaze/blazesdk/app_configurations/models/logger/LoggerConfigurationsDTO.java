package com.blaze.blazesdk.app_configurations.models.logger;

import androidx.annotation.Keep;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.b6h;
import defpackage.fc6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jh\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0002\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/logger/LoggerConfigurationsDTO;", "", "isEnabled", "", "loggerBatchIntervalInSeconds", "", "loggerMaxAllowedBatchSize", "loggerMinAllowedBatchSize", "logLevel", "Lcom/blaze/blazesdk/app_configurations/models/logger/LogLevelDTO;", "immediateLogLevel", "ignoredLogs", "", "Lcom/blaze/blazesdk/app_configurations/models/logger/IgnoredLogDTO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/app_configurations/models/logger/LogLevelDTO;Lcom/blaze/blazesdk/app_configurations/models/logger/LogLevelDTO;Ljava/util/List;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoggerBatchIntervalInSeconds", "()Ljava/lang/String;", "getLoggerMaxAllowedBatchSize", "getLoggerMinAllowedBatchSize", "getLogLevel", "()Lcom/blaze/blazesdk/app_configurations/models/logger/LogLevelDTO;", "getImmediateLogLevel", "getIgnoredLogs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/app_configurations/models/logger/LogLevelDTO;Lcom/blaze/blazesdk/app_configurations/models/logger/LogLevelDTO;Ljava/util/List;)Lcom/blaze/blazesdk/app_configurations/models/logger/LoggerConfigurationsDTO;", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LoggerConfigurationsDTO {
    public static final int $stable = 8;

    @b6h("ignoredLogs")
    @Nullable
    private final List<IgnoredLogDTO> ignoredLogs;

    @b6h("immediateLogLevel")
    @Nullable
    private final LogLevelDTO immediateLogLevel;

    @b6h("isEnabled")
    @Nullable
    private final Boolean isEnabled;

    @b6h("logLevel")
    @Nullable
    private final LogLevelDTO logLevel;

    @b6h("loggerBatchIntervalInSeconds")
    @Nullable
    private final String loggerBatchIntervalInSeconds;

    @b6h("loggerMaxAllowedBatchSize")
    @Nullable
    private final String loggerMaxAllowedBatchSize;

    @b6h("loggerMinAllowedBatchSize")
    @Nullable
    private final String loggerMinAllowedBatchSize;

    public /* synthetic */ LoggerConfigurationsDTO(Boolean bool, String str, String str2, String str3, LogLevelDTO logLevelDTO, LogLevelDTO logLevelDTO2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : logLevelDTO, (i & 32) != 0 ? null : logLevelDTO2, (i & 64) != 0 ? null : list);
    }

    public static /* synthetic */ LoggerConfigurationsDTO copy$default(LoggerConfigurationsDTO loggerConfigurationsDTO, Boolean bool, String str, String str2, String str3, LogLevelDTO logLevelDTO, LogLevelDTO logLevelDTO2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = loggerConfigurationsDTO.isEnabled;
        }
        if ((i & 2) != 0) {
            str = loggerConfigurationsDTO.loggerBatchIntervalInSeconds;
        }
        if ((i & 4) != 0) {
            str2 = loggerConfigurationsDTO.loggerMaxAllowedBatchSize;
        }
        if ((i & 8) != 0) {
            str3 = loggerConfigurationsDTO.loggerMinAllowedBatchSize;
        }
        if ((i & 16) != 0) {
            logLevelDTO = loggerConfigurationsDTO.logLevel;
        }
        if ((i & 32) != 0) {
            logLevelDTO2 = loggerConfigurationsDTO.immediateLogLevel;
        }
        if ((i & 64) != 0) {
            list = loggerConfigurationsDTO.ignoredLogs;
        }
        LogLevelDTO logLevelDTO3 = logLevelDTO2;
        List list2 = list;
        LogLevelDTO logLevelDTO4 = logLevelDTO;
        String str4 = str2;
        return loggerConfigurationsDTO.copy(bool, str, str4, str3, logLevelDTO4, logLevelDTO3, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLoggerBatchIntervalInSeconds() {
        return this.loggerBatchIntervalInSeconds;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLoggerMaxAllowedBatchSize() {
        return this.loggerMaxAllowedBatchSize;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getLoggerMinAllowedBatchSize() {
        return this.loggerMinAllowedBatchSize;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final LogLevelDTO getLogLevel() {
        return this.logLevel;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final LogLevelDTO getImmediateLogLevel() {
        return this.immediateLogLevel;
    }

    @Nullable
    public final List<IgnoredLogDTO> component7() {
        return this.ignoredLogs;
    }

    @NotNull
    public final LoggerConfigurationsDTO copy(@Nullable Boolean isEnabled, @Nullable String loggerBatchIntervalInSeconds, @Nullable String loggerMaxAllowedBatchSize, @Nullable String loggerMinAllowedBatchSize, @Nullable LogLevelDTO logLevel, @Nullable LogLevelDTO immediateLogLevel, @Nullable List<IgnoredLogDTO> ignoredLogs) {
        return new LoggerConfigurationsDTO(isEnabled, loggerBatchIntervalInSeconds, loggerMaxAllowedBatchSize, loggerMinAllowedBatchSize, logLevel, immediateLogLevel, ignoredLogs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoggerConfigurationsDTO)) {
            return false;
        }
        LoggerConfigurationsDTO loggerConfigurationsDTO = (LoggerConfigurationsDTO) other;
        return Intrinsics.c(this.isEnabled, loggerConfigurationsDTO.isEnabled) && Intrinsics.c(this.loggerBatchIntervalInSeconds, loggerConfigurationsDTO.loggerBatchIntervalInSeconds) && Intrinsics.c(this.loggerMaxAllowedBatchSize, loggerConfigurationsDTO.loggerMaxAllowedBatchSize) && Intrinsics.c(this.loggerMinAllowedBatchSize, loggerConfigurationsDTO.loggerMinAllowedBatchSize) && this.logLevel == loggerConfigurationsDTO.logLevel && this.immediateLogLevel == loggerConfigurationsDTO.immediateLogLevel && Intrinsics.c(this.ignoredLogs, loggerConfigurationsDTO.ignoredLogs);
    }

    @Nullable
    public final List<IgnoredLogDTO> getIgnoredLogs() {
        return this.ignoredLogs;
    }

    @Nullable
    public final LogLevelDTO getImmediateLogLevel() {
        return this.immediateLogLevel;
    }

    @Nullable
    public final LogLevelDTO getLogLevel() {
        return this.logLevel;
    }

    @Nullable
    public final String getLoggerBatchIntervalInSeconds() {
        return this.loggerBatchIntervalInSeconds;
    }

    @Nullable
    public final String getLoggerMaxAllowedBatchSize() {
        return this.loggerMaxAllowedBatchSize;
    }

    @Nullable
    public final String getLoggerMinAllowedBatchSize() {
        return this.loggerMinAllowedBatchSize;
    }

    public int hashCode() {
        Boolean bool = this.isEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.loggerBatchIntervalInSeconds;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.loggerMaxAllowedBatchSize;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loggerMinAllowedBatchSize;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LogLevelDTO logLevelDTO = this.logLevel;
        int hashCode5 = (hashCode4 + (logLevelDTO == null ? 0 : logLevelDTO.hashCode())) * 31;
        LogLevelDTO logLevelDTO2 = this.immediateLogLevel;
        int hashCode6 = (hashCode5 + (logLevelDTO2 == null ? 0 : logLevelDTO2.hashCode())) * 31;
        List<IgnoredLogDTO> list = this.ignoredLogs;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LoggerConfigurationsDTO(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", loggerBatchIntervalInSeconds=");
        sb.append(this.loggerBatchIntervalInSeconds);
        sb.append(", loggerMaxAllowedBatchSize=");
        sb.append(this.loggerMaxAllowedBatchSize);
        sb.append(", loggerMinAllowedBatchSize=");
        sb.append(this.loggerMinAllowedBatchSize);
        sb.append(", logLevel=");
        sb.append(this.logLevel);
        sb.append(", immediateLogLevel=");
        sb.append(this.immediateLogLevel);
        sb.append(", ignoredLogs=");
        return fc6.p(sb, this.ignoredLogs, ')');
    }

    public LoggerConfigurationsDTO(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable LogLevelDTO logLevelDTO, @Nullable LogLevelDTO logLevelDTO2, @Nullable List<IgnoredLogDTO> list) {
        this.isEnabled = bool;
        this.loggerBatchIntervalInSeconds = str;
        this.loggerMaxAllowedBatchSize = str2;
        this.loggerMinAllowedBatchSize = str3;
        this.logLevel = logLevelDTO;
        this.immediateLogLevel = logLevelDTO2;
        this.ignoredLogs = list;
    }

    public LoggerConfigurationsDTO() {
        this(null, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null);
    }
}
