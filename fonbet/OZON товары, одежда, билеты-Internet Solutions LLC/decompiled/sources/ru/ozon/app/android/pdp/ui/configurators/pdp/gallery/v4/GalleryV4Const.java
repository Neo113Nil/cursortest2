package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v4/GalleryV4Const;", "", "", "getDefaultGalleryRatio", "()D", "defaultGalleryRatio", "", "getGalleryPadding", "()I", "galleryPadding", "getMinContainerRatio", "minContainerRatio", "getMaxRatio", "maxRatio", "getMinGalleryRatio", "minGalleryRatio", "getMaxVerticalStateRatio", "maxVerticalStateRatio", "", "getWavesAmount", "()F", "wavesAmount", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GalleryV4Const {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static double getDefaultGalleryRatio(@NotNull GalleryV4Const galleryV4Const) {
            return 0.75d;
        }

        public static int getGalleryPadding(@NotNull GalleryV4Const galleryV4Const) {
            int i11;
            i11 = GalleryV4ConstKt.GALLERY_PADDING;
            return i11;
        }

        public static double getMaxRatio(@NotNull GalleryV4Const galleryV4Const) {
            return 1.777d;
        }

        public static double getMaxVerticalStateRatio(@NotNull GalleryV4Const galleryV4Const) {
            return 0.99d;
        }

        public static double getMinContainerRatio(@NotNull GalleryV4Const galleryV4Const) {
            return 0.5625d;
        }

        public static double getMinGalleryRatio(@NotNull GalleryV4Const galleryV4Const) {
            return 0.66d;
        }

        public static int getPrefetchImageItemCount(@NotNull GalleryV4Const galleryV4Const) {
            return 2;
        }

        public static float getWavesAmount(@NotNull GalleryV4Const galleryV4Const) {
            return 9.6f;
        }
    }

    double getDefaultGalleryRatio();

    int getGalleryPadding();

    double getMaxRatio();

    double getMaxVerticalStateRatio();

    double getMinContainerRatio();

    double getMinGalleryRatio();

    float getWavesAmount();
}
