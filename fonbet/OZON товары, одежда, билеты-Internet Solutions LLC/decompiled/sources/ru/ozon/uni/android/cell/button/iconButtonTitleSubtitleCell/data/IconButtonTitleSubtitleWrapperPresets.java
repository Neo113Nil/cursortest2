package ru.ozon.uni.android.cell.button.iconButtonTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/IconButtonTitleSubtitleWrapperPresets;", "", "<init>", "()V", "centerEnd500Default500", "Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/IconButtonTitleSubtitleWrapperPreset;", "getCenterEnd500Default500", "()Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/IconButtonTitleSubtitleWrapperPreset;", "centerEnd500Control500", "getCenterEnd500Control500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconButtonTitleSubtitleWrapperPresets {

    @NotNull
    public static final IconButtonTitleSubtitleWrapperPresets INSTANCE = new IconButtonTitleSubtitleWrapperPresets();

    @NotNull
    private static final IconButtonTitleSubtitleWrapperPreset centerEnd500Control500;

    @NotNull
    private static final IconButtonTitleSubtitleWrapperPreset centerEnd500Default500;

    static {
        TitleSubtitleWrapperPresets titleSubtitleWrapperPresets = TitleSubtitleWrapperPresets.INSTANCE;
        TitleSubtitleWrapperPreset default500 = titleSubtitleWrapperPresets.getDefault500();
        ButtonAddonWrapperPresets buttonAddonWrapperPresets = ButtonAddonWrapperPresets.INSTANCE;
        centerEnd500Default500 = new IconButtonTitleSubtitleWrapperPreset(default500, buttonAddonWrapperPresets.getButton400CenterEnd500());
        centerEnd500Control500 = new IconButtonTitleSubtitleWrapperPreset(titleSubtitleWrapperPresets.getControl500(), buttonAddonWrapperPresets.getButton400CenterEnd500());
    }

    private IconButtonTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final IconButtonTitleSubtitleWrapperPreset getCenterEnd500Control500() {
        return centerEnd500Control500;
    }

    @NotNull
    public final IconButtonTitleSubtitleWrapperPreset getCenterEnd500Default500() {
        return centerEnd500Default500;
    }
}
