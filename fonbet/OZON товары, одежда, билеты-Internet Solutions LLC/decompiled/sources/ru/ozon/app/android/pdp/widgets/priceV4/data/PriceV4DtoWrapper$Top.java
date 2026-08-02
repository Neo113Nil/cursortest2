package ru.ozon.app.android.pdp.widgets.priceV4.data;

import Ih.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"ru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$Top", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceAction", "Lru/ozon/uni/atoms/data/button/Icon;", "priceIcon", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV4DtoWrapper$Top {

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final AtomActionDTO priceAction;
    private final Icon priceIcon;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PriceV4DtoWrapper$Top(@NotNull PriceDTO price, @NotNull AtomActionDTO priceAction, Icon icon, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceAction, "priceAction");
        this.price = price;
        this.priceAction = priceAction;
        this.priceIcon = icon;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV4DtoWrapper$Top)) {
            return false;
        }
        PriceV4DtoWrapper$Top priceV4DtoWrapper$Top = (PriceV4DtoWrapper$Top) other;
        return Intrinsics.d(this.price, priceV4DtoWrapper$Top.price) && Intrinsics.d(this.priceAction, priceV4DtoWrapper$Top.priceAction) && Intrinsics.d(this.priceIcon, priceV4DtoWrapper$Top.priceIcon) && Intrinsics.d(this.trackingInfo, priceV4DtoWrapper$Top.trackingInfo);
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final AtomActionDTO getPriceAction() {
        return this.priceAction;
    }

    public final Icon getPriceIcon() {
        return this.priceIcon;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.priceAction, this.price.hashCode() * 31, 31);
        Icon icon = this.priceIcon;
        int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Top(price=" + this.price + ", priceAction=" + this.priceAction + ", priceIcon=" + this.priceIcon + ", trackingInfo=" + this.trackingInfo + ")";
    }

    public /* synthetic */ PriceV4DtoWrapper$Top(PriceDTO priceDTO, AtomActionDTO atomActionDTO, Icon icon, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(priceDTO, atomActionDTO, (i11 & 4) != 0 ? null : icon, map);
    }
}
