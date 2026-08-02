package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view.perfVersion;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$2 extends AbstractC7737t implements Function1<AppCompatImageView, Unit> {
    final /* synthetic */ PaymentsDetailsPerfView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$2(PaymentsDetailsPerfView paymentsDetailsPerfView) {
        super(1);
        this.this$0 = paymentsDetailsPerfView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppCompatImageView appCompatImageView) {
        invoke(appCompatImageView);
        return Unit.f71690a;
    }

    public final void invoke(AppCompatImageView PreCreationViewPoolDelegate) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        AppCompatImageView appCompatImageView = PreCreationViewPoolDelegate;
        appCompatImageView.setId(View.generateViewId());
        i11 = this.this$0.dp32;
        i12 = this.this$0.dp32;
        appCompatImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(i11, i12));
        f7 = this.this$0.backgroundRadius;
        ViewExtensionsKt.applyRoundedOutline(appCompatImageView, f7);
        i13 = this.this$0.iconPadding;
        i14 = this.this$0.iconPadding;
        i15 = this.this$0.iconPadding;
        i16 = this.this$0.iconPadding;
        appCompatImageView.setPadding(i13, i14, i15, i16);
    }
}
