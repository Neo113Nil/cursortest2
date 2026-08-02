package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.WidgetSizeCacheRepository;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.FreshPaymentInfoVO;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.dynamicElements.DynamicElementDiffUtilAdapter;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.FreshPaymentDecoration;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.FreshPaymentListAdapter;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.utils.ViewGroupExtentionsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/WidgetFreshPaymentInfoView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheRepository;", "widgetSizeCacheRepository", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/WidgetFreshPaymentInfoView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheRepository;)V", "", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO$Payment;", "elements", "", "scrollToSelectedPayment", "(Ljava/util/List;)Ljava/lang/Boolean;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/WidgetFreshPaymentInfoView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheRepository;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/dynamicElements/DynamicElementDiffUtilAdapter;", "dynamicElementsAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/dynamicElements/DynamicElementDiffUtilAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/FreshPaymentListAdapter;", "paymentAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/FreshPaymentListAdapter;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPaymentInfoWidgetViewHolder extends k<FreshPaymentInfoVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DynamicElementDiffUtilAdapter dynamicElementsAdapter;

    @NotNull
    private final FreshPaymentListAdapter paymentAdapter;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final WidgetFreshPaymentInfoView view;

    @NotNull
    private final WidgetSizeCacheRepository widgetSizeCacheRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshPaymentInfoWidgetViewHolder(@NotNull WidgetFreshPaymentInfoView view, @NotNull ComposerReferences ref, @NotNull WidgetSizeCacheRepository widgetSizeCacheRepository) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(widgetSizeCacheRepository, "widgetSizeCacheRepository");
        this.view = view;
        this.ref = ref;
        this.widgetSizeCacheRepository = widgetSizeCacheRepository;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).buildHandler();
        this.actionHandler = buildHandler;
        DynamicElementDiffUtilAdapter dynamicElementDiffUtilAdapter = new DynamicElementDiffUtilAdapter(buildHandler);
        this.dynamicElementsAdapter = dynamicElementDiffUtilAdapter;
        FreshPaymentListAdapter freshPaymentListAdapter = new FreshPaymentListAdapter(buildHandler);
        this.paymentAdapter = freshPaymentListAdapter;
        view.getPaymentsRv().setAdapter(freshPaymentListAdapter);
        view.getPaymentsRv().setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        RecyclerView paymentsRv = view.getPaymentsRv();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paymentsRv.addItemDecoration(new FreshPaymentDecoration(context));
        view.getDynamicElementsRV().setAdapter(dynamicElementDiffUtilAdapter);
        view.getDynamicElementsRV().setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        view.getDynamicElementsRV().setItemAnimator(null);
    }

    private final Boolean scrollToSelectedPayment(List<FreshPaymentInfoVO.Payment> elements) {
        WidgetFreshPaymentInfoView widgetFreshPaymentInfoView = this.view;
        final RecyclerView.o layoutManager = widgetFreshPaymentInfoView.getPaymentsRv().getLayoutManager();
        Object obj = null;
        if (layoutManager == null) {
            return null;
        }
        Iterator<T> it = elements.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FreshPaymentInfoVO.Payment) next).getIsSelected()) {
                obj = next;
                break;
            }
        }
        final int S11 = C7714v.S(obj, elements);
        return Boolean.valueOf(widgetFreshPaymentInfoView.getPaymentsRv().post(new Runnable() { // from class: ku.a
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView.o.this.scrollToPosition(S11);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FreshPaymentInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetFreshPaymentInfoView widgetFreshPaymentInfoView = this.view;
        ViewGroupExtentionsKt.setWidgetSizeFromCache$default(widgetFreshPaymentInfoView, item, this.widgetSizeCacheRepository, null, 4, null);
        TextAtomHolderKt.bindOrGone(widgetFreshPaymentInfoView.getTitleTv(), item.getTitle(), this.actionHandler);
        WrappedButtonHolderKt.bindOrGone(widgetFreshPaymentInfoView.getTitleButton(), item.getTitleButton(), this.actionHandler);
        ViewExtKt.showOrGone(widgetFreshPaymentInfoView.getPaymentsRv(), item.getPayments() != null ? Boolean.valueOf(!r9.isEmpty()) : null);
        List<FreshPaymentInfoVO.Payment> payments = item.getPayments();
        if (payments != null) {
            this.paymentAdapter.submitList(payments);
            scrollToSelectedPayment(payments);
        }
        this.dynamicElementsAdapter.submitItems(item.getElements());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FreshPaymentInfoVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((FreshPaymentInfoWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
