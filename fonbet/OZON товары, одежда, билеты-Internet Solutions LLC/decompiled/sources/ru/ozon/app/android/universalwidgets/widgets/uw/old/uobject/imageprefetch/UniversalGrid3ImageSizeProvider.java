package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.Grid3VO$Grid3ItemVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalGrid3ImageSizeProvider;", "", "<init>", "()V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "screenWidth", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalGrid3ImageSizeProvider {

    @NotNull
    public static final UniversalGrid3ImageSizeProvider INSTANCE = new UniversalGrid3ImageSizeProvider();

    private UniversalGrid3ImageSizeProvider() {
    }

    @NotNull
    public final ImageSize getSize(@NotNull Grid3VO$Grid3ItemVO item, int screenWidth) {
        Intrinsics.checkNotNullParameter(item, "item");
        int paddingLeft = ((screenWidth / 3) - item.getPaddingLeft()) - item.getPaddingRight();
        return new ImageSize(paddingLeft, paddingLeft);
    }
}
