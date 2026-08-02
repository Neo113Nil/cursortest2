package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation;

import Ao.b;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.PaymentInfoV2VO;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.PaymentInfoV2WidgetViewHolder;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.dynamicElements.DynamicElementDiffUtilAdapter;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.PaymentDecoration;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.PaymentListAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/WidgetPaymentInfoV2View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/WidgetPaymentInfoV2View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/utils/AppType;)V", "", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment;", "elements", "", "scrollToSelectedPayment", "(Ljava/util/List;)Ljava/lang/Boolean;", "", "lockSize", "()V", "unlockSize", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/WidgetPaymentInfoV2View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/dynamicElements/DynamicElementDiffUtilAdapter;", "dynamicElementsAdapter", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/dynamicElements/DynamicElementDiffUtilAdapter;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/PaymentListAdapter;", "paymentAdapter", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/PaymentListAdapter;", "", "measuredHeight", "I", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentInfoV2WidgetViewHolder extends k<PaymentInfoV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DynamicElementDiffUtilAdapter dynamicElementsAdapter;
    private int measuredHeight;

    @NotNull
    private final PaymentListAdapter paymentAdapter;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final WidgetPaymentInfoV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentInfoV2WidgetViewHolder(@NotNull WidgetPaymentInfoV2View view, @NotNull ComposerReferences ref, @NotNull AppType appType) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.view = view;
        this.ref = ref;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).buildHandler();
        this.actionHandler = buildHandler;
        DynamicElementDiffUtilAdapter dynamicElementDiffUtilAdapter = new DynamicElementDiffUtilAdapter(buildHandler);
        this.dynamicElementsAdapter = dynamicElementDiffUtilAdapter;
        PaymentListAdapter paymentListAdapter = new PaymentListAdapter(buildHandler, appType);
        this.paymentAdapter = paymentListAdapter;
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Ao.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                PaymentInfoV2WidgetViewHolder.lambda$1$lambda$0(PaymentInfoV2WidgetViewHolder.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        view.getPaymentsRv().setAdapter(paymentListAdapter);
        view.getPaymentsRv().setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        RecyclerView paymentsRv = view.getPaymentsRv();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paymentsRv.addItemDecoration(new PaymentDecoration(context));
        view.getDynamicElementsRV().setAdapter(dynamicElementDiffUtilAdapter);
        view.getDynamicElementsRV().setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        view.getDynamicElementsRV().setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3(PaymentInfoV2WidgetViewHolder paymentInfoV2WidgetViewHolder, WidgetPaymentInfoV2View widgetPaymentInfoV2View) {
        paymentInfoV2WidgetViewHolder.unlockSize();
        widgetPaymentInfoV2View.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(PaymentInfoV2WidgetViewHolder paymentInfoV2WidgetViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        paymentInfoV2WidgetViewHolder.measuredHeight = i14 - i12;
    }

    private final void lockSize() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams != null) {
            WidgetPaymentInfoV2View widgetPaymentInfoV2View = this.view;
            layoutParams.height = this.measuredHeight;
            widgetPaymentInfoV2View.setLayoutParams(layoutParams);
        }
    }

    private final Boolean scrollToSelectedPayment(List<PaymentInfoV2VO.Payment> elements) {
        WidgetPaymentInfoV2View widgetPaymentInfoV2View = this.view;
        final RecyclerView.o layoutManager = widgetPaymentInfoV2View.getPaymentsRv().getLayoutManager();
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
            if (((PaymentInfoV2VO.Payment) next).getIsSelected()) {
                obj = next;
                break;
            }
        }
        final int S11 = C7714v.S(obj, elements);
        return Boolean.valueOf(widgetPaymentInfoV2View.getPaymentsRv().post(new Runnable() { // from class: Ao.c
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView.o.this.scrollToPosition(S11);
            }
        }));
    }

    private final void unlockSize() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams != null) {
            WidgetPaymentInfoV2View widgetPaymentInfoV2View = this.view;
            layoutParams.height = -2;
            widgetPaymentInfoV2View.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PaymentInfoV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetPaymentInfoV2View widgetPaymentInfoV2View = this.view;
        lockSize();
        TextAtomHolderKt.bindOrGone(widgetPaymentInfoV2View.getTitleTv(), item.getTitle(), this.actionHandler);
        WrappedButtonHolderKt.bindOrGone(widgetPaymentInfoV2View.getTitleButton(), item.getTitleButton(), this.actionHandler);
        ViewExtKt.showOrGone(widgetPaymentInfoV2View.getPaymentsRv(), item.getPayments() != null ? Boolean.valueOf(!r1.isEmpty()) : null);
        List<PaymentInfoV2VO.Payment> payments = item.getPayments();
        if (payments != null) {
            this.paymentAdapter.submitList(payments);
            scrollToSelectedPayment(payments);
        }
        this.dynamicElementsAdapter.submitItems(item.getElements());
        widgetPaymentInfoV2View.post(new b(0, this, widgetPaymentInfoV2View));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PaymentInfoV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PaymentInfoV2WidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
