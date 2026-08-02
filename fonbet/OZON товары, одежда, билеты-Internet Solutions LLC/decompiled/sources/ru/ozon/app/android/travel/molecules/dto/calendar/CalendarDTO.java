package ru.ozon.app.android.travel.molecules.dto.calendar;

import B0.C2454a;
import C.o0;
import D3.g;
import D3.h;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0003678B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009f\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0010HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;", "", "startShownDate", "", "endShownDate", "minAvailableDate", "maxAvailableDate", "startSelectedDate", "endSelectedDate", "dateItems", "", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;", "dateTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "countDayRound", "", "priceCategoryColors", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategoryColorDTO;", "preScrollDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILjava/util/List;Ljava/lang/String;)V", "getStartShownDate", "()Ljava/lang/String;", "getEndShownDate", "getMinAvailableDate", "getMaxAvailableDate", "getStartSelectedDate", "getEndSelectedDate", "getDateItems", "()Ljava/util/List;", "getDateTrackingInfo", "()Ljava/util/Map;", "getCountDayRound", "()I", "getPriceCategoryColors", "getPreScrollDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "DateItemDTO", "PriceCategory", "PriceCategoryColorDTO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CalendarDTO {
    private final int countDayRound;
    private final List<DateItemDTO> dateItems;
    private final Map<String, TokenizedTrackingInfo> dateTrackingInfo;
    private final String endSelectedDate;

    @NotNull
    private final String endShownDate;
    private final String maxAvailableDate;
    private final String minAvailableDate;
    private final String preScrollDate;
    private final List<PriceCategoryColorDTO> priceCategoryColors;
    private final String startSelectedDate;

    @NotNull
    private final String startShownDate;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0006\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\r\u0010\u0015¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;", "", "date", "", "price", "", "isMin", "", "isDisabled", "priceCategory", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isWorkday", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;)V", "getDate", "()Ljava/lang/String;", "getPrice", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPriceCategory", "()Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;", "equals", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateItemDTO {

        @NotNull
        private final String date;
        private final Boolean isDisabled;
        private final Boolean isMin;
        private final Boolean isWorkday;
        private final Float price;

        @EnumNullFallback
        private final PriceCategory priceCategory;
        private final TextDTO text;

        public DateItemDTO(@NotNull String date, Float f7, Boolean bool, Boolean bool2, PriceCategory priceCategory, TextDTO textDTO, Boolean bool3) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
            this.price = f7;
            this.isMin = bool;
            this.isDisabled = bool2;
            this.priceCategory = priceCategory;
            this.text = textDTO;
            this.isWorkday = bool3;
        }

        public static /* synthetic */ DateItemDTO copy$default(DateItemDTO dateItemDTO, String str, Float f7, Boolean bool, Boolean bool2, PriceCategory priceCategory, TextDTO textDTO, Boolean bool3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dateItemDTO.date;
            }
            if ((i11 & 2) != 0) {
                f7 = dateItemDTO.price;
            }
            if ((i11 & 4) != 0) {
                bool = dateItemDTO.isMin;
            }
            if ((i11 & 8) != 0) {
                bool2 = dateItemDTO.isDisabled;
            }
            if ((i11 & 16) != 0) {
                priceCategory = dateItemDTO.priceCategory;
            }
            if ((i11 & 32) != 0) {
                textDTO = dateItemDTO.text;
            }
            if ((i11 & 64) != 0) {
                bool3 = dateItemDTO.isWorkday;
            }
            TextDTO textDTO2 = textDTO;
            Boolean bool4 = bool3;
            PriceCategory priceCategory2 = priceCategory;
            Boolean bool5 = bool;
            return dateItemDTO.copy(str, f7, bool5, bool2, priceCategory2, textDTO2, bool4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsMin() {
            return this.isMin;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* renamed from: component5, reason: from getter */
        public final PriceCategory getPriceCategory() {
            return this.priceCategory;
        }

        /* renamed from: component6, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getIsWorkday() {
            return this.isWorkday;
        }

        @NotNull
        public final DateItemDTO copy(@NotNull String date, Float price, Boolean isMin, Boolean isDisabled, PriceCategory priceCategory, TextDTO text, Boolean isWorkday) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new DateItemDTO(date, price, isMin, isDisabled, priceCategory, text, isWorkday);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateItemDTO)) {
                return false;
            }
            DateItemDTO dateItemDTO = (DateItemDTO) other;
            return Intrinsics.d(this.date, dateItemDTO.date) && Intrinsics.d(this.price, dateItemDTO.price) && Intrinsics.d(this.isMin, dateItemDTO.isMin) && Intrinsics.d(this.isDisabled, dateItemDTO.isDisabled) && this.priceCategory == dateItemDTO.priceCategory && Intrinsics.d(this.text, dateItemDTO.text) && Intrinsics.d(this.isWorkday, dateItemDTO.isWorkday);
        }

        @NotNull
        public final String getDate() {
            return this.date;
        }

        public final Float getPrice() {
            return this.price;
        }

        public final PriceCategory getPriceCategory() {
            return this.priceCategory;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.date.hashCode() * 31;
            Float f7 = this.price;
            int hashCode2 = (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31;
            Boolean bool = this.isMin;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isDisabled;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            PriceCategory priceCategory = this.priceCategory;
            int hashCode5 = (hashCode4 + (priceCategory == null ? 0 : priceCategory.hashCode())) * 31;
            TextDTO textDTO = this.text;
            int hashCode6 = (hashCode5 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Boolean bool3 = this.isWorkday;
            return hashCode6 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final Boolean isDisabled() {
            return this.isDisabled;
        }

        public final Boolean isMin() {
            return this.isMin;
        }

        public final Boolean isWorkday() {
            return this.isWorkday;
        }

        @NotNull
        public String toString() {
            String str = this.date;
            Float f7 = this.price;
            Boolean bool = this.isMin;
            Boolean bool2 = this.isDisabled;
            PriceCategory priceCategory = this.priceCategory;
            TextDTO textDTO = this.text;
            Boolean bool3 = this.isWorkday;
            StringBuilder sb2 = new StringBuilder("DateItemDTO(date=");
            sb2.append(str);
            sb2.append(", price=");
            sb2.append(f7);
            sb2.append(", isMin=");
            h.h(sb2, bool, ", isDisabled=", bool2, ", priceCategory=");
            sb2.append(priceCategory);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", isWorkday=");
            return g.d(sb2, bool3, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PriceCategory {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PriceCategory[] $VALUES;
        public static final PriceCategory LOW = new PriceCategory("LOW", 0);
        public static final PriceCategory MEDIUM = new PriceCategory("MEDIUM", 1);
        public static final PriceCategory HIGH = new PriceCategory("HIGH", 2);

        private static final /* synthetic */ PriceCategory[] $values() {
            return new PriceCategory[]{LOW, MEDIUM, HIGH};
        }

        static {
            PriceCategory[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PriceCategory(String str, int i11) {
        }

        public static PriceCategory valueOf(String str) {
            return (PriceCategory) Enum.valueOf(PriceCategory.class, str);
        }

        public static PriceCategory[] values() {
            return (PriceCategory[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategoryColorDTO;", "", "priceCategory", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;", "color", "", "selectedColor", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;Ljava/lang/String;Ljava/lang/String;)V", "getPriceCategory", "()Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;", "getColor", "()Ljava/lang/String;", "getSelectedColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceCategoryColorDTO {

        @NotNull
        private final String color;

        @EnumNullFallback
        private final PriceCategory priceCategory;
        private final String selectedColor;

        public PriceCategoryColorDTO(PriceCategory priceCategory, @NotNull String color, String str) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.priceCategory = priceCategory;
            this.color = color;
            this.selectedColor = str;
        }

        public static /* synthetic */ PriceCategoryColorDTO copy$default(PriceCategoryColorDTO priceCategoryColorDTO, PriceCategory priceCategory, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceCategory = priceCategoryColorDTO.priceCategory;
            }
            if ((i11 & 2) != 0) {
                str = priceCategoryColorDTO.color;
            }
            if ((i11 & 4) != 0) {
                str2 = priceCategoryColorDTO.selectedColor;
            }
            return priceCategoryColorDTO.copy(priceCategory, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final PriceCategory getPriceCategory() {
            return this.priceCategory;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSelectedColor() {
            return this.selectedColor;
        }

        @NotNull
        public final PriceCategoryColorDTO copy(PriceCategory priceCategory, @NotNull String color, String selectedColor) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new PriceCategoryColorDTO(priceCategory, color, selectedColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceCategoryColorDTO)) {
                return false;
            }
            PriceCategoryColorDTO priceCategoryColorDTO = (PriceCategoryColorDTO) other;
            return this.priceCategory == priceCategoryColorDTO.priceCategory && Intrinsics.d(this.color, priceCategoryColorDTO.color) && Intrinsics.d(this.selectedColor, priceCategoryColorDTO.selectedColor);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final PriceCategory getPriceCategory() {
            return this.priceCategory;
        }

        public final String getSelectedColor() {
            return this.selectedColor;
        }

        public int hashCode() {
            PriceCategory priceCategory = this.priceCategory;
            int a11 = G.g.a((priceCategory == null ? 0 : priceCategory.hashCode()) * 31, 31, this.color);
            String str = this.selectedColor;
            return a11 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PriceCategory priceCategory = this.priceCategory;
            String str = this.color;
            String str2 = this.selectedColor;
            StringBuilder sb2 = new StringBuilder("PriceCategoryColorDTO(priceCategory=");
            sb2.append(priceCategory);
            sb2.append(", color=");
            sb2.append(str);
            sb2.append(", selectedColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    public CalendarDTO(@NotNull String startShownDate, @NotNull String endShownDate, String str, String str2, String str3, String str4, List<DateItemDTO> list, Map<String, TokenizedTrackingInfo> map, int i11, List<PriceCategoryColorDTO> list2, String str5) {
        Intrinsics.checkNotNullParameter(startShownDate, "startShownDate");
        Intrinsics.checkNotNullParameter(endShownDate, "endShownDate");
        this.startShownDate = startShownDate;
        this.endShownDate = endShownDate;
        this.minAvailableDate = str;
        this.maxAvailableDate = str2;
        this.startSelectedDate = str3;
        this.endSelectedDate = str4;
        this.dateItems = list;
        this.dateTrackingInfo = map;
        this.countDayRound = i11;
        this.priceCategoryColors = list2;
        this.preScrollDate = str5;
    }

    public static /* synthetic */ CalendarDTO copy$default(CalendarDTO calendarDTO, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, int i11, List list2, String str7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = calendarDTO.startShownDate;
        }
        if ((i12 & 2) != 0) {
            str2 = calendarDTO.endShownDate;
        }
        if ((i12 & 4) != 0) {
            str3 = calendarDTO.minAvailableDate;
        }
        if ((i12 & 8) != 0) {
            str4 = calendarDTO.maxAvailableDate;
        }
        if ((i12 & 16) != 0) {
            str5 = calendarDTO.startSelectedDate;
        }
        if ((i12 & 32) != 0) {
            str6 = calendarDTO.endSelectedDate;
        }
        if ((i12 & 64) != 0) {
            list = calendarDTO.dateItems;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = calendarDTO.dateTrackingInfo;
        }
        if ((i12 & 256) != 0) {
            i11 = calendarDTO.countDayRound;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list2 = calendarDTO.priceCategoryColors;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str7 = calendarDTO.preScrollDate;
        }
        List list3 = list2;
        String str8 = str7;
        Map map2 = map;
        int i13 = i11;
        String str9 = str6;
        List list4 = list;
        String str10 = str5;
        String str11 = str3;
        return calendarDTO.copy(str, str2, str11, str4, str10, str9, list4, map2, i13, list3, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStartShownDate() {
        return this.startShownDate;
    }

    public final List<PriceCategoryColorDTO> component10() {
        return this.priceCategoryColors;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPreScrollDate() {
        return this.preScrollDate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEndShownDate() {
        return this.endShownDate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMinAvailableDate() {
        return this.minAvailableDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMaxAvailableDate() {
        return this.maxAvailableDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStartSelectedDate() {
        return this.startSelectedDate;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEndSelectedDate() {
        return this.endSelectedDate;
    }

    public final List<DateItemDTO> component7() {
        return this.dateItems;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.dateTrackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCountDayRound() {
        return this.countDayRound;
    }

    @NotNull
    public final CalendarDTO copy(@NotNull String startShownDate, @NotNull String endShownDate, String minAvailableDate, String maxAvailableDate, String startSelectedDate, String endSelectedDate, List<DateItemDTO> dateItems, Map<String, TokenizedTrackingInfo> dateTrackingInfo, int countDayRound, List<PriceCategoryColorDTO> priceCategoryColors, String preScrollDate) {
        Intrinsics.checkNotNullParameter(startShownDate, "startShownDate");
        Intrinsics.checkNotNullParameter(endShownDate, "endShownDate");
        return new CalendarDTO(startShownDate, endShownDate, minAvailableDate, maxAvailableDate, startSelectedDate, endSelectedDate, dateItems, dateTrackingInfo, countDayRound, priceCategoryColors, preScrollDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarDTO)) {
            return false;
        }
        CalendarDTO calendarDTO = (CalendarDTO) other;
        return Intrinsics.d(this.startShownDate, calendarDTO.startShownDate) && Intrinsics.d(this.endShownDate, calendarDTO.endShownDate) && Intrinsics.d(this.minAvailableDate, calendarDTO.minAvailableDate) && Intrinsics.d(this.maxAvailableDate, calendarDTO.maxAvailableDate) && Intrinsics.d(this.startSelectedDate, calendarDTO.startSelectedDate) && Intrinsics.d(this.endSelectedDate, calendarDTO.endSelectedDate) && Intrinsics.d(this.dateItems, calendarDTO.dateItems) && Intrinsics.d(this.dateTrackingInfo, calendarDTO.dateTrackingInfo) && this.countDayRound == calendarDTO.countDayRound && Intrinsics.d(this.priceCategoryColors, calendarDTO.priceCategoryColors) && Intrinsics.d(this.preScrollDate, calendarDTO.preScrollDate);
    }

    public final int getCountDayRound() {
        return this.countDayRound;
    }

    public final List<DateItemDTO> getDateItems() {
        return this.dateItems;
    }

    public final Map<String, TokenizedTrackingInfo> getDateTrackingInfo() {
        return this.dateTrackingInfo;
    }

    public final String getEndSelectedDate() {
        return this.endSelectedDate;
    }

    @NotNull
    public final String getEndShownDate() {
        return this.endShownDate;
    }

    public final String getMaxAvailableDate() {
        return this.maxAvailableDate;
    }

    public final String getMinAvailableDate() {
        return this.minAvailableDate;
    }

    public final String getPreScrollDate() {
        return this.preScrollDate;
    }

    public final List<PriceCategoryColorDTO> getPriceCategoryColors() {
        return this.priceCategoryColors;
    }

    public final String getStartSelectedDate() {
        return this.startSelectedDate;
    }

    @NotNull
    public final String getStartShownDate() {
        return this.startShownDate;
    }

    public int hashCode() {
        int a11 = G.g.a(this.startShownDate.hashCode() * 31, 31, this.endShownDate);
        String str = this.minAvailableDate;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxAvailableDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startSelectedDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endSelectedDate;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DateItemDTO> list = this.dateItems;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.dateTrackingInfo;
        int a12 = C2454a.a(this.countDayRound, (hashCode5 + (map == null ? 0 : map.hashCode())) * 31, 31);
        List<PriceCategoryColorDTO> list2 = this.priceCategoryColors;
        int hashCode6 = (a12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.preScrollDate;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.startShownDate;
        String str2 = this.endShownDate;
        String str3 = this.minAvailableDate;
        String str4 = this.maxAvailableDate;
        String str5 = this.startSelectedDate;
        String str6 = this.endSelectedDate;
        List<DateItemDTO> list = this.dateItems;
        Map<String, TokenizedTrackingInfo> map = this.dateTrackingInfo;
        int i11 = this.countDayRound;
        List<PriceCategoryColorDTO> list2 = this.priceCategoryColors;
        String str7 = this.preScrollDate;
        StringBuilder d11 = C3660k.d("CalendarDTO(startShownDate=", str, ", endShownDate=", str2, ", minAvailableDate=");
        Nh.a.h(d11, str3, ", maxAvailableDate=", str4, ", startSelectedDate=");
        Nh.a.h(d11, str5, ", endSelectedDate=", str6, ", dateItems=");
        d11.append(list);
        d11.append(", dateTrackingInfo=");
        d11.append(map);
        d11.append(", countDayRound=");
        d11.append(i11);
        d11.append(", priceCategoryColors=");
        d11.append(list2);
        d11.append(", preScrollDate=");
        return o0.c(d11, str7, ")");
    }

    public /* synthetic */ CalendarDTO(String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, int i11, List list2, String str7, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, list, map, (i12 & 256) != 0 ? 0 : i11, list2, str7);
    }
}
