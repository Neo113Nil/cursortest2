package ai.verisoul.sdk.data.remote;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lai/verisoul/sdk/data/remote/SDKInfo;", "", "sdkVersion", "", "sdkName", "sdkType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSdkName", "()Ljava/lang/String;", "getSdkType", "getSdkVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SDKInfo {

    @c("sdk_name")
    @NotNull
    private final String sdkName;

    @c("sdk_type")
    @NotNull
    private final String sdkType;

    @c(EventKeys.SDK_VERSION_KEY)
    @NotNull
    private final String sdkVersion;

    public SDKInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SDKInfo copy$default(SDKInfo sDKInfo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sDKInfo.sdkVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = sDKInfo.sdkName;
        }
        if ((i10 & 4) != 0) {
            str3 = sDKInfo.sdkType;
        }
        return sDKInfo.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSdkName() {
        return this.sdkName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSdkType() {
        return this.sdkType;
    }

    @NotNull
    public final SDKInfo copy(@NotNull String sdkVersion, @NotNull String sdkName, @NotNull String sdkType) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkName, "sdkName");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        return new SDKInfo(sdkVersion, sdkName, sdkType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SDKInfo)) {
            return false;
        }
        SDKInfo sDKInfo = (SDKInfo) other;
        return Intrinsics.areEqual(this.sdkVersion, sDKInfo.sdkVersion) && Intrinsics.areEqual(this.sdkName, sDKInfo.sdkName) && Intrinsics.areEqual(this.sdkType, sDKInfo.sdkType);
    }

    @NotNull
    public final String getSdkName() {
        return this.sdkName;
    }

    @NotNull
    public final String getSdkType() {
        return this.sdkType;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        return (((this.sdkVersion.hashCode() * 31) + this.sdkName.hashCode()) * 31) + this.sdkType.hashCode();
    }

    @NotNull
    public String toString() {
        return "SDKInfo(sdkVersion=" + this.sdkVersion + ", sdkName=" + this.sdkName + ", sdkType=" + this.sdkType + ")";
    }

    public SDKInfo(@NotNull String sdkVersion, @NotNull String sdkName, @NotNull String sdkType) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkName, "sdkName");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        this.sdkVersion = sdkVersion;
        this.sdkName = sdkName;
        this.sdkType = sdkType;
    }

    public /* synthetic */ SDKInfo(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "1.0.0" : str, (i10 & 2) != 0 ? Constants.PLATFORM_ANDROID : str2, (i10 & 4) != 0 ? "native" : str3);
    }
}
