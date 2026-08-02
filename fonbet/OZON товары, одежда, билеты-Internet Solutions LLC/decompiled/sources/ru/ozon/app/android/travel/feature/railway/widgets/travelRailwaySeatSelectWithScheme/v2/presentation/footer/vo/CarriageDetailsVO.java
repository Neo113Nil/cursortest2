package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo;

import El.C2971a;
import G.g;
import Gl.C3124a;
import Kk.C3532b;
import Pk0.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u00010BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "", "id", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO$CarriageDetailsIconVO;", "servicesIcon", "", "isServicesIconVisible", "Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "shiftedPreviewIcons", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "detailsBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(ILjava/util/List;ZLru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getServicesIcon", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "getShiftedPreviewIcons", "()Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetailsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "CarriageDetailsIconVO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CarriageDetailsVO implements TravelRailwaySeatSelectFooterVO.FooterItem {
    private final AtomAction action;

    @NotNull
    private final BadgeDTO detailsBadge;
    private final int id;
    private final boolean isServicesIconVisible;

    @NotNull
    private final List<CarriageDetailsIconVO> servicesIcon;
    private final ShiftedPreviewIconsVO shiftedPreviewIcons;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO$CarriageDetailsIconVO;", "", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "needFade", "<init>", "(ILru/ozon/uni/atoms/data/icon/IconDTO;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Z", "getNeedFade", "()Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageDetailsIconVO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;
        private final int id;
        private final boolean needFade;

        public CarriageDetailsIconVO(int i11, @NotNull IconDTO icon, boolean z11) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.id = i11;
            this.icon = icon;
            this.needFade = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageDetailsIconVO)) {
                return false;
            }
            CarriageDetailsIconVO carriageDetailsIconVO = (CarriageDetailsIconVO) other;
            return this.id == carriageDetailsIconVO.id && Intrinsics.d(this.icon, carriageDetailsIconVO.icon) && this.needFade == carriageDetailsIconVO.needFade;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final int getId() {
            return this.id;
        }

        public final boolean getNeedFade() {
            return this.needFade;
        }

        public int hashCode() {
            return Boolean.hashCode(this.needFade) + C2971a.a(this.icon, Integer.hashCode(this.id) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            IconDTO iconDTO = this.icon;
            boolean z11 = this.needFade;
            StringBuilder sb2 = new StringBuilder("CarriageDetailsIconVO(id=");
            sb2.append(i11);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", needFade=");
            return a.a(")", sb2, z11);
        }
    }

    public CarriageDetailsVO(int i11, @NotNull List<CarriageDetailsIconVO> servicesIcon, boolean z11, ShiftedPreviewIconsVO shiftedPreviewIconsVO, @NotNull BadgeDTO detailsBadge, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(servicesIcon, "servicesIcon");
        Intrinsics.checkNotNullParameter(detailsBadge, "detailsBadge");
        this.id = i11;
        this.servicesIcon = servicesIcon;
        this.isServicesIconVisible = z11;
        this.shiftedPreviewIcons = shiftedPreviewIconsVO;
        this.detailsBadge = detailsBadge;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarriageDetailsVO)) {
            return false;
        }
        CarriageDetailsVO carriageDetailsVO = (CarriageDetailsVO) other;
        return this.id == carriageDetailsVO.id && Intrinsics.d(this.servicesIcon, carriageDetailsVO.servicesIcon) && this.isServicesIconVisible == carriageDetailsVO.isServicesIconVisible && Intrinsics.d(this.shiftedPreviewIcons, carriageDetailsVO.shiftedPreviewIcons) && Intrinsics.d(this.detailsBadge, carriageDetailsVO.detailsBadge) && Intrinsics.d(this.action, carriageDetailsVO.action) && Intrinsics.d(this.tokenizedEvent, carriageDetailsVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final BadgeDTO getDetailsBadge() {
        return this.detailsBadge;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO.FooterItem
    public int getId() {
        return this.id;
    }

    @NotNull
    public final List<CarriageDetailsIconVO> getServicesIcon() {
        return this.servicesIcon;
    }

    public final ShiftedPreviewIconsVO getShiftedPreviewIcons() {
        return this.shiftedPreviewIcons;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(Integer.hashCode(this.id) * 31, 31, this.servicesIcon), 31, this.isServicesIconVisible);
        ShiftedPreviewIconsVO shiftedPreviewIconsVO = this.shiftedPreviewIcons;
        int c11 = C3124a.c(this.detailsBadge, (a11 + (shiftedPreviewIconsVO == null ? 0 : shiftedPreviewIconsVO.hashCode())) * 31, 31);
        AtomAction atomAction = this.action;
        int hashCode = (c11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isServicesIconVisible, reason: from getter */
    public final boolean getIsServicesIconVisible() {
        return this.isServicesIconVisible;
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        List<CarriageDetailsIconVO> list = this.servicesIcon;
        boolean z11 = this.isServicesIconVisible;
        ShiftedPreviewIconsVO shiftedPreviewIconsVO = this.shiftedPreviewIcons;
        BadgeDTO badgeDTO = this.detailsBadge;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CarriageDetailsVO(id=");
        sb2.append(i11);
        sb2.append(", servicesIcon=");
        sb2.append(list);
        sb2.append(", isServicesIconVisible=");
        sb2.append(z11);
        sb2.append(", shiftedPreviewIcons=");
        sb2.append(shiftedPreviewIconsVO);
        sb2.append(", detailsBadge=");
        sb2.append(badgeDTO);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        return b.d(sb2, tVar, ")");
    }
}
