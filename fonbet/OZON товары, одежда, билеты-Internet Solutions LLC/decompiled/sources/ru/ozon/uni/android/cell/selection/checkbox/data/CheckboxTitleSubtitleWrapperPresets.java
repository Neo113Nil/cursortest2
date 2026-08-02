package ru.ozon.uni.android.cell.selection.checkbox.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxTitleSubtitleWrapperPresets;", "", "<init>", "()V", "noShape500TopStart500Default500", "Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxTitleSubtitleWrapperPreset;", "getNoShape500TopStart500Default500", "()Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxTitleSubtitleWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckboxTitleSubtitleWrapperPresets {

    @NotNull
    public static final CheckboxTitleSubtitleWrapperPresets INSTANCE = new CheckboxTitleSubtitleWrapperPresets();

    @NotNull
    private static final CheckboxTitleSubtitleWrapperPreset noShape500TopStart500Default500 = new CheckboxTitleSubtitleWrapperPreset(CheckboxAddonWrapperPresets.INSTANCE.getNoShape500TopStart500(), TitleSubtitleWrapperPresets.INSTANCE.getContentDefault500());

    private CheckboxTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final CheckboxTitleSubtitleWrapperPreset getNoShape500TopStart500Default500() {
        return noShape500TopStart500Default500;
    }
}
