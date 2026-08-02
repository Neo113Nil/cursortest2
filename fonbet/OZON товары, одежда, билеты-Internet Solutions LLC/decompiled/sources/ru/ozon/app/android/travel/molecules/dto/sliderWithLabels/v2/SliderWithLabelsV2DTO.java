package ru.ozon.app.android.travel.molecules.dto.sliderWithLabels.v2;

import B0.C2454a;
import Ek.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BW\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003Ja\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO;", "", "points", "", "Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO$PointDTO;", "min", "", "max", "initialMinValue", "initialMaxValue", "step", "maxRange", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/util/List;IIIIIILru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getPoints", "()Ljava/util/List;", "getMin", "()I", "getMax", "getInitialMinValue", "getInitialMaxValue", "getStep", "getMaxRange", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "PointDTO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SliderWithLabelsV2DTO {
    private final CommonControlSettings common;
    private final int initialMaxValue;
    private final int initialMinValue;
    private final int max;
    private final int maxRange;
    private final int min;

    @NotNull
    private final List<PointDTO> points;
    private final int step;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO$PointDTO;", "", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointDTO {

        @NotNull
        private final TextDTO label;
        private final int value;

        public PointDTO(@NotNull TextDTO label, int i11) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.value = i11;
        }

        public static /* synthetic */ PointDTO copy$default(PointDTO pointDTO, TextDTO textDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textDTO = pointDTO.label;
            }
            if ((i12 & 2) != 0) {
                i11 = pointDTO.value;
            }
            return pointDTO.copy(textDTO, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final PointDTO copy(@NotNull TextDTO label, int value) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new PointDTO(label, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointDTO)) {
                return false;
            }
            PointDTO pointDTO = (PointDTO) other;
            return Intrinsics.d(this.label, pointDTO.label) && this.value == pointDTO.value;
        }

        @NotNull
        public final TextDTO getLabel() {
            return this.label;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value) + (this.label.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PointDTO(label=" + this.label + ", value=" + this.value + ")";
        }
    }

    public SliderWithLabelsV2DTO(@NotNull List<PointDTO> points, int i11, int i12, int i13, int i14, int i15, int i16, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
        this.min = i11;
        this.max = i12;
        this.initialMinValue = i13;
        this.initialMaxValue = i14;
        this.step = i15;
        this.maxRange = i16;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ SliderWithLabelsV2DTO copy$default(SliderWithLabelsV2DTO sliderWithLabelsV2DTO, List list, int i11, int i12, int i13, int i14, int i15, int i16, CommonControlSettings commonControlSettings, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            list = sliderWithLabelsV2DTO.points;
        }
        if ((i17 & 2) != 0) {
            i11 = sliderWithLabelsV2DTO.min;
        }
        if ((i17 & 4) != 0) {
            i12 = sliderWithLabelsV2DTO.max;
        }
        if ((i17 & 8) != 0) {
            i13 = sliderWithLabelsV2DTO.initialMinValue;
        }
        if ((i17 & 16) != 0) {
            i14 = sliderWithLabelsV2DTO.initialMaxValue;
        }
        if ((i17 & 32) != 0) {
            i15 = sliderWithLabelsV2DTO.step;
        }
        if ((i17 & 64) != 0) {
            i16 = sliderWithLabelsV2DTO.maxRange;
        }
        if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = sliderWithLabelsV2DTO.common;
        }
        int i18 = i16;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        int i19 = i14;
        int i21 = i15;
        return sliderWithLabelsV2DTO.copy(list, i11, i12, i13, i19, i21, i18, commonControlSettings2);
    }

    @NotNull
    public final List<PointDTO> component1() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: component4, reason: from getter */
    public final int getInitialMinValue() {
        return this.initialMinValue;
    }

    /* renamed from: component5, reason: from getter */
    public final int getInitialMaxValue() {
        return this.initialMaxValue;
    }

    /* renamed from: component6, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxRange() {
        return this.maxRange;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final SliderWithLabelsV2DTO copy(@NotNull List<PointDTO> points, int min, int max, int initialMinValue, int initialMaxValue, int step, int maxRange, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(points, "points");
        return new SliderWithLabelsV2DTO(points, min, max, initialMinValue, initialMaxValue, step, maxRange, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderWithLabelsV2DTO)) {
            return false;
        }
        SliderWithLabelsV2DTO sliderWithLabelsV2DTO = (SliderWithLabelsV2DTO) other;
        return Intrinsics.d(this.points, sliderWithLabelsV2DTO.points) && this.min == sliderWithLabelsV2DTO.min && this.max == sliderWithLabelsV2DTO.max && this.initialMinValue == sliderWithLabelsV2DTO.initialMinValue && this.initialMaxValue == sliderWithLabelsV2DTO.initialMaxValue && this.step == sliderWithLabelsV2DTO.step && this.maxRange == sliderWithLabelsV2DTO.maxRange && Intrinsics.d(this.common, sliderWithLabelsV2DTO.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final int getInitialMaxValue() {
        return this.initialMaxValue;
    }

    public final int getInitialMinValue() {
        return this.initialMinValue;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMaxRange() {
        return this.maxRange;
    }

    public final int getMin() {
        return this.min;
    }

    @NotNull
    public final List<PointDTO> getPoints() {
        return this.points;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxRange, C2454a.a(this.step, C2454a.a(this.initialMaxValue, C2454a.a(this.initialMinValue, C2454a.a(this.max, C2454a.a(this.min, this.points.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        CommonControlSettings commonControlSettings = this.common;
        return a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    @NotNull
    public String toString() {
        List<PointDTO> list = this.points;
        int i11 = this.min;
        int i12 = this.max;
        int i13 = this.initialMinValue;
        int i14 = this.initialMaxValue;
        int i15 = this.step;
        int i16 = this.maxRange;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("SliderWithLabelsV2DTO(points=");
        sb2.append(list);
        sb2.append(", min=");
        sb2.append(i11);
        sb2.append(", max=");
        a.f(i12, i13, ", initialMinValue=", ", initialMaxValue=", sb2);
        a.f(i14, i15, ", step=", ", maxRange=", sb2);
        sb2.append(i16);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ SliderWithLabelsV2DTO(List list, int i11, int i12, int i13, int i14, int i15, int i16, CommonControlSettings commonControlSettings, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i11, i12, (i17 & 8) != 0 ? i11 : i13, (i17 & 16) != 0 ? i12 : i14, (i17 & 32) != 0 ? 1 : i15, (i17 & 64) != 0 ? 5 : i16, commonControlSettings);
    }
}
