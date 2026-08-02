package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "id", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReportDocumentWidgetViewHolder$processInputUpdate$1 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ ReportDocumentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentWidgetViewHolder$processInputUpdate$1(ReportDocumentWidgetViewHolder reportDocumentWidgetViewHolder) {
        super(1);
        this.this$0 = reportDocumentWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ReportDocumentWidgetViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        if (viewModel != null) {
            viewModel.showDateFragment(j11);
        }
    }
}
