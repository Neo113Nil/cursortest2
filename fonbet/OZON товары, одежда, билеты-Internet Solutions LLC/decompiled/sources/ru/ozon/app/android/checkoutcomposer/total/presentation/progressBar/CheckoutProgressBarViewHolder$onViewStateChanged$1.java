package ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar;

import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.HighloadProgressBarBinding;
import ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar.CheckoutProgressBarViewHolder$onBackPressedCallback$2;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "invoke", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CheckoutProgressBarViewHolder$onViewStateChanged$1 extends AbstractC7737t implements Function1<CreateAndPayViewState, Boolean> {
    final /* synthetic */ CheckoutProgressBarViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar.CheckoutProgressBarViewHolder$onViewStateChanged$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ CheckoutProgressBarViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CheckoutProgressBarViewHolder checkoutProgressBarViewHolder) {
            super(0);
            this.this$0 = checkoutProgressBarViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HighloadProgressBarBinding highloadProgressBarBinding;
            ViewGroup viewGroup;
            HighloadProgressBarBinding highloadProgressBarBinding2;
            ObjectAnimator animatorBlinkTitle;
            CheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 onBackPressedCallback;
            CreateAndPayViewModel createAndPayViewModel;
            highloadProgressBarBinding = this.this$0.binding;
            ConstraintLayout constraintLayout = highloadProgressBarBinding.getConstraintLayout();
            CheckoutProgressBarViewHolder checkoutProgressBarViewHolder = this.this$0;
            viewGroup = checkoutProgressBarViewHolder.decorView;
            if (viewGroup != null) {
                viewGroup.removeView(constraintLayout);
            }
            highloadProgressBarBinding2 = checkoutProgressBarViewHolder.binding;
            highloadProgressBarBinding2.animationView.cancelAnimation();
            animatorBlinkTitle = checkoutProgressBarViewHolder.getAnimatorBlinkTitle();
            animatorBlinkTitle.cancel();
            onBackPressedCallback = checkoutProgressBarViewHolder.getOnBackPressedCallback();
            onBackPressedCallback.setEnabled(false);
            createAndPayViewModel = checkoutProgressBarViewHolder.viewModel;
            createAndPayViewModel.hideProgressBar();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutProgressBarViewHolder$onViewStateChanged$1(CheckoutProgressBarViewHolder checkoutProgressBarViewHolder) {
        super(1);
        this.this$0 = checkoutProgressBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CreateAndPayViewState state) {
        HighloadProgressBarBinding highloadProgressBarBinding;
        CheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 onBackPressedCallback;
        ViewGroup viewGroup;
        HighloadProgressBarBinding highloadProgressBarBinding2;
        WindowManager.LayoutParams overlayLayoutParams;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.d(state, CreateAndPayViewState.HighLoadProgressBar.Show.INSTANCE)) {
            highloadProgressBarBinding = this.this$0.binding;
            ConstraintLayout constraintLayout = highloadProgressBarBinding.getConstraintLayout();
            CheckoutProgressBarViewHolder checkoutProgressBarViewHolder = this.this$0;
            onBackPressedCallback = checkoutProgressBarViewHolder.getOnBackPressedCallback();
            onBackPressedCallback.setEnabled(true);
            viewGroup = checkoutProgressBarViewHolder.decorView;
            if (viewGroup != null) {
                viewGroup.removeView(constraintLayout);
                overlayLayoutParams = checkoutProgressBarViewHolder.getOverlayLayoutParams();
                viewGroup.addView(constraintLayout, overlayLayoutParams);
            }
            checkoutProgressBarViewHolder.startAnimation();
            highloadProgressBarBinding2 = checkoutProgressBarViewHolder.binding;
            highloadProgressBarBinding2.animationView.playAnimation();
        } else {
            if (!Intrinsics.d(state, CreateAndPayViewState.HighLoadProgressBar.Hide.INSTANCE)) {
                return Boolean.FALSE;
            }
            CheckoutProgressBarViewHolder checkoutProgressBarViewHolder2 = this.this$0;
            checkoutProgressBarViewHolder2.stopAnimation(new AnonymousClass2(checkoutProgressBarViewHolder2));
        }
        return Boolean.TRUE;
    }
}
