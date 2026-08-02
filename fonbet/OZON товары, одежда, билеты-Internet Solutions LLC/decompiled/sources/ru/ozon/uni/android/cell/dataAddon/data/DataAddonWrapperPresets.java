package ru.ozon.uni.android.cell.dataAddon.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.SmartLabelPresets;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperPreset;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSettings;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/cell/dataAddon/data/DataAddonWrapperPresets;", "", "<init>", "()V", "data500CenterEnd500", "Lru/ozon/uni/android/cell/dataAddon/data/DataAddonWrapperPreset;", "getData500CenterEnd500", "()Lru/ozon/uni/android/cell/dataAddon/data/DataAddonWrapperPreset;", "data600CenterEnd500", "getData600CenterEnd500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataAddonWrapperPresets {

    @NotNull
    public static final DataAddonWrapperPresets INSTANCE = new DataAddonWrapperPresets();

    @NotNull
    private static final DataAddonWrapperPreset data500CenterEnd500;

    @NotNull
    private static final DataAddonWrapperPreset data600CenterEnd500;

    static {
        BackgroundWrapperPreset backgroundWrapperPreset = BackgroundWrapperPreset.INSTANCE;
        BackgroundWrapperSettings button300$uni_release = backgroundWrapperPreset.getButton300$uni_release();
        SmartLabelPresets smartLabelPresets = SmartLabelPresets.INSTANCE;
        DataPreset dataPreset = new DataPreset(button300$uni_release, smartLabelPresets.getCenterTitle500(), 32);
        MainAddonWrapperSettings mainAddonWrapperSettings = MainAddonWrapperSettings.INSTANCE;
        data500CenterEnd500 = new DataAddonWrapperPreset(dataPreset, mainAddonWrapperSettings.getCenterEnd500());
        data600CenterEnd500 = new DataAddonWrapperPreset(new DataPreset(backgroundWrapperPreset.getButton400$uni_release(), smartLabelPresets.getCenterTitle500(), 40), mainAddonWrapperSettings.getCenterEnd500());
    }

    private DataAddonWrapperPresets() {
    }

    @NotNull
    public final DataAddonWrapperPreset getData500CenterEnd500() {
        return data500CenterEnd500;
    }

    @NotNull
    public final DataAddonWrapperPreset getData600CenterEnd500() {
        return data600CenterEnd500;
    }
}
