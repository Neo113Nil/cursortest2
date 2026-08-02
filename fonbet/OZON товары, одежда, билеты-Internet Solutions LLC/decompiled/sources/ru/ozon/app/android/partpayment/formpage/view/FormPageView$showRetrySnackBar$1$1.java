package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel;
import ru.ozon.uni.android.flashbar.main.Flashbar;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FormPageView$showRetrySnackBar$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ FormPageViewModel.RetryInfo $retryInfo;
    final /* synthetic */ FormPageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormPageView$showRetrySnackBar$1$1(FormPageView formPageView, FormPageViewModel.RetryInfo retryInfo) {
        super(0);
        this.this$0 = formPageView;
        this.$retryInfo = retryInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Flashbar flashbar;
        flashbar = this.this$0.shownRetryFlashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        Function1<FormPageViewModel.RetryInfo, Unit> onRetryClick = this.this$0.getOnRetryClick();
        if (onRetryClick != null) {
            onRetryClick.invoke(this.$retryInfo);
        }
    }
}
