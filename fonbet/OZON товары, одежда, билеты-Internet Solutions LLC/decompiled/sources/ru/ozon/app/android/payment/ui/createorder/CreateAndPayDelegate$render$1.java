package ru.ozon.app.android.payment.ui.createorder;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "invoke", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CreateAndPayDelegate$render$1 extends AbstractC7737t implements Function1<CreateAndPayViewState, Boolean> {
    final /* synthetic */ CreateAndPayDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayDelegate$render$1(CreateAndPayDelegate createAndPayDelegate) {
        super(1);
        this.this$0 = createAndPayDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CreateAndPayViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CreateAndPayViewState.HighLoadProgressBar) {
            return Boolean.FALSE;
        }
        if (it instanceof CreateAndPayViewState.ShowLoading) {
            this.this$0.switchLoader(true, ((CreateAndPayViewState.ShowLoading) it).getType());
        } else {
            if (!(it instanceof CreateAndPayViewState.HideLoading)) {
                throw new o();
            }
            CreateAndPayDelegate.switchLoader$default(this.this$0, false, null, 2, null);
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
        return Boolean.TRUE;
    }
}
