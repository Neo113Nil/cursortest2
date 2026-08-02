package ru.ozon.uni.android.cell.icon.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007¨\u0006 "}, d2 = {"Lru/ozon/uni/android/cell/icon/data/IconAddonWrapperPresets;", "", "<init>", "()V", "noShape500TopStart500", "Lru/ozon/uni/android/cell/icon/data/IconAddonWrapperPreset;", "getNoShape500TopStart500", "()Lru/ozon/uni/android/cell/icon/data/IconAddonWrapperPreset;", "noShape400TopStart400", "getNoShape400TopStart400", "shape400TopStart500", "getShape400TopStart500", "shape500TopStart500", "getShape500TopStart500", "shape600CenterStart500", "getShape600CenterStart500", "shape400VerticalStart500", "getShape400VerticalStart500", "shape500VerticalStart500", "getShape500VerticalStart500", "shape600VerticalStart500", "getShape600VerticalStart500", "shape400Center400", "getShape400Center400", "shape500Center500", "getShape500Center500", "shape600Center500", "getShape600Center500", "shape400Center500", "getShape400Center500", "noShape400TopStart", "getNoShape400TopStart", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconAddonWrapperPresets {

    @NotNull
    public static final IconAddonWrapperPresets INSTANCE = new IconAddonWrapperPresets();

    @NotNull
    private static final IconAddonWrapperPreset noShape400TopStart;

    @NotNull
    private static final IconAddonWrapperPreset noShape400TopStart400;

    @NotNull
    private static final IconAddonWrapperPreset noShape500TopStart500;

    @NotNull
    private static final IconAddonWrapperPreset shape400Center400;

    @NotNull
    private static final IconAddonWrapperPreset shape400Center500;

    @NotNull
    private static final IconAddonWrapperPreset shape400TopStart500;

    @NotNull
    private static final IconAddonWrapperPreset shape400VerticalStart500;

    @NotNull
    private static final IconAddonWrapperPreset shape500Center500;

    @NotNull
    private static final IconAddonWrapperPreset shape500TopStart500;

    @NotNull
    private static final IconAddonWrapperPreset shape500VerticalStart500;

    @NotNull
    private static final IconAddonWrapperPreset shape600Center500;

    @NotNull
    private static final IconAddonWrapperPreset shape600CenterStart500;

    @NotNull
    private static final IconAddonWrapperPreset shape600VerticalStart500;

    static {
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
        MainAddonWrapperSettings mainAddonWrapperSettings = MainAddonWrapperSettings.INSTANCE;
        noShape500TopStart500 = new IconAddonWrapperPreset(iconSize, false, mainAddonWrapperSettings.getNoShape500TopStart500(), 2, null);
        IconDTO.IconSize iconSize2 = IconDTO.IconSize.SIZE_400;
        noShape400TopStart400 = new IconAddonWrapperPreset(iconSize2, false, mainAddonWrapperSettings.getNoShape400TopStart400(), 2, null);
        shape400TopStart500 = new IconAddonWrapperPreset(iconSize2, true, mainAddonWrapperSettings.getShape400TopStart500());
        shape500TopStart500 = new IconAddonWrapperPreset(iconSize, true, mainAddonWrapperSettings.getShape500TopStart500());
        IconDTO.IconSize iconSize3 = IconDTO.IconSize.SIZE_600;
        shape600CenterStart500 = new IconAddonWrapperPreset(iconSize3, true, mainAddonWrapperSettings.getShape600CenterStart500());
        shape400VerticalStart500 = new IconAddonWrapperPreset(iconSize2, true, mainAddonWrapperSettings.getShape400VerticalStart500());
        shape500VerticalStart500 = new IconAddonWrapperPreset(iconSize, true, mainAddonWrapperSettings.getShape500VerticalStart500());
        shape600VerticalStart500 = new IconAddonWrapperPreset(iconSize3, true, mainAddonWrapperSettings.getShape600VerticalStart500());
        shape400Center400 = new IconAddonWrapperPreset(iconSize2, true, mainAddonWrapperSettings.getHorizontalStart400());
        shape500Center500 = new IconAddonWrapperPreset(iconSize, true, mainAddonWrapperSettings.getHorizontalStart500());
        shape600Center500 = new IconAddonWrapperPreset(iconSize3, true, mainAddonWrapperSettings.getHorizontalStart600());
        shape400Center500 = new IconAddonWrapperPreset(iconSize2, true, mainAddonWrapperSettings.getShape400Center500());
        noShape400TopStart = new IconAddonWrapperPreset(iconSize2, false, mainAddonWrapperSettings.getNoShape400TopStart());
    }

    private IconAddonWrapperPresets() {
    }

    @NotNull
    public final IconAddonWrapperPreset getNoShape400TopStart() {
        return noShape400TopStart;
    }

    @NotNull
    public final IconAddonWrapperPreset getNoShape400TopStart400() {
        return noShape400TopStart400;
    }

    @NotNull
    public final IconAddonWrapperPreset getNoShape500TopStart500() {
        return noShape500TopStart500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape400Center400() {
        return shape400Center400;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape400Center500() {
        return shape400Center500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape400TopStart500() {
        return shape400TopStart500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape400VerticalStart500() {
        return shape400VerticalStart500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape500Center500() {
        return shape500Center500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape500TopStart500() {
        return shape500TopStart500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape500VerticalStart500() {
        return shape500VerticalStart500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape600Center500() {
        return shape600Center500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape600CenterStart500() {
        return shape600CenterStart500;
    }

    @NotNull
    public final IconAddonWrapperPreset getShape600VerticalStart500() {
        return shape600VerticalStart500;
    }
}
