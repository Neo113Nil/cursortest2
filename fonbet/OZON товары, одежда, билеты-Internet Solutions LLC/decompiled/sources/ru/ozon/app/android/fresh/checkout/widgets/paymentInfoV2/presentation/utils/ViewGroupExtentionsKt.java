package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.CachedWidgetSize;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.WidgetSizeCacheRepository;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.WidgetSizeCacheable;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"setWidgetSizeFromCache", "", "Landroid/view/ViewGroup;", "item", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheable;", "widgetSizeCacheRepository", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheRepository;", "defaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewGroupExtentionsKt {
    public static final void setWidgetSizeFromCache(@NotNull final ViewGroup viewGroup, @NotNull final WidgetSizeCacheable item, @NotNull final WidgetSizeCacheRepository widgetSizeCacheRepository, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(widgetSizeCacheRepository, "widgetSizeCacheRepository");
        CachedWidgetSize widgetSize = widgetSizeCacheRepository.getWidgetSize(item);
        Integer valueOf = widgetSize != null ? Integer.valueOf(widgetSize.getHeight()) : null;
        if (valueOf != null && viewGroup.getLayoutParams() != null) {
            viewGroup.getLayoutParams().height = valueOf.intValue();
            return;
        }
        viewGroup.setLayoutParams(layoutParams);
        int i11 = Y.f42258g;
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.utils.ViewGroupExtentionsKt$setWidgetSizeFromCache$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    WidgetSizeCacheRepository.this.cacheWidgetSize(item, new CachedWidgetSize(viewGroup.getWidth(), viewGroup.getHeight()));
                }
            });
        } else {
            widgetSizeCacheRepository.cacheWidgetSize(item, new CachedWidgetSize(viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    public static /* synthetic */ void setWidgetSizeFromCache$default(ViewGroup viewGroup, WidgetSizeCacheable widgetSizeCacheable, WidgetSizeCacheRepository widgetSizeCacheRepository, ViewGroup.LayoutParams layoutParams, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setWidgetSizeFromCache(viewGroup, widgetSizeCacheable, widgetSizeCacheRepository, layoutParams);
    }
}
