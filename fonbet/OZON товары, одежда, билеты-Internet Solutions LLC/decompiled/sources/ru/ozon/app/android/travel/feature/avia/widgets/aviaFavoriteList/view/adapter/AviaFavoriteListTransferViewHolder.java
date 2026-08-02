package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListFlightVI;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/adapter/AviaFavoriteListTransferViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "view", "<init>", "(Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI$TransferVI;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI$TransferVI;)V", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "getAtomsAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListTransferViewHolder extends RecyclerView.C {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final HorizontalAtomsLayout view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaFavoriteListTransferViewHolder(@NotNull HorizontalAtomsLayout view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        view.setAdapter(atomsAdapter);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setDecorator(new AviaFavoriteListTripRouteAtomsDecoration(context));
    }

    public final void bind(@NotNull AviaFavoriteListFlightVI.TripRouteVI.TransferVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getAtoms());
    }
}
