package spay.sdk.domain.model;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/domain/model/FraudMonInfo;", "", "resolution", "", "(Ljava/lang/String;)V", "getResolution", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FraudMonInfo {

    @NotNull
    public static final String CONFIRMED_FRAUD = "CONFIRMED_FRAUD";

    @NotNull
    public static final String CONFIRMED_GENUINE = "CONFIRMED_GENUINE";

    @NotNull
    public static final String UNKNOWN = "UNKNOWN";

    @NotNull
    private final String resolution;

    public FraudMonInfo(@NotNull String resolution) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        this.resolution = resolution;
    }

    public static /* synthetic */ FraudMonInfo copy$default(FraudMonInfo fraudMonInfo, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fraudMonInfo.resolution;
        }
        return fraudMonInfo.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getResolution() {
        return this.resolution;
    }

    @NotNull
    public final FraudMonInfo copy(@NotNull String resolution) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        return new FraudMonInfo(resolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FraudMonInfo) && Intrinsics.d(this.resolution, ((FraudMonInfo) other).resolution);
    }

    @NotNull
    public final String getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        return this.resolution.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("FraudMonInfo(resolution=", this.resolution, ")");
    }
}
