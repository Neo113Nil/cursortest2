package ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsAnnotationViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "container", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;Lkotlin/jvm/functions/Function1;)V", "boundData", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$AnnotationVO;", "bind", "item", "payloads", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightDetailsAnnotationViewHolder extends BaseViewHolder<AviaDetailsItem> {
    private AviaDetailsItem.AnnotationVO boundData;

    @NotNull
    private final DisclaimerContainer container;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightDetailsAnnotationViewHolder(@NotNull DisclaimerContainer container, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.container = container;
        this.onAction = onAction;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailsItem aviaDetailsItem, List list) {
        bind2(aviaDetailsItem, (List<? extends Object>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailsItem item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if ((item instanceof AviaDetailsItem.AnnotationVO ? (AviaDetailsItem.AnnotationVO) item : null) != null) {
            AviaDetailsItem.AnnotationVO annotationVO = (AviaDetailsItem.AnnotationVO) item;
            DisclaimerHolderKt.bind(this.container, annotationVO.getAnnotation(), this.onAction);
            this.boundData = annotationVO;
        }
    }
}
