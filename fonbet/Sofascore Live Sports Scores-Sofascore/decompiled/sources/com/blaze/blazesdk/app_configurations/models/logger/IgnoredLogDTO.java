package com.blaze.blazesdk.app_configurations.models.logger;

import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/logger/IgnoredLogDTO;", "", "logIdentifier", "", "sdkType", "applyFromVersion", "applyBelowVersion", "applySpecificVersions", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLogIdentifier", "()Ljava/lang/String;", "getSdkType", "getApplyFromVersion", "getApplyBelowVersion", "getApplySpecificVersions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IgnoredLogDTO {
    public static final int $stable = 8;

    @b6h("applyBelowVersion")
    @Nullable
    private final String applyBelowVersion;

    @b6h("applyFromVersion")
    @Nullable
    private final String applyFromVersion;

    @b6h("applySpecificVersions")
    @Nullable
    private final List<String> applySpecificVersions;

    @b6h("logIdentifier")
    @Nullable
    private final String logIdentifier;

    @b6h("sdkType")
    @Nullable
    private final String sdkType;

    public /* synthetic */ IgnoredLogDTO(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }

    public static /* synthetic */ IgnoredLogDTO copy$default(IgnoredLogDTO ignoredLogDTO, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ignoredLogDTO.logIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = ignoredLogDTO.sdkType;
        }
        if ((i & 4) != 0) {
            str3 = ignoredLogDTO.applyFromVersion;
        }
        if ((i & 8) != 0) {
            str4 = ignoredLogDTO.applyBelowVersion;
        }
        if ((i & 16) != 0) {
            list = ignoredLogDTO.applySpecificVersions;
        }
        List list2 = list;
        String str5 = str3;
        return ignoredLogDTO.copy(str, str2, str5, str4, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLogIdentifier() {
        return this.logIdentifier;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSdkType() {
        return this.sdkType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getApplyFromVersion() {
        return this.applyFromVersion;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getApplyBelowVersion() {
        return this.applyBelowVersion;
    }

    @Nullable
    public final List<String> component5() {
        return this.applySpecificVersions;
    }

    @NotNull
    public final IgnoredLogDTO copy(@Nullable String logIdentifier, @Nullable String sdkType, @Nullable String applyFromVersion, @Nullable String applyBelowVersion, @Nullable List<String> applySpecificVersions) {
        return new IgnoredLogDTO(logIdentifier, sdkType, applyFromVersion, applyBelowVersion, applySpecificVersions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IgnoredLogDTO)) {
            return false;
        }
        IgnoredLogDTO ignoredLogDTO = (IgnoredLogDTO) other;
        return Intrinsics.c(this.logIdentifier, ignoredLogDTO.logIdentifier) && Intrinsics.c(this.sdkType, ignoredLogDTO.sdkType) && Intrinsics.c(this.applyFromVersion, ignoredLogDTO.applyFromVersion) && Intrinsics.c(this.applyBelowVersion, ignoredLogDTO.applyBelowVersion) && Intrinsics.c(this.applySpecificVersions, ignoredLogDTO.applySpecificVersions);
    }

    @Nullable
    public final String getApplyBelowVersion() {
        return this.applyBelowVersion;
    }

    @Nullable
    public final String getApplyFromVersion() {
        return this.applyFromVersion;
    }

    @Nullable
    public final List<String> getApplySpecificVersions() {
        return this.applySpecificVersions;
    }

    @Nullable
    public final String getLogIdentifier() {
        return this.logIdentifier;
    }

    @Nullable
    public final String getSdkType() {
        return this.sdkType;
    }

    public int hashCode() {
        String str = this.logIdentifier;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applyFromVersion;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applyBelowVersion;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.applySpecificVersions;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IgnoredLogDTO(logIdentifier=");
        sb.append(this.logIdentifier);
        sb.append(", sdkType=");
        sb.append(this.sdkType);
        sb.append(", applyFromVersion=");
        sb.append(this.applyFromVersion);
        sb.append(", applyBelowVersion=");
        sb.append(this.applyBelowVersion);
        sb.append(", applySpecificVersions=");
        return fc6.p(sb, this.applySpecificVersions, ')');
    }

    public IgnoredLogDTO(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list) {
        this.logIdentifier = str;
        this.sdkType = str2;
        this.applyFromVersion = str3;
        this.applyBelowVersion = str4;
        this.applySpecificVersions = list;
    }

    public IgnoredLogDTO() {
        this(null, null, null, null, null, 31, null);
    }
}
