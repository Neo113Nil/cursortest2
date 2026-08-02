package ru.ozon.app.android.pikazon.glide.transformations.factory;

import Rc.b;
import Sc.o;
import T5.g;
import T5.m;
import android.graphics.Bitmap;
import c6.j;
import c6.l;
import c6.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.internal.CropOnCustomColorTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.internal.CropOnWhiteTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.internal.FitHeightCropWidthTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.internal.FitWidthCropHeightTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.internal.GrayScaleTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.internal.WhiteTransformation;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/factory/GlideImageTransformationsFactory;", "Lru/ozon/app/android/pikazon/glide/transformations/factory/ImageTransformationsFactory;", "LT5/m;", "Landroid/graphics/Bitmap;", "<init>", "()V", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners$CornerType;", "LRc/b$b;", "toCorner", "(Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners$CornerType;)LRc/b$b;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformation", "create", "(Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;)LT5/m;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GlideImageTransformationsFactory implements ImageTransformationsFactory<m<Bitmap>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageTransformation.RoundedCorners.CornerType.values().length];
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ImageTransformation.RoundedCorners.CornerType.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final b.EnumC0496b toCorner(ImageTransformation.RoundedCorners.CornerType cornerType) {
        switch (WhenMappings.$EnumSwitchMapping$0[cornerType.ordinal()]) {
            case 1:
                return b.EnumC0496b.ALL;
            case 2:
                return b.EnumC0496b.TOP_LEFT;
            case 3:
                return b.EnumC0496b.TOP_RIGHT;
            case 4:
                return b.EnumC0496b.BOTTOM_LEFT;
            case 5:
                return b.EnumC0496b.BOTTOM_RIGHT;
            case 6:
                return b.EnumC0496b.TOP;
            case 7:
                return b.EnumC0496b.BOTTOM;
            case 8:
                return b.EnumC0496b.LEFT;
            case 9:
                return b.EnumC0496b.RIGHT;
            case 10:
                return b.EnumC0496b.OTHER_TOP_LEFT;
            case 11:
                return b.EnumC0496b.OTHER_TOP_RIGHT;
            case 12:
                return b.EnumC0496b.BOTTOM_LEFT;
            case 13:
                return b.EnumC0496b.BOTTOM_RIGHT;
            default:
                throw new o();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.pikazon.glide.transformations.factory.ImageTransformationsFactory
    @NotNull
    public m<Bitmap> create(@NotNull ImageTransformation transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        if (transformation instanceof ImageTransformation.RoundedCorners) {
            ImageTransformation.RoundedCorners roundedCorners = (ImageTransformation.RoundedCorners) transformation;
            return new b(roundedCorners.getCornerRadius(), toCorner(roundedCorners.getCorner()));
        }
        if (transformation instanceof ImageTransformation.FitWidthCropHeight) {
            return new FitWidthCropHeightTransformation(((ImageTransformation.FitWidthCropHeight) transformation).getCropType());
        }
        if (transformation instanceof ImageTransformation.FitHeightCropWidth) {
            return new FitHeightCropWidthTransformation(((ImageTransformation.FitHeightCropWidth) transformation).getCropType());
        }
        if (transformation instanceof ImageTransformation.Blur) {
            ImageTransformation.Blur blur = (ImageTransformation.Blur) transformation;
            return new BlurTransformation(blur.getRadius(), blur.getSampling());
        }
        if (Intrinsics.d(transformation, ImageTransformation.CropOnWhite.INSTANCE)) {
            return new CropOnWhiteTransformation();
        }
        if (Intrinsics.d(transformation, ImageTransformation.CenterCrop.INSTANCE)) {
            return new j();
        }
        if (Intrinsics.d(transformation, ImageTransformation.CircleCrop.INSTANCE)) {
            return new l();
        }
        if (Intrinsics.d(transformation, ImageTransformation.GreyAndWhite.INSTANCE)) {
            return new g(new GrayScaleTransformation(), new WhiteTransformation());
        }
        if (transformation instanceof ImageTransformation.CropOnColor) {
            return new CropOnCustomColorTransformation(((ImageTransformation.CropOnColor) transformation).getBgColor());
        }
        if (Intrinsics.d(transformation, ImageTransformation.FitCenter.INSTANCE)) {
            return new s();
        }
        throw new o();
    }
}
