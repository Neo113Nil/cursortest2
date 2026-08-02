package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch;

import Sc.InterfaceC4008j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "imageRatio", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/image/ImageSize;", "calculate", "(FLandroid/content/Context;)Lru/ozon/app/android/pikazon/image/ImageSize;", "Lru/ozon/app/android/network/abtool/FeatureService;", "", "offset", "I", "decreaseBucketRatio$delegate", "LSc/j;", "getDecreaseBucketRatio", "()F", "decreaseBucketRatio", "imageWidth", "imageHeight", "currentImageRatio", "F", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2ImageSizeCalculator {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private float currentImageRatio;

    /* renamed from: decreaseBucketRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j decreaseBucketRatio;

    @NotNull
    private final FeatureService featureService;
    private int imageHeight;
    private int imageWidth;
    private final int offset;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator$Companion;", "", "<init>", "()V", "SIZE_UNDEFINED", "", "RATIO_UNDEFINED", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TileGrid2ImageSizeCalculator(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
        this.offset = TileGrid2Constants.INSTANCE.getContainerHorizontalMargin();
        this.decreaseBucketRatio = LazyUtilsKt.unsafeLazy(new TileGrid2ImageSizeCalculator$decreaseBucketRatio$2(this));
    }

    private final float getDecreaseBucketRatio() {
        return ((Number) this.decreaseBucketRatio.getValue()).floatValue();
    }

    @NotNull
    public final ImageSize calculate(float imageRatio, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.imageWidth == 0) {
            this.imageWidth = (int) (((ResourceExtKt.getDisplaySizePx(context).e().intValue() / 2) - this.offset) * getDecreaseBucketRatio());
        }
        if (this.imageHeight == 0 || imageRatio != this.currentImageRatio) {
            this.imageHeight = (int) (this.imageWidth * imageRatio);
            this.currentImageRatio = imageRatio;
        }
        return new ImageSize(this.imageWidth, this.imageHeight);
    }
}
