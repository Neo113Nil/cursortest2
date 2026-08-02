package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentWidgetViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "operation", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReportDocumentWidgetViewHolder$observeAction$4 extends AbstractC7737t implements Function1<ReportDocumentWidgetViewModel.Operation, Unit> {
    final /* synthetic */ ReportDocumentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentWidgetViewHolder$observeAction$4(ReportDocumentWidgetViewHolder reportDocumentWidgetViewHolder) {
        super(1);
        this.this$0 = reportDocumentWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReportDocumentWidgetViewModel.Operation operation) {
        invoke2(operation);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ReportDocumentWidgetViewModel.Operation operation) {
        Function1 function1;
        if (operation instanceof ReportDocumentWidgetViewModel.Operation.ShowDateSelector) {
            this.this$0.showDateSelector((ReportDocumentWidgetViewModel.Operation.ShowDateSelector) operation);
            return;
        }
        if (operation instanceof ReportDocumentWidgetViewModel.Operation.ProcessAction) {
            function1 = this.this$0.actionHandler;
            function1.invoke(((ReportDocumentWidgetViewModel.Operation.ProcessAction) operation).getAction());
        } else if (operation instanceof ReportDocumentWidgetViewModel.Operation.ProcessNotification) {
            this.this$0.showNotification(((ReportDocumentWidgetViewModel.Operation.ProcessNotification) operation).getNotification());
        } else {
            if (!Intrinsics.d(operation, ReportDocumentWidgetViewModel.Operation.Error.INSTANCE)) {
                throw new o();
            }
            this.this$0.showError();
        }
    }
}
