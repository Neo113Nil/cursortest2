package ru.ozon.uni.android.cell.selection.checkbox.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxAddonWrapperPresets;", "", "<init>", "()V", "noShape500TopStart500", "Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxAddonWrapperPreset;", "getNoShape500TopStart500", "()Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxAddonWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckboxAddonWrapperPresets {

    @NotNull
    public static final CheckboxAddonWrapperPresets INSTANCE = new CheckboxAddonWrapperPresets();

    @NotNull
    private static final CheckboxAddonWrapperPreset noShape500TopStart500 = new CheckboxAddonWrapperPreset(CheckBoxDTO.CheckBoxSize.SIZE_500, MainAddonWrapperSettings.INSTANCE.getNoShape500TopStart500());

    private CheckboxAddonWrapperPresets() {
    }

    @NotNull
    public final CheckboxAddonWrapperPreset getNoShape500TopStart500() {
        return noShape500TopStart500;
    }
}
