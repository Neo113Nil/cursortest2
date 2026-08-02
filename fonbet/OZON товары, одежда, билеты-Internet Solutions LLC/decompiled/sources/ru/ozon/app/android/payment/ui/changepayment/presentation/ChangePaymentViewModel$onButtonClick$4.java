package ru.ozon.app.android.payment.ui.changepayment.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.payment.ui.changepayment.presentation.ChangePaymentMethodAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ChangePaymentViewModel$onButtonClick$4 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ ChangePaymentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangePaymentViewModel$onButtonClick$4(ChangePaymentViewModel changePaymentViewModel) {
        super(1);
        this.this$0 = changePaymentViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        r3 = r2.this$0.getErrorMessage(r3.string());
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(Throwable th2) {
        String str;
        if (th2 instanceof HttpException) {
            Response<?> response = ((HttpException) th2).response();
            if (response == null || (r3 = response.errorBody()) == null || str == null) {
                str = this.this$0.errror;
            }
        } else {
            str = this.this$0.errror;
        }
        this.this$0.getSingleAction().postValue(new ChangePaymentMethodAction.Error(str));
    }
}
