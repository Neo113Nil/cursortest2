package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.adapter;

import kotlin.Metadata;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/adapter/ToursFlightBadgesAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "()V", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightBadgesAdapter extends AsyncListDifferDelegationAdapter<Badge> {
    public ToursFlightBadgesAdapter() {
        super(new ToursFlightBadgesItemCallback());
        this.delegatesManager.addDelegate(ToursFlightBadgesAdapterDelegateKt.toursFlightBadgesAdapterDelegate());
    }
}
