package ru.ozon.uni.android.cell.indicator.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPresets;", "", "<init>", "()V", "indicator600CenterEnd500", "Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPreset;", "getIndicator600CenterEnd500", "()Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPreset;", "indicator500CenterEnd400", "getIndicator500CenterEnd400", "marker400CenterEnd500", "getMarker400CenterEnd500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorAddonWrapperPresets {

    @NotNull
    public static final IndicatorAddonWrapperPresets INSTANCE = new IndicatorAddonWrapperPresets();

    @NotNull
    private static final IndicatorAddonWrapperPreset indicator500CenterEnd400;

    @NotNull
    private static final IndicatorAddonWrapperPreset indicator600CenterEnd500;

    @NotNull
    private static final IndicatorAddonWrapperPreset marker400CenterEnd500;

    static {
        IndicatorDTO.IndicatorSize indicatorSize = IndicatorDTO.IndicatorSize.SIZE_600;
        MainAddonWrapperSettings mainAddonWrapperSettings = MainAddonWrapperSettings.INSTANCE;
        indicator600CenterEnd500 = new IndicatorAddonWrapperPreset(indicatorSize, mainAddonWrapperSettings.getCenterEnd500());
        indicator500CenterEnd400 = new IndicatorAddonWrapperPreset(IndicatorDTO.IndicatorSize.SIZE_500, mainAddonWrapperSettings.getCenterEnd400());
        marker400CenterEnd500 = new IndicatorAddonWrapperPreset(IndicatorDTO.IndicatorSize.SIZE_400, mainAddonWrapperSettings.getCenterEnd500());
    }

    private IndicatorAddonWrapperPresets() {
    }

    @NotNull
    public final IndicatorAddonWrapperPreset getIndicator500CenterEnd400() {
        return indicator500CenterEnd400;
    }

    @NotNull
    public final IndicatorAddonWrapperPreset getIndicator600CenterEnd500() {
        return indicator600CenterEnd500;
    }

    @NotNull
    public final IndicatorAddonWrapperPreset getMarker400CenterEnd500() {
        return marker400CenterEnd500;
    }
}
