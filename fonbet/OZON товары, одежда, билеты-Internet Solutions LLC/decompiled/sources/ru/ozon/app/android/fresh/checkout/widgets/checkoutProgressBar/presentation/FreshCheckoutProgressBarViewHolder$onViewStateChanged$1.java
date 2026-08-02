package ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation;

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
import ru.ozon.app.android.fresh.checkout.databinding.FreshHighloadProgressBarBinding;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "invoke", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshCheckoutProgressBarViewHolder$onViewStateChanged$1 extends AbstractC7737t implements Function1<CreateAndPayViewState, Boolean> {
    final /* synthetic */ FreshCheckoutProgressBarViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewHolder$onViewStateChanged$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ FreshCheckoutProgressBarViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(FreshCheckoutProgressBarViewHolder freshCheckoutProgressBarViewHolder) {
            super(0);
            this.this$0 = freshCheckoutProgressBarViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FreshHighloadProgressBarBinding freshHighloadProgressBarBinding;
            ViewGroup viewGroup;
            FreshHighloadProgressBarBinding freshHighloadProgressBarBinding2;
            ObjectAnimator animatorBlinkTitle;
            FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 onBackPressedCallback;
            CreateAndPayViewModel createAndPayViewModel;
            freshHighloadProgressBarBinding = this.this$0.binding;
            ConstraintLayout constraintLayout = freshHighloadProgressBarBinding.getConstraintLayout();
            FreshCheckoutProgressBarViewHolder freshCheckoutProgressBarViewHolder = this.this$0;
            viewGroup = freshCheckoutProgressBarViewHolder.decorView;
            if (viewGroup != null) {
                viewGroup.removeView(constraintLayout);
            }
            freshHighloadProgressBarBinding2 = freshCheckoutProgressBarViewHolder.binding;
            freshHighloadProgressBarBinding2.animationView.cancelAnimation();
            animatorBlinkTitle = freshCheckoutProgressBarViewHolder.getAnimatorBlinkTitle();
            animatorBlinkTitle.cancel();
            onBackPressedCallback = freshCheckoutProgressBarViewHolder.getOnBackPressedCallback();
            onBackPressedCallback.setEnabled(false);
            createAndPayViewModel = freshCheckoutProgressBarViewHolder.viewModel;
            createAndPayViewModel.hideProgressBar();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshCheckoutProgressBarViewHolder$onViewStateChanged$1(FreshCheckoutProgressBarViewHolder freshCheckoutProgressBarViewHolder) {
        super(1);
        this.this$0 = freshCheckoutProgressBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CreateAndPayViewState state) {
        FreshHighloadProgressBarBinding freshHighloadProgressBarBinding;
        FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 onBackPressedCallback;
        ViewGroup viewGroup;
        FreshHighloadProgressBarBinding freshHighloadProgressBarBinding2;
        WindowManager.LayoutParams overlayLayoutParams;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.d(state, CreateAndPayViewState.HighLoadProgressBar.Show.INSTANCE)) {
            freshHighloadProgressBarBinding = this.this$0.binding;
            ConstraintLayout constraintLayout = freshHighloadProgressBarBinding.getConstraintLayout();
            FreshCheckoutProgressBarViewHolder freshCheckoutProgressBarViewHolder = this.this$0;
            onBackPressedCallback = freshCheckoutProgressBarViewHolder.getOnBackPressedCallback();
            onBackPressedCallback.setEnabled(true);
            viewGroup = freshCheckoutProgressBarViewHolder.decorView;
            if (viewGroup != null) {
                viewGroup.removeView(constraintLayout);
                overlayLayoutParams = freshCheckoutProgressBarViewHolder.getOverlayLayoutParams();
                viewGroup.addView(constraintLayout, overlayLayoutParams);
            }
            freshCheckoutProgressBarViewHolder.startAnimation();
            freshHighloadProgressBarBinding2 = freshCheckoutProgressBarViewHolder.binding;
            freshHighloadProgressBarBinding2.animationView.playAnimation();
        } else {
            if (!Intrinsics.d(state, CreateAndPayViewState.HighLoadProgressBar.Hide.INSTANCE)) {
                return Boolean.FALSE;
            }
            FreshCheckoutProgressBarViewHolder freshCheckoutProgressBarViewHolder2 = this.this$0;
            freshCheckoutProgressBarViewHolder2.stopAnimation(new AnonymousClass2(freshCheckoutProgressBarViewHolder2));
        }
        return Boolean.TRUE;
    }
}
