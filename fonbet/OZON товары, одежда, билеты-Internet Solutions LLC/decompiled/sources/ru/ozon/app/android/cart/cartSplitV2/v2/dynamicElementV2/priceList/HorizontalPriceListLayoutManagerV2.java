package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.priceList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/priceList/HorizontalPriceListLayoutManagerV2;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "layoutDecoratedWithMargins", "", "child", "Landroid/view/View;", "left", "", "top", "right", "bottom", "canScrollHorizontally", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HorizontalPriceListLayoutManagerV2 extends LinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalPriceListLayoutManagerV2(@NotNull Context context) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void layoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(child, "child");
        ViewParent parent = child.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            i12 = recyclerView.getMeasuredHeight();
            i11 = recyclerView.getMeasuredWidth();
        } else {
            i11 = 0;
            i12 = 0;
        }
        int measuredHeight = i12 > 0 ? i12 - child.getMeasuredHeight() : 0;
        if (i11 > 0) {
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i11 - left;
            child.setLayoutParams(layoutParams);
        }
        super.layoutDecoratedWithMargins(child, left, top + measuredHeight, right, bottom);
    }
}
