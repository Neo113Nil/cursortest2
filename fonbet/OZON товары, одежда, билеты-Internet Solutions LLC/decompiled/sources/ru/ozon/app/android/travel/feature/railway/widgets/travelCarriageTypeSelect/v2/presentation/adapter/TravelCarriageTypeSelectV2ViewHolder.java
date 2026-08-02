package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.TravelCarriageTypeSelectV2VO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.view.TravelCarriageTypeSelectV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/adapter/TravelCarriageTypeSelectV2ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/view/TravelCarriageTypeSelectV2View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/view/TravelCarriageTypeSelectV2View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO$CarriageTypeVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO$CarriageTypeVO;)V", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "bindAspect", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/view/TravelCarriageTypeSelectV2View;", "Lkotlin/jvm/functions/Function1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageTypeSelectV2ViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelCarriageTypeSelectV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelCarriageTypeSelectV2ViewHolder(@NotNull TravelCarriageTypeSelectV2View view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.actionHandler = actionHandler;
    }

    public final void bind(@NotNull TravelCarriageTypeSelectV2VO.CarriageTypeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, this.actionHandler);
    }

    public final void bindAspect(@NotNull AspectDTO aspect) {
        Intrinsics.checkNotNullParameter(aspect, "aspect");
        this.view.bindAspect(aspect, this.actionHandler);
    }
}
