package ru.ozon.uni.android.cell.image.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/cell/image/data/ImageAddonWrapperPreset;", "preset", "withImageFixedPreset", "(Lru/ozon/uni/android/atom/image/Image;Lru/ozon/uni/android/cell/image/data/ImageAddonWrapperPreset;)Lru/ozon/uni/android/atom/image/Image;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageFixedExtKt {
    @NotNull
    public static final Image withImageFixedPreset(@NotNull Image image, @NotNull ImageAddonWrapperPreset preset) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        Intrinsics.checkNotNullParameter(preset, "preset");
        image.setFixedMode(true);
        image.m1673setPaddingBzXJzOA(CommonCellSettingsKt.getNone(), preset.getLayoutTopPadding().getCellLayoutPadding(), CommonCellSettingsKt.getNone(), preset.getLayoutBottomPadding().getCellLayoutPadding());
        return image;
    }
}
