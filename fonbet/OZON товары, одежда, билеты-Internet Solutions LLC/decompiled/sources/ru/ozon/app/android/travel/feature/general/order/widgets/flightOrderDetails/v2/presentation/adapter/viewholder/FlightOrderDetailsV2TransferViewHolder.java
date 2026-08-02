package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCounterHolderKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCounterView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ+\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/FlightOrderDetailsV2TransferViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$Transfer;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;", "view", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "segment", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindTyped", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$Transfer;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;", "Landroid/graphics/drawable/ShapeDrawable;", "imageBackground$delegate", "LSc/j;", "getImageBackground", "()Landroid/graphics/drawable/ShapeDrawable;", "imageBackground", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2TransferViewHolder extends FlightOrderDetailsV2ViewHolder<FlightOrderDetailsV2VO.Segment.Transfer> {

    /* renamed from: imageBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageBackground;

    @NotNull
    private final CellWithSubtitle24IconCounterView view;

    private FlightOrderDetailsV2TransferViewHolder(CellWithSubtitle24IconCounterView cellWithSubtitle24IconCounterView) {
        super(cellWithSubtitle24IconCounterView);
        this.view = cellWithSubtitle24IconCounterView;
        this.imageBackground = LazyUtilsKt.unsafeLazy(new FlightOrderDetailsV2TransferViewHolder$imageBackground$2(this));
    }

    private final ShapeDrawable getImageBackground() {
        return (ShapeDrawable) this.imageBackground.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder
    public /* bridge */ /* synthetic */ void bindTyped(FlightOrderDetailsV2VO.Segment.Transfer transfer, Function1 function1) {
        bindTyped2(transfer, (Function1<? super AtomAction, Unit>) function1);
    }

    /* renamed from: bindTyped, reason: avoid collision after fix types in other method */
    protected void bindTyped2(@NotNull FlightOrderDetailsV2VO.Segment.Transfer segment, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellWithSubtitle24IconCounterHolderKt.bind(this.view, segment.getTransfer(), actionHandler);
        String transferCellBackgroundColor = segment.getTransferCellBackgroundColor();
        if (transferCellBackgroundColor != null) {
            CellWithSubtitle24IconCounterView cellWithSubtitle24IconCounterView = this.view;
            ShapeDrawable imageBackground = getImageBackground();
            Paint paint = imageBackground.getPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            paint.setColor(styleParser.parseColor(context, transferCellBackgroundColor, R$color.transparent));
            cellWithSubtitle24IconCounterView.setBackground(imageBackground);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FlightOrderDetailsV2TransferViewHolder(@NotNull Context context) {
        this(r1);
        Intrinsics.checkNotNullParameter(context, "context");
        CellWithSubtitle24IconCounterView cellWithSubtitle24IconCounterView = new CellWithSubtitle24IconCounterView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(12, context);
        layoutParams.bottomMargin = ResourceExtKt.toPx(12, context);
        cellWithSubtitle24IconCounterView.setLayoutParams(layoutParams);
    }
}
