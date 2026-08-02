package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation;

import Bi.b;
import E0.C2942q;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b1\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b\u0012\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b=\u0010-R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010\u001dR\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010;\u001a\u0004\bC\u0010<¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/presentation/AviaBookedTicketInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "payUntilBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "timeOutAction", "timeToPay", "mappingTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "flightCell", "", "badges", "", "isBadgesVisible", "clickAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", "backgroundColor", "shouldShowShimmer", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Long;JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPayUntilBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getTimeOutAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/Long;", "getTimeToPay", "()Ljava/lang/Long;", "getMappingTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getFlightCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Z", "()Z", "getClickAction", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Ljava/lang/String;", "getBackgroundColor", "getShouldShowShimmer", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaBookedTicketInfoVO implements c {
    private final String backgroundColor;
    private final List<BadgeDTO> badges;
    private final AtomAction clickAction;

    @NotNull
    private final CellDTO flightCell;
    private final long id;
    private final boolean isBadgesVisible;
    private final long mappingTime;
    private final BadgeDTO payUntilBadge;
    private final boolean shouldShowShimmer;
    private final AtomAction timeOutAction;
    private final Long timeToPay;

    @NotNull
    private final TextDTO title;
    private final t trackingInfo;

    public AviaBookedTicketInfoVO(long j11, BadgeDTO badgeDTO, AtomAction atomAction, Long l11, long j12, @NotNull TextDTO title, @NotNull CellDTO flightCell, List<BadgeDTO> list, boolean z11, AtomAction atomAction2, t tVar, String str, boolean z12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(flightCell, "flightCell");
        this.id = j11;
        this.payUntilBadge = badgeDTO;
        this.timeOutAction = atomAction;
        this.timeToPay = l11;
        this.mappingTime = j12;
        this.title = title;
        this.flightCell = flightCell;
        this.badges = list;
        this.isBadgesVisible = z11;
        this.clickAction = atomAction2;
        this.trackingInfo = tVar;
        this.backgroundColor = str;
        this.shouldShowShimmer = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaBookedTicketInfoVO)) {
            return false;
        }
        AviaBookedTicketInfoVO aviaBookedTicketInfoVO = (AviaBookedTicketInfoVO) other;
        return this.id == aviaBookedTicketInfoVO.id && Intrinsics.d(this.payUntilBadge, aviaBookedTicketInfoVO.payUntilBadge) && Intrinsics.d(this.timeOutAction, aviaBookedTicketInfoVO.timeOutAction) && Intrinsics.d(this.timeToPay, aviaBookedTicketInfoVO.timeToPay) && this.mappingTime == aviaBookedTicketInfoVO.mappingTime && Intrinsics.d(this.title, aviaBookedTicketInfoVO.title) && Intrinsics.d(this.flightCell, aviaBookedTicketInfoVO.flightCell) && Intrinsics.d(this.badges, aviaBookedTicketInfoVO.badges) && this.isBadgesVisible == aviaBookedTicketInfoVO.isBadgesVisible && Intrinsics.d(this.clickAction, aviaBookedTicketInfoVO.clickAction) && Intrinsics.d(this.trackingInfo, aviaBookedTicketInfoVO.trackingInfo) && Intrinsics.d(this.backgroundColor, aviaBookedTicketInfoVO.backgroundColor) && this.shouldShowShimmer == aviaBookedTicketInfoVO.shouldShowShimmer;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final AtomAction getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final CellDTO getFlightCell() {
        return this.flightCell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final long getMappingTime() {
        return this.mappingTime;
    }

    public final BadgeDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldShowShimmer() {
        return this.shouldShowShimmer;
    }

    public final AtomAction getTimeOutAction() {
        return this.timeOutAction;
    }

    public final Long getTimeToPay() {
        return this.timeToPay;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BadgeDTO badgeDTO = this.payUntilBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomAction atomAction = this.timeOutAction;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Long l11 = this.timeToPay;
        int c11 = b.c(this.flightCell, Ns.b.a(this.title, Pk0.c.a((hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.mappingTime), 31), 31);
        List<BadgeDTO> list = this.badges;
        int a11 = C3532b.a((c11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isBadgesVisible);
        AtomAction atomAction2 = this.clickAction;
        int hashCode4 = (a11 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
        t tVar = this.trackingInfo;
        int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.backgroundColor;
        return Boolean.hashCode(this.shouldShowShimmer) + ((hashCode5 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* renamed from: isBadgesVisible, reason: from getter */
    public final boolean getIsBadgesVisible() {
        return this.isBadgesVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        BadgeDTO badgeDTO = this.payUntilBadge;
        AtomAction atomAction = this.timeOutAction;
        Long l11 = this.timeToPay;
        long j12 = this.mappingTime;
        TextDTO textDTO = this.title;
        CellDTO cellDTO = this.flightCell;
        List<BadgeDTO> list = this.badges;
        boolean z11 = this.isBadgesVisible;
        AtomAction atomAction2 = this.clickAction;
        t tVar = this.trackingInfo;
        String str = this.backgroundColor;
        boolean z12 = this.shouldShowShimmer;
        StringBuilder sb2 = new StringBuilder("AviaBookedTicketInfoVO(id=");
        sb2.append(j11);
        sb2.append(", payUntilBadge=");
        sb2.append(badgeDTO);
        sb2.append(", timeOutAction=");
        sb2.append(atomAction);
        sb2.append(", timeToPay=");
        sb2.append(l11);
        C2942q.f(sb2, ", mappingTime=", j12, ", title=");
        sb2.append(textDTO);
        sb2.append(", flightCell=");
        sb2.append(cellDTO);
        sb2.append(", badges=");
        sb2.append(list);
        sb2.append(", isBadgesVisible=");
        sb2.append(z11);
        sb2.append(", clickAction=");
        sb2.append(atomAction2);
        sb2.append(", trackingInfo=");
        sb2.append(tVar);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", shouldShowShimmer=");
        sb2.append(z12);
        sb2.append(")");
        return sb2.toString();
    }
}
