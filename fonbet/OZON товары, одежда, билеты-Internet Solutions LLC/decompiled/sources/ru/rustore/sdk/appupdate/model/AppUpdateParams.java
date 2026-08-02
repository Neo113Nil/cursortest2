package ru.rustore.sdk.appupdate.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/rustore/sdk/appupdate/model/AppUpdateParams;", "", "versionCode", "", "(J)V", "getVersionCode", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-public-appupdate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AppUpdateParams {
    private final long versionCode;

    public AppUpdateParams(long j11) {
        this.versionCode = j11;
    }

    public static /* synthetic */ AppUpdateParams copy$default(AppUpdateParams appUpdateParams, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = appUpdateParams.versionCode;
        }
        return appUpdateParams.copy(j11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final AppUpdateParams copy(long versionCode) {
        return new AppUpdateParams(versionCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppUpdateParams) && this.versionCode == ((AppUpdateParams) other).versionCode;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return Long.hashCode(this.versionCode);
    }

    @NotNull
    public String toString() {
        return "AppUpdateParams(versionCode=" + this.versionCode + ')';
    }
}
