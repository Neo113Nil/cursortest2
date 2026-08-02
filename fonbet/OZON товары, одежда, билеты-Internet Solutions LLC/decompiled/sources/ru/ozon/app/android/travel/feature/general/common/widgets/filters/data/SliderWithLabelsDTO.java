package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

import B0.C2454a;
import Ek.a;
import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO;", "", "isInRangeMode", "", "points", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO$PointDTO;", "min", "", "max", "initialMinValue", "initialMaxValue", "step", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(ZLjava/util/List;IIIIILru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "()Z", "getPoints", "()Ljava/util/List;", "getMin", "()I", "getMax", "getInitialMinValue", "getInitialMaxValue", "getStep", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "PointDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SliderWithLabelsDTO {
    public static final int $stable = 8;
    private final CommonControlSettings common;
    private final int initialMaxValue;
    private final int initialMinValue;
    private final boolean isInRangeMode;
    private final int max;
    private final int min;

    @NotNull
    private final List<PointDTO> points;
    private final int step;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO$PointDTO;", "", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointDTO {
        public static final int $stable = 0;

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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SliderWithLabelsDTO(boolean z11, List list, int i11, int i12, int i13, int i14, int i15, CommonControlSettings commonControlSettings, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, list, i11, i12, (i16 & 16) != 0 ? i11 : i13, (i16 & 32) != 0 ? i12 : i14, (i16 & 64) != 0 ? 1 : i15, commonControlSettings);
        z11 = (i16 & 1) != 0 ? false : z11;
        list = (i16 & 2) != 0 ? K.f71697a : list;
        i11 = (i16 & 4) != 0 ? 0 : i11;
    }

    public static /* synthetic */ SliderWithLabelsDTO copy$default(SliderWithLabelsDTO sliderWithLabelsDTO, boolean z11, List list, int i11, int i12, int i13, int i14, int i15, CommonControlSettings commonControlSettings, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            z11 = sliderWithLabelsDTO.isInRangeMode;
        }
        if ((i16 & 2) != 0) {
            list = sliderWithLabelsDTO.points;
        }
        if ((i16 & 4) != 0) {
            i11 = sliderWithLabelsDTO.min;
        }
        if ((i16 & 8) != 0) {
            i12 = sliderWithLabelsDTO.max;
        }
        if ((i16 & 16) != 0) {
            i13 = sliderWithLabelsDTO.initialMinValue;
        }
        if ((i16 & 32) != 0) {
            i14 = sliderWithLabelsDTO.initialMaxValue;
        }
        if ((i16 & 64) != 0) {
            i15 = sliderWithLabelsDTO.step;
        }
        if ((i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = sliderWithLabelsDTO.common;
        }
        int i17 = i15;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        int i18 = i13;
        int i19 = i14;
        return sliderWithLabelsDTO.copy(z11, list, i11, i12, i18, i19, i17, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsInRangeMode() {
        return this.isInRangeMode;
    }

    @NotNull
    public final List<PointDTO> component2() {
        return this.points;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: component5, reason: from getter */
    public final int getInitialMinValue() {
        return this.initialMinValue;
    }

    /* renamed from: component6, reason: from getter */
    public final int getInitialMaxValue() {
        return this.initialMaxValue;
    }

    /* renamed from: component7, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final SliderWithLabelsDTO copy(boolean isInRangeMode, @NotNull List<PointDTO> points, int min, int max, int initialMinValue, int initialMaxValue, int step, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(points, "points");
        return new SliderWithLabelsDTO(isInRangeMode, points, min, max, initialMinValue, initialMaxValue, step, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderWithLabelsDTO)) {
            return false;
        }
        SliderWithLabelsDTO sliderWithLabelsDTO = (SliderWithLabelsDTO) other;
        return this.isInRangeMode == sliderWithLabelsDTO.isInRangeMode && Intrinsics.d(this.points, sliderWithLabelsDTO.points) && this.min == sliderWithLabelsDTO.min && this.max == sliderWithLabelsDTO.max && this.initialMinValue == sliderWithLabelsDTO.initialMinValue && this.initialMaxValue == sliderWithLabelsDTO.initialMaxValue && this.step == sliderWithLabelsDTO.step && Intrinsics.d(this.common, sliderWithLabelsDTO.common);
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
        int a11 = C2454a.a(this.step, C2454a.a(this.initialMaxValue, C2454a.a(this.initialMinValue, C2454a.a(this.max, C2454a.a(this.min, g.b(Boolean.hashCode(this.isInRangeMode) * 31, 31, this.points), 31), 31), 31), 31), 31);
        CommonControlSettings commonControlSettings = this.common;
        return a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    public final boolean isInRangeMode() {
        return this.isInRangeMode;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isInRangeMode;
        List<PointDTO> list = this.points;
        int i11 = this.min;
        int i12 = this.max;
        int i13 = this.initialMinValue;
        int i14 = this.initialMaxValue;
        int i15 = this.step;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("SliderWithLabelsDTO(isInRangeMode=");
        sb2.append(z11);
        sb2.append(", points=");
        sb2.append(list);
        sb2.append(", min=");
        a.f(i11, i12, ", max=", ", initialMinValue=", sb2);
        a.f(i13, i14, ", initialMaxValue=", ", step=", sb2);
        sb2.append(i15);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(")");
        return sb2.toString();
    }

    public SliderWithLabelsDTO(boolean z11, @NotNull List<PointDTO> points, int i11, int i12, int i13, int i14, int i15, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.isInRangeMode = z11;
        this.points = points;
        this.min = i11;
        this.max = i12;
        this.initialMinValue = i13;
        this.initialMaxValue = i14;
        this.step = i15;
        this.common = commonControlSettings;
    }
}
