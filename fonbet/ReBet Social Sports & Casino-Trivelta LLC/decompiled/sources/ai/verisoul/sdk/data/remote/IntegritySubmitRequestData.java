package ai.verisoul.sdk.data.remote;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lai/verisoul/sdk/data/remote/IntegritySubmitRequestData;", "", "playIntegrityToken", "", "(Ljava/lang/String;)V", "getPlayIntegrityToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IntegritySubmitRequestData {

    @c("integrityToken")
    @NotNull
    private final String playIntegrityToken;

    public IntegritySubmitRequestData(@NotNull String playIntegrityToken) {
        Intrinsics.checkNotNullParameter(playIntegrityToken, "playIntegrityToken");
        this.playIntegrityToken = playIntegrityToken;
    }

    public static /* synthetic */ IntegritySubmitRequestData copy$default(IntegritySubmitRequestData integritySubmitRequestData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = integritySubmitRequestData.playIntegrityToken;
        }
        return integritySubmitRequestData.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlayIntegrityToken() {
        return this.playIntegrityToken;
    }

    @NotNull
    public final IntegritySubmitRequestData copy(@NotNull String playIntegrityToken) {
        Intrinsics.checkNotNullParameter(playIntegrityToken, "playIntegrityToken");
        return new IntegritySubmitRequestData(playIntegrityToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IntegritySubmitRequestData) && Intrinsics.areEqual(this.playIntegrityToken, ((IntegritySubmitRequestData) other).playIntegrityToken);
    }

    @NotNull
    public final String getPlayIntegrityToken() {
        return this.playIntegrityToken;
    }

    public int hashCode() {
        return this.playIntegrityToken.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntegritySubmitRequestData(playIntegrityToken=" + this.playIntegrityToken + ")";
    }
}
