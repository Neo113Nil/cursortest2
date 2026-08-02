package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReportDocumentWidgetViewHolder$bind$1$1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
    final /* synthetic */ ReportDocumentVO $this_with;
    final /* synthetic */ ReportDocumentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentWidgetViewHolder$bind$1$1(ReportDocumentWidgetViewHolder reportDocumentWidgetViewHolder, ReportDocumentVO reportDocumentVO) {
        super(1);
        this.this$0 = reportDocumentWidgetViewHolder;
        this.$this_with = reportDocumentVO;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        ReportDocumentWidgetViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        if (viewModel != null) {
            viewModel.onTextInputChanged(this.$this_with.getEmail().getId(), String.valueOf(charSequence));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }
}
