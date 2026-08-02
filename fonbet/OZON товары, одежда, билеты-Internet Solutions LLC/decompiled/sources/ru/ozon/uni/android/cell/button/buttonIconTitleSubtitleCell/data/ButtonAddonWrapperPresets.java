package ru.ozon.uni.android.cell.button.buttonIconTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonAddonWrapperPresets;", "", "<init>", "()V", "button400CenterEnd500", "Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonAddonWrapperPreset;", "getButton400CenterEnd500", "()Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonAddonWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonAddonWrapperPresets {

    @NotNull
    public static final ButtonAddonWrapperPresets INSTANCE = new ButtonAddonWrapperPresets();

    @NotNull
    private static final ButtonAddonWrapperPreset button400CenterEnd500 = new ButtonAddonWrapperPreset(MainAddonWrapperSettings.INSTANCE.getCenterEnd500(), ButtonDTO.Preset.SIZE_400);

    private ButtonAddonWrapperPresets() {
    }

    @NotNull
    public final ButtonAddonWrapperPreset getButton400CenterEnd500() {
        return button400CenterEnd500;
    }
}
