package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.views;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.common.ext.Dimens;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/views/BadgeTouchHelper;", "", "<init>", "()V", "badgeExpandedRect", "Landroid/graphics/Rect;", "targetBadgeRef", "Ljava/lang/ref/WeakReference;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "dispatchTouchEventToBadge", "", "event", "Landroid/view/MotionEvent;", "badgeView", "badgeTouchAreaRightInset", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeTouchHelper {

    @NotNull
    private final Rect badgeExpandedRect = new Rect();

    @NotNull
    private WeakReference<BadgeView> targetBadgeRef = new WeakReference<>(null);

    private static final boolean dispatchTouchEventToBadge$dispatchEvent(MotionEvent motionEvent, BadgeTouchHelper badgeTouchHelper, int i11, MotionEvent motionEvent2, BadgeView badgeView) {
        if (badgeView == null || !badgeView.isClickable() || badgeView.getVisibility() != 0 || badgeView.getAnimation() != null) {
            return false;
        }
        float x11 = motionEvent2.getX();
        float y11 = motionEvent2.getY();
        int actionMasked = motionEvent.getActionMasked();
        BadgeView badgeView2 = badgeTouchHelper.targetBadgeRef.get();
        if (badgeView2 != null && badgeView2.equals(badgeView)) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent2);
            badgeView.dispatchTouchEvent(obtain);
            obtain.recycle();
            if (actionMasked != 1 && actionMasked != 3) {
                return true;
            }
            badgeTouchHelper.targetBadgeRef = new WeakReference<>(null);
            return true;
        }
        badgeView.getHitRect(badgeTouchHelper.badgeExpandedRect);
        if (Build.VERSION.SDK_INT >= 31) {
            Rect rect = badgeTouchHelper.badgeExpandedRect;
            Dimens dimens = Dimens.INSTANCE;
            rect.inset(-dimens.getDp32(), -dimens.getDp10(), -i11, -dimens.getDp10());
        } else {
            badgeTouchHelper.badgeExpandedRect.inset(-i11, -Dimens.INSTANCE.getDp10());
        }
        if (!badgeTouchHelper.badgeExpandedRect.contains((int) x11, (int) y11)) {
            return false;
        }
        if (actionMasked == 0) {
            badgeTouchHelper.targetBadgeRef = new WeakReference<>(badgeView);
        }
        MotionEvent obtain2 = MotionEvent.obtain(motionEvent2);
        obtain2.offsetLocation(-badgeView.getLeft(), -badgeView.getTop());
        badgeView.dispatchTouchEvent(obtain2);
        obtain2.recycle();
        return true;
    }

    public final boolean dispatchTouchEventToBadge(MotionEvent event, @NotNull BadgeView badgeView, int badgeTouchAreaRightInset) {
        Intrinsics.checkNotNullParameter(badgeView, "badgeView");
        if (event == null) {
            return false;
        }
        return dispatchTouchEventToBadge$dispatchEvent(event, this, badgeTouchAreaRightInset, event, badgeView);
    }
}
