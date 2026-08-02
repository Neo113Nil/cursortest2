package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyBottom;

import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomView;", "getContainerView", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomView;", "containerView", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursMealStickyBottomWidgetViewHolder extends AbstractC6064a<ToursMealStickyBottomVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursMealStickyBottomWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    private final ToursMealStickyBottomView getContainerView() {
        View view = getView();
        if (view instanceof ToursMealStickyBottomView) {
            return (ToursMealStickyBottomView) view;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ToursMealStickyBottomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ToursMealStickyBottomView containerView = getContainerView();
        if (containerView != null) {
            LargeButtonHolderKt.bind(containerView.getSelectButtonLbv(), item.getSelectButton(), this.actionHandler);
            LargeButtonHolderKt.bind(containerView.getReturnButtonLbv(), item.getReturnButton(), this.actionHandler);
        }
    }
}
