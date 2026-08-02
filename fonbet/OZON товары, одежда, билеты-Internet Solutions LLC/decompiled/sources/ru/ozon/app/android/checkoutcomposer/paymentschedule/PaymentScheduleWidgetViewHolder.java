package ru.ozon.app.android.checkoutcomposer.paymentschedule;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.WidgetPaymentScheduleBinding;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.decorations.PaymentTotalAdapterDecoration;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.utils.PaymentScheduleDiffUtil;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/checkout/databinding/WidgetPaymentScheduleBinding;", "binding", "Lru/ozon/app/android/checkout/databinding/WidgetPaymentScheduleBinding;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleAdapter;", "adapter", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleAdapter;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentScheduleWidgetViewHolder extends k<PaymentScheduleVO> {

    @NotNull
    private final PaymentScheduleAdapter adapter;

    @NotNull
    private final WidgetPaymentScheduleBinding binding;

    @NotNull
    private final View containerView;
    private PaymentScheduleVO item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentScheduleWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetPaymentScheduleBinding bind = WidgetPaymentScheduleBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        PaymentScheduleAdapter paymentScheduleAdapter = new PaymentScheduleAdapter(new PaymentScheduleDiffUtil());
        this.adapter = paymentScheduleAdapter;
        bind.paymentsRv.setAdapter(paymentScheduleAdapter);
        bind.paymentsRv.addItemDecoration(new PaymentTotalAdapterDecoration());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PaymentScheduleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        WidgetPaymentScheduleBinding widgetPaymentScheduleBinding = this.binding;
        ConstraintLayout headerCl = widgetPaymentScheduleBinding.headerCl;
        Intrinsics.checkNotNullExpressionValue(headerCl, "headerCl");
        ViewExtKt.showOrGone(headerCl, Boolean.valueOf((item.getIcon() == null && item.getTitle() == null) ? false : true));
        ImageView imageView = widgetPaymentScheduleBinding.iconIv;
        Intrinsics.f(imageView);
        ViewExtKt.showOrGone(imageView, Boolean.valueOf(item.getIcon() != null));
        ImageViewExtKt.load$default(imageView, item.getIcon(), null, null, null, null, false, null, 126, null);
        this.adapter.submitList(C7714v.p0(item.getTotalPrices(), C7714v.q0(item.getPaymentTotal(), item.getPayments())));
        TextView paymentScheduleTitleTv = widgetPaymentScheduleBinding.paymentScheduleTitleTv;
        Intrinsics.checkNotNullExpressionValue(paymentScheduleTitleTv, "paymentScheduleTitleTv");
        TextViewExtKt.setTextOrGone(paymentScheduleTitleTv, item.getTitle());
        TextView subtitleTv = widgetPaymentScheduleBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, item.getSubtitle());
    }
}
