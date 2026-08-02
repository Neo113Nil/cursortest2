package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.adapter;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.HotelsOrderRoomsDetailsVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "layoutModel", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "roundedBackgroundProducer", "", "applyLayoutModel", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "atomView", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsOrderRoomsDetailsItemCellsView extends FrameLayout {

    @NotNull
    private final SingleAtom atomView;

    @NotNull
    private final RoundedBackgroundProducer roundedBackgroundProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsOrderRoomsDetailsItemCellsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.roundedBackgroundProducer = new RoundedBackgroundProducer();
        SingleAtom singleAtom = (SingleAtom) q.f64554a.i(N.b(SingleAtom.class), context);
        singleAtom = singleAtom == null ? new SingleAtom(context, null, 0, 0, 14, null) : singleAtom;
        singleAtom.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(singleAtom);
        this.atomView = singleAtom;
    }

    private final void applyLayoutModel(HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel layoutModel, RoundedBackgroundProducer roundedBackgroundProducer) {
        ShapeDrawable shapeDrawable;
        setPadding(layoutModel.getLeftMargin(), layoutModel.getTopMargin(), layoutModel.getRightMargin(), layoutModel.getBottomMargin());
        HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel.Background blockBackground = layoutModel.getBlockBackground();
        if (blockBackground != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, layoutModel.getBlockBackground().getBackgroundColor());
            shapeDrawable = roundedBackgroundProducer.produce(parseColor != null ? parseColor.intValue() : 0, blockBackground.getTopCornersRadius(), blockBackground.getTopCornersRadius(), blockBackground.getBottomCornersRadius(), blockBackground.getBottomCornersRadius());
        } else {
            shapeDrawable = null;
        }
        this.atomView.setBackground(shapeDrawable);
    }

    public final void bind(@NotNull HotelsOrderRoomsDetailsVO.CellListVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.atomView.setOnAction(onAction);
        ContainerExtKt.bindOrGone$default(this.atomView, item.getAtom(), false, 2, null);
        applyLayoutModel(item.getLayoutModel(), this.roundedBackgroundProducer);
    }
}
