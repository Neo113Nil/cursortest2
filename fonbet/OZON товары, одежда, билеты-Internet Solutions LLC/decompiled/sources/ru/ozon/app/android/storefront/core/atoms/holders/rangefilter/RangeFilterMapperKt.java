package ru.ozon.app.android.storefront.core.atoms.holders.rangefilter;

import Sc.o;
import hd.C6915b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data;", "map", "(Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;)Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data;", "", "rangeDiff", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "extractRangeType", "(Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;F)Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "buildDefaultRangeType", "step", "buildRangeTypeByStep", "(F)Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "rangeType", "buildDefaultStep", "(FLru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;)F", "fromValue", "toValue", "", "shouldIgnoreKeyboard", "Lru/ozon/uni/atoms/af/AtomAction;", "extractAtomAction", "(Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;FFZ)Lru/ozon/uni/atoms/af/AtomAction;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RangeFilterMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RangeFilterView.Data.RangeType.values().length];
            try {
                iArr[RangeFilterView.Data.RangeType.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RangeFilterView.Data.RangeType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final RangeFilterView.Data.RangeType buildDefaultRangeType(RangeFilter rangeFilter, float f7) {
        return (f7 >= 5.0f || rangeFilter.getMinValue() == rangeFilter.getMaxValue()) ? RangeFilterView.Data.RangeType.INTEGER : RangeFilterView.Data.RangeType.DECIMAL;
    }

    private static final float buildDefaultStep(float f7, RangeFilterView.Data.RangeType rangeType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[rangeType.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return -1.0f;
            }
            throw new o();
        }
        Float valueOf = Float.valueOf(f7 / 100.0f);
        if (valueOf.floatValue() < 0.01f) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.01f;
    }

    private static final RangeFilterView.Data.RangeType buildRangeTypeByStep(float f7) {
        return !(((f7 - ((float) C6915b.c(f7))) > 0.0f ? 1 : ((f7 - ((float) C6915b.c(f7))) == 0.0f ? 0 : -1)) == 0) ? RangeFilterView.Data.RangeType.DECIMAL : RangeFilterView.Data.RangeType.INTEGER;
    }

    public static final AtomAction extractAtomAction(@NotNull RangeFilter rangeFilter, float f7, float f11, boolean z11) {
        Intrinsics.checkNotNullParameter(rangeFilter, "<this>");
        if (rangeFilter.getAction() == null) {
            return null;
        }
        AtomActionDTO action = rangeFilter.getAction();
        Map<String, String> params = rangeFilter.getAction().getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        u11.put("fromValue", String.valueOf(f7));
        u11.put("toValue", String.valueOf(f11));
        u11.put("shouldIgnoreKeyboard", String.valueOf(z11));
        Unit unit = Unit.f71690a;
        return AtomActionMapperKt.toAtomAction(AtomActionDTO.copy$default(action, null, null, "onRangeChanged", u11, null, 19, null), rangeFilter.getTrackingInfo());
    }

    private static final RangeFilterView.Data.RangeType extractRangeType(RangeFilter rangeFilter, float f7) {
        RangeFilterView.Data.RangeType buildRangeTypeByStep;
        Float step = rangeFilter.getStep();
        return (step == null || (buildRangeTypeByStep = buildRangeTypeByStep(step.floatValue())) == null) ? buildDefaultRangeType(rangeFilter, f7) : buildRangeTypeByStep;
    }

    @NotNull
    public static final RangeFilterView.Data map(@NotNull RangeFilter rangeFilter) {
        Intrinsics.checkNotNullParameter(rangeFilter, "<this>");
        float abs = Math.abs(rangeFilter.getMaxValue() - rangeFilter.getMinValue());
        RangeFilterView.Data.RangeType extractRangeType = extractRangeType(rangeFilter, abs);
        Float step = rangeFilter.getStep();
        float floatValue = step != null ? step.floatValue() : buildDefaultStep(abs, extractRangeType);
        float minValue = rangeFilter.getMinValue();
        String title = rangeFilter.getTitle();
        float maxValue = rangeFilter.getMaxValue();
        Float fromValue = rangeFilter.getFromValue();
        float floatValue2 = fromValue != null ? fromValue.floatValue() : rangeFilter.getMinValue();
        Float toValue = rangeFilter.getToValue();
        float floatValue3 = toValue != null ? toValue.floatValue() : rangeFilter.getMaxValue();
        String units = rangeFilter.getUnits();
        Boolean hideSlider = rangeFilter.getHideSlider();
        return new RangeFilterView.Data(title, units, minValue, maxValue, floatValue2, floatValue3, extractRangeType, floatValue, hideSlider != null ? hideSlider.booleanValue() : false);
    }
}
