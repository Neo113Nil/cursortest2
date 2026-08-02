package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import U7.d;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.R$plurals;
import ru.ozon.app.android.travel.feature.tours.R$string;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2VO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3Actions;", "<init>", "()V", "", "initialMinValue", "initialMaxValue", "", "onSliderValueChanged", "(II)V", "onSliderFinalValueChanged", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;", "item", "initState", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;)V", "LAe/x0;", "stateFlow", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NightsRangeSelectorV3ViewModel extends w0 implements NightsRangeSelectorV3Actions {

    @NotNull
    private final M0<NightsRangeSelectorV3VO> state;

    @NotNull
    private final x0<NightsRangeSelectorV3VO> stateFlow;

    public NightsRangeSelectorV3ViewModel() {
        x0<NightsRangeSelectorV3VO> a11 = O0.a(null);
        this.stateFlow = a11;
        this.state = C2399j.b(a11);
    }

    @NotNull
    public final M0<NightsRangeSelectorV3VO> getState() {
        return this.state;
    }

    public final void initState(@NotNull NightsRangeSelectorV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.stateFlow.setValue(item);
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.NightsRangeSelectorV3Actions
    public void onSliderFinalValueChanged() {
        LinkedHashMap linkedHashMap;
        NightsRangeSelectorV3VO nightsRangeSelectorV3VO;
        CommonControlSettings commonControlSettings;
        AtomActionDTO atomActionDTO;
        AtomActionDTO action;
        AtomActionDTO action2;
        NightsRangeSelectorV3VO value = this.stateFlow.getValue();
        if (value == null) {
            return;
        }
        int initialMinValue = value.getSliderWithLabels().getInitialMinValue();
        int initialMaxValue = value.getSliderWithLabels().getInitialMaxValue();
        String e11 = d.e(initialMinValue != initialMaxValue ? StringProvider.getString(R$string.nights_range_selector_apply_button_min_prefix, Integer.valueOf(initialMinValue)) : "", StringProvider.getQuantityString(R$plurals.nights_range_selector_nights, initialMaxValue, Integer.valueOf(initialMaxValue)));
        CommonControlSettings common = value.getApplyButton().getCommon();
        Map<String, String> params = (common == null || (action2 = common.getAction()) == null) ? null : action2.getParams();
        if (params == null) {
            params = U.c();
        }
        LinkedHashMap m11 = U.m(params, U.j(new Pair("minNights", String.valueOf(initialMinValue)), new Pair("maxNights", String.valueOf(initialMaxValue))));
        x0<NightsRangeSelectorV3VO> x0Var = this.stateFlow;
        while (true) {
            NightsRangeSelectorV3VO value2 = x0Var.getValue();
            NightsRangeSelectorV3VO nightsRangeSelectorV3VO2 = value2;
            if (nightsRangeSelectorV3VO2 != null) {
                ButtonV3DTO applyButton = nightsRangeSelectorV3VO2.getApplyButton();
                CommonControlSettings common2 = nightsRangeSelectorV3VO2.getApplyButton().getCommon();
                if (common2 != null) {
                    CommonControlSettings common3 = nightsRangeSelectorV3VO2.getApplyButton().getCommon();
                    if (common3 == null || (action = common3.getAction()) == null) {
                        linkedHashMap = m11;
                        atomActionDTO = null;
                    } else {
                        linkedHashMap = m11;
                        atomActionDTO = AtomActionDTO.copy$default(action, null, null, null, m11, null, 23, null);
                    }
                    commonControlSettings = CommonControlSettings.copy$default(common2, atomActionDTO, null, null, 6, null);
                } else {
                    linkedHashMap = m11;
                    commonControlSettings = null;
                }
                nightsRangeSelectorV3VO = NightsRangeSelectorV3VO.copy$default(nightsRangeSelectorV3VO2, 0L, null, null, null, null, ButtonV3DTO.copy$default(applyButton, null, null, null, e11, null, null, null, null, null, null, null, null, null, commonControlSettings, null, null, null, 122871, null), null, 95, null);
            } else {
                linkedHashMap = m11;
                nightsRangeSelectorV3VO = null;
            }
            if (x0Var.b(value2, nightsRangeSelectorV3VO)) {
                return;
            } else {
                m11 = linkedHashMap;
            }
        }
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.NightsRangeSelectorV3Actions
    public void onSliderValueChanged(int initialMinValue, int initialMaxValue) {
        x0<NightsRangeSelectorV3VO> x0Var;
        NightsRangeSelectorV3VO nightsRangeSelectorV3VO;
        String str;
        NightsRangeSelectorV3VO nightsRangeSelectorV3VO2;
        TagButtonDTO copy;
        int i11 = initialMinValue;
        int i12 = initialMaxValue;
        String valueOf = i11 == i12 ? String.valueOf(i11) : StringProvider.getString(R$string.nights_range_selector_tag_button_text, Integer.valueOf(i11), Integer.valueOf(i12));
        x0<NightsRangeSelectorV3VO> x0Var2 = this.stateFlow;
        while (true) {
            NightsRangeSelectorV3VO value = x0Var2.getValue();
            NightsRangeSelectorV3VO nightsRangeSelectorV3VO3 = value;
            if (nightsRangeSelectorV3VO3 != null) {
                x0Var = x0Var2;
                nightsRangeSelectorV3VO = value;
                SliderWithLabelsV2VO copy$default = SliderWithLabelsV2VO.copy$default(nightsRangeSelectorV3VO3.getSliderWithLabels(), null, 0, 0, i11, i12, 0, 0, null, null, null, null, 2023, null);
                String str2 = valueOf;
                copy = r1.copy((r34 & 1) != 0 ? r1.styleType : null, (r34 & 2) != 0 ? r1.size : null, (r34 & 4) != 0 ? r1.isSelected : null, (r34 & 8) != 0 ? r1.isDisabled : null, (r34 & 16) != 0 ? r1.isClosable : null, (r34 & 32) != 0 ? r1.icon : null, (r34 & 64) != 0 ? r1.text : str2, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r1.indicator : null, (r34 & 256) != 0 ? r1.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r1.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r1.common : null, (r34 & 2048) != 0 ? r1.closeControlSettings : null, (r34 & 4096) != 0 ? r1.context : null, (r34 & 8192) != 0 ? r1.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r1.image : null, (r34 & 32768) != 0 ? nightsRangeSelectorV3VO3.getTagButton().round : null);
                str = str2;
                nightsRangeSelectorV3VO2 = NightsRangeSelectorV3VO.copy$default(nightsRangeSelectorV3VO3, 0L, null, null, copy, copy$default, null, null, 103, null);
            } else {
                x0Var = x0Var2;
                nightsRangeSelectorV3VO = value;
                str = valueOf;
                nightsRangeSelectorV3VO2 = null;
            }
            x0<NightsRangeSelectorV3VO> x0Var3 = x0Var;
            if (x0Var3.b(nightsRangeSelectorV3VO, nightsRangeSelectorV3VO2)) {
                return;
            }
            i11 = initialMinValue;
            i12 = initialMaxValue;
            valueOf = str;
            x0Var2 = x0Var3;
        }
    }
}
