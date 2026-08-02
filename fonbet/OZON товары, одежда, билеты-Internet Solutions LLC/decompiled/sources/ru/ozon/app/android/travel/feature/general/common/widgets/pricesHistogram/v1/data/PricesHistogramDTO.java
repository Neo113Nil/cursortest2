package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data;

import B0.C2454a;
import B90.C2616s;
import B90.C2619v;
import C.o0;
import Cm.e;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import T7.P;
import Tl.b;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002BCB\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010,J¨\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0016HÖ\u0001J\t\u0010A\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleFrom", "titleTo", "cancelButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "monthsFrom", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO;", "monthsTo", "findTicketsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "availableColors", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;", "dateFrom", "", "dateTo", "emptyHistogramMessage", "mediumPrice", "medianHeight", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleFrom", "getTitleTo", "getCancelButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getMonthsFrom", "()Ljava/util/List;", "getMonthsTo", "getFindTicketsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAvailableColors", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;", "getDateFrom", "()Ljava/lang/String;", "getDateTo", "getEmptyHistogramMessage", "getMediumPrice", "getMedianHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO;", "equals", "", "other", "hashCode", "toString", "MonthDTO", "AvailableColorsDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PricesHistogramDTO {
    public static final int $stable = 8;

    @NotNull
    private final AvailableColorsDTO availableColors;

    @NotNull
    private final ButtonV3Atom.SmallBorderlessButton cancelButton;

    @NotNull
    private final String dateFrom;
    private final String dateTo;
    private final TextAtom emptyHistogramMessage;

    @NotNull
    private final ButtonV3Atom.LargeButton findTicketsButton;
    private final Integer medianHeight;
    private final TextAtom mediumPrice;

    @NotNull
    private final List<MonthDTO> monthsFrom;
    private final List<MonthDTO> monthsTo;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final TextAtom titleFrom;
    private final TextAtom titleTo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;", "", "selected", "", "default", "textSelected", "textDefault", "lowestPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSelected", "()Ljava/lang/String;", "getDefault", "getTextSelected", "getTextDefault", "getLowestPrice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvailableColorsDTO {
        public static final int $stable = 0;

        @NotNull
        private final String default;
        private final String lowestPrice;

        @NotNull
        private final String selected;

        @NotNull
        private final String textDefault;

        @NotNull
        private final String textSelected;

        public AvailableColorsDTO(@NotNull String selected, @NotNull String str, @NotNull String textSelected, @NotNull String textDefault, String str2) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            Intrinsics.checkNotNullParameter(str, "default");
            Intrinsics.checkNotNullParameter(textSelected, "textSelected");
            Intrinsics.checkNotNullParameter(textDefault, "textDefault");
            this.selected = selected;
            this.default = str;
            this.textSelected = textSelected;
            this.textDefault = textDefault;
            this.lowestPrice = str2;
        }

        public static /* synthetic */ AvailableColorsDTO copy$default(AvailableColorsDTO availableColorsDTO, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = availableColorsDTO.selected;
            }
            if ((i11 & 2) != 0) {
                str2 = availableColorsDTO.default;
            }
            if ((i11 & 4) != 0) {
                str3 = availableColorsDTO.textSelected;
            }
            if ((i11 & 8) != 0) {
                str4 = availableColorsDTO.textDefault;
            }
            if ((i11 & 16) != 0) {
                str5 = availableColorsDTO.lowestPrice;
            }
            String str6 = str5;
            String str7 = str3;
            return availableColorsDTO.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSelected() {
            return this.selected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDefault() {
            return this.default;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTextSelected() {
            return this.textSelected;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTextDefault() {
            return this.textDefault;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLowestPrice() {
            return this.lowestPrice;
        }

        @NotNull
        public final AvailableColorsDTO copy(@NotNull String selected, @NotNull String r92, @NotNull String textSelected, @NotNull String textDefault, String lowestPrice) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            Intrinsics.checkNotNullParameter(r92, "default");
            Intrinsics.checkNotNullParameter(textSelected, "textSelected");
            Intrinsics.checkNotNullParameter(textDefault, "textDefault");
            return new AvailableColorsDTO(selected, r92, textSelected, textDefault, lowestPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvailableColorsDTO)) {
                return false;
            }
            AvailableColorsDTO availableColorsDTO = (AvailableColorsDTO) other;
            return Intrinsics.d(this.selected, availableColorsDTO.selected) && Intrinsics.d(this.default, availableColorsDTO.default) && Intrinsics.d(this.textSelected, availableColorsDTO.textSelected) && Intrinsics.d(this.textDefault, availableColorsDTO.textDefault) && Intrinsics.d(this.lowestPrice, availableColorsDTO.lowestPrice);
        }

        @NotNull
        public final String getDefault() {
            return this.default;
        }

        public final String getLowestPrice() {
            return this.lowestPrice;
        }

        @NotNull
        public final String getSelected() {
            return this.selected;
        }

        @NotNull
        public final String getTextDefault() {
            return this.textDefault;
        }

        @NotNull
        public final String getTextSelected() {
            return this.textSelected;
        }

        public int hashCode() {
            int a11 = g.a(g.a(g.a(this.selected.hashCode() * 31, 31, this.default), 31, this.textSelected), 31, this.textDefault);
            String str = this.lowestPrice;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.selected;
            String str2 = this.default;
            String str3 = this.textSelected;
            String str4 = this.textDefault;
            String str5 = this.lowestPrice;
            StringBuilder d11 = C3660k.d("AvailableColorsDTO(selected=", str, ", default=", str2, ", textSelected=");
            a.h(d11, str3, ", textDefault=", str4, ", lowestPrice=");
            return o0.c(d11, str5, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO;", "", "days", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getDays", "()Ljava/util/List;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DayDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MonthDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<DayDTO> days;

        @NotNull
        private final TextAtom title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jx\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\r\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;", "", "dayHeight", "", "number", "", "date", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "isSelected", "", "priceOrMessage", "price", "isLowest", "daySelectionTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/texts/TextAtom;ILjava/lang/Boolean;Ljava/util/Map;)V", "getDayHeight", "()I", "getNumber", "()Ljava/lang/String;", "getDate", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "()Z", "getPriceOrMessage", "getPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDaySelectionTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/texts/TextAtom;ILjava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;", "equals", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DayDTO {
            public static final int $stable = 8;

            @NotNull
            private final String date;
            private final int dayHeight;
            private final Map<String, TokenizedTrackingInfo> daySelectionTracking;
            private final Boolean isLowest;
            private final boolean isSelected;

            @NotNull
            private final String number;
            private final int price;

            @NotNull
            private final TextAtom priceOrMessage;

            @NotNull
            private final TextAtom title;

            public DayDTO(int i11, @NotNull String number, @NotNull String date, @NotNull TextAtom title, boolean z11, @NotNull TextAtom priceOrMessage, int i12, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
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
                this.isLowest = bool;
                this.daySelectionTracking = map;
            }

            public static /* synthetic */ DayDTO copy$default(DayDTO dayDTO, int i11, String str, String str2, TextAtom textAtom, boolean z11, TextAtom textAtom2, int i12, Boolean bool, Map map, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i11 = dayDTO.dayHeight;
                }
                if ((i13 & 2) != 0) {
                    str = dayDTO.number;
                }
                if ((i13 & 4) != 0) {
                    str2 = dayDTO.date;
                }
                if ((i13 & 8) != 0) {
                    textAtom = dayDTO.title;
                }
                if ((i13 & 16) != 0) {
                    z11 = dayDTO.isSelected;
                }
                if ((i13 & 32) != 0) {
                    textAtom2 = dayDTO.priceOrMessage;
                }
                if ((i13 & 64) != 0) {
                    i12 = dayDTO.price;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    bool = dayDTO.isLowest;
                }
                if ((i13 & 256) != 0) {
                    map = dayDTO.daySelectionTracking;
                }
                Boolean bool2 = bool;
                Map map2 = map;
                TextAtom textAtom3 = textAtom2;
                int i14 = i12;
                boolean z12 = z11;
                String str3 = str2;
                return dayDTO.copy(i11, str, str3, textAtom, z12, textAtom3, i14, bool2, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDayHeight() {
                return this.dayHeight;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getDate() {
                return this.date;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final TextAtom getPriceOrMessage() {
                return this.priceOrMessage;
            }

            /* renamed from: component7, reason: from getter */
            public final int getPrice() {
                return this.price;
            }

            /* renamed from: component8, reason: from getter */
            public final Boolean getIsLowest() {
                return this.isLowest;
            }

            public final Map<String, TokenizedTrackingInfo> component9() {
                return this.daySelectionTracking;
            }

            @NotNull
            public final DayDTO copy(int dayHeight, @NotNull String number, @NotNull String date, @NotNull TextAtom title, boolean isSelected, @NotNull TextAtom priceOrMessage, int price, Boolean isLowest, Map<String, TokenizedTrackingInfo> daySelectionTracking) {
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(priceOrMessage, "priceOrMessage");
                return new DayDTO(dayHeight, number, date, title, isSelected, priceOrMessage, price, isLowest, daySelectionTracking);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DayDTO)) {
                    return false;
                }
                DayDTO dayDTO = (DayDTO) other;
                return this.dayHeight == dayDTO.dayHeight && Intrinsics.d(this.number, dayDTO.number) && Intrinsics.d(this.date, dayDTO.date) && Intrinsics.d(this.title, dayDTO.title) && this.isSelected == dayDTO.isSelected && Intrinsics.d(this.priceOrMessage, dayDTO.priceOrMessage) && this.price == dayDTO.price && Intrinsics.d(this.isLowest, dayDTO.isLowest) && Intrinsics.d(this.daySelectionTracking, dayDTO.daySelectionTracking);
            }

            @NotNull
            public final String getDate() {
                return this.date;
            }

            public final int getDayHeight() {
                return this.dayHeight;
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

            @NotNull
            public final TextAtom getPriceOrMessage() {
                return this.priceOrMessage;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.price, C2619v.b(C3532b.a(C2619v.b(g.a(g.a(Integer.hashCode(this.dayHeight) * 31, 31, this.number), 31, this.date), 31, this.title), 31, this.isSelected), 31, this.priceOrMessage), 31);
                Boolean bool = this.isLowest;
                int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.daySelectionTracking;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            public final Boolean isLowest() {
                return this.isLowest;
            }

            public final boolean isSelected() {
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
                Boolean bool = this.isLowest;
                Map<String, TokenizedTrackingInfo> map = this.daySelectionTracking;
                StringBuilder g10 = e.g(i11, "DayDTO(dayHeight=", ", number=", str, ", date=");
                g10.append(str2);
                g10.append(", title=");
                g10.append(textAtom);
                g10.append(", isSelected=");
                g10.append(z11);
                g10.append(", priceOrMessage=");
                g10.append(textAtom2);
                g10.append(", price=");
                g10.append(i12);
                g10.append(", isLowest=");
                g10.append(bool);
                g10.append(", daySelectionTracking=");
                return P.f(g10, map, ")");
            }
        }

        public MonthDTO(@NotNull List<DayDTO> days, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(days, "days");
            Intrinsics.checkNotNullParameter(title, "title");
            this.days = days;
            this.title = title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MonthDTO copy$default(MonthDTO monthDTO, List list, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = monthDTO.days;
            }
            if ((i11 & 2) != 0) {
                textAtom = monthDTO.title;
            }
            return monthDTO.copy(list, textAtom);
        }

        @NotNull
        public final List<DayDTO> component1() {
            return this.days;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final MonthDTO copy(@NotNull List<DayDTO> days, @NotNull TextAtom title) {
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
        public final TextAtom getTitle() {
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

    public PricesHistogramDTO(@NotNull TextAtom title, @NotNull TextAtom titleFrom, TextAtom textAtom, @NotNull ButtonV3Atom.SmallBorderlessButton cancelButton, @NotNull List<MonthDTO> monthsFrom, List<MonthDTO> list, @NotNull ButtonV3Atom.LargeButton findTicketsButton, @NotNull AvailableColorsDTO availableColors, @NotNull String dateFrom, String str, TextAtom textAtom2, TextAtom textAtom3, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleFrom, "titleFrom");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        Intrinsics.checkNotNullParameter(monthsFrom, "monthsFrom");
        Intrinsics.checkNotNullParameter(findTicketsButton, "findTicketsButton");
        Intrinsics.checkNotNullParameter(availableColors, "availableColors");
        Intrinsics.checkNotNullParameter(dateFrom, "dateFrom");
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
    }

    public static /* synthetic */ PricesHistogramDTO copy$default(PricesHistogramDTO pricesHistogramDTO, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, List list, List list2, ButtonV3Atom.LargeButton largeButton, AvailableColorsDTO availableColorsDTO, String str, String str2, TextAtom textAtom4, TextAtom textAtom5, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = pricesHistogramDTO.title;
        }
        return pricesHistogramDTO.copy(textAtom, (i11 & 2) != 0 ? pricesHistogramDTO.titleFrom : textAtom2, (i11 & 4) != 0 ? pricesHistogramDTO.titleTo : textAtom3, (i11 & 8) != 0 ? pricesHistogramDTO.cancelButton : smallBorderlessButton, (i11 & 16) != 0 ? pricesHistogramDTO.monthsFrom : list, (i11 & 32) != 0 ? pricesHistogramDTO.monthsTo : list2, (i11 & 64) != 0 ? pricesHistogramDTO.findTicketsButton : largeButton, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pricesHistogramDTO.availableColors : availableColorsDTO, (i11 & 256) != 0 ? pricesHistogramDTO.dateFrom : str, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? pricesHistogramDTO.dateTo : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? pricesHistogramDTO.emptyHistogramMessage : textAtom4, (i11 & 2048) != 0 ? pricesHistogramDTO.mediumPrice : textAtom5, (i11 & 4096) != 0 ? pricesHistogramDTO.medianHeight : num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDateTo() {
        return this.dateTo;
    }

    /* renamed from: component11, reason: from getter */
    public final TextAtom getEmptyHistogramMessage() {
        return this.emptyHistogramMessage;
    }

    /* renamed from: component12, reason: from getter */
    public final TextAtom getMediumPrice() {
        return this.mediumPrice;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getMedianHeight() {
        return this.medianHeight;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitleFrom() {
        return this.titleFrom;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitleTo() {
        return this.titleTo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final List<MonthDTO> component5() {
        return this.monthsFrom;
    }

    public final List<MonthDTO> component6() {
        return this.monthsTo;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeButton getFindTicketsButton() {
        return this.findTicketsButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AvailableColorsDTO getAvailableColors() {
        return this.availableColors;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getDateFrom() {
        return this.dateFrom;
    }

    @NotNull
    public final PricesHistogramDTO copy(@NotNull TextAtom title, @NotNull TextAtom titleFrom, TextAtom titleTo, @NotNull ButtonV3Atom.SmallBorderlessButton cancelButton, @NotNull List<MonthDTO> monthsFrom, List<MonthDTO> monthsTo, @NotNull ButtonV3Atom.LargeButton findTicketsButton, @NotNull AvailableColorsDTO availableColors, @NotNull String dateFrom, String dateTo, TextAtom emptyHistogramMessage, TextAtom mediumPrice, Integer medianHeight) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleFrom, "titleFrom");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        Intrinsics.checkNotNullParameter(monthsFrom, "monthsFrom");
        Intrinsics.checkNotNullParameter(findTicketsButton, "findTicketsButton");
        Intrinsics.checkNotNullParameter(availableColors, "availableColors");
        Intrinsics.checkNotNullParameter(dateFrom, "dateFrom");
        return new PricesHistogramDTO(title, titleFrom, titleTo, cancelButton, monthsFrom, monthsTo, findTicketsButton, availableColors, dateFrom, dateTo, emptyHistogramMessage, mediumPrice, medianHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricesHistogramDTO)) {
            return false;
        }
        PricesHistogramDTO pricesHistogramDTO = (PricesHistogramDTO) other;
        return Intrinsics.d(this.title, pricesHistogramDTO.title) && Intrinsics.d(this.titleFrom, pricesHistogramDTO.titleFrom) && Intrinsics.d(this.titleTo, pricesHistogramDTO.titleTo) && Intrinsics.d(this.cancelButton, pricesHistogramDTO.cancelButton) && Intrinsics.d(this.monthsFrom, pricesHistogramDTO.monthsFrom) && Intrinsics.d(this.monthsTo, pricesHistogramDTO.monthsTo) && Intrinsics.d(this.findTicketsButton, pricesHistogramDTO.findTicketsButton) && Intrinsics.d(this.availableColors, pricesHistogramDTO.availableColors) && Intrinsics.d(this.dateFrom, pricesHistogramDTO.dateFrom) && Intrinsics.d(this.dateTo, pricesHistogramDTO.dateTo) && Intrinsics.d(this.emptyHistogramMessage, pricesHistogramDTO.emptyHistogramMessage) && Intrinsics.d(this.mediumPrice, pricesHistogramDTO.mediumPrice) && Intrinsics.d(this.medianHeight, pricesHistogramDTO.medianHeight);
    }

    @NotNull
    public final AvailableColorsDTO getAvailableColors() {
        return this.availableColors;
    }

    @NotNull
    public final ButtonV3Atom.SmallBorderlessButton getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final String getDateFrom() {
        return this.dateFrom;
    }

    public final String getDateTo() {
        return this.dateTo;
    }

    public final TextAtom getEmptyHistogramMessage() {
        return this.emptyHistogramMessage;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getFindTicketsButton() {
        return this.findTicketsButton;
    }

    public final Integer getMedianHeight() {
        return this.medianHeight;
    }

    public final TextAtom getMediumPrice() {
        return this.mediumPrice;
    }

    @NotNull
    public final List<MonthDTO> getMonthsFrom() {
        return this.monthsFrom;
    }

    public final List<MonthDTO> getMonthsTo() {
        return this.monthsTo;
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

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.titleFrom);
        TextAtom textAtom = this.titleTo;
        int b12 = g.b((this.cancelButton.hashCode() + ((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31)) * 31, 31, this.monthsFrom);
        List<MonthDTO> list = this.monthsTo;
        int a11 = g.a((this.availableColors.hashCode() + b.a(this.findTicketsButton, (b12 + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31, 31, this.dateFrom);
        String str = this.dateTo;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        TextAtom textAtom2 = this.emptyHistogramMessage;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.mediumPrice;
        int hashCode3 = (hashCode2 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
        Integer num = this.medianHeight;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.titleFrom;
        TextAtom textAtom3 = this.titleTo;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.cancelButton;
        List<MonthDTO> list = this.monthsFrom;
        List<MonthDTO> list2 = this.monthsTo;
        ButtonV3Atom.LargeButton largeButton = this.findTicketsButton;
        AvailableColorsDTO availableColorsDTO = this.availableColors;
        String str = this.dateFrom;
        String str2 = this.dateTo;
        TextAtom textAtom4 = this.emptyHistogramMessage;
        TextAtom textAtom5 = this.mediumPrice;
        Integer num = this.medianHeight;
        StringBuilder a11 = HY.a.a("PricesHistogramDTO(title=", textAtom, ", titleFrom=", textAtom2, ", titleTo=");
        a11.append(textAtom3);
        a11.append(", cancelButton=");
        a11.append(smallBorderlessButton);
        a11.append(", monthsFrom=");
        C2616s.g(", monthsTo=", ", findTicketsButton=", a11, list, list2);
        a11.append(largeButton);
        a11.append(", availableColors=");
        a11.append(availableColorsDTO);
        a11.append(", dateFrom=");
        a.h(a11, str, ", dateTo=", str2, ", emptyHistogramMessage=");
        C4636t5.c(", mediumPrice=", ", medianHeight=", a11, textAtom4, textAtom5);
        return Ep.a.c(a11, num, ")");
    }
}
