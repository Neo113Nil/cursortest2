package ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.bank.databinding.WidgetInstallmentPaymentScheduleBinding;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.InstallmentPaymentScheduleViewHolder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001!B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentScheduleBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentScheduleBinding;LWZ/l;)V", "", "onDetach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentScheduleBinding;", "LWZ/l;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentsAdapter;", "paymentsAdapter", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentsAdapter;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentsAnimator;", "paymentsAnimator", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentsAnimator;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentPaymentScheduleViewHolder extends k<InstallmentPaymentScheduleVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static int PAYMENT_ITEM_OFFSET = UiExtKt.toPx(8);

    @NotNull
    private final WidgetInstallmentPaymentScheduleBinding binding;

    @NotNull
    private final PaymentsAdapter paymentsAdapter;

    @NotNull
    private final PaymentsAnimator paymentsAnimator;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleViewHolder$Companion;", "", "<init>", "()V", "", "PAYMENT_ITEM_OFFSET", "I", "getPAYMENT_ITEM_OFFSET", "()I", "setPAYMENT_ITEM_OFFSET", "(I)V", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPAYMENT_ITEM_OFFSET() {
            return InstallmentPaymentScheduleViewHolder.PAYMENT_ITEM_OFFSET;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InstallmentPaymentScheduleViewHolder(@NotNull WidgetInstallmentPaymentScheduleBinding binding, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        PaymentsAdapter paymentsAdapter = new PaymentsAdapter(this);
        this.paymentsAdapter = paymentsAdapter;
        RecyclerView paymentsRv = binding.paymentsRv;
        Intrinsics.checkNotNullExpressionValue(paymentsRv, "paymentsRv");
        this.paymentsAnimator = new PaymentsAnimator(paymentsRv);
        RecyclerView recyclerView = binding.paymentsRv;
        recyclerView.setAdapter(paymentsAdapter);
        recyclerView.addItemDecoration(new RecyclerView.n() { // from class: ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.InstallmentPaymentScheduleViewHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.A state) {
                InstallmentPaymentScheduleViewHolder.Companion companion;
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
                if (valueOf.intValue() == 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    companion = InstallmentPaymentScheduleViewHolder.Companion;
                    outRect.left = companion.getPAYMENT_ITEM_OFFSET();
                }
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.InstallmentPaymentScheduleViewHolder$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                PaymentsAnimator paymentsAnimator;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 1) {
                    paymentsAnimator = InstallmentPaymentScheduleViewHolder.this.paymentsAnimator;
                    paymentsAnimator.stop();
                }
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.paymentsAnimator.stop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InstallmentPaymentScheduleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetInstallmentPaymentScheduleBinding widgetInstallmentPaymentScheduleBinding = this.binding;
        TextAtomV2View title = widgetInstallmentPaymentScheduleBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View subtitle = widgetInstallmentPaymentScheduleBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item.getSubtitle(), null, 2, null);
        TextAtomV2View description = widgetInstallmentPaymentScheduleBinding.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        TextHolderKt.bindOrGone$default(description, item.getDescription(), null, 2, null);
        this.paymentsAdapter.submitList(item.getPayments());
        widgetInstallmentPaymentScheduleBinding.paymentsRv.scrollToPosition(0);
        if (item.getShowPaymentsAnimation()) {
            this.paymentsAnimator.start();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InstallmentPaymentScheduleVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
