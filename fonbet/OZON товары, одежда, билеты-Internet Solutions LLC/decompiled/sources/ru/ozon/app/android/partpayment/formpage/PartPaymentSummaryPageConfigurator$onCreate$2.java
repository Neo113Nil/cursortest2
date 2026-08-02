package ru.ozon.app.android.partpayment.formpage;

import Pc.a;
import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModelImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PartPaymentSummaryPageConfigurator$onCreate$2 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ PartPaymentSummaryPageConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartPaymentSummaryPageConfigurator$onCreate$2(PartPaymentSummaryPageConfigurator partPaymentSummaryPageConfigurator) {
        super(1);
        this.this$0 = partPaymentSummaryPageConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke2(l11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Long l11) {
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) {
            return;
        }
        final PartPaymentSummaryPageConfigurator partPaymentSummaryPageConfigurator = this.this$0;
        FormPageViewModelImpl formPageViewModelImpl = (FormPageViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.partpayment.formpage.PartPaymentSummaryPageConfigurator$onCreate$2$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = PartPaymentSummaryPageConfigurator.this.pViewModel;
                FormPageViewModelImpl formPageViewModelImpl2 = (FormPageViewModelImpl) aVar.get();
                Intrinsics.g(formPageViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formPageViewModelImpl2;
            }
        }).a(FormPageViewModelImpl.class);
        if (formPageViewModelImpl != null) {
            formPageViewModelImpl.onSummaryRefreshTimer();
        }
    }
}
