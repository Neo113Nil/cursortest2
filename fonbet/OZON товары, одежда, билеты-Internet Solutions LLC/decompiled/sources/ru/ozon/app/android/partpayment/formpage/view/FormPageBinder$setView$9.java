package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class FormPageBinder$setView$9 extends C7735q implements Function1<FormPageViewModel.RetryInfo, Unit> {
    FormPageBinder$setView$9(Object obj) {
        super(1, obj, FormPageViewModel.class, "onRetryClick", "onRetryClick(Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FormPageViewModel.RetryInfo retryInfo) {
        invoke2(retryInfo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormPageViewModel.RetryInfo p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FormPageViewModel) this.receiver).onRetryClick(p02);
    }
}
