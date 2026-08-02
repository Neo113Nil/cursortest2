package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view;

import Nh.a;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewFlightSchemeOrderDetailsBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.orderPrice.FlightSeatsSchemeOrderPriceAdapter;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013J\u001c\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeOrderDetailsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "submitButtonMiddleY", "", "getSubmitButtonMiddleY", "()I", "priceAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/adapter/orderPrice/FlightSeatsSchemeOrderPriceAdapter;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewFlightSchemeOrderDetailsBinding;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "update", "items", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$PriceItem;", "totalPrice", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "PriceAdapterDecoration", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeOrderDetailsView extends ConstraintLayout {

    @NotNull
    private final ViewFlightSchemeOrderDetailsBinding binding;

    @NotNull
    private final FlightSeatsSchemeOrderPriceAdapter priceAdapter;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeOrderDetailsView$PriceAdapterDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "offset", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "getOffset", "()I", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class PriceAdapterDecoration extends RecyclerView.n {
        private final int offset;

        public PriceAdapterDecoration(int i11) {
            this.offset = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            int a11 = a.a(parent, "parent", state, "state", view);
            RecyclerView.g adapter = parent.getAdapter();
            if (adapter == null) {
                return;
            }
            outRect.bottom = a11 == adapter.getShimmersCount() + (-1) ? 0 : this.offset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeOrderDetailsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FlightSeatsSchemeOrderPriceAdapter flightSeatsSchemeOrderPriceAdapter = new FlightSeatsSchemeOrderPriceAdapter();
        this.priceAdapter = flightSeatsSchemeOrderPriceAdapter;
        ViewFlightSchemeOrderDetailsBinding inflate = ViewFlightSchemeOrderDetailsBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        RecyclerView recyclerView = inflate.flightSeatsOrderDetailsRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(flightSeatsSchemeOrderPriceAdapter);
        recyclerView.addItemDecoration(new PriceAdapterDecoration(ResourceExtKt.toPx(8, context)));
    }

    public final void bind(@NotNull FlightSeatsSchemeOrderDetailsVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.priceAdapter.setItems(item.getFlightPrices());
        ViewFlightSchemeOrderDetailsBinding viewFlightSchemeOrderDetailsBinding = this.binding;
        TextAtomView flightSeatsOrderDetailsTitle = viewFlightSchemeOrderDetailsBinding.flightSeatsOrderDetailsTitle;
        Intrinsics.checkNotNullExpressionValue(flightSeatsOrderDetailsTitle, "flightSeatsOrderDetailsTitle");
        TextAtomHolderKt.bind$default(flightSeatsOrderDetailsTitle, item.getHeader(), null, 2, null);
        TextAtomView flightSeatsOrderDetailsPriceTextView = viewFlightSchemeOrderDetailsBinding.flightSeatsOrderDetailsPriceTextView;
        Intrinsics.checkNotNullExpressionValue(flightSeatsOrderDetailsPriceTextView, "flightSeatsOrderDetailsPriceTextView");
        TextAtomHolderKt.bind$default(flightSeatsOrderDetailsPriceTextView, item.getTotalPrice(), null, 2, null);
        TextAtomView flightSeatsOrderDetailsPriceLabelTextView = viewFlightSchemeOrderDetailsBinding.flightSeatsOrderDetailsPriceLabelTextView;
        Intrinsics.checkNotNullExpressionValue(flightSeatsOrderDetailsPriceLabelTextView, "flightSeatsOrderDetailsPriceLabelTextView");
        TextAtomHolderKt.bind$default(flightSeatsOrderDetailsPriceLabelTextView, item.getTotalPriceLabel(), null, 2, null);
        LargeButtonView flightSeatsOrderDetailsSubmitButton = viewFlightSchemeOrderDetailsBinding.flightSeatsOrderDetailsSubmitButton;
        Intrinsics.checkNotNullExpressionValue(flightSeatsOrderDetailsSubmitButton, "flightSeatsOrderDetailsSubmitButton");
        LargeButtonHolderKt.bind(flightSeatsOrderDetailsSubmitButton, item.getSubmitButton(), onAction);
    }

    public final int getSubmitButtonMiddleY() {
        LargeButtonView largeButtonView = this.binding.flightSeatsOrderDetailsSubmitButton;
        return (largeButtonView.getHeight() / 2) + largeButtonView.getTop();
    }

    public final void update(@NotNull List<? extends FlightSeatsSchemeOrderDetailsVO.PriceItem> items, @NotNull TextAtom totalPrice) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        this.priceAdapter.setItems(items);
        TextAtomView flightSeatsOrderDetailsPriceTextView = this.binding.flightSeatsOrderDetailsPriceTextView;
        Intrinsics.checkNotNullExpressionValue(flightSeatsOrderDetailsPriceTextView, "flightSeatsOrderDetailsPriceTextView");
        TextAtomHolderKt.bind$default(flightSeatsOrderDetailsPriceTextView, totalPrice, null, 2, null);
    }
}
