package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data;

import B0.C2454a;
import B90.C2618u;
import B90.C2619v;
import G.g;
import HY.a;
import J.d;
import Kk.C3532b;
import N3.C3660k;
import Tl.b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0005%&'()B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "actionPane", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$ActionPane;", "passengers", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$Passenger;", "shouldFetchState", "", "emptyState", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$ActionPane;Ljava/util/List;ZLru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getActionPane", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$ActionPane;", "getPassengers", "()Ljava/util/List;", "getShouldFetchState", "()Z", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "ActionPane", "Passenger", "FlightSegment", "BaseTariff", "LuggageItem", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalLuggageV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final ActionPane actionPane;
    private final EmptyStateDTO emptyState;

    @NotNull
    private final List<Passenger> passengers;
    private final boolean shouldFetchState;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$ActionPane;", "", "priceDescription", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "saveButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "detailsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getPriceDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSaveButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDetailsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPane {
        public static final int $stable = (ButtonV3Atom.SmallIconButton.$stable | ButtonV3Atom.LargeButton.$stable) | TextAtom.$stable;
        private final ButtonV3Atom.SmallIconButton detailsButton;

        @NotNull
        private final TextAtom priceDescription;

        @NotNull
        private final ButtonV3Atom.LargeButton saveButton;

        public ActionPane(@NotNull TextAtom priceDescription, @NotNull ButtonV3Atom.LargeButton saveButton, ButtonV3Atom.SmallIconButton smallIconButton) {
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(saveButton, "saveButton");
            this.priceDescription = priceDescription;
            this.saveButton = saveButton;
            this.detailsButton = smallIconButton;
        }

        public static /* synthetic */ ActionPane copy$default(ActionPane actionPane, TextAtom textAtom, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = actionPane.priceDescription;
            }
            if ((i11 & 2) != 0) {
                largeButton = actionPane.saveButton;
            }
            if ((i11 & 4) != 0) {
                smallIconButton = actionPane.detailsButton;
            }
            return actionPane.copy(textAtom, largeButton, smallIconButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getPriceDescription() {
            return this.priceDescription;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.LargeButton getSaveButton() {
            return this.saveButton;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getDetailsButton() {
            return this.detailsButton;
        }

        @NotNull
        public final ActionPane copy(@NotNull TextAtom priceDescription, @NotNull ButtonV3Atom.LargeButton saveButton, ButtonV3Atom.SmallIconButton detailsButton) {
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(saveButton, "saveButton");
            return new ActionPane(priceDescription, saveButton, detailsButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionPane)) {
                return false;
            }
            ActionPane actionPane = (ActionPane) other;
            return Intrinsics.d(this.priceDescription, actionPane.priceDescription) && Intrinsics.d(this.saveButton, actionPane.saveButton) && Intrinsics.d(this.detailsButton, actionPane.detailsButton);
        }

        public final ButtonV3Atom.SmallIconButton getDetailsButton() {
            return this.detailsButton;
        }

        @NotNull
        public final TextAtom getPriceDescription() {
            return this.priceDescription;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSaveButton() {
            return this.saveButton;
        }

        public int hashCode() {
            int a11 = b.a(this.saveButton, this.priceDescription.hashCode() * 31, 31);
            ButtonV3Atom.SmallIconButton smallIconButton = this.detailsButton;
            return a11 + (smallIconButton == null ? 0 : smallIconButton.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActionPane(priceDescription=" + this.priceDescription + ", saveButton=" + this.saveButton + ", detailsButton=" + this.detailsButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$BaseTariff;", "", "baseTariffTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "baseTariffSubtitle", "textHandCarry", "textLuggage", "handCarry", "luggage", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getBaseTariffTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBaseTariffSubtitle", "getTextHandCarry", "getTextLuggage", "getHandCarry", "getLuggage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BaseTariff {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom baseTariffSubtitle;

        @NotNull
        private final TextAtom baseTariffTitle;
        private final TextAtom handCarry;
        private final TextAtom luggage;

        @NotNull
        private final TextAtom textHandCarry;

        @NotNull
        private final TextAtom textLuggage;

        public BaseTariff(@NotNull TextAtom baseTariffTitle, TextAtom textAtom, @NotNull TextAtom textHandCarry, @NotNull TextAtom textLuggage, TextAtom textAtom2, TextAtom textAtom3) {
            Intrinsics.checkNotNullParameter(baseTariffTitle, "baseTariffTitle");
            Intrinsics.checkNotNullParameter(textHandCarry, "textHandCarry");
            Intrinsics.checkNotNullParameter(textLuggage, "textLuggage");
            this.baseTariffTitle = baseTariffTitle;
            this.baseTariffSubtitle = textAtom;
            this.textHandCarry = textHandCarry;
            this.textLuggage = textLuggage;
            this.handCarry = textAtom2;
            this.luggage = textAtom3;
        }

        public static /* synthetic */ BaseTariff copy$default(BaseTariff baseTariff, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, TextAtom textAtom5, TextAtom textAtom6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = baseTariff.baseTariffTitle;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = baseTariff.baseTariffSubtitle;
            }
            if ((i11 & 4) != 0) {
                textAtom3 = baseTariff.textHandCarry;
            }
            if ((i11 & 8) != 0) {
                textAtom4 = baseTariff.textLuggage;
            }
            if ((i11 & 16) != 0) {
                textAtom5 = baseTariff.handCarry;
            }
            if ((i11 & 32) != 0) {
                textAtom6 = baseTariff.luggage;
            }
            TextAtom textAtom7 = textAtom5;
            TextAtom textAtom8 = textAtom6;
            return baseTariff.copy(textAtom, textAtom2, textAtom3, textAtom4, textAtom7, textAtom8);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getBaseTariffTitle() {
            return this.baseTariffTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getBaseTariffSubtitle() {
            return this.baseTariffSubtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getTextHandCarry() {
            return this.textHandCarry;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextAtom getTextLuggage() {
            return this.textLuggage;
        }

        /* renamed from: component5, reason: from getter */
        public final TextAtom getHandCarry() {
            return this.handCarry;
        }

        /* renamed from: component6, reason: from getter */
        public final TextAtom getLuggage() {
            return this.luggage;
        }

        @NotNull
        public final BaseTariff copy(@NotNull TextAtom baseTariffTitle, TextAtom baseTariffSubtitle, @NotNull TextAtom textHandCarry, @NotNull TextAtom textLuggage, TextAtom handCarry, TextAtom luggage) {
            Intrinsics.checkNotNullParameter(baseTariffTitle, "baseTariffTitle");
            Intrinsics.checkNotNullParameter(textHandCarry, "textHandCarry");
            Intrinsics.checkNotNullParameter(textLuggage, "textLuggage");
            return new BaseTariff(baseTariffTitle, baseTariffSubtitle, textHandCarry, textLuggage, handCarry, luggage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseTariff)) {
                return false;
            }
            BaseTariff baseTariff = (BaseTariff) other;
            return Intrinsics.d(this.baseTariffTitle, baseTariff.baseTariffTitle) && Intrinsics.d(this.baseTariffSubtitle, baseTariff.baseTariffSubtitle) && Intrinsics.d(this.textHandCarry, baseTariff.textHandCarry) && Intrinsics.d(this.textLuggage, baseTariff.textLuggage) && Intrinsics.d(this.handCarry, baseTariff.handCarry) && Intrinsics.d(this.luggage, baseTariff.luggage);
        }

        public final TextAtom getBaseTariffSubtitle() {
            return this.baseTariffSubtitle;
        }

        @NotNull
        public final TextAtom getBaseTariffTitle() {
            return this.baseTariffTitle;
        }

        public final TextAtom getHandCarry() {
            return this.handCarry;
        }

        public final TextAtom getLuggage() {
            return this.luggage;
        }

        @NotNull
        public final TextAtom getTextHandCarry() {
            return this.textHandCarry;
        }

        @NotNull
        public final TextAtom getTextLuggage() {
            return this.textLuggage;
        }

        public int hashCode() {
            int hashCode = this.baseTariffTitle.hashCode() * 31;
            TextAtom textAtom = this.baseTariffSubtitle;
            int b11 = C2619v.b(C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.textHandCarry), 31, this.textLuggage);
            TextAtom textAtom2 = this.handCarry;
            int hashCode2 = (b11 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            TextAtom textAtom3 = this.luggage;
            return hashCode2 + (textAtom3 != null ? textAtom3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.baseTariffTitle;
            TextAtom textAtom2 = this.baseTariffSubtitle;
            TextAtom textAtom3 = this.textHandCarry;
            TextAtom textAtom4 = this.textLuggage;
            TextAtom textAtom5 = this.handCarry;
            TextAtom textAtom6 = this.luggage;
            StringBuilder a11 = a.a("BaseTariff(baseTariffTitle=", textAtom, ", baseTariffSubtitle=", textAtom2, ", textHandCarry=");
            C4636t5.c(", textLuggage=", ", handCarry=", a11, textAtom3, textAtom4);
            a11.append(textAtom5);
            a11.append(", luggage=");
            a11.append(textAtom6);
            a11.append(")");
            return a11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$LuggageItem;", "", "luggageItemId", "", "price", "", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "<init>", "(Ljava/lang/String;ILru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;)V", "getLuggageItemId", "()Ljava/lang/String;", "getPrice", "()I", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageItem {
        public static final int $stable = 8;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell;

        @NotNull
        private final String luggageItemId;
        private final int price;

        public LuggageItem(@NotNull String luggageItemId, int i11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell) {
            Intrinsics.checkNotNullParameter(luggageItemId, "luggageItemId");
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.luggageItemId = luggageItemId;
            this.price = i11;
            this.cell = cell;
        }

        public static /* synthetic */ LuggageItem copy$default(LuggageItem luggageItem, String str, int i11, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = luggageItem.luggageItemId;
            }
            if ((i12 & 2) != 0) {
                i11 = luggageItem.price;
            }
            if ((i12 & 4) != 0) {
                cellWithSubtitleCheckboxRadioCounter = luggageItem.cell;
            }
            return luggageItem.copy(str, i11, cellWithSubtitleCheckboxRadioCounter);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLuggageItemId() {
            return this.luggageItemId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter getCell() {
            return this.cell;
        }

        @NotNull
        public final LuggageItem copy(@NotNull String luggageItemId, int price, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell) {
            Intrinsics.checkNotNullParameter(luggageItemId, "luggageItemId");
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new LuggageItem(luggageItemId, price, cell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageItem)) {
                return false;
            }
            LuggageItem luggageItem = (LuggageItem) other;
            return Intrinsics.d(this.luggageItemId, luggageItem.luggageItemId) && this.price == luggageItem.price && Intrinsics.d(this.cell, luggageItem.cell);
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter getCell() {
            return this.cell;
        }

        @NotNull
        public final String getLuggageItemId() {
            return this.luggageItemId;
        }

        public final int getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.cell.hashCode() + C2454a.a(this.price, this.luggageItemId.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.luggageItemId;
            int i11 = this.price;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter = this.cell;
            StringBuilder c11 = C3660k.c(i11, "LuggageItem(luggageItemId=", str, ", price=", ", cell=");
            c11.append(cellWithSubtitleCheckboxRadioCounter);
            c11.append(")");
            return c11.toString();
        }
    }

    public AdditionalLuggageV2DTO(@NotNull TextAtom title, @NotNull ActionPane actionPane, @NotNull List<Passenger> passengers, boolean z11, EmptyStateDTO emptyStateDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionPane, "actionPane");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.title = title;
        this.actionPane = actionPane;
        this.passengers = passengers;
        this.shouldFetchState = z11;
        this.emptyState = emptyStateDTO;
    }

    public static /* synthetic */ AdditionalLuggageV2DTO copy$default(AdditionalLuggageV2DTO additionalLuggageV2DTO, TextAtom textAtom, ActionPane actionPane, List list, boolean z11, EmptyStateDTO emptyStateDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = additionalLuggageV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            actionPane = additionalLuggageV2DTO.actionPane;
        }
        if ((i11 & 4) != 0) {
            list = additionalLuggageV2DTO.passengers;
        }
        if ((i11 & 8) != 0) {
            z11 = additionalLuggageV2DTO.shouldFetchState;
        }
        if ((i11 & 16) != 0) {
            emptyStateDTO = additionalLuggageV2DTO.emptyState;
        }
        EmptyStateDTO emptyStateDTO2 = emptyStateDTO;
        List list2 = list;
        return additionalLuggageV2DTO.copy(textAtom, actionPane, list2, z11, emptyStateDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ActionPane getActionPane() {
        return this.actionPane;
    }

    @NotNull
    public final List<Passenger> component3() {
        return this.passengers;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    /* renamed from: component5, reason: from getter */
    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    @NotNull
    public final AdditionalLuggageV2DTO copy(@NotNull TextAtom title, @NotNull ActionPane actionPane, @NotNull List<Passenger> passengers, boolean shouldFetchState, EmptyStateDTO emptyState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionPane, "actionPane");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        return new AdditionalLuggageV2DTO(title, actionPane, passengers, shouldFetchState, emptyState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalLuggageV2DTO)) {
            return false;
        }
        AdditionalLuggageV2DTO additionalLuggageV2DTO = (AdditionalLuggageV2DTO) other;
        return Intrinsics.d(this.title, additionalLuggageV2DTO.title) && Intrinsics.d(this.actionPane, additionalLuggageV2DTO.actionPane) && Intrinsics.d(this.passengers, additionalLuggageV2DTO.passengers) && this.shouldFetchState == additionalLuggageV2DTO.shouldFetchState && Intrinsics.d(this.emptyState, additionalLuggageV2DTO.emptyState);
    }

    @NotNull
    public final ActionPane getActionPane() {
        return this.actionPane;
    }

    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    @NotNull
    public final List<Passenger> getPassengers() {
        return this.passengers;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b((this.actionPane.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.passengers), 31, this.shouldFetchState);
        EmptyStateDTO emptyStateDTO = this.emptyState;
        return a11 + (emptyStateDTO == null ? 0 : emptyStateDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdditionalLuggageV2DTO(title=" + this.title + ", actionPane=" + this.actionPane + ", passengers=" + this.passengers + ", shouldFetchState=" + this.shouldFetchState + ", emptyState=" + this.emptyState + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$Passenger;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "flightsSegments", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFlightsSegments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Passenger {
        public static final int $stable = 8;

        @NotNull
        private final List<FlightSegment> flightsSegments;

        @NotNull
        private final TextAtom title;

        public Passenger(@NotNull TextAtom title, @NotNull List<FlightSegment> flightsSegments) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(flightsSegments, "flightsSegments");
            this.title = title;
            this.flightsSegments = flightsSegments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Passenger copy$default(Passenger passenger, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = passenger.title;
            }
            if ((i11 & 2) != 0) {
                list = passenger.flightsSegments;
            }
            return passenger.copy(textAtom, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final List<FlightSegment> component2() {
            return this.flightsSegments;
        }

        @NotNull
        public final Passenger copy(@NotNull TextAtom title, @NotNull List<FlightSegment> flightsSegments) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(flightsSegments, "flightsSegments");
            return new Passenger(title, flightsSegments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passenger)) {
                return false;
            }
            Passenger passenger = (Passenger) other;
            return Intrinsics.d(this.title, passenger.title) && Intrinsics.d(this.flightsSegments, passenger.flightsSegments);
        }

        @NotNull
        public final List<FlightSegment> getFlightsSegments() {
            return this.flightsSegments;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.flightsSegments.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("Passenger(title=", this.title, ", flightsSegments=", this.flightsSegments, ")");
        }

        public Passenger(TextAtom textAtom, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, (i11 & 2) != 0 ? K.f71697a : list);
        }
    }

    public AdditionalLuggageV2DTO(TextAtom textAtom, ActionPane actionPane, List list, boolean z11, EmptyStateDTO emptyStateDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, actionPane, (i11 & 4) != 0 ? K.f71697a : list, (i11 & 8) != 0 ? false : z11, emptyStateDTO);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;", "", "route", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "baseTariff", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$BaseTariff;", "additionalLuggageTitle", "additionalLuggageSubtitle", "noExtraLuggageInfo", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "luggageTransportation", "luggageItems", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$LuggageItem;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$BaseTariff;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;)V", "getRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBaseTariff", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$BaseTariff;", "getAdditionalLuggageTitle", "getAdditionalLuggageSubtitle", "getNoExtraLuggageInfo", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getLuggageTransportation", "getLuggageItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FlightSegment {
        public static final int $stable = 8;
        private final TextAtom additionalLuggageSubtitle;

        @NotNull
        private final TextAtom additionalLuggageTitle;
        private final BaseTariff baseTariff;

        @NotNull
        private final List<LuggageItem> luggageItems;
        private final DisclaimerAtom luggageTransportation;
        private final DisclaimerAtom noExtraLuggageInfo;

        @NotNull
        private final TextAtom route;

        public FlightSegment(@NotNull TextAtom route, BaseTariff baseTariff, @NotNull TextAtom additionalLuggageTitle, TextAtom textAtom, DisclaimerAtom disclaimerAtom, DisclaimerAtom disclaimerAtom2, @NotNull List<LuggageItem> luggageItems) {
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(additionalLuggageTitle, "additionalLuggageTitle");
            Intrinsics.checkNotNullParameter(luggageItems, "luggageItems");
            this.route = route;
            this.baseTariff = baseTariff;
            this.additionalLuggageTitle = additionalLuggageTitle;
            this.additionalLuggageSubtitle = textAtom;
            this.noExtraLuggageInfo = disclaimerAtom;
            this.luggageTransportation = disclaimerAtom2;
            this.luggageItems = luggageItems;
        }

        public static /* synthetic */ FlightSegment copy$default(FlightSegment flightSegment, TextAtom textAtom, BaseTariff baseTariff, TextAtom textAtom2, TextAtom textAtom3, DisclaimerAtom disclaimerAtom, DisclaimerAtom disclaimerAtom2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = flightSegment.route;
            }
            if ((i11 & 2) != 0) {
                baseTariff = flightSegment.baseTariff;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = flightSegment.additionalLuggageTitle;
            }
            if ((i11 & 8) != 0) {
                textAtom3 = flightSegment.additionalLuggageSubtitle;
            }
            if ((i11 & 16) != 0) {
                disclaimerAtom = flightSegment.noExtraLuggageInfo;
            }
            if ((i11 & 32) != 0) {
                disclaimerAtom2 = flightSegment.luggageTransportation;
            }
            if ((i11 & 64) != 0) {
                list = flightSegment.luggageItems;
            }
            DisclaimerAtom disclaimerAtom3 = disclaimerAtom2;
            List list2 = list;
            DisclaimerAtom disclaimerAtom4 = disclaimerAtom;
            TextAtom textAtom4 = textAtom2;
            return flightSegment.copy(textAtom, baseTariff, textAtom4, textAtom3, disclaimerAtom4, disclaimerAtom3, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getRoute() {
            return this.route;
        }

        /* renamed from: component2, reason: from getter */
        public final BaseTariff getBaseTariff() {
            return this.baseTariff;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getAdditionalLuggageTitle() {
            return this.additionalLuggageTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final TextAtom getAdditionalLuggageSubtitle() {
            return this.additionalLuggageSubtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final DisclaimerAtom getNoExtraLuggageInfo() {
            return this.noExtraLuggageInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final DisclaimerAtom getLuggageTransportation() {
            return this.luggageTransportation;
        }

        @NotNull
        public final List<LuggageItem> component7() {
            return this.luggageItems;
        }

        @NotNull
        public final FlightSegment copy(@NotNull TextAtom route, BaseTariff baseTariff, @NotNull TextAtom additionalLuggageTitle, TextAtom additionalLuggageSubtitle, DisclaimerAtom noExtraLuggageInfo, DisclaimerAtom luggageTransportation, @NotNull List<LuggageItem> luggageItems) {
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(additionalLuggageTitle, "additionalLuggageTitle");
            Intrinsics.checkNotNullParameter(luggageItems, "luggageItems");
            return new FlightSegment(route, baseTariff, additionalLuggageTitle, additionalLuggageSubtitle, noExtraLuggageInfo, luggageTransportation, luggageItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlightSegment)) {
                return false;
            }
            FlightSegment flightSegment = (FlightSegment) other;
            return Intrinsics.d(this.route, flightSegment.route) && Intrinsics.d(this.baseTariff, flightSegment.baseTariff) && Intrinsics.d(this.additionalLuggageTitle, flightSegment.additionalLuggageTitle) && Intrinsics.d(this.additionalLuggageSubtitle, flightSegment.additionalLuggageSubtitle) && Intrinsics.d(this.noExtraLuggageInfo, flightSegment.noExtraLuggageInfo) && Intrinsics.d(this.luggageTransportation, flightSegment.luggageTransportation) && Intrinsics.d(this.luggageItems, flightSegment.luggageItems);
        }

        public final TextAtom getAdditionalLuggageSubtitle() {
            return this.additionalLuggageSubtitle;
        }

        @NotNull
        public final TextAtom getAdditionalLuggageTitle() {
            return this.additionalLuggageTitle;
        }

        public final BaseTariff getBaseTariff() {
            return this.baseTariff;
        }

        @NotNull
        public final List<LuggageItem> getLuggageItems() {
            return this.luggageItems;
        }

        public final DisclaimerAtom getLuggageTransportation() {
            return this.luggageTransportation;
        }

        public final DisclaimerAtom getNoExtraLuggageInfo() {
            return this.noExtraLuggageInfo;
        }

        @NotNull
        public final TextAtom getRoute() {
            return this.route;
        }

        public int hashCode() {
            int hashCode = this.route.hashCode() * 31;
            BaseTariff baseTariff = this.baseTariff;
            int b11 = C2619v.b((hashCode + (baseTariff == null ? 0 : baseTariff.hashCode())) * 31, 31, this.additionalLuggageTitle);
            TextAtom textAtom = this.additionalLuggageSubtitle;
            int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            DisclaimerAtom disclaimerAtom = this.noExtraLuggageInfo;
            int hashCode3 = (hashCode2 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
            DisclaimerAtom disclaimerAtom2 = this.luggageTransportation;
            return this.luggageItems.hashCode() + ((hashCode3 + (disclaimerAtom2 != null ? disclaimerAtom2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.route;
            BaseTariff baseTariff = this.baseTariff;
            TextAtom textAtom2 = this.additionalLuggageTitle;
            TextAtom textAtom3 = this.additionalLuggageSubtitle;
            DisclaimerAtom disclaimerAtom = this.noExtraLuggageInfo;
            DisclaimerAtom disclaimerAtom2 = this.luggageTransportation;
            List<LuggageItem> list = this.luggageItems;
            StringBuilder sb2 = new StringBuilder("FlightSegment(route=");
            sb2.append(textAtom);
            sb2.append(", baseTariff=");
            sb2.append(baseTariff);
            sb2.append(", additionalLuggageTitle=");
            C4636t5.c(", additionalLuggageSubtitle=", ", noExtraLuggageInfo=", sb2, textAtom2, textAtom3);
            sb2.append(disclaimerAtom);
            sb2.append(", luggageTransportation=");
            sb2.append(disclaimerAtom2);
            sb2.append(", luggageItems=");
            return C2618u.h(sb2, list, ")");
        }

        public FlightSegment(TextAtom textAtom, BaseTariff baseTariff, TextAtom textAtom2, TextAtom textAtom3, DisclaimerAtom disclaimerAtom, DisclaimerAtom disclaimerAtom2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, baseTariff, textAtom2, textAtom3, disclaimerAtom, disclaimerAtom2, (i11 & 64) != 0 ? K.f71697a : list);
        }
    }
}
