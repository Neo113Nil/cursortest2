package ru.ozon.android.messenger.blocks.travelOrders;

import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/blocks/travelOrders/TravelOrdersDTO;", "", "orders", "", "Lru/ozon/android/messenger/blocks/travelOrders/TravelOrderDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getOrders", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TravelOrdersDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CornerRadius cornerRadius;

    @NotNull
    private final List<TravelOrderDTO> orders;

    public TravelOrdersDTO(@NotNull List<TravelOrderDTO> orders, String str, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.orders = orders;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelOrdersDTO copy$default(TravelOrdersDTO travelOrdersDTO, List list, String str, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelOrdersDTO.orders;
        }
        if ((i11 & 2) != 0) {
            str = travelOrdersDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = travelOrdersDTO.cornerRadius;
        }
        return travelOrdersDTO.copy(list, str, cornerRadius);
    }

    @NotNull
    public final List<TravelOrderDTO> component1() {
        return this.orders;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final TravelOrdersDTO copy(@NotNull List<TravelOrderDTO> orders, String backgroundColor, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new TravelOrdersDTO(orders, backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelOrdersDTO)) {
            return false;
        }
        TravelOrdersDTO travelOrdersDTO = (TravelOrdersDTO) other;
        return Intrinsics.d(this.orders, travelOrdersDTO.orders) && Intrinsics.d(this.backgroundColor, travelOrdersDTO.backgroundColor) && this.cornerRadius == travelOrdersDTO.cornerRadius;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final List<TravelOrderDTO> getOrders() {
        return this.orders;
    }

    public int hashCode() {
        int hashCode = this.orders.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode2 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TravelOrderDTO> list = this.orders;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder a11 = C4055a.a("TravelOrdersDTO(orders=", ", backgroundColor=", str, ", cornerRadius=", list);
        a11.append(cornerRadius);
        a11.append(")");
        return a11.toString();
    }
}
