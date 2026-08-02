package ru.ozon.app.android.travel.feature.general.order.widgets.orderHeader.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderHeader/data/OrderHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "orderStatus", "Lru/ozon/uni/atoms/data/badge/Badge;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOrderStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderHeaderDTO {
    public static final int $stable = 8;
    private final DisclaimerAtom disclaimer;

    @NotNull
    private final Badge orderStatus;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderHeaderDTO(@NotNull TextAtom title, @NotNull Badge orderStatus, DisclaimerAtom disclaimerAtom, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        this.title = title;
        this.orderStatus = orderStatus;
        this.disclaimer = disclaimerAtom;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderHeaderDTO copy$default(OrderHeaderDTO orderHeaderDTO, TextAtom textAtom, Badge badge, DisclaimerAtom disclaimerAtom, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = orderHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            badge = orderHeaderDTO.orderStatus;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = orderHeaderDTO.disclaimer;
        }
        if ((i11 & 8) != 0) {
            map = orderHeaderDTO.trackingInfo;
        }
        return orderHeaderDTO.copy(textAtom, badge, disclaimerAtom, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Badge getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderHeaderDTO copy(@NotNull TextAtom title, @NotNull Badge orderStatus, DisclaimerAtom disclaimer, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        return new OrderHeaderDTO(title, orderStatus, disclaimer, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderHeaderDTO)) {
            return false;
        }
        OrderHeaderDTO orderHeaderDTO = (OrderHeaderDTO) other;
        return Intrinsics.d(this.title, orderHeaderDTO.title) && Intrinsics.d(this.orderStatus, orderHeaderDTO.orderStatus) && Intrinsics.d(this.disclaimer, orderHeaderDTO.disclaimer) && Intrinsics.d(this.trackingInfo, orderHeaderDTO.trackingInfo);
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final Badge getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.orderStatus.hashCode() + (this.title.hashCode() * 31)) * 31;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode2 = (hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderHeaderDTO(title=" + this.title + ", orderStatus=" + this.orderStatus + ", disclaimer=" + this.disclaimer + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
