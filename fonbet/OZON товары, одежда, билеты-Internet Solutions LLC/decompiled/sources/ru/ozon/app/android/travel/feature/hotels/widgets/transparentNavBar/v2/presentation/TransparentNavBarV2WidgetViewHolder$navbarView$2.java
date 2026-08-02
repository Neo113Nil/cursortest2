package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view.TransparentNavBarV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/view/TransparentNavBarV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TransparentNavBarV2WidgetViewHolder$navbarView$2 extends AbstractC7737t implements Function0<TransparentNavBarV2View> {
    final /* synthetic */ TransparentNavBarV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavBarV2WidgetViewHolder$navbarView$2(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder) {
        super(0);
        this.this$0 = transparentNavBarV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TransparentNavBarV2View invoke() {
        Context context;
        i iVar;
        HotelFavoritesForAuthorizedFeatureActivator hotelFavoritesForAuthorizedFeatureActivator;
        HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate;
        context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
        TransparentNavBarV2View transparentNavBarV2View = new TransparentNavBarV2View(context);
        TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder = this.this$0;
        transparentNavBarV2View.setContentDescription("transparentNavBarV2");
        transparentNavBarV2View.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        iVar = transparentNavBarV2WidgetViewHolder.container;
        transparentNavBarV2View.setupNestedWidgetManager(iVar);
        hotelFavoritesForAuthorizedFeatureActivator = transparentNavBarV2WidgetViewHolder.favoritesForAuthorizedFeatureActivator;
        hotelFavoriteUnauthorizedClickDelegate = transparentNavBarV2WidgetViewHolder.favoriteUnauthorizedClickDelegate;
        transparentNavBarV2View.setUpDependencies(hotelFavoritesForAuthorizedFeatureActivator, hotelFavoriteUnauthorizedClickDelegate);
        return transparentNavBarV2View;
    }
}
