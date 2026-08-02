package ru.ozon.uni.android.cell.button.buttonIconTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPresets;", "", "<init>", "()V", "centerEnd500NoShape500TopStart500Default500", "Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;", "getCenterEnd500NoShape500TopStart500Default500", "()Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;", "centerEnd500Shape400TopStart500Default500", "getCenterEnd500Shape400TopStart500Default500", "centerEnd500Shape500TopStart500Default500", "getCenterEnd500Shape500TopStart500Default500", "centerEnd500Shape600CenterStart500Default500", "getCenterEnd500Shape600CenterStart500Default500", "centerEnd500NoShape500TopStart500Control500", "getCenterEnd500NoShape500TopStart500Control500", "centerEnd500Shape400TopStart500Control500", "getCenterEnd500Shape400TopStart500Control500", "centerEnd500Shape500TopStart500Control500", "getCenterEnd500Shape500TopStart500Control500", "centerEnd500Shape600CenterStart500Control500", "getCenterEnd500Shape600CenterStart500Control500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonIconTitleSubtitleWrapperPresets {

    @NotNull
    public static final ButtonIconTitleSubtitleWrapperPresets INSTANCE = new ButtonIconTitleSubtitleWrapperPresets();

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500NoShape500TopStart500Control500;

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500NoShape500TopStart500Default500;

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500Shape400TopStart500Control500;

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500Shape400TopStart500Default500;

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500Shape500TopStart500Control500;

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500Shape500TopStart500Default500;

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500Shape600CenterStart500Control500;

    @NotNull
    private static final ButtonIconTitleSubtitleWrapperPreset centerEnd500Shape600CenterStart500Default500;

    static {
        IconTitleSubtitleWrapperPresets iconTitleSubtitleWrapperPresets = IconTitleSubtitleWrapperPresets.INSTANCE;
        IconTitleSubtitleWrapperPreset noShape500TopStart500Default500 = iconTitleSubtitleWrapperPresets.getNoShape500TopStart500Default500();
        ButtonAddonWrapperPresets buttonAddonWrapperPresets = ButtonAddonWrapperPresets.INSTANCE;
        centerEnd500NoShape500TopStart500Default500 = new ButtonIconTitleSubtitleWrapperPreset(noShape500TopStart500Default500, buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Shape400TopStart500Default500 = new ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape400TopStart500Default500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Shape500TopStart500Default500 = new ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape400TopStart500Default500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Shape600CenterStart500Default500 = new ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape600CenterStart500Default500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500NoShape500TopStart500Control500 = new ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getNoShape500TopStart500Control500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Shape400TopStart500Control500 = new ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape400TopStart500Control500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Shape500TopStart500Control500 = new ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape500TopStart500Control500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Shape600CenterStart500Control500 = new ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape600CenterStart500Control500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
    }

    private ButtonIconTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500NoShape500TopStart500Control500() {
        return centerEnd500NoShape500TopStart500Control500;
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500NoShape500TopStart500Default500() {
        return centerEnd500NoShape500TopStart500Default500;
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500Shape400TopStart500Control500() {
        return centerEnd500Shape400TopStart500Control500;
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500Shape400TopStart500Default500() {
        return centerEnd500Shape400TopStart500Default500;
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500Shape500TopStart500Control500() {
        return centerEnd500Shape500TopStart500Control500;
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500Shape500TopStart500Default500() {
        return centerEnd500Shape500TopStart500Default500;
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500Shape600CenterStart500Control500() {
        return centerEnd500Shape600CenterStart500Control500;
    }

    @NotNull
    public final ButtonIconTitleSubtitleWrapperPreset getCenterEnd500Shape600CenterStart500Default500() {
        return centerEnd500Shape600CenterStart500Default500;
    }
}
