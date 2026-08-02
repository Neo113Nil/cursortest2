package ru.ozon.app.android.pdp.widgets.galleryV4.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v4/GalleryV4Const;", "Lru/ozon/app/android/pdp/utils/DPS;", "", "Landroid/content/Context;", "context", "", "calculateHeight", "(DLandroid/content/Context;)I", "safeGalleryRatio", "(D)D", "safeContainerRatio", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface GalleryV4Utils extends GalleryV4Const, DPS {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static int calculateHeight(@NotNull GalleryV4Utils galleryV4Utils, double d11, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (int) ((context.getResources().getDisplayMetrics().widthPixels - galleryV4Utils.getGalleryPadding()) / safeGalleryRatio(galleryV4Utils, d11));
        }

        public static int calculateWidth(@NotNull GalleryV4Utils galleryV4Utils, double d11, int i11) {
            return (int) (safeContainerRatio(galleryV4Utils, d11) * i11);
        }

        @NotNull
        public static GalleryV4PreCreationConfig createDefaultPreCreationConfig(@NotNull GalleryV4Utils galleryV4Utils, @NotNull Context receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return new GalleryV4PreCreationConfig(galleryV4Utils.calculateHeight(galleryV4Utils.getDefaultGalleryRatio(), receiver), receiver.getResources().getDisplayMetrics().widthPixels, receiver.getResources().getDisplayMetrics().widthPixels - galleryV4Utils.getGalleryPadding(), null, null, null, null, false, false, false, null, null, false, false, false, 32760, null);
        }

        public static double getDefaultGalleryRatio(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getDefaultGalleryRatio(galleryV4Utils);
        }

        public static int getDp10(@NotNull GalleryV4Utils galleryV4Utils) {
            return DPS.DefaultImpls.getDp10(galleryV4Utils);
        }

        public static int getDp14(@NotNull GalleryV4Utils galleryV4Utils) {
            return DPS.DefaultImpls.getDp14(galleryV4Utils);
        }

        public static int getDp36(@NotNull GalleryV4Utils galleryV4Utils) {
            return DPS.DefaultImpls.getDp36(galleryV4Utils);
        }

        public static int getDp4(@NotNull GalleryV4Utils galleryV4Utils) {
            return DPS.DefaultImpls.getDp4(galleryV4Utils);
        }

        public static int getDp56(@NotNull GalleryV4Utils galleryV4Utils) {
            return DPS.DefaultImpls.getDp56(galleryV4Utils);
        }

        public static int getDp8(@NotNull GalleryV4Utils galleryV4Utils) {
            return DPS.DefaultImpls.getDp8(galleryV4Utils);
        }

        public static int getGalleryPadding(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getGalleryPadding(galleryV4Utils);
        }

        public static double getMaxRatio(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getMaxRatio(galleryV4Utils);
        }

        public static double getMaxVerticalStateRatio(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getMaxVerticalStateRatio(galleryV4Utils);
        }

        public static double getMinContainerRatio(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getMinContainerRatio(galleryV4Utils);
        }

        public static double getMinGalleryRatio(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getMinGalleryRatio(galleryV4Utils);
        }

        public static int getPrefetchImageItemCount(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getPrefetchImageItemCount(galleryV4Utils);
        }

        public static float getWavesAmount(@NotNull GalleryV4Utils galleryV4Utils) {
            return GalleryV4Const.DefaultImpls.getWavesAmount(galleryV4Utils);
        }

        public static boolean hasVerticalState(@NotNull GalleryV4Utils galleryV4Utils, double d11) {
            return d11 <= galleryV4Utils.getMaxVerticalStateRatio() && galleryV4Utils.getMinContainerRatio() <= d11;
        }

        private static double safeContainerRatio(GalleryV4Utils galleryV4Utils, double d11) {
            return h.c(d11, galleryV4Utils.getMinContainerRatio(), galleryV4Utils.getMaxRatio());
        }

        private static double safeGalleryRatio(GalleryV4Utils galleryV4Utils, double d11) {
            return h.c(d11, galleryV4Utils.getMinGalleryRatio(), galleryV4Utils.getMaxRatio());
        }

        @NotNull
        public static GalleryV4VO.GalleryIcon toIcon(@NotNull GalleryV4Utils galleryV4Utils, @NotNull Icon receiver, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(context, "context");
            String image = receiver.getImage();
            Integer mapColor = StyleParser.INSTANCE.mapColor(context, receiver.getTintColor());
            return new GalleryV4VO.GalleryIcon(image, mapColor != null ? mapColor.intValue() : UniColors.GRAPHIC_TERTIARY.getResId());
        }

        public static float waveWidth(@NotNull GalleryV4Utils galleryV4Utils, @NotNull Context receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver.getResources().getDisplayMetrics().widthPixels - galleryV4Utils.getGalleryPadding()) / galleryV4Utils.getWavesAmount();
        }
    }

    int calculateHeight(double d11, @NotNull Context context);
}
