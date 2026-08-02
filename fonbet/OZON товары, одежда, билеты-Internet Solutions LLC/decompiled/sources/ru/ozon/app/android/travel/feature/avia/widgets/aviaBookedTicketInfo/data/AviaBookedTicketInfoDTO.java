package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.data;

import Bi.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0015HÆ\u0003J\u0092\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00152\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoDTO;", "", "payUntilBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "timeOutAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "timeToPay", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "flightCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "badges", "", "clickAction", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "backgroundColor", "showSkeleton", "", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Z)V", "getPayUntilBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTimeOutAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTimeToPay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getFlightCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBadges", "()Ljava/util/List;", "getClickAction", "getTrackingInfo", "()Ljava/util/Map;", "getBackgroundColor", "()Ljava/lang/String;", "getShowSkeleton", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Z)Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoDTO;", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaBookedTicketInfoDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final List<BadgeDTO> badges;
    private final AtomActionDTO clickAction;

    @NotNull
    private final CellDTO flightCell;
    private final BadgeDTO payUntilBadge;
    private final boolean showSkeleton;
    private final AtomActionDTO timeOutAction;
    private final Long timeToPay;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AviaBookedTicketInfoDTO(BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Long l11, @NotNull TextDTO title, @NotNull CellDTO flightCell, List<BadgeDTO> list, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(flightCell, "flightCell");
        this.payUntilBadge = badgeDTO;
        this.timeOutAction = atomActionDTO;
        this.timeToPay = l11;
        this.title = title;
        this.flightCell = flightCell;
        this.badges = list;
        this.clickAction = atomActionDTO2;
        this.trackingInfo = map;
        this.backgroundColor = str;
        this.showSkeleton = z11;
    }

    public static /* synthetic */ AviaBookedTicketInfoDTO copy$default(AviaBookedTicketInfoDTO aviaBookedTicketInfoDTO, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Long l11, TextDTO textDTO, CellDTO cellDTO, List list, AtomActionDTO atomActionDTO2, Map map, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeDTO = aviaBookedTicketInfoDTO.payUntilBadge;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = aviaBookedTicketInfoDTO.timeOutAction;
        }
        if ((i11 & 4) != 0) {
            l11 = aviaBookedTicketInfoDTO.timeToPay;
        }
        if ((i11 & 8) != 0) {
            textDTO = aviaBookedTicketInfoDTO.title;
        }
        if ((i11 & 16) != 0) {
            cellDTO = aviaBookedTicketInfoDTO.flightCell;
        }
        if ((i11 & 32) != 0) {
            list = aviaBookedTicketInfoDTO.badges;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO2 = aviaBookedTicketInfoDTO.clickAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = aviaBookedTicketInfoDTO.trackingInfo;
        }
        if ((i11 & 256) != 0) {
            str = aviaBookedTicketInfoDTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z11 = aviaBookedTicketInfoDTO.showSkeleton;
        }
        String str2 = str;
        boolean z12 = z11;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        Map map2 = map;
        CellDTO cellDTO2 = cellDTO;
        List list2 = list;
        return aviaBookedTicketInfoDTO.copy(badgeDTO, atomActionDTO, l11, textDTO, cellDTO2, list2, atomActionDTO3, map2, str2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final BadgeDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowSkeleton() {
        return this.showSkeleton;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getTimeOutAction() {
        return this.timeOutAction;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getTimeToPay() {
        return this.timeToPay;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CellDTO getFlightCell() {
        return this.flightCell;
    }

    public final List<BadgeDTO> component6() {
        return this.badges;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AviaBookedTicketInfoDTO copy(BadgeDTO payUntilBadge, AtomActionDTO timeOutAction, Long timeToPay, @NotNull TextDTO title, @NotNull CellDTO flightCell, List<BadgeDTO> badges, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo, String backgroundColor, boolean showSkeleton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(flightCell, "flightCell");
        return new AviaBookedTicketInfoDTO(payUntilBadge, timeOutAction, timeToPay, title, flightCell, badges, clickAction, trackingInfo, backgroundColor, showSkeleton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaBookedTicketInfoDTO)) {
            return false;
        }
        AviaBookedTicketInfoDTO aviaBookedTicketInfoDTO = (AviaBookedTicketInfoDTO) other;
        return Intrinsics.d(this.payUntilBadge, aviaBookedTicketInfoDTO.payUntilBadge) && Intrinsics.d(this.timeOutAction, aviaBookedTicketInfoDTO.timeOutAction) && Intrinsics.d(this.timeToPay, aviaBookedTicketInfoDTO.timeToPay) && Intrinsics.d(this.title, aviaBookedTicketInfoDTO.title) && Intrinsics.d(this.flightCell, aviaBookedTicketInfoDTO.flightCell) && Intrinsics.d(this.badges, aviaBookedTicketInfoDTO.badges) && Intrinsics.d(this.clickAction, aviaBookedTicketInfoDTO.clickAction) && Intrinsics.d(this.trackingInfo, aviaBookedTicketInfoDTO.trackingInfo) && Intrinsics.d(this.backgroundColor, aviaBookedTicketInfoDTO.backgroundColor) && this.showSkeleton == aviaBookedTicketInfoDTO.showSkeleton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final CellDTO getFlightCell() {
        return this.flightCell;
    }

    public final BadgeDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    public final boolean getShowSkeleton() {
        return this.showSkeleton;
    }

    public final AtomActionDTO getTimeOutAction() {
        return this.timeOutAction;
    }

    public final Long getTimeToPay() {
        return this.timeToPay;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        BadgeDTO badgeDTO = this.payUntilBadge;
        int hashCode = (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.timeOutAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Long l11 = this.timeToPay;
        int c11 = b.c(this.flightCell, Ns.b.a(this.title, (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31, 31), 31);
        List<BadgeDTO> list = this.badges;
        int hashCode3 = (c11 + (list == null ? 0 : list.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.clickAction;
        int hashCode4 = (hashCode3 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.backgroundColor;
        return Boolean.hashCode(this.showSkeleton) + ((hashCode5 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        BadgeDTO badgeDTO = this.payUntilBadge;
        AtomActionDTO atomActionDTO = this.timeOutAction;
        Long l11 = this.timeToPay;
        TextDTO textDTO = this.title;
        CellDTO cellDTO = this.flightCell;
        List<BadgeDTO> list = this.badges;
        AtomActionDTO atomActionDTO2 = this.clickAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str = this.backgroundColor;
        boolean z11 = this.showSkeleton;
        StringBuilder sb2 = new StringBuilder("AviaBookedTicketInfoDTO(payUntilBadge=");
        sb2.append(badgeDTO);
        sb2.append(", timeOutAction=");
        sb2.append(atomActionDTO);
        sb2.append(", timeToPay=");
        sb2.append(l11);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", flightCell=");
        sb2.append(cellDTO);
        sb2.append(", badges=");
        sb2.append(list);
        sb2.append(", clickAction=");
        Sh.b.f(sb2, atomActionDTO2, ", trackingInfo=", map, ", backgroundColor=");
        sb2.append(str);
        sb2.append(", showSkeleton=");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ AviaBookedTicketInfoDTO(BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Long l11, TextDTO textDTO, CellDTO cellDTO, List list, AtomActionDTO atomActionDTO2, Map map, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(badgeDTO, atomActionDTO, l11, textDTO, cellDTO, list, atomActionDTO2, map, str, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z11);
    }
}
