package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "inputs", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReportDocumentWidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<List<? extends CommonInputVO>, Unit> {
    final /* synthetic */ ReportDocumentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentWidgetViewHolder$observeAction$1(ReportDocumentWidgetViewHolder reportDocumentWidgetViewHolder) {
        super(1);
        this.this$0 = reportDocumentWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CommonInputVO> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends CommonInputVO> list) {
        Intrinsics.f(list);
        ReportDocumentWidgetViewHolder reportDocumentWidgetViewHolder = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ReportDocumentWidgetViewHolder.processInputUpdate$default(reportDocumentWidgetViewHolder, (CommonInputVO) it.next(), null, 2, null);
        }
    }
}
