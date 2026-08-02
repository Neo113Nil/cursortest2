package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation;

import D40.d;
import Ds.C2880a;
import Fm.C3051a;
import G.g;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b4\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b5\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b\u0017\u0010?R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/TicketVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsListItemVO;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dateBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "airlineIcons", "Lru/ozon/uni/atoms/data/text/TextDTO;", "destination", "tripDuration", "tripTime", "transferText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "transferIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "cardClickAction", "", "borderColor", "", "isSingle", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ILru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;ZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDateBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Ljava/util/List;", "getAirlineIcons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDestination", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripDuration", "getTripTime", "getTransferText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTransferIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCardClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getBorderColor", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TicketVO implements HotTicketsListItemVO {

    @NotNull
    private final List<ImageDTO> airlineIcons;
    private final String borderColor;
    private final AtomAction cardClickAction;

    @NotNull
    private final BadgeDTO dateBadge;

    @NotNull
    private final TextDTO destination;
    private final int id;
    private final boolean isSingle;

    @NotNull
    private final PriceDTO price;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final IconDTO transferIcon;
    private final TextDTO transferText;

    @NotNull
    private final TextDTO tripDuration;
    private final TextDTO tripTime;

    public TicketVO(int i11, @NotNull BadgeDTO dateBadge, @NotNull PriceDTO price, @NotNull List<ImageDTO> airlineIcons, @NotNull TextDTO destination, @NotNull TextDTO tripDuration, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomAction atomAction, String str, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(dateBadge, "dateBadge");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(airlineIcons, "airlineIcons");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
        this.id = i11;
        this.dateBadge = dateBadge;
        this.price = price;
        this.airlineIcons = airlineIcons;
        this.destination = destination;
        this.tripDuration = tripDuration;
        this.tripTime = textDTO;
        this.transferText = textDTO2;
        this.transferIcon = iconDTO;
        this.cardClickAction = atomAction;
        this.borderColor = str;
        this.isSingle = z11;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketVO)) {
            return false;
        }
        TicketVO ticketVO = (TicketVO) other;
        return this.id == ticketVO.id && Intrinsics.d(this.dateBadge, ticketVO.dateBadge) && Intrinsics.d(this.price, ticketVO.price) && Intrinsics.d(this.airlineIcons, ticketVO.airlineIcons) && Intrinsics.d(this.destination, ticketVO.destination) && Intrinsics.d(this.tripDuration, ticketVO.tripDuration) && Intrinsics.d(this.tripTime, ticketVO.tripTime) && Intrinsics.d(this.transferText, ticketVO.transferText) && Intrinsics.d(this.transferIcon, ticketVO.transferIcon) && Intrinsics.d(this.cardClickAction, ticketVO.cardClickAction) && Intrinsics.d(this.borderColor, ticketVO.borderColor) && this.isSingle == ticketVO.isSingle && Intrinsics.d(this.trackingInfo, ticketVO.trackingInfo);
    }

    @NotNull
    public final List<ImageDTO> getAirlineIcons() {
        return this.airlineIcons;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final AtomAction getCardClickAction() {
        return this.cardClickAction;
    }

    @NotNull
    public final BadgeDTO getDateBadge() {
        return this.dateBadge;
    }

    @NotNull
    public final TextDTO getDestination() {
        return this.destination;
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsListItemVO
    public int getId() {
        return this.id;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final IconDTO getTransferIcon() {
        return this.transferIcon;
    }

    public final TextDTO getTransferText() {
        return this.transferText;
    }

    @NotNull
    public final TextDTO getTripDuration() {
        return this.tripDuration;
    }

    public final TextDTO getTripTime() {
        return this.tripTime;
    }

    public int hashCode() {
        int a11 = b.a(this.tripDuration, b.a(this.destination, g.b(C3051a.b(this.price, C3124a.c(this.dateBadge, Integer.hashCode(this.id) * 31, 31), 31), 31, this.airlineIcons), 31), 31);
        TextDTO textDTO = this.tripTime;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.transferText;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconDTO iconDTO = this.transferIcon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomAction atomAction = this.cardClickAction;
        int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.borderColor;
        int a12 = C3532b.a((hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSingle);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isSingle, reason: from getter */
    public final boolean getIsSingle() {
        return this.isSingle;
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        BadgeDTO badgeDTO = this.dateBadge;
        PriceDTO priceDTO = this.price;
        List<ImageDTO> list = this.airlineIcons;
        TextDTO textDTO = this.destination;
        TextDTO textDTO2 = this.tripDuration;
        TextDTO textDTO3 = this.tripTime;
        TextDTO textDTO4 = this.transferText;
        IconDTO iconDTO = this.transferIcon;
        AtomAction atomAction = this.cardClickAction;
        String str = this.borderColor;
        boolean z11 = this.isSingle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TicketVO(id=");
        sb2.append(i11);
        sb2.append(", dateBadge=");
        sb2.append(badgeDTO);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", airlineIcons=");
        sb2.append(list);
        sb2.append(", destination=");
        d.e(", tripDuration=", ", tripTime=", sb2, textDTO, textDTO2);
        d.e(", transferText=", ", transferIcon=", sb2, textDTO3, textDTO4);
        sb2.append(iconDTO);
        sb2.append(", cardClickAction=");
        sb2.append(atomAction);
        sb2.append(", borderColor=");
        C2880a.c(str, ", isSingle=", ", trackingInfo=", sb2, z11);
        return P.f(sb2, map, ")");
    }
}
