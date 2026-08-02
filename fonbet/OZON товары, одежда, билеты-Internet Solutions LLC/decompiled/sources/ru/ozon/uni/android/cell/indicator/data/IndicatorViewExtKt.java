package ru.ozon.uni.android.cell.indicator.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"withIndicatorViewPreset", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "preset", "Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPreset;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorViewExtKt {
    @NotNull
    public static final IndicatorView withIndicatorViewPreset(@NotNull IndicatorView indicatorView, @NotNull IndicatorAddonWrapperPreset preset) {
        Intrinsics.checkNotNullParameter(indicatorView, "<this>");
        Intrinsics.checkNotNullParameter(preset, "preset");
        indicatorView.setSize(preset.getIndicatorSize());
        return indicatorView;
    }
}
