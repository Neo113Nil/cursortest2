package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001EB\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003J\t\u0010=\u001a\u00020\u0017HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0097\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010@\u001a\u00020\u00172\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0011\u00103\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b3\u0010.¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallActionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "largeActionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "paymentButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "buttonWidth", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO$ButtonWidthDTO;", "topBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isVerticalLayout", "", "notificationCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO$ButtonWidthDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSmallActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getLargeActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getPaymentButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "getButtonWidth", "()Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO$ButtonWidthDTO;", "getTopBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "()Z", "getNotificationCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "hasButton", "getHasButton", "isHorizontalLayout", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "ButtonWidthDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonWithInformationDTO {
    public static final int $stable = 8;
    private final ButtonWidthDTO buttonWidth;
    private final ButtonV3Atom.SmallIconButton infoButton;
    private final boolean isVerticalLayout;
    private final ButtonV3Atom.LargeButton largeActionButton;
    private final CellDTO notificationCell;
    private final ButtonV3Atom.PaymentButtonLarge paymentButton;
    private final Price price;
    private final ButtonV3Atom.SmallButton smallActionButton;
    private final TextAtom title;
    private final BadgeDTO topBadge;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO$ButtonWidthDTO;", "", "<init>", "(Ljava/lang/String;I)V", "WRAP_CONTENT", "MATCH_CENTER", "MATCH_PARENT", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonWidthDTO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonWidthDTO[] $VALUES;

        @i(name = "WRAP_CONTENT")
        public static final ButtonWidthDTO WRAP_CONTENT = new ButtonWidthDTO("WRAP_CONTENT", 0);

        @i(name = "MATCH_CENTER")
        public static final ButtonWidthDTO MATCH_CENTER = new ButtonWidthDTO("MATCH_CENTER", 1);

        @i(name = "MATCH_PARENT")
        public static final ButtonWidthDTO MATCH_PARENT = new ButtonWidthDTO("MATCH_PARENT", 2);

        private static final /* synthetic */ ButtonWidthDTO[] $values() {
            return new ButtonWidthDTO[]{WRAP_CONTENT, MATCH_CENTER, MATCH_PARENT};
        }

        static {
            ButtonWidthDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonWidthDTO(String str, int i11) {
        }

        public static ButtonWidthDTO valueOf(String str) {
            return (ButtonWidthDTO) Enum.valueOf(ButtonWidthDTO.class, str);
        }

        public static ButtonWidthDTO[] values() {
            return (ButtonWidthDTO[]) $VALUES.clone();
        }
    }

    public ButtonWithInformationDTO(TextAtom textAtom, Price price, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge, ButtonWidthDTO buttonWidthDTO, BadgeDTO badgeDTO, Map<String, TokenizedTrackingInfo> map, boolean z11, CellDTO cellDTO) {
        this.title = textAtom;
        this.price = price;
        this.infoButton = smallIconButton;
        this.smallActionButton = smallButton;
        this.largeActionButton = largeButton;
        this.paymentButton = paymentButtonLarge;
        this.buttonWidth = buttonWidthDTO;
        this.topBadge = badgeDTO;
        this.trackingInfo = map;
        this.isVerticalLayout = z11;
        this.notificationCell = cellDTO;
    }

    public static /* synthetic */ ButtonWithInformationDTO copy$default(ButtonWithInformationDTO buttonWithInformationDTO, TextAtom textAtom, Price price, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge, ButtonWidthDTO buttonWidthDTO, BadgeDTO badgeDTO, Map map, boolean z11, CellDTO cellDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = buttonWithInformationDTO.title;
        }
        if ((i11 & 2) != 0) {
            price = buttonWithInformationDTO.price;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = buttonWithInformationDTO.infoButton;
        }
        if ((i11 & 8) != 0) {
            smallButton = buttonWithInformationDTO.smallActionButton;
        }
        if ((i11 & 16) != 0) {
            largeButton = buttonWithInformationDTO.largeActionButton;
        }
        if ((i11 & 32) != 0) {
            paymentButtonLarge = buttonWithInformationDTO.paymentButton;
        }
        if ((i11 & 64) != 0) {
            buttonWidthDTO = buttonWithInformationDTO.buttonWidth;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            badgeDTO = buttonWithInformationDTO.topBadge;
        }
        if ((i11 & 256) != 0) {
            map = buttonWithInformationDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z11 = buttonWithInformationDTO.isVerticalLayout;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            cellDTO = buttonWithInformationDTO.notificationCell;
        }
        boolean z12 = z11;
        CellDTO cellDTO2 = cellDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        Map map2 = map;
        ButtonV3Atom.PaymentButtonLarge paymentButtonLarge2 = paymentButtonLarge;
        ButtonWidthDTO buttonWidthDTO2 = buttonWidthDTO;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
        return buttonWithInformationDTO.copy(textAtom, price, smallIconButton2, smallButton, largeButton2, paymentButtonLarge2, buttonWidthDTO2, badgeDTO2, map2, z12, cellDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsVerticalLayout() {
        return this.isVerticalLayout;
    }

    /* renamed from: component11, reason: from getter */
    public final CellDTO getNotificationCell() {
        return this.notificationCell;
    }

    /* renamed from: component2, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallButton getSmallActionButton() {
        return this.smallActionButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getLargeActionButton() {
        return this.largeActionButton;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.PaymentButtonLarge getPaymentButton() {
        return this.paymentButton;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonWidthDTO getButtonWidth() {
        return this.buttonWidth;
    }

    /* renamed from: component8, reason: from getter */
    public final BadgeDTO getTopBadge() {
        return this.topBadge;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final ButtonWithInformationDTO copy(TextAtom title, Price price, ButtonV3Atom.SmallIconButton infoButton, ButtonV3Atom.SmallButton smallActionButton, ButtonV3Atom.LargeButton largeActionButton, ButtonV3Atom.PaymentButtonLarge paymentButton, ButtonWidthDTO buttonWidth, BadgeDTO topBadge, Map<String, TokenizedTrackingInfo> trackingInfo, boolean isVerticalLayout, CellDTO notificationCell) {
        return new ButtonWithInformationDTO(title, price, infoButton, smallActionButton, largeActionButton, paymentButton, buttonWidth, topBadge, trackingInfo, isVerticalLayout, notificationCell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWithInformationDTO)) {
            return false;
        }
        ButtonWithInformationDTO buttonWithInformationDTO = (ButtonWithInformationDTO) other;
        return Intrinsics.d(this.title, buttonWithInformationDTO.title) && Intrinsics.d(this.price, buttonWithInformationDTO.price) && Intrinsics.d(this.infoButton, buttonWithInformationDTO.infoButton) && Intrinsics.d(this.smallActionButton, buttonWithInformationDTO.smallActionButton) && Intrinsics.d(this.largeActionButton, buttonWithInformationDTO.largeActionButton) && Intrinsics.d(this.paymentButton, buttonWithInformationDTO.paymentButton) && this.buttonWidth == buttonWithInformationDTO.buttonWidth && Intrinsics.d(this.topBadge, buttonWithInformationDTO.topBadge) && Intrinsics.d(this.trackingInfo, buttonWithInformationDTO.trackingInfo) && this.isVerticalLayout == buttonWithInformationDTO.isVerticalLayout && Intrinsics.d(this.notificationCell, buttonWithInformationDTO.notificationCell);
    }

    public final ButtonWidthDTO getButtonWidth() {
        return this.buttonWidth;
    }

    public final boolean getHasButton() {
        return (this.smallActionButton == null && this.largeActionButton == null && this.paymentButton == null) ? false : true;
    }

    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    public final ButtonV3Atom.LargeButton getLargeActionButton() {
        return this.largeActionButton;
    }

    public final CellDTO getNotificationCell() {
        return this.notificationCell;
    }

    public final ButtonV3Atom.PaymentButtonLarge getPaymentButton() {
        return this.paymentButton;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final ButtonV3Atom.SmallButton getSmallActionButton() {
        return this.smallActionButton;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final BadgeDTO getTopBadge() {
        return this.topBadge;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        Price price = this.price;
        int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        int hashCode3 = (hashCode2 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.smallActionButton;
        int hashCode4 = (hashCode3 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.largeActionButton;
        int hashCode5 = (hashCode4 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        ButtonV3Atom.PaymentButtonLarge paymentButtonLarge = this.paymentButton;
        int hashCode6 = (hashCode5 + (paymentButtonLarge == null ? 0 : paymentButtonLarge.hashCode())) * 31;
        ButtonWidthDTO buttonWidthDTO = this.buttonWidth;
        int hashCode7 = (hashCode6 + (buttonWidthDTO == null ? 0 : buttonWidthDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.topBadge;
        int hashCode8 = (hashCode7 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int a11 = C3532b.a((hashCode8 + (map == null ? 0 : map.hashCode())) * 31, 31, this.isVerticalLayout);
        CellDTO cellDTO = this.notificationCell;
        return a11 + (cellDTO != null ? cellDTO.hashCode() : 0);
    }

    public final boolean isHorizontalLayout() {
        return !this.isVerticalLayout;
    }

    public final boolean isVerticalLayout() {
        return this.isVerticalLayout;
    }

    @NotNull
    public String toString() {
        return "ButtonWithInformationDTO(title=" + this.title + ", price=" + this.price + ", infoButton=" + this.infoButton + ", smallActionButton=" + this.smallActionButton + ", largeActionButton=" + this.largeActionButton + ", paymentButton=" + this.paymentButton + ", buttonWidth=" + this.buttonWidth + ", topBadge=" + this.topBadge + ", trackingInfo=" + this.trackingInfo + ", isVerticalLayout=" + this.isVerticalLayout + ", notificationCell=" + this.notificationCell + ")";
    }

    public /* synthetic */ ButtonWithInformationDTO(TextAtom textAtom, Price price, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge, ButtonWidthDTO buttonWidthDTO, BadgeDTO badgeDTO, Map map, boolean z11, CellDTO cellDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, price, smallIconButton, smallButton, largeButton, paymentButtonLarge, buttonWidthDTO, badgeDTO, map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z11, cellDTO);
    }
}
