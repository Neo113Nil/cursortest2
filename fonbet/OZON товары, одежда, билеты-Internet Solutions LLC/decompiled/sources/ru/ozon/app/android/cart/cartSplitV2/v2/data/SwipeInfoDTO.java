package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import HY.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/Map;)V", "getTrackingInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SwipeInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SwipeInfoDTO(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        this.trackingInfo = trackingInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwipeInfoDTO copy$default(SwipeInfoDTO swipeInfoDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = swipeInfoDTO.trackingInfo;
        }
        return swipeInfoDTO.copy(map);
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    @NotNull
    public final SwipeInfoDTO copy(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        return new SwipeInfoDTO(trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SwipeInfoDTO) && Intrinsics.d(this.trackingInfo, ((SwipeInfoDTO) other).trackingInfo);
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        return this.trackingInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return b.b("SwipeInfoDTO(trackingInfo=", ")", this.trackingInfo);
    }
}
