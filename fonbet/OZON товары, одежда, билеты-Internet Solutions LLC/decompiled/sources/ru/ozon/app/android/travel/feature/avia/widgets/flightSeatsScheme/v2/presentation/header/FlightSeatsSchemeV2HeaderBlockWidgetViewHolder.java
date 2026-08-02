package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header;

import Sc.o;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.view.FlightSeatsSchemeV2HeaderBlockView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockWidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/view/FlightSeatsSchemeV2HeaderBlockView;", "getContainerView", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/view/FlightSeatsSchemeV2HeaderBlockView;", "containerView", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2HeaderBlockWidgetViewHolder extends AbstractC6067d<FlightSeatsSchemeV2VI> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2HeaderBlockWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
    }

    private final FlightSeatsSchemeV2HeaderBlockView getContainerView() {
        View view = getView();
        if (view instanceof FlightSeatsSchemeV2HeaderBlockView) {
            return (FlightSeatsSchemeV2HeaderBlockView) view;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FlightSeatsSchemeV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FlightSeatsSchemeV2HeaderBlockView containerView = getContainerView();
        if (containerView != null) {
            FlightSeatsSchemeV2VI.State state = item.getState();
            if (state instanceof FlightSeatsSchemeV2VI.State.Loading) {
                if (item.getIsEmptyState()) {
                    containerView.showEmptyState(((FlightSeatsSchemeV2VI.State.Loading) state).getHeaderTitle());
                    return;
                } else {
                    containerView.showShimmerView();
                    return;
                }
            }
            if (!(state instanceof FlightSeatsSchemeV2VI.State.Content)) {
                throw new o();
            }
            if (item.getIsEmptyState()) {
                FlightSeatsSchemeV2HeaderBlockVI headerBlock = ((FlightSeatsSchemeV2VI.State.Content) state).getHeaderBlock();
                containerView.showEmptyState(headerBlock != null ? headerBlock.getTitle() : null);
            } else {
                FlightSeatsSchemeV2HeaderBlockVI headerBlock2 = ((FlightSeatsSchemeV2VI.State.Content) state).getHeaderBlock();
                if (headerBlock2 != null) {
                    containerView.showContent(headerBlock2);
                }
            }
        }
    }
}
