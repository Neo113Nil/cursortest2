package ru.ozon.uni.android.cell.button.buttonTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPresets;", "", "<init>", "()V", "centerEnd500Default500", "Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPreset;", "getCenterEnd500Default500", "()Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPreset;", "centerEnd500Control500", "getCenterEnd500Control500", "verticalEnd500Default500", "getVerticalEnd500Default500", "verticalEnd500Control500", "getVerticalEnd500Control500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonTitleSubtitleWrapperPresets {

    @NotNull
    public static final ButtonTitleSubtitleWrapperPresets INSTANCE = new ButtonTitleSubtitleWrapperPresets();

    @NotNull
    private static final ButtonTitleSubtitleWrapperPreset centerEnd500Control500;

    @NotNull
    private static final ButtonTitleSubtitleWrapperPreset centerEnd500Default500;

    @NotNull
    private static final ButtonTitleSubtitleWrapperPreset verticalEnd500Control500;

    @NotNull
    private static final ButtonTitleSubtitleWrapperPreset verticalEnd500Default500;

    static {
        TitleSubtitleWrapperPresets titleSubtitleWrapperPresets = TitleSubtitleWrapperPresets.INSTANCE;
        TitleSubtitleWrapperPreset default500 = titleSubtitleWrapperPresets.getDefault500();
        ButtonAddonWrapperPresets buttonAddonWrapperPresets = ButtonAddonWrapperPresets.INSTANCE;
        centerEnd500Default500 = new ButtonTitleSubtitleWrapperPreset(default500, buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Control500 = new ButtonTitleSubtitleWrapperPreset(titleSubtitleWrapperPresets.getControl500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
        verticalEnd500Default500 = new ButtonTitleSubtitleWrapperPreset(titleSubtitleWrapperPresets.getDefault500(), buttonAddonWrapperPresets.getButton400VerticalEnd500());
        verticalEnd500Control500 = new ButtonTitleSubtitleWrapperPreset(titleSubtitleWrapperPresets.getControl500(), buttonAddonWrapperPresets.getButton400VerticalEnd500());
    }

    private ButtonTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final ButtonTitleSubtitleWrapperPreset getCenterEnd500Control500() {
        return centerEnd500Control500;
    }

    @NotNull
    public final ButtonTitleSubtitleWrapperPreset getCenterEnd500Default500() {
        return centerEnd500Default500;
    }

    @NotNull
    public final ButtonTitleSubtitleWrapperPreset getVerticalEnd500Control500() {
        return verticalEnd500Control500;
    }

    @NotNull
    public final ButtonTitleSubtitleWrapperPreset getVerticalEnd500Default500() {
        return verticalEnd500Default500;
    }
}
