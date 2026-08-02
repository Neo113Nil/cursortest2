package ru.ozon.uni.android.cell.selection.radiobutton.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPresets;", "", "<init>", "()V", "noShape500TopStart500Default500", "Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPreset;", "getNoShape500TopStart500Default500", "()Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RadioTitleSubtitleWrapperPresets {

    @NotNull
    public static final RadioTitleSubtitleWrapperPresets INSTANCE = new RadioTitleSubtitleWrapperPresets();

    @NotNull
    private static final RadioTitleSubtitleWrapperPreset noShape500TopStart500Default500 = new RadioTitleSubtitleWrapperPreset(RadioAddonWrapperPresets.INSTANCE.getNoShape500TopStart500(), TitleSubtitleWrapperPresets.INSTANCE.getContentDefault500());

    private RadioTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final RadioTitleSubtitleWrapperPreset getNoShape500TopStart500Default500() {
        return noShape500TopStart500Default500;
    }
}
