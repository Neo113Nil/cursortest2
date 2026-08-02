package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v5/GalleryV5Const;", "", "", "getDefaultGalleryRatio", "()D", "defaultGalleryRatio", "getMinContainerRatio", "minContainerRatio", "getMaxRatio", "maxRatio", "getMinGalleryRatio", "minGalleryRatio", "getMaxVerticalStateRatio", "maxVerticalStateRatio", "", "getWavesAmount", "()F", "wavesAmount", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GalleryV5Const {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v5/GalleryV5Const$Companion;", "", "<init>", "()V", "ITEMS_OFFSET", "", "getITEMS_OFFSET", "()I", "defaultBgTopRadius", "", "getDefaultBgTopRadius", "()F", "selectBgTopRadius", "getSelectBgTopRadius", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int ITEMS_OFFSET = Dimens.INSTANCE.getDP_2();
        private static final float defaultBgTopRadius = UiExtKt.toPxF(CornerRadius.RADIUS_550.getPx());
        private static final float selectBgTopRadius = UiExtKt.toPxF(CornerRadius.RADIUS_600.getPx());

        private Companion() {
        }

        public final float getDefaultBgTopRadius() {
            return defaultBgTopRadius;
        }

        public final int getITEMS_OFFSET() {
            return ITEMS_OFFSET;
        }

        public final float getSelectBgTopRadius() {
            return selectBgTopRadius;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static double getDefaultGalleryRatio(@NotNull GalleryV5Const galleryV5Const) {
            return 0.75d;
        }

        public static double getMaxRatio(@NotNull GalleryV5Const galleryV5Const) {
            return 1.777d;
        }

        public static double getMaxVerticalStateRatio(@NotNull GalleryV5Const galleryV5Const) {
            return 0.99d;
        }

        public static double getMinContainerRatio(@NotNull GalleryV5Const galleryV5Const) {
            return 0.5625d;
        }

        public static double getMinGalleryRatio(@NotNull GalleryV5Const galleryV5Const) {
            return 0.5625d;
        }

        public static int getPrefetchImageItemCount(@NotNull GalleryV5Const galleryV5Const) {
            return 2;
        }

        public static float getWavesAmount(@NotNull GalleryV5Const galleryV5Const) {
            return 9.6f;
        }
    }

    double getDefaultGalleryRatio();

    double getMaxRatio();

    double getMaxVerticalStateRatio();

    double getMinContainerRatio();

    double getMinGalleryRatio();

    float getWavesAmount();
}
