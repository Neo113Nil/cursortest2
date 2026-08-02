package ai.verisoul.sdk.helpers.root;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011¨\u0006\u001d"}, d2 = {"Lai/verisoul/sdk/helpers/root/RootDetectionData;", "", "isRooted", "", "detectionMethod", "", "checksPassed", "", "checksFailed", "error", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getChecksFailed", "()Ljava/util/List;", "getChecksPassed", "getDetectionMethod", "()Ljava/lang/String;", "getError", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RootDetectionData {

    @NotNull
    private final List<String> checksFailed;

    @NotNull
    private final List<String> checksPassed;

    @NotNull
    private final String detectionMethod;

    @Nullable
    private final String error;
    private final boolean isRooted;

    public RootDetectionData() {
        this(false, null, null, null, null, 31, null);
    }

    public static /* synthetic */ RootDetectionData copy$default(RootDetectionData rootDetectionData, boolean z10, String str, List list, List list2, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = rootDetectionData.isRooted;
        }
        if ((i10 & 2) != 0) {
            str = rootDetectionData.detectionMethod;
        }
        if ((i10 & 4) != 0) {
            list = rootDetectionData.checksPassed;
        }
        if ((i10 & 8) != 0) {
            list2 = rootDetectionData.checksFailed;
        }
        if ((i10 & 16) != 0) {
            str2 = rootDetectionData.error;
        }
        String str3 = str2;
        List list3 = list;
        return rootDetectionData.copy(z10, str, list3, list2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRooted() {
        return this.isRooted;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDetectionMethod() {
        return this.detectionMethod;
    }

    @NotNull
    public final List<String> component3() {
        return this.checksPassed;
    }

    @NotNull
    public final List<String> component4() {
        return this.checksFailed;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final RootDetectionData copy(boolean isRooted, @NotNull String detectionMethod, @NotNull List<String> checksPassed, @NotNull List<String> checksFailed, @Nullable String error) {
        Intrinsics.checkNotNullParameter(detectionMethod, "detectionMethod");
        Intrinsics.checkNotNullParameter(checksPassed, "checksPassed");
        Intrinsics.checkNotNullParameter(checksFailed, "checksFailed");
        return new RootDetectionData(isRooted, detectionMethod, checksPassed, checksFailed, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RootDetectionData)) {
            return false;
        }
        RootDetectionData rootDetectionData = (RootDetectionData) other;
        return this.isRooted == rootDetectionData.isRooted && Intrinsics.areEqual(this.detectionMethod, rootDetectionData.detectionMethod) && Intrinsics.areEqual(this.checksPassed, rootDetectionData.checksPassed) && Intrinsics.areEqual(this.checksFailed, rootDetectionData.checksFailed) && Intrinsics.areEqual(this.error, rootDetectionData.error);
    }

    @NotNull
    public final List<String> getChecksFailed() {
        return this.checksFailed;
    }

    @NotNull
    public final List<String> getChecksPassed() {
        return this.checksPassed;
    }

    @NotNull
    public final String getDetectionMethod() {
        return this.detectionMethod;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.isRooted) * 31) + this.detectionMethod.hashCode()) * 31) + this.checksPassed.hashCode()) * 31) + this.checksFailed.hashCode()) * 31;
        String str = this.error;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isRooted() {
        return this.isRooted;
    }

    @NotNull
    public String toString() {
        return "RootDetectionData(isRooted=" + this.isRooted + ", detectionMethod=" + this.detectionMethod + ", checksPassed=" + this.checksPassed + ", checksFailed=" + this.checksFailed + ", error=" + this.error + ")";
    }

    public RootDetectionData(boolean z10, @NotNull String detectionMethod, @NotNull List<String> checksPassed, @NotNull List<String> checksFailed, @Nullable String str) {
        Intrinsics.checkNotNullParameter(detectionMethod, "detectionMethod");
        Intrinsics.checkNotNullParameter(checksPassed, "checksPassed");
        Intrinsics.checkNotNullParameter(checksFailed, "checksFailed");
        this.isRooted = z10;
        this.detectionMethod = detectionMethod;
        this.checksPassed = checksPassed;
        this.checksFailed = checksFailed;
        this.error = str;
    }

    public /* synthetic */ RootDetectionData(boolean z10, String str, List list, List list2, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "unknown" : str, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 16) != 0 ? null : str2);
    }
}
