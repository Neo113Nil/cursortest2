package ru.ozon.app.android.orders.cml.deliveryOrderList.data;

import AZ.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/data/CitiesDTO;", "", "cityFrom", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cityTo", "separator", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getCityFrom", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCityTo", "getSeparator", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CitiesDTO {
    public static final int $stable = 0;
    private final BadgeDTO cityFrom;
    private final BadgeDTO cityTo;
    private final BadgeDTO separator;

    public CitiesDTO(BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3) {
        this.cityFrom = badgeDTO;
        this.cityTo = badgeDTO2;
        this.separator = badgeDTO3;
    }

    public static /* synthetic */ CitiesDTO copy$default(CitiesDTO citiesDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeDTO = citiesDTO.cityFrom;
        }
        if ((i11 & 2) != 0) {
            badgeDTO2 = citiesDTO.cityTo;
        }
        if ((i11 & 4) != 0) {
            badgeDTO3 = citiesDTO.separator;
        }
        return citiesDTO.copy(badgeDTO, badgeDTO2, badgeDTO3);
    }

    /* renamed from: component1, reason: from getter */
    public final BadgeDTO getCityFrom() {
        return this.cityFrom;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getCityTo() {
        return this.cityTo;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getSeparator() {
        return this.separator;
    }

    @NotNull
    public final CitiesDTO copy(BadgeDTO cityFrom, BadgeDTO cityTo, BadgeDTO separator) {
        return new CitiesDTO(cityFrom, cityTo, separator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitiesDTO)) {
            return false;
        }
        CitiesDTO citiesDTO = (CitiesDTO) other;
        return Intrinsics.d(this.cityFrom, citiesDTO.cityFrom) && Intrinsics.d(this.cityTo, citiesDTO.cityTo) && Intrinsics.d(this.separator, citiesDTO.separator);
    }

    public final BadgeDTO getCityFrom() {
        return this.cityFrom;
    }

    public final BadgeDTO getCityTo() {
        return this.cityTo;
    }

    public final BadgeDTO getSeparator() {
        return this.separator;
    }

    public int hashCode() {
        BadgeDTO badgeDTO = this.cityFrom;
        int hashCode = (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31;
        BadgeDTO badgeDTO2 = this.cityTo;
        int hashCode2 = (hashCode + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO3 = this.separator;
        return hashCode2 + (badgeDTO3 != null ? badgeDTO3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BadgeDTO badgeDTO = this.cityFrom;
        BadgeDTO badgeDTO2 = this.cityTo;
        BadgeDTO badgeDTO3 = this.separator;
        StringBuilder sb2 = new StringBuilder("CitiesDTO(cityFrom=");
        sb2.append(badgeDTO);
        sb2.append(", cityTo=");
        sb2.append(badgeDTO2);
        sb2.append(", separator=");
        return c.b(sb2, badgeDTO3, ")");
    }
}
