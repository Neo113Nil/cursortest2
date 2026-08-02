package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation;

import Ak.C2436a;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Lc.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b!\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001EB\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ¶\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b\u000f\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b\u0015\u00107R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b\u0016\u00107R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010B\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "agreementText", "", "inputsTopMargin", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "inputs", "", "isBonusCardsVisible", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;", "bonusCards", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "addBonusCardButton", "saveButton", "isClearButtonVisible", "isInputChangedByClient", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "useBankDetails", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ILjava/util/List;ZLru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ZZLru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ILjava/util/List;ZLru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ZZLru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getAgreementText", "I", "getInputsTopMargin", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;", "getBonusCards", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAddBonusCardButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSaveButton", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getUseBankDetails", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "BonusCards", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelAddNewPassengerFormV2VO implements c {
    private final ButtonV3Atom.LargeButton addBonusCardButton;
    private final TextAtom agreementText;
    private final BonusCards bonusCards;
    private final long id;

    @NotNull
    private final List<CommonInputVO> inputs;
    private final int inputsTopMargin;
    private final boolean isBonusCardsVisible;
    private final boolean isClearButtonVisible;
    private final boolean isInputChangedByClient;

    @NotNull
    private final ButtonV3Atom.LargeButton saveButton;
    private final TextAtom subtitle;
    private final TextAtom title;
    private final CellDTO useBankDetails;
    private final t viewEvent;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards$BonusCard;", "list", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/util/List;", "getList", "()Ljava/util/List;", "BonusCard", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusCards {

        @NotNull
        private final Icon icon;

        @NotNull
        private final List<BonusCard> list;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards$BonusCard;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "carrierName", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCarrierName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BonusCard {

            @NotNull
            private final AtomAction action;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final TextAtom carrierName;

            @NotNull
            private final Icon icon;
            private final long id;

            public BonusCard(long j11, @NotNull TextAtom carrierName, @NotNull Icon icon, @NotNull String backgroundColor, @NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(carrierName, "carrierName");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(action, "action");
                this.id = j11;
                this.carrierName = carrierName;
                this.icon = icon;
                this.backgroundColor = backgroundColor;
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BonusCard)) {
                    return false;
                }
                BonusCard bonusCard = (BonusCard) other;
                return this.id == bonusCard.id && Intrinsics.d(this.carrierName, bonusCard.carrierName) && Intrinsics.d(this.icon, bonusCard.icon) && Intrinsics.d(this.backgroundColor, bonusCard.backgroundColor) && Intrinsics.d(this.action, bonusCard.action);
            }

            @NotNull
            public final AtomAction getAction() {
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

            public final long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.action.hashCode() + g.a(a.a(this.icon, C2619v.b(Long.hashCode(this.id) * 31, 31, this.carrierName), 31), 31, this.backgroundColor);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                TextAtom textAtom = this.carrierName;
                Icon icon = this.icon;
                String str = this.backgroundColor;
                AtomAction atomAction = this.action;
                StringBuilder c11 = C2639a.c("BonusCard(id=", j11, ", carrierName=", textAtom);
                c11.append(", icon=");
                c11.append(icon);
                c11.append(", backgroundColor=");
                c11.append(str);
                c11.append(", action=");
                c11.append(atomAction);
                c11.append(")");
                return c11.toString();
            }
        }

        public BonusCards(@NotNull Icon icon, @NotNull List<BonusCard> list) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(list, "list");
            this.icon = icon;
            this.list = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusCards)) {
                return false;
            }
            BonusCards bonusCards = (BonusCards) other;
            return Intrinsics.d(this.icon, bonusCards.icon) && Intrinsics.d(this.list, bonusCards.list);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final List<BonusCard> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "BonusCards(icon=" + this.icon + ", list=" + this.list + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelAddNewPassengerFormV2VO(long j11, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, int i11, @NotNull List<? extends CommonInputVO> inputs, boolean z11, BonusCards bonusCards, ButtonV3Atom.LargeButton largeButton, @NotNull ButtonV3Atom.LargeButton saveButton, boolean z12, boolean z13, CellDTO cellDTO, t tVar) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.id = j11;
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.agreementText = textAtom3;
        this.inputsTopMargin = i11;
        this.inputs = inputs;
        this.isBonusCardsVisible = z11;
        this.bonusCards = bonusCards;
        this.addBonusCardButton = largeButton;
        this.saveButton = saveButton;
        this.isClearButtonVisible = z12;
        this.isInputChangedByClient = z13;
        this.useBankDetails = cellDTO;
        this.viewEvent = tVar;
    }

    @NotNull
    public final TravelAddNewPassengerFormV2VO copy(long id2, TextAtom title, TextAtom subtitle, TextAtom agreementText, int inputsTopMargin, @NotNull List<? extends CommonInputVO> inputs, boolean isBonusCardsVisible, BonusCards bonusCards, ButtonV3Atom.LargeButton addBonusCardButton, @NotNull ButtonV3Atom.LargeButton saveButton, boolean isClearButtonVisible, boolean isInputChangedByClient, CellDTO useBankDetails, t viewEvent) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new TravelAddNewPassengerFormV2VO(id2, title, subtitle, agreementText, inputsTopMargin, inputs, isBonusCardsVisible, bonusCards, addBonusCardButton, saveButton, isClearButtonVisible, isInputChangedByClient, useBankDetails, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelAddNewPassengerFormV2VO)) {
            return false;
        }
        TravelAddNewPassengerFormV2VO travelAddNewPassengerFormV2VO = (TravelAddNewPassengerFormV2VO) other;
        return this.id == travelAddNewPassengerFormV2VO.id && Intrinsics.d(this.title, travelAddNewPassengerFormV2VO.title) && Intrinsics.d(this.subtitle, travelAddNewPassengerFormV2VO.subtitle) && Intrinsics.d(this.agreementText, travelAddNewPassengerFormV2VO.agreementText) && this.inputsTopMargin == travelAddNewPassengerFormV2VO.inputsTopMargin && Intrinsics.d(this.inputs, travelAddNewPassengerFormV2VO.inputs) && this.isBonusCardsVisible == travelAddNewPassengerFormV2VO.isBonusCardsVisible && Intrinsics.d(this.bonusCards, travelAddNewPassengerFormV2VO.bonusCards) && Intrinsics.d(this.addBonusCardButton, travelAddNewPassengerFormV2VO.addBonusCardButton) && Intrinsics.d(this.saveButton, travelAddNewPassengerFormV2VO.saveButton) && this.isClearButtonVisible == travelAddNewPassengerFormV2VO.isClearButtonVisible && this.isInputChangedByClient == travelAddNewPassengerFormV2VO.isInputChangedByClient && Intrinsics.d(this.useBankDetails, travelAddNewPassengerFormV2VO.useBankDetails) && Intrinsics.d(this.viewEvent, travelAddNewPassengerFormV2VO.viewEvent);
    }

    public final ButtonV3Atom.LargeButton getAddBonusCardButton() {
        return this.addBonusCardButton;
    }

    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    public final BonusCards getBonusCards() {
        return this.bonusCards;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CommonInputVO> getInputs() {
        return this.inputs;
    }

    public final int getInputsTopMargin() {
        return this.inputsTopMargin;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSaveButton() {
        return this.saveButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final CellDTO getUseBankDetails() {
        return this.useBankDetails;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.agreementText;
        int a11 = C3532b.a(g.b(C2454a.a(this.inputsTopMargin, (hashCode3 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31, 31), 31, this.inputs), 31, this.isBonusCardsVisible);
        BonusCards bonusCards = this.bonusCards;
        int hashCode4 = (a11 + (bonusCards == null ? 0 : bonusCards.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.addBonusCardButton;
        int a12 = C3532b.a(C3532b.a(b.a(this.saveButton, (hashCode4 + (largeButton == null ? 0 : largeButton.hashCode())) * 31, 31), 31, this.isClearButtonVisible), 31, this.isInputChangedByClient);
        CellDTO cellDTO = this.useBankDetails;
        int hashCode5 = (a12 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isBonusCardsVisible, reason: from getter */
    public final boolean getIsBonusCardsVisible() {
        return this.isBonusCardsVisible;
    }

    /* renamed from: isClearButtonVisible, reason: from getter */
    public final boolean getIsClearButtonVisible() {
        return this.isClearButtonVisible;
    }

    /* renamed from: isInputChangedByClient, reason: from getter */
    public final boolean getIsInputChangedByClient() {
        return this.isInputChangedByClient;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        TextAtom textAtom3 = this.agreementText;
        int i11 = this.inputsTopMargin;
        List<CommonInputVO> list = this.inputs;
        boolean z11 = this.isBonusCardsVisible;
        BonusCards bonusCards = this.bonusCards;
        ButtonV3Atom.LargeButton largeButton = this.addBonusCardButton;
        ButtonV3Atom.LargeButton largeButton2 = this.saveButton;
        boolean z12 = this.isClearButtonVisible;
        boolean z13 = this.isInputChangedByClient;
        CellDTO cellDTO = this.useBankDetails;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2639a.c("TravelAddNewPassengerFormV2VO(id=", j11, ", title=", textAtom);
        C2639a.e(", subtitle=", ", agreementText=", c11, textAtom2, textAtom3);
        c11.append(", inputsTopMargin=");
        c11.append(i11);
        c11.append(", inputs=");
        c11.append(list);
        c11.append(", isBonusCardsVisible=");
        c11.append(z11);
        c11.append(", bonusCards=");
        c11.append(bonusCards);
        c11.append(", addBonusCardButton=");
        c11.append(largeButton);
        c11.append(", saveButton=");
        c11.append(largeButton2);
        C2436a.e(", isClearButtonVisible=", ", isInputChangedByClient=", c11, z12, z13);
        c11.append(", useBankDetails=");
        c11.append(cellDTO);
        c11.append(", viewEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ TravelAddNewPassengerFormV2VO(long j11, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, int i11, List list, boolean z11, BonusCards bonusCards, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, boolean z12, boolean z13, CellDTO cellDTO, t tVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textAtom, textAtom2, textAtom3, i11, list, z11, bonusCards, largeButton, largeButton2, z12, (i12 & 2048) != 0 ? false : z13, cellDTO, tVar);
    }
}
