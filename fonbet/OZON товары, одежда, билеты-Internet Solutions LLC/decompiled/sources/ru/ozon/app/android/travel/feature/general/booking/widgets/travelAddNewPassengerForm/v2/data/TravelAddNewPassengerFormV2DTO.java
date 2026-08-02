package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.data;

import Ih.a;
import Kk.C3532b;
import Tl.b;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00018By\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003J\u008d\u0001\u00102\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO;", "", "inputs", "", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "bonusCards", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO;", "addBonusCardButtonApp", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "saveButton", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "agreementText", "isClearButtonVisible", "", "useBankDetails", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;)V", "getInputs", "()Ljava/util/List;", "getBonusCards", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO;", "getAddBonusCardButtonApp", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSaveButton", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getAgreementText", "()Z", "getUseBankDetails", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "BonusCardsDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelAddNewPassengerFormV2DTO {
    private final ButtonV3Atom.LargeButton addBonusCardButtonApp;
    private final TextAtom agreementText;
    private final BonusCardsDTO bonusCards;

    @NotNull
    private final List<CommonInputDTO> inputs;
    private final boolean isClearButtonVisible;

    @NotNull
    private final ButtonV3Atom.LargeButton saveButton;
    private final TextAtom subtitle;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final CellDTO useBankDetails;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "bonusCards", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO$BonusCard;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/List;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBonusCards", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BonusCard", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class BonusCardsDTO {

        @NotNull
        private final List<BonusCard> bonusCards;

        @NotNull
        private final Icon icon;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO$BonusCard;", "", "carrierName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "getCarrierName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BonusCard {

            @NotNull
            private final AtomActionDTO action;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final TextAtom carrierName;

            @NotNull
            private final Icon icon;

            public BonusCard(@NotNull TextAtom carrierName, @NotNull Icon icon, @NotNull AtomActionDTO action, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(carrierName, "carrierName");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.carrierName = carrierName;
                this.icon = icon;
                this.action = action;
                this.backgroundColor = backgroundColor;
            }

            public static /* synthetic */ BonusCard copy$default(BonusCard bonusCard, TextAtom textAtom, Icon icon, AtomActionDTO atomActionDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = bonusCard.carrierName;
                }
                if ((i11 & 2) != 0) {
                    icon = bonusCard.icon;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO = bonusCard.action;
                }
                if ((i11 & 8) != 0) {
                    str = bonusCard.backgroundColor;
                }
                return bonusCard.copy(textAtom, icon, atomActionDTO, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getCarrierName() {
                return this.carrierName;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final BonusCard copy(@NotNull TextAtom carrierName, @NotNull Icon icon, @NotNull AtomActionDTO action, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(carrierName, "carrierName");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                return new BonusCard(carrierName, icon, action, backgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BonusCard)) {
                    return false;
                }
                BonusCard bonusCard = (BonusCard) other;
                return Intrinsics.d(this.carrierName, bonusCard.carrierName) && Intrinsics.d(this.icon, bonusCard.icon) && Intrinsics.d(this.action, bonusCard.action) && Intrinsics.d(this.backgroundColor, bonusCard.backgroundColor);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final TextAtom getCarrierName() {
                return this.carrierName;
            }

            @NotNull
            public final Icon getIcon() {
                return this.icon;
            }

            public int hashCode() {
                return this.backgroundColor.hashCode() + a.b(this.action, Lc.a.a(this.icon, this.carrierName.hashCode() * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                return "BonusCard(carrierName=" + this.carrierName + ", icon=" + this.icon + ", action=" + this.action + ", backgroundColor=" + this.backgroundColor + ")";
            }
        }

        public BonusCardsDTO(@NotNull Icon icon, @NotNull List<BonusCard> bonusCards) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(bonusCards, "bonusCards");
            this.icon = icon;
            this.bonusCards = bonusCards;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BonusCardsDTO copy$default(BonusCardsDTO bonusCardsDTO, Icon icon, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = bonusCardsDTO.icon;
            }
            if ((i11 & 2) != 0) {
                list = bonusCardsDTO.bonusCards;
            }
            return bonusCardsDTO.copy(icon, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final List<BonusCard> component2() {
            return this.bonusCards;
        }

        @NotNull
        public final BonusCardsDTO copy(@NotNull Icon icon, @NotNull List<BonusCard> bonusCards) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(bonusCards, "bonusCards");
            return new BonusCardsDTO(icon, bonusCards);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusCardsDTO)) {
                return false;
            }
            BonusCardsDTO bonusCardsDTO = (BonusCardsDTO) other;
            return Intrinsics.d(this.icon, bonusCardsDTO.icon) && Intrinsics.d(this.bonusCards, bonusCardsDTO.bonusCards);
        }

        @NotNull
        public final List<BonusCard> getBonusCards() {
            return this.bonusCards;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.bonusCards.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "BonusCardsDTO(icon=" + this.icon + ", bonusCards=" + this.bonusCards + ")";
        }
    }

    public TravelAddNewPassengerFormV2DTO(@NotNull List<CommonInputDTO> inputs, BonusCardsDTO bonusCardsDTO, ButtonV3Atom.LargeButton largeButton, @NotNull ButtonV3Atom.LargeButton saveButton, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, boolean z11, CellDTO cellDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.inputs = inputs;
        this.bonusCards = bonusCardsDTO;
        this.addBonusCardButtonApp = largeButton;
        this.saveButton = saveButton;
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.agreementText = textAtom3;
        this.isClearButtonVisible = z11;
        this.useBankDetails = cellDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelAddNewPassengerFormV2DTO copy$default(TravelAddNewPassengerFormV2DTO travelAddNewPassengerFormV2DTO, List list, BonusCardsDTO bonusCardsDTO, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, boolean z11, CellDTO cellDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelAddNewPassengerFormV2DTO.inputs;
        }
        if ((i11 & 2) != 0) {
            bonusCardsDTO = travelAddNewPassengerFormV2DTO.bonusCards;
        }
        if ((i11 & 4) != 0) {
            largeButton = travelAddNewPassengerFormV2DTO.addBonusCardButtonApp;
        }
        if ((i11 & 8) != 0) {
            largeButton2 = travelAddNewPassengerFormV2DTO.saveButton;
        }
        if ((i11 & 16) != 0) {
            textAtom = travelAddNewPassengerFormV2DTO.title;
        }
        if ((i11 & 32) != 0) {
            textAtom2 = travelAddNewPassengerFormV2DTO.subtitle;
        }
        if ((i11 & 64) != 0) {
            textAtom3 = travelAddNewPassengerFormV2DTO.agreementText;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = travelAddNewPassengerFormV2DTO.isClearButtonVisible;
        }
        if ((i11 & 256) != 0) {
            cellDTO = travelAddNewPassengerFormV2DTO.useBankDetails;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = travelAddNewPassengerFormV2DTO.trackingInfo;
        }
        CellDTO cellDTO2 = cellDTO;
        Map map2 = map;
        TextAtom textAtom4 = textAtom3;
        boolean z12 = z11;
        TextAtom textAtom5 = textAtom;
        TextAtom textAtom6 = textAtom2;
        return travelAddNewPassengerFormV2DTO.copy(list, bonusCardsDTO, largeButton, largeButton2, textAtom5, textAtom6, textAtom4, z12, cellDTO2, map2);
    }

    @NotNull
    public final List<CommonInputDTO> component1() {
        return this.inputs;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final BonusCardsDTO getBonusCards() {
        return this.bonusCards;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getAddBonusCardButtonApp() {
        return this.addBonusCardButtonApp;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getSaveButton() {
        return this.saveButton;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsClearButtonVisible() {
        return this.isClearButtonVisible;
    }

    /* renamed from: component9, reason: from getter */
    public final CellDTO getUseBankDetails() {
        return this.useBankDetails;
    }

    @NotNull
    public final TravelAddNewPassengerFormV2DTO copy(@NotNull List<CommonInputDTO> inputs, BonusCardsDTO bonusCards, ButtonV3Atom.LargeButton addBonusCardButtonApp, @NotNull ButtonV3Atom.LargeButton saveButton, TextAtom title, TextAtom subtitle, TextAtom agreementText, boolean isClearButtonVisible, CellDTO useBankDetails, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new TravelAddNewPassengerFormV2DTO(inputs, bonusCards, addBonusCardButtonApp, saveButton, title, subtitle, agreementText, isClearButtonVisible, useBankDetails, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelAddNewPassengerFormV2DTO)) {
            return false;
        }
        TravelAddNewPassengerFormV2DTO travelAddNewPassengerFormV2DTO = (TravelAddNewPassengerFormV2DTO) other;
        return Intrinsics.d(this.inputs, travelAddNewPassengerFormV2DTO.inputs) && Intrinsics.d(this.bonusCards, travelAddNewPassengerFormV2DTO.bonusCards) && Intrinsics.d(this.addBonusCardButtonApp, travelAddNewPassengerFormV2DTO.addBonusCardButtonApp) && Intrinsics.d(this.saveButton, travelAddNewPassengerFormV2DTO.saveButton) && Intrinsics.d(this.title, travelAddNewPassengerFormV2DTO.title) && Intrinsics.d(this.subtitle, travelAddNewPassengerFormV2DTO.subtitle) && Intrinsics.d(this.agreementText, travelAddNewPassengerFormV2DTO.agreementText) && this.isClearButtonVisible == travelAddNewPassengerFormV2DTO.isClearButtonVisible && Intrinsics.d(this.useBankDetails, travelAddNewPassengerFormV2DTO.useBankDetails) && Intrinsics.d(this.trackingInfo, travelAddNewPassengerFormV2DTO.trackingInfo);
    }

    public final ButtonV3Atom.LargeButton getAddBonusCardButtonApp() {
        return this.addBonusCardButtonApp;
    }

    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    public final BonusCardsDTO getBonusCards() {
        return this.bonusCards;
    }

    @NotNull
    public final List<CommonInputDTO> getInputs() {
        return this.inputs;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSaveButton() {
        return this.saveButton;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final CellDTO getUseBankDetails() {
        return this.useBankDetails;
    }

    public int hashCode() {
        int hashCode = this.inputs.hashCode() * 31;
        BonusCardsDTO bonusCardsDTO = this.bonusCards;
        int hashCode2 = (hashCode + (bonusCardsDTO == null ? 0 : bonusCardsDTO.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.addBonusCardButtonApp;
        int a11 = b.a(this.saveButton, (hashCode2 + (largeButton == null ? 0 : largeButton.hashCode())) * 31, 31);
        TextAtom textAtom = this.title;
        int hashCode3 = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode4 = (hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.agreementText;
        int a12 = C3532b.a((hashCode4 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31, 31, this.isClearButtonVisible);
        CellDTO cellDTO = this.useBankDetails;
        int hashCode5 = (a12 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isClearButtonVisible() {
        return this.isClearButtonVisible;
    }

    @NotNull
    public String toString() {
        List<CommonInputDTO> list = this.inputs;
        BonusCardsDTO bonusCardsDTO = this.bonusCards;
        ButtonV3Atom.LargeButton largeButton = this.addBonusCardButtonApp;
        ButtonV3Atom.LargeButton largeButton2 = this.saveButton;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        TextAtom textAtom3 = this.agreementText;
        boolean z11 = this.isClearButtonVisible;
        CellDTO cellDTO = this.useBankDetails;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelAddNewPassengerFormV2DTO(inputs=");
        sb2.append(list);
        sb2.append(", bonusCards=");
        sb2.append(bonusCardsDTO);
        sb2.append(", addBonusCardButtonApp=");
        sb2.append(largeButton);
        sb2.append(", saveButton=");
        sb2.append(largeButton2);
        sb2.append(", title=");
        C4636t5.c(", subtitle=", ", agreementText=", sb2, textAtom, textAtom2);
        sb2.append(textAtom3);
        sb2.append(", isClearButtonVisible=");
        sb2.append(z11);
        sb2.append(", useBankDetails=");
        sb2.append(cellDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ TravelAddNewPassengerFormV2DTO(List list, BonusCardsDTO bonusCardsDTO, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, boolean z11, CellDTO cellDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, bonusCardsDTO, largeButton, largeButton2, textAtom, textAtom2, textAtom3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, cellDTO, map);
    }
}
