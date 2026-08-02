package ai.verisoul.sdk.helpers.app_clone;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lai/verisoul/sdk/helpers/app_clone/PackageData;", "", "packageName", "", "firstInstallTime", "", "lastUpdateTime", "(Ljava/lang/String;JJ)V", "getFirstInstallTime", "()J", "getLastUpdateTime", "getPackageName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PackageData {

    @c("firstInstallTime")
    private final long firstInstallTime;

    @c("lastUpdateTime")
    private final long lastUpdateTime;

    @c("packageName")
    @NotNull
    private final String packageName;

    public PackageData(@NotNull String packageName, long j10, long j11) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.firstInstallTime = j10;
        this.lastUpdateTime = j11;
    }

    public static /* synthetic */ PackageData copy$default(PackageData packageData, String str, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = packageData.packageName;
        }
        if ((i10 & 2) != 0) {
            j10 = packageData.firstInstallTime;
        }
        if ((i10 & 4) != 0) {
            j11 = packageData.lastUpdateTime;
        }
        return packageData.copy(str, j10, j11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getFirstInstallTime() {
        return this.firstInstallTime;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final PackageData copy(@NotNull String packageName, long firstInstallTime, long lastUpdateTime) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new PackageData(packageName, firstInstallTime, lastUpdateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageData)) {
            return false;
        }
        PackageData packageData = (PackageData) other;
        return Intrinsics.areEqual(this.packageName, packageData.packageName) && this.firstInstallTime == packageData.firstInstallTime && this.lastUpdateTime == packageData.lastUpdateTime;
    }

    public final long getFirstInstallTime() {
        return this.firstInstallTime;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (((this.packageName.hashCode() * 31) + Long.hashCode(this.firstInstallTime)) * 31) + Long.hashCode(this.lastUpdateTime);
    }

    @NotNull
    public String toString() {
        return "PackageData(packageName=" + this.packageName + ", firstInstallTime=" + this.firstInstallTime + ", lastUpdateTime=" + this.lastUpdateTime + ")";
    }
}
