package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter;

import B0.C2454a;
import B4.V;
import Ek.a;
import Kk.C3532b;
import Pk0.f;
import Tl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJð\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010 R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b.\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b2\u0010 R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b3\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b7\u00106R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b;\u0010:R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b<\u0010:R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b=\u0010:¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "", "minValue", "maxValue", "stepPower", "step", "", "units", "maxValueSign", "fromValue", "toValue", "", "hideSeparator", "shouldUpdateMaxValue", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "minFieldTrackingInfo", "maxFieldTrackingInfo", "minSliderTrackingInfo", "maxSliderTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;IIIILjava/lang/String;Ljava/lang/String;IIZZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;IIIILjava/lang/String;Ljava/lang/String;IIZZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "I", "getMinValue", "getMaxValue", "getStepPower", "getStep", "Ljava/lang/String;", "getUnits", "getMaxValueSign", "getFromValue", "getToValue", "Z", "getHideSeparator", "()Z", "getShouldUpdateMaxValue", "Ljava/util/Map;", "getMinFieldTrackingInfo", "()Ljava/util/Map;", "getMaxFieldTrackingInfo", "getMinSliderTrackingInfo", "getMaxSliderTrackingInfo", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OpenRangeFilterVO {
    private final CommonControlSettings common;
    private final int fromValue;
    private final boolean hideSeparator;
    private final Map<String, TokenizedTrackingInfo> maxFieldTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> maxSliderTrackingInfo;
    private final int maxValue;
    private final String maxValueSign;
    private final Map<String, TokenizedTrackingInfo> minFieldTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> minSliderTrackingInfo;
    private final int minValue;
    private final boolean shouldUpdateMaxValue;
    private final int step;
    private final int stepPower;
    private final TextDTO title;
    private final int toValue;
    private final String units;

    public OpenRangeFilterVO(TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, int i12, int i13, int i14, String str, String str2, int i15, int i16, boolean z11, boolean z12, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4) {
        this.title = textDTO;
        this.common = commonControlSettings;
        this.minValue = i11;
        this.maxValue = i12;
        this.stepPower = i13;
        this.step = i14;
        this.units = str;
        this.maxValueSign = str2;
        this.fromValue = i15;
        this.toValue = i16;
        this.hideSeparator = z11;
        this.shouldUpdateMaxValue = z12;
        this.minFieldTrackingInfo = map;
        this.maxFieldTrackingInfo = map2;
        this.minSliderTrackingInfo = map3;
        this.maxSliderTrackingInfo = map4;
    }

    @NotNull
    public final OpenRangeFilterVO copy(TextDTO title, CommonControlSettings common, int minValue, int maxValue, int stepPower, int step, String units, String maxValueSign, int fromValue, int toValue, boolean hideSeparator, boolean shouldUpdateMaxValue, Map<String, TokenizedTrackingInfo> minFieldTrackingInfo, Map<String, TokenizedTrackingInfo> maxFieldTrackingInfo, Map<String, TokenizedTrackingInfo> minSliderTrackingInfo, Map<String, TokenizedTrackingInfo> maxSliderTrackingInfo) {
        return new OpenRangeFilterVO(title, common, minValue, maxValue, stepPower, step, units, maxValueSign, fromValue, toValue, hideSeparator, shouldUpdateMaxValue, minFieldTrackingInfo, maxFieldTrackingInfo, minSliderTrackingInfo, maxSliderTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenRangeFilterVO)) {
            return false;
        }
        OpenRangeFilterVO openRangeFilterVO = (OpenRangeFilterVO) other;
        return Intrinsics.d(this.title, openRangeFilterVO.title) && Intrinsics.d(this.common, openRangeFilterVO.common) && this.minValue == openRangeFilterVO.minValue && this.maxValue == openRangeFilterVO.maxValue && this.stepPower == openRangeFilterVO.stepPower && this.step == openRangeFilterVO.step && Intrinsics.d(this.units, openRangeFilterVO.units) && Intrinsics.d(this.maxValueSign, openRangeFilterVO.maxValueSign) && this.fromValue == openRangeFilterVO.fromValue && this.toValue == openRangeFilterVO.toValue && this.hideSeparator == openRangeFilterVO.hideSeparator && this.shouldUpdateMaxValue == openRangeFilterVO.shouldUpdateMaxValue && Intrinsics.d(this.minFieldTrackingInfo, openRangeFilterVO.minFieldTrackingInfo) && Intrinsics.d(this.maxFieldTrackingInfo, openRangeFilterVO.maxFieldTrackingInfo) && Intrinsics.d(this.minSliderTrackingInfo, openRangeFilterVO.minSliderTrackingInfo) && Intrinsics.d(this.maxSliderTrackingInfo, openRangeFilterVO.maxSliderTrackingInfo);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final int getFromValue() {
        return this.fromValue;
    }

    public final Map<String, TokenizedTrackingInfo> getMaxFieldTrackingInfo() {
        return this.maxFieldTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getMaxSliderTrackingInfo() {
        return this.maxSliderTrackingInfo;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final String getMaxValueSign() {
        return this.maxValueSign;
    }

    public final Map<String, TokenizedTrackingInfo> getMinFieldTrackingInfo() {
        return this.minFieldTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getMinSliderTrackingInfo() {
        return this.minSliderTrackingInfo;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final boolean getShouldUpdateMaxValue() {
        return this.shouldUpdateMaxValue;
    }

    public final int getStep() {
        return this.step;
    }

    public final int getStepPower() {
        return this.stepPower;
    }

    public final int getToValue() {
        return this.toValue;
    }

    public final String getUnits() {
        return this.units;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int a11 = C2454a.a(this.step, C2454a.a(this.stepPower, C2454a.a(this.maxValue, C2454a.a(this.minValue, (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31), 31), 31), 31);
        String str = this.units;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxValueSign;
        int a12 = C3532b.a(C3532b.a(C2454a.a(this.toValue, C2454a.a(this.fromValue, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.hideSeparator), 31, this.shouldUpdateMaxValue);
        Map<String, TokenizedTrackingInfo> map = this.minFieldTrackingInfo;
        int hashCode3 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.maxFieldTrackingInfo;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.minSliderTrackingInfo;
        int hashCode5 = (hashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map4 = this.maxSliderTrackingInfo;
        return hashCode5 + (map4 != null ? map4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        CommonControlSettings commonControlSettings = this.common;
        int i11 = this.minValue;
        int i12 = this.maxValue;
        int i13 = this.stepPower;
        int i14 = this.step;
        String str = this.units;
        String str2 = this.maxValueSign;
        int i15 = this.fromValue;
        int i16 = this.toValue;
        boolean z11 = this.hideSeparator;
        boolean z12 = this.shouldUpdateMaxValue;
        Map<String, TokenizedTrackingInfo> map = this.minFieldTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.maxFieldTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.minSliderTrackingInfo;
        Map<String, TokenizedTrackingInfo> map4 = this.maxSliderTrackingInfo;
        StringBuilder sb2 = new StringBuilder("OpenRangeFilterVO(title=");
        sb2.append(textDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", minValue=");
        a.f(i11, i12, ", maxValue=", ", stepPower=", sb2);
        a.f(i13, i14, ", step=", ", units=", sb2);
        Nh.a.h(sb2, str, ", maxValueSign=", str2, ", fromValue=");
        a.f(i15, i16, ", toValue=", ", hideSeparator=", sb2);
        f.c(", shouldUpdateMaxValue=", ", minFieldTrackingInfo=", sb2, z11, z12);
        b.g(sb2, map, ", maxFieldTrackingInfo=", map2, ", minSliderTrackingInfo=");
        return V.c(sb2, map3, ", maxSliderTrackingInfo=", map4, ")");
    }

    public /* synthetic */ OpenRangeFilterVO(TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, int i12, int i13, int i14, String str, String str2, int i15, int i16, boolean z11, boolean z12, Map map, Map map2, Map map3, Map map4, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, commonControlSettings, i11, i12, i13, i14, str, str2, i15, i16, z11, (i17 & 2048) != 0 ? false : z12, map, map2, map3, map4);
    }
}
