package ru.ozon.app.android.videocover;

import android.view.View;
import jk0.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/videocover/VideoTileHolder;", "Lru/ozon/app/android/videocover/VideoTile;", "", "isSmooth", "swipeGalleryToFirstImage", "(Z)Z", "Lru/ozon/app/android/videocover/VideoTileItem;", "getVideoItem", "()Lru/ozon/app/android/videocover/VideoTileItem;", "videoItem", "Landroid/view/View;", "getGalleryItemView", "()Landroid/view/View;", "galleryItemView", "", "getWidgetHolderPosition", "()I", "widgetHolderPosition", "getPositionInGallery", "positionInGallery", "Lru/ozon/app/android/composer/ComposerReferences;", "getVideoTileComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "videoTileComposerReferences", "isHorizontalItem", "()Z", "getShouldReplay", "shouldReplay", "Ljk0/l;", "getOverlayPositions", "()Ljk0/l;", "overlayPositions", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface VideoTileHolder extends VideoTile {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getShouldReplay(@NotNull VideoTileHolder videoTileHolder) {
            return false;
        }
    }

    @NotNull
    View getGalleryItemView();

    l getOverlayPositions();

    int getPositionInGallery();

    boolean getShouldReplay();

    VideoTileItem getVideoItem();

    ComposerReferences getVideoTileComposerReferences();

    int getWidgetHolderPosition();

    boolean isHorizontalItem();

    boolean swipeGalleryToFirstImage(boolean isSmooth);
}
