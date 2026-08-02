package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation;

import E.RunnableC2901q;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.shared.TravelPaymentV3PaymentsDecorator;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.adapter.TravelPaymentV4CardsAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00130\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Landroidx/recyclerview/widget/RecyclerView;", "paymentMethodsRv", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Landroidx/recyclerview/widget/RecyclerView;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardsAdapter;", "paymentMethodAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardsAdapter;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPaymentV4WidgetViewHolder extends k<TravelPaymentV4VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelPaymentV4CardsAdapter paymentMethodAdapter;

    @NotNull
    private final RecyclerView paymentMethodsRv;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPaymentV4WidgetViewHolder(@NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull RecyclerView paymentMethodsRv, @NotNull l tokenizedAnalytics) {
        super(paymentMethodsRv);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(paymentMethodsRv, "paymentMethodsRv");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.paymentMethodsRv = paymentMethodsRv;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelPaymentV4WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        TravelPaymentV4CardsAdapter travelPaymentV4CardsAdapter = new TravelPaymentV4CardsAdapter(buildHandler, this);
        this.paymentMethodAdapter = travelPaymentV4CardsAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(paymentMethodsRv.getContext(), 0, false);
        linearLayoutManager.setInitialPrefetchItemCount(3);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        paymentMethodsRv.setLayoutManager(linearLayoutManager);
        paymentMethodsRv.setAdapter(travelPaymentV4CardsAdapter);
        paymentMethodsRv.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        Context context = paymentMethodsRv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(4, context);
        Context context2 = paymentMethodsRv.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paymentMethodsRv.addItemDecoration(new TravelPaymentV3PaymentsDecorator(px, UiExtKt.toPx(16, context2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(TravelPaymentV4WidgetViewHolder travelPaymentV4WidgetViewHolder) {
        travelPaymentV4WidgetViewHolder.paymentMethodsRv.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPaymentV4VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.paymentMethodAdapter.submitList(item.getPaymentMethods(), new RunnableC2901q(this, 2));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelPaymentV4VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            m.c(this.tokenizedAnalytics, trackingInfo, null);
        }
    }
}
