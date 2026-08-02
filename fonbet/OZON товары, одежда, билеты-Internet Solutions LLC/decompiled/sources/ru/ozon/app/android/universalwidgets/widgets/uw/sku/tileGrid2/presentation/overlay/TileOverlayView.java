package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayView;", "", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "roundMode", "", "topOffset", "", "bind", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;Ljava/lang/Integer;)V", "", "visible", "setVisible", "(Z)V", "setVisibleAnimated", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TileOverlayView {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static ViewPropertyAnimator fadeIn(@NotNull TileOverlayView tileOverlayView, @NotNull View receiver, long j11, float f7) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver.getVisibility() == 0) {
                return null;
            }
            receiver.setAlpha(0.0f);
            receiver.setVisibility(0);
            return receiver.animate().alpha(f7).setDuration(j11).setListener(null);
        }

        public static ViewPropertyAnimator fadeOut(@NotNull TileOverlayView tileOverlayView, @NotNull final View receiver, long j11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver.getVisibility() == 0) {
                return receiver.animate().alpha(0.0f).setDuration(j11).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayView$fadeOut$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        receiver.setVisibility(8);
                    }
                });
            }
            return null;
        }
    }

    void bind(TileGrid2DTO.OverlayItem overlayItem, @NotNull RoundMode roundMode, Integer topOffset);

    void setVisible(boolean visible);

    void setVisibleAnimated(boolean visible);
}
