package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4SegmentPartView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp12", "", "flightSegment", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4FlightSegmentView;", "transferCell", "Lru/ozon/uni/android/cell/CellView;", "getTransferCell", "()Lru/ozon/uni/android/cell/CellView;", "transferCell$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "bind", "", "data", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4SegmentPartView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightOrderDetailsV4SegmentPartView.class, "transferCell", "getTransferCell()Lru/ozon/uni/android/cell/CellView;", 0)};
    public static final int $stable = 8;
    private final int dp12;

    @NotNull
    private final FlightOrderDetailsV4FlightSegmentView flightSegment;

    /* renamed from: transferCell$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate transferCell;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV4SegmentPartView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp12 = UiExtKt.toPx(12, context);
        FlightOrderDetailsV4FlightSegmentView flightOrderDetailsV4FlightSegmentView = new FlightOrderDetailsV4FlightSegmentView(context);
        flightOrderDetailsV4FlightSegmentView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.flightSegment = flightOrderDetailsV4FlightSegmentView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.transferCell = new PreCreationViewPoolDelegate(context2, N.b(CellView.class), new FlightOrderDetailsV4SegmentPartView$special$$inlined$preCreationViewPool$default$1(this), new FlightOrderDetailsV4SegmentPartView$special$$inlined$preCreationViewPool$default$2(this));
        addView(flightOrderDetailsV4FlightSegmentView);
        addView(getTransferCell());
        setOrientation(1);
    }

    private final CellView getTransferCell() {
        return (CellView) this.transferCell.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull FlightOrderDetailsV4VO.SegmentPartVO data, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.flightSegment.bind(data.getFlightSegment(), actionHandler);
        CellHolderKt.bindOrGone(getTransferCell(), data.getTransferCell(), actionHandler);
    }
}
