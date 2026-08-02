package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPoolImpl;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.InfoBadgeViewProvider;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.TripRouteViewProvider;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TripRouteView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPoolImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewPool$2 extends AbstractC7737t implements Function0<AviaSearchResultViewPoolImpl> {
    public static final AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewPool$2 INSTANCE = new AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewPool$2();

    AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewPool$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AviaSearchResultViewPoolImpl invoke() {
        return new AviaSearchResultViewPoolImpl(U.j(new Pair(N.b(TripRouteView.class), new TripRouteViewProvider()), new Pair(N.b(InfoBadgeView.class), new InfoBadgeViewProvider())));
    }
}
