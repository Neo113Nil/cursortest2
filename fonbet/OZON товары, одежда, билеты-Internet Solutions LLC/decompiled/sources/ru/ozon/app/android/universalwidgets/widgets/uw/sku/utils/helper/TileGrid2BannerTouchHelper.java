package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.helper;

import android.graphics.Rect;
import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/helper/TileGrid2BannerTouchHelper;", "", "<init>", "()V", "badgeExpandedRect", "Landroid/graphics/Rect;", "targetBadgeRef", "Ljava/lang/ref/WeakReference;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "dispatchTouchEventToBadges", "", "event", "Landroid/view/MotionEvent;", "badgeView", "extraBadge", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2BannerTouchHelper {

    @NotNull
    private final Rect badgeExpandedRect = new Rect();

    @NotNull
    private WeakReference<BadgeView> targetBadgeRef = new WeakReference<>(null);

    private static final boolean dispatchTouchEventToBadges$dispatchEvent(MotionEvent motionEvent, TileGrid2BannerTouchHelper tileGrid2BannerTouchHelper, MotionEvent motionEvent2, BadgeView badgeView) {
        if (badgeView != null && badgeView.isClickable() && badgeView.getVisibility() == 0 && badgeView.getAnimation() == null) {
            float x11 = motionEvent2.getX();
            float y11 = motionEvent2.getY();
            int actionMasked = motionEvent.getActionMasked();
            BadgeView badgeView2 = tileGrid2BannerTouchHelper.targetBadgeRef.get();
            if (badgeView2 != null && badgeView2.equals(badgeView)) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent2);
                badgeView.dispatchTouchEvent(obtain);
                obtain.recycle();
                if (actionMasked == 1 || actionMasked == 3) {
                    tileGrid2BannerTouchHelper.targetBadgeRef = new WeakReference<>(null);
                }
                return true;
            }
            badgeView.getHitRect(tileGrid2BannerTouchHelper.badgeExpandedRect);
            Rect rect = tileGrid2BannerTouchHelper.badgeExpandedRect;
            TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
            rect.inset(-tileGrid2Constants.getBannerBadgeTouchAreaDX(), -tileGrid2Constants.getBannerBadgeTouchAreaDY());
            if (tileGrid2BannerTouchHelper.badgeExpandedRect.contains((int) x11, (int) y11)) {
                if (actionMasked == 0) {
                    tileGrid2BannerTouchHelper.targetBadgeRef = new WeakReference<>(badgeView);
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent2);
                obtain2.offsetLocation(-badgeView.getLeft(), -badgeView.getTop());
                badgeView.dispatchTouchEvent(obtain2);
                obtain2.recycle();
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchTouchEventToBadges(MotionEvent event, @NotNull BadgeView badgeView, BadgeView extraBadge) {
        Intrinsics.checkNotNullParameter(badgeView, "badgeView");
        if (event == null) {
            return false;
        }
        if (dispatchTouchEventToBadges$dispatchEvent(event, this, event, badgeView)) {
            return true;
        }
        return dispatchTouchEventToBadges$dispatchEvent(event, this, event, extraBadge);
    }
}
