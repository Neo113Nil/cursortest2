package ru.ozon.app.android.travel.molecules.view.travelBadge.v1.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v1.TravelBadgeDTO;
import ru.ozon.app.android.travel.ui.molecules.databinding.ItemTravelBadgeBinding;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelBadge/v1/adapter/BadgeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;", "item", "", "bind", "(Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ItemTravelBadgeBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ItemTravelBadgeBinding;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BadgeViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemTravelBadgeBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        ItemTravelBadgeBinding bind = ItemTravelBadgeBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public final void bind(@NotNull TravelBadgeDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.travelBadgeView.bind(item);
    }
}
