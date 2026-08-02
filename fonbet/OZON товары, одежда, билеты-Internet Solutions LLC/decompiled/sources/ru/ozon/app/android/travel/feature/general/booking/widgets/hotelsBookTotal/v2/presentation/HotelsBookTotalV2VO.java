package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation;

import Ak.C2436a;
import De.C2859b;
import Fm.C3051a;
import G.g;
import I1.w;
import K1.G;
import Kk.C3532b;
import Ns.b;
import T7.P;
import Tz.C4055a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003%&'B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0011¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "state", "", "shouldFetchState", "shouldShowLoader", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;ZZLjava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;ZZLjava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "Z", "getShouldFetchState", "()Z", "getShouldShowLoader", "Ljava/lang/String;", "getAsyncData", "State", "PriceDetailItemVO", "TotalPriceDetailItemVO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsBookTotalV2VO implements c {
    private final String asyncData;
    private final long id;
    private final boolean shouldFetchState;
    private final boolean shouldShowLoader;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$PriceDetailItemVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "note", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "detailsButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoButton", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "extendedPrice", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNote", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getDetailsButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getExtendedPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDetailItemVO {
        private final BadgeDTO badge;
        private final LinkButtonVO detailsButton;
        private final PriceDTO extendedPrice;
        private final int id;
        private final IconButtonV3DTO infoButton;

        @NotNull
        private final TextDTO name;
        private final TextDTO note;
        private final TextDTO price;

        public PriceDetailItemVO(int i11, @NotNull TextDTO name, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, LinkButtonVO linkButtonVO, IconButtonV3DTO iconButtonV3DTO, PriceDTO priceDTO) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = i11;
            this.name = name;
            this.price = textDTO;
            this.badge = badgeDTO;
            this.note = textDTO2;
            this.detailsButton = linkButtonVO;
            this.infoButton = iconButtonV3DTO;
            this.extendedPrice = priceDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDetailItemVO)) {
                return false;
            }
            PriceDetailItemVO priceDetailItemVO = (PriceDetailItemVO) other;
            return this.id == priceDetailItemVO.id && Intrinsics.d(this.name, priceDetailItemVO.name) && Intrinsics.d(this.price, priceDetailItemVO.price) && Intrinsics.d(this.badge, priceDetailItemVO.badge) && Intrinsics.d(this.note, priceDetailItemVO.note) && Intrinsics.d(this.detailsButton, priceDetailItemVO.detailsButton) && Intrinsics.d(this.infoButton, priceDetailItemVO.infoButton) && Intrinsics.d(this.extendedPrice, priceDetailItemVO.extendedPrice);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final LinkButtonVO getDetailsButton() {
            return this.detailsButton;
        }

        public final PriceDTO getExtendedPrice() {
            return this.extendedPrice;
        }

        public final int getId() {
            return this.id;
        }

        public final IconButtonV3DTO getInfoButton() {
            return this.infoButton;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public final TextDTO getNote() {
            return this.note;
        }

        public final TextDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            int a11 = b.a(this.name, Integer.hashCode(this.id) * 31, 31);
            TextDTO textDTO = this.price;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.note;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            LinkButtonVO linkButtonVO = this.detailsButton;
            int hashCode4 = (hashCode3 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.infoButton;
            int hashCode5 = (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            PriceDTO priceDTO = this.extendedPrice;
            return hashCode5 + (priceDTO != null ? priceDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.name;
            TextDTO textDTO2 = this.price;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO3 = this.note;
            LinkButtonVO linkButtonVO = this.detailsButton;
            IconButtonV3DTO iconButtonV3DTO = this.infoButton;
            PriceDTO priceDTO = this.extendedPrice;
            StringBuilder b11 = C4055a.b(textDTO, "PriceDetailItemVO(id=", ", name=", ", price=", i11);
            b11.append(textDTO2);
            b11.append(", badge=");
            b11.append(badgeDTO);
            b11.append(", note=");
            b11.append(textDTO3);
            b11.append(", detailsButton=");
            b11.append(linkButtonVO);
            b11.append(", infoButton=");
            b11.append(iconButtonV3DTO);
            b11.append(", extendedPrice=");
            b11.append(priceDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0014R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b(\u0010\u001eR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$PriceDetailItemVO;", "priceDetails", "", "dividerColor", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$TotalPriceDetailItemVO;", "totalPriceDetails", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nextButton", "agreement", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getPriceDetails", "()Ljava/util/List;", "Ljava/lang/String;", "getDividerColor", "getTotalPriceDetails", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNextButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAgreement", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        private final TextDTO agreement;
        private final String dividerColor;

        @NotNull
        private final ButtonV3DTO nextButton;

        @NotNull
        private final List<PriceDetailItemVO> priceDetails;

        @NotNull
        private final TextDTO title;
        private final List<TotalPriceDetailItemVO> totalPriceDetails;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public State(@NotNull TextDTO title, @NotNull List<PriceDetailItemVO> priceDetails, String str, List<TotalPriceDetailItemVO> list, @NotNull ButtonV3DTO nextButton, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(priceDetails, "priceDetails");
            Intrinsics.checkNotNullParameter(nextButton, "nextButton");
            this.title = title;
            this.priceDetails = priceDetails;
            this.dividerColor = str;
            this.totalPriceDetails = list;
            this.nextButton = nextButton;
            this.agreement = textDTO;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.d(this.title, state.title) && Intrinsics.d(this.priceDetails, state.priceDetails) && Intrinsics.d(this.dividerColor, state.dividerColor) && Intrinsics.d(this.totalPriceDetails, state.totalPriceDetails) && Intrinsics.d(this.nextButton, state.nextButton) && Intrinsics.d(this.agreement, state.agreement) && Intrinsics.d(this.trackingInfo, state.trackingInfo);
        }

        public final TextDTO getAgreement() {
            return this.agreement;
        }

        public final String getDividerColor() {
            return this.dividerColor;
        }

        @NotNull
        public final ButtonV3DTO getNextButton() {
            return this.nextButton;
        }

        @NotNull
        public final List<PriceDetailItemVO> getPriceDetails() {
            return this.priceDetails;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final List<TotalPriceDetailItemVO> getTotalPriceDetails() {
            return this.totalPriceDetails;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = g.b(this.title.hashCode() * 31, 31, this.priceDetails);
            String str = this.dividerColor;
            int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
            List<TotalPriceDetailItemVO> list = this.totalPriceDetails;
            int c11 = C2859b.c(this.nextButton, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
            TextDTO textDTO = this.agreement;
            int hashCode2 = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<PriceDetailItemVO> list = this.priceDetails;
            String str = this.dividerColor;
            List<TotalPriceDetailItemVO> list2 = this.totalPriceDetails;
            ButtonV3DTO buttonV3DTO = this.nextButton;
            TextDTO textDTO2 = this.agreement;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder e11 = G.e("State(title=", textDTO, ", priceDetails=", list, ", dividerColor=");
            w.d(str, ", totalPriceDetails=", ", nextButton=", e11, list2);
            e11.append(buttonV3DTO);
            e11.append(", agreement=");
            e11.append(textDTO2);
            e11.append(", trackingInfo=");
            return P.f(e11, map, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$TotalPriceDetailItemVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "infoIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "infoIconAction", "note", "clickAction", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getInfoIconAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getNote", "getClickAction", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TotalPriceDetailItemVO {
        private final AtomAction clickAction;
        private final int id;
        private final IconDTO infoIcon;
        private final AtomAction infoIconAction;

        @NotNull
        private final TextDTO name;
        private final TextDTO note;

        @NotNull
        private final PriceDTO price;

        public TotalPriceDetailItemVO(int i11, @NotNull TextDTO name, @NotNull PriceDTO price, IconDTO iconDTO, AtomAction atomAction, TextDTO textDTO, AtomAction atomAction2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            this.id = i11;
            this.name = name;
            this.price = price;
            this.infoIcon = iconDTO;
            this.infoIconAction = atomAction;
            this.note = textDTO;
            this.clickAction = atomAction2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TotalPriceDetailItemVO)) {
                return false;
            }
            TotalPriceDetailItemVO totalPriceDetailItemVO = (TotalPriceDetailItemVO) other;
            return this.id == totalPriceDetailItemVO.id && Intrinsics.d(this.name, totalPriceDetailItemVO.name) && Intrinsics.d(this.price, totalPriceDetailItemVO.price) && Intrinsics.d(this.infoIcon, totalPriceDetailItemVO.infoIcon) && Intrinsics.d(this.infoIconAction, totalPriceDetailItemVO.infoIconAction) && Intrinsics.d(this.note, totalPriceDetailItemVO.note) && Intrinsics.d(this.clickAction, totalPriceDetailItemVO.clickAction);
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        public final int getId() {
            return this.id;
        }

        public final IconDTO getInfoIcon() {
            return this.infoIcon;
        }

        public final AtomAction getInfoIconAction() {
            return this.infoIconAction;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public final TextDTO getNote() {
            return this.note;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            int b11 = C3051a.b(this.price, b.a(this.name, Integer.hashCode(this.id) * 31, 31), 31);
            IconDTO iconDTO = this.infoIcon;
            int hashCode = (b11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomAction atomAction = this.infoIconAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            TextDTO textDTO = this.note;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            AtomAction atomAction2 = this.clickAction;
            return hashCode3 + (atomAction2 != null ? atomAction2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.name;
            PriceDTO priceDTO = this.price;
            IconDTO iconDTO = this.infoIcon;
            AtomAction atomAction = this.infoIconAction;
            TextDTO textDTO2 = this.note;
            AtomAction atomAction2 = this.clickAction;
            StringBuilder b11 = C4055a.b(textDTO, "TotalPriceDetailItemVO(id=", ", name=", ", price=", i11);
            b11.append(priceDTO);
            b11.append(", infoIcon=");
            b11.append(iconDTO);
            b11.append(", infoIconAction=");
            b11.append(atomAction);
            b11.append(", note=");
            b11.append(textDTO2);
            b11.append(", clickAction=");
            return B6.b.b(b11, atomAction2, ")");
        }
    }

    public HotelsBookTotalV2VO(long j11, @NotNull State state, boolean z11, boolean z12, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.shouldFetchState = z11;
        this.shouldShowLoader = z12;
        this.asyncData = str;
    }

    public static /* synthetic */ HotelsBookTotalV2VO copy$default(HotelsBookTotalV2VO hotelsBookTotalV2VO, long j11, State state, boolean z11, boolean z12, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsBookTotalV2VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            state = hotelsBookTotalV2VO.state;
        }
        State state2 = state;
        if ((i11 & 4) != 0) {
            z11 = hotelsBookTotalV2VO.shouldFetchState;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = hotelsBookTotalV2VO.shouldShowLoader;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            str = hotelsBookTotalV2VO.asyncData;
        }
        return hotelsBookTotalV2VO.copy(j12, state2, z13, z14, str);
    }

    @NotNull
    public final HotelsBookTotalV2VO copy(long id2, @NotNull State state, boolean shouldFetchState, boolean shouldShowLoader, String asyncData) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new HotelsBookTotalV2VO(id2, state, shouldFetchState, shouldShowLoader, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookTotalV2VO)) {
            return false;
        }
        HotelsBookTotalV2VO hotelsBookTotalV2VO = (HotelsBookTotalV2VO) other;
        return this.id == hotelsBookTotalV2VO.id && Intrinsics.d(this.state, hotelsBookTotalV2VO.state) && this.shouldFetchState == hotelsBookTotalV2VO.shouldFetchState && this.shouldShowLoader == hotelsBookTotalV2VO.shouldShowLoader && Intrinsics.d(this.asyncData, hotelsBookTotalV2VO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    public final boolean getShouldShowLoader() {
        return this.shouldShowLoader;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a((this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.shouldFetchState), 31, this.shouldShowLoader);
        String str = this.asyncData;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.state;
        boolean z11 = this.shouldFetchState;
        boolean z12 = this.shouldShowLoader;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("HotelsBookTotalV2VO(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(state);
        C2436a.e(", shouldFetchState=", ", shouldShowLoader=", sb2, z11, z12);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }
}
