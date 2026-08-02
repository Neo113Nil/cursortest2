package cw;

import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di.StickyPromoBadgeDIComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.di.CouponGoalsV2Component$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.adapter.CouponGoalItemsAdapterFactory;
import ru.ozon.app.android.fresh.main.widgets.header.di.HeaderComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;

/* renamed from: cw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5978a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60766a;

    public /* synthetic */ C5978a(int i11) {
        this.f60766a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        CouponGoalItemsAdapterFactory adapterFactory$lambda$0;
        CatalogTabsSharedViewModel catalogTabsSharedViewModel$lambda$0;
        TotalVisibilityViewModel totalVisibilityViewModel;
        switch (this.f60766a) {
            case 0:
                adapterFactory$lambda$0 = CouponGoalsV2Component$Companion$create$1$1.adapterFactory$lambda$0();
                return adapterFactory$lambda$0;
            case 1:
                catalogTabsSharedViewModel$lambda$0 = HeaderComponent$Companion$create$1$1.catalogTabsSharedViewModel$lambda$0();
                return catalogTabsSharedViewModel$lambda$0;
            default:
                totalVisibilityViewModel = StickyPromoBadgeDIComponent$Companion$create$1$1.totalVisibilityViewModelProvider$lambda$0();
                return totalVisibilityViewModel;
        }
    }
}
