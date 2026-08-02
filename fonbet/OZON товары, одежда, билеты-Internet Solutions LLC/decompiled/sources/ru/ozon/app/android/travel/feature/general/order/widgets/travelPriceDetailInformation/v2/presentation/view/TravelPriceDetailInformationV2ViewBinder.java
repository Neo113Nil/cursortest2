package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.adapter.PriceRowAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0012J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2ViewBinder;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2View;Lkotlin/jvm/functions/Function1;Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;", "item", "showBonusTotal", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;)V", "hideBonusTotal", "()V", "showRowUnderTotal", "hideRowUnderTotal", "showTotalRow", "hideTotalRow", "", "payloads", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;Ljava/util/List;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/adapter/PriceRowAdapter;", "adapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/adapter/PriceRowAdapter;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2ViewBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PriceRowAdapter adapter;

    @NotNull
    private final TravelPriceDetailInformationV2View view;

    /* JADX WARN: Multi-variable type inference failed */
    public TravelPriceDetailInformationV2ViewBinder(@NotNull TravelPriceDetailInformationV2View view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull RecyclerView.u viewPool) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        this.view = view;
        this.actionHandler = actionHandler;
        PriceRowAdapter priceRowAdapter = new PriceRowAdapter(actionHandler);
        this.adapter = priceRowAdapter;
        view.getButton().setOnAction(actionHandler);
        view.getPriceRows().setRecycledViewPool(viewPool);
        view.getPriceRows().setAdapter(priceRowAdapter);
    }

    private final void hideBonusTotal() {
        ViewExtKt.gone(this.view.getBonusTotal());
    }

    private final void hideRowUnderTotal() {
        ViewExtKt.gone(this.view.getUnderTotal());
    }

    private final void hideTotalRow() {
        ViewExtKt.gone(this.view.getPriceDetailTotal());
    }

    private final void showBonusTotal(TravelPriceDetailInformationV2VO item) {
        ViewExtKt.show(this.view.getBonusTotal());
        TravelPriceDetailInformationV2VO.BonusPriceRowVO bonusTotal = item.getBonusTotal();
        if (bonusTotal != null) {
            this.view.getBonusTotal().bind(bonusTotal, this.actionHandler);
        }
    }

    private final void showRowUnderTotal(TravelPriceDetailInformationV2VO item) {
        this.view.getUnderTotal().bindOrGone(item.getRowUnderTotal(), this.actionHandler);
    }

    private final void showTotalRow(TravelPriceDetailInformationV2VO item) {
        this.view.getPriceDetailTotal().bindOrGone(item.getTotal(), this.actionHandler);
    }

    public final void bind(@NotNull TravelPriceDetailInformationV2VO item, @NotNull List<?> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        TravelPriceDetailInformationV2View travelPriceDetailInformationV2View = this.view;
        for (Object obj : payloads) {
            if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.TITLE) {
                TextAtomHolderKt.bind$default(travelPriceDetailInformationV2View.getTitle(), item.getTitle(), null, 2, null);
            } else if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.ROWS) {
                this.adapter.submitList(item.getPriceRows());
            } else if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.BUTTON) {
                ContainerExtKt.bindOrGone$default(travelPriceDetailInformationV2View.getButton(), item.getButton(), false, 2, null);
            } else if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.AGREEMENT) {
                TextAtomHolderKt.bindOrGone(travelPriceDetailInformationV2View.getAdditionalInfo(), item.getAgreement(), this.actionHandler);
            } else if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.TOTAL) {
                showTotalRow(item);
            } else if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.ROW_UNDER_TOTAL) {
                showRowUnderTotal(item);
            } else if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.BONUS_TOTAL) {
                showBonusTotal(item);
            } else if (obj == TravelPriceDetailInformationV2ViewMapper.Payload.BONUS_VISIBILITY) {
                if (item.getIsBonusPriceVisible()) {
                    showBonusTotal(item);
                    hideTotalRow();
                    hideRowUnderTotal();
                } else {
                    hideBonusTotal();
                    showTotalRow(item);
                    showRowUnderTotal(item);
                }
            }
        }
    }

    public final void bind(@NotNull TravelPriceDetailInformationV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TravelPriceDetailInformationV2View travelPriceDetailInformationV2View = this.view;
        this.adapter.submitList(item.getPriceRows());
        TextAtomHolderKt.bind$default(travelPriceDetailInformationV2View.getTitle(), item.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(travelPriceDetailInformationV2View.getSubtitle(), item.getSubtitle(), null, 2, null);
        ContainerExtKt.bindOrGone$default(travelPriceDetailInformationV2View.getButton(), item.getButton(), false, 2, null);
        TextAtomHolderKt.bindOrGone(travelPriceDetailInformationV2View.getAdditionalInfo(), item.getAgreement(), this.actionHandler);
        if (item.getIsBonusPriceVisible()) {
            showBonusTotal(item);
            hideTotalRow();
            hideRowUnderTotal();
        } else {
            hideBonusTotal();
            showTotalRow(item);
            showRowUnderTotal(item);
        }
    }
}
