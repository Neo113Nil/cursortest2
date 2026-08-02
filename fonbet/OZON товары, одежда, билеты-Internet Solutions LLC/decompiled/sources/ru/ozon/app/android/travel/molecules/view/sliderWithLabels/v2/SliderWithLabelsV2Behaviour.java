package ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2ViewGroup;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0017\u0018J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0016\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0016H&¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour;", "", "setMin", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setMax", "setStep", "setMaxRange", "(Ljava/lang/Integer;)Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour;", "setInitialRange", "minValue", "maxValue", "setPoints", "pointsList", "", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "setAutomatizationId", "", "setOnValueChangedListener", "", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour$OnValueChangeListener;", "setOnFinalValueChangedListener", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour$OnFinalValueListener;", "OnValueChangeListener", "OnFinalValueListener", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SliderWithLabelsV2Behaviour {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour$OnFinalValueListener;", "", "finalValueChanged", "", "initialMinValue", "", "initialMaxValue", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnFinalValueListener {
        void finalValueChanged(int initialMinValue, int initialMaxValue);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour$OnValueChangeListener;", "", "valueChanged", "", "initialMinValue", "", "initialMaxValue", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnValueChangeListener {
        void valueChanged(int initialMinValue, int initialMaxValue);
    }

    @NotNull
    SliderWithLabelsV2Behaviour setAutomatizationId(String value);

    @NotNull
    SliderWithLabelsV2Behaviour setInitialRange(int minValue, int maxValue);

    @NotNull
    SliderWithLabelsV2Behaviour setMax(int value);

    @NotNull
    SliderWithLabelsV2Behaviour setMaxRange(Integer value);

    @NotNull
    SliderWithLabelsV2Behaviour setMin(int value);

    void setOnFinalValueChangedListener(@NotNull OnFinalValueListener value);

    void setOnValueChangedListener(@NotNull OnValueChangeListener value);

    @NotNull
    SliderWithLabelsV2Behaviour setPoints(@NotNull List<SliderWithLabelsV2ViewGroup.Label> pointsList);

    @NotNull
    SliderWithLabelsV2Behaviour setStep(int value);
}
