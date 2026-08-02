package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.data.AviaFavoriteListFlightMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.data.AviaFavoriteListHeaderMapper;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/di/AviaFavoriteListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "actionHandlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListHeaderMapper;", "flightSeatsLegendTitleMapper$delegate", "LSc/j;", "getFlightSeatsLegendTitleMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListHeaderMapper;", "flightSeatsLegendTitleMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListFlightMapper;", "flightSeatsLegendFlightMapper$delegate", "getFlightSeatsLegendFlightMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListFlightMapper;", "flightSeatsLegendFlightMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getProductFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaFavoriteListComponent implements InterfaceC6958a {

    @NotNull
    private final CustomActionHandlersComponentApi actionHandlersApi;

    @NotNull
    private final FavoriteComponentApi favoriteComponentApi;

    /* renamed from: flightSeatsLegendFlightMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j flightSeatsLegendFlightMapper;

    /* renamed from: flightSeatsLegendTitleMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j flightSeatsLegendTitleMapper;

    public AviaFavoriteListComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.actionHandlersApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) storage.getComponent(FavoriteComponentApi.class);
        this.flightSeatsLegendTitleMapper = k.b(AviaFavoriteListComponent$flightSeatsLegendTitleMapper$2.INSTANCE);
        this.flightSeatsLegendFlightMapper = k.b(AviaFavoriteListComponent$flightSeatsLegendFlightMapper$2.INSTANCE);
    }

    @NotNull
    public final d getActionHandlersStoreFactory() {
        return this.actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final AviaFavoriteListFlightMapper getFlightSeatsLegendFlightMapper() {
        return (AviaFavoriteListFlightMapper) this.flightSeatsLegendFlightMapper.getValue();
    }

    @NotNull
    public final AviaFavoriteListHeaderMapper getFlightSeatsLegendTitleMapper() {
        return (AviaFavoriteListHeaderMapper) this.flightSeatsLegendTitleMapper.getValue();
    }

    @NotNull
    public final ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider() {
        return this.favoriteComponentApi.getFavoriteProductDelegate();
    }
}
