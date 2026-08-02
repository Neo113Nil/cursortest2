package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsView;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3DetailsViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "container", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;)V", "bind", "item", "payloads", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3DetailsViewHolder extends BaseViewHolder<AviaDetailedInfoV3ListItemVO> {

    @NotNull
    private final FlightDetailsView container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3DetailsViewHolder(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull FlightDetailsView container) {
        super(container);
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        FlightDetailsView.setupAdapter$default(container, this, onAction, null, null, null, 28, null);
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailedInfoV3ListItemVO aviaDetailedInfoV3ListItemVO, List list) {
        bind2(aviaDetailedInfoV3ListItemVO, (List<? extends Object>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailedInfoV3ListItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if ((item instanceof AviaDetailedInfoV3VO.AviaDetailsContentVO.AviaDetails ? (AviaDetailedInfoV3VO.AviaDetailsContentVO.AviaDetails) item : null) != null) {
            FlightDetailsView.bind$default(this.container, ((AviaDetailedInfoV3VO.AviaDetailsContentVO.AviaDetails) item).getContent(), null, 2, null);
        }
    }
}
