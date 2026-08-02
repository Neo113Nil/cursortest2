package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$4 extends AbstractC7737t implements Function1<DocsDeliveryResponse, Unit> {
    final /* synthetic */ DocsDeliveryFormViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$4(DocsDeliveryFormViewModelImpl docsDeliveryFormViewModelImpl) {
        super(1);
        this.this$0 = docsDeliveryFormViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DocsDeliveryResponse docsDeliveryResponse) {
        invoke2(docsDeliveryResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DocsDeliveryResponse docsDeliveryResponse) {
        if (docsDeliveryResponse.isSuccess()) {
            SingleLiveEvent<DocsDeliveryFormViewModel.Action> action = this.this$0.getAction();
            DocsDeliveryResponse.Message message = docsDeliveryResponse.getMessage();
            action.postValue(new DocsDeliveryFormViewModel.Action.ShowMessage(message != null ? message.getText() : null, true));
        } else {
            Map<String, String> errors = docsDeliveryResponse.getErrors();
            if (errors != null) {
                this.this$0.setFieldsErrors(errors);
            }
            this.this$0.getAction().setValue(new DocsDeliveryFormViewModel.Action.ShowMessage(null, false, 3, null));
        }
    }
}
