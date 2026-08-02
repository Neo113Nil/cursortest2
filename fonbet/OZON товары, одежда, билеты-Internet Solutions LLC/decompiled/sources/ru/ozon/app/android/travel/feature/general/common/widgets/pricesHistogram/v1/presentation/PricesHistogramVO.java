package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation;

import Am.C2438a;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import Cm.e;
import D3.h;
import De.C2860c;
import Ek.a;
import G.g;
import K00.b;
import Kk.C3532b;
import Ve.C4636t5;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002RSBß\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u00102R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b4\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bC\u0010%R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bD\u0010%R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\bE\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\bF\u00102R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010G\u001a\u0004\bH\u0010IR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\bJ\u0010:R\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\bK\u0010:R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\bL\u00102R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\bM\u00102R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\bN\u00102R\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u00100\u001a\u0004\bO\u00102R\u0017\u0010!\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010P\u001a\u0004\bQ\u0010'¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleFrom", "titleTo", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "cancelButton", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO;", "monthsFrom", "monthsTo", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "findTicketsButton", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "availableColors", "", "dateFrom", "dateTo", "emptyHistogramMessage", "mediumPrice", "", "medianHeight", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "listDaysFrom", "listDaysTo", "selectedDateFrom", "selectedDateTo", "selectedPriceFrom", "selectedPriceTo", "countOfEmptyDays", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleFrom", "getTitleTo", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getCancelButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Ljava/util/List;", "getMonthsFrom", "()Ljava/util/List;", "getMonthsTo", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getFindTicketsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "getAvailableColors", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "Ljava/lang/String;", "getDateFrom", "getDateTo", "getEmptyHistogramMessage", "getMediumPrice", "Ljava/lang/Integer;", "getMedianHeight", "()Ljava/lang/Integer;", "getListDaysFrom", "getListDaysTo", "getSelectedDateFrom", "getSelectedDateTo", "getSelectedPriceFrom", "getSelectedPriceTo", "I", "getCountOfEmptyDays", "MonthVO", "AvailableColorsVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PricesHistogramVO implements c {

    @NotNull
    private final AvailableColorsVO availableColors;

    @NotNull
    private final ButtonV3Atom.SmallBorderlessButton cancelButton;
    private final int countOfEmptyDays;

    @NotNull
    private final String dateFrom;
    private final String dateTo;
    private final TextAtom emptyHistogramMessage;

    @NotNull
    private final ButtonV3Atom.LargeButton findTicketsButton;
    private final long id;

    @NotNull
    private final List<MonthVO.DayVO> listDaysFrom;
    private final List<MonthVO.DayVO> listDaysTo;
    private final Integer medianHeight;
    private final TextAtom mediumPrice;

    @NotNull
    private final List<MonthVO> monthsFrom;
    private final List<MonthVO> monthsTo;
    private final TextAtom selectedDateFrom;
    private final TextAtom selectedDateTo;
    private final TextAtom selectedPriceFrom;
    private final TextAtom selectedPriceTo;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final TextAtom titleFrom;
    private final TextAtom titleTo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "", "", "selected", "default", "textSelected", "textDefault", "lowestPrice", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSelected", "getDefault", "getTextSelected", "getTextDefault", "getLowestPrice", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvailableColorsVO {
        private final int default;
        private final int lowestPrice;
        private final int selected;
        private final int textDefault;
        private final int textSelected;

        public AvailableColorsVO(int i11, int i12, int i13, int i14, int i15) {
            this.selected = i11;
            this.default = i12;
            this.textSelected = i13;
            this.textDefault = i14;
            this.lowestPrice = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvailableColorsVO)) {
                return false;
            }
            AvailableColorsVO availableColorsVO = (AvailableColorsVO) other;
            return this.selected == availableColorsVO.selected && this.default == availableColorsVO.default && this.textSelected == availableColorsVO.textSelected && this.textDefault == availableColorsVO.textDefault && this.lowestPrice == availableColorsVO.lowestPrice;
        }

        public final int getDefault() {
            return this.default;
        }

        public final int getLowestPrice() {
            return this.lowestPrice;
        }

        public final int getSelected() {
            return this.selected;
        }

        public final int getTextDefault() {
            return this.textDefault;
        }

        public final int getTextSelected() {
            return this.textSelected;
        }

        public int hashCode() {
            return Integer.hashCode(this.lowestPrice) + C2454a.a(this.textDefault, C2454a.a(this.textSelected, C2454a.a(this.default, Integer.hashCode(this.selected) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.selected;
            int i12 = this.default;
            int i13 = this.textSelected;
            int i14 = this.textDefault;
            int i15 = this.lowestPrice;
            StringBuilder a11 = C2438a.a("AvailableColorsVO(selected=", i11, ", default=", ", textSelected=", i12);
            a.f(i13, i14, ", textDefault=", ", lowestPrice=", a11);
            return b.e(i15, ")", a11);
        }
    }

    public PricesHistogramVO(long j11, @NotNull TextAtom title, @NotNull TextAtom titleFrom, TextAtom textAtom, @NotNull ButtonV3Atom.SmallBorderlessButton cancelButton, @NotNull List<MonthVO> monthsFrom, List<MonthVO> list, @NotNull ButtonV3Atom.LargeButton findTicketsButton, @NotNull AvailableColorsVO availableColors, @NotNull String dateFrom, String str, TextAtom textAtom2, TextAtom textAtom3, Integer num, @NotNull List<MonthVO.DayVO> listDaysFrom, List<MonthVO.DayVO> list2, TextAtom textAtom4, TextAtom textAtom5, TextAtom textAtom6, TextAtom textAtom7, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleFrom, "titleFrom");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        Intrinsics.checkNotNullParameter(monthsFrom, "monthsFrom");
        Intrinsics.checkNotNullParameter(findTicketsButton, "findTicketsButton");
        Intrinsics.checkNotNullParameter(availableColors, "availableColors");
        Intrinsics.checkNotNullParameter(dateFrom, "dateFrom");
        Intrinsics.checkNotNullParameter(listDaysFrom, "listDaysFrom");
        this.id = j11;
        this.title = title;
        this.titleFrom = titleFrom;
        this.titleTo = textAtom;
        this.cancelButton = cancelButton;
        this.monthsFrom = monthsFrom;
        this.monthsTo = list;
        this.findTicketsButton = findTicketsButton;
        this.availableColors = availableColors;
        this.dateFrom = dateFrom;
        this.dateTo = str;
        this.emptyHistogramMessage = textAtom2;
        this.mediumPrice = textAtom3;
        this.medianHeight = num;
        this.listDaysFrom = listDaysFrom;
        this.listDaysTo = list2;
        this.selectedDateFrom = textAtom4;
        this.selectedDateTo = textAtom5;
        this.selectedPriceFrom = textAtom6;
        this.selectedPriceTo = textAtom7;
        this.countOfEmptyDays = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricesHistogramVO)) {
            return false;
        }
        PricesHistogramVO pricesHistogramVO = (PricesHistogramVO) other;
        return this.id == pricesHistogramVO.id && Intrinsics.d(this.title, pricesHistogramVO.title) && Intrinsics.d(this.titleFrom, pricesHistogramVO.titleFrom) && Intrinsics.d(this.titleTo, pricesHistogramVO.titleTo) && Intrinsics.d(this.cancelButton, pricesHistogramVO.cancelButton) && Intrinsics.d(this.monthsFrom, pricesHistogramVO.monthsFrom) && Intrinsics.d(this.monthsTo, pricesHistogramVO.monthsTo) && Intrinsics.d(this.findTicketsButton, pricesHistogramVO.findTicketsButton) && Intrinsics.d(this.availableColors, pricesHistogramVO.availableColors) && Intrinsics.d(this.dateFrom, pricesHistogramVO.dateFrom) && Intrinsics.d(this.dateTo, pricesHistogramVO.dateTo) && Intrinsics.d(this.emptyHistogramMessage, pricesHistogramVO.emptyHistogramMessage) && Intrinsics.d(this.mediumPrice, pricesHistogramVO.mediumPrice) && Intrinsics.d(this.medianHeight, pricesHistogramVO.medianHeight) && Intrinsics.d(this.listDaysFrom, pricesHistogramVO.listDaysFrom) && Intrinsics.d(this.listDaysTo, pricesHistogramVO.listDaysTo) && Intrinsics.d(this.selectedDateFrom, pricesHistogramVO.selectedDateFrom) && Intrinsics.d(this.selectedDateTo, pricesHistogramVO.selectedDateTo) && Intrinsics.d(this.selectedPriceFrom, pricesHistogramVO.selectedPriceFrom) && Intrinsics.d(this.selectedPriceTo, pricesHistogramVO.selectedPriceTo) && this.countOfEmptyDays == pricesHistogramVO.countOfEmptyDays;
    }

    @NotNull
    public final AvailableColorsVO getAvailableColors() {
        return this.availableColors;
    }

    @NotNull
    public final ButtonV3Atom.SmallBorderlessButton getCancelButton() {
        return this.cancelButton;
    }

    public final int getCountOfEmptyDays() {
        return this.countOfEmptyDays;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getFindTicketsButton() {
        return this.findTicketsButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<MonthVO.DayVO> getListDaysFrom() {
        return this.listDaysFrom;
    }

    public final List<MonthVO.DayVO> getListDaysTo() {
        return this.listDaysTo;
    }

    @NotNull
    public final List<MonthVO> getMonthsFrom() {
        return this.monthsFrom;
    }

    public final List<MonthVO> getMonthsTo() {
        return this.monthsTo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSelectedDateTo() {
        return this.selectedDateTo;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final TextAtom getTitleFrom() {
        return this.titleFrom;
    }

    public final TextAtom getTitleTo() {
        return this.titleTo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.titleFrom);
        TextAtom textAtom = this.titleTo;
        int b12 = g.b((this.cancelButton.hashCode() + ((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31)) * 31, 31, this.monthsFrom);
        List<MonthVO> list = this.monthsTo;
        int a11 = g.a((this.availableColors.hashCode() + Tl.b.a(this.findTicketsButton, (b12 + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31, 31, this.dateFrom);
        String str = this.dateTo;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        TextAtom textAtom2 = this.emptyHistogramMessage;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.mediumPrice;
        int hashCode3 = (hashCode2 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
        Integer num = this.medianHeight;
        int b13 = g.b((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.listDaysFrom);
        List<MonthVO.DayVO> list2 = this.listDaysTo;
        int hashCode4 = (b13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TextAtom textAtom4 = this.selectedDateFrom;
        int hashCode5 = (hashCode4 + (textAtom4 == null ? 0 : textAtom4.hashCode())) * 31;
        TextAtom textAtom5 = this.selectedDateTo;
        int hashCode6 = (hashCode5 + (textAtom5 == null ? 0 : textAtom5.hashCode())) * 31;
        TextAtom textAtom6 = this.selectedPriceFrom;
        int hashCode7 = (hashCode6 + (textAtom6 == null ? 0 : textAtom6.hashCode())) * 31;
        TextAtom textAtom7 = this.selectedPriceTo;
        return Integer.hashCode(this.countOfEmptyDays) + ((hashCode7 + (textAtom7 != null ? textAtom7.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.titleFrom;
        TextAtom textAtom3 = this.titleTo;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.cancelButton;
        List<MonthVO> list = this.monthsFrom;
        List<MonthVO> list2 = this.monthsTo;
        ButtonV3Atom.LargeButton largeButton = this.findTicketsButton;
        AvailableColorsVO availableColorsVO = this.availableColors;
        String str = this.dateFrom;
        String str2 = this.dateTo;
        TextAtom textAtom4 = this.emptyHistogramMessage;
        TextAtom textAtom5 = this.mediumPrice;
        Integer num = this.medianHeight;
        List<MonthVO.DayVO> list3 = this.listDaysFrom;
        List<MonthVO.DayVO> list4 = this.listDaysTo;
        TextAtom textAtom6 = this.selectedDateFrom;
        TextAtom textAtom7 = this.selectedDateTo;
        TextAtom textAtom8 = this.selectedPriceFrom;
        TextAtom textAtom9 = this.selectedPriceTo;
        int i11 = this.countOfEmptyDays;
        StringBuilder c11 = C2639a.c("PricesHistogramVO(id=", j11, ", title=", textAtom);
        C2639a.e(", titleFrom=", ", titleTo=", c11, textAtom2, textAtom3);
        c11.append(", cancelButton=");
        c11.append(smallBorderlessButton);
        c11.append(", monthsFrom=");
        c11.append(list);
        c11.append(", monthsTo=");
        c11.append(list2);
        c11.append(", findTicketsButton=");
        c11.append(largeButton);
        c11.append(", availableColors=");
        c11.append(availableColorsVO);
        c11.append(", dateFrom=");
        c11.append(str);
        c11.append(", dateTo=");
        c11.append(str2);
        c11.append(", emptyHistogramMessage=");
        c11.append(textAtom4);
        c11.append(", mediumPrice=");
        c11.append(textAtom5);
        c11.append(", medianHeight=");
        c11.append(num);
        C2860c.g(", listDaysFrom=", ", listDaysTo=", c11, list3, list4);
        C2639a.e(", selectedDateFrom=", ", selectedDateTo=", c11, textAtom6, textAtom7);
        C2639a.e(", selectedPriceFrom=", ", selectedPriceTo=", c11, textAtom8, textAtom9);
        return h.b(c11, ", countOfEmptyDays=", i11, ")");
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO;", "", "", "countOfDays", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "countOfEmptyDays", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCountOfDays", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCountOfEmptyDays", "DayVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MonthVO {
        public static final int $stable = TextAtom.$stable;
        private final int countOfDays;
        private final int countOfEmptyDays;

        @NotNull
        private final TextAtom title;

        public MonthVO(int i11, @NotNull TextAtom title, int i12) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.countOfDays = i11;
            this.title = title;
            this.countOfEmptyDays = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MonthVO)) {
                return false;
            }
            MonthVO monthVO = (MonthVO) other;
            return this.countOfDays == monthVO.countOfDays && Intrinsics.d(this.title, monthVO.title) && this.countOfEmptyDays == monthVO.countOfEmptyDays;
        }

        public final int getCountOfDays() {
            return this.countOfDays;
        }

        public final int getCountOfEmptyDays() {
            return this.countOfEmptyDays;
        }

        public int hashCode() {
            return Integer.hashCode(this.countOfEmptyDays) + C2619v.b(Integer.hashCode(this.countOfDays) * 31, 31, this.title);
        }

        @NotNull
        public String toString() {
            int i11 = this.countOfDays;
            TextAtom textAtom = this.title;
            int i12 = this.countOfEmptyDays;
            StringBuilder sb2 = new StringBuilder("MonthVO(countOfDays=");
            sb2.append(i11);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", countOfEmptyDays=");
            return b.e(i12, ")", sb2);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u008a\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010'R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b)\u0010\u001aR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b\r\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b*\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b+\u0010%R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "", "", "dayHeight", "", "number", "date", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSelected", "priceOrMessage", "price", "isLowest", "monthLeft", "monthRight", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "daySelectionTracking", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/texts/TextAtom;IZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;LWZ/t;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/texts/TextAtom;IZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;LWZ/t;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getDayHeight", "Ljava/lang/String;", "getNumber", "getDate", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "getPriceOrMessage", "getPrice", "getMonthLeft", "getMonthRight", "LWZ/t;", "getDaySelectionTracking", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DayVO {

            @NotNull
            private final String date;
            private final int dayHeight;
            private final t daySelectionTracking;
            private final boolean isLowest;
            private final boolean isSelected;
            private final TextAtom monthLeft;
            private final TextAtom monthRight;

            @NotNull
            private final String number;
            private final int price;

            @NotNull
            private final TextAtom priceOrMessage;

            @NotNull
            private final TextAtom title;

            public DayVO(int i11, @NotNull String number, @NotNull String date, @NotNull TextAtom title, boolean z11, @NotNull TextAtom priceOrMessage, int i12, boolean z12, TextAtom textAtom, TextAtom textAtom2, t tVar) {
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(priceOrMessage, "priceOrMessage");
                this.dayHeight = i11;
                this.number = number;
                this.date = date;
                this.title = title;
                this.isSelected = z11;
                this.priceOrMessage = priceOrMessage;
                this.price = i12;
                this.isLowest = z12;
                this.monthLeft = textAtom;
                this.monthRight = textAtom2;
                this.daySelectionTracking = tVar;
            }

            public static /* synthetic */ DayVO copy$default(DayVO dayVO, int i11, String str, String str2, TextAtom textAtom, boolean z11, TextAtom textAtom2, int i12, boolean z12, TextAtom textAtom3, TextAtom textAtom4, t tVar, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i11 = dayVO.dayHeight;
                }
                if ((i13 & 2) != 0) {
                    str = dayVO.number;
                }
                if ((i13 & 4) != 0) {
                    str2 = dayVO.date;
                }
                if ((i13 & 8) != 0) {
                    textAtom = dayVO.title;
                }
                if ((i13 & 16) != 0) {
                    z11 = dayVO.isSelected;
                }
                if ((i13 & 32) != 0) {
                    textAtom2 = dayVO.priceOrMessage;
                }
                if ((i13 & 64) != 0) {
                    i12 = dayVO.price;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    z12 = dayVO.isLowest;
                }
                if ((i13 & 256) != 0) {
                    textAtom3 = dayVO.monthLeft;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    textAtom4 = dayVO.monthRight;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    tVar = dayVO.daySelectionTracking;
                }
                TextAtom textAtom5 = textAtom4;
                t tVar2 = tVar;
                boolean z13 = z12;
                TextAtom textAtom6 = textAtom3;
                TextAtom textAtom7 = textAtom2;
                int i14 = i12;
                boolean z14 = z11;
                String str3 = str2;
                return dayVO.copy(i11, str, str3, textAtom, z14, textAtom7, i14, z13, textAtom6, textAtom5, tVar2);
            }

            @NotNull
            public final DayVO copy(int dayHeight, @NotNull String number, @NotNull String date, @NotNull TextAtom title, boolean isSelected, @NotNull TextAtom priceOrMessage, int price, boolean isLowest, TextAtom monthLeft, TextAtom monthRight, t daySelectionTracking) {
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(priceOrMessage, "priceOrMessage");
                return new DayVO(dayHeight, number, date, title, isSelected, priceOrMessage, price, isLowest, monthLeft, monthRight, daySelectionTracking);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DayVO)) {
                    return false;
                }
                DayVO dayVO = (DayVO) other;
                return this.dayHeight == dayVO.dayHeight && Intrinsics.d(this.number, dayVO.number) && Intrinsics.d(this.date, dayVO.date) && Intrinsics.d(this.title, dayVO.title) && this.isSelected == dayVO.isSelected && Intrinsics.d(this.priceOrMessage, dayVO.priceOrMessage) && this.price == dayVO.price && this.isLowest == dayVO.isLowest && Intrinsics.d(this.monthLeft, dayVO.monthLeft) && Intrinsics.d(this.monthRight, dayVO.monthRight) && Intrinsics.d(this.daySelectionTracking, dayVO.daySelectionTracking);
            }

            @NotNull
            public final String getDate() {
                return this.date;
            }

            public final int getDayHeight() {
                return this.dayHeight;
            }

            public final t getDaySelectionTracking() {
                return this.daySelectionTracking;
            }

            public final TextAtom getMonthLeft() {
                return this.monthLeft;
            }

            public final TextAtom getMonthRight() {
                return this.monthRight;
            }

            @NotNull
            public final String getNumber() {
                return this.number;
            }

            public final int getPrice() {
                return this.price;
            }

            @NotNull
            public final TextAtom getPriceOrMessage() {
                return this.priceOrMessage;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = C3532b.a(C2454a.a(this.price, C2619v.b(C3532b.a(C2619v.b(g.a(g.a(Integer.hashCode(this.dayHeight) * 31, 31, this.number), 31, this.date), 31, this.title), 31, this.isSelected), 31, this.priceOrMessage), 31), 31, this.isLowest);
                TextAtom textAtom = this.monthLeft;
                int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                TextAtom textAtom2 = this.monthRight;
                int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
                t tVar = this.daySelectionTracking;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            /* renamed from: isLowest, reason: from getter */
            public final boolean getIsLowest() {
                return this.isLowest;
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                int i11 = this.dayHeight;
                String str = this.number;
                String str2 = this.date;
                TextAtom textAtom = this.title;
                boolean z11 = this.isSelected;
                TextAtom textAtom2 = this.priceOrMessage;
                int i12 = this.price;
                boolean z12 = this.isLowest;
                TextAtom textAtom3 = this.monthLeft;
                TextAtom textAtom4 = this.monthRight;
                t tVar = this.daySelectionTracking;
                StringBuilder g10 = e.g(i11, "DayVO(dayHeight=", ", number=", str, ", date=");
                g10.append(str2);
                g10.append(", title=");
                g10.append(textAtom);
                g10.append(", isSelected=");
                g10.append(z11);
                g10.append(", priceOrMessage=");
                g10.append(textAtom2);
                g10.append(", price=");
                Ql.c.d(g10, i12, ", isLowest=", z12, ", monthLeft=");
                C4636t5.c(", monthRight=", ", daySelectionTracking=", g10, textAtom3, textAtom4);
                return Tl.b.d(g10, tVar, ")");
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ DayVO(int r15, java.lang.String r16, java.lang.String r17, ru.ozon.uni.atoms.data.texts.TextAtom r18, boolean r19, ru.ozon.uni.atoms.data.texts.TextAtom r20, int r21, boolean r22, ru.ozon.uni.atoms.data.texts.TextAtom r23, ru.ozon.uni.atoms.data.texts.TextAtom r24, WZ.t r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
                /*
                    r14 = this;
                    r0 = r26
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L9
                    r1 = 0
                    r10 = r1
                    goto Lb
                L9:
                    r10 = r22
                Lb:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    r2 = 0
                    if (r1 == 0) goto L12
                    r11 = r2
                    goto L14
                L12:
                    r11 = r23
                L14:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L1a
                    r12 = r2
                    goto L1c
                L1a:
                    r12 = r24
                L1c:
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L30
                    r13 = r2
                    r3 = r15
                    r4 = r16
                    r5 = r17
                    r6 = r18
                    r7 = r19
                    r8 = r20
                    r9 = r21
                    r2 = r14
                    goto L40
                L30:
                    r13 = r25
                    r2 = r14
                    r3 = r15
                    r4 = r16
                    r5 = r17
                    r6 = r18
                    r7 = r19
                    r8 = r20
                    r9 = r21
                L40:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramVO.MonthVO.DayVO.<init>(int, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.texts.TextAtom, boolean, ru.ozon.uni.atoms.data.texts.TextAtom, int, boolean, ru.ozon.uni.atoms.data.texts.TextAtom, ru.ozon.uni.atoms.data.texts.TextAtom, WZ.t, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }
    }
}
