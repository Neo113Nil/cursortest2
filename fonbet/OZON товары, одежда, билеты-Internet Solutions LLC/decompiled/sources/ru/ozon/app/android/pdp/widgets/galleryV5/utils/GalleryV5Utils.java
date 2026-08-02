package ru.ozon.app.android.pdp.widgets.galleryV5.utils;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u00012\u00020\u0002J%\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v5/GalleryV5Const;", "Lru/ozon/app/android/pdp/utils/DPS;", "", "Landroid/content/Context;", "context", "galleryRatio", "", "calculateHeight", "(Ljava/lang/Double;Landroid/content/Context;D)I", "safeGalleryRatio", "(D)D", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface GalleryV5Utils extends GalleryV5Const, DPS {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static int calculateHeight(@NotNull GalleryV5Utils galleryV5Utils, Double d11, @NotNull Context context, double d12) {
            Intrinsics.checkNotNullParameter(context, "context");
            Double safeGalleryRatio = safeGalleryRatio(galleryV5Utils, d11);
            return (safeGalleryRatio == null ? Double.valueOf(context.getResources().getDisplayMetrics().widthPixels / d12) : safeGalleryRatio.doubleValue() <= 0.75d ? Double.valueOf(context.getResources().getDisplayMetrics().widthPixels / 0.75d) : safeGalleryRatio.doubleValue() < 1.0d ? Double.valueOf(context.getResources().getDisplayMetrics().widthPixels / safeGalleryRatio.doubleValue()) : Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels)).intValue();
        }

        public static int calculateWidth(@NotNull GalleryV5Utils galleryV5Utils, Double d11, @NotNull Context context, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Double safeGalleryRatio = safeGalleryRatio(galleryV5Utils, d11);
            return Math.min(safeGalleryRatio != null ? (int) (safeGalleryRatio.doubleValue() * i11) : context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().widthPixels);
        }

        @NotNull
        public static GradientDrawable createBgRoundItems(@NotNull GalleryV5Utils galleryV5Utils, @NotNull Context receiver, boolean z11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            GradientDrawable gradientDrawable = new GradientDrawable();
            float selectBgTopRadius = z11 ? GalleryV5Const.INSTANCE.getSelectBgTopRadius() : GalleryV5Const.INSTANCE.getDefaultBgTopRadius();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(a.getColor(receiver, R$color.bg_light_key));
            gradientDrawable.setCornerRadii(new float[]{selectBgTopRadius, selectBgTopRadius, selectBgTopRadius, selectBgTopRadius, 0.0f, 0.0f, 0.0f, 0.0f});
            return gradientDrawable;
        }

        @NotNull
        public static GalleryV5PreCreationConfig createDefaultPreCreationConfig(@NotNull GalleryV5Utils galleryV5Utils, @NotNull Context receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return new GalleryV5PreCreationConfig(galleryV5Utils.calculateHeight(Double.valueOf(galleryV5Utils.getDefaultGalleryRatio()), receiver, galleryV5Utils.getDefaultGalleryRatio()), receiver.getResources().getDisplayMetrics().widthPixels, receiver.getResources().getDisplayMetrics().widthPixels, null, null, null, null, false, false, false, null, null, false, false, false, false, false, false, 65528, null);
        }

        public static double getDefaultGalleryRatio(@NotNull GalleryV5Utils galleryV5Utils) {
            return GalleryV5Const.DefaultImpls.getDefaultGalleryRatio(galleryV5Utils);
        }

        public static int getDp10(@NotNull GalleryV5Utils galleryV5Utils) {
            return DPS.DefaultImpls.getDp10(galleryV5Utils);
        }

        public static int getDp12(@NotNull GalleryV5Utils galleryV5Utils) {
            return DPS.DefaultImpls.getDp12(galleryV5Utils);
        }

        public static int getDp14(@NotNull GalleryV5Utils galleryV5Utils) {
            return DPS.DefaultImpls.getDp14(galleryV5Utils);
        }

        public static int getDp36(@NotNull GalleryV5Utils galleryV5Utils) {
            return DPS.DefaultImpls.getDp36(galleryV5Utils);
        }

        public static int getDp56(@NotNull GalleryV5Utils galleryV5Utils) {
            return DPS.DefaultImpls.getDp56(galleryV5Utils);
        }

        public static int getDp8(@NotNull GalleryV5Utils galleryV5Utils) {
            return DPS.DefaultImpls.getDp8(galleryV5Utils);
        }

        public static double getMaxRatio(@NotNull GalleryV5Utils galleryV5Utils) {
            return GalleryV5Const.DefaultImpls.getMaxRatio(galleryV5Utils);
        }

        public static double getMaxVerticalStateRatio(@NotNull GalleryV5Utils galleryV5Utils) {
            return GalleryV5Const.DefaultImpls.getMaxVerticalStateRatio(galleryV5Utils);
        }

        public static double getMinContainerRatio(@NotNull GalleryV5Utils galleryV5Utils) {
            return GalleryV5Const.DefaultImpls.getMinContainerRatio(galleryV5Utils);
        }

        public static double getMinGalleryRatio(@NotNull GalleryV5Utils galleryV5Utils) {
            return GalleryV5Const.DefaultImpls.getMinGalleryRatio(galleryV5Utils);
        }

        public static int getPrefetchImageItemCount(@NotNull GalleryV5Utils galleryV5Utils) {
            return GalleryV5Const.DefaultImpls.getPrefetchImageItemCount(galleryV5Utils);
        }

        public static float getWavesAmount(@NotNull GalleryV5Utils galleryV5Utils) {
            return GalleryV5Const.DefaultImpls.getWavesAmount(galleryV5Utils);
        }

        public static boolean hasVerticalState(@NotNull GalleryV5Utils galleryV5Utils, double d11) {
            return d11 <= galleryV5Utils.getMaxVerticalStateRatio() && galleryV5Utils.getMinContainerRatio() <= d11;
        }

        private static Double safeGalleryRatio(GalleryV5Utils galleryV5Utils, Double d11) {
            if (d11 != null) {
                return Double.valueOf(h.c(d11.doubleValue(), galleryV5Utils.getMinGalleryRatio(), galleryV5Utils.getMaxRatio()));
            }
            return null;
        }

        @NotNull
        public static GalleryV5VO.GalleryIcon toIcon(@NotNull GalleryV5Utils galleryV5Utils, @NotNull Icon receiver, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(context, "context");
            String image = receiver.getImage();
            Integer mapColor = StyleParser.INSTANCE.mapColor(context, receiver.getTintColor());
            return new GalleryV5VO.GalleryIcon(image, mapColor != null ? mapColor.intValue() : UniColors.GRAPHIC_TERTIARY.getResId());
        }

        public static float waveWidth(@NotNull GalleryV5Utils galleryV5Utils, @NotNull Context receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver.getResources().getDisplayMetrics().widthPixels / galleryV5Utils.getWavesAmount();
        }
    }

    int calculateHeight(Double d11, @NotNull Context context, double d12);
}
