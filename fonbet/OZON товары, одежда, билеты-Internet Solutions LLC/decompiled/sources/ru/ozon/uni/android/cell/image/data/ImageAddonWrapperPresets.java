package ru.ozon.uni.android.cell.image.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/image/data/ImageAddonWrapperPresets;", "", "<init>", "()V", "ImageFixed500CenterEnd500", "Lru/ozon/uni/android/cell/image/data/ImageAddonWrapperPreset;", "getImageFixed500CenterEnd500", "()Lru/ozon/uni/android/cell/image/data/ImageAddonWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageAddonWrapperPresets {

    @NotNull
    public static final ImageAddonWrapperPresets INSTANCE = new ImageAddonWrapperPresets();

    @NotNull
    private static final ImageAddonWrapperPreset ImageFixed500CenterEnd500;

    static {
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        ImageFixed500CenterEnd500 = new ImageAddonWrapperPreset(layoutPadding, layoutPadding, MainAddonWrapperSettings.INSTANCE.getCenterEnd500());
    }

    private ImageAddonWrapperPresets() {
    }

    @NotNull
    public final ImageAddonWrapperPreset getImageFixed500CenterEnd500() {
        return ImageFixed500CenterEnd500;
    }
}
