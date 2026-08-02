package ru.ozon.fintech.settings.models;

import B0.C2454a;
import G.g;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/fintech/settings/models/FilterRequest;", "", "featureServiceEq", "", "featureNameLike", "platformName", "platformVersion", "", "applicationName", "applicationVersion", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V", "getFeatureServiceEq", "()Ljava/lang/String;", "getFeatureNameLike", "getPlatformName", "getPlatformVersion", "()I", "getApplicationName", "getApplicationVersion", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterRequest {

    @i(name = "application")
    @NotNull
    private final String applicationName;

    @i(name = "applicationVersion")
    private final long applicationVersion;

    @i(name = "featureNameLike")
    private final String featureNameLike;

    @i(name = "featureServiceEq")
    private final String featureServiceEq;

    @i(name = "platform")
    @NotNull
    private final String platformName;

    @i(name = "platformVersion")
    private final int platformVersion;

    public FilterRequest(String str, String str2, @NotNull String platformName, int i11, @NotNull String applicationName, long j11) {
        Intrinsics.checkNotNullParameter(platformName, "platformName");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        this.featureServiceEq = str;
        this.featureNameLike = str2;
        this.platformName = platformName;
        this.platformVersion = i11;
        this.applicationName = applicationName;
        this.applicationVersion = j11;
    }

    public static /* synthetic */ FilterRequest copy$default(FilterRequest filterRequest, String str, String str2, String str3, int i11, String str4, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = filterRequest.featureServiceEq;
        }
        if ((i12 & 2) != 0) {
            str2 = filterRequest.featureNameLike;
        }
        if ((i12 & 4) != 0) {
            str3 = filterRequest.platformName;
        }
        if ((i12 & 8) != 0) {
            i11 = filterRequest.platformVersion;
        }
        if ((i12 & 16) != 0) {
            str4 = filterRequest.applicationName;
        }
        if ((i12 & 32) != 0) {
            j11 = filterRequest.applicationVersion;
        }
        long j12 = j11;
        String str5 = str4;
        String str6 = str3;
        return filterRequest.copy(str, str2, str6, i11, str5, j12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFeatureServiceEq() {
        return this.featureServiceEq;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFeatureNameLike() {
        return this.featureNameLike;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPlatformVersion() {
        return this.platformVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component6, reason: from getter */
    public final long getApplicationVersion() {
        return this.applicationVersion;
    }

    @NotNull
    public final FilterRequest copy(String featureServiceEq, String featureNameLike, @NotNull String platformName, int platformVersion, @NotNull String applicationName, long applicationVersion) {
        Intrinsics.checkNotNullParameter(platformName, "platformName");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        return new FilterRequest(featureServiceEq, featureNameLike, platformName, platformVersion, applicationName, applicationVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterRequest)) {
            return false;
        }
        FilterRequest filterRequest = (FilterRequest) other;
        return Intrinsics.d(this.featureServiceEq, filterRequest.featureServiceEq) && Intrinsics.d(this.featureNameLike, filterRequest.featureNameLike) && Intrinsics.d(this.platformName, filterRequest.platformName) && this.platformVersion == filterRequest.platformVersion && Intrinsics.d(this.applicationName, filterRequest.applicationName) && this.applicationVersion == filterRequest.applicationVersion;
    }

    @NotNull
    public final String getApplicationName() {
        return this.applicationName;
    }

    public final long getApplicationVersion() {
        return this.applicationVersion;
    }

    public final String getFeatureNameLike() {
        return this.featureNameLike;
    }

    public final String getFeatureServiceEq() {
        return this.featureServiceEq;
    }

    @NotNull
    public final String getPlatformName() {
        return this.platformName;
    }

    public final int getPlatformVersion() {
        return this.platformVersion;
    }

    public int hashCode() {
        String str = this.featureServiceEq;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.featureNameLike;
        return Long.hashCode(this.applicationVersion) + g.a(C2454a.a(this.platformVersion, g.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.platformName), 31), 31, this.applicationName);
    }

    @NotNull
    public String toString() {
        String str = this.featureServiceEq;
        String str2 = this.featureNameLike;
        String str3 = this.platformName;
        int i11 = this.platformVersion;
        String str4 = this.applicationName;
        long j11 = this.applicationVersion;
        StringBuilder d11 = C3660k.d("FilterRequest(featureServiceEq=", str, ", featureNameLike=", str2, ", platformName=");
        Pk0.g.d(i11, str3, ", platformVersion=", ", applicationName=", d11);
        d11.append(str4);
        d11.append(", applicationVersion=");
        d11.append(j11);
        d11.append(")");
        return d11.toString();
    }
}
