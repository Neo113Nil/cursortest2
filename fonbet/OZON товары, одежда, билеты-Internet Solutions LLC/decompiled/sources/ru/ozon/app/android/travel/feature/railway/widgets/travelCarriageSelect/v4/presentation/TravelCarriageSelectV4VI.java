package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation;

import De.C2859b;
import El.C2971a;
import G.g;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import Pk0.a;
import Tz.C4055a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7829k0;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardComposeVO;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001:\u0004EFGHB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b2\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b\u0010\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b>\u0010/R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "type", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "typeBadge", "number", "seatsCount", "seatsDetails", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$StoreyVI;", "storeys", "", "isStoreysVisible", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;", "details", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$PriceBlockVI;", "priceBlock", "bonusBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ZLru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$PriceBlockVI;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getType", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTypeBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNumber", "getSeatsCount", "getSeatsDetails", "Ljava/util/List;", "getStoreys", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;", "getDetails", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$PriceBlockVI;", "getPriceBlock", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$PriceBlockVI;", "getBonusBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "StoreyVI", "DetailsVI", "PriceBlockVI", "IconVI", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCarriageSelectV4VI implements c {
    private final AtomAction action;
    private final BadgeDTO bonusBadge;

    @NotNull
    private final DetailsVI details;
    private final long id;
    private final boolean isStoreysVisible;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final TextDTO number;

    @NotNull
    private final PriceBlockVI priceBlock;

    @NotNull
    private final TextDTO seatsCount;
    private final TextDTO seatsDetails;

    @NotNull
    private final List<StoreyVI> storeys;
    private final t tokenizedEvent;
    private final TextDTO type;
    private final BadgeDTO typeBadge;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;", "", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$IconVI;", "servicesIcon", "", "isServicesIconVisible", "Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "shiftedPreviewIcons", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "detailsBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/util/List;ZLru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getServicesIcon", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "getShiftedPreviewIcons", "()Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetailsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailsVI {
        private final AtomAction action;

        @NotNull
        private final BadgeDTO detailsBadge;
        private final boolean isServicesIconVisible;

        @NotNull
        private final List<IconVI> servicesIcon;
        private final ShiftedPreviewIconsVO shiftedPreviewIcons;
        private final t tokenizedEvent;

        public DetailsVI(@NotNull List<IconVI> servicesIcon, boolean z11, ShiftedPreviewIconsVO shiftedPreviewIconsVO, @NotNull BadgeDTO detailsBadge, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(servicesIcon, "servicesIcon");
            Intrinsics.checkNotNullParameter(detailsBadge, "detailsBadge");
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
            if (!(other instanceof DetailsVI)) {
                return false;
            }
            DetailsVI detailsVI = (DetailsVI) other;
            return Intrinsics.d(this.servicesIcon, detailsVI.servicesIcon) && this.isServicesIconVisible == detailsVI.isServicesIconVisible && Intrinsics.d(this.shiftedPreviewIcons, detailsVI.shiftedPreviewIcons) && Intrinsics.d(this.detailsBadge, detailsVI.detailsBadge) && Intrinsics.d(this.action, detailsVI.action) && Intrinsics.d(this.tokenizedEvent, detailsVI.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final BadgeDTO getDetailsBadge() {
            return this.detailsBadge;
        }

        @NotNull
        public final List<IconVI> getServicesIcon() {
            return this.servicesIcon;
        }

        public final ShiftedPreviewIconsVO getShiftedPreviewIcons() {
            return this.shiftedPreviewIcons;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.servicesIcon.hashCode() * 31, 31, this.isServicesIconVisible);
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
            List<IconVI> list = this.servicesIcon;
            boolean z11 = this.isServicesIconVisible;
            ShiftedPreviewIconsVO shiftedPreviewIconsVO = this.shiftedPreviewIcons;
            BadgeDTO badgeDTO = this.detailsBadge;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("DetailsVI(servicesIcon=");
            sb2.append(list);
            sb2.append(", isServicesIconVisible=");
            sb2.append(z11);
            sb2.append(", shiftedPreviewIcons=");
            sb2.append(shiftedPreviewIconsVO);
            sb2.append(", detailsBadge=");
            sb2.append(badgeDTO);
            sb2.append(", action=");
            return C2859b.e(tVar, ", tokenizedEvent=", ")", sb2, atomAction);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$IconVI;", "", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "needFade", "<init>", "(ILru/ozon/uni/atoms/data/icon/IconDTO;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Z", "getNeedFade", "()Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconVI {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;
        private final int id;
        private final boolean needFade;

        public IconVI(int i11, @NotNull IconDTO icon, boolean z11) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.id = i11;
            this.icon = icon;
            this.needFade = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconVI)) {
                return false;
            }
            IconVI iconVI = (IconVI) other;
            return this.id == iconVI.id && Intrinsics.d(this.icon, iconVI.icon) && this.needFade == iconVI.needFade;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
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
            StringBuilder sb2 = new StringBuilder("IconVI(id=");
            sb2.append(i11);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", needFade=");
            return a.a(")", sb2, z11);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$PriceBlockVI;", "", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;", "discountPriceCard", "originalPriceCard", "<init>", "(Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;", "getDiscountPriceCard", "()Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;", "getOriginalPriceCard", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceBlockVI {
        public static final int $stable = PriceCardComposeVO.$stable;
        private final PriceCardComposeVO discountPriceCard;

        @NotNull
        private final PriceCardComposeVO originalPriceCard;

        public PriceBlockVI(PriceCardComposeVO priceCardComposeVO, @NotNull PriceCardComposeVO originalPriceCard) {
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            this.discountPriceCard = priceCardComposeVO;
            this.originalPriceCard = originalPriceCard;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceBlockVI)) {
                return false;
            }
            PriceBlockVI priceBlockVI = (PriceBlockVI) other;
            return Intrinsics.d(this.discountPriceCard, priceBlockVI.discountPriceCard) && Intrinsics.d(this.originalPriceCard, priceBlockVI.originalPriceCard);
        }

        public final PriceCardComposeVO getDiscountPriceCard() {
            return this.discountPriceCard;
        }

        @NotNull
        public final PriceCardComposeVO getOriginalPriceCard() {
            return this.originalPriceCard;
        }

        public int hashCode() {
            PriceCardComposeVO priceCardComposeVO = this.discountPriceCard;
            return this.originalPriceCard.hashCode() + ((priceCardComposeVO == null ? 0 : priceCardComposeVO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "PriceBlockVI(discountPriceCard=" + this.discountPriceCard + ", originalPriceCard=" + this.originalPriceCard + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$StoreyVI;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ll1/k0;", "darkSchemeImage", "lightSchemeImage", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "noStoreysInfo", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Ll1/k0;Ll1/k0;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ll1/k0;", "getDarkSchemeImage", "()Ll1/k0;", "getLightSchemeImage", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getNoStoreysInfo", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StoreyVI {
        private final InterfaceC7829k0 darkSchemeImage;
        private final int id;
        private final InterfaceC7829k0 lightSchemeImage;
        private final TextDTO name;
        private final DisclaimerDTO noStoreysInfo;

        public StoreyVI(int i11, TextDTO textDTO, InterfaceC7829k0 interfaceC7829k0, InterfaceC7829k0 interfaceC7829k02, DisclaimerDTO disclaimerDTO) {
            this.id = i11;
            this.name = textDTO;
            this.darkSchemeImage = interfaceC7829k0;
            this.lightSchemeImage = interfaceC7829k02;
            this.noStoreysInfo = disclaimerDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoreyVI)) {
                return false;
            }
            StoreyVI storeyVI = (StoreyVI) other;
            return this.id == storeyVI.id && Intrinsics.d(this.name, storeyVI.name) && Intrinsics.d(this.darkSchemeImage, storeyVI.darkSchemeImage) && Intrinsics.d(this.lightSchemeImage, storeyVI.lightSchemeImage) && Intrinsics.d(this.noStoreysInfo, storeyVI.noStoreysInfo);
        }

        public final InterfaceC7829k0 getDarkSchemeImage() {
            return this.darkSchemeImage;
        }

        public final InterfaceC7829k0 getLightSchemeImage() {
            return this.lightSchemeImage;
        }

        public final TextDTO getName() {
            return this.name;
        }

        public final DisclaimerDTO getNoStoreysInfo() {
            return this.noStoreysInfo;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.name;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            InterfaceC7829k0 interfaceC7829k0 = this.darkSchemeImage;
            int hashCode3 = (hashCode2 + (interfaceC7829k0 == null ? 0 : interfaceC7829k0.hashCode())) * 31;
            InterfaceC7829k0 interfaceC7829k02 = this.lightSchemeImage;
            int hashCode4 = (hashCode3 + (interfaceC7829k02 == null ? 0 : interfaceC7829k02.hashCode())) * 31;
            DisclaimerDTO disclaimerDTO = this.noStoreysInfo;
            return hashCode4 + (disclaimerDTO != null ? disclaimerDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.name;
            InterfaceC7829k0 interfaceC7829k0 = this.darkSchemeImage;
            InterfaceC7829k0 interfaceC7829k02 = this.lightSchemeImage;
            DisclaimerDTO disclaimerDTO = this.noStoreysInfo;
            StringBuilder b11 = C4055a.b(textDTO, "StoreyVI(id=", ", name=", ", darkSchemeImage=", i11);
            b11.append(interfaceC7829k0);
            b11.append(", lightSchemeImage=");
            b11.append(interfaceC7829k02);
            b11.append(", noStoreysInfo=");
            b11.append(disclaimerDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    public TravelCarriageSelectV4VI(long j11, @NotNull TextDTO name, TextDTO textDTO, BadgeDTO badgeDTO, @NotNull TextDTO number, @NotNull TextDTO seatsCount, TextDTO textDTO2, @NotNull List<StoreyVI> storeys, boolean z11, @NotNull DetailsVI details, @NotNull PriceBlockVI priceBlock, BadgeDTO badgeDTO2, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
        Intrinsics.checkNotNullParameter(storeys, "storeys");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
        this.id = j11;
        this.name = name;
        this.type = textDTO;
        this.typeBadge = badgeDTO;
        this.number = number;
        this.seatsCount = seatsCount;
        this.seatsDetails = textDTO2;
        this.storeys = storeys;
        this.isStoreysVisible = z11;
        this.details = details;
        this.priceBlock = priceBlock;
        this.bonusBadge = badgeDTO2;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCarriageSelectV4VI)) {
            return false;
        }
        TravelCarriageSelectV4VI travelCarriageSelectV4VI = (TravelCarriageSelectV4VI) other;
        return this.id == travelCarriageSelectV4VI.id && Intrinsics.d(this.name, travelCarriageSelectV4VI.name) && Intrinsics.d(this.type, travelCarriageSelectV4VI.type) && Intrinsics.d(this.typeBadge, travelCarriageSelectV4VI.typeBadge) && Intrinsics.d(this.number, travelCarriageSelectV4VI.number) && Intrinsics.d(this.seatsCount, travelCarriageSelectV4VI.seatsCount) && Intrinsics.d(this.seatsDetails, travelCarriageSelectV4VI.seatsDetails) && Intrinsics.d(this.storeys, travelCarriageSelectV4VI.storeys) && this.isStoreysVisible == travelCarriageSelectV4VI.isStoreysVisible && Intrinsics.d(this.details, travelCarriageSelectV4VI.details) && Intrinsics.d(this.priceBlock, travelCarriageSelectV4VI.priceBlock) && Intrinsics.d(this.bonusBadge, travelCarriageSelectV4VI.bonusBadge) && Intrinsics.d(this.action, travelCarriageSelectV4VI.action) && Intrinsics.d(this.tokenizedEvent, travelCarriageSelectV4VI.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getBonusBadge() {
        return this.bonusBadge;
    }

    @NotNull
    public final DetailsVI getDetails() {
        return this.details;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    @NotNull
    public final TextDTO getNumber() {
        return this.number;
    }

    @NotNull
    public final PriceBlockVI getPriceBlock() {
        return this.priceBlock;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getSeatsCount() {
        return this.seatsCount;
    }

    public final TextDTO getSeatsDetails() {
        return this.seatsDetails;
    }

    @NotNull
    public final List<StoreyVI> getStoreys() {
        return this.storeys;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final TextDTO getType() {
        return this.type;
    }

    public final BadgeDTO getTypeBadge() {
        return this.typeBadge;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.name, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.type;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.typeBadge;
        int a12 = b.a(this.seatsCount, b.a(this.number, (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31), 31);
        TextDTO textDTO2 = this.seatsDetails;
        int hashCode2 = (this.priceBlock.hashCode() + ((this.details.hashCode() + C3532b.a(g.b((a12 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.storeys), 31, this.isStoreysVisible)) * 31)) * 31;
        BadgeDTO badgeDTO2 = this.bonusBadge;
        int hashCode3 = (hashCode2 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.type;
        BadgeDTO badgeDTO = this.typeBadge;
        TextDTO textDTO3 = this.number;
        TextDTO textDTO4 = this.seatsCount;
        TextDTO textDTO5 = this.seatsDetails;
        List<StoreyVI> list = this.storeys;
        boolean z11 = this.isStoreysVisible;
        DetailsVI detailsVI = this.details;
        PriceBlockVI priceBlockVI = this.priceBlock;
        BadgeDTO badgeDTO2 = this.bonusBadge;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = TY.a.b("TravelCarriageSelectV4VI(id=", j11, ", name=", textDTO);
        b11.append(", type=");
        b11.append(textDTO2);
        b11.append(", typeBadge=");
        b11.append(badgeDTO);
        D3.g.i(", number=", ", seatsCount=", b11, textDTO3, textDTO4);
        b11.append(", seatsDetails=");
        b11.append(textDTO5);
        b11.append(", storeys=");
        b11.append(list);
        b11.append(", isStoreysVisible=");
        b11.append(z11);
        b11.append(", details=");
        b11.append(detailsVI);
        b11.append(", priceBlock=");
        b11.append(priceBlockVI);
        b11.append(", bonusBadge=");
        b11.append(badgeDTO2);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
        b11.append(")");
        return b11.toString();
    }
}
