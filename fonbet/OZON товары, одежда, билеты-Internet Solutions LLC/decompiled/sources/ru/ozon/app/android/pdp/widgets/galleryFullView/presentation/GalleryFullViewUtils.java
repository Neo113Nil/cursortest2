package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewUtils;", "", "<init>", "()V", "miniatureSizeMin", "", "getMiniatureSizeMin", "()I", "miniatureSizeMax", "getMiniatureSizeMax", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewUtils {

    @NotNull
    public static final GalleryFullViewUtils INSTANCE = new GalleryFullViewUtils();
    private static final int miniatureSizeMin = ResourceExtKt.toPx(64);
    private static final int miniatureSizeMax = ResourceExtKt.toPx(86);

    private GalleryFullViewUtils() {
    }

    public final int getMiniatureSizeMax() {
        return miniatureSizeMax;
    }

    public final int getMiniatureSizeMin() {
        return miniatureSizeMin;
    }
}
