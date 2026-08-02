package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import HY.b;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatusResult;", "", "cardStatus", "", "", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatus;", "<init>", "(Ljava/util/Map;)V", "getCardStatus", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayCardStatusResult {

    @NotNull
    private final Map<String, MirPayCardStatus> cardStatus;

    public MirPayCardStatusResult(@i(name = "card_results") @NotNull Map<String, MirPayCardStatus> cardStatus) {
        Intrinsics.checkNotNullParameter(cardStatus, "cardStatus");
        this.cardStatus = cardStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MirPayCardStatusResult copy$default(MirPayCardStatusResult mirPayCardStatusResult, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = mirPayCardStatusResult.cardStatus;
        }
        return mirPayCardStatusResult.copy(map);
    }

    @NotNull
    public final Map<String, MirPayCardStatus> component1() {
        return this.cardStatus;
    }

    @NotNull
    public final MirPayCardStatusResult copy(@i(name = "card_results") @NotNull Map<String, MirPayCardStatus> cardStatus) {
        Intrinsics.checkNotNullParameter(cardStatus, "cardStatus");
        return new MirPayCardStatusResult(cardStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MirPayCardStatusResult) && Intrinsics.d(this.cardStatus, ((MirPayCardStatusResult) other).cardStatus);
    }

    @NotNull
    public final Map<String, MirPayCardStatus> getCardStatus() {
        return this.cardStatus;
    }

    public int hashCode() {
        return this.cardStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return b.b("MirPayCardStatusResult(cardStatus=", ")", this.cardStatus);
    }
}
