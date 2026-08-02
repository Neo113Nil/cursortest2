package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarViewHolder$onBackPressedCallback$2;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "invoke", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProgressBarViewHolder$onViewStateChanged$1 extends AbstractC7737t implements Function1<CreateAndPayViewState, Boolean> {
    final /* synthetic */ ProgressBarViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarViewHolder$onViewStateChanged$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ProgressBarViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ProgressBarViewHolder progressBarViewHolder) {
            super(0);
            this.this$0 = progressBarViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ViewGroup viewGroup;
            ProgressBarView progressBarView;
            ProgressBarView progressBarView2;
            ProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 onBackPressedCallback;
            CreateAndPayViewModel createAndPayViewModel;
            ProgressBarView progressBarView3;
            viewGroup = this.this$0.decorView;
            if (viewGroup != null) {
                progressBarView3 = this.this$0.view;
                viewGroup.removeView(progressBarView3);
            }
            progressBarView = this.this$0.view;
            progressBarView.cancelProgressBarAnimation();
            progressBarView2 = this.this$0.view;
            progressBarView2.cancelTitleAnimation();
            onBackPressedCallback = this.this$0.getOnBackPressedCallback();
            onBackPressedCallback.setEnabled(false);
            createAndPayViewModel = this.this$0.viewModel;
            createAndPayViewModel.hideProgressBar();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressBarViewHolder$onViewStateChanged$1(ProgressBarViewHolder progressBarViewHolder) {
        super(1);
        this.this$0 = progressBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CreateAndPayViewState state) {
        ProgressBarView progressBarView;
        ProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 onBackPressedCallback;
        ViewGroup viewGroup;
        ProgressBarView progressBarView2;
        ProgressBarView progressBarView3;
        ProgressBarView progressBarView4;
        ProgressBarView progressBarView5;
        WindowManager.LayoutParams overlayLayoutParams;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.d(state, CreateAndPayViewState.HighLoadProgressBar.Show.INSTANCE)) {
            onBackPressedCallback = this.this$0.getOnBackPressedCallback();
            onBackPressedCallback.setEnabled(true);
            viewGroup = this.this$0.decorView;
            if (viewGroup != null) {
                ProgressBarViewHolder progressBarViewHolder = this.this$0;
                progressBarView4 = progressBarViewHolder.view;
                viewGroup.removeView(progressBarView4);
                progressBarView5 = progressBarViewHolder.view;
                overlayLayoutParams = progressBarViewHolder.getOverlayLayoutParams();
                viewGroup.addView(progressBarView5, overlayLayoutParams);
            }
            progressBarView2 = this.this$0.view;
            progressBarView2.startAnimation();
            progressBarView3 = this.this$0.view;
            progressBarView3.playProgressBarAnimation();
        } else {
            if (!Intrinsics.d(state, CreateAndPayViewState.HighLoadProgressBar.Hide.INSTANCE)) {
                return Boolean.FALSE;
            }
            progressBarView = this.this$0.view;
            progressBarView.stopAnimation(new AnonymousClass2(this.this$0));
        }
        return Boolean.TRUE;
    }
}
