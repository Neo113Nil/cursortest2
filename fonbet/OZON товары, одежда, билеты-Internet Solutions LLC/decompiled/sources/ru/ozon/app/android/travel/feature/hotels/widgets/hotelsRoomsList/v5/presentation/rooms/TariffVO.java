package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import Fm.C3051a;
import G.g;
import H00.a;
import Kk.C3532b;
import Pk0.f;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b\u0013\u00107R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b\u0014\u00107R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffState;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ServiceVO;", ResultDTO.CONTENT_TYPE_SERVICES, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "specialTariffBadge", "serviceBadge", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffBadge;", "badge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "", "actionButton", "", "borderColor", "", "isCompactWidth", "isSpecialBadgeHeight", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/text/TextDTO;", "roomsAvailable", "<init>", "(ILjava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffBadge;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/Object;Ljava/lang/String;ZZLWZ/t;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getServices", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSpecialTariffBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getServiceBadge", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffBadge;", "getBadge", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffBadge;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Ljava/lang/Object;", "getActionButton", "()Ljava/lang/Object;", "Ljava/lang/String;", "getBorderColor", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getRoomsAvailable", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffVO implements TariffState {

    @NotNull
    private final Object actionButton;

    @NotNull
    private final TariffBadge badge;
    private final String borderColor;
    private final int id;
    private final boolean isCompactWidth;
    private final boolean isSpecialBadgeHeight;

    @NotNull
    private final PriceDTO price;
    private final TextDTO roomsAvailable;
    private final BadgeDTO serviceBadge;

    @NotNull
    private final List<ServiceVO> services;
    private final BadgeDTO specialTariffBadge;
    private final t tokenizedEvent;

    public TariffVO(int i11, @NotNull List<ServiceVO> services, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, @NotNull TariffBadge badge, @NotNull PriceDTO price, @NotNull Object actionButton, String str, boolean z11, boolean z12, t tVar, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.id = i11;
        this.services = services;
        this.specialTariffBadge = badgeDTO;
        this.serviceBadge = badgeDTO2;
        this.badge = badge;
        this.price = price;
        this.actionButton = actionButton;
        this.borderColor = str;
        this.isCompactWidth = z11;
        this.isSpecialBadgeHeight = z12;
        this.tokenizedEvent = tVar;
        this.roomsAvailable = textDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TariffVO)) {
            return false;
        }
        TariffVO tariffVO = (TariffVO) other;
        return this.id == tariffVO.id && Intrinsics.d(this.services, tariffVO.services) && Intrinsics.d(this.specialTariffBadge, tariffVO.specialTariffBadge) && Intrinsics.d(this.serviceBadge, tariffVO.serviceBadge) && Intrinsics.d(this.badge, tariffVO.badge) && Intrinsics.d(this.price, tariffVO.price) && Intrinsics.d(this.actionButton, tariffVO.actionButton) && Intrinsics.d(this.borderColor, tariffVO.borderColor) && this.isCompactWidth == tariffVO.isCompactWidth && this.isSpecialBadgeHeight == tariffVO.isSpecialBadgeHeight && Intrinsics.d(this.tokenizedEvent, tariffVO.tokenizedEvent) && Intrinsics.d(this.roomsAvailable, tariffVO.roomsAvailable);
    }

    @NotNull
    public final Object getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final TariffBadge getBadge() {
        return this.badge;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffState
    public int getId() {
        return this.id;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final TextDTO getRoomsAvailable() {
        return this.roomsAvailable;
    }

    public final BadgeDTO getServiceBadge() {
        return this.serviceBadge;
    }

    @NotNull
    public final List<ServiceVO> getServices() {
        return this.services;
    }

    public final BadgeDTO getSpecialTariffBadge() {
        return this.specialTariffBadge;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int b11 = g.b(Integer.hashCode(this.id) * 31, 31, this.services);
        BadgeDTO badgeDTO = this.specialTariffBadge;
        int hashCode = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.serviceBadge;
        int c11 = a.c(C3051a.b(this.price, (this.badge.hashCode() + ((hashCode + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31)) * 31, 31), 31, this.actionButton);
        String str = this.borderColor;
        int a11 = C3532b.a(C3532b.a((c11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCompactWidth), 31, this.isSpecialBadgeHeight);
        t tVar = this.tokenizedEvent;
        int hashCode2 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TextDTO textDTO = this.roomsAvailable;
        return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    /* renamed from: isCompactWidth, reason: from getter */
    public final boolean getIsCompactWidth() {
        return this.isCompactWidth;
    }

    /* renamed from: isSpecialBadgeHeight, reason: from getter */
    public final boolean getIsSpecialBadgeHeight() {
        return this.isSpecialBadgeHeight;
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        List<ServiceVO> list = this.services;
        BadgeDTO badgeDTO = this.specialTariffBadge;
        BadgeDTO badgeDTO2 = this.serviceBadge;
        TariffBadge tariffBadge = this.badge;
        PriceDTO priceDTO = this.price;
        Object obj = this.actionButton;
        String str = this.borderColor;
        boolean z11 = this.isCompactWidth;
        boolean z12 = this.isSpecialBadgeHeight;
        t tVar = this.tokenizedEvent;
        TextDTO textDTO = this.roomsAvailable;
        StringBuilder sb2 = new StringBuilder("TariffVO(id=");
        sb2.append(i11);
        sb2.append(", services=");
        sb2.append(list);
        sb2.append(", specialTariffBadge=");
        sb2.append(badgeDTO);
        sb2.append(", serviceBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", badge=");
        sb2.append(tariffBadge);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", actionButton=");
        sb2.append(obj);
        sb2.append(", borderColor=");
        sb2.append(str);
        sb2.append(", isCompactWidth=");
        f.c(", isSpecialBadgeHeight=", ", tokenizedEvent=", sb2, z11, z12);
        sb2.append(tVar);
        sb2.append(", roomsAvailable=");
        sb2.append(textDTO);
        sb2.append(")");
        return sb2.toString();
    }
}
