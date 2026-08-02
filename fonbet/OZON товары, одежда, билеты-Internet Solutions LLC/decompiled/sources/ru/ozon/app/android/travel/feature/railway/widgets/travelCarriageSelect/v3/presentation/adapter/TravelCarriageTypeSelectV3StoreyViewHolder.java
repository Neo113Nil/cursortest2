package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view.TravelCarriageSelectV3StoreyView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/adapter/TravelCarriageTypeSelectV3StoreyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3StoreyView;", "view", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3StoreyView;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "item", "Lkotlin/Function0;", "", "onStoreyClick", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3StoreyView;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageTypeSelectV3StoreyViewHolder extends RecyclerView.C {

    @NotNull
    private final TravelCarriageSelectV3StoreyView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCarriageTypeSelectV3StoreyViewHolder(@NotNull TravelCarriageSelectV3StoreyView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull TravelCarriageSelectV3VO.StoreyVO item, @NotNull Function0<Unit> onStoreyClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onStoreyClick, "onStoreyClick");
        this.view.bind(item);
        ViewExtKt.setOnClickListenerThrottle$default(this.view, 0L, new TravelCarriageTypeSelectV3StoreyViewHolder$bind$1(onStoreyClick), 1, null);
    }
}
