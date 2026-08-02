package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data;

import B0.C2454a;
import B90.C2616s;
import G.g;
import J0.P;
import N3.C3660k;
import Tl.b;
import V.e;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0003/01Ba\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003Jq\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0006HÖ\u0001J\t\u0010.\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO;", "", "cells", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$QuantityCellDTO;", "maxSumValue", "", "alerts", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO;", "applyButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "ageCategories", "", "ageSelectors", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AgeSelectorDTO;", "childrenAgeAnnotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "ageSelectorPlaceholder", "<init>", "(Ljava/util/List;ILjava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/String;)V", "getCells", "()Ljava/util/List;", "getMaxSumValue", "()I", "getAlerts", "getApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAgeCategories", "getAgeSelectors", "getChildrenAgeAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAgeSelectorPlaceholder", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "QuantityCellDTO", "AlertDTO", "AgeSelectorDTO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<String> ageCategories;

    @NotNull
    private final String ageSelectorPlaceholder;

    @NotNull
    private final List<AgeSelectorDTO> ageSelectors;

    @NotNull
    private final List<AlertDTO> alerts;

    @NotNull
    private final ButtonV3Atom.LargeButton applyButton;

    @NotNull
    private final List<QuantityCellDTO> cells;

    @NotNull
    private final DisclaimerAtom childrenAgeAnnotation;
    private final int maxSumValue;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AgeSelectorDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getError", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AgeSelectorDTO {
        public static final int $stable = 0;
        private final String error;
        private final String value;

        public AgeSelectorDTO(String str, String str2) {
            this.value = str;
            this.error = str2;
        }

        public static /* synthetic */ AgeSelectorDTO copy$default(AgeSelectorDTO ageSelectorDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = ageSelectorDTO.value;
            }
            if ((i11 & 2) != 0) {
                str2 = ageSelectorDTO.error;
            }
            return ageSelectorDTO.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final AgeSelectorDTO copy(String value, String error) {
            return new AgeSelectorDTO(value, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgeSelectorDTO)) {
                return false;
            }
            AgeSelectorDTO ageSelectorDTO = (AgeSelectorDTO) other;
            return Intrinsics.d(this.value, ageSelectorDTO.value) && Intrinsics.d(this.error, ageSelectorDTO.error);
        }

        public final String getError() {
            return this.error;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.error;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("AgeSelectorDTO(value=", this.value, ", error=", this.error, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$QuantityCellDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "currentValue", "", "minValue", "maxValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getCurrentValue", "()I", "getMinValue", "getMaxValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityCellDTO {
        public static final int $stable = 0;
        private final int currentValue;

        @NotNull
        private final String id;
        private final int maxValue;
        private final int minValue;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public QuantityCellDTO(@NotNull String id2, @NotNull String title, @NotNull String subtitle, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.id = id2;
            this.title = title;
            this.subtitle = subtitle;
            this.currentValue = i11;
            this.minValue = i12;
            this.maxValue = i13;
        }

        public static /* synthetic */ QuantityCellDTO copy$default(QuantityCellDTO quantityCellDTO, String str, String str2, String str3, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = quantityCellDTO.id;
            }
            if ((i14 & 2) != 0) {
                str2 = quantityCellDTO.title;
            }
            if ((i14 & 4) != 0) {
                str3 = quantityCellDTO.subtitle;
            }
            if ((i14 & 8) != 0) {
                i11 = quantityCellDTO.currentValue;
            }
            if ((i14 & 16) != 0) {
                i12 = quantityCellDTO.minValue;
            }
            if ((i14 & 32) != 0) {
                i13 = quantityCellDTO.maxValue;
            }
            int i15 = i12;
            int i16 = i13;
            return quantityCellDTO.copy(str, str2, str3, i11, i15, i16);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCurrentValue() {
            return this.currentValue;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMaxValue() {
            return this.maxValue;
        }

        @NotNull
        public final QuantityCellDTO copy(@NotNull String id2, @NotNull String title, @NotNull String subtitle, int currentValue, int minValue, int maxValue) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new QuantityCellDTO(id2, title, subtitle, currentValue, minValue, maxValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityCellDTO)) {
                return false;
            }
            QuantityCellDTO quantityCellDTO = (QuantityCellDTO) other;
            return Intrinsics.d(this.id, quantityCellDTO.id) && Intrinsics.d(this.title, quantityCellDTO.title) && Intrinsics.d(this.subtitle, quantityCellDTO.subtitle) && this.currentValue == quantityCellDTO.currentValue && this.minValue == quantityCellDTO.minValue && this.maxValue == quantityCellDTO.maxValue;
        }

        public final int getCurrentValue() {
            return this.currentValue;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxValue) + C2454a.a(this.minValue, C2454a.a(this.currentValue, g.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.title;
            String str3 = this.subtitle;
            int i11 = this.currentValue;
            int i12 = this.minValue;
            int i13 = this.maxValue;
            StringBuilder d11 = C3660k.d("QuantityCellDTO(id=", str, ", title=", str2, ", subtitle=");
            Pk0.g.d(i11, str3, ", currentValue=", ", minValue=", d11);
            return P.a(i12, i13, ", maxValue=", ")", d11);
        }
    }

    public TouristCountSelectorDTO(@NotNull List<QuantityCellDTO> cells, int i11, @NotNull List<AlertDTO> alerts, @NotNull ButtonV3Atom.LargeButton applyButton, @NotNull List<String> ageCategories, @NotNull List<AgeSelectorDTO> ageSelectors, @NotNull DisclaimerAtom childrenAgeAnnotation, @NotNull String ageSelectorPlaceholder) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        Intrinsics.checkNotNullParameter(ageSelectors, "ageSelectors");
        Intrinsics.checkNotNullParameter(childrenAgeAnnotation, "childrenAgeAnnotation");
        Intrinsics.checkNotNullParameter(ageSelectorPlaceholder, "ageSelectorPlaceholder");
        this.cells = cells;
        this.maxSumValue = i11;
        this.alerts = alerts;
        this.applyButton = applyButton;
        this.ageCategories = ageCategories;
        this.ageSelectors = ageSelectors;
        this.childrenAgeAnnotation = childrenAgeAnnotation;
        this.ageSelectorPlaceholder = ageSelectorPlaceholder;
    }

    public static /* synthetic */ TouristCountSelectorDTO copy$default(TouristCountSelectorDTO touristCountSelectorDTO, List list, int i11, List list2, ButtonV3Atom.LargeButton largeButton, List list3, List list4, DisclaimerAtom disclaimerAtom, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = touristCountSelectorDTO.cells;
        }
        if ((i12 & 2) != 0) {
            i11 = touristCountSelectorDTO.maxSumValue;
        }
        if ((i12 & 4) != 0) {
            list2 = touristCountSelectorDTO.alerts;
        }
        if ((i12 & 8) != 0) {
            largeButton = touristCountSelectorDTO.applyButton;
        }
        if ((i12 & 16) != 0) {
            list3 = touristCountSelectorDTO.ageCategories;
        }
        if ((i12 & 32) != 0) {
            list4 = touristCountSelectorDTO.ageSelectors;
        }
        if ((i12 & 64) != 0) {
            disclaimerAtom = touristCountSelectorDTO.childrenAgeAnnotation;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = touristCountSelectorDTO.ageSelectorPlaceholder;
        }
        DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
        String str2 = str;
        List list5 = list3;
        List list6 = list4;
        return touristCountSelectorDTO.copy(list, i11, list2, largeButton, list5, list6, disclaimerAtom2, str2);
    }

    @NotNull
    public final List<QuantityCellDTO> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxSumValue() {
        return this.maxSumValue;
    }

    @NotNull
    public final List<AlertDTO> component3() {
        return this.alerts;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final List<String> component5() {
        return this.ageCategories;
    }

    @NotNull
    public final List<AgeSelectorDTO> component6() {
        return this.ageSelectors;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final DisclaimerAtom getChildrenAgeAnnotation() {
        return this.childrenAgeAnnotation;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getAgeSelectorPlaceholder() {
        return this.ageSelectorPlaceholder;
    }

    @NotNull
    public final TouristCountSelectorDTO copy(@NotNull List<QuantityCellDTO> cells, int maxSumValue, @NotNull List<AlertDTO> alerts, @NotNull ButtonV3Atom.LargeButton applyButton, @NotNull List<String> ageCategories, @NotNull List<AgeSelectorDTO> ageSelectors, @NotNull DisclaimerAtom childrenAgeAnnotation, @NotNull String ageSelectorPlaceholder) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        Intrinsics.checkNotNullParameter(ageSelectors, "ageSelectors");
        Intrinsics.checkNotNullParameter(childrenAgeAnnotation, "childrenAgeAnnotation");
        Intrinsics.checkNotNullParameter(ageSelectorPlaceholder, "ageSelectorPlaceholder");
        return new TouristCountSelectorDTO(cells, maxSumValue, alerts, applyButton, ageCategories, ageSelectors, childrenAgeAnnotation, ageSelectorPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorDTO)) {
            return false;
        }
        TouristCountSelectorDTO touristCountSelectorDTO = (TouristCountSelectorDTO) other;
        return Intrinsics.d(this.cells, touristCountSelectorDTO.cells) && this.maxSumValue == touristCountSelectorDTO.maxSumValue && Intrinsics.d(this.alerts, touristCountSelectorDTO.alerts) && Intrinsics.d(this.applyButton, touristCountSelectorDTO.applyButton) && Intrinsics.d(this.ageCategories, touristCountSelectorDTO.ageCategories) && Intrinsics.d(this.ageSelectors, touristCountSelectorDTO.ageSelectors) && Intrinsics.d(this.childrenAgeAnnotation, touristCountSelectorDTO.childrenAgeAnnotation) && Intrinsics.d(this.ageSelectorPlaceholder, touristCountSelectorDTO.ageSelectorPlaceholder);
    }

    @NotNull
    public final List<String> getAgeCategories() {
        return this.ageCategories;
    }

    @NotNull
    public final String getAgeSelectorPlaceholder() {
        return this.ageSelectorPlaceholder;
    }

    @NotNull
    public final List<AgeSelectorDTO> getAgeSelectors() {
        return this.ageSelectors;
    }

    @NotNull
    public final List<AlertDTO> getAlerts() {
        return this.alerts;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final List<QuantityCellDTO> getCells() {
        return this.cells;
    }

    @NotNull
    public final DisclaimerAtom getChildrenAgeAnnotation() {
        return this.childrenAgeAnnotation;
    }

    public final int getMaxSumValue() {
        return this.maxSumValue;
    }

    public int hashCode() {
        return this.ageSelectorPlaceholder.hashCode() + ((this.childrenAgeAnnotation.hashCode() + g.b(g.b(b.a(this.applyButton, g.b(C2454a.a(this.maxSumValue, this.cells.hashCode() * 31, 31), 31, this.alerts), 31), 31, this.ageCategories), 31, this.ageSelectors)) * 31);
    }

    @NotNull
    public String toString() {
        List<QuantityCellDTO> list = this.cells;
        int i11 = this.maxSumValue;
        List<AlertDTO> list2 = this.alerts;
        ButtonV3Atom.LargeButton largeButton = this.applyButton;
        List<String> list3 = this.ageCategories;
        List<AgeSelectorDTO> list4 = this.ageSelectors;
        DisclaimerAtom disclaimerAtom = this.childrenAgeAnnotation;
        String str = this.ageSelectorPlaceholder;
        StringBuilder sb2 = new StringBuilder("TouristCountSelectorDTO(cells=");
        sb2.append(list);
        sb2.append(", maxSumValue=");
        sb2.append(i11);
        sb2.append(", alerts=");
        sb2.append(list2);
        sb2.append(", applyButton=");
        sb2.append(largeButton);
        sb2.append(", ageCategories=");
        C2616s.g(", ageSelectors=", ", childrenAgeAnnotation=", sb2, list3, list4);
        sb2.append(disclaimerAtom);
        sb2.append(", ageSelectorPlaceholder=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO;", "", "brokenRule", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "showAlertNow", "", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;Lru/ozon/uni/android/flashbar/model/Restriction;Z)V", "getBrokenRule", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "getShowAlertNow", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "BrokenRuleDTO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AlertDTO {
        public static final int $stable = Restriction.$stable;

        @NotNull
        private final BrokenRuleDTO brokenRule;

        @NotNull
        private final Restriction restriction;
        private final boolean showAlertNow;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;", "", "<init>", "(Ljava/lang/String;I)V", "BROKEN_RULE_INVALID", "BROKEN_RULE_ADULTS_SUM", "BROKEN_RULE_CHILDREN_SUM", "BROKEN_RULE_INFANT_SUM", "BROKEN_RULE_TOURISTS_SUM", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BrokenRuleDTO {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ BrokenRuleDTO[] $VALUES;

            @i(name = "BROKEN_RULE_INVALID")
            public static final BrokenRuleDTO BROKEN_RULE_INVALID = new BrokenRuleDTO("BROKEN_RULE_INVALID", 0);

            @i(name = "BROKEN_RULE_ADULTS_SUM")
            public static final BrokenRuleDTO BROKEN_RULE_ADULTS_SUM = new BrokenRuleDTO("BROKEN_RULE_ADULTS_SUM", 1);

            @i(name = "BROKEN_RULE_CHILDREN_SUM")
            public static final BrokenRuleDTO BROKEN_RULE_CHILDREN_SUM = new BrokenRuleDTO("BROKEN_RULE_CHILDREN_SUM", 2);

            @i(name = "BROKEN_RULE_INFANT_SUM")
            public static final BrokenRuleDTO BROKEN_RULE_INFANT_SUM = new BrokenRuleDTO("BROKEN_RULE_INFANT_SUM", 3);

            @i(name = "BROKEN_RULE_TOURISTS_SUM")
            public static final BrokenRuleDTO BROKEN_RULE_TOURISTS_SUM = new BrokenRuleDTO("BROKEN_RULE_TOURISTS_SUM", 4);

            private static final /* synthetic */ BrokenRuleDTO[] $values() {
                return new BrokenRuleDTO[]{BROKEN_RULE_INVALID, BROKEN_RULE_ADULTS_SUM, BROKEN_RULE_CHILDREN_SUM, BROKEN_RULE_INFANT_SUM, BROKEN_RULE_TOURISTS_SUM};
            }

            static {
                BrokenRuleDTO[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private BrokenRuleDTO(String str, int i11) {
            }

            public static BrokenRuleDTO valueOf(String str) {
                return (BrokenRuleDTO) Enum.valueOf(BrokenRuleDTO.class, str);
            }

            public static BrokenRuleDTO[] values() {
                return (BrokenRuleDTO[]) $VALUES.clone();
            }
        }

        public AlertDTO(@NotNull BrokenRuleDTO brokenRule, @NotNull Restriction restriction, boolean z11) {
            Intrinsics.checkNotNullParameter(brokenRule, "brokenRule");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            this.brokenRule = brokenRule;
            this.restriction = restriction;
            this.showAlertNow = z11;
        }

        public static /* synthetic */ AlertDTO copy$default(AlertDTO alertDTO, BrokenRuleDTO brokenRuleDTO, Restriction restriction, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                brokenRuleDTO = alertDTO.brokenRule;
            }
            if ((i11 & 2) != 0) {
                restriction = alertDTO.restriction;
            }
            if ((i11 & 4) != 0) {
                z11 = alertDTO.showAlertNow;
            }
            return alertDTO.copy(brokenRuleDTO, restriction, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BrokenRuleDTO getBrokenRule() {
            return this.brokenRule;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Restriction getRestriction() {
            return this.restriction;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowAlertNow() {
            return this.showAlertNow;
        }

        @NotNull
        public final AlertDTO copy(@NotNull BrokenRuleDTO brokenRule, @NotNull Restriction restriction, boolean showAlertNow) {
            Intrinsics.checkNotNullParameter(brokenRule, "brokenRule");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            return new AlertDTO(brokenRule, restriction, showAlertNow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertDTO)) {
                return false;
            }
            AlertDTO alertDTO = (AlertDTO) other;
            return this.brokenRule == alertDTO.brokenRule && Intrinsics.d(this.restriction, alertDTO.restriction) && this.showAlertNow == alertDTO.showAlertNow;
        }

        @NotNull
        public final BrokenRuleDTO getBrokenRule() {
            return this.brokenRule;
        }

        @NotNull
        public final Restriction getRestriction() {
            return this.restriction;
        }

        public final boolean getShowAlertNow() {
            return this.showAlertNow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showAlertNow) + ((this.restriction.hashCode() + (this.brokenRule.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            BrokenRuleDTO brokenRuleDTO = this.brokenRule;
            Restriction restriction = this.restriction;
            boolean z11 = this.showAlertNow;
            StringBuilder sb2 = new StringBuilder("AlertDTO(brokenRule=");
            sb2.append(brokenRuleDTO);
            sb2.append(", restriction=");
            sb2.append(restriction);
            sb2.append(", showAlertNow=");
            return Pk0.a.a(")", sb2, z11);
        }

        public /* synthetic */ AlertDTO(BrokenRuleDTO brokenRuleDTO, Restriction restriction, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(brokenRuleDTO, restriction, (i11 & 4) != 0 ? false : z11);
        }
    }

    public TouristCountSelectorDTO(List list, int i11, List list2, ButtonV3Atom.LargeButton largeButton, List list3, List list4, DisclaimerAtom disclaimerAtom, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i11, list2, largeButton, list3, (i12 & 32) != 0 ? K.f71697a : list4, disclaimerAtom, str);
    }
}
