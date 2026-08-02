package ru.ozon.uni.android.cell.selection.radiobutton.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioAddonWrapperPresets;", "", "<init>", "()V", "noShape500TopStart500", "Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioAddonWrapperPreset;", "getNoShape500TopStart500", "()Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioAddonWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RadioAddonWrapperPresets {

    @NotNull
    public static final RadioAddonWrapperPresets INSTANCE = new RadioAddonWrapperPresets();

    @NotNull
    private static final RadioAddonWrapperPreset noShape500TopStart500 = new RadioAddonWrapperPreset(RadioDTO.RadioSize.SIZE_500, MainAddonWrapperSettings.INSTANCE.getNoShape500TopStart500());

    private RadioAddonWrapperPresets() {
    }

    @NotNull
    public final RadioAddonWrapperPreset getNoShape500TopStart500() {
        return noShape500TopStart500;
    }
}
