package com.blaze.blazesdk.app_configurations.models.platform;

import androidx.annotation.Keep;
import com.blaze.blazesdk.app_configurations.models.configurations.ConfigurationsDto;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/platform/PlatformConfigurationsDto;", "", "configurations", "Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;", "baseURL", "", "<init>", "(Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;Ljava/lang/String;)V", "getConfigurations", "()Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;", "getBaseURL", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PlatformConfigurationsDto {
    public static final int $stable = 0;

    @b6h("baseURL")
    @Nullable
    private final String baseURL;

    @b6h("configurations")
    @Nullable
    private final ConfigurationsDto configurations;

    public /* synthetic */ PlatformConfigurationsDto(ConfigurationsDto configurationsDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConfigurationsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null) : configurationsDto, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ PlatformConfigurationsDto copy$default(PlatformConfigurationsDto platformConfigurationsDto, ConfigurationsDto configurationsDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            configurationsDto = platformConfigurationsDto.configurations;
        }
        if ((i & 2) != 0) {
            str = platformConfigurationsDto.baseURL;
        }
        return platformConfigurationsDto.copy(configurationsDto, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ConfigurationsDto getConfigurations() {
        return this.configurations;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBaseURL() {
        return this.baseURL;
    }

    @NotNull
    public final PlatformConfigurationsDto copy(@Nullable ConfigurationsDto configurations, @Nullable String baseURL) {
        return new PlatformConfigurationsDto(configurations, baseURL);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformConfigurationsDto)) {
            return false;
        }
        PlatformConfigurationsDto platformConfigurationsDto = (PlatformConfigurationsDto) other;
        return Intrinsics.c(this.configurations, platformConfigurationsDto.configurations) && Intrinsics.c(this.baseURL, platformConfigurationsDto.baseURL);
    }

    @Nullable
    public final String getBaseURL() {
        return this.baseURL;
    }

    @Nullable
    public final ConfigurationsDto getConfigurations() {
        return this.configurations;
    }

    public int hashCode() {
        ConfigurationsDto configurationsDto = this.configurations;
        int hashCode = (configurationsDto == null ? 0 : configurationsDto.hashCode()) * 31;
        String str = this.baseURL;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlatformConfigurationsDto(configurations=");
        sb.append(this.configurations);
        sb.append(", baseURL=");
        return lnb.q(sb, this.baseURL, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public PlatformConfigurationsDto(@Nullable ConfigurationsDto configurationsDto) {
        this(configurationsDto, null, 2, 0 == true ? 1 : 0);
    }

    @Keep
    public PlatformConfigurationsDto(@Nullable ConfigurationsDto configurationsDto, @Nullable String str) {
        this.configurations = configurationsDto;
        this.baseURL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public PlatformConfigurationsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
