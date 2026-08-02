package ru.ozon.app.android.fresh.cart.widgets.cartMaster.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartMasterDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartSummaryItemDTO;", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getTrackingInfo", "()Ljava/util/Map;", "getSummary", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartMasterDTO {
    public static final int $stable = 8;
    private final List<CartSummaryItemDTO> summary;

    @NotNull
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CartMasterDTO(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo, List<CartSummaryItemDTO> list) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        this.trackingInfo = trackingInfo;
        this.summary = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartMasterDTO copy$default(CartMasterDTO cartMasterDTO, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = cartMasterDTO.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            list = cartMasterDTO.summary;
        }
        return cartMasterDTO.copy(map, list);
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    public final List<CartSummaryItemDTO> component2() {
        return this.summary;
    }

    @NotNull
    public final CartMasterDTO copy(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo, List<CartSummaryItemDTO> summary) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        return new CartMasterDTO(trackingInfo, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartMasterDTO)) {
            return false;
        }
        CartMasterDTO cartMasterDTO = (CartMasterDTO) other;
        return Intrinsics.d(this.trackingInfo, cartMasterDTO.trackingInfo) && Intrinsics.d(this.summary, cartMasterDTO.summary);
    }

    public final List<CartSummaryItemDTO> getSummary() {
        return this.summary;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.trackingInfo.hashCode() * 31;
        List<CartSummaryItemDTO> list = this.summary;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "CartMasterDTO(trackingInfo=" + this.trackingInfo + ", summary=" + this.summary + ")";
    }
}
