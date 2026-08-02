package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Am.C2438a;
import B0.C2454a;
import Cm.e;
import D40.d;
import De.C2859b;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Ns.b;
import TY.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b0\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003]^_Bù\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\u000e\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%\u0012\u000e\u0010'\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%¢\u0006\u0004\b(\u0010)J®\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u00132\u0010\b\u0002\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%2\u0010\b\u0002\u0010'\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b:\u00109R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b>\u0010=R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\b\u0014\u0010JR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\bO\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\bP\u0010-R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\bQ\u0010AR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010?\u001a\u0004\bR\u0010AR\u0017\u0010\u001d\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010N\u001a\u0004\bS\u0010-R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\bT\u0010-R\u0017\u0010\u001f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u00107\u001a\u0004\bU\u00109R\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u00107\u001a\u0004\bV\u00109R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010W\u001a\u0004\bX\u0010/R\u0017\u0010#\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b#\u0010I\u001a\u0004\b#\u0010JR\u001f\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%8\u0006¢\u0006\f\n\u0004\b&\u0010Y\u001a\u0004\bZ\u0010[R\u001f\u0010'\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%8\u0006¢\u0006\f\n\u0004\b'\u0010Y\u001a\u0004\b\\\u0010[¨\u0006`"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "direction", "datesInfo", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "tabThere", "tabBack", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$MonthVO;", "monthsThere", "monthsBack", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "findTicketsButton", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "toggleCalendarButton", "", "isToggleVisible", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "availableColors", "", "dateThere", "dateBack", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "listDaysThere", "listDaysBack", "selectedDateThere", "selectedDateBack", "selectedDates", "selectedPrice", "", "countOfEmptyDays", "isDirect", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEventThere", "tokenizedEventBack", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;ZLru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IZLWZ/t;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;ZLru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IZLWZ/t;LWZ/t;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDirection", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDatesInfo", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "getTabThere", "()Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "getTabBack", "Ljava/util/List;", "getMonthsThere", "()Ljava/util/List;", "getMonthsBack", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getFindTicketsButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "getToggleCalendarButton", "()Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "getAvailableColors", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "Ljava/lang/String;", "getDateThere", "getDateBack", "getListDaysThere", "getListDaysBack", "getSelectedDateThere", "getSelectedDateBack", "getSelectedDates", "getSelectedPrice", "I", "getCountOfEmptyDays", "LWZ/t;", "getTokenizedEventThere", "()LWZ/t;", "getTokenizedEventBack", "MonthVO", "DayVO", "AvailableColorsVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PricesHistogramV2VO implements c {

    @NotNull
    private final AvailableColorsVO availableColors;
    private final int countOfEmptyDays;
    private final String dateBack;

    @NotNull
    private final String dateThere;

    @NotNull
    private final TextDTO datesInfo;

    @NotNull
    private final TextDTO direction;

    @NotNull
    private final ButtonV3DTO findTicketsButton;
    private final long id;
    private final boolean isDirect;
    private final boolean isToggleVisible;
    private final List<DayVO> listDaysBack;

    @NotNull
    private final List<DayVO> listDaysThere;
    private final List<MonthVO> monthsBack;

    @NotNull
    private final List<MonthVO> monthsThere;
    private final String selectedDateBack;

    @NotNull
    private final String selectedDateThere;

    @NotNull
    private final TextDTO selectedDates;
    private final TextDTO selectedPrice;
    private final ChipDTO tabBack;
    private final ChipDTO tabThere;
    private final ToggleTitleSubtitleCellDTO toggleCalendarButton;
    private final t tokenizedEventBack;
    private final t tokenizedEventThere;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "", "", "selectedColumnColor", "defaultColumnColor", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSelectedColumnColor", "getDefaultColumnColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvailableColorsVO {
        private final int defaultColumnColor;
        private final int selectedColumnColor;

        public AvailableColorsVO(int i11, int i12) {
            this.selectedColumnColor = i11;
            this.defaultColumnColor = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvailableColorsVO)) {
                return false;
            }
            AvailableColorsVO availableColorsVO = (AvailableColorsVO) other;
            return this.selectedColumnColor == availableColorsVO.selectedColumnColor && this.defaultColumnColor == availableColorsVO.defaultColumnColor;
        }

        public final int getDefaultColumnColor() {
            return this.defaultColumnColor;
        }

        public final int getSelectedColumnColor() {
            return this.selectedColumnColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.defaultColumnColor) + (Integer.hashCode(this.selectedColumnColor) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("AvailableColorsVO(selectedColumnColor=", this.selectedColumnColor, ", defaultColumnColor=", ")", this.defaultColumnColor);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\n\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$MonthVO;", "", "", "id", "", "countOfDays", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "countOfEmptyDays", "", "isCornerItem", "<init>", "(JILru/ozon/uni/atoms/data/text/TextDTO;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getCountOfDays", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCountOfEmptyDays", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MonthVO {
        private final int countOfDays;
        private final int countOfEmptyDays;
        private final long id;
        private final boolean isCornerItem;

        @NotNull
        private final TextDTO title;

        public MonthVO(long j11, int i11, @NotNull TextDTO title, int i12, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.countOfDays = i11;
            this.title = title;
            this.countOfEmptyDays = i12;
            this.isCornerItem = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MonthVO)) {
                return false;
            }
            MonthVO monthVO = (MonthVO) other;
            return this.id == monthVO.id && this.countOfDays == monthVO.countOfDays && Intrinsics.d(this.title, monthVO.title) && this.countOfEmptyDays == monthVO.countOfEmptyDays && this.isCornerItem == monthVO.isCornerItem;
        }

        public final int getCountOfDays() {
            return this.countOfDays;
        }

        public final int getCountOfEmptyDays() {
            return this.countOfEmptyDays;
        }

        public final long getId() {
            return this.id;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCornerItem) + C2454a.a(this.countOfEmptyDays, b.a(this.title, C2454a.a(this.countOfDays, Long.hashCode(this.id) * 31, 31), 31), 31);
        }

        /* renamed from: isCornerItem, reason: from getter */
        public final boolean getIsCornerItem() {
            return this.isCornerItem;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            int i11 = this.countOfDays;
            TextDTO textDTO = this.title;
            int i12 = this.countOfEmptyDays;
            boolean z11 = this.isCornerItem;
            StringBuilder b11 = Ql.c.b(j11, "MonthVO(id=", i11, ", countOfDays=");
            b11.append(", title=");
            b11.append(textDTO);
            b11.append(", countOfEmptyDays=");
            b11.append(i12);
            return Bi.b.f(b11, ", isCornerItem=", z11, ")");
        }
    }

    public PricesHistogramV2VO(long j11, @NotNull TextDTO direction, @NotNull TextDTO datesInfo, ChipDTO chipDTO, ChipDTO chipDTO2, @NotNull List<MonthVO> monthsThere, List<MonthVO> list, @NotNull ButtonV3DTO findTicketsButton, ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO, boolean z11, @NotNull AvailableColorsVO availableColors, @NotNull String dateThere, String str, @NotNull List<DayVO> listDaysThere, List<DayVO> list2, @NotNull String selectedDateThere, String str2, @NotNull TextDTO selectedDates, TextDTO textDTO, int i11, boolean z12, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(datesInfo, "datesInfo");
        Intrinsics.checkNotNullParameter(monthsThere, "monthsThere");
        Intrinsics.checkNotNullParameter(findTicketsButton, "findTicketsButton");
        Intrinsics.checkNotNullParameter(availableColors, "availableColors");
        Intrinsics.checkNotNullParameter(dateThere, "dateThere");
        Intrinsics.checkNotNullParameter(listDaysThere, "listDaysThere");
        Intrinsics.checkNotNullParameter(selectedDateThere, "selectedDateThere");
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        this.id = j11;
        this.direction = direction;
        this.datesInfo = datesInfo;
        this.tabThere = chipDTO;
        this.tabBack = chipDTO2;
        this.monthsThere = monthsThere;
        this.monthsBack = list;
        this.findTicketsButton = findTicketsButton;
        this.toggleCalendarButton = toggleTitleSubtitleCellDTO;
        this.isToggleVisible = z11;
        this.availableColors = availableColors;
        this.dateThere = dateThere;
        this.dateBack = str;
        this.listDaysThere = listDaysThere;
        this.listDaysBack = list2;
        this.selectedDateThere = selectedDateThere;
        this.selectedDateBack = str2;
        this.selectedDates = selectedDates;
        this.selectedPrice = textDTO;
        this.countOfEmptyDays = i11;
        this.isDirect = z12;
        this.tokenizedEventThere = tVar;
        this.tokenizedEventBack = tVar2;
    }

    public static /* synthetic */ PricesHistogramV2VO copy$default(PricesHistogramV2VO pricesHistogramV2VO, long j11, TextDTO textDTO, TextDTO textDTO2, ChipDTO chipDTO, ChipDTO chipDTO2, List list, List list2, ButtonV3DTO buttonV3DTO, ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO, boolean z11, AvailableColorsVO availableColorsVO, String str, String str2, List list3, List list4, String str3, String str4, TextDTO textDTO3, TextDTO textDTO4, int i11, boolean z12, t tVar, t tVar2, int i12, Object obj) {
        t tVar3;
        t tVar4;
        long j12 = (i12 & 1) != 0 ? pricesHistogramV2VO.id : j11;
        TextDTO textDTO5 = (i12 & 2) != 0 ? pricesHistogramV2VO.direction : textDTO;
        TextDTO textDTO6 = (i12 & 4) != 0 ? pricesHistogramV2VO.datesInfo : textDTO2;
        ChipDTO chipDTO3 = (i12 & 8) != 0 ? pricesHistogramV2VO.tabThere : chipDTO;
        ChipDTO chipDTO4 = (i12 & 16) != 0 ? pricesHistogramV2VO.tabBack : chipDTO2;
        List list5 = (i12 & 32) != 0 ? pricesHistogramV2VO.monthsThere : list;
        List list6 = (i12 & 64) != 0 ? pricesHistogramV2VO.monthsBack : list2;
        ButtonV3DTO buttonV3DTO2 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pricesHistogramV2VO.findTicketsButton : buttonV3DTO;
        ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO2 = (i12 & 256) != 0 ? pricesHistogramV2VO.toggleCalendarButton : toggleTitleSubtitleCellDTO;
        boolean z13 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? pricesHistogramV2VO.isToggleVisible : z11;
        AvailableColorsVO availableColorsVO2 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? pricesHistogramV2VO.availableColors : availableColorsVO;
        String str5 = (i12 & 2048) != 0 ? pricesHistogramV2VO.dateThere : str;
        String str6 = (i12 & 4096) != 0 ? pricesHistogramV2VO.dateBack : str2;
        long j13 = j12;
        List list7 = (i12 & 8192) != 0 ? pricesHistogramV2VO.listDaysThere : list3;
        List list8 = (i12 & 16384) != 0 ? pricesHistogramV2VO.listDaysBack : list4;
        String str7 = (i12 & 32768) != 0 ? pricesHistogramV2VO.selectedDateThere : str3;
        String str8 = (i12 & 65536) != 0 ? pricesHistogramV2VO.selectedDateBack : str4;
        TextDTO textDTO7 = (i12 & 131072) != 0 ? pricesHistogramV2VO.selectedDates : textDTO3;
        TextDTO textDTO8 = (i12 & 262144) != 0 ? pricesHistogramV2VO.selectedPrice : textDTO4;
        int i13 = (i12 & 524288) != 0 ? pricesHistogramV2VO.countOfEmptyDays : i11;
        boolean z14 = (i12 & 1048576) != 0 ? pricesHistogramV2VO.isDirect : z12;
        t tVar5 = (i12 & 2097152) != 0 ? pricesHistogramV2VO.tokenizedEventThere : tVar;
        if ((i12 & 4194304) != 0) {
            tVar4 = tVar5;
            tVar3 = pricesHistogramV2VO.tokenizedEventBack;
        } else {
            tVar3 = tVar2;
            tVar4 = tVar5;
        }
        return pricesHistogramV2VO.copy(j13, textDTO5, textDTO6, chipDTO3, chipDTO4, list5, list6, buttonV3DTO2, toggleTitleSubtitleCellDTO2, z13, availableColorsVO2, str5, str6, list7, list8, str7, str8, textDTO7, textDTO8, i13, z14, tVar4, tVar3);
    }

    @NotNull
    public final PricesHistogramV2VO copy(long id2, @NotNull TextDTO direction, @NotNull TextDTO datesInfo, ChipDTO tabThere, ChipDTO tabBack, @NotNull List<MonthVO> monthsThere, List<MonthVO> monthsBack, @NotNull ButtonV3DTO findTicketsButton, ToggleTitleSubtitleCellDTO toggleCalendarButton, boolean isToggleVisible, @NotNull AvailableColorsVO availableColors, @NotNull String dateThere, String dateBack, @NotNull List<DayVO> listDaysThere, List<DayVO> listDaysBack, @NotNull String selectedDateThere, String selectedDateBack, @NotNull TextDTO selectedDates, TextDTO selectedPrice, int countOfEmptyDays, boolean isDirect, t tokenizedEventThere, t tokenizedEventBack) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(datesInfo, "datesInfo");
        Intrinsics.checkNotNullParameter(monthsThere, "monthsThere");
        Intrinsics.checkNotNullParameter(findTicketsButton, "findTicketsButton");
        Intrinsics.checkNotNullParameter(availableColors, "availableColors");
        Intrinsics.checkNotNullParameter(dateThere, "dateThere");
        Intrinsics.checkNotNullParameter(listDaysThere, "listDaysThere");
        Intrinsics.checkNotNullParameter(selectedDateThere, "selectedDateThere");
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        return new PricesHistogramV2VO(id2, direction, datesInfo, tabThere, tabBack, monthsThere, monthsBack, findTicketsButton, toggleCalendarButton, isToggleVisible, availableColors, dateThere, dateBack, listDaysThere, listDaysBack, selectedDateThere, selectedDateBack, selectedDates, selectedPrice, countOfEmptyDays, isDirect, tokenizedEventThere, tokenizedEventBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricesHistogramV2VO)) {
            return false;
        }
        PricesHistogramV2VO pricesHistogramV2VO = (PricesHistogramV2VO) other;
        return this.id == pricesHistogramV2VO.id && Intrinsics.d(this.direction, pricesHistogramV2VO.direction) && Intrinsics.d(this.datesInfo, pricesHistogramV2VO.datesInfo) && Intrinsics.d(this.tabThere, pricesHistogramV2VO.tabThere) && Intrinsics.d(this.tabBack, pricesHistogramV2VO.tabBack) && Intrinsics.d(this.monthsThere, pricesHistogramV2VO.monthsThere) && Intrinsics.d(this.monthsBack, pricesHistogramV2VO.monthsBack) && Intrinsics.d(this.findTicketsButton, pricesHistogramV2VO.findTicketsButton) && Intrinsics.d(this.toggleCalendarButton, pricesHistogramV2VO.toggleCalendarButton) && this.isToggleVisible == pricesHistogramV2VO.isToggleVisible && Intrinsics.d(this.availableColors, pricesHistogramV2VO.availableColors) && Intrinsics.d(this.dateThere, pricesHistogramV2VO.dateThere) && Intrinsics.d(this.dateBack, pricesHistogramV2VO.dateBack) && Intrinsics.d(this.listDaysThere, pricesHistogramV2VO.listDaysThere) && Intrinsics.d(this.listDaysBack, pricesHistogramV2VO.listDaysBack) && Intrinsics.d(this.selectedDateThere, pricesHistogramV2VO.selectedDateThere) && Intrinsics.d(this.selectedDateBack, pricesHistogramV2VO.selectedDateBack) && Intrinsics.d(this.selectedDates, pricesHistogramV2VO.selectedDates) && Intrinsics.d(this.selectedPrice, pricesHistogramV2VO.selectedPrice) && this.countOfEmptyDays == pricesHistogramV2VO.countOfEmptyDays && this.isDirect == pricesHistogramV2VO.isDirect && Intrinsics.d(this.tokenizedEventThere, pricesHistogramV2VO.tokenizedEventThere) && Intrinsics.d(this.tokenizedEventBack, pricesHistogramV2VO.tokenizedEventBack);
    }

    @NotNull
    public final AvailableColorsVO getAvailableColors() {
        return this.availableColors;
    }

    public final int getCountOfEmptyDays() {
        return this.countOfEmptyDays;
    }

    @NotNull
    public final TextDTO getDatesInfo() {
        return this.datesInfo;
    }

    @NotNull
    public final TextDTO getDirection() {
        return this.direction;
    }

    @NotNull
    public final ButtonV3DTO getFindTicketsButton() {
        return this.findTicketsButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<DayVO> getListDaysBack() {
        return this.listDaysBack;
    }

    @NotNull
    public final List<DayVO> getListDaysThere() {
        return this.listDaysThere;
    }

    public final List<MonthVO> getMonthsBack() {
        return this.monthsBack;
    }

    @NotNull
    public final List<MonthVO> getMonthsThere() {
        return this.monthsThere;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSelectedDateBack() {
        return this.selectedDateBack;
    }

    @NotNull
    public final String getSelectedDateThere() {
        return this.selectedDateThere;
    }

    @NotNull
    public final TextDTO getSelectedDates() {
        return this.selectedDates;
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

    public final t getTokenizedEventBack() {
        return this.tokenizedEventBack;
    }

    public final t getTokenizedEventThere() {
        return this.tokenizedEventThere;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.datesInfo, b.a(this.direction, Long.hashCode(this.id) * 31, 31), 31);
        ChipDTO chipDTO = this.tabThere;
        int hashCode = (a11 + (chipDTO == null ? 0 : chipDTO.hashCode())) * 31;
        ChipDTO chipDTO2 = this.tabBack;
        int b11 = g.b((hashCode + (chipDTO2 == null ? 0 : chipDTO2.hashCode())) * 31, 31, this.monthsThere);
        List<MonthVO> list = this.monthsBack;
        int c11 = C2859b.c(this.findTicketsButton, (b11 + (list == null ? 0 : list.hashCode())) * 31, 31);
        ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO = this.toggleCalendarButton;
        int a12 = g.a((this.availableColors.hashCode() + C3532b.a((c11 + (toggleTitleSubtitleCellDTO == null ? 0 : toggleTitleSubtitleCellDTO.hashCode())) * 31, 31, this.isToggleVisible)) * 31, 31, this.dateThere);
        String str = this.dateBack;
        int b12 = g.b((a12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.listDaysThere);
        List<DayVO> list2 = this.listDaysBack;
        int a13 = g.a((b12 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.selectedDateThere);
        String str2 = this.selectedDateBack;
        int a14 = b.a(this.selectedDates, (a13 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        TextDTO textDTO = this.selectedPrice;
        int a15 = C3532b.a(C2454a.a(this.countOfEmptyDays, (a14 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31, this.isDirect);
        t tVar = this.tokenizedEventThere;
        int hashCode2 = (a15 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.tokenizedEventBack;
        return hashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    /* renamed from: isDirect, reason: from getter */
    public final boolean getIsDirect() {
        return this.isDirect;
    }

    /* renamed from: isToggleVisible, reason: from getter */
    public final boolean getIsToggleVisible() {
        return this.isToggleVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.direction;
        TextDTO textDTO2 = this.datesInfo;
        ChipDTO chipDTO = this.tabThere;
        ChipDTO chipDTO2 = this.tabBack;
        List<MonthVO> list = this.monthsThere;
        List<MonthVO> list2 = this.monthsBack;
        ButtonV3DTO buttonV3DTO = this.findTicketsButton;
        ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO = this.toggleCalendarButton;
        boolean z11 = this.isToggleVisible;
        AvailableColorsVO availableColorsVO = this.availableColors;
        String str = this.dateThere;
        String str2 = this.dateBack;
        List<DayVO> list3 = this.listDaysThere;
        List<DayVO> list4 = this.listDaysBack;
        String str3 = this.selectedDateThere;
        String str4 = this.selectedDateBack;
        TextDTO textDTO3 = this.selectedDates;
        TextDTO textDTO4 = this.selectedPrice;
        int i11 = this.countOfEmptyDays;
        boolean z12 = this.isDirect;
        t tVar = this.tokenizedEventThere;
        t tVar2 = this.tokenizedEventBack;
        StringBuilder b11 = a.b("PricesHistogramV2VO(id=", j11, ", direction=", textDTO);
        b11.append(", datesInfo=");
        b11.append(textDTO2);
        b11.append(", tabThere=");
        b11.append(chipDTO);
        b11.append(", tabBack=");
        b11.append(chipDTO2);
        b11.append(", monthsThere=");
        b11.append(list);
        b11.append(", monthsBack=");
        b11.append(list2);
        b11.append(", findTicketsButton=");
        b11.append(buttonV3DTO);
        b11.append(", toggleCalendarButton=");
        b11.append(toggleTitleSubtitleCellDTO);
        b11.append(", isToggleVisible=");
        b11.append(z11);
        b11.append(", availableColors=");
        b11.append(availableColorsVO);
        b11.append(", dateThere=");
        b11.append(str);
        Nh.a.g(", dateBack=", str2, ", listDaysThere=", b11, list3);
        b11.append(", listDaysBack=");
        b11.append(list4);
        b11.append(", selectedDateThere=");
        b11.append(str3);
        b11.append(", selectedDateBack=");
        b11.append(str4);
        b11.append(", selectedDates=");
        b11.append(textDTO3);
        b11.append(", selectedPrice=");
        b11.append(textDTO4);
        b11.append(", countOfEmptyDays=");
        b11.append(i11);
        C2971a.d(b11, ", isDirect=", z12, ", tokenizedEventThere=", tVar);
        return Lh.a.b(b11, ", tokenizedEventBack=", tVar2, ")");
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J¨\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b&\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b\u000b\u0010+R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b\u0010\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b0\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b1\u0010)R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "", "", "dayHeight", "dayHeightDirect", "", "number", "date", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSelected", "priceOrMessage", "priceOrMessageDirect", "price", "priceDirect", "isLowest", "monthLeft", "monthRight", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "daySelectionTracking", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IIZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "copy", "(IILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IIZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getDayHeight", "getDayHeightDirect", "Ljava/lang/String;", "getNumber", "getDate", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "getPriceOrMessage", "getPriceOrMessageDirect", "getPrice", "getPriceDirect", "getMonthLeft", "getMonthRight", "LWZ/t;", "getDaySelectionTracking", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DayVO {

        @NotNull
        private final String date;
        private final int dayHeight;
        private final int dayHeightDirect;
        private final t daySelectionTracking;
        private final boolean isLowest;
        private final boolean isSelected;
        private final TextDTO monthLeft;
        private final TextDTO monthRight;

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

        public DayVO(int i11, int i12, @NotNull String number, @NotNull String date, @NotNull TextDTO title, boolean z11, @NotNull TextDTO priceOrMessage, @NotNull TextDTO priceOrMessageDirect, int i13, int i14, boolean z12, TextDTO textDTO, TextDTO textDTO2, t tVar) {
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
            this.isLowest = z12;
            this.monthLeft = textDTO;
            this.monthRight = textDTO2;
            this.daySelectionTracking = tVar;
        }

        @NotNull
        public final DayVO copy(int dayHeight, int dayHeightDirect, @NotNull String number, @NotNull String date, @NotNull TextDTO title, boolean isSelected, @NotNull TextDTO priceOrMessage, @NotNull TextDTO priceOrMessageDirect, int price, int priceDirect, boolean isLowest, TextDTO monthLeft, TextDTO monthRight, t daySelectionTracking) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(priceOrMessage, "priceOrMessage");
            Intrinsics.checkNotNullParameter(priceOrMessageDirect, "priceOrMessageDirect");
            return new DayVO(dayHeight, dayHeightDirect, number, date, title, isSelected, priceOrMessage, priceOrMessageDirect, price, priceDirect, isLowest, monthLeft, monthRight, daySelectionTracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DayVO)) {
                return false;
            }
            DayVO dayVO = (DayVO) other;
            return this.dayHeight == dayVO.dayHeight && this.dayHeightDirect == dayVO.dayHeightDirect && Intrinsics.d(this.number, dayVO.number) && Intrinsics.d(this.date, dayVO.date) && Intrinsics.d(this.title, dayVO.title) && this.isSelected == dayVO.isSelected && Intrinsics.d(this.priceOrMessage, dayVO.priceOrMessage) && Intrinsics.d(this.priceOrMessageDirect, dayVO.priceOrMessageDirect) && this.price == dayVO.price && this.priceDirect == dayVO.priceDirect && this.isLowest == dayVO.isLowest && Intrinsics.d(this.monthLeft, dayVO.monthLeft) && Intrinsics.d(this.monthRight, dayVO.monthRight) && Intrinsics.d(this.daySelectionTracking, dayVO.daySelectionTracking);
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

        public final t getDaySelectionTracking() {
            return this.daySelectionTracking;
        }

        public final TextDTO getMonthLeft() {
            return this.monthLeft;
        }

        public final TextDTO getMonthRight() {
            return this.monthRight;
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
            int a11 = C3532b.a(C2454a.a(this.priceDirect, C2454a.a(this.price, b.a(this.priceOrMessageDirect, b.a(this.priceOrMessage, C3532b.a(b.a(this.title, g.a(g.a(C2454a.a(this.dayHeightDirect, Integer.hashCode(this.dayHeight) * 31, 31), 31, this.number), 31, this.date), 31), 31, this.isSelected), 31), 31), 31), 31), 31, this.isLowest);
            TextDTO textDTO = this.monthLeft;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.monthRight;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            t tVar = this.daySelectionTracking;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
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
            boolean z12 = this.isLowest;
            TextDTO textDTO4 = this.monthLeft;
            TextDTO textDTO5 = this.monthRight;
            t tVar = this.daySelectionTracking;
            StringBuilder a11 = C2438a.a("DayVO(dayHeight=", i11, ", dayHeightDirect=", ", number=", i12);
            Nh.a.h(a11, str, ", date=", str2, ", title=");
            a11.append(textDTO);
            a11.append(", isSelected=");
            a11.append(z11);
            a11.append(", priceOrMessage=");
            d.e(", priceOrMessageDirect=", ", price=", a11, textDTO2, textDTO3);
            Ek.a.f(i13, i14, ", priceDirect=", ", isLowest=", a11);
            a11.append(z12);
            a11.append(", monthLeft=");
            a11.append(textDTO4);
            a11.append(", monthRight=");
            a11.append(textDTO5);
            a11.append(", daySelectionTracking=");
            a11.append(tVar);
            a11.append(")");
            return a11.toString();
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ DayVO(int r18, int r19, java.lang.String r20, java.lang.String r21, ru.ozon.uni.atoms.data.text.TextDTO r22, boolean r23, ru.ozon.uni.atoms.data.text.TextDTO r24, ru.ozon.uni.atoms.data.text.TextDTO r25, int r26, int r27, boolean r28, ru.ozon.uni.atoms.data.text.TextDTO r29, ru.ozon.uni.atoms.data.text.TextDTO r30, WZ.t r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
            /*
                r17 = this;
                r0 = r32
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L9
                r1 = 0
                r13 = r1
                goto Lb
            L9:
                r13 = r28
            Lb:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                r2 = 0
                if (r1 == 0) goto L12
                r14 = r2
                goto L14
            L12:
                r14 = r29
            L14:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L1a
                r15 = r2
                goto L1c
            L1a:
                r15 = r30
            L1c:
                r0 = r0 & 8192(0x2000, float:1.148E-41)
                if (r0 == 0) goto L39
                r16 = r2
                r3 = r18
                r4 = r19
                r5 = r20
                r6 = r21
                r7 = r22
                r8 = r23
                r9 = r24
                r10 = r25
                r11 = r26
                r12 = r27
                r2 = r17
                goto L51
            L39:
                r16 = r31
                r2 = r17
                r3 = r18
                r4 = r19
                r5 = r20
                r6 = r21
                r7 = r22
                r8 = r23
                r9 = r24
                r10 = r25
                r11 = r26
                r12 = r27
            L51:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO.DayVO.<init>(int, int, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.text.TextDTO, boolean, ru.ozon.uni.atoms.data.text.TextDTO, ru.ozon.uni.atoms.data.text.TextDTO, int, int, boolean, ru.ozon.uni.atoms.data.text.TextDTO, ru.ozon.uni.atoms.data.text.TextDTO, WZ.t, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
