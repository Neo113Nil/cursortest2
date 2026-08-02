package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DocsDeliveryFormViewHolder$subscribeToActions$1 extends AbstractC7737t implements Function1<DocsDeliveryFormViewModel.Action, Unit> {
    final /* synthetic */ DocsDeliveryFormViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliveryFormViewHolder$subscribeToActions$1(DocsDeliveryFormViewHolder docsDeliveryFormViewHolder) {
        super(1);
        this.this$0 = docsDeliveryFormViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DocsDeliveryFormViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DocsDeliveryFormViewModel.Action action) {
        if (!(action instanceof DocsDeliveryFormViewModel.Action.ShowMessage)) {
            throw new o();
        }
        this.this$0.showMessage((DocsDeliveryFormViewModel.Action.ShowMessage) action);
    }
}
