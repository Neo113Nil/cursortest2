package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentWidgetViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "inputUpdate", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$UpdatedInput;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$UpdatedInput;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReportDocumentWidgetViewHolder$observeAction$3 extends AbstractC7737t implements Function1<ReportDocumentWidgetViewModel.UpdatedInput, Unit> {
    final /* synthetic */ ReportDocumentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentWidgetViewHolder$observeAction$3(ReportDocumentWidgetViewHolder reportDocumentWidgetViewHolder) {
        super(1);
        this.this$0 = reportDocumentWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReportDocumentWidgetViewModel.UpdatedInput updatedInput) {
        invoke2(updatedInput);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ReportDocumentWidgetViewModel.UpdatedInput updatedInput) {
        this.this$0.processInputUpdate(updatedInput.getInput(), updatedInput.getPayload());
    }
}
