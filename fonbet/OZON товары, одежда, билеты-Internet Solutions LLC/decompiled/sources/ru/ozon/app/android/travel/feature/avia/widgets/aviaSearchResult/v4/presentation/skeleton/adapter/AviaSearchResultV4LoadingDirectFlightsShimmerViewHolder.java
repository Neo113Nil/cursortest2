package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.DirectFlightsSkeleton;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.directFlightsShimmer.AviaSearchResultV4DirectFlightsShimmerView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/adapter/AviaSearchResultV4LoadingDirectFlightsShimmerViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "view", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/directFlightsShimmer/AviaSearchResultV4DirectFlightsShimmerView;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/directFlightsShimmer/AviaSearchResultV4DirectFlightsShimmerView;)V", "bind", "", "item", "payloads", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4LoadingDirectFlightsShimmerViewHolder extends BaseViewHolder<AviaSearchResultV4ListItemVO> {

    @NotNull
    private final AviaSearchResultV4DirectFlightsShimmerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV4LoadingDirectFlightsShimmerViewHolder(@NotNull AviaSearchResultV4DirectFlightsShimmerView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaSearchResultV4ListItemVO aviaSearchResultV4ListItemVO, List list) {
        bind2(aviaSearchResultV4ListItemVO, (List<? extends Object>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaSearchResultV4ListItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        DirectFlightsSkeleton directFlightsSkeleton = item instanceof DirectFlightsSkeleton ? (DirectFlightsSkeleton) item : null;
        if (directFlightsSkeleton != null) {
            this.view.bind(directFlightsSkeleton);
        }
    }
}
