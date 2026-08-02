package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data;

import Bl.C2639a;
import El.C2971a;
import G.g;
import Kk.C3532b;
import V.e;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0007./01234B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "tariffs", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;", "asyncBehaviorType", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;", "asyncParams", "", "", "priceDescriptionBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "luggageCellState", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$LuggageCellStateDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$LuggageCellStateDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTariffs", "()Ljava/util/List;", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;", "getAsyncParams", "()Ljava/util/Map;", "getPriceDescriptionBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLuggageCellState", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$LuggageCellStateDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "TariffDTO", "BenefitsListExpansion", "ShowMoreButtonDTO", "PriceBlockDTO", "BackgroundWrapper", "AsyncBehaviorType", "LuggageCellStateDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaCheckTariffsDTO {
    public static final int $stable = 8;

    @EnumNullFallback
    @NotNull
    private final AsyncBehaviorType asyncBehaviorType;
    private final Map<String, String> asyncParams;
    private final LuggageCellStateDTO luggageCellState;
    private final BadgeDTO priceDescriptionBadge;
    private final TextDTO subtitle;

    @NotNull
    private final List<TariffDTO> tariffs;

    @NotNull
    private final TextDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "FETCH_STATE", "REFRESH_PAGE", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "FETCH_STATE")
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 1);

        @i(name = "REFRESH_PAGE")
        public static final AsyncBehaviorType REFRESH_PAGE = new AsyncBehaviorType("REFRESH_PAGE", 2);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, FETCH_STATE, REFRESH_PAGE};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;", "", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackgroundWrapper {
        public static final int $stable = 0;

        @NotNull
        private final String endColor;

        @NotNull
        private final String startColor;

        public BackgroundWrapper(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            this.startColor = startColor;
            this.endColor = endColor;
        }

        public static /* synthetic */ BackgroundWrapper copy$default(BackgroundWrapper backgroundWrapper, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = backgroundWrapper.startColor;
            }
            if ((i11 & 2) != 0) {
                str2 = backgroundWrapper.endColor;
            }
            return backgroundWrapper.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStartColor() {
            return this.startColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final BackgroundWrapper copy(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            return new BackgroundWrapper(startColor, endColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundWrapper)) {
                return false;
            }
            BackgroundWrapper backgroundWrapper = (BackgroundWrapper) other;
            return Intrinsics.d(this.startColor, backgroundWrapper.startColor) && Intrinsics.d(this.endColor, backgroundWrapper.endColor);
        }

        @NotNull
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final String getStartColor() {
            return this.startColor;
        }

        public int hashCode() {
            return this.endColor.hashCode() + (this.startColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("BackgroundWrapper(startColor=", this.startColor, ", endColor=", this.endColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BenefitsListExpansion;", "", "initiallyVisibleBenefitsCount", "", "showMoreButton", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;", "<init>", "(ILru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;)V", "getInitiallyVisibleBenefitsCount", "()I", "getShowMoreButton", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BenefitsListExpansion {
        public static final int $stable = IconDTO.$stable;
        private final int initiallyVisibleBenefitsCount;

        @NotNull
        private final ShowMoreButtonDTO showMoreButton;

        public BenefitsListExpansion(int i11, @NotNull ShowMoreButtonDTO showMoreButton) {
            Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
            this.initiallyVisibleBenefitsCount = i11;
            this.showMoreButton = showMoreButton;
        }

        public static /* synthetic */ BenefitsListExpansion copy$default(BenefitsListExpansion benefitsListExpansion, int i11, ShowMoreButtonDTO showMoreButtonDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = benefitsListExpansion.initiallyVisibleBenefitsCount;
            }
            if ((i12 & 2) != 0) {
                showMoreButtonDTO = benefitsListExpansion.showMoreButton;
            }
            return benefitsListExpansion.copy(i11, showMoreButtonDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final int getInitiallyVisibleBenefitsCount() {
            return this.initiallyVisibleBenefitsCount;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ShowMoreButtonDTO getShowMoreButton() {
            return this.showMoreButton;
        }

        @NotNull
        public final BenefitsListExpansion copy(int initiallyVisibleBenefitsCount, @NotNull ShowMoreButtonDTO showMoreButton) {
            Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
            return new BenefitsListExpansion(initiallyVisibleBenefitsCount, showMoreButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BenefitsListExpansion)) {
                return false;
            }
            BenefitsListExpansion benefitsListExpansion = (BenefitsListExpansion) other;
            return this.initiallyVisibleBenefitsCount == benefitsListExpansion.initiallyVisibleBenefitsCount && Intrinsics.d(this.showMoreButton, benefitsListExpansion.showMoreButton);
        }

        public final int getInitiallyVisibleBenefitsCount() {
            return this.initiallyVisibleBenefitsCount;
        }

        @NotNull
        public final ShowMoreButtonDTO getShowMoreButton() {
            return this.showMoreButton;
        }

        public int hashCode() {
            return this.showMoreButton.hashCode() + (Integer.hashCode(this.initiallyVisibleBenefitsCount) * 31);
        }

        @NotNull
        public String toString() {
            return "BenefitsListExpansion(initiallyVisibleBenefitsCount=" + this.initiallyVisibleBenefitsCount + ", showMoreButton=" + this.showMoreButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$PriceBlockDTO;", "", "discountPriceCard", "Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "originalPriceCard", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;)V", "getDiscountPriceCard", "()Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "getOriginalPriceCard", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceBlockDTO {
        public static final int $stable = 8;

        @NotNull
        private final PriceCardDTO discountPriceCard;

        @NotNull
        private final PriceCardDTO originalPriceCard;

        public PriceBlockDTO(@NotNull PriceCardDTO discountPriceCard, @NotNull PriceCardDTO originalPriceCard) {
            Intrinsics.checkNotNullParameter(discountPriceCard, "discountPriceCard");
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            this.discountPriceCard = discountPriceCard;
            this.originalPriceCard = originalPriceCard;
        }

        public static /* synthetic */ PriceBlockDTO copy$default(PriceBlockDTO priceBlockDTO, PriceCardDTO priceCardDTO, PriceCardDTO priceCardDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceCardDTO = priceBlockDTO.discountPriceCard;
            }
            if ((i11 & 2) != 0) {
                priceCardDTO2 = priceBlockDTO.originalPriceCard;
            }
            return priceBlockDTO.copy(priceCardDTO, priceCardDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceCardDTO getDiscountPriceCard() {
            return this.discountPriceCard;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceCardDTO getOriginalPriceCard() {
            return this.originalPriceCard;
        }

        @NotNull
        public final PriceBlockDTO copy(@NotNull PriceCardDTO discountPriceCard, @NotNull PriceCardDTO originalPriceCard) {
            Intrinsics.checkNotNullParameter(discountPriceCard, "discountPriceCard");
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            return new PriceBlockDTO(discountPriceCard, originalPriceCard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceBlockDTO)) {
                return false;
            }
            PriceBlockDTO priceBlockDTO = (PriceBlockDTO) other;
            return Intrinsics.d(this.discountPriceCard, priceBlockDTO.discountPriceCard) && Intrinsics.d(this.originalPriceCard, priceBlockDTO.originalPriceCard);
        }

        @NotNull
        public final PriceCardDTO getDiscountPriceCard() {
            return this.discountPriceCard;
        }

        @NotNull
        public final PriceCardDTO getOriginalPriceCard() {
            return this.originalPriceCard;
        }

        public int hashCode() {
            return this.originalPriceCard.hashCode() + (this.discountPriceCard.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PriceBlockDTO(discountPriceCard=" + this.discountPriceCard + ", originalPriceCard=" + this.originalPriceCard + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowMoreButtonDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;

        public ShowMoreButtonDTO(@NotNull TextDTO text, @NotNull IconDTO icon, @NotNull CommonControlSettings common, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(common, "common");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.text = text;
            this.icon = icon;
            this.common = common;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ ShowMoreButtonDTO copy$default(ShowMoreButtonDTO showMoreButtonDTO, TextDTO textDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = showMoreButtonDTO.text;
            }
            if ((i11 & 2) != 0) {
                iconDTO = showMoreButtonDTO.icon;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = showMoreButtonDTO.common;
            }
            if ((i11 & 8) != 0) {
                str = showMoreButtonDTO.backgroundColor;
            }
            return showMoreButtonDTO.copy(textDTO, iconDTO, commonControlSettings, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ShowMoreButtonDTO copy(@NotNull TextDTO text, @NotNull IconDTO icon, @NotNull CommonControlSettings common, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(common, "common");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new ShowMoreButtonDTO(text, icon, common, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowMoreButtonDTO)) {
                return false;
            }
            ShowMoreButtonDTO showMoreButtonDTO = (ShowMoreButtonDTO) other;
            return Intrinsics.d(this.text, showMoreButtonDTO.text) && Intrinsics.d(this.icon, showMoreButtonDTO.icon) && Intrinsics.d(this.common, showMoreButtonDTO.common) && Intrinsics.d(this.backgroundColor, showMoreButtonDTO.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + Bi.a.a(this.common, C2971a.a(this.icon, this.text.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.icon;
            CommonControlSettings commonControlSettings = this.common;
            String str = this.backgroundColor;
            StringBuilder d11 = C2639a.d("ShowMoreButtonDTO(text=", ", icon=", ", common=", iconDTO, textDTO);
            d11.append(commonControlSettings);
            d11.append(", backgroundColor=");
            d11.append(str);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0017\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\t\u0010D\u001a\u00020\u0019HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001dHÆ\u0003JÉ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0013\u0010H\u001a\u00020\u00192\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "route", "milesBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "benefits", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "borderColor", "", "backgroundColor", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;", "marketingImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "clickTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "isSelected", "", "priceBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$PriceBlockDTO;", "benefitsListExpansion", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BenefitsListExpansion;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;ZLru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$PriceBlockDTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BenefitsListExpansion;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getRoute", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBenefits", "()Ljava/util/List;", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;", "getMarketingImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getClickTrackingInfo", "()Ljava/util/Map;", "getViewTrackingInfo", "()Z", "getPriceBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$PriceBlockDTO;", "getBenefitsListExpansion", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BenefitsListExpansion;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TariffDTO {
        public static final int $stable = 8;
        private final BackgroundWrapper backgroundColor;

        @NotNull
        private final List<CellDTO> benefits;
        private final BenefitsListExpansion benefitsListExpansion;
        private final String borderColor;
        private final AtomActionDTO clickAction;
        private final Map<String, TokenizedTrackingInfo> clickTrackingInfo;
        private final boolean isSelected;
        private final ImageDTO marketingImage;
        private final BadgeDTO milesBadge;
        private final PriceDTO price;
        private final PriceBlockDTO priceBlock;
        private final TextDTO route;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

        public TariffDTO(@NotNull TextDTO title, PriceDTO priceDTO, TextDTO textDTO, BadgeDTO badgeDTO, @NotNull List<CellDTO> benefits, String str, BackgroundWrapper backgroundWrapper, ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, boolean z11, PriceBlockDTO priceBlockDTO, BenefitsListExpansion benefitsListExpansion) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.title = title;
            this.price = priceDTO;
            this.route = textDTO;
            this.milesBadge = badgeDTO;
            this.benefits = benefits;
            this.borderColor = str;
            this.backgroundColor = backgroundWrapper;
            this.marketingImage = imageDTO;
            this.clickAction = atomActionDTO;
            this.clickTrackingInfo = map;
            this.viewTrackingInfo = map2;
            this.isSelected = z11;
            this.priceBlock = priceBlockDTO;
            this.benefitsListExpansion = benefitsListExpansion;
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.clickTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.viewTrackingInfo;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component13, reason: from getter */
        public final PriceBlockDTO getPriceBlock() {
            return this.priceBlock;
        }

        /* renamed from: component14, reason: from getter */
        public final BenefitsListExpansion getBenefitsListExpansion() {
            return this.benefitsListExpansion;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getRoute() {
            return this.route;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        @NotNull
        public final List<CellDTO> component5() {
            return this.benefits;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component7, reason: from getter */
        public final BackgroundWrapper getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ImageDTO getMarketingImage() {
            return this.marketingImage;
        }

        /* renamed from: component9, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final TariffDTO copy(@NotNull TextDTO title, PriceDTO price, TextDTO route, BadgeDTO milesBadge, @NotNull List<CellDTO> benefits, String borderColor, BackgroundWrapper backgroundColor, ImageDTO marketingImage, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> clickTrackingInfo, Map<String, TokenizedTrackingInfo> viewTrackingInfo, boolean isSelected, PriceBlockDTO priceBlock, BenefitsListExpansion benefitsListExpansion) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            return new TariffDTO(title, price, route, milesBadge, benefits, borderColor, backgroundColor, marketingImage, clickAction, clickTrackingInfo, viewTrackingInfo, isSelected, priceBlock, benefitsListExpansion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TariffDTO)) {
                return false;
            }
            TariffDTO tariffDTO = (TariffDTO) other;
            return Intrinsics.d(this.title, tariffDTO.title) && Intrinsics.d(this.price, tariffDTO.price) && Intrinsics.d(this.route, tariffDTO.route) && Intrinsics.d(this.milesBadge, tariffDTO.milesBadge) && Intrinsics.d(this.benefits, tariffDTO.benefits) && Intrinsics.d(this.borderColor, tariffDTO.borderColor) && Intrinsics.d(this.backgroundColor, tariffDTO.backgroundColor) && Intrinsics.d(this.marketingImage, tariffDTO.marketingImage) && Intrinsics.d(this.clickAction, tariffDTO.clickAction) && Intrinsics.d(this.clickTrackingInfo, tariffDTO.clickTrackingInfo) && Intrinsics.d(this.viewTrackingInfo, tariffDTO.viewTrackingInfo) && this.isSelected == tariffDTO.isSelected && Intrinsics.d(this.priceBlock, tariffDTO.priceBlock) && Intrinsics.d(this.benefitsListExpansion, tariffDTO.benefitsListExpansion);
        }

        public final BackgroundWrapper getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<CellDTO> getBenefits() {
            return this.benefits;
        }

        public final BenefitsListExpansion getBenefitsListExpansion() {
            return this.benefitsListExpansion;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> getClickTrackingInfo() {
            return this.clickTrackingInfo;
        }

        public final ImageDTO getMarketingImage() {
            return this.marketingImage;
        }

        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final PriceBlockDTO getPriceBlock() {
            return this.priceBlock;
        }

        public final TextDTO getRoute() {
            return this.route;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
            return this.viewTrackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            TextDTO textDTO = this.route;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.milesBadge;
            int b11 = g.b((hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.benefits);
            String str = this.borderColor;
            int hashCode4 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
            BackgroundWrapper backgroundWrapper = this.backgroundColor;
            int hashCode5 = (hashCode4 + (backgroundWrapper == null ? 0 : backgroundWrapper.hashCode())) * 31;
            ImageDTO imageDTO = this.marketingImage;
            int hashCode6 = (hashCode5 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.clickTrackingInfo;
            int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
            int a11 = C3532b.a((hashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.isSelected);
            PriceBlockDTO priceBlockDTO = this.priceBlock;
            int hashCode9 = (a11 + (priceBlockDTO == null ? 0 : priceBlockDTO.hashCode())) * 31;
            BenefitsListExpansion benefitsListExpansion = this.benefitsListExpansion;
            return hashCode9 + (benefitsListExpansion != null ? benefitsListExpansion.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            PriceDTO priceDTO = this.price;
            TextDTO textDTO2 = this.route;
            BadgeDTO badgeDTO = this.milesBadge;
            List<CellDTO> list = this.benefits;
            String str = this.borderColor;
            BackgroundWrapper backgroundWrapper = this.backgroundColor;
            ImageDTO imageDTO = this.marketingImage;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.clickTrackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
            boolean z11 = this.isSelected;
            PriceBlockDTO priceBlockDTO = this.priceBlock;
            BenefitsListExpansion benefitsListExpansion = this.benefitsListExpansion;
            StringBuilder sb2 = new StringBuilder("TariffDTO(title=");
            sb2.append(textDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", route=");
            sb2.append(textDTO2);
            sb2.append(", milesBadge=");
            sb2.append(badgeDTO);
            sb2.append(", benefits=");
            Cm.e.i(", borderColor=", str, ", backgroundColor=", sb2, list);
            sb2.append(backgroundWrapper);
            sb2.append(", marketingImage=");
            sb2.append(imageDTO);
            sb2.append(", clickAction=");
            Sh.b.f(sb2, atomActionDTO, ", clickTrackingInfo=", map, ", viewTrackingInfo=");
            sb2.append(map2);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", priceBlock=");
            sb2.append(priceBlockDTO);
            sb2.append(", benefitsListExpansion=");
            sb2.append(benefitsListExpansion);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public AviaCheckTariffsDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull List<TariffDTO> tariffs, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, String> map, BadgeDTO badgeDTO, LuggageCellStateDTO luggageCellStateDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        this.title = title;
        this.subtitle = textDTO;
        this.tariffs = tariffs;
        this.asyncBehaviorType = asyncBehaviorType;
        this.asyncParams = map;
        this.priceDescriptionBadge = badgeDTO;
        this.luggageCellState = luggageCellStateDTO;
    }

    public static /* synthetic */ AviaCheckTariffsDTO copy$default(AviaCheckTariffsDTO aviaCheckTariffsDTO, TextDTO textDTO, TextDTO textDTO2, List list, AsyncBehaviorType asyncBehaviorType, Map map, BadgeDTO badgeDTO, LuggageCellStateDTO luggageCellStateDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = aviaCheckTariffsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = aviaCheckTariffsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = aviaCheckTariffsDTO.tariffs;
        }
        if ((i11 & 8) != 0) {
            asyncBehaviorType = aviaCheckTariffsDTO.asyncBehaviorType;
        }
        if ((i11 & 16) != 0) {
            map = aviaCheckTariffsDTO.asyncParams;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = aviaCheckTariffsDTO.priceDescriptionBadge;
        }
        if ((i11 & 64) != 0) {
            luggageCellStateDTO = aviaCheckTariffsDTO.luggageCellState;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        LuggageCellStateDTO luggageCellStateDTO2 = luggageCellStateDTO;
        Map map2 = map;
        List list2 = list;
        return aviaCheckTariffsDTO.copy(textDTO, textDTO2, list2, asyncBehaviorType, map2, badgeDTO2, luggageCellStateDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<TariffDTO> component3() {
        return this.tariffs;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final Map<String, String> component5() {
        return this.asyncParams;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getPriceDescriptionBadge() {
        return this.priceDescriptionBadge;
    }

    /* renamed from: component7, reason: from getter */
    public final LuggageCellStateDTO getLuggageCellState() {
        return this.luggageCellState;
    }

    @NotNull
    public final AviaCheckTariffsDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull List<TariffDTO> tariffs, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, String> asyncParams, BadgeDTO priceDescriptionBadge, LuggageCellStateDTO luggageCellState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        return new AviaCheckTariffsDTO(title, subtitle, tariffs, asyncBehaviorType, asyncParams, priceDescriptionBadge, luggageCellState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaCheckTariffsDTO)) {
            return false;
        }
        AviaCheckTariffsDTO aviaCheckTariffsDTO = (AviaCheckTariffsDTO) other;
        return Intrinsics.d(this.title, aviaCheckTariffsDTO.title) && Intrinsics.d(this.subtitle, aviaCheckTariffsDTO.subtitle) && Intrinsics.d(this.tariffs, aviaCheckTariffsDTO.tariffs) && this.asyncBehaviorType == aviaCheckTariffsDTO.asyncBehaviorType && Intrinsics.d(this.asyncParams, aviaCheckTariffsDTO.asyncParams) && Intrinsics.d(this.priceDescriptionBadge, aviaCheckTariffsDTO.priceDescriptionBadge) && Intrinsics.d(this.luggageCellState, aviaCheckTariffsDTO.luggageCellState);
    }

    @NotNull
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    public final LuggageCellStateDTO getLuggageCellState() {
        return this.luggageCellState;
    }

    public final BadgeDTO getPriceDescriptionBadge() {
        return this.priceDescriptionBadge;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<TariffDTO> getTariffs() {
        return this.tariffs;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (this.asyncBehaviorType.hashCode() + g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.tariffs)) * 31;
        Map<String, String> map = this.asyncParams;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        BadgeDTO badgeDTO = this.priceDescriptionBadge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        LuggageCellStateDTO luggageCellStateDTO = this.luggageCellState;
        return hashCode4 + (luggageCellStateDTO != null ? luggageCellStateDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<TariffDTO> list = this.tariffs;
        AsyncBehaviorType asyncBehaviorType = this.asyncBehaviorType;
        Map<String, String> map = this.asyncParams;
        BadgeDTO badgeDTO = this.priceDescriptionBadge;
        LuggageCellStateDTO luggageCellStateDTO = this.luggageCellState;
        StringBuilder g10 = D3.g.g("AviaCheckTariffsDTO(title=", textDTO, ", subtitle=", textDTO2, ", tariffs=");
        g10.append(list);
        g10.append(", asyncBehaviorType=");
        g10.append(asyncBehaviorType);
        g10.append(", asyncParams=");
        g10.append(map);
        g10.append(", priceDescriptionBadge=");
        g10.append(badgeDTO);
        g10.append(", luggageCellState=");
        g10.append(luggageCellStateDTO);
        g10.append(")");
        return g10.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$LuggageCellStateDTO;", "", "luggageCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "shouldShowLuggageCellShimmer", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "getLuggageCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getShouldShowLuggageCellShimmer", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageCellStateDTO {
        public static final int $stable = CellDTO.$stable;
        private final CellDTO luggageCell;
        private final boolean shouldShowLuggageCellShimmer;

        public LuggageCellStateDTO(CellDTO cellDTO, boolean z11) {
            this.luggageCell = cellDTO;
            this.shouldShowLuggageCellShimmer = z11;
        }

        public static /* synthetic */ LuggageCellStateDTO copy$default(LuggageCellStateDTO luggageCellStateDTO, CellDTO cellDTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = luggageCellStateDTO.luggageCell;
            }
            if ((i11 & 2) != 0) {
                z11 = luggageCellStateDTO.shouldShowLuggageCellShimmer;
            }
            return luggageCellStateDTO.copy(cellDTO, z11);
        }

        /* renamed from: component1, reason: from getter */
        public final CellDTO getLuggageCell() {
            return this.luggageCell;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldShowLuggageCellShimmer() {
            return this.shouldShowLuggageCellShimmer;
        }

        @NotNull
        public final LuggageCellStateDTO copy(CellDTO luggageCell, boolean shouldShowLuggageCellShimmer) {
            return new LuggageCellStateDTO(luggageCell, shouldShowLuggageCellShimmer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageCellStateDTO)) {
                return false;
            }
            LuggageCellStateDTO luggageCellStateDTO = (LuggageCellStateDTO) other;
            return Intrinsics.d(this.luggageCell, luggageCellStateDTO.luggageCell) && this.shouldShowLuggageCellShimmer == luggageCellStateDTO.shouldShowLuggageCellShimmer;
        }

        public final CellDTO getLuggageCell() {
            return this.luggageCell;
        }

        public final boolean getShouldShowLuggageCellShimmer() {
            return this.shouldShowLuggageCellShimmer;
        }

        public int hashCode() {
            CellDTO cellDTO = this.luggageCell;
            return Boolean.hashCode(this.shouldShowLuggageCellShimmer) + ((cellDTO == null ? 0 : cellDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "LuggageCellStateDTO(luggageCell=" + this.luggageCell + ", shouldShowLuggageCellShimmer=" + this.shouldShowLuggageCellShimmer + ")";
        }

        public /* synthetic */ LuggageCellStateDTO(CellDTO cellDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(cellDTO, (i11 & 2) != 0 ? false : z11);
        }
    }

    public /* synthetic */ AviaCheckTariffsDTO(TextDTO textDTO, TextDTO textDTO2, List list, AsyncBehaviorType asyncBehaviorType, Map map, BadgeDTO badgeDTO, LuggageCellStateDTO luggageCellStateDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, list, (i11 & 8) != 0 ? AsyncBehaviorType.NO_ACTION : asyncBehaviorType, map, badgeDTO, luggageCellStateDTO);
    }
}
