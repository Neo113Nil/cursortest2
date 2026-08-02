package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.data;

import A00.a;
import Kk.C3532b;
import Ns.b;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u0001SB\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010(J\u001e\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b1\u00102J¼\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\b\u0007\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bB\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010&R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010(R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bI\u0010(R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010+R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bL\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bN\u0010.R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bP\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bR\u00102¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellDTO;", "LA00/a$J$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSeparatorVisible", "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "cardClickControl", "fetchState", "showSkeleton", "", "", "asyncParams", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "", "control", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "discountBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "subtitleOriginPrice", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;ZZLjava/util/Map;Ljava/util/Map;Ljava/lang/Object;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "component1", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component2", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component6", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component7", "()Z", "component8", "component9", "()Ljava/util/Map;", "component10", "component11", "()Ljava/lang/Object;", "component12", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component13", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;ZZLjava/util/Map;Ljava/util/Map;Ljava/lang/Object;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellDTO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "Ljava/lang/Boolean;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCardClickControl", "Z", "getFetchState", "getShowSkeleton", "Ljava/util/Map;", "getAsyncParams", "getViewTrackingInfo", "Ljava/lang/Object;", "getControl", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDiscountBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitleOriginPrice", "CellToggleDTO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServiceCellDTO implements a.J.InterfaceC0007a {
    public static final int $stable = 8;
    private final Map<String, String> asyncParams;
    private final ButtonV3DTO button;
    private final CommonControlSettings cardClickControl;
    private final Object control;
    private final BadgeDTO discountBadge;
    private final boolean fetchState;

    @NotNull
    private final IconDTO icon;
    private final Boolean isSeparatorVisible;
    private final boolean showSkeleton;
    private final TextDTO subtitle;
    private final PriceDTO subtitleOriginPrice;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellDTO$CellToggleDTO;", "", "toggle", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "switchControl", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getToggle", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getSwitchControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellToggleDTO {
        public static final int $stable = ToggleDTO.$stable;

        @NotNull
        private final CommonControlSettings switchControl;

        @NotNull
        private final ToggleDTO toggle;

        public CellToggleDTO(@NotNull ToggleDTO toggle, @NotNull CommonControlSettings switchControl) {
            Intrinsics.checkNotNullParameter(toggle, "toggle");
            Intrinsics.checkNotNullParameter(switchControl, "switchControl");
            this.toggle = toggle;
            this.switchControl = switchControl;
        }

        public static /* synthetic */ CellToggleDTO copy$default(CellToggleDTO cellToggleDTO, ToggleDTO toggleDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                toggleDTO = cellToggleDTO.toggle;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = cellToggleDTO.switchControl;
            }
            return cellToggleDTO.copy(toggleDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ToggleDTO getToggle() {
            return this.toggle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getSwitchControl() {
            return this.switchControl;
        }

        @NotNull
        public final CellToggleDTO copy(@NotNull ToggleDTO toggle, @NotNull CommonControlSettings switchControl) {
            Intrinsics.checkNotNullParameter(toggle, "toggle");
            Intrinsics.checkNotNullParameter(switchControl, "switchControl");
            return new CellToggleDTO(toggle, switchControl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellToggleDTO)) {
                return false;
            }
            CellToggleDTO cellToggleDTO = (CellToggleDTO) other;
            return Intrinsics.d(this.toggle, cellToggleDTO.toggle) && Intrinsics.d(this.switchControl, cellToggleDTO.switchControl);
        }

        @NotNull
        public final CommonControlSettings getSwitchControl() {
            return this.switchControl;
        }

        @NotNull
        public final ToggleDTO getToggle() {
            return this.toggle;
        }

        public int hashCode() {
            return this.switchControl.hashCode() + (this.toggle.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CellToggleDTO(toggle=" + this.toggle + ", switchControl=" + this.switchControl + ")";
        }
    }

    public AdditionalServiceCellDTO(@NotNull IconDTO icon, @NotNull TextDTO title, Boolean bool, TextDTO textDTO, ButtonV3DTO buttonV3DTO, CommonControlSettings commonControlSettings, boolean z11, boolean z12, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "toggle", type = CellToggleDTO.class)}) @ProtoOneOf(label = "type") Object obj, BadgeDTO badgeDTO, PriceDTO priceDTO) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.isSeparatorVisible = bool;
        this.subtitle = textDTO;
        this.button = buttonV3DTO;
        this.cardClickControl = commonControlSettings;
        this.fetchState = z11;
        this.showSkeleton = z12;
        this.asyncParams = map;
        this.viewTrackingInfo = map2;
        this.control = obj;
        this.discountBadge = badgeDTO;
        this.subtitleOriginPrice = priceDTO;
    }

    public static /* synthetic */ AdditionalServiceCellDTO copy$default(AdditionalServiceCellDTO additionalServiceCellDTO, IconDTO iconDTO, TextDTO textDTO, Boolean bool, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonControlSettings commonControlSettings, boolean z11, boolean z12, Map map, Map map2, Object obj, BadgeDTO badgeDTO, PriceDTO priceDTO, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            iconDTO = additionalServiceCellDTO.icon;
        }
        return additionalServiceCellDTO.copy(iconDTO, (i11 & 2) != 0 ? additionalServiceCellDTO.title : textDTO, (i11 & 4) != 0 ? additionalServiceCellDTO.isSeparatorVisible : bool, (i11 & 8) != 0 ? additionalServiceCellDTO.subtitle : textDTO2, (i11 & 16) != 0 ? additionalServiceCellDTO.button : buttonV3DTO, (i11 & 32) != 0 ? additionalServiceCellDTO.cardClickControl : commonControlSettings, (i11 & 64) != 0 ? additionalServiceCellDTO.fetchState : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? additionalServiceCellDTO.showSkeleton : z12, (i11 & 256) != 0 ? additionalServiceCellDTO.asyncParams : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? additionalServiceCellDTO.viewTrackingInfo : map2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? additionalServiceCellDTO.control : obj, (i11 & 2048) != 0 ? additionalServiceCellDTO.discountBadge : badgeDTO, (i11 & 4096) != 0 ? additionalServiceCellDTO.subtitleOriginPrice : priceDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.viewTrackingInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final Object getControl() {
        return this.control;
    }

    /* renamed from: component12, reason: from getter */
    public final BadgeDTO getDiscountBadge() {
        return this.discountBadge;
    }

    /* renamed from: component13, reason: from getter */
    public final PriceDTO getSubtitleOriginPrice() {
        return this.subtitleOriginPrice;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSeparatorVisible() {
        return this.isSeparatorVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCardClickControl() {
        return this.cardClickControl;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFetchState() {
        return this.fetchState;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSkeleton() {
        return this.showSkeleton;
    }

    public final Map<String, String> component9() {
        return this.asyncParams;
    }

    @NotNull
    public final AdditionalServiceCellDTO copy(@NotNull IconDTO icon, @NotNull TextDTO title, Boolean isSeparatorVisible, TextDTO subtitle, ButtonV3DTO button, CommonControlSettings cardClickControl, boolean fetchState, boolean showSkeleton, Map<String, String> asyncParams, Map<String, TokenizedTrackingInfo> viewTrackingInfo, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "toggle", type = CellToggleDTO.class)}) @ProtoOneOf(label = "type") Object control, BadgeDTO discountBadge, PriceDTO subtitleOriginPrice) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AdditionalServiceCellDTO(icon, title, isSeparatorVisible, subtitle, button, cardClickControl, fetchState, showSkeleton, asyncParams, viewTrackingInfo, control, discountBadge, subtitleOriginPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServiceCellDTO)) {
            return false;
        }
        AdditionalServiceCellDTO additionalServiceCellDTO = (AdditionalServiceCellDTO) other;
        return Intrinsics.d(this.icon, additionalServiceCellDTO.icon) && Intrinsics.d(this.title, additionalServiceCellDTO.title) && Intrinsics.d(this.isSeparatorVisible, additionalServiceCellDTO.isSeparatorVisible) && Intrinsics.d(this.subtitle, additionalServiceCellDTO.subtitle) && Intrinsics.d(this.button, additionalServiceCellDTO.button) && Intrinsics.d(this.cardClickControl, additionalServiceCellDTO.cardClickControl) && this.fetchState == additionalServiceCellDTO.fetchState && this.showSkeleton == additionalServiceCellDTO.showSkeleton && Intrinsics.d(this.asyncParams, additionalServiceCellDTO.asyncParams) && Intrinsics.d(this.viewTrackingInfo, additionalServiceCellDTO.viewTrackingInfo) && Intrinsics.d(this.control, additionalServiceCellDTO.control) && Intrinsics.d(this.discountBadge, additionalServiceCellDTO.discountBadge) && Intrinsics.d(this.subtitleOriginPrice, additionalServiceCellDTO.subtitleOriginPrice);
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CommonControlSettings getCardClickControl() {
        return this.cardClickControl;
    }

    public final Object getControl() {
        return this.control;
    }

    public final BadgeDTO getDiscountBadge() {
        return this.discountBadge;
    }

    public final boolean getFetchState() {
        return this.fetchState;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final boolean getShowSkeleton() {
        return this.showSkeleton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final PriceDTO getSubtitleOriginPrice() {
        return this.subtitleOriginPrice;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
        Boolean bool = this.isSeparatorVisible;
        int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.cardClickControl;
        int a12 = C3532b.a(C3532b.a((hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31, this.fetchState), 31, this.showSkeleton);
        Map<String, String> map = this.asyncParams;
        int hashCode4 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
        int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Object obj = this.control;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        BadgeDTO badgeDTO = this.discountBadge;
        int hashCode7 = (hashCode6 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.subtitleOriginPrice;
        return hashCode7 + (priceDTO != null ? priceDTO.hashCode() : 0);
    }

    public final Boolean isSeparatorVisible() {
        return this.isSeparatorVisible;
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        Boolean bool = this.isSeparatorVisible;
        TextDTO textDTO2 = this.subtitle;
        ButtonV3DTO buttonV3DTO = this.button;
        CommonControlSettings commonControlSettings = this.cardClickControl;
        boolean z11 = this.fetchState;
        boolean z12 = this.showSkeleton;
        Map<String, String> map = this.asyncParams;
        Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
        Object obj = this.control;
        BadgeDTO badgeDTO = this.discountBadge;
        PriceDTO priceDTO = this.subtitleOriginPrice;
        StringBuilder i11 = Bi.b.i("AdditionalServiceCellDTO(icon=", ", title=", ", isSeparatorVisible=", iconDTO, textDTO);
        i11.append(bool);
        i11.append(", subtitle=");
        i11.append(textDTO2);
        i11.append(", button=");
        i11.append(buttonV3DTO);
        i11.append(", cardClickControl=");
        i11.append(commonControlSettings);
        i11.append(", fetchState=");
        f.c(", showSkeleton=", ", asyncParams=", i11, z11, z12);
        Tl.b.g(i11, map, ", viewTrackingInfo=", map2, ", control=");
        i11.append(obj);
        i11.append(", discountBadge=");
        i11.append(badgeDTO);
        i11.append(", subtitleOriginPrice=");
        i11.append(priceDTO);
        i11.append(")");
        return i11.toString();
    }

    public /* synthetic */ AdditionalServiceCellDTO(IconDTO iconDTO, TextDTO textDTO, Boolean bool, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonControlSettings commonControlSettings, boolean z11, boolean z12, Map map, Map map2, Object obj, BadgeDTO badgeDTO, PriceDTO priceDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconDTO, textDTO, bool, textDTO2, buttonV3DTO, commonControlSettings, (i11 & 64) != 0 ? false : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z12, map, map2, obj, badgeDTO, priceDTO);
    }
}
