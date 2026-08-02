package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsDTO;", "", "continueButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "scrollToWidgetButton", "luggage", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "priceDescription", "Lru/ozon/uni/atoms/data/text/TextDTO;", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "shouldAnimateLuggageAppearance", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Z)V", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getScrollToWidgetButton", "getLuggage", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPriceDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getViewTracking", "()Ljava/util/Map;", "getShouldAnimateLuggageAppearance", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaCheckTariffsPriceDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO continueButton;
    private final CellDTO luggage;
    private final TextDTO priceDescription;
    private final ButtonV3DTO scrollToWidgetButton;
    private final boolean shouldAnimateLuggageAppearance;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    public AviaCheckTariffsPriceDetailsDTO(@NotNull ButtonV3DTO continueButton, ButtonV3DTO buttonV3DTO, CellDTO cellDTO, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map, boolean z11) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.continueButton = continueButton;
        this.scrollToWidgetButton = buttonV3DTO;
        this.luggage = cellDTO;
        this.priceDescription = textDTO;
        this.viewTracking = map;
        this.shouldAnimateLuggageAppearance = z11;
    }

    public static /* synthetic */ AviaCheckTariffsPriceDetailsDTO copy$default(AviaCheckTariffsPriceDetailsDTO aviaCheckTariffsPriceDetailsDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, CellDTO cellDTO, TextDTO textDTO, Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = aviaCheckTariffsPriceDetailsDTO.continueButton;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO2 = aviaCheckTariffsPriceDetailsDTO.scrollToWidgetButton;
        }
        if ((i11 & 4) != 0) {
            cellDTO = aviaCheckTariffsPriceDetailsDTO.luggage;
        }
        if ((i11 & 8) != 0) {
            textDTO = aviaCheckTariffsPriceDetailsDTO.priceDescription;
        }
        if ((i11 & 16) != 0) {
            map = aviaCheckTariffsPriceDetailsDTO.viewTracking;
        }
        if ((i11 & 32) != 0) {
            z11 = aviaCheckTariffsPriceDetailsDTO.shouldAnimateLuggageAppearance;
        }
        Map map2 = map;
        boolean z12 = z11;
        return aviaCheckTariffsPriceDetailsDTO.copy(buttonV3DTO, buttonV3DTO2, cellDTO, textDTO, map2, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getScrollToWidgetButton() {
        return this.scrollToWidgetButton;
    }

    /* renamed from: component3, reason: from getter */
    public final CellDTO getLuggage() {
        return this.luggage;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getPriceDescription() {
        return this.priceDescription;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.viewTracking;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldAnimateLuggageAppearance() {
        return this.shouldAnimateLuggageAppearance;
    }

    @NotNull
    public final AviaCheckTariffsPriceDetailsDTO copy(@NotNull ButtonV3DTO continueButton, ButtonV3DTO scrollToWidgetButton, CellDTO luggage, TextDTO priceDescription, Map<String, TokenizedTrackingInfo> viewTracking, boolean shouldAnimateLuggageAppearance) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        return new AviaCheckTariffsPriceDetailsDTO(continueButton, scrollToWidgetButton, luggage, priceDescription, viewTracking, shouldAnimateLuggageAppearance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaCheckTariffsPriceDetailsDTO)) {
            return false;
        }
        AviaCheckTariffsPriceDetailsDTO aviaCheckTariffsPriceDetailsDTO = (AviaCheckTariffsPriceDetailsDTO) other;
        return Intrinsics.d(this.continueButton, aviaCheckTariffsPriceDetailsDTO.continueButton) && Intrinsics.d(this.scrollToWidgetButton, aviaCheckTariffsPriceDetailsDTO.scrollToWidgetButton) && Intrinsics.d(this.luggage, aviaCheckTariffsPriceDetailsDTO.luggage) && Intrinsics.d(this.priceDescription, aviaCheckTariffsPriceDetailsDTO.priceDescription) && Intrinsics.d(this.viewTracking, aviaCheckTariffsPriceDetailsDTO.viewTracking) && this.shouldAnimateLuggageAppearance == aviaCheckTariffsPriceDetailsDTO.shouldAnimateLuggageAppearance;
    }

    @NotNull
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    public final CellDTO getLuggage() {
        return this.luggage;
    }

    public final TextDTO getPriceDescription() {
        return this.priceDescription;
    }

    public final ButtonV3DTO getScrollToWidgetButton() {
        return this.scrollToWidgetButton;
    }

    public final boolean getShouldAnimateLuggageAppearance() {
        return this.shouldAnimateLuggageAppearance;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int hashCode = this.continueButton.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.scrollToWidgetButton;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        CellDTO cellDTO = this.luggage;
        int hashCode3 = (hashCode2 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TextDTO textDTO = this.priceDescription;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        return Boolean.hashCode(this.shouldAnimateLuggageAppearance) + ((hashCode4 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AviaCheckTariffsPriceDetailsDTO(continueButton=" + this.continueButton + ", scrollToWidgetButton=" + this.scrollToWidgetButton + ", luggage=" + this.luggage + ", priceDescription=" + this.priceDescription + ", viewTracking=" + this.viewTracking + ", shouldAnimateLuggageAppearance=" + this.shouldAnimateLuggageAppearance + ")";
    }

    public /* synthetic */ AviaCheckTariffsPriceDetailsDTO(ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, CellDTO cellDTO, TextDTO textDTO, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonV3DTO, buttonV3DTO2, cellDTO, textDTO, map, (i11 & 32) != 0 ? false : z11);
    }
}
