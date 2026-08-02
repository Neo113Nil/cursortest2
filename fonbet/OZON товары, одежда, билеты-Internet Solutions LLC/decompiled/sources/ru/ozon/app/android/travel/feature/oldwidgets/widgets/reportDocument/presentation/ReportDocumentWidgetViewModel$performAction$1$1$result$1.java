package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsApi;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsRequest;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentsResponseVO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentsResponseVO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentWidgetViewModel$performAction$1$1$result$1", f = "ReportDocumentWidgetViewModel.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ReportDocumentWidgetViewModel$performAction$1$1$result$1 extends j implements Function2<M, d<? super ReportDocumentsResponseVO>, Object> {
    final /* synthetic */ String $link;
    int label;
    final /* synthetic */ ReportDocumentWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentWidgetViewModel$performAction$1$1$result$1(ReportDocumentWidgetViewModel reportDocumentWidgetViewModel, String str, d<? super ReportDocumentWidgetViewModel$performAction$1$1$result$1> dVar) {
        super(2, dVar);
        this.this$0 = reportDocumentWidgetViewModel;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReportDocumentWidgetViewModel$performAction$1$1$result$1(this.this$0, this.$link, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReportDocumentsApi reportDocumentsApi;
        ReportDocumentsRequest prepareValidateParams;
        ReportDocumentsResponseVO vo;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            reportDocumentsApi = this.this$0.api;
            String str = this.$link;
            prepareValidateParams = this.this$0.prepareValidateParams();
            this.label = 1;
            obj = reportDocumentsApi.performAction(str, prepareValidateParams, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        vo = this.this$0.toVO((ReportDocumentsResponse) obj);
        return vo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ReportDocumentsResponseVO> dVar) {
        return ((ReportDocumentWidgetViewModel$performAction$1$1$result$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
