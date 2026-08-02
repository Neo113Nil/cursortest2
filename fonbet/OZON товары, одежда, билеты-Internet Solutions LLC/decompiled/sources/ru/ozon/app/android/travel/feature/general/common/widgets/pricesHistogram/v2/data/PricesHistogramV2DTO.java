package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.data;

import Am.C2438a;
import B0.C2454a;
import D40.d;
import De.C2859b;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ns.b;
import T7.P;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u000212B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO;", "", "direction", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tabThere", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "tabBack", "monthsThere", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO;", "monthsBack", "findTicketsButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "availableColors", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$AvailableColorsDTO;", "toggleCalendarButton", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$AvailableColorsDTO;Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;)V", "getDirection", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTabThere", "()Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "getTabBack", "getMonthsThere", "()Ljava/util/List;", "getMonthsBack", "getFindTicketsButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAvailableColors", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$AvailableColorsDTO;", "getToggleCalendarButton", "()Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MonthDTO", "AvailableColorsDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PricesHistogramV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final AvailableColorsDTO availableColors;

    @NotNull
    private final TextDTO direction;

    @NotNull
    private final ButtonV3DTO findTicketsButton;
    private final List<MonthDTO> monthsBack;

    @NotNull
    private final List<MonthDTO> monthsThere;
    private final ChipDTO tabBack;
    private final ChipDTO tabThere;
    private final ToggleTitleSubtitleCellDTO toggleCalendarButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$AvailableColorsDTO;", "", "selectedColumnColor", "", "defaultColumnColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSelectedColumnColor", "()Ljava/lang/String;", "getDefaultColumnColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvailableColorsDTO {
        public static final int $stable = 0;

        @NotNull
        private final String defaultColumnColor;

        @NotNull
        private final String selectedColumnColor;

        public AvailableColorsDTO(@NotNull String selectedColumnColor, @NotNull String defaultColumnColor) {
            Intrinsics.checkNotNullParameter(selectedColumnColor, "selectedColumnColor");
            Intrinsics.checkNotNullParameter(defaultColumnColor, "defaultColumnColor");
            this.selectedColumnColor = selectedColumnColor;
            this.defaultColumnColor = defaultColumnColor;
        }

        public static /* synthetic */ AvailableColorsDTO copy$default(AvailableColorsDTO availableColorsDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = availableColorsDTO.selectedColumnColor;
            }
            if ((i11 & 2) != 0) {
                str2 = availableColorsDTO.defaultColumnColor;
            }
            return availableColorsDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSelectedColumnColor() {
            return this.selectedColumnColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDefaultColumnColor() {
            return this.defaultColumnColor;
        }

        @NotNull
        public final AvailableColorsDTO copy(@NotNull String selectedColumnColor, @NotNull String defaultColumnColor) {
            Intrinsics.checkNotNullParameter(selectedColumnColor, "selectedColumnColor");
            Intrinsics.checkNotNullParameter(defaultColumnColor, "defaultColumnColor");
            return new AvailableColorsDTO(selectedColumnColor, defaultColumnColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvailableColorsDTO)) {
                return false;
            }
            AvailableColorsDTO availableColorsDTO = (AvailableColorsDTO) other;
            return Intrinsics.d(this.selectedColumnColor, availableColorsDTO.selectedColumnColor) && Intrinsics.d(this.defaultColumnColor, availableColorsDTO.defaultColumnColor);
        }

        @NotNull
        public final String getDefaultColumnColor() {
            return this.defaultColumnColor;
        }

        @NotNull
        public final String getSelectedColumnColor() {
            return this.selectedColumnColor;
        }

        public int hashCode() {
            return this.defaultColumnColor.hashCode() + (this.selectedColumnColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("AvailableColorsDTO(selectedColumnColor=", this.selectedColumnColor, ", defaultColumnColor=", this.defaultColumnColor, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO;", "", "days", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO$DayDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getDays", "()Ljava/util/List;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DayDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MonthDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<DayDTO> days;

        @NotNull
        private final TextDTO title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0085\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO$DayDTO;", "", "dayHeight", "", "dayHeightDirect", "number", "", "date", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "isSelected", "", "priceOrMessage", "priceOrMessageDirect", "price", "priceDirect", "daySelectionTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IILjava/util/Map;)V", "getDayHeight", "()I", "getDayHeightDirect", "getNumber", "()Ljava/lang/String;", "getDate", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "getPriceOrMessage", "getPriceOrMessageDirect", "getPrice", "getPriceDirect", "getDaySelectionTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DayDTO {
            public static final int $stable = 8;

            @NotNull
            private final String date;
            private final int dayHeight;
            private final int dayHeightDirect;
            private final Map<String, TokenizedTrackingInfo> daySelectionTracking;
            private final boolean isSelected;

            @NotNull
            private final String number;
            private final int price;
            private final int priceDirect;

            @NotNull
            private final TextDTO priceOrMessage;

            @NotNull
            private final TextDTO priceOrMessageDirect;

            @NotNull
            private final TextDTO title;

            public DayDTO(int i11, int i12, @NotNull String number, @NotNull String date, @NotNull TextDTO title, boolean z11, @NotNull TextDTO priceOrMessage, @NotNull TextDTO priceOrMessageDirect, int i13, int i14, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(priceOrMessage, "priceOrMessage");
                Intrinsics.checkNotNullParameter(priceOrMessageDirect, "priceOrMessageDirect");
                this.dayHeight = i11;
                this.dayHeightDirect = i12;
                this.number = number;
                this.date = date;
                this.title = title;
                this.isSelected = z11;
                this.priceOrMessage = priceOrMessage;
                this.priceOrMessageDirect = priceOrMessageDirect;
                this.price = i13;
                this.priceDirect = i14;
                this.daySelectionTracking = map;
            }

            public static /* synthetic */ DayDTO copy$default(DayDTO dayDTO, int i11, int i12, String str, String str2, TextDTO textDTO, boolean z11, TextDTO textDTO2, TextDTO textDTO3, int i13, int i14, Map map, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    i11 = dayDTO.dayHeight;
                }
                if ((i15 & 2) != 0) {
                    i12 = dayDTO.dayHeightDirect;
                }
                if ((i15 & 4) != 0) {
                    str = dayDTO.number;
                }
                if ((i15 & 8) != 0) {
                    str2 = dayDTO.date;
                }
                if ((i15 & 16) != 0) {
                    textDTO = dayDTO.title;
                }
                if ((i15 & 32) != 0) {
                    z11 = dayDTO.isSelected;
                }
                if ((i15 & 64) != 0) {
                    textDTO2 = dayDTO.priceOrMessage;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    textDTO3 = dayDTO.priceOrMessageDirect;
                }
                if ((i15 & 256) != 0) {
                    i13 = dayDTO.price;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    i14 = dayDTO.priceDirect;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    map = dayDTO.daySelectionTracking;
                }
                int i16 = i14;
                Map map2 = map;
                TextDTO textDTO4 = textDTO3;
                int i17 = i13;
                boolean z12 = z11;
                TextDTO textDTO5 = textDTO2;
                TextDTO textDTO6 = textDTO;
                String str3 = str;
                return dayDTO.copy(i11, i12, str3, str2, textDTO6, z12, textDTO5, textDTO4, i17, i16, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDayHeight() {
                return this.dayHeight;
            }

            /* renamed from: component10, reason: from getter */
            public final int getPriceDirect() {
                return this.priceDirect;
            }

            public final Map<String, TokenizedTrackingInfo> component11() {
                return this.daySelectionTracking;
            }

            /* renamed from: component2, reason: from getter */
            public final int getDayHeightDirect() {
                return this.dayHeightDirect;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getDate() {
                return this.date;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final TextDTO getPriceOrMessage() {
                return this.priceOrMessage;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final TextDTO getPriceOrMessageDirect() {
                return this.priceOrMessageDirect;
            }

            /* renamed from: component9, reason: from getter */
            public final int getPrice() {
                return this.price;
            }

            @NotNull
            public final DayDTO copy(int dayHeight, int dayHeightDirect, @NotNull String number, @NotNull String date, @NotNull TextDTO title, boolean isSelected, @NotNull TextDTO priceOrMessage, @NotNull TextDTO priceOrMessageDirect, int price, int priceDirect, Map<String, TokenizedTrackingInfo> daySelectionTracking) {
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(priceOrMessage, "priceOrMessage");
                Intrinsics.checkNotNullParameter(priceOrMessageDirect, "priceOrMessageDirect");
                return new DayDTO(dayHeight, dayHeightDirect, number, date, title, isSelected, priceOrMessage, priceOrMessageDirect, price, priceDirect, daySelectionTracking);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DayDTO)) {
                    return false;
                }
                DayDTO dayDTO = (DayDTO) other;
                return this.dayHeight == dayDTO.dayHeight && this.dayHeightDirect == dayDTO.dayHeightDirect && Intrinsics.d(this.number, dayDTO.number) && Intrinsics.d(this.date, dayDTO.date) && Intrinsics.d(this.title, dayDTO.title) && this.isSelected == dayDTO.isSelected && Intrinsics.d(this.priceOrMessage, dayDTO.priceOrMessage) && Intrinsics.d(this.priceOrMessageDirect, dayDTO.priceOrMessageDirect) && this.price == dayDTO.price && this.priceDirect == dayDTO.priceDirect && Intrinsics.d(this.daySelectionTracking, dayDTO.daySelectionTracking);
            }

            @NotNull
            public final String getDate() {
                return this.date;
            }

            public final int getDayHeight() {
                return this.dayHeight;
            }

            public final int getDayHeightDirect() {
                return this.dayHeightDirect;
            }

            public final Map<String, TokenizedTrackingInfo> getDaySelectionTracking() {
                return this.daySelectionTracking;
            }

            @NotNull
            public final String getNumber() {
                return this.number;
            }

            public final int getPrice() {
                return this.price;
            }

            public final int getPriceDirect() {
                return this.priceDirect;
            }

            @NotNull
            public final TextDTO getPriceOrMessage() {
                return this.priceOrMessage;
            }

            @NotNull
            public final TextDTO getPriceOrMessageDirect() {
                return this.priceOrMessageDirect;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.priceDirect, C2454a.a(this.price, b.a(this.priceOrMessageDirect, b.a(this.priceOrMessage, C3532b.a(b.a(this.title, g.a(g.a(C2454a.a(this.dayHeightDirect, Integer.hashCode(this.dayHeight) * 31, 31), 31, this.number), 31, this.date), 31), 31, this.isSelected), 31), 31), 31), 31);
                Map<String, TokenizedTrackingInfo> map = this.daySelectionTracking;
                return a11 + (map == null ? 0 : map.hashCode());
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                int i11 = this.dayHeight;
                int i12 = this.dayHeightDirect;
                String str = this.number;
                String str2 = this.date;
                TextDTO textDTO = this.title;
                boolean z11 = this.isSelected;
                TextDTO textDTO2 = this.priceOrMessage;
                TextDTO textDTO3 = this.priceOrMessageDirect;
                int i13 = this.price;
                int i14 = this.priceDirect;
                Map<String, TokenizedTrackingInfo> map = this.daySelectionTracking;
                StringBuilder a11 = C2438a.a("DayDTO(dayHeight=", i11, ", dayHeightDirect=", ", number=", i12);
                a.h(a11, str, ", date=", str2, ", title=");
                a11.append(textDTO);
                a11.append(", isSelected=");
                a11.append(z11);
                a11.append(", priceOrMessage=");
                d.e(", priceOrMessageDirect=", ", price=", a11, textDTO2, textDTO3);
                Ek.a.f(i13, i14, ", priceDirect=", ", daySelectionTracking=", a11);
                return P.f(a11, map, ")");
            }
        }

        public MonthDTO(@NotNull List<DayDTO> days, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(days, "days");
            Intrinsics.checkNotNullParameter(title, "title");
            this.days = days;
            this.title = title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MonthDTO copy$default(MonthDTO monthDTO, List list, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = monthDTO.days;
            }
            if ((i11 & 2) != 0) {
                textDTO = monthDTO.title;
            }
            return monthDTO.copy(list, textDTO);
        }

        @NotNull
        public final List<DayDTO> component1() {
            return this.days;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final MonthDTO copy(@NotNull List<DayDTO> days, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(days, "days");
            Intrinsics.checkNotNullParameter(title, "title");
            return new MonthDTO(days, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MonthDTO)) {
                return false;
            }
            MonthDTO monthDTO = (MonthDTO) other;
            return Intrinsics.d(this.days, monthDTO.days) && Intrinsics.d(this.title, monthDTO.title);
        }

        @NotNull
        public final List<DayDTO> getDays() {
            return this.days;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.days.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MonthDTO(days=" + this.days + ", title=" + this.title + ")";
        }
    }

    public PricesHistogramV2DTO(@NotNull TextDTO direction, ChipDTO chipDTO, ChipDTO chipDTO2, @NotNull List<MonthDTO> monthsThere, List<MonthDTO> list, @NotNull ButtonV3DTO findTicketsButton, @NotNull AvailableColorsDTO availableColors, ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(monthsThere, "monthsThere");
        Intrinsics.checkNotNullParameter(findTicketsButton, "findTicketsButton");
        Intrinsics.checkNotNullParameter(availableColors, "availableColors");
        this.direction = direction;
        this.tabThere = chipDTO;
        this.tabBack = chipDTO2;
        this.monthsThere = monthsThere;
        this.monthsBack = list;
        this.findTicketsButton = findTicketsButton;
        this.availableColors = availableColors;
        this.toggleCalendarButton = toggleTitleSubtitleCellDTO;
    }

    public static /* synthetic */ PricesHistogramV2DTO copy$default(PricesHistogramV2DTO pricesHistogramV2DTO, TextDTO textDTO, ChipDTO chipDTO, ChipDTO chipDTO2, List list, List list2, ButtonV3DTO buttonV3DTO, AvailableColorsDTO availableColorsDTO, ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = pricesHistogramV2DTO.direction;
        }
        if ((i11 & 2) != 0) {
            chipDTO = pricesHistogramV2DTO.tabThere;
        }
        if ((i11 & 4) != 0) {
            chipDTO2 = pricesHistogramV2DTO.tabBack;
        }
        if ((i11 & 8) != 0) {
            list = pricesHistogramV2DTO.monthsThere;
        }
        if ((i11 & 16) != 0) {
            list2 = pricesHistogramV2DTO.monthsBack;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = pricesHistogramV2DTO.findTicketsButton;
        }
        if ((i11 & 64) != 0) {
            availableColorsDTO = pricesHistogramV2DTO.availableColors;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            toggleTitleSubtitleCellDTO = pricesHistogramV2DTO.toggleCalendarButton;
        }
        AvailableColorsDTO availableColorsDTO2 = availableColorsDTO;
        ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO2 = toggleTitleSubtitleCellDTO;
        List list3 = list2;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return pricesHistogramV2DTO.copy(textDTO, chipDTO, chipDTO2, list, list3, buttonV3DTO2, availableColorsDTO2, toggleTitleSubtitleCellDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final ChipDTO getTabThere() {
        return this.tabThere;
    }

    /* renamed from: component3, reason: from getter */
    public final ChipDTO getTabBack() {
        return this.tabBack;
    }

    @NotNull
    public final List<MonthDTO> component4() {
        return this.monthsThere;
    }

    public final List<MonthDTO> component5() {
        return this.monthsBack;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getFindTicketsButton() {
        return this.findTicketsButton;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AvailableColorsDTO getAvailableColors() {
        return this.availableColors;
    }

    /* renamed from: component8, reason: from getter */
    public final ToggleTitleSubtitleCellDTO getToggleCalendarButton() {
        return this.toggleCalendarButton;
    }

    @NotNull
    public final PricesHistogramV2DTO copy(@NotNull TextDTO direction, ChipDTO tabThere, ChipDTO tabBack, @NotNull List<MonthDTO> monthsThere, List<MonthDTO> monthsBack, @NotNull ButtonV3DTO findTicketsButton, @NotNull AvailableColorsDTO availableColors, ToggleTitleSubtitleCellDTO toggleCalendarButton) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(monthsThere, "monthsThere");
        Intrinsics.checkNotNullParameter(findTicketsButton, "findTicketsButton");
        Intrinsics.checkNotNullParameter(availableColors, "availableColors");
        return new PricesHistogramV2DTO(direction, tabThere, tabBack, monthsThere, monthsBack, findTicketsButton, availableColors, toggleCalendarButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricesHistogramV2DTO)) {
            return false;
        }
        PricesHistogramV2DTO pricesHistogramV2DTO = (PricesHistogramV2DTO) other;
        return Intrinsics.d(this.direction, pricesHistogramV2DTO.direction) && Intrinsics.d(this.tabThere, pricesHistogramV2DTO.tabThere) && Intrinsics.d(this.tabBack, pricesHistogramV2DTO.tabBack) && Intrinsics.d(this.monthsThere, pricesHistogramV2DTO.monthsThere) && Intrinsics.d(this.monthsBack, pricesHistogramV2DTO.monthsBack) && Intrinsics.d(this.findTicketsButton, pricesHistogramV2DTO.findTicketsButton) && Intrinsics.d(this.availableColors, pricesHistogramV2DTO.availableColors) && Intrinsics.d(this.toggleCalendarButton, pricesHistogramV2DTO.toggleCalendarButton);
    }

    @NotNull
    public final AvailableColorsDTO getAvailableColors() {
        return this.availableColors;
    }

    @NotNull
    public final TextDTO getDirection() {
        return this.direction;
    }

    @NotNull
    public final ButtonV3DTO getFindTicketsButton() {
        return this.findTicketsButton;
    }

    public final List<MonthDTO> getMonthsBack() {
        return this.monthsBack;
    }

    @NotNull
    public final List<MonthDTO> getMonthsThere() {
        return this.monthsThere;
    }

    public final ChipDTO getTabBack() {
        return this.tabBack;
    }

    public final ChipDTO getTabThere() {
        return this.tabThere;
    }

    public final ToggleTitleSubtitleCellDTO getToggleCalendarButton() {
        return this.toggleCalendarButton;
    }

    public int hashCode() {
        int hashCode = this.direction.hashCode() * 31;
        ChipDTO chipDTO = this.tabThere;
        int hashCode2 = (hashCode + (chipDTO == null ? 0 : chipDTO.hashCode())) * 31;
        ChipDTO chipDTO2 = this.tabBack;
        int b11 = g.b((hashCode2 + (chipDTO2 == null ? 0 : chipDTO2.hashCode())) * 31, 31, this.monthsThere);
        List<MonthDTO> list = this.monthsBack;
        int hashCode3 = (this.availableColors.hashCode() + C2859b.c(this.findTicketsButton, (b11 + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31;
        ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO = this.toggleCalendarButton;
        return hashCode3 + (toggleTitleSubtitleCellDTO != null ? toggleTitleSubtitleCellDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PricesHistogramV2DTO(direction=" + this.direction + ", tabThere=" + this.tabThere + ", tabBack=" + this.tabBack + ", monthsThere=" + this.monthsThere + ", monthsBack=" + this.monthsBack + ", findTicketsButton=" + this.findTicketsButton + ", availableColors=" + this.availableColors + ", toggleCalendarButton=" + this.toggleCalendarButton + ")";
    }
}
