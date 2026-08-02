package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import android.graphics.Rect;
import android.view.View;
import jk0.l;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/l;", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "viewRect", "", "getViewVisiblePercentIgnoreBottomContainer", "(Ljk0/l;Landroid/view/View;Landroid/graphics/Rect;)F", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutTotalViewHolderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float getViewVisiblePercentIgnoreBottomContainer(l lVar, View view, Rect rect) {
        if (!view.getGlobalVisibleRect(rect)) {
            return 0.0f;
        }
        int measuredHeight = view.getMeasuredHeight() * view.getMeasuredWidth();
        if (rect.isEmpty()) {
            return 0.0f;
        }
        int i11 = lVar.g().height() > 0 ? lVar.g().bottom : lVar.i().height() > 0 ? lVar.i().bottom : lVar.b().height() > 0 ? lVar.b().bottom : 0;
        Integer c11 = lVar.c();
        return (rect.width() * Math.max(((lVar.f().height() == 0 ? null : c11 == null ? Integer.valueOf(lVar.f().bottom) : Integer.valueOf(Math.min(c11.intValue(), lVar.f().bottom))) != null ? Math.min(r4.intValue(), rect.bottom) : rect.bottom) - Math.max(rect.top, i11), 0)) / measuredHeight;
    }
}
