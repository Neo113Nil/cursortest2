package ru.ozon.app.android.checkoutcomposer.total.presentation.main;

import Sc.o;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "invoke", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalVH$observePaymentLoader$1 extends AbstractC7737t implements Function1<CreateAndPayViewState, Boolean> {
    final /* synthetic */ TotalVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalVH$observePaymentLoader$1(TotalVH totalVH) {
        super(1);
        this.this$0 = totalVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CreateAndPayViewState it) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CreateAndPayViewState.HighLoadProgressBar) {
            return Boolean.FALSE;
        }
        if (it instanceof CreateAndPayViewState.ShowLoading) {
            composerReferences2 = this.this$0.refs;
            composerReferences2.getController().e(new l.a.C1079a(0L, null, 3));
        } else {
            if (!(it instanceof CreateAndPayViewState.HideLoading)) {
                throw new o();
            }
            composerReferences = this.this$0.refs;
            composerReferences.getController().hideLoader();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
        return Boolean.TRUE;
    }
}
