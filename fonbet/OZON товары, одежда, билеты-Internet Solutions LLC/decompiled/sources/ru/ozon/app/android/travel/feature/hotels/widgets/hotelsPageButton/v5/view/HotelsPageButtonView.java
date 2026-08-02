package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.view;

import Bl.b;
import android.content.Context;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5AnimationController;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5Decorator;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5VO;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u001bJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "animationController", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5AnimationController;", "backgroundProducer", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonV5BackgroundProducer;", "shadowElevation", "", "shadowSafeArea", "", "cellView", "Lru/ozon/uni/android/cell/CellView;", "buttonsContainer", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "bind", "", "state", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "isCellVisible", "", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updateVisibility", "isVisible", "updateCellVisibility", "setUpButtonContainer", "setBackground", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonView extends LinearLayout {

    @NotNull
    private final HotelsPageButtonV5AnimationController animationController;

    @NotNull
    private final HotelsPageButtonV5BackgroundProducer backgroundProducer;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final VerticalAtomsLayout buttonsContainer;

    @NotNull
    private final CellView cellView;
    private final float shadowElevation;
    private final int shadowSafeArea;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPageButtonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animationController = new HotelsPageButtonV5AnimationController();
        this.backgroundProducer = new HotelsPageButtonV5BackgroundProducer(context);
        this.shadowElevation = ResourceExtKt.toPxF(4, context);
        this.shadowSafeArea = ResourceExtKt.toPx(6, context);
        CellView cellView = (CellView) b.a(CellView.class, "type", q.f64554a, null);
        cellView = cellView == null ? new CellView(context, null, 0, 0, null, 30, null) : cellView;
        cellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(cellView);
        this.cellView = cellView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(verticalAtomsLayout);
        this.buttonsContainer = verticalAtomsLayout;
        this.buttonsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        setOrientation(1);
        setUpButtonContainer();
    }

    private final void setBackground(HotelsPageButtonV5VO.State state) {
        setBackground(this.backgroundProducer.produce(state));
        if (state.getBackgroundType() instanceof HotelsPageButtonV5VO.BackgroundType.ElevatedBackground) {
            ViewExtensionsKt.safeUpdateMargins$default(this, Integer.valueOf(this.shadowSafeArea), null, null, null, 14, null);
            setElevation(this.shadowElevation);
        } else {
            ViewExtensionsKt.safeUpdateMargins$default(this, 0, null, null, null, 14, null);
            setElevation(0.0f);
        }
    }

    private final void setUpButtonContainer() {
        VerticalAtomsLayout verticalAtomsLayout = this.buttonsContainer;
        verticalAtomsLayout.setAdapter(this.buttonsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        verticalAtomsLayout.setDecorator(new HotelsPageButtonV5Decorator(context, ResourceExtKt.toPx(6, context2)));
    }

    public final void bind(@NotNull HotelsPageButtonV5VO.State state, boolean isCellVisible, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        setBackground(state);
        HotelsPageButtonV5VO.ButtonGroupMargins buttonGroupMargins = state.getButtonGroupMargins();
        VerticalAtomsLayout verticalAtomsLayout = this.buttonsContainer;
        int left = buttonGroupMargins.getLeft();
        ViewExtensionsKt.safeUpdateMargins(verticalAtomsLayout, Integer.valueOf(buttonGroupMargins.getTop()), Integer.valueOf(buttonGroupMargins.getBottom()), Integer.valueOf(left), Integer.valueOf(buttonGroupMargins.getRight()));
        boolean z11 = this.cellView.getVisibility() == 0;
        CellHolderKt.bindOrGone(this.cellView, state.getDsCell(), onAction);
        if (!isCellVisible && !z11) {
            ViewExtKt.gone(this.cellView);
        }
        this.buttonsAdapter.setOnAction(onAction);
        AtomsAdapter atomsAdapter = this.buttonsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, state.getButtons());
    }

    public final void updateCellVisibility(boolean isVisible) {
        this.animationController.updateVisibility(this.cellView, isVisible);
    }

    public final void updateVisibility(boolean isVisible) {
        this.animationController.updateVisibility(this, isVisible);
    }
}
